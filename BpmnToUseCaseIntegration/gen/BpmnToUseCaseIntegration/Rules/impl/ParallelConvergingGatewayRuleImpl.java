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

import BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.csp.*;

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
import bpmn2.Process;

import bpmn2.UserTask;
import csp.constraints.*;

import de.upb.tools.sdm.*;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.csp.CSPFactoryHelper;
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
// <-- [user defined imports]
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
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __inFlow_targetRef_parallelConvGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __parallelConvGateway_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_parallelConvGateway = null;
		EMoflonEdge __outFlow_sourceRef_parallelConvGateway = null;
		EMoflonEdge __lane_flowNodeRefs_parallelConvGateway = null;
		EMoflonEdge __parallelConvGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __process_flowElements_divergeFlow = null;
		EMoflonEdge __divergeFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __parallelGateway_outgoing_divergeFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object divergeFlow is really bound
			JavaSDM.ensure(divergeFlow != null);
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
			// check object parallelConvGateway is really bound
			JavaSDM.ensure(parallelConvGateway != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and parallelConvGateway 
			JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					inFlow, parallelConvGateway, outFlow, lane, laneSet,
					parallelGateway, divergeFlow));

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

				// check object divergeFlow is really bound
				JavaSDM.ensure(divergeFlow != null);
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
				// check object parallelConvGateway is really bound
				JavaSDM.ensure(parallelConvGateway != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects inFlow and divergeFlow 
				JavaSDM.ensure(!inFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and divergeFlow 
				JavaSDM.ensure(!outFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// check isomorphic binding between objects parallelGateway and parallelConvGateway 
				JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

				// create object __inFlow_targetRef_parallelConvGateway
				__inFlow_targetRef_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parallelConvGateway_outgoing_outFlow
				__parallelConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_parallelConvGateway
				__process_flowElements_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_parallelConvGateway
				__outFlow_sourceRef_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_parallelConvGateway
				__lane_flowNodeRefs_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parallelConvGateway_incoming_inFlow
				__parallelConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_parallelConvGateway
				__process_flowElements_parallelConvGateway
						.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __inFlow_targetRef_parallelConvGateway
				__inFlow_targetRef_parallelConvGateway.setName("targetRef");
				// assign attribute __parallelConvGateway_incoming_inFlow
				__parallelConvGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_parallelConvGateway
				__outFlow_sourceRef_parallelConvGateway.setName("sourceRef");
				// assign attribute __parallelConvGateway_outgoing_outFlow
				__parallelConvGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __lane_flowNodeRefs_parallelConvGateway
				__lane_flowNodeRefs_parallelConvGateway.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_parallelConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelConvGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_parallelConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelConvGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_parallelConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_parallelConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelConvGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_parallelConvGateway.setSrc(process);

				// create link
				__inFlow_targetRef_parallelConvGateway.setSrc(inFlow);

				// create link
				__parallelConvGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__lane_flowNodeRefs_parallelConvGateway
						.setTrg(parallelConvGateway);

				// create link
				__outFlow_sourceRef_parallelConvGateway
						.setTrg(parallelConvGateway);

				// create link
				__inFlow_targetRef_parallelConvGateway
						.setTrg(parallelConvGateway);

				// create link
				__parallelConvGateway_incoming_inFlow
						.setSrc(parallelConvGateway);

				// create link
				__process_flowElements_parallelConvGateway
						.setTrg(parallelConvGateway);

				// create link
				__parallelConvGateway_outgoing_outFlow
						.setSrc(parallelConvGateway);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_parallelConvGateway.setSrc(outFlow);

				// create link
				__parallelConvGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__lane_flowNodeRefs_parallelConvGateway.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object divergeFlow is really bound
				JavaSDM.ensure(divergeFlow != null);
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
				// check object parallelConvGateway is really bound
				JavaSDM.ensure(parallelConvGateway != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects inFlow and divergeFlow 
				JavaSDM.ensure(!inFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and divergeFlow 
				JavaSDM.ensure(!outFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// check isomorphic binding between objects parallelGateway and parallelConvGateway 
				JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_divergeFlow
				__process_flowElements_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __divergeFlow_sourceRef_parallelGateway
				__divergeFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __parallelGateway_outgoing_divergeFlow
				__parallelGateway_outgoing_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_divergeFlow
				__process_flowElements_divergeFlow.setName("flowElements");
				// assign attribute __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");
				// assign attribute __divergeFlow_sourceRef_parallelGateway
				__divergeFlow_sourceRef_parallelGateway.setName("sourceRef");
				// assign attribute __parallelGateway_outgoing_divergeFlow
				__parallelGateway_outgoing_divergeFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						divergeFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_parallelGateway, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_divergeFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__divergeFlow_sourceRef_parallelGateway,
								"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelGateway_outgoing_divergeFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_divergeFlow.setSrc(process);

				// create link
				__process_flowElements_parallelGateway.setSrc(process);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				__parallelGateway_outgoing_divergeFlow.setSrc(parallelGateway);

				// create link
				__process_flowElements_parallelGateway.setTrg(parallelGateway);

				// create link
				__divergeFlow_sourceRef_parallelGateway.setTrg(parallelGateway);

				// create link
				__process_flowElements_divergeFlow.setTrg(divergeFlow);

				// create link
				__parallelGateway_outgoing_divergeFlow.setTrg(divergeFlow);

				// create link
				__divergeFlow_sourceRef_parallelGateway.setSrc(divergeFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					parallelConvGateway, outFlow, lane, laneSet,
					parallelGateway, divergeFlow);
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
		SequenceFlow divergeFlow = null;
		SequenceFlowToUCFlow divergeFlowToFlow = null;
		ParallelFlow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToStep = null;
		Flow initFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		ParallelGateway parallelConvGateway = null;
		ParallelGateway parallelGateway = null;
		ParallelStep parallelStep = null;
		FlowNodeToStep pgwToParallelStep = null;
		bpmn2.Process process = null;
		Step step = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep pcgwToParStep = null;
		SequenceFlowToStep outFlowToParallelStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge pcgwToParStep__source__parallelConvGateway = null;
		EMoflonEdge __process_flowElements_parallelConvGateway = null;
		EMoflonEdge __lane_flowNodeRefs_parallelConvGateway = null;
		EMoflonEdge __parallelConvGateway_outgoing_outFlow = null;
		EMoflonEdge outFlowToInitFlow__source__outFlow = null;
		EMoflonEdge pcgwToParStep__target__parallelStep = null;
		EMoflonEdge outFlowToParallelStep__target__parallelStep = null;
		EMoflonEdge __parallelConvGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelConvGateway = null;
		EMoflonEdge outFlowToParallelStep__source__outFlow = null;
		EMoflonEdge outFlowToInitFlow__target__initFlow = null;
		EMoflonEdge __outFlow_sourceRef_parallelConvGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("divergeFlow"));

			// ensure correct type and really bound of object divergeFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			divergeFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("divergeFlowToFlow"));

			// ensure correct type and really bound of object divergeFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			divergeFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("parallelConvGateway"));

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("pgwToParallelStep"));

			// ensure correct type and really bound of object pgwToParallelStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			pgwToParallelStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof Step);
			step = (Step) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects inFlowToFlow and divergeFlowToFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and parallelConvGateway 
			JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

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
			// create object pcgwToParStep
			pcgwToParStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToParallelStep
			outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToInitFlow
			outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create link
			pcgwToParStep.setSource(parallelConvGateway);

			// create link
			outFlowToParallelStep.setSource(outFlow);

			// create link
			outFlowToInitFlow.setSource(outFlow);

			// create link
			outFlowToInitFlow.setTarget(initFlow);

			// create link
			pcgwToParStep.setTarget(parallelStep);

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
			// check object parallelConvGateway is really bound
			JavaSDM.ensure(parallelConvGateway != null);
			// check object pcgwToParStep is really bound
			JavaSDM.ensure(pcgwToParStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelConvGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToParallelStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					pcgwToParStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object divergeFlow is really bound
			JavaSDM.ensure(divergeFlow != null);
			// check object divergeFlowToFlow is really bound
			JavaSDM.ensure(divergeFlowToFlow != null);
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
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToParallelStep is really bound
			JavaSDM.ensure(outFlowToParallelStep != null);
			// check object parallelConvGateway is really bound
			JavaSDM.ensure(parallelConvGateway != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object pcgwToParStep is really bound
			JavaSDM.ensure(pcgwToParStep != null);
			// check object pgwToParallelStep is really bound
			JavaSDM.ensure(pgwToParallelStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check isomorphic binding between objects divergeFlowToFlow and divergeFlow 
			JavaSDM.ensure(!divergeFlowToFlow.equals(divergeFlow));

			// check isomorphic binding between objects flow and divergeFlow 
			JavaSDM.ensure(!flow.equals(divergeFlow));

			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects inFlowToFlow and divergeFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(divergeFlow));

			// check isomorphic binding between objects inFlowToStep and divergeFlow 
			JavaSDM.ensure(!inFlowToStep.equals(divergeFlow));

			// check isomorphic binding between objects initFlow and divergeFlow 
			JavaSDM.ensure(!initFlow.equals(divergeFlow));

			// check isomorphic binding between objects lane and divergeFlow 
			JavaSDM.ensure(!lane.equals(divergeFlow));

			// check isomorphic binding between objects laneSet and divergeFlow 
			JavaSDM.ensure(!laneSet.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlowToParallelStep and divergeFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(divergeFlow));

			// check isomorphic binding between objects parallelConvGateway and divergeFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(divergeFlow));

			// check isomorphic binding between objects parallelGateway and divergeFlow 
			JavaSDM.ensure(!parallelGateway.equals(divergeFlow));

			// check isomorphic binding between objects parallelStep and divergeFlow 
			JavaSDM.ensure(!parallelStep.equals(divergeFlow));

			// check isomorphic binding between objects pcgwToParStep and divergeFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(divergeFlow));

			// check isomorphic binding between objects pgwToParallelStep and divergeFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(divergeFlow));

			// check isomorphic binding between objects process and divergeFlow 
			JavaSDM.ensure(!process.equals(divergeFlow));

			// check isomorphic binding between objects step and divergeFlow 
			JavaSDM.ensure(!step.equals(divergeFlow));

			// check isomorphic binding between objects flow and divergeFlowToFlow 
			JavaSDM.ensure(!flow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects inFlow and divergeFlowToFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects inFlowToFlow and divergeFlowToFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects inFlowToStep and divergeFlowToFlow 
			JavaSDM.ensure(!inFlowToStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects initFlow and divergeFlowToFlow 
			JavaSDM.ensure(!initFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects lane and divergeFlowToFlow 
			JavaSDM.ensure(!lane.equals(divergeFlowToFlow));

			// check isomorphic binding between objects laneSet and divergeFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(divergeFlowToFlow));

			// check isomorphic binding between objects outFlow and divergeFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlowToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects outFlowToParallelStep and divergeFlowToFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects parallelConvGateway and divergeFlowToFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(divergeFlowToFlow));

			// check isomorphic binding between objects parallelGateway and divergeFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(divergeFlowToFlow));

			// check isomorphic binding between objects parallelStep and divergeFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects pcgwToParStep and divergeFlowToFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects pgwToParallelStep and divergeFlowToFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects process and divergeFlowToFlow 
			JavaSDM.ensure(!process.equals(divergeFlowToFlow));

			// check isomorphic binding between objects step and divergeFlowToFlow 
			JavaSDM.ensure(!step.equals(divergeFlowToFlow));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToStep and flow 
			JavaSDM.ensure(!inFlowToStep.equals(flow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToInitFlow and flow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(flow));

			// check isomorphic binding between objects outFlowToParallelStep and flow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelConvGateway and flow 
			JavaSDM.ensure(!parallelConvGateway.equals(flow));

			// check isomorphic binding between objects parallelGateway and flow 
			JavaSDM.ensure(!parallelGateway.equals(flow));

			// check isomorphic binding between objects parallelStep and flow 
			JavaSDM.ensure(!parallelStep.equals(flow));

			// check isomorphic binding between objects pcgwToParStep and flow 
			JavaSDM.ensure(!pcgwToParStep.equals(flow));

			// check isomorphic binding between objects pgwToParallelStep and flow 
			JavaSDM.ensure(!pgwToParallelStep.equals(flow));

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

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToParallelStep and inFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelConvGateway and inFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlow));

			// check isomorphic binding between objects parallelStep and inFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlow));

			// check isomorphic binding between objects pcgwToParStep and inFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(inFlow));

			// check isomorphic binding between objects pgwToParallelStep and inFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects step and inFlow 
			JavaSDM.ensure(!step.equals(inFlow));

			// check isomorphic binding between objects inFlowToStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToStep.equals(inFlowToFlow));

			// check isomorphic binding between objects initFlow and inFlowToFlow 
			JavaSDM.ensure(!initFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects lane and inFlowToFlow 
			JavaSDM.ensure(!lane.equals(inFlowToFlow));

			// check isomorphic binding between objects laneSet and inFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelConvGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects pcgwToParStep and inFlowToFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(inFlowToFlow));

			// check isomorphic binding between objects pgwToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects step and inFlowToFlow 
			JavaSDM.ensure(!step.equals(inFlowToFlow));

			// check isomorphic binding between objects initFlow and inFlowToStep 
			JavaSDM.ensure(!initFlow.equals(inFlowToStep));

			// check isomorphic binding between objects lane and inFlowToStep 
			JavaSDM.ensure(!lane.equals(inFlowToStep));

			// check isomorphic binding between objects laneSet and inFlowToStep 
			JavaSDM.ensure(!laneSet.equals(inFlowToStep));

			// check isomorphic binding between objects outFlow and inFlowToStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToParallelStep and inFlowToStep 
			JavaSDM.ensure(!outFlowToParallelStep.equals(inFlowToStep));

			// check isomorphic binding between objects parallelConvGateway and inFlowToStep 
			JavaSDM.ensure(!parallelConvGateway.equals(inFlowToStep));

			// check isomorphic binding between objects parallelGateway and inFlowToStep 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToStep));

			// check isomorphic binding between objects parallelStep and inFlowToStep 
			JavaSDM.ensure(!parallelStep.equals(inFlowToStep));

			// check isomorphic binding between objects pcgwToParStep and inFlowToStep 
			JavaSDM.ensure(!pcgwToParStep.equals(inFlowToStep));

			// check isomorphic binding between objects pgwToParallelStep and inFlowToStep 
			JavaSDM.ensure(!pgwToParallelStep.equals(inFlowToStep));

			// check isomorphic binding between objects process and inFlowToStep 
			JavaSDM.ensure(!process.equals(inFlowToStep));

			// check isomorphic binding between objects step and inFlowToStep 
			JavaSDM.ensure(!step.equals(inFlowToStep));

			// check isomorphic binding between objects lane and initFlow 
			JavaSDM.ensure(!lane.equals(initFlow));

			// check isomorphic binding between objects laneSet and initFlow 
			JavaSDM.ensure(!laneSet.equals(initFlow));

			// check isomorphic binding between objects outFlow and initFlow 
			JavaSDM.ensure(!outFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToInitFlow and initFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToParallelStep and initFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(initFlow));

			// check isomorphic binding between objects parallelConvGateway and initFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(initFlow));

			// check isomorphic binding between objects parallelGateway and initFlow 
			JavaSDM.ensure(!parallelGateway.equals(initFlow));

			// check isomorphic binding between objects parallelStep and initFlow 
			JavaSDM.ensure(!parallelStep.equals(initFlow));

			// check isomorphic binding between objects pcgwToParStep and initFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(initFlow));

			// check isomorphic binding between objects pgwToParallelStep and initFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(initFlow));

			// check isomorphic binding between objects process and initFlow 
			JavaSDM.ensure(!process.equals(initFlow));

			// check isomorphic binding between objects step and initFlow 
			JavaSDM.ensure(!step.equals(initFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToInitFlow and lane 
			JavaSDM.ensure(!outFlowToInitFlow.equals(lane));

			// check isomorphic binding between objects outFlowToParallelStep and lane 
			JavaSDM.ensure(!outFlowToParallelStep.equals(lane));

			// check isomorphic binding between objects parallelConvGateway and lane 
			JavaSDM.ensure(!parallelConvGateway.equals(lane));

			// check isomorphic binding between objects parallelGateway and lane 
			JavaSDM.ensure(!parallelGateway.equals(lane));

			// check isomorphic binding between objects parallelStep and lane 
			JavaSDM.ensure(!parallelStep.equals(lane));

			// check isomorphic binding between objects pcgwToParStep and lane 
			JavaSDM.ensure(!pcgwToParStep.equals(lane));

			// check isomorphic binding between objects pgwToParallelStep and lane 
			JavaSDM.ensure(!pgwToParallelStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects step and lane 
			JavaSDM.ensure(!step.equals(lane));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToInitFlow and laneSet 
			JavaSDM.ensure(!outFlowToInitFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToParallelStep and laneSet 
			JavaSDM.ensure(!outFlowToParallelStep.equals(laneSet));

			// check isomorphic binding between objects parallelConvGateway and laneSet 
			JavaSDM.ensure(!parallelConvGateway.equals(laneSet));

			// check isomorphic binding between objects parallelGateway and laneSet 
			JavaSDM.ensure(!parallelGateway.equals(laneSet));

			// check isomorphic binding between objects parallelStep and laneSet 
			JavaSDM.ensure(!parallelStep.equals(laneSet));

			// check isomorphic binding between objects pcgwToParStep and laneSet 
			JavaSDM.ensure(!pcgwToParStep.equals(laneSet));

			// check isomorphic binding between objects pgwToParallelStep and laneSet 
			JavaSDM.ensure(!pgwToParallelStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects step and laneSet 
			JavaSDM.ensure(!step.equals(laneSet));

			// check isomorphic binding between objects outFlowToInitFlow and outFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToParallelStep and outFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(outFlow));

			// check isomorphic binding between objects parallelConvGateway and outFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(outFlow));

			// check isomorphic binding between objects parallelGateway and outFlow 
			JavaSDM.ensure(!parallelGateway.equals(outFlow));

			// check isomorphic binding between objects parallelStep and outFlow 
			JavaSDM.ensure(!parallelStep.equals(outFlow));

			// check isomorphic binding between objects pcgwToParStep and outFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(outFlow));

			// check isomorphic binding between objects pgwToParallelStep and outFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects step and outFlow 
			JavaSDM.ensure(!step.equals(outFlow));

			// check isomorphic binding between objects outFlowToParallelStep and outFlowToInitFlow 
			JavaSDM.ensure(!outFlowToParallelStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelConvGateway and outFlowToInitFlow 
			JavaSDM.ensure(!parallelConvGateway.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelGateway and outFlowToInitFlow 
			JavaSDM.ensure(!parallelGateway.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelStep and outFlowToInitFlow 
			JavaSDM.ensure(!parallelStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects pcgwToParStep and outFlowToInitFlow 
			JavaSDM.ensure(!pcgwToParStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects pgwToParallelStep and outFlowToInitFlow 
			JavaSDM.ensure(!pgwToParallelStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToInitFlow 
			JavaSDM.ensure(!process.equals(outFlowToInitFlow));

			// check isomorphic binding between objects step and outFlowToInitFlow 
			JavaSDM.ensure(!step.equals(outFlowToInitFlow));

			// check isomorphic binding between objects parallelConvGateway and outFlowToParallelStep 
			JavaSDM.ensure(!parallelConvGateway.equals(outFlowToParallelStep));

			// check isomorphic binding between objects parallelGateway and outFlowToParallelStep 
			JavaSDM.ensure(!parallelGateway.equals(outFlowToParallelStep));

			// check isomorphic binding between objects parallelStep and outFlowToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(outFlowToParallelStep));

			// check isomorphic binding between objects pcgwToParStep and outFlowToParallelStep 
			JavaSDM.ensure(!pcgwToParStep.equals(outFlowToParallelStep));

			// check isomorphic binding between objects pgwToParallelStep and outFlowToParallelStep 
			JavaSDM.ensure(!pgwToParallelStep.equals(outFlowToParallelStep));

			// check isomorphic binding between objects process and outFlowToParallelStep 
			JavaSDM.ensure(!process.equals(outFlowToParallelStep));

			// check isomorphic binding between objects step and outFlowToParallelStep 
			JavaSDM.ensure(!step.equals(outFlowToParallelStep));

			// check isomorphic binding between objects parallelGateway and parallelConvGateway 
			JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

			// check isomorphic binding between objects parallelStep and parallelConvGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelConvGateway));

			// check isomorphic binding between objects pcgwToParStep and parallelConvGateway 
			JavaSDM.ensure(!pcgwToParStep.equals(parallelConvGateway));

			// check isomorphic binding between objects pgwToParallelStep and parallelConvGateway 
			JavaSDM.ensure(!pgwToParallelStep.equals(parallelConvGateway));

			// check isomorphic binding between objects process and parallelConvGateway 
			JavaSDM.ensure(!process.equals(parallelConvGateway));

			// check isomorphic binding between objects step and parallelConvGateway 
			JavaSDM.ensure(!step.equals(parallelConvGateway));

			// check isomorphic binding between objects parallelStep and parallelGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelGateway));

			// check isomorphic binding between objects pcgwToParStep and parallelGateway 
			JavaSDM.ensure(!pcgwToParStep.equals(parallelGateway));

			// check isomorphic binding between objects pgwToParallelStep and parallelGateway 
			JavaSDM.ensure(!pgwToParallelStep.equals(parallelGateway));

			// check isomorphic binding between objects process and parallelGateway 
			JavaSDM.ensure(!process.equals(parallelGateway));

			// check isomorphic binding between objects step and parallelGateway 
			JavaSDM.ensure(!step.equals(parallelGateway));

			// check isomorphic binding between objects pcgwToParStep and parallelStep 
			JavaSDM.ensure(!pcgwToParStep.equals(parallelStep));

			// check isomorphic binding between objects pgwToParallelStep and parallelStep 
			JavaSDM.ensure(!pgwToParallelStep.equals(parallelStep));

			// check isomorphic binding between objects process and parallelStep 
			JavaSDM.ensure(!process.equals(parallelStep));

			// check isomorphic binding between objects step and parallelStep 
			JavaSDM.ensure(!step.equals(parallelStep));

			// check isomorphic binding between objects pgwToParallelStep and pcgwToParStep 
			JavaSDM.ensure(!pgwToParallelStep.equals(pcgwToParStep));

			// check isomorphic binding between objects process and pcgwToParStep 
			JavaSDM.ensure(!process.equals(pcgwToParStep));

			// check isomorphic binding between objects step and pcgwToParStep 
			JavaSDM.ensure(!step.equals(pcgwToParStep));

			// check isomorphic binding between objects process and pgwToParallelStep 
			JavaSDM.ensure(!process.equals(pgwToParallelStep));

			// check isomorphic binding between objects step and pgwToParallelStep 
			JavaSDM.ensure(!step.equals(pgwToParallelStep));

			// check isomorphic binding between objects step and process 
			JavaSDM.ensure(!step.equals(process));

			// create object pcgwToParStep__source__parallelConvGateway
			pcgwToParStep__source__parallelConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_parallelConvGateway
			__process_flowElements_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_parallelConvGateway
			__lane_flowNodeRefs_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parallelConvGateway_outgoing_outFlow
			__parallelConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object pcgwToParStep__target__parallelStep
			pcgwToParStep__target__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToParallelStep__target__parallelStep
			outFlowToParallelStep__target__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parallelConvGateway_incoming_inFlow
			__parallelConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_parallelConvGateway
			__inFlow_targetRef_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToParallelStep__source__outFlow
			outFlowToParallelStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_parallelConvGateway
			__outFlow_sourceRef_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ParallelConvergingGatewayRule");
			// assign attribute __process_flowElements_parallelConvGateway
			__process_flowElements_parallelConvGateway.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __inFlow_targetRef_parallelConvGateway
			__inFlow_targetRef_parallelConvGateway.setName("targetRef");
			// assign attribute __parallelConvGateway_incoming_inFlow
			__parallelConvGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_parallelConvGateway
			__outFlow_sourceRef_parallelConvGateway.setName("sourceRef");
			// assign attribute __parallelConvGateway_outgoing_outFlow
			__parallelConvGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute pcgwToParStep__source__parallelConvGateway
			pcgwToParStep__source__parallelConvGateway.setName("source");
			// assign attribute pcgwToParStep__target__parallelStep
			pcgwToParStep__target__parallelStep.setName("target");
			// assign attribute outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow.setName("source");
			// assign attribute outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow.setName("target");
			// assign attribute outFlowToParallelStep__source__outFlow
			outFlowToParallelStep__source__outFlow.setName("source");
			// assign attribute outFlowToParallelStep__target__parallelStep
			outFlowToParallelStep__target__parallelStep.setName("target");
			// assign attribute __lane_flowNodeRefs_parallelConvGateway
			__lane_flowNodeRefs_parallelConvGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					pcgwToParStep__source__parallelConvGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_parallelConvGateway,
					"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_parallelConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parallelConvGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					pcgwToParStep__target__parallelStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							outFlowToParallelStep__target__parallelStep,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parallelConvGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_parallelConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToParallelStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__target__initFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_parallelConvGateway, "translatedEdges");

			// create link
			__process_flowElements_parallelConvGateway.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__parallelConvGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_parallelConvGateway.setSrc(inFlow);

			// create link
			__parallelConvGateway_incoming_inFlow.setSrc(parallelConvGateway);

			// create link
			__process_flowElements_parallelConvGateway
					.setTrg(parallelConvGateway);

			// create link
			pcgwToParStep__source__parallelConvGateway
					.setTrg(parallelConvGateway);

			// create link
			__lane_flowNodeRefs_parallelConvGateway.setTrg(parallelConvGateway);

			// create link
			__inFlow_targetRef_parallelConvGateway.setTrg(parallelConvGateway);

			// create link
			__parallelConvGateway_outgoing_outFlow.setSrc(parallelConvGateway);

			// create link
			__outFlow_sourceRef_parallelConvGateway.setTrg(parallelConvGateway);

			// create link
			__outFlow_sourceRef_parallelConvGateway.setSrc(outFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToParallelStep__source__outFlow.setTrg(outFlow);

			// create link
			__parallelConvGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			outFlowToInitFlow__target__initFlow.setTrg(initFlow);

			// create link
			outFlowToParallelStep__target__parallelStep.setTrg(parallelStep);

			// create link
			pcgwToParStep__target__parallelStep.setTrg(parallelStep);

			// create link
			pcgwToParStep__source__parallelConvGateway.setSrc(pcgwToParStep);

			// create link
			pcgwToParStep__target__parallelStep.setSrc(pcgwToParStep);

			// create link
			outFlowToInitFlow__source__outFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToInitFlow__target__initFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToParallelStep__target__parallelStep
					.setSrc(outFlowToParallelStep);

			// create link
			outFlowToParallelStep__source__outFlow
					.setSrc(outFlowToParallelStep);

			// create link
			__lane_flowNodeRefs_parallelConvGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow,
				parallelConvGateway, outFlow, flow, inFlowToFlow, step,
				inFlowToStep, initFlow, parallelStep, pcgwToParStep,
				outFlowToInitFlow, outFlowToParallelStep, lane, laneSet,
				parallelGateway, pgwToParallelStep, divergeFlow,
				divergeFlowToFlow);
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
		SequenceFlow divergeFlow = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		ParallelGateway parallelConvGateway = null;
		ParallelGateway parallelGateway = null;
		bpmn2.Process process = null;
		Step nextStep = null;
		EMoflonEdge __process_flowElements_divergeFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_parallelConvGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __inFlowToStep_source_inFlow = null;
		EMoflonEdge __parallelConvGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelConvGateway = null;
		EMoflonEdge __parallelConvGateway_outgoing_outFlow = null;
		EMoflonEdge __lane_flowNodeRefs_parallelConvGateway = null;
		EMoflonEdge __outFlow_sourceRef_parallelConvGateway = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __divergeFlowToFlow_target_flow = null;
		EMoflonEdge __parallelStep_invokedFlows_flow = null;
		EMoflonEdge __inFlowToStep_target_step = null;
		EMoflonEdge __initFlow_steps_parallelStep = null;
		EMoflonEdge __pgwToParallelStep_target_parallelStep = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __divergeFlow_sourceRef_parallelGateway = null;
		EMoflonEdge __pgwToParallelStep_source_parallelGateway = null;
		EMoflonEdge __parallelGateway_outgoing_divergeFlow = null;
		EMoflonEdge __divergeFlowToFlow_source_divergeFlow = null;
		CSP csp = null;
		Flow initFlow = null;
		ParallelStep parallelStep = null;
		Iterator fujaba__IterParallelGatewayToPgwToParallelStep = null;
		FlowNodeToStep pgwToParallelStep = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		ParallelFlow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterDivergeFlowToDivergeFlowToFlow = null;
		SequenceFlowToUCFlow divergeFlowToFlow = null;

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

			_TmpObject = (match.getObject("divergeFlow"));

			// ensure correct type and really bound of object divergeFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			divergeFlow = (SequenceFlow) _TmpObject;
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
			_TmpObject = (match.getObject("parallelConvGateway"));

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (match.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and parallelConvGateway 
			JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

			// iterate to-many link source from divergeFlow to divergeFlowToFlow
			fujaba__Success = false;

			fujaba__IterDivergeFlowToDivergeFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							divergeFlow, SequenceFlowToUCFlow.class, "source"))
					.iterator();

			while (fujaba__IterDivergeFlowToDivergeFlowToFlow.hasNext()) {
				try {
					divergeFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterDivergeFlowToDivergeFlowToFlow
							.next();

					// check object divergeFlowToFlow is really bound
					JavaSDM.ensure(divergeFlowToFlow != null);
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
							// check isomorphic binding between objects inFlowToFlow and divergeFlowToFlow 
							JavaSDM.ensure(!inFlowToFlow
									.equals(divergeFlowToFlow));

							// bind object
							_TmpObject = inFlowToFlow.getTarget();

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
							flow = (ParallelFlow) _TmpObject;

							// check link target from divergeFlowToFlow to flow
							JavaSDM.ensure(flow.equals(divergeFlowToFlow
									.getTarget()));

							// iterate to-many link source from inFlow to inFlowToStep
							fujaba__Success = false;

							fujaba__IterInFlowToInFlowToStep = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(inFlow,
													SequenceFlowToStep.class,
													"source")).iterator();

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

									// iterate to-many link source from parallelGateway to pgwToParallelStep
									fujaba__Success = false;

									fujaba__IterParallelGatewayToPgwToParallelStep = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															parallelGateway,
															FlowNodeToStep.class,
															"source"))
											.iterator();

									while (fujaba__IterParallelGatewayToPgwToParallelStep
											.hasNext()) {
										try {
											pgwToParallelStep = (FlowNodeToStep) fujaba__IterParallelGatewayToPgwToParallelStep
													.next();

											// check object pgwToParallelStep is really bound
											JavaSDM.ensure(pgwToParallelStep != null);
											// bind object
											_TmpObject = pgwToParallelStep
													.getTarget();

											// ensure correct type and really bound of object parallelStep
											JavaSDM.ensure(_TmpObject instanceof ParallelStep);
											parallelStep = (ParallelStep) _TmpObject;

											// check isomorphic binding between objects step and parallelStep 
											JavaSDM.ensure(!step
													.equals(parallelStep));

											// story node 'find context'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													nextStep = step.getNext();

													// check object nextStep is really bound
													JavaSDM.ensure(nextStep != null);

													// check isomorphic binding between objects nextStep and parallelStep 
													JavaSDM.ensure(!nextStep
															.equals(parallelStep));

													// check isomorphic binding between objects nextStep and step 
													JavaSDM.ensure(!nextStep
															.equals(step));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// check object divergeFlow is really bound
												JavaSDM.ensure(divergeFlow != null);
												// check object divergeFlowToFlow is really bound
												JavaSDM.ensure(divergeFlowToFlow != null);
												// check object flow is really bound
												JavaSDM.ensure(flow != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object inFlowToFlow is really bound
												JavaSDM.ensure(inFlowToFlow != null);
												// check object inFlowToStep is really bound
												JavaSDM.ensure(inFlowToStep != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object parallelConvGateway is really bound
												JavaSDM.ensure(parallelConvGateway != null);
												// check object parallelGateway is really bound
												JavaSDM.ensure(parallelGateway != null);
												// check object parallelStep is really bound
												JavaSDM.ensure(parallelStep != null);
												// check object pgwToParallelStep is really bound
												JavaSDM.ensure(pgwToParallelStep != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check object step is really bound
												JavaSDM.ensure(step != null);
												// check isomorphic binding between objects inFlow and divergeFlow 
												JavaSDM.ensure(!inFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and divergeFlow 
												JavaSDM.ensure(!outFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects inFlowToFlow and divergeFlowToFlow 
												JavaSDM.ensure(!inFlowToFlow
														.equals(divergeFlowToFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check isomorphic binding between objects parallelGateway and parallelConvGateway 
												JavaSDM.ensure(!parallelGateway
														.equals(parallelConvGateway));

												// check isomorphic binding between objects step and parallelStep 
												JavaSDM.ensure(!step
														.equals(parallelStep));

												// check link flowElements from divergeFlow to process
												JavaSDM.ensure(process
														.equals(divergeFlow
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link flowElements from parallelConvGateway to process
												JavaSDM.ensure(process
														.equals(parallelConvGateway
																.eContainer()));

												// check link flowElements from parallelGateway to process
												JavaSDM.ensure(process
														.equals(parallelGateway
																.eContainer()));

												// check link incoming from inFlow to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway.equals(inFlow
														.getTargetRef()));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link outgoing from outFlow to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway.equals(outFlow
														.getSourceRef()));

												// check link outgoing from divergeFlow to parallelGateway
												JavaSDM.ensure(parallelGateway.equals(divergeFlow
														.getSourceRef()));

												// check link source from divergeFlowToFlow to divergeFlow
												JavaSDM.ensure(divergeFlow
														.equals(divergeFlowToFlow
																.getSource()));

												// check link source from inFlowToFlow to inFlow
												JavaSDM.ensure(inFlow
														.equals(inFlowToFlow
																.getSource()));

												// check link source from inFlowToStep to inFlow
												JavaSDM.ensure(inFlow
														.equals(inFlowToStep
																.getSource()));

												// check link source from pgwToParallelStep to parallelGateway
												JavaSDM.ensure(parallelGateway
														.equals(pgwToParallelStep
																.getSource()));

												// check link steps from step to flow
												JavaSDM.ensure(flow.equals(step
														.eContainer()));

												// bind object
												initFlow = parallelStep
														.eContainer() instanceof Flow ? (Flow) parallelStep
														.eContainer() : null;

												// check object initFlow is really bound
												JavaSDM.ensure(initFlow != null);

												// check if contained via correct reference
												JavaSDM.ensure(initFlow
														.getSteps().contains(
																parallelStep));

												// check isomorphic binding between objects initFlow and flow 
												JavaSDM.ensure(!initFlow
														.equals(flow));

												// check link target from divergeFlowToFlow to flow
												JavaSDM.ensure(flow
														.equals(divergeFlowToFlow
																.getTarget()));

												// check link target from inFlowToFlow to flow
												JavaSDM.ensure(flow
														.equals(inFlowToFlow
																.getTarget()));

												// check link target from inFlowToStep to step
												JavaSDM.ensure(step
														.equals(inFlowToStep
																.getTarget()));

												// check link target from pgwToParallelStep to parallelStep
												JavaSDM.ensure(parallelStep
														.equals(pgwToParallelStep
																.getTarget()));

												// check link flowNodeRefs from lane to parallelConvGateway
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																parallelConvGateway));

												// check link invokedFlows from parallelStep to flow
												JavaSDM.ensure(parallelStep
														.getInvokedFlows()
														.contains(flow));

												// create object __process_flowElements_divergeFlow
												__process_flowElements_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object isApplicableMatch
												isApplicableMatch = TGGRuntimeFactory.eINSTANCE
														.createIsApplicableMatch();

												// create object __process_laneSets_laneSet
												__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_parallelConvGateway
												__process_flowElements_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_inFlow
												__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_parallelGateway
												__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __process_flowElements_outFlow
												__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToStep_source_inFlow
												__inFlowToStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __parallelConvGateway_incoming_inFlow
												__parallelConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_source_inFlow
												__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlow_targetRef_parallelConvGateway
												__inFlow_targetRef_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __parallelConvGateway_outgoing_outFlow
												__parallelConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __lane_flowNodeRefs_parallelConvGateway
												__lane_flowNodeRefs_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __outFlow_sourceRef_parallelConvGateway
												__outFlow_sourceRef_parallelConvGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __flow_steps_step
												__flow_steps_step = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToFlow_target_flow
												__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlowToFlow_target_flow
												__divergeFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __parallelStep_invokedFlows_flow
												__parallelStep_invokedFlows_flow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __inFlowToStep_target_step
												__inFlowToStep_target_step = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __initFlow_steps_parallelStep
												__initFlow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __pgwToParallelStep_target_parallelStep
												__pgwToParallelStep_target_parallelStep = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __laneSet_lanes_lane
												__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlow_sourceRef_parallelGateway
												__divergeFlow_sourceRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __pgwToParallelStep_source_parallelGateway
												__pgwToParallelStep_source_parallelGateway = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __parallelGateway_outgoing_divergeFlow
												__parallelGateway_outgoing_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// create object __divergeFlowToFlow_source_divergeFlow
												__divergeFlowToFlow_source_divergeFlow = TGGRuntimeFactory.eINSTANCE
														.createEMoflonEdge();

												// assign attribute __process_flowElements_inFlow
												__process_flowElements_inFlow
														.setName("flowElements");
												// assign attribute __process_laneSets_laneSet
												__process_laneSets_laneSet
														.setName("laneSets");
												// assign attribute __process_flowElements_parallelConvGateway
												__process_flowElements_parallelConvGateway
														.setName("flowElements");
												// assign attribute __process_flowElements_outFlow
												__process_flowElements_outFlow
														.setName("flowElements");
												// assign attribute __process_flowElements_divergeFlow
												__process_flowElements_divergeFlow
														.setName("flowElements");
												// assign attribute __process_flowElements_parallelGateway
												__process_flowElements_parallelGateway
														.setName("flowElements");
												// assign attribute __inFlow_targetRef_parallelConvGateway
												__inFlow_targetRef_parallelConvGateway
														.setName("targetRef");
												// assign attribute __parallelConvGateway_incoming_inFlow
												__parallelConvGateway_incoming_inFlow
														.setName("incoming");
												// assign attribute __outFlow_sourceRef_parallelConvGateway
												__outFlow_sourceRef_parallelConvGateway
														.setName("sourceRef");
												// assign attribute __parallelConvGateway_outgoing_outFlow
												__parallelConvGateway_outgoing_outFlow
														.setName("outgoing");
												// assign attribute __flow_steps_step
												__flow_steps_step
														.setName("steps");
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
												// assign attribute __lane_flowNodeRefs_parallelConvGateway
												__lane_flowNodeRefs_parallelConvGateway
														.setName("flowNodeRefs");
												// assign attribute __laneSet_lanes_lane
												__laneSet_lanes_lane
														.setName("lanes");
												// assign attribute __divergeFlow_sourceRef_parallelGateway
												__divergeFlow_sourceRef_parallelGateway
														.setName("sourceRef");
												// assign attribute __parallelGateway_outgoing_divergeFlow
												__parallelGateway_outgoing_divergeFlow
														.setName("outgoing");
												// assign attribute __pgwToParallelStep_target_parallelStep
												__pgwToParallelStep_target_parallelStep
														.setName("target");
												// assign attribute __pgwToParallelStep_source_parallelGateway
												__pgwToParallelStep_source_parallelGateway
														.setName("source");
												// assign attribute __divergeFlowToFlow_source_divergeFlow
												__divergeFlowToFlow_source_divergeFlow
														.setName("source");
												// assign attribute __divergeFlowToFlow_target_flow
												__divergeFlowToFlow_target_flow
														.setName("target");

												// create link
												__process_flowElements_divergeFlow
														.setSrc(process);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(process);

												// create link
												__process_laneSets_laneSet
														.setSrc(process);

												// create link
												__process_flowElements_parallelConvGateway
														.setSrc(process);

												// create link
												__process_flowElements_inFlow
														.setSrc(process);

												// create link
												__process_flowElements_parallelGateway
														.setSrc(process);

												// create link
												__process_flowElements_outFlow
														.setSrc(process);

												// create link
												__inFlowToStep_source_inFlow
														.setTrg(inFlow);

												// create link
												__process_flowElements_inFlow
														.setTrg(inFlow);

												// create link
												__parallelConvGateway_incoming_inFlow
														.setTrg(inFlow);

												// create link
												__inFlowToFlow_source_inFlow
														.setTrg(inFlow);

												// create link
												__inFlow_targetRef_parallelConvGateway
														.setSrc(inFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlow);

												// create link
												__process_flowElements_parallelConvGateway
														.setTrg(parallelConvGateway);

												// create link
												__inFlow_targetRef_parallelConvGateway
														.setTrg(parallelConvGateway);

												// create link
												__parallelConvGateway_outgoing_outFlow
														.setSrc(parallelConvGateway);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(parallelConvGateway);

												// create link
												__lane_flowNodeRefs_parallelConvGateway
														.setTrg(parallelConvGateway);

												// create link
												__outFlow_sourceRef_parallelConvGateway
														.setTrg(parallelConvGateway);

												// create link
												__parallelConvGateway_incoming_inFlow
														.setSrc(parallelConvGateway);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(outFlow);

												// create link
												__parallelConvGateway_outgoing_outFlow
														.setTrg(outFlow);

												// create link
												__process_flowElements_outFlow
														.setTrg(outFlow);

												// create link
												__outFlow_sourceRef_parallelConvGateway
														.setSrc(outFlow);

												// create link
												__flow_steps_step.setSrc(flow);

												// create link
												__inFlowToFlow_target_flow
														.setTrg(flow);

												// create link
												__divergeFlowToFlow_target_flow
														.setTrg(flow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(flow);

												// create link
												__parallelStep_invokedFlows_flow
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
												__inFlowToStep_target_step
														.setTrg(step);

												// create link
												__flow_steps_step.setTrg(step);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(step);

												// create link
												__inFlowToStep_source_inFlow
														.setSrc(inFlowToStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(inFlowToStep);

												// create link
												__inFlowToStep_target_step
														.setSrc(inFlowToStep);

												// create link
												__initFlow_steps_parallelStep
														.setSrc(initFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(initFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(parallelStep);

												// create link
												__pgwToParallelStep_target_parallelStep
														.setTrg(parallelStep);

												// create link
												__parallelStep_invokedFlows_flow
														.setSrc(parallelStep);

												// create link
												__initFlow_steps_parallelStep
														.setTrg(parallelStep);

												// create link
												__laneSet_lanes_lane
														.setTrg(lane);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(lane);

												// create link
												__lane_flowNodeRefs_parallelConvGateway
														.setSrc(lane);

												// create link
												__process_laneSets_laneSet
														.setTrg(laneSet);

												// create link
												__laneSet_lanes_lane
														.setSrc(laneSet);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(laneSet);

												// create link
												__process_flowElements_parallelGateway
														.setTrg(parallelGateway);

												// create link
												__divergeFlow_sourceRef_parallelGateway
														.setTrg(parallelGateway);

												// create link
												__pgwToParallelStep_source_parallelGateway
														.setTrg(parallelGateway);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(parallelGateway);

												// create link
												__parallelGateway_outgoing_divergeFlow
														.setSrc(parallelGateway);

												// create link
												__pgwToParallelStep_source_parallelGateway
														.setSrc(pgwToParallelStep);

												// create link
												__pgwToParallelStep_target_parallelStep
														.setSrc(pgwToParallelStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(pgwToParallelStep);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(divergeFlow);

												// create link
												__parallelGateway_outgoing_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__divergeFlowToFlow_source_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__process_flowElements_divergeFlow
														.setTrg(divergeFlow);

												// create link
												__divergeFlow_sourceRef_parallelGateway
														.setSrc(divergeFlow);

												// create link
												__divergeFlowToFlow_target_flow
														.setSrc(divergeFlowToFlow);

												// create link
												__divergeFlowToFlow_source_divergeFlow
														.setSrc(divergeFlowToFlow);

												// create link
												isApplicableMatch
														.getAllContextElements()
														.add(divergeFlowToFlow);

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__inFlowToStep_target_step,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__outFlow_sourceRef_parallelConvGateway,
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
																__parallelGateway_outgoing_divergeFlow,
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
																__divergeFlowToFlow_source_divergeFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__process_flowElements_parallelConvGateway,
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
																__process_flowElements_divergeFlow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__pgwToParallelStep_target_parallelStep,
																"allContextElements");

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
																__initFlow_steps_parallelStep,
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
																__parallelConvGateway_outgoing_outFlow,
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
																__process_flowElements_parallelGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__pgwToParallelStep_source_parallelGateway,
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
																__divergeFlow_sourceRef_parallelGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__inFlow_targetRef_parallelConvGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__divergeFlowToFlow_target_flow,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__lane_flowNodeRefs_parallelConvGateway,
																"allContextElements");

												// create link
												org.moflon.util.eMoflonEMFUtil
														.addOppositeReference(
																isApplicableMatch,
																__parallelConvGateway_incoming_inFlow,
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
																__inFlowToStep_source_inFlow,
																"allContextElements");
												// story node 'solve CSP'
												try {
													fujaba__Success = false;

													_TmpObject = (this
															.isApplicable_solveCsp_FWD(
																	isApplicableMatch,
																	process,
																	inFlow,
																	parallelConvGateway,
																	outFlow,
																	flow,
																	inFlowToFlow,
																	step,
																	inFlowToStep,
																	initFlow,
																	parallelStep,
																	lane,
																	laneSet,
																	parallelGateway,
																	pgwToParallelStep,
																	divergeFlow,
																	divergeFlowToFlow));

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
														ruleresult
																.setSuccess(true);
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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("parallelConvGateway", parallelConvGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);
		match.registerObject("parallelGateway", parallelGateway);
		match.registerObject("divergeFlow", divergeFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, SequenceFlow divergeFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");
		literal1.setType("String");

		// Create attribute variables
		Variable var_parallelConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelConvGateway.gatewayDirection", true,
						csp);
		var_parallelConvGateway_gatewayDirection.setValue(parallelConvGateway
				.getGatewayDirection());
		var_parallelConvGateway_gatewayDirection.setType("EObject");
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_parallelConvGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_parallelGateway_gatewayDirection,
				literal1);
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
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, Lane lane, LaneSet laneSet,
			ParallelGateway parallelGateway, FlowNodeToStep pgwToParallelStep,
			SequenceFlow divergeFlow, SequenceFlowToUCFlow divergeFlowToFlow) {
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
		isApplicableMatch.registerObject("parallelConvGateway",
				parallelConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch
				.registerObject("pgwToParallelStep", pgwToParallelStep);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
			EObject process, EObject inFlow, EObject parallelConvGateway,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject initFlow, EObject parallelStep,
			EObject pcgwToParStep, EObject outFlowToInitFlow,
			EObject outFlowToParallelStep, EObject lane, EObject laneSet,
			EObject parallelGateway, EObject pgwToParallelStep,
			EObject divergeFlow, EObject divergeFlowToFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelConvGateway", parallelConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("pcgwToParStep", pcgwToParStep);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToParallelStep",
				outFlowToParallelStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("pgwToParallelStep", pgwToParallelStep);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("divergeFlowToFlow", divergeFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("parallelConvGateway")
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_54(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_232280 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_851935 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_673022 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_673022 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToParallelGateway = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		ParallelGateway parallelConvGateway = null;
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

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;

			// check link flowElements from parallelConvGateway to process
			JavaSDM.ensure(process.equals(parallelConvGateway.eContainer()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
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
							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// check link incoming from inFlow to parallelConvGateway
							JavaSDM.ensure(parallelConvGateway.equals(inFlow
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
									// check isomorphic binding between objects outFlow and divergeFlow 
									JavaSDM.ensure(!outFlow.equals(divergeFlow));

									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link outgoing from outFlow to parallelConvGateway
									JavaSDM.ensure(parallelConvGateway
											.equals(outFlow.getSourceRef()));

									// iterate to-many link flowElements from process to parallelGateway
									fujaba__Success = false;

									fujaba__IterProcessToParallelGateway = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToParallelGateway
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToParallelGateway
													.next();

											// ensure correct type and really bound of object parallelGateway
											JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
											parallelGateway = (ParallelGateway) _TmpObject;
											// check isomorphic binding between objects parallelGateway and parallelConvGateway 
											JavaSDM.ensure(!parallelGateway
													.equals(parallelConvGateway));

											// check link outgoing from divergeFlow to parallelGateway
											JavaSDM.ensure(parallelGateway
													.equals(divergeFlow
															.getSourceRef()));

											// iterate to-many link laneSets from process to laneSet
											fujaba__Success = false;

											fujaba__IterProcessToLaneSet = new ArrayList(
													process.getLaneSets())
													.iterator();

											while (fujaba__IterProcessToLaneSet
													.hasNext()) {
												try {
													laneSet = (LaneSet) fujaba__IterProcessToLaneSet
															.next();

													// check object laneSet is really bound
													JavaSDM.ensure(laneSet != null);
													// iterate to-many link lanes from laneSet to lane
													fujaba__Success = false;

													fujaba__IterLaneSetToLane = new ArrayList(
															laneSet.getLanes())
															.iterator();

													while (fujaba__IterLaneSetToLane
															.hasNext()) {
														try {
															lane = (Lane) fujaba__IterLaneSetToLane
																	.next();

															// check object lane is really bound
															JavaSDM.ensure(lane != null);
															// check link flowNodeRefs from lane to parallelConvGateway
															JavaSDM.ensure(lane
																	.getFlowNodeRefs()
																	.contains(
																			parallelConvGateway));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_outFlow_flowElements_232280 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_232280 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_232280 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_232280
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_232280 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_232280
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
																	__DEC_parallelConvGateway_flowElements_851935 = parallelConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_parallelConvGateway_flowElements_851935 is really bound
																	JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_851935 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_851935
																			.getFlowElements()
																			.contains(
																					parallelConvGateway));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_851935 and process 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_851935
																			.equals(process));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link default from outFlow
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				outFlow,
																				ExclusiveGateway.class,
																				"default")
																		.size() == 0);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_673022
																	fujaba__Success = false;

																	fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_673022 = new ArrayList(
																			parallelConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_673022
																					.hasNext()) {
																		try {
																			__DEC_parallelConvGateway_targetRef_673022 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_673022
																					.next();

																			// check object __DEC_parallelConvGateway_targetRef_673022 is really bound
																			JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_673022 != null);
																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_673022 and divergeFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_673022
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_673022 and inFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_673022
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_673022 and outFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_673022
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
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object inFlow is really bound
																JavaSDM.ensure(inFlow != null);
																// check object lane is really bound
																JavaSDM.ensure(lane != null);
																// check object laneSet is really bound
																JavaSDM.ensure(laneSet != null);
																// check object outFlow is really bound
																JavaSDM.ensure(outFlow != null);
																// check object parallelConvGateway is really bound
																JavaSDM.ensure(parallelConvGateway != null);
																// check object parallelGateway is really bound
																JavaSDM.ensure(parallelGateway != null);
																// check object process is really bound
																JavaSDM.ensure(process != null);
																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check isomorphic binding between objects parallelGateway and parallelConvGateway 
																JavaSDM.ensure(!parallelGateway
																		.equals(parallelConvGateway));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link flowElements from parallelConvGateway to process
																JavaSDM.ensure(process
																		.equals(parallelConvGateway
																				.eContainer()));

																// check link flowElements from parallelGateway to process
																JavaSDM.ensure(process
																		.equals(parallelGateway
																				.eContainer()));

																// check link incoming from inFlow to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from divergeFlow to parallelConvGateway
																JavaSDM.ensure(!(parallelConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link incoming from outFlow to parallelConvGateway
																JavaSDM.ensure(!(parallelConvGateway
																		.equals(outFlow
																				.getTargetRef())));

																// check link laneSets from laneSet to process
																JavaSDM.ensure(process
																		.equals(laneSet
																				.eContainer()));

																// check link lanes from lane to laneSet
																JavaSDM.ensure(laneSet
																		.equals(lane
																				.eContainer()));

																// check link outgoing from outFlow to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link outgoing from divergeFlow to parallelGateway
																JavaSDM.ensure(parallelGateway
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link src from _edge_flowElements to process
																JavaSDM.ensure(process
																		.equals(_edge_flowElements
																				.getSrc()));

																// check link trg from _edge_flowElements to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(_edge_flowElements
																				.getTrg()));

																// check link flowNodeRefs from lane to parallelConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				parallelConvGateway));

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
																				parallelConvGateway,
																				outFlow,
																				lane,
																				laneSet,
																				parallelGateway,
																				divergeFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_55(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_799662 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_780058 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_479279 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_479279 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		ParallelGateway parallelConvGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
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

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and divergeFlow 
					JavaSDM.ensure(!outFlow.equals(divergeFlow));

					// bind object
					_TmpObject = divergeFlow.getSourceRef();

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
							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// bind object
							_TmpObject = inFlow.getTargetRef();

							// ensure correct type and really bound of object parallelConvGateway
							JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
							parallelConvGateway = (ParallelGateway) _TmpObject;

							// check isomorphic binding between objects parallelGateway and parallelConvGateway 
							JavaSDM.ensure(!parallelGateway
									.equals(parallelConvGateway));

							// check link flowElements from parallelConvGateway to process
							JavaSDM.ensure(process.equals(parallelConvGateway
									.eContainer()));

							// check link outgoing from outFlow to parallelConvGateway
							JavaSDM.ensure(parallelConvGateway.equals(outFlow
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
											// check link flowNodeRefs from lane to parallelConvGateway
											JavaSDM.ensure(lane
													.getFlowNodeRefs()
													.contains(
															parallelConvGateway));

											// story node 'test core match and DECs'
											try {
												fujaba__Success = false;

												// check negative bindings
												try {
													fujaba__Success = false;

													// bind object
													__DEC_outFlow_flowElements_799662 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_799662 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_799662 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_799662
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_799662 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_799662
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
													__DEC_parallelConvGateway_flowElements_780058 = parallelConvGateway
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
															.eContainer()
															: null;

													// check object __DEC_parallelConvGateway_flowElements_780058 is really bound
													JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_780058 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_780058
															.getFlowElements()
															.contains(
																	parallelConvGateway));

													// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_780058 and process 
													JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_780058
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link default from outFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																outFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_479279
													fujaba__Success = false;

													fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_479279 = new ArrayList(
															parallelConvGateway
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_479279
																	.hasNext()) {
														try {
															__DEC_parallelConvGateway_targetRef_479279 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_479279
																	.next();

															// check object __DEC_parallelConvGateway_targetRef_479279 is really bound
															JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_479279 != null);
															// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_479279 and divergeFlow 
															JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_479279
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_479279 and inFlow 
															JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_479279
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_479279 and outFlow 
															JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_479279
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
												// check object divergeFlow is really bound
												JavaSDM.ensure(divergeFlow != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object parallelConvGateway is really bound
												JavaSDM.ensure(parallelConvGateway != null);
												// check object parallelGateway is really bound
												JavaSDM.ensure(parallelGateway != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and divergeFlow 
												JavaSDM.ensure(!inFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and divergeFlow 
												JavaSDM.ensure(!outFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check isomorphic binding between objects parallelGateway and parallelConvGateway 
												JavaSDM.ensure(!parallelGateway
														.equals(parallelConvGateway));

												// check link flowElements from divergeFlow to process
												JavaSDM.ensure(process
														.equals(divergeFlow
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link flowElements from parallelConvGateway to process
												JavaSDM.ensure(process
														.equals(parallelConvGateway
																.eContainer()));

												// check link flowElements from parallelGateway to process
												JavaSDM.ensure(process
														.equals(parallelGateway
																.eContainer()));

												// check link incoming from inFlow to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway.equals(inFlow
														.getTargetRef()));

												// check link incoming from divergeFlow to parallelConvGateway
												JavaSDM.ensure(!(parallelConvGateway.equals(divergeFlow
														.getTargetRef())));

												// check link incoming from outFlow to parallelConvGateway
												JavaSDM.ensure(!(parallelConvGateway.equals(outFlow
														.getTargetRef())));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link outgoing from outFlow to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway.equals(outFlow
														.getSourceRef()));

												// check link outgoing from divergeFlow to parallelGateway
												JavaSDM.ensure(parallelGateway.equals(divergeFlow
														.getSourceRef()));

												// check link src from _edge_flowElements to process
												JavaSDM.ensure(process
														.equals(_edge_flowElements
																.getSrc()));

												// check link trg from _edge_flowElements to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_flowElements
																.getTrg()));

												// check link flowNodeRefs from lane to parallelConvGateway
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																parallelConvGateway));

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
																parallelConvGateway,
																outFlow,
																lane,
																laneSet,
																parallelGateway,
																divergeFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_56(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_810568 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_865115 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_707203 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_707203 = null;
		Match match = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToParallelGateway = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		ParallelGateway parallelConvGateway = null;
		bpmn2.Process process = null;
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
			_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;

			// check link flowElements from parallelConvGateway to process
			JavaSDM.ensure(process.equals(parallelConvGateway.eContainer()));

			// check link incoming from inFlow to parallelConvGateway
			JavaSDM.ensure(parallelConvGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects inFlow and divergeFlow 
					JavaSDM.ensure(!inFlow.equals(divergeFlow));

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
							// check isomorphic binding between objects outFlow and divergeFlow 
							JavaSDM.ensure(!outFlow.equals(divergeFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link outgoing from outFlow to parallelConvGateway
							JavaSDM.ensure(parallelConvGateway.equals(outFlow
									.getSourceRef()));

							// iterate to-many link flowElements from process to parallelGateway
							fujaba__Success = false;

							fujaba__IterProcessToParallelGateway = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToParallelGateway
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToParallelGateway
											.next();

									// ensure correct type and really bound of object parallelGateway
									JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
									parallelGateway = (ParallelGateway) _TmpObject;
									// check isomorphic binding between objects parallelGateway and parallelConvGateway 
									JavaSDM.ensure(!parallelGateway
											.equals(parallelConvGateway));

									// check link outgoing from divergeFlow to parallelGateway
									JavaSDM.ensure(parallelGateway
											.equals(divergeFlow.getSourceRef()));

									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
										try {
											laneSet = (LaneSet) fujaba__IterProcessToLaneSet
													.next();

											// check object laneSet is really bound
											JavaSDM.ensure(laneSet != null);
											// iterate to-many link lanes from laneSet to lane
											fujaba__Success = false;

											fujaba__IterLaneSetToLane = new ArrayList(
													laneSet.getLanes())
													.iterator();

											while (fujaba__IterLaneSetToLane
													.hasNext()) {
												try {
													lane = (Lane) fujaba__IterLaneSetToLane
															.next();

													// check object lane is really bound
													JavaSDM.ensure(lane != null);
													// check link flowNodeRefs from lane to parallelConvGateway
													JavaSDM.ensure(lane
															.getFlowNodeRefs()
															.contains(
																	parallelConvGateway));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_outFlow_flowElements_810568 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_810568 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_810568 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_810568
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_810568 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_810568
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
															__DEC_parallelConvGateway_flowElements_865115 = parallelConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_parallelConvGateway_flowElements_865115 is really bound
															JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_865115 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_865115
																	.getFlowElements()
																	.contains(
																			parallelConvGateway));

															// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_865115 and process 
															JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_865115
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_707203
															fujaba__Success = false;

															fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_707203 = new ArrayList(
																	parallelConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_707203
																			.hasNext()) {
																try {
																	__DEC_parallelConvGateway_targetRef_707203 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_707203
																			.next();

																	// check object __DEC_parallelConvGateway_targetRef_707203 is really bound
																	JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_707203 != null);
																	// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_707203 and divergeFlow 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_707203
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_707203 and inFlow 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_707203
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_707203 and outFlow 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_707203
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
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object lane is really bound
														JavaSDM.ensure(lane != null);
														// check object laneSet is really bound
														JavaSDM.ensure(laneSet != null);
														// check object outFlow is really bound
														JavaSDM.ensure(outFlow != null);
														// check object parallelConvGateway is really bound
														JavaSDM.ensure(parallelConvGateway != null);
														// check object parallelGateway is really bound
														JavaSDM.ensure(parallelGateway != null);
														// check object process is really bound
														JavaSDM.ensure(process != null);
														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check isomorphic binding between objects parallelGateway and parallelConvGateway 
														JavaSDM.ensure(!parallelGateway
																.equals(parallelConvGateway));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link flowElements from parallelConvGateway to process
														JavaSDM.ensure(process
																.equals(parallelConvGateway
																		.eContainer()));

														// check link flowElements from parallelGateway to process
														JavaSDM.ensure(process
																.equals(parallelGateway
																		.eContainer()));

														// check link incoming from inFlow to parallelConvGateway
														JavaSDM.ensure(parallelConvGateway.equals(inFlow
																.getTargetRef()));

														// check link incoming from divergeFlow to parallelConvGateway
														JavaSDM.ensure(!(parallelConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link incoming from outFlow to parallelConvGateway
														JavaSDM.ensure(!(parallelConvGateway.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to parallelConvGateway
														JavaSDM.ensure(parallelConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to parallelGateway
														JavaSDM.ensure(parallelGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link src from _edge_targetRef to inFlow
														JavaSDM.ensure(inFlow
																.equals(_edge_targetRef
																		.getSrc()));

														// check link trg from _edge_targetRef to parallelConvGateway
														JavaSDM.ensure(parallelConvGateway
																.equals(_edge_targetRef
																		.getTrg()));

														// check link flowNodeRefs from lane to parallelConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		parallelConvGateway));

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
																		parallelConvGateway,
																		outFlow,
																		lane,
																		laneSet,
																		parallelGateway,
																		divergeFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_57(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_820965 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_318731 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_3557 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_3557 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToParallelGateway = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelConvGateway = null;

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

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from parallelConvGateway to process
			JavaSDM.ensure(process.equals(parallelConvGateway.eContainer()));

			// check link incoming from inFlow to parallelConvGateway
			JavaSDM.ensure(parallelConvGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects inFlow and divergeFlow 
					JavaSDM.ensure(!inFlow.equals(divergeFlow));

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
							// check isomorphic binding between objects outFlow and divergeFlow 
							JavaSDM.ensure(!outFlow.equals(divergeFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link outgoing from outFlow to parallelConvGateway
							JavaSDM.ensure(parallelConvGateway.equals(outFlow
									.getSourceRef()));

							// iterate to-many link flowElements from process to parallelGateway
							fujaba__Success = false;

							fujaba__IterProcessToParallelGateway = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToParallelGateway
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToParallelGateway
											.next();

									// ensure correct type and really bound of object parallelGateway
									JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
									parallelGateway = (ParallelGateway) _TmpObject;
									// check isomorphic binding between objects parallelGateway and parallelConvGateway 
									JavaSDM.ensure(!parallelGateway
											.equals(parallelConvGateway));

									// check link outgoing from divergeFlow to parallelGateway
									JavaSDM.ensure(parallelGateway
											.equals(divergeFlow.getSourceRef()));

									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
										try {
											laneSet = (LaneSet) fujaba__IterProcessToLaneSet
													.next();

											// check object laneSet is really bound
											JavaSDM.ensure(laneSet != null);
											// iterate to-many link lanes from laneSet to lane
											fujaba__Success = false;

											fujaba__IterLaneSetToLane = new ArrayList(
													laneSet.getLanes())
													.iterator();

											while (fujaba__IterLaneSetToLane
													.hasNext()) {
												try {
													lane = (Lane) fujaba__IterLaneSetToLane
															.next();

													// check object lane is really bound
													JavaSDM.ensure(lane != null);
													// check link flowNodeRefs from lane to parallelConvGateway
													JavaSDM.ensure(lane
															.getFlowNodeRefs()
															.contains(
																	parallelConvGateway));

													// iterate to-many link src from inFlow to _edge_targetRef
													fujaba__Success = false;

													fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			inFlow,
																			EMoflonEdge.class,
																			"src"))
															.iterator();

													while (fujaba__IterInFlowTo_edge_targetRef
															.hasNext()) {
														try {
															_edge_targetRef = (EMoflonEdge) fujaba__IterInFlowTo_edge_targetRef
																	.next();

															// check object _edge_targetRef is really bound
															JavaSDM.ensure(_edge_targetRef != null);
															// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
															JavaSDM.ensure(!_edge_targetRef
																	.equals(_edge_incoming));

															// check link trg from _edge_targetRef to parallelConvGateway
															JavaSDM.ensure(parallelConvGateway
																	.equals(_edge_targetRef
																			.getTrg()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_outFlow_flowElements_820965 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_820965 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_820965 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_820965
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_820965 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_820965
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
																	__DEC_parallelConvGateway_flowElements_318731 = parallelConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_parallelConvGateway_flowElements_318731 is really bound
																	JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_318731 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_318731
																			.getFlowElements()
																			.contains(
																					parallelConvGateway));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_318731 and process 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_318731
																			.equals(process));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link default from outFlow
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				outFlow,
																				ExclusiveGateway.class,
																				"default")
																		.size() == 0);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_3557
																	fujaba__Success = false;

																	fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_3557 = new ArrayList(
																			parallelConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_3557
																					.hasNext()) {
																		try {
																			__DEC_parallelConvGateway_targetRef_3557 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_3557
																					.next();

																			// check object __DEC_parallelConvGateway_targetRef_3557 is really bound
																			JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_3557 != null);
																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_3557 and divergeFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_3557
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_3557 and inFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_3557
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_3557 and outFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_3557
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
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object inFlow is really bound
																JavaSDM.ensure(inFlow != null);
																// check object lane is really bound
																JavaSDM.ensure(lane != null);
																// check object laneSet is really bound
																JavaSDM.ensure(laneSet != null);
																// check object outFlow is really bound
																JavaSDM.ensure(outFlow != null);
																// check object parallelConvGateway is really bound
																JavaSDM.ensure(parallelConvGateway != null);
																// check object parallelGateway is really bound
																JavaSDM.ensure(parallelGateway != null);
																// check object process is really bound
																JavaSDM.ensure(process != null);
																// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
																JavaSDM.ensure(!_edge_targetRef
																		.equals(_edge_incoming));

																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check isomorphic binding between objects parallelGateway and parallelConvGateway 
																JavaSDM.ensure(!parallelGateway
																		.equals(parallelConvGateway));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link flowElements from parallelConvGateway to process
																JavaSDM.ensure(process
																		.equals(parallelConvGateway
																				.eContainer()));

																// check link flowElements from parallelGateway to process
																JavaSDM.ensure(process
																		.equals(parallelGateway
																				.eContainer()));

																// check link incoming from inFlow to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from divergeFlow to parallelConvGateway
																JavaSDM.ensure(!(parallelConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link incoming from outFlow to parallelConvGateway
																JavaSDM.ensure(!(parallelConvGateway
																		.equals(outFlow
																				.getTargetRef())));

																// check link laneSets from laneSet to process
																JavaSDM.ensure(process
																		.equals(laneSet
																				.eContainer()));

																// check link lanes from lane to laneSet
																JavaSDM.ensure(laneSet
																		.equals(lane
																				.eContainer()));

																// check link outgoing from outFlow to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link outgoing from divergeFlow to parallelGateway
																JavaSDM.ensure(parallelGateway
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link src from _edge_incoming to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(_edge_incoming
																				.getSrc()));

																// check link src from _edge_targetRef to inFlow
																JavaSDM.ensure(inFlow
																		.equals(_edge_targetRef
																				.getSrc()));

																// check link trg from _edge_incoming to inFlow
																JavaSDM.ensure(inFlow
																		.equals(_edge_incoming
																				.getTrg()));

																// check link trg from _edge_targetRef to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(_edge_targetRef
																				.getTrg()));

																// check link flowNodeRefs from lane to parallelConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				parallelConvGateway));

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
																				parallelConvGateway,
																				outFlow,
																				lane,
																				laneSet,
																				parallelGateway,
																				divergeFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_58(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_43427 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_460867 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_533960 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_533960 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterParallelConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterParallelConvGatewayToLane = null;
		Lane lane = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		ParallelGateway parallelConvGateway = null;
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

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = parallelConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) parallelConvGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(
					parallelConvGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link outgoing from outFlow to parallelConvGateway
			JavaSDM.ensure(parallelConvGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and divergeFlow 
					JavaSDM.ensure(!outFlow.equals(divergeFlow));

					// bind object
					_TmpObject = divergeFlow.getSourceRef();

					// ensure correct type and really bound of object parallelGateway
					JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
					parallelGateway = (ParallelGateway) _TmpObject;

					// check isomorphic binding between objects parallelGateway and parallelConvGateway 
					JavaSDM.ensure(!parallelGateway.equals(parallelConvGateway));

					// check link flowElements from parallelGateway to process
					JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

					// iterate to-many link flowNodeRefs from parallelConvGateway to lane
					fujaba__Success = false;

					fujaba__IterParallelConvGatewayToLane = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelConvGateway,
											Lane.class, "flowNodeRefs"))
							.iterator();

					while (fujaba__IterParallelConvGatewayToLane.hasNext()) {
						try {
							lane = (Lane) fujaba__IterParallelConvGatewayToLane
									.next();

							// check object lane is really bound
							JavaSDM.ensure(lane != null);
							// iterate to-many link incoming from parallelConvGateway to inFlow
							fujaba__Success = false;

							fujaba__IterParallelConvGatewayToInFlow = new ArrayList(
									parallelConvGateway.getIncoming())
									.iterator();

							while (fujaba__IterParallelConvGatewayToInFlow
									.hasNext()) {
								try {
									inFlow = (SequenceFlow) fujaba__IterParallelConvGatewayToInFlow
											.next();

									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check isomorphic binding between objects inFlow and divergeFlow 
									JavaSDM.ensure(!inFlow.equals(divergeFlow));

									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link flowElements from inFlow to process
									JavaSDM.ensure(process.equals(inFlow
											.eContainer()));

									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
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
													__DEC_outFlow_flowElements_43427 = outFlow
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
															.eContainer()
															: null;

													// check object __DEC_outFlow_flowElements_43427 is really bound
													JavaSDM.ensure(__DEC_outFlow_flowElements_43427 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_outFlow_flowElements_43427
															.getFlowElements()
															.contains(outFlow));

													// check isomorphic binding between objects __DEC_outFlow_flowElements_43427 and process 
													JavaSDM.ensure(!__DEC_outFlow_flowElements_43427
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
													__DEC_parallelConvGateway_flowElements_460867 = parallelConvGateway
															.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
															.eContainer()
															: null;

													// check object __DEC_parallelConvGateway_flowElements_460867 is really bound
													JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_460867 != null);

													// check if contained via correct reference
													JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_460867
															.getFlowElements()
															.contains(
																	parallelConvGateway));

													// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_460867 and process 
													JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_460867
															.equals(process));

													fujaba__Success = true;
												} catch (JavaSDMException fujaba__InternalException) {
													fujaba__Success = false;
												}

												fujaba__Success = !(fujaba__Success);

												JavaSDM.ensure(fujaba__Success);

												// negative check for link default from outFlow
												JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
														.getOppositeReference(
																outFlow,
																ExclusiveGateway.class,
																"default")
														.size() == 0);
												// check negative bindings
												try {
													fujaba__Success = false;

													// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_533960
													fujaba__Success = false;

													fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_533960 = new ArrayList(
															parallelConvGateway
																	.getIncoming())
															.iterator();

													while (!(fujaba__Success)
															&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_533960
																	.hasNext()) {
														try {
															__DEC_parallelConvGateway_targetRef_533960 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_533960
																	.next();

															// check object __DEC_parallelConvGateway_targetRef_533960 is really bound
															JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_533960 != null);
															// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_533960 and divergeFlow 
															JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_533960
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_533960 and inFlow 
															JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_533960
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_533960 and outFlow 
															JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_533960
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
												// check object divergeFlow is really bound
												JavaSDM.ensure(divergeFlow != null);
												// check object inFlow is really bound
												JavaSDM.ensure(inFlow != null);
												// check object lane is really bound
												JavaSDM.ensure(lane != null);
												// check object laneSet is really bound
												JavaSDM.ensure(laneSet != null);
												// check object outFlow is really bound
												JavaSDM.ensure(outFlow != null);
												// check object parallelConvGateway is really bound
												JavaSDM.ensure(parallelConvGateway != null);
												// check object parallelGateway is really bound
												JavaSDM.ensure(parallelGateway != null);
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check isomorphic binding between objects inFlow and divergeFlow 
												JavaSDM.ensure(!inFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and divergeFlow 
												JavaSDM.ensure(!outFlow
														.equals(divergeFlow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check isomorphic binding between objects parallelGateway and parallelConvGateway 
												JavaSDM.ensure(!parallelGateway
														.equals(parallelConvGateway));

												// check link flowElements from divergeFlow to process
												JavaSDM.ensure(process
														.equals(divergeFlow
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link flowElements from parallelConvGateway to process
												JavaSDM.ensure(process
														.equals(parallelConvGateway
																.eContainer()));

												// check link flowElements from parallelGateway to process
												JavaSDM.ensure(process
														.equals(parallelGateway
																.eContainer()));

												// check link incoming from inFlow to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway.equals(inFlow
														.getTargetRef()));

												// check link incoming from divergeFlow to parallelConvGateway
												JavaSDM.ensure(!(parallelConvGateway.equals(divergeFlow
														.getTargetRef())));

												// check link incoming from outFlow to parallelConvGateway
												JavaSDM.ensure(!(parallelConvGateway.equals(outFlow
														.getTargetRef())));

												// check link laneSets from laneSet to process
												JavaSDM.ensure(process
														.equals(laneSet
																.eContainer()));

												// check link lanes from lane to laneSet
												JavaSDM.ensure(laneSet
														.equals(lane
																.eContainer()));

												// check link outgoing from outFlow to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway.equals(outFlow
														.getSourceRef()));

												// check link outgoing from divergeFlow to parallelGateway
												JavaSDM.ensure(parallelGateway.equals(divergeFlow
														.getSourceRef()));

												// check link src from _edge_sourceRef to outFlow
												JavaSDM.ensure(outFlow
														.equals(_edge_sourceRef
																.getSrc()));

												// check link trg from _edge_sourceRef to parallelConvGateway
												JavaSDM.ensure(parallelConvGateway
														.equals(_edge_sourceRef
																.getTrg()));

												// check link flowNodeRefs from lane to parallelConvGateway
												JavaSDM.ensure(lane
														.getFlowNodeRefs()
														.contains(
																parallelConvGateway));

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
																parallelConvGateway,
																outFlow,
																lane,
																laneSet,
																parallelGateway,
																divergeFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_59(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_326441 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_901010 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_784550 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_784550 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterParallelConvGatewayToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToParallelGateway = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		SequenceFlow outFlow = null;
		ParallelGateway parallelConvGateway = null;

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

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = outFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// check link flowElements from parallelConvGateway to process
			JavaSDM.ensure(process.equals(parallelConvGateway.eContainer()));

			// check link outgoing from outFlow to parallelConvGateway
			JavaSDM.ensure(parallelConvGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and divergeFlow 
					JavaSDM.ensure(!outFlow.equals(divergeFlow));

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
							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link incoming from inFlow to parallelConvGateway
							JavaSDM.ensure(parallelConvGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link flowElements from process to parallelGateway
							fujaba__Success = false;

							fujaba__IterProcessToParallelGateway = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToParallelGateway
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToParallelGateway
											.next();

									// ensure correct type and really bound of object parallelGateway
									JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
									parallelGateway = (ParallelGateway) _TmpObject;
									// check isomorphic binding between objects parallelGateway and parallelConvGateway 
									JavaSDM.ensure(!parallelGateway
											.equals(parallelConvGateway));

									// check link outgoing from divergeFlow to parallelGateway
									JavaSDM.ensure(parallelGateway
											.equals(divergeFlow.getSourceRef()));

									// iterate to-many link flowNodeRefs from parallelConvGateway to lane
									fujaba__Success = false;

									fujaba__IterParallelConvGatewayToLane = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															parallelConvGateway,
															Lane.class,
															"flowNodeRefs"))
											.iterator();

									while (fujaba__IterParallelConvGatewayToLane
											.hasNext()) {
										try {
											lane = (Lane) fujaba__IterParallelConvGatewayToLane
													.next();

											// check object lane is really bound
											JavaSDM.ensure(lane != null);
											// iterate to-many link laneSets from process to laneSet
											fujaba__Success = false;

											fujaba__IterProcessToLaneSet = new ArrayList(
													process.getLaneSets())
													.iterator();

											while (fujaba__IterProcessToLaneSet
													.hasNext()) {
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
																			"src"))
															.iterator();

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

															// check link trg from _edge_sourceRef to parallelConvGateway
															JavaSDM.ensure(parallelConvGateway
																	.equals(_edge_sourceRef
																			.getTrg()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_outFlow_flowElements_326441 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_326441 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_326441 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_326441
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_326441 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_326441
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
																	__DEC_parallelConvGateway_flowElements_901010 = parallelConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_parallelConvGateway_flowElements_901010 is really bound
																	JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_901010 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_901010
																			.getFlowElements()
																			.contains(
																					parallelConvGateway));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_901010 and process 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_901010
																			.equals(process));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// negative check for link default from outFlow
																JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																		.getOppositeReference(
																				outFlow,
																				ExclusiveGateway.class,
																				"default")
																		.size() == 0);
																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_784550
																	fujaba__Success = false;

																	fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_784550 = new ArrayList(
																			parallelConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_784550
																					.hasNext()) {
																		try {
																			__DEC_parallelConvGateway_targetRef_784550 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_784550
																					.next();

																			// check object __DEC_parallelConvGateway_targetRef_784550 is really bound
																			JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_784550 != null);
																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_784550 and divergeFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_784550
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_784550 and inFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_784550
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_784550 and outFlow 
																			JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_784550
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
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object inFlow is really bound
																JavaSDM.ensure(inFlow != null);
																// check object lane is really bound
																JavaSDM.ensure(lane != null);
																// check object laneSet is really bound
																JavaSDM.ensure(laneSet != null);
																// check object outFlow is really bound
																JavaSDM.ensure(outFlow != null);
																// check object parallelConvGateway is really bound
																JavaSDM.ensure(parallelConvGateway != null);
																// check object parallelGateway is really bound
																JavaSDM.ensure(parallelGateway != null);
																// check object process is really bound
																JavaSDM.ensure(process != null);
																// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
																JavaSDM.ensure(!_edge_sourceRef
																		.equals(_edge_outgoing));

																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check isomorphic binding between objects parallelGateway and parallelConvGateway 
																JavaSDM.ensure(!parallelGateway
																		.equals(parallelConvGateway));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from inFlow to process
																JavaSDM.ensure(process
																		.equals(inFlow
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link flowElements from parallelConvGateway to process
																JavaSDM.ensure(process
																		.equals(parallelConvGateway
																				.eContainer()));

																// check link flowElements from parallelGateway to process
																JavaSDM.ensure(process
																		.equals(parallelGateway
																				.eContainer()));

																// check link incoming from inFlow to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from divergeFlow to parallelConvGateway
																JavaSDM.ensure(!(parallelConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link incoming from outFlow to parallelConvGateway
																JavaSDM.ensure(!(parallelConvGateway
																		.equals(outFlow
																				.getTargetRef())));

																// check link laneSets from laneSet to process
																JavaSDM.ensure(process
																		.equals(laneSet
																				.eContainer()));

																// check link lanes from lane to laneSet
																JavaSDM.ensure(laneSet
																		.equals(lane
																				.eContainer()));

																// check link outgoing from outFlow to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link outgoing from divergeFlow to parallelGateway
																JavaSDM.ensure(parallelGateway
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link src from _edge_outgoing to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(_edge_outgoing
																				.getSrc()));

																// check link src from _edge_sourceRef to outFlow
																JavaSDM.ensure(outFlow
																		.equals(_edge_sourceRef
																				.getSrc()));

																// check link trg from _edge_outgoing to outFlow
																JavaSDM.ensure(outFlow
																		.equals(_edge_outgoing
																				.getTrg()));

																// check link trg from _edge_sourceRef to parallelConvGateway
																JavaSDM.ensure(parallelConvGateway
																		.equals(_edge_sourceRef
																				.getTrg()));

																// check link flowNodeRefs from lane to parallelConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				parallelConvGateway));

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
																				parallelConvGateway,
																				outFlow,
																				lane,
																				laneSet,
																				parallelGateway,
																				divergeFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_60(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_outFlow_flowElements_372370 = null;
		FlowElementsContainer __DEC_parallelConvGateway_flowElements_832870 = null;
		Iterator fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_860516 = null;
		SequenceFlow __DEC_parallelConvGateway_targetRef_860516 = null;
		Match match = null;
		Iterator fujaba__IterParallelConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterParallelConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToParallelGateway = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		ParallelGateway parallelConvGateway = null;
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

			// ensure correct type and really bound of object parallelConvGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelConvGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = parallelConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) parallelConvGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(
					parallelConvGateway));

			// check link flowNodeRefs from lane to parallelConvGateway
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(parallelConvGateway));

			// iterate to-many link flowElements from process to divergeFlow
			fujaba__Success = false;

			fujaba__IterProcessToDivergeFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToDivergeFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToDivergeFlow.next();

					// ensure correct type and really bound of object divergeFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					divergeFlow = (SequenceFlow) _TmpObject;
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
							// check isomorphic binding between objects parallelGateway and parallelConvGateway 
							JavaSDM.ensure(!parallelGateway
									.equals(parallelConvGateway));

							// check link outgoing from divergeFlow to parallelGateway
							JavaSDM.ensure(parallelGateway.equals(divergeFlow
									.getSourceRef()));

							// iterate to-many link incoming from parallelConvGateway to inFlow
							fujaba__Success = false;

							fujaba__IterParallelConvGatewayToInFlow = new ArrayList(
									parallelConvGateway.getIncoming())
									.iterator();

							while (fujaba__IterParallelConvGatewayToInFlow
									.hasNext()) {
								try {
									inFlow = (SequenceFlow) fujaba__IterParallelConvGatewayToInFlow
											.next();

									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check isomorphic binding between objects inFlow and divergeFlow 
									JavaSDM.ensure(!inFlow.equals(divergeFlow));

									// check link flowElements from inFlow to process
									JavaSDM.ensure(process.equals(inFlow
											.eContainer()));

									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
										try {
											laneSet = (LaneSet) fujaba__IterProcessToLaneSet
													.next();

											// check object laneSet is really bound
											JavaSDM.ensure(laneSet != null);
											// check link lanes from lane to laneSet
											JavaSDM.ensure(laneSet.equals(lane
													.eContainer()));

											// iterate to-many link outgoing from parallelConvGateway to outFlow
											fujaba__Success = false;

											fujaba__IterParallelConvGatewayToOutFlow = new ArrayList(
													parallelConvGateway
															.getOutgoing())
													.iterator();

											while (fujaba__IterParallelConvGatewayToOutFlow
													.hasNext()) {
												try {
													outFlow = (SequenceFlow) fujaba__IterParallelConvGatewayToOutFlow
															.next();

													// check object outFlow is really bound
													JavaSDM.ensure(outFlow != null);
													// check isomorphic binding between objects outFlow and divergeFlow 
													JavaSDM.ensure(!outFlow
															.equals(divergeFlow));

													// check isomorphic binding between objects outFlow and inFlow 
													JavaSDM.ensure(!outFlow
															.equals(inFlow));

													// check link flowElements from outFlow to process
													JavaSDM.ensure(process.equals(outFlow
															.eContainer()));

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_outFlow_flowElements_372370 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_372370 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_372370 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_372370
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_372370 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_372370
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
															__DEC_parallelConvGateway_flowElements_832870 = parallelConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_parallelConvGateway_flowElements_832870 is really bound
															JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_832870 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_parallelConvGateway_flowElements_832870
																	.getFlowElements()
																	.contains(
																			parallelConvGateway));

															// check isomorphic binding between objects __DEC_parallelConvGateway_flowElements_832870 and process 
															JavaSDM.ensure(!__DEC_parallelConvGateway_flowElements_832870
																	.equals(process));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// negative check for link default from outFlow
														JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		outFlow,
																		ExclusiveGateway.class,
																		"default")
																.size() == 0);
														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link incoming from parallelConvGateway to __DEC_parallelConvGateway_targetRef_860516
															fujaba__Success = false;

															fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_860516 = new ArrayList(
																	parallelConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_860516
																			.hasNext()) {
																try {
																	__DEC_parallelConvGateway_targetRef_860516 = (SequenceFlow) fujaba__IterParallelConvGatewayTo__DEC_parallelConvGateway_targetRef_860516
																			.next();

																	// check object __DEC_parallelConvGateway_targetRef_860516 is really bound
																	JavaSDM.ensure(__DEC_parallelConvGateway_targetRef_860516 != null);
																	// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_860516 and divergeFlow 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_860516
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_860516 and inFlow 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_860516
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_parallelConvGateway_targetRef_860516 and outFlow 
																	JavaSDM.ensure(!__DEC_parallelConvGateway_targetRef_860516
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
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object lane is really bound
														JavaSDM.ensure(lane != null);
														// check object laneSet is really bound
														JavaSDM.ensure(laneSet != null);
														// check object outFlow is really bound
														JavaSDM.ensure(outFlow != null);
														// check object parallelConvGateway is really bound
														JavaSDM.ensure(parallelConvGateway != null);
														// check object parallelGateway is really bound
														JavaSDM.ensure(parallelGateway != null);
														// check object process is really bound
														JavaSDM.ensure(process != null);
														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check isomorphic binding between objects parallelGateway and parallelConvGateway 
														JavaSDM.ensure(!parallelGateway
																.equals(parallelConvGateway));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from inFlow to process
														JavaSDM.ensure(process.equals(inFlow
																.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link flowElements from parallelConvGateway to process
														JavaSDM.ensure(process
																.equals(parallelConvGateway
																		.eContainer()));

														// check link flowElements from parallelGateway to process
														JavaSDM.ensure(process
																.equals(parallelGateway
																		.eContainer()));

														// check link incoming from inFlow to parallelConvGateway
														JavaSDM.ensure(parallelConvGateway.equals(inFlow
																.getTargetRef()));

														// check link incoming from divergeFlow to parallelConvGateway
														JavaSDM.ensure(!(parallelConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link incoming from outFlow to parallelConvGateway
														JavaSDM.ensure(!(parallelConvGateway.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to parallelConvGateway
														JavaSDM.ensure(parallelConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to parallelGateway
														JavaSDM.ensure(parallelGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link src from _edge_flowNodeRefs to lane
														JavaSDM.ensure(lane
																.equals(_edge_flowNodeRefs
																		.getSrc()));

														// check link trg from _edge_flowNodeRefs to parallelConvGateway
														JavaSDM.ensure(parallelConvGateway
																.equals(_edge_flowNodeRefs
																		.getTrg()));

														// check link flowNodeRefs from lane to parallelConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		parallelConvGateway));

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
																		parallelConvGateway,
																		outFlow,
																		lane,
																		laneSet,
																		parallelGateway,
																		divergeFlow);
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
		Step nextStep = null;
		Object _TmpObject = null;
		CSP csp = null;
		SequenceFlow outFlow = null;
		ParallelGateway parallelConvGateway = null;
		FlowNodeToStep pcgwToParStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		SequenceFlowToStep outFlowToParallelStep = null;
		Iterator fujaba__IterParallelGatewayToPgwToParallelStep = null;
		FlowNodeToStep pgwToParallelStep = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		Iterator fujaba__IterDivergeFlowToDivergeFlowToFlow = null;
		SequenceFlowToUCFlow divergeFlowToFlow = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Flow initFlow = null;
		Iterator fujaba__IterFlowToParallelStep = null;
		ParallelStep parallelStep = null;
		ParallelGateway parallelGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		bpmn2.Process process = null;
		SequenceFlow inFlow = null;
		ParallelFlow flow = null;
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
							_TmpObject = inFlowToFlow.getTarget();

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof ParallelFlow);
							flow = (ParallelFlow) _TmpObject;

							// bind object
							inFlow = inFlowToFlow.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// bind object
							_TmpObject = inFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) inFlow
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
							process = (bpmn2.Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									inFlow));

							// iterate to-many link flowElements from process to divergeFlow
							fujaba__Success = false;

							fujaba__IterProcessToDivergeFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToDivergeFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToDivergeFlow
											.next();

									// ensure correct type and really bound of object divergeFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									divergeFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects inFlow and divergeFlow 
									JavaSDM.ensure(!inFlow.equals(divergeFlow));

									// bind object
									_TmpObject = divergeFlow.getSourceRef();

									// ensure correct type and really bound of object parallelGateway
									JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
									parallelGateway = (ParallelGateway) _TmpObject;

									// check link flowElements from parallelGateway to process
									JavaSDM.ensure(process
											.equals(parallelGateway
													.eContainer()));

									// iterate to-many link invokedFlows from flow to parallelStep
									fujaba__Success = false;

									fujaba__IterFlowToParallelStep = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(flow,
															ParallelStep.class,
															"invokedFlows"))
											.iterator();

									while (fujaba__IterFlowToParallelStep
											.hasNext()) {
										try {
											parallelStep = (ParallelStep) fujaba__IterFlowToParallelStep
													.next();

											// check object parallelStep is really bound
											JavaSDM.ensure(parallelStep != null);
											// bind object
											initFlow = parallelStep
													.eContainer() instanceof Flow ? (Flow) parallelStep
													.eContainer() : null;

											// check object initFlow is really bound
											JavaSDM.ensure(initFlow != null);

											// check if contained via correct reference
											JavaSDM.ensure(initFlow.getSteps()
													.contains(parallelStep));

											// check isomorphic binding between objects initFlow and flow 
											JavaSDM.ensure(!initFlow
													.equals(flow));

											// iterate to-many link laneSets from process to laneSet
											fujaba__Success = false;

											fujaba__IterProcessToLaneSet = new ArrayList(
													process.getLaneSets())
													.iterator();

											while (fujaba__IterProcessToLaneSet
													.hasNext()) {
												try {
													laneSet = (LaneSet) fujaba__IterProcessToLaneSet
															.next();

													// check object laneSet is really bound
													JavaSDM.ensure(laneSet != null);
													// iterate to-many link lanes from laneSet to lane
													fujaba__Success = false;

													fujaba__IterLaneSetToLane = new ArrayList(
															laneSet.getLanes())
															.iterator();

													while (fujaba__IterLaneSetToLane
															.hasNext()) {
														try {
															lane = (Lane) fujaba__IterLaneSetToLane
																	.next();

															// check object lane is really bound
															JavaSDM.ensure(lane != null);
															// iterate to-many link source from divergeFlow to divergeFlowToFlow
															fujaba__Success = false;

															fujaba__IterDivergeFlowToDivergeFlowToFlow = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					divergeFlow,
																					SequenceFlowToUCFlow.class,
																					"source"))
																	.iterator();

															while (fujaba__IterDivergeFlowToDivergeFlowToFlow
																	.hasNext()) {
																try {
																	divergeFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterDivergeFlowToDivergeFlowToFlow
																			.next();

																	// check object divergeFlowToFlow is really bound
																	JavaSDM.ensure(divergeFlowToFlow != null);
																	// check isomorphic binding between objects inFlowToFlow and divergeFlowToFlow 
																	JavaSDM.ensure(!inFlowToFlow
																			.equals(divergeFlowToFlow));

																	// check link target from divergeFlowToFlow to flow
																	JavaSDM.ensure(flow
																			.equals(divergeFlowToFlow
																					.getTarget()));

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
																			step = inFlowToStep
																					.getTarget();

																			// check object step is really bound
																			JavaSDM.ensure(step != null);

																			// check negative bindings
																			try {
																				fujaba__Success = false;

																				// bind object
																				nextStep = step
																						.getNext();

																				// check object nextStep is really bound
																				JavaSDM.ensure(nextStep != null);

																				// check isomorphic binding between objects nextStep and parallelStep 
																				JavaSDM.ensure(!nextStep
																						.equals(parallelStep));

																				// check isomorphic binding between objects nextStep and step 
																				JavaSDM.ensure(!nextStep
																						.equals(step));

																				fujaba__Success = true;
																			} catch (JavaSDMException fujaba__InternalException) {
																				fujaba__Success = false;
																			}

																			fujaba__Success = !(fujaba__Success);

																			JavaSDM.ensure(fujaba__Success);

																			// check isomorphic binding between objects step and parallelStep 
																			JavaSDM.ensure(!step
																					.equals(parallelStep));

																			// check link steps from step to flow
																			JavaSDM.ensure(flow
																					.equals(step
																							.eContainer()));

																			// iterate to-many link source from parallelGateway to pgwToParallelStep
																			fujaba__Success = false;

																			fujaba__IterParallelGatewayToPgwToParallelStep = new ArrayList(
																					org.moflon.util.eMoflonEMFUtil
																							.getOppositeReference(
																									parallelGateway,
																									FlowNodeToStep.class,
																									"source"))
																					.iterator();

																			while (fujaba__IterParallelGatewayToPgwToParallelStep
																					.hasNext()) {
																				try {
																					pgwToParallelStep = (FlowNodeToStep) fujaba__IterParallelGatewayToPgwToParallelStep
																							.next();

																					// check object pgwToParallelStep is really bound
																					JavaSDM.ensure(pgwToParallelStep != null);
																					// check link target from pgwToParallelStep to parallelStep
																					JavaSDM.ensure(parallelStep
																							.equals(pgwToParallelStep
																									.getTarget()));

																					// story node 'solve CSP'
																					try {
																						fujaba__Success = false;

																						_TmpObject = (this
																								.generateModel_solveCsp_BWD(
																										isApplicableMatch,
																										process,
																										inFlow,
																										parallelConvGateway,
																										outFlow,
																										flow,
																										inFlowToFlow,
																										step,
																										inFlowToStep,
																										initFlow,
																										parallelStep,
																										pcgwToParStep,
																										outFlowToInitFlow,
																										outFlowToParallelStep,
																										lane,
																										laneSet,
																										parallelGateway,
																										pgwToParallelStep,
																										divergeFlow,
																										divergeFlowToFlow,
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

																							// check object divergeFlow is really bound
																							JavaSDM.ensure(divergeFlow != null);
																							// check object divergeFlowToFlow is really bound
																							JavaSDM.ensure(divergeFlowToFlow != null);
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
																							// check object lane is really bound
																							JavaSDM.ensure(lane != null);
																							// check object laneSet is really bound
																							JavaSDM.ensure(laneSet != null);
																							// check object parallelGateway is really bound
																							JavaSDM.ensure(parallelGateway != null);
																							// check object parallelStep is really bound
																							JavaSDM.ensure(parallelStep != null);
																							// check object pgwToParallelStep is really bound
																							JavaSDM.ensure(pgwToParallelStep != null);
																							// check object process is really bound
																							JavaSDM.ensure(process != null);
																							// check object ruleResult is really bound
																							JavaSDM.ensure(ruleResult != null);
																							// check object step is really bound
																							JavaSDM.ensure(step != null);
																							// check isomorphic binding between objects inFlow and divergeFlow 
																							JavaSDM.ensure(!inFlow
																									.equals(divergeFlow));

																							// check isomorphic binding between objects inFlowToFlow and divergeFlowToFlow 
																							JavaSDM.ensure(!inFlowToFlow
																									.equals(divergeFlowToFlow));

																							// check isomorphic binding between objects initFlow and flow 
																							JavaSDM.ensure(!initFlow
																									.equals(flow));

																							// check isomorphic binding between objects step and parallelStep 
																							JavaSDM.ensure(!step
																									.equals(parallelStep));

																							// create object outFlow
																							outFlow = Bpmn2Factory.eINSTANCE
																									.createSequenceFlow();

																							// create object parallelConvGateway
																							parallelConvGateway = Bpmn2Factory.eINSTANCE
																									.createParallelGateway();

																							// create object pcgwToParStep
																							pcgwToParStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createFlowNodeToStep();

																							// create object outFlowToInitFlow
																							outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createSequenceFlowToUCFlow();

																							// create object outFlowToParallelStep
																							outFlowToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createSequenceFlowToStep();

																							// assign attribute parallelConvGateway
																							parallelConvGateway
																									.setGatewayDirection((bpmn2.GatewayDirection) csp
																											.getAttributeVariable(
																													"parallelConvGateway",
																													"gatewayDirection")
																											.getValue());
																							// assign attribute ruleResult
																							ruleResult
																									.setSuccess(true);

																							// create link
																							process.getFlowElements()
																									.add(outFlow); // add link

																							// create link
																							process.getFlowElements()
																									.add(parallelConvGateway); // add link

																							// create link
																							parallelConvGateway
																									.getIncoming()
																									.add(inFlow);

																							// create link
																							outFlow.setSourceRef(parallelConvGateway);

																							// create link
																							ruleResult
																									.getSourceObjects()
																									.add(parallelConvGateway);

																							// create link
																							pcgwToParStep
																									.setSource(parallelConvGateway);

																							// create link
																							lane.getFlowNodeRefs()
																									.add(parallelConvGateway);

																							// create link
																							outFlowToInitFlow
																									.setSource(outFlow);

																							// create link
																							outFlowToParallelStep
																									.setSource(outFlow);

																							// create link
																							ruleResult
																									.getSourceObjects()
																									.add(outFlow);

																							// create link
																							outFlowToInitFlow
																									.setTarget(initFlow);

																							// create link
																							outFlowToParallelStep
																									.setTarget(parallelStep);

																							// create link
																							pcgwToParStep
																									.setTarget(parallelStep);

																							// create link
																							ruleResult
																									.getCorrObjects()
																									.add(pcgwToParStep);

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
			ParallelGateway parallelConvGateway, SequenceFlow outFlow,
			ParallelFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, Flow initFlow,
			ParallelStep parallelStep, FlowNodeToStep pcgwToParStep,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToParallelStep, Lane lane,
			LaneSet laneSet, ParallelGateway parallelGateway,
			FlowNodeToStep pgwToParallelStep, SequenceFlow divergeFlow,
			SequenceFlowToUCFlow divergeFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");
		literal1.setType("String");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());
		var_parallelGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables
		Variable var_parallelConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelConvGateway.gatewayDirection", csp);
		var_parallelConvGateway_gatewayDirection.setType("EObject");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal1);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_parallelConvGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch
				.registerObject("pgwToParallelStep", pgwToParallelStep);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
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
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_LANE_LANESET_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6),
					(ParallelGateway) arguments.get(7),
					(SequenceFlow) arguments.get(8));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_LANE_LANESET_PARALLELGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6),
					(ParallelGateway) arguments.get(7),
					(SequenceFlow) arguments.get(8));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_LANE_LANESET_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Lane) arguments.get(5),
					(LaneSet) arguments.get(6),
					(ParallelGateway) arguments.get(7),
					(SequenceFlow) arguments.get(8));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP_LANE_LANESET_PARALLELGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW:
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
					(Flow) arguments.get(9), (ParallelStep) arguments.get(10),
					(Lane) arguments.get(11), (LaneSet) arguments.get(12),
					(ParallelGateway) arguments.get(13),
					(FlowNodeToStep) arguments.get(14),
					(SequenceFlow) arguments.get(15),
					(SequenceFlowToUCFlow) arguments.get(16));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18),
					(EObject) arguments.get(19));
			return null;
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_54__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_54((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_55__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_55((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_56__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_56((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_57__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_57((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_58__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_58((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_59__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_59((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_60__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_60((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_LANE_LANESET_PARALLELGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT:
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
					(Lane) arguments.get(14), (LaneSet) arguments.get(15),
					(ParallelGateway) arguments.get(16),
					(FlowNodeToStep) arguments.get(17),
					(SequenceFlow) arguments.get(18),
					(SequenceFlowToUCFlow) arguments.get(19),
					(ModelgeneratorRuleResult) arguments.get(20));
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelConvergingGatewayRuleImpl
