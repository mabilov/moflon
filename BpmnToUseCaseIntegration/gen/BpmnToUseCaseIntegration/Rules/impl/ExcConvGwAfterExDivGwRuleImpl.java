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

import BpmnToUseCaseIntegration.Rules.ExcConvGwAfterExDivGwRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
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

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc Conv Gw After Ex Div Gw Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExcConvGwAfterExDivGwRuleImpl extends AbstractRuleImpl implements
		ExcConvGwAfterExDivGwRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcConvGwAfterExDivGwRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExcConvGwAfterExDivGwRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __lane_flowNodeRefs_exConvGateway = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __exclusiveGateway_outgoing_divergeFlow = null;
		EMoflonEdge __process_flowElements_divergeFlow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_flowElements_defaultFlow = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __divergeFlow_sourceRef_exclusiveGateway = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object divergeFlow is really bound
			JavaSDM.ensure(divergeFlow != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
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
			// check isomorphic binding between objects divergeFlow and defaultFlow 
			JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, inFlow,
					process, defaultFlow, exclusiveGateway, divergeFlow,
					exConvGateway, outFlow, lane, laneSet));

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
				// check object divergeFlow is really bound
				JavaSDM.ensure(divergeFlow != null);
				// check object exConvGateway is really bound
				JavaSDM.ensure(exConvGateway != null);
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
				// check isomorphic binding between objects divergeFlow and defaultFlow 
				JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

				// check isomorphic binding between objects inFlow and defaultFlow 
				JavaSDM.ensure(!inFlow.equals(defaultFlow));

				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// check isomorphic binding between objects inFlow and divergeFlow 
				JavaSDM.ensure(!inFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and divergeFlow 
				JavaSDM.ensure(!outFlow.equals(divergeFlow));

				// check isomorphic binding between objects exclusiveGateway and exConvGateway 
				JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exConvGateway
				__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __lane_flowNodeRefs_exConvGateway
				__lane_flowNodeRefs_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_exConvGateway
				__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exConvGateway_outgoing_outFlow
				__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_exConvGateway
				__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exConvGateway_incoming_inFlow
				__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __process_flowElements_exConvGateway
				__process_flowElements_exConvGateway.setName("flowElements");
				// assign attribute __inFlow_targetRef_exConvGateway
				__inFlow_targetRef_exConvGateway.setName("targetRef");
				// assign attribute __exConvGateway_incoming_inFlow
				__exConvGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exConvGateway
				__outFlow_sourceRef_exConvGateway.setName("sourceRef");
				// assign attribute __exConvGateway_outgoing_outFlow
				__exConvGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __lane_flowNodeRefs_exConvGateway
				__lane_flowNodeRefs_exConvGateway.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exConvGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__exConvGateway_outgoing_outFlow,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__inFlow_targetRef_exConvGateway,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exConvGateway_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				__inFlow_targetRef_exConvGateway.setSrc(inFlow);

				// create link
				__exConvGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_exConvGateway.setSrc(process);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__lane_flowNodeRefs_exConvGateway.setTrg(exConvGateway);

				// create link
				__process_flowElements_exConvGateway.setTrg(exConvGateway);

				// create link
				__outFlow_sourceRef_exConvGateway.setTrg(exConvGateway);

				// create link
				__exConvGateway_outgoing_outFlow.setSrc(exConvGateway);

				// create link
				__exConvGateway_incoming_inFlow.setSrc(exConvGateway);

				// create link
				__inFlow_targetRef_exConvGateway.setTrg(exConvGateway);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__exConvGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_exConvGateway.setSrc(outFlow);

				// create link
				__lane_flowNodeRefs_exConvGateway.setSrc(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object defaultFlow is really bound
				JavaSDM.ensure(defaultFlow != null);
				// check object divergeFlow is really bound
				JavaSDM.ensure(divergeFlow != null);
				// check object exConvGateway is really bound
				JavaSDM.ensure(exConvGateway != null);
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
				// check isomorphic binding between objects divergeFlow and defaultFlow 
				JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

				// check isomorphic binding between objects inFlow and defaultFlow 
				JavaSDM.ensure(!inFlow.equals(defaultFlow));

				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// check isomorphic binding between objects inFlow and divergeFlow 
				JavaSDM.ensure(!inFlow.equals(divergeFlow));

				// check isomorphic binding between objects outFlow and divergeFlow 
				JavaSDM.ensure(!outFlow.equals(divergeFlow));

				// check isomorphic binding between objects exclusiveGateway and exConvGateway 
				JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_divergeFlow
				__exclusiveGateway_outgoing_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_divergeFlow
				__process_flowElements_divergeFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_defaultFlow
				__process_flowElements_defaultFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_default_defaultFlow
				__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __divergeFlow_sourceRef_exclusiveGateway
				__divergeFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");
				// assign attribute __process_flowElements_divergeFlow
				__process_flowElements_divergeFlow.setName("flowElements");
				// assign attribute __process_flowElements_defaultFlow
				__process_flowElements_defaultFlow.setName("flowElements");
				// assign attribute __exclusiveGateway_default_defaultFlow
				__exclusiveGateway_default_defaultFlow.setName("default");
				// assign attribute __divergeFlow_sourceRef_exclusiveGateway
				__divergeFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_divergeFlow
				__exclusiveGateway_outgoing_divergeFlow.setName("outgoing");
				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						defaultFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__exclusiveGateway_outgoing_divergeFlow,
								"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_divergeFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_defaultFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_default_defaultFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__process_flowElements_exclusiveGateway,
								"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						divergeFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__divergeFlow_sourceRef_exclusiveGateway,
						"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__process_flowElements_divergeFlow.setSrc(process);

				// create link
				__process_flowElements_defaultFlow.setSrc(process);

				// create link
				__process_flowElements_defaultFlow.setTrg(defaultFlow);

				// create link
				__exclusiveGateway_default_defaultFlow.setTrg(defaultFlow);

				// create link
				__divergeFlow_sourceRef_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_divergeFlow
						.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_default_defaultFlow.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_divergeFlow.setTrg(divergeFlow);

				// create link
				__process_flowElements_divergeFlow.setTrg(divergeFlow);

				// create link
				__divergeFlow_sourceRef_exclusiveGateway.setSrc(divergeFlow);

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
			this.registerObjectsToMatch_FWD(match, inFlow, process,
					defaultFlow, exclusiveGateway, divergeFlow, exConvGateway,
					outFlow, lane, laneSet);
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
		AlternativeFlowAlternative alt = null;
		SequenceFlow defaultFlow = null;
		SequenceFlowToUCFlow defaultFlowToInitFlow = null;
		SequenceFlow divergeFlow = null;
		SeqFlowToAltFlowAlt divergeFlowToAlt = null;
		SequenceFlowToUCFlow divergeFlowToFlow = null;
		FlowNodeToStep egwToStep = null;
		ExclusiveGateway exConvGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		AlternativeFlow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToStep inFlowToStep = null;
		Flow initFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		NormalStep normalStep = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		Step step = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep ecgwToStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge outFlowToInitFlow__source__outFlow = null;
		EMoflonEdge ecgwToStep__target__normalStep = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge outFlowToInitFlow__target__initFlow = null;
		EMoflonEdge ecgwToStep__source__exConvGateway = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __lane_flowNodeRefs_exConvGateway = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("defaultFlow"));

			// ensure correct type and really bound of object defaultFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			defaultFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("defaultFlowToInitFlow"));

			// ensure correct type and really bound of object defaultFlowToInitFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			defaultFlowToInitFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("divergeFlow"));

			// ensure correct type and really bound of object divergeFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			divergeFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("divergeFlowToAlt"));

			// ensure correct type and really bound of object divergeFlowToAlt
			JavaSDM.ensure(_TmpObject instanceof SeqFlowToAltFlowAlt);
			divergeFlowToAlt = (SeqFlowToAltFlowAlt) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("divergeFlowToFlow"));

			// ensure correct type and really bound of object divergeFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			divergeFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("egwToStep"));

			// ensure correct type and really bound of object egwToStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			egwToStep = (FlowNodeToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exConvGateway"));

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			flow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
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
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof Step);
			step = (Step) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects divergeFlow and defaultFlow 
			JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects divergeFlowToFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!divergeFlowToFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects step and normalStep 
			JavaSDM.ensure(!step.equals(normalStep));

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
			// create object ecgwToStep
			ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToInitFlow
			outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create link
			ecgwToStep.setTarget(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			outFlowToInitFlow.setTarget(initFlow);

			// create link
			ecgwToStep.setSource(exConvGateway);

			// create link
			outFlowToInitFlow.setSource(outFlow);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object ecgwToStep is really bound
			JavaSDM.ensure(ecgwToStep != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exConvGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ecgwToStep, "createdLinkElements");

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

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object defaultFlowToInitFlow is really bound
			JavaSDM.ensure(defaultFlowToInitFlow != null);
			// check object divergeFlow is really bound
			JavaSDM.ensure(divergeFlow != null);
			// check object divergeFlowToAlt is really bound
			JavaSDM.ensure(divergeFlowToAlt != null);
			// check object divergeFlowToFlow is really bound
			JavaSDM.ensure(divergeFlowToFlow != null);
			// check object ecgwToStep is really bound
			JavaSDM.ensure(ecgwToStep != null);
			// check object egwToStep is really bound
			JavaSDM.ensure(egwToStep != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToStep is really bound
			JavaSDM.ensure(inFlowToStep != null);
			// check object initFlow is really bound
			JavaSDM.ensure(initFlow != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check isomorphic binding between objects defaultFlow and alt 
			JavaSDM.ensure(!defaultFlow.equals(alt));

			// check isomorphic binding between objects defaultFlowToInitFlow and alt 
			JavaSDM.ensure(!defaultFlowToInitFlow.equals(alt));

			// check isomorphic binding between objects divergeFlow and alt 
			JavaSDM.ensure(!divergeFlow.equals(alt));

			// check isomorphic binding between objects divergeFlowToAlt and alt 
			JavaSDM.ensure(!divergeFlowToAlt.equals(alt));

			// check isomorphic binding between objects divergeFlowToFlow and alt 
			JavaSDM.ensure(!divergeFlowToFlow.equals(alt));

			// check isomorphic binding between objects ecgwToStep and alt 
			JavaSDM.ensure(!ecgwToStep.equals(alt));

			// check isomorphic binding between objects egwToStep and alt 
			JavaSDM.ensure(!egwToStep.equals(alt));

			// check isomorphic binding between objects exConvGateway and alt 
			JavaSDM.ensure(!exConvGateway.equals(alt));

			// check isomorphic binding between objects exclusiveGateway and alt 
			JavaSDM.ensure(!exclusiveGateway.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToStep and alt 
			JavaSDM.ensure(!inFlowToStep.equals(alt));

			// check isomorphic binding between objects initFlow and alt 
			JavaSDM.ensure(!initFlow.equals(alt));

			// check isomorphic binding between objects lane and alt 
			JavaSDM.ensure(!lane.equals(alt));

			// check isomorphic binding between objects laneSet and alt 
			JavaSDM.ensure(!laneSet.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToInitFlow and alt 
			JavaSDM.ensure(!outFlowToInitFlow.equals(alt));

			// check isomorphic binding between objects outFlowToNormalStep and alt 
			JavaSDM.ensure(!outFlowToNormalStep.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects defaultFlowToInitFlow and defaultFlow 
			JavaSDM.ensure(!defaultFlowToInitFlow.equals(defaultFlow));

			// check isomorphic binding between objects divergeFlow and defaultFlow 
			JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

			// check isomorphic binding between objects divergeFlowToAlt and defaultFlow 
			JavaSDM.ensure(!divergeFlowToAlt.equals(defaultFlow));

			// check isomorphic binding between objects divergeFlowToFlow and defaultFlow 
			JavaSDM.ensure(!divergeFlowToFlow.equals(defaultFlow));

			// check isomorphic binding between objects ecgwToStep and defaultFlow 
			JavaSDM.ensure(!ecgwToStep.equals(defaultFlow));

			// check isomorphic binding between objects egwToStep and defaultFlow 
			JavaSDM.ensure(!egwToStep.equals(defaultFlow));

			// check isomorphic binding between objects exConvGateway and defaultFlow 
			JavaSDM.ensure(!exConvGateway.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlow));

			// check isomorphic binding between objects flow and defaultFlow 
			JavaSDM.ensure(!flow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlowToStep and defaultFlow 
			JavaSDM.ensure(!inFlowToStep.equals(defaultFlow));

			// check isomorphic binding between objects initFlow and defaultFlow 
			JavaSDM.ensure(!initFlow.equals(defaultFlow));

			// check isomorphic binding between objects lane and defaultFlow 
			JavaSDM.ensure(!lane.equals(defaultFlow));

			// check isomorphic binding between objects laneSet and defaultFlow 
			JavaSDM.ensure(!laneSet.equals(defaultFlow));

			// check isomorphic binding between objects normalStep and defaultFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToInitFlow and defaultFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToNormalStep and defaultFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(defaultFlow));

			// check isomorphic binding between objects process and defaultFlow 
			JavaSDM.ensure(!process.equals(defaultFlow));

			// check isomorphic binding between objects step and defaultFlow 
			JavaSDM.ensure(!step.equals(defaultFlow));

			// check isomorphic binding between objects divergeFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!divergeFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects divergeFlowToAlt and defaultFlowToInitFlow 
			JavaSDM.ensure(!divergeFlowToAlt.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects divergeFlowToFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!divergeFlowToFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects ecgwToStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!ecgwToStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects egwToStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!egwToStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exConvGateway and defaultFlowToInitFlow 
			JavaSDM.ensure(!exConvGateway.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlowToInitFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects flow and defaultFlowToInitFlow 
			JavaSDM.ensure(!flow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects inFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects inFlowToStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!inFlowToStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects initFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!initFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects lane and defaultFlowToInitFlow 
			JavaSDM.ensure(!lane.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects laneSet and defaultFlowToInitFlow 
			JavaSDM.ensure(!laneSet.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects normalStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects outFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects outFlowToInitFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects outFlowToNormalStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects process and defaultFlowToInitFlow 
			JavaSDM.ensure(!process.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects step and defaultFlowToInitFlow 
			JavaSDM.ensure(!step.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects divergeFlowToAlt and divergeFlow 
			JavaSDM.ensure(!divergeFlowToAlt.equals(divergeFlow));

			// check isomorphic binding between objects divergeFlowToFlow and divergeFlow 
			JavaSDM.ensure(!divergeFlowToFlow.equals(divergeFlow));

			// check isomorphic binding between objects ecgwToStep and divergeFlow 
			JavaSDM.ensure(!ecgwToStep.equals(divergeFlow));

			// check isomorphic binding between objects egwToStep and divergeFlow 
			JavaSDM.ensure(!egwToStep.equals(divergeFlow));

			// check isomorphic binding between objects exConvGateway and divergeFlow 
			JavaSDM.ensure(!exConvGateway.equals(divergeFlow));

			// check isomorphic binding between objects exclusiveGateway and divergeFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(divergeFlow));

			// check isomorphic binding between objects flow and divergeFlow 
			JavaSDM.ensure(!flow.equals(divergeFlow));

			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects inFlowToStep and divergeFlow 
			JavaSDM.ensure(!inFlowToStep.equals(divergeFlow));

			// check isomorphic binding between objects initFlow and divergeFlow 
			JavaSDM.ensure(!initFlow.equals(divergeFlow));

			// check isomorphic binding between objects lane and divergeFlow 
			JavaSDM.ensure(!lane.equals(divergeFlow));

			// check isomorphic binding between objects laneSet and divergeFlow 
			JavaSDM.ensure(!laneSet.equals(divergeFlow));

			// check isomorphic binding between objects normalStep and divergeFlow 
			JavaSDM.ensure(!normalStep.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlowToNormalStep and divergeFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(divergeFlow));

			// check isomorphic binding between objects process and divergeFlow 
			JavaSDM.ensure(!process.equals(divergeFlow));

			// check isomorphic binding between objects step and divergeFlow 
			JavaSDM.ensure(!step.equals(divergeFlow));

			// check isomorphic binding between objects divergeFlowToFlow and divergeFlowToAlt 
			JavaSDM.ensure(!divergeFlowToFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects ecgwToStep and divergeFlowToAlt 
			JavaSDM.ensure(!ecgwToStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects egwToStep and divergeFlowToAlt 
			JavaSDM.ensure(!egwToStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects exConvGateway and divergeFlowToAlt 
			JavaSDM.ensure(!exConvGateway.equals(divergeFlowToAlt));

			// check isomorphic binding between objects exclusiveGateway and divergeFlowToAlt 
			JavaSDM.ensure(!exclusiveGateway.equals(divergeFlowToAlt));

			// check isomorphic binding between objects flow and divergeFlowToAlt 
			JavaSDM.ensure(!flow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects inFlow and divergeFlowToAlt 
			JavaSDM.ensure(!inFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects inFlowToStep and divergeFlowToAlt 
			JavaSDM.ensure(!inFlowToStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects initFlow and divergeFlowToAlt 
			JavaSDM.ensure(!initFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects lane and divergeFlowToAlt 
			JavaSDM.ensure(!lane.equals(divergeFlowToAlt));

			// check isomorphic binding between objects laneSet and divergeFlowToAlt 
			JavaSDM.ensure(!laneSet.equals(divergeFlowToAlt));

			// check isomorphic binding between objects normalStep and divergeFlowToAlt 
			JavaSDM.ensure(!normalStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects outFlow and divergeFlowToAlt 
			JavaSDM.ensure(!outFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlowToAlt 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlowToAlt));

			// check isomorphic binding between objects outFlowToNormalStep and divergeFlowToAlt 
			JavaSDM.ensure(!outFlowToNormalStep.equals(divergeFlowToAlt));

			// check isomorphic binding between objects process and divergeFlowToAlt 
			JavaSDM.ensure(!process.equals(divergeFlowToAlt));

			// check isomorphic binding between objects step and divergeFlowToAlt 
			JavaSDM.ensure(!step.equals(divergeFlowToAlt));

			// check isomorphic binding between objects ecgwToStep and divergeFlowToFlow 
			JavaSDM.ensure(!ecgwToStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects egwToStep and divergeFlowToFlow 
			JavaSDM.ensure(!egwToStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects exConvGateway and divergeFlowToFlow 
			JavaSDM.ensure(!exConvGateway.equals(divergeFlowToFlow));

			// check isomorphic binding between objects exclusiveGateway and divergeFlowToFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(divergeFlowToFlow));

			// check isomorphic binding between objects flow and divergeFlowToFlow 
			JavaSDM.ensure(!flow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects inFlow and divergeFlowToFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects inFlowToStep and divergeFlowToFlow 
			JavaSDM.ensure(!inFlowToStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects initFlow and divergeFlowToFlow 
			JavaSDM.ensure(!initFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects lane and divergeFlowToFlow 
			JavaSDM.ensure(!lane.equals(divergeFlowToFlow));

			// check isomorphic binding between objects laneSet and divergeFlowToFlow 
			JavaSDM.ensure(!laneSet.equals(divergeFlowToFlow));

			// check isomorphic binding between objects normalStep and divergeFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects outFlow and divergeFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and divergeFlowToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(divergeFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and divergeFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(divergeFlowToFlow));

			// check isomorphic binding between objects process and divergeFlowToFlow 
			JavaSDM.ensure(!process.equals(divergeFlowToFlow));

			// check isomorphic binding between objects step and divergeFlowToFlow 
			JavaSDM.ensure(!step.equals(divergeFlowToFlow));

			// check isomorphic binding between objects egwToStep and ecgwToStep 
			JavaSDM.ensure(!egwToStep.equals(ecgwToStep));

			// check isomorphic binding between objects exConvGateway and ecgwToStep 
			JavaSDM.ensure(!exConvGateway.equals(ecgwToStep));

			// check isomorphic binding between objects exclusiveGateway and ecgwToStep 
			JavaSDM.ensure(!exclusiveGateway.equals(ecgwToStep));

			// check isomorphic binding between objects flow and ecgwToStep 
			JavaSDM.ensure(!flow.equals(ecgwToStep));

			// check isomorphic binding between objects inFlow and ecgwToStep 
			JavaSDM.ensure(!inFlow.equals(ecgwToStep));

			// check isomorphic binding between objects inFlowToStep and ecgwToStep 
			JavaSDM.ensure(!inFlowToStep.equals(ecgwToStep));

			// check isomorphic binding between objects initFlow and ecgwToStep 
			JavaSDM.ensure(!initFlow.equals(ecgwToStep));

			// check isomorphic binding between objects lane and ecgwToStep 
			JavaSDM.ensure(!lane.equals(ecgwToStep));

			// check isomorphic binding between objects laneSet and ecgwToStep 
			JavaSDM.ensure(!laneSet.equals(ecgwToStep));

			// check isomorphic binding between objects normalStep and ecgwToStep 
			JavaSDM.ensure(!normalStep.equals(ecgwToStep));

			// check isomorphic binding between objects outFlow and ecgwToStep 
			JavaSDM.ensure(!outFlow.equals(ecgwToStep));

			// check isomorphic binding between objects outFlowToInitFlow and ecgwToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(ecgwToStep));

			// check isomorphic binding between objects outFlowToNormalStep and ecgwToStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(ecgwToStep));

			// check isomorphic binding between objects process and ecgwToStep 
			JavaSDM.ensure(!process.equals(ecgwToStep));

			// check isomorphic binding between objects step and ecgwToStep 
			JavaSDM.ensure(!step.equals(ecgwToStep));

			// check isomorphic binding between objects exConvGateway and egwToStep 
			JavaSDM.ensure(!exConvGateway.equals(egwToStep));

			// check isomorphic binding between objects exclusiveGateway and egwToStep 
			JavaSDM.ensure(!exclusiveGateway.equals(egwToStep));

			// check isomorphic binding between objects flow and egwToStep 
			JavaSDM.ensure(!flow.equals(egwToStep));

			// check isomorphic binding between objects inFlow and egwToStep 
			JavaSDM.ensure(!inFlow.equals(egwToStep));

			// check isomorphic binding between objects inFlowToStep and egwToStep 
			JavaSDM.ensure(!inFlowToStep.equals(egwToStep));

			// check isomorphic binding between objects initFlow and egwToStep 
			JavaSDM.ensure(!initFlow.equals(egwToStep));

			// check isomorphic binding between objects lane and egwToStep 
			JavaSDM.ensure(!lane.equals(egwToStep));

			// check isomorphic binding between objects laneSet and egwToStep 
			JavaSDM.ensure(!laneSet.equals(egwToStep));

			// check isomorphic binding between objects normalStep and egwToStep 
			JavaSDM.ensure(!normalStep.equals(egwToStep));

			// check isomorphic binding between objects outFlow and egwToStep 
			JavaSDM.ensure(!outFlow.equals(egwToStep));

			// check isomorphic binding between objects outFlowToInitFlow and egwToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(egwToStep));

			// check isomorphic binding between objects outFlowToNormalStep and egwToStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(egwToStep));

			// check isomorphic binding between objects process and egwToStep 
			JavaSDM.ensure(!process.equals(egwToStep));

			// check isomorphic binding between objects step and egwToStep 
			JavaSDM.ensure(!step.equals(egwToStep));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

			// check isomorphic binding between objects flow and exConvGateway 
			JavaSDM.ensure(!flow.equals(exConvGateway));

			// check isomorphic binding between objects inFlow and exConvGateway 
			JavaSDM.ensure(!inFlow.equals(exConvGateway));

			// check isomorphic binding between objects inFlowToStep and exConvGateway 
			JavaSDM.ensure(!inFlowToStep.equals(exConvGateway));

			// check isomorphic binding between objects initFlow and exConvGateway 
			JavaSDM.ensure(!initFlow.equals(exConvGateway));

			// check isomorphic binding between objects lane and exConvGateway 
			JavaSDM.ensure(!lane.equals(exConvGateway));

			// check isomorphic binding between objects laneSet and exConvGateway 
			JavaSDM.ensure(!laneSet.equals(exConvGateway));

			// check isomorphic binding between objects normalStep and exConvGateway 
			JavaSDM.ensure(!normalStep.equals(exConvGateway));

			// check isomorphic binding between objects outFlow and exConvGateway 
			JavaSDM.ensure(!outFlow.equals(exConvGateway));

			// check isomorphic binding between objects outFlowToInitFlow and exConvGateway 
			JavaSDM.ensure(!outFlowToInitFlow.equals(exConvGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exConvGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exConvGateway));

			// check isomorphic binding between objects process and exConvGateway 
			JavaSDM.ensure(!process.equals(exConvGateway));

			// check isomorphic binding between objects step and exConvGateway 
			JavaSDM.ensure(!step.equals(exConvGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToStep and exclusiveGateway 
			JavaSDM.ensure(!inFlowToStep.equals(exclusiveGateway));

			// check isomorphic binding between objects initFlow and exclusiveGateway 
			JavaSDM.ensure(!initFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects lane and exclusiveGateway 
			JavaSDM.ensure(!lane.equals(exclusiveGateway));

			// check isomorphic binding between objects laneSet and exclusiveGateway 
			JavaSDM.ensure(!laneSet.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToInitFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToInitFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects step and exclusiveGateway 
			JavaSDM.ensure(!step.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToStep and flow 
			JavaSDM.ensure(!inFlowToStep.equals(flow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects lane and flow 
			JavaSDM.ensure(!lane.equals(flow));

			// check isomorphic binding between objects laneSet and flow 
			JavaSDM.ensure(!laneSet.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToInitFlow and flow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects inFlowToStep and inFlow 
			JavaSDM.ensure(!inFlowToStep.equals(inFlow));

			// check isomorphic binding between objects initFlow and inFlow 
			JavaSDM.ensure(!initFlow.equals(inFlow));

			// check isomorphic binding between objects lane and inFlow 
			JavaSDM.ensure(!lane.equals(inFlow));

			// check isomorphic binding between objects laneSet and inFlow 
			JavaSDM.ensure(!laneSet.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects step and inFlow 
			JavaSDM.ensure(!step.equals(inFlow));

			// check isomorphic binding between objects initFlow and inFlowToStep 
			JavaSDM.ensure(!initFlow.equals(inFlowToStep));

			// check isomorphic binding between objects lane and inFlowToStep 
			JavaSDM.ensure(!lane.equals(inFlowToStep));

			// check isomorphic binding between objects laneSet and inFlowToStep 
			JavaSDM.ensure(!laneSet.equals(inFlowToStep));

			// check isomorphic binding between objects normalStep and inFlowToStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToStep));

			// check isomorphic binding between objects outFlow and inFlowToStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToStep));

			// check isomorphic binding between objects process and inFlowToStep 
			JavaSDM.ensure(!process.equals(inFlowToStep));

			// check isomorphic binding between objects step and inFlowToStep 
			JavaSDM.ensure(!step.equals(inFlowToStep));

			// check isomorphic binding between objects lane and initFlow 
			JavaSDM.ensure(!lane.equals(initFlow));

			// check isomorphic binding between objects laneSet and initFlow 
			JavaSDM.ensure(!laneSet.equals(initFlow));

			// check isomorphic binding between objects normalStep and initFlow 
			JavaSDM.ensure(!normalStep.equals(initFlow));

			// check isomorphic binding between objects outFlow and initFlow 
			JavaSDM.ensure(!outFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToInitFlow and initFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToNormalStep and initFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(initFlow));

			// check isomorphic binding between objects process and initFlow 
			JavaSDM.ensure(!process.equals(initFlow));

			// check isomorphic binding between objects step and initFlow 
			JavaSDM.ensure(!step.equals(initFlow));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects normalStep and lane 
			JavaSDM.ensure(!normalStep.equals(lane));

			// check isomorphic binding between objects outFlow and lane 
			JavaSDM.ensure(!outFlow.equals(lane));

			// check isomorphic binding between objects outFlowToInitFlow and lane 
			JavaSDM.ensure(!outFlowToInitFlow.equals(lane));

			// check isomorphic binding between objects outFlowToNormalStep and lane 
			JavaSDM.ensure(!outFlowToNormalStep.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects step and lane 
			JavaSDM.ensure(!step.equals(lane));

			// check isomorphic binding between objects normalStep and laneSet 
			JavaSDM.ensure(!normalStep.equals(laneSet));

			// check isomorphic binding between objects outFlow and laneSet 
			JavaSDM.ensure(!outFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToInitFlow and laneSet 
			JavaSDM.ensure(!outFlowToInitFlow.equals(laneSet));

			// check isomorphic binding between objects outFlowToNormalStep and laneSet 
			JavaSDM.ensure(!outFlowToNormalStep.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects step and laneSet 
			JavaSDM.ensure(!step.equals(laneSet));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToInitFlow and normalStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects step and normalStep 
			JavaSDM.ensure(!step.equals(normalStep));

			// check isomorphic binding between objects outFlowToInitFlow and outFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects step and outFlow 
			JavaSDM.ensure(!step.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToInitFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToInitFlow 
			JavaSDM.ensure(!process.equals(outFlowToInitFlow));

			// check isomorphic binding between objects step and outFlowToInitFlow 
			JavaSDM.ensure(!step.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects step and outFlowToNormalStep 
			JavaSDM.ensure(!step.equals(outFlowToNormalStep));

			// check isomorphic binding between objects step and process 
			JavaSDM.ensure(!step.equals(process));

			// create object __exConvGateway_incoming_inFlow
			__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_exConvGateway
			__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_exConvGateway
			__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ecgwToStep__target__normalStep
			ecgwToStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ecgwToStep__source__exConvGateway
			ecgwToStep__source__exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exConvGateway_outgoing_outFlow
			__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __lane_flowNodeRefs_exConvGateway
			__lane_flowNodeRefs_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_exConvGateway
			__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExcConvGwAfterExDivGwRule");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __process_flowElements_exConvGateway
			__process_flowElements_exConvGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_exConvGateway
			__inFlow_targetRef_exConvGateway.setName("targetRef");
			// assign attribute __exConvGateway_incoming_inFlow
			__exConvGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_exConvGateway
			__outFlow_sourceRef_exConvGateway.setName("sourceRef");
			// assign attribute __exConvGateway_outgoing_outFlow
			__exConvGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute ecgwToStep__source__exConvGateway
			ecgwToStep__source__exConvGateway.setName("source");
			// assign attribute ecgwToStep__target__normalStep
			ecgwToStep__target__normalStep.setName("target");
			// assign attribute outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow.setName("source");
			// assign attribute outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __lane_flowNodeRefs_exConvGateway
			__lane_flowNodeRefs_exConvGateway.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exConvGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ecgwToStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__target__initFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					ecgwToStep__source__exConvGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exConvGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exConvGateway, "translatedEdges");

			// create link
			__exConvGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_exConvGateway.setSrc(inFlow);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__process_flowElements_exConvGateway.setSrc(process);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			ecgwToStep__target__normalStep.setTrg(normalStep);

			// create link
			outFlowToInitFlow__target__initFlow.setTrg(initFlow);

			// create link
			__exConvGateway_outgoing_outFlow.setSrc(exConvGateway);

			// create link
			__process_flowElements_exConvGateway.setTrg(exConvGateway);

			// create link
			__lane_flowNodeRefs_exConvGateway.setTrg(exConvGateway);

			// create link
			__outFlow_sourceRef_exConvGateway.setTrg(exConvGateway);

			// create link
			__exConvGateway_incoming_inFlow.setSrc(exConvGateway);

			// create link
			ecgwToStep__source__exConvGateway.setTrg(exConvGateway);

			// create link
			__inFlow_targetRef_exConvGateway.setTrg(exConvGateway);

			// create link
			outFlowToInitFlow__source__outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_exConvGateway.setSrc(outFlow);

			// create link
			__exConvGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			ecgwToStep__target__normalStep.setSrc(ecgwToStep);

			// create link
			ecgwToStep__source__exConvGateway.setSrc(ecgwToStep);

			// create link
			outFlowToInitFlow__target__initFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			__lane_flowNodeRefs_exConvGateway.setSrc(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, inFlow, step, inFlowToStep,
				process, defaultFlow, exclusiveGateway, divergeFlow,
				normalStep, alt, initFlow, defaultFlowToInitFlow, egwToStep,
				divergeFlowToAlt, flow, divergeFlowToFlow, exConvGateway,
				outFlow, ecgwToStep, outFlowToInitFlow, outFlowToNormalStep,
				lane, laneSet);
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
		SequenceFlow divergeFlow = null;
		ExclusiveGateway exConvGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow inFlow = null;
		Lane lane = null;
		LaneSet laneSet = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		Step nextStep = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToStep_source_inFlow = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __inFlowToStep_target_step = null;
		EMoflonEdge __process_flowElements_divergeFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __process_flowElements_defaultFlow = null;
		EMoflonEdge __defaultFlowToInitFlow_source_defaultFlow = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __egwToStep_source_exclusiveGateway = null;
		EMoflonEdge __divergeFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_divergeFlow = null;
		EMoflonEdge __divergeFlowToAlt_source_divergeFlow = null;
		EMoflonEdge __divergeFlowToFlow_source_divergeFlow = null;
		EMoflonEdge __egwToStep_target_normalStep = null;
		EMoflonEdge __divergeFlowToAlt_target_alt = null;
		EMoflonEdge __defaultFlowToInitFlow_target_initFlow = null;
		EMoflonEdge __divergeFlowToFlow_target_flow = null;
		EMoflonEdge __lane_flowNodeRefs_exConvGateway = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		CSP csp = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterExclusiveGatewayToEgwToStep = null;
		FlowNodeToStep egwToStep = null;
		AlternativeFlow flow = null;
		Iterator fujaba__IterDivergeFlowToDivergeFlowToFlow = null;
		SequenceFlowToUCFlow divergeFlowToFlow = null;
		AlternativeFlowAlternative alt = null;
		Iterator fujaba__IterDivergeFlowToDivergeFlowToAlt = null;
		SeqFlowToAltFlowAlt divergeFlowToAlt = null;
		Flow initFlow = null;
		Iterator fujaba__IterDefaultFlowToDefaultFlowToInitFlow = null;
		SequenceFlowToUCFlow defaultFlowToInitFlow = null;

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
			ruleresult.setRule("ExcConvGwAfterExDivGwRule");

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
			_TmpObject = (match.getObject("divergeFlow"));

			// ensure correct type and really bound of object divergeFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			divergeFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("exConvGateway"));

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;
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
			// check isomorphic binding between objects divergeFlow and defaultFlow 
			JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and divergeFlow 
			JavaSDM.ensure(!inFlow.equals(divergeFlow));

			// check isomorphic binding between objects outFlow and divergeFlow 
			JavaSDM.ensure(!outFlow.equals(divergeFlow));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// iterate to-many link source from defaultFlow to defaultFlowToInitFlow
			fujaba__Success = false;

			fujaba__IterDefaultFlowToDefaultFlowToInitFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							defaultFlow, SequenceFlowToUCFlow.class, "source"))
					.iterator();

			while (fujaba__IterDefaultFlowToDefaultFlowToInitFlow.hasNext()) {
				try {
					defaultFlowToInitFlow = (SequenceFlowToUCFlow) fujaba__IterDefaultFlowToDefaultFlowToInitFlow
							.next();

					// check object defaultFlowToInitFlow is really bound
					JavaSDM.ensure(defaultFlowToInitFlow != null);
					// bind object
					initFlow = defaultFlowToInitFlow.getTarget();

					// check object initFlow is really bound
					JavaSDM.ensure(initFlow != null);

					// iterate to-many link source from divergeFlow to divergeFlowToAlt
					fujaba__Success = false;

					fujaba__IterDivergeFlowToDivergeFlowToAlt = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(divergeFlow,
											SeqFlowToAltFlowAlt.class, "source"))
							.iterator();

					while (fujaba__IterDivergeFlowToDivergeFlowToAlt.hasNext()) {
						try {
							divergeFlowToAlt = (SeqFlowToAltFlowAlt) fujaba__IterDivergeFlowToDivergeFlowToAlt
									.next();

							// check object divergeFlowToAlt is really bound
							JavaSDM.ensure(divergeFlowToAlt != null);
							// bind object
							alt = divergeFlowToAlt.getTarget();

							// check object alt is really bound
							JavaSDM.ensure(alt != null);

							// iterate to-many link source from divergeFlow to divergeFlowToFlow
							fujaba__Success = false;

							fujaba__IterDivergeFlowToDivergeFlowToFlow = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(divergeFlow,
													SequenceFlowToUCFlow.class,
													"source")).iterator();

							while (fujaba__IterDivergeFlowToDivergeFlowToFlow
									.hasNext()) {
								try {
									divergeFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterDivergeFlowToDivergeFlowToFlow
											.next();

									// check object divergeFlowToFlow is really bound
									JavaSDM.ensure(divergeFlowToFlow != null);
									// check isomorphic binding between objects divergeFlowToFlow and defaultFlowToInitFlow 
									JavaSDM.ensure(!divergeFlowToFlow
											.equals(defaultFlowToInitFlow));

									// bind object
									_TmpObject = divergeFlowToFlow.getTarget();

									// ensure correct type and really bound of object flow
									JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
									flow = (AlternativeFlow) _TmpObject;

									// check isomorphic binding between objects initFlow and flow 
									JavaSDM.ensure(!initFlow.equals(flow));

									// iterate to-many link source from exclusiveGateway to egwToStep
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayToEgwToStep = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															exclusiveGateway,
															FlowNodeToStep.class,
															"source"))
											.iterator();

									while (fujaba__IterExclusiveGatewayToEgwToStep
											.hasNext()) {
										try {
											egwToStep = (FlowNodeToStep) fujaba__IterExclusiveGatewayToEgwToStep
													.next();

											// check object egwToStep is really bound
											JavaSDM.ensure(egwToStep != null);
											// bind object
											_TmpObject = egwToStep.getTarget();

											// ensure correct type and really bound of object normalStep
											JavaSDM.ensure(_TmpObject instanceof NormalStep);
											normalStep = (NormalStep) _TmpObject;

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

													// check isomorphic binding between objects step and normalStep 
													JavaSDM.ensure(!step
															.equals(normalStep));

													// story node 'find context'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															nextStep = step
																	.getNext();

															// check object nextStep is really bound
															JavaSDM.ensure(nextStep != null);

															// check isomorphic binding between objects nextStep and normalStep 
															JavaSDM.ensure(!nextStep
																	.equals(normalStep));

															// check isomorphic binding between objects nextStep and step 
															JavaSDM.ensure(!nextStep
																	.equals(step));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check object alt is really bound
														JavaSDM.ensure(alt != null);
														// check object defaultFlow is really bound
														JavaSDM.ensure(defaultFlow != null);
														// check object defaultFlowToInitFlow is really bound
														JavaSDM.ensure(defaultFlowToInitFlow != null);
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object divergeFlowToAlt is really bound
														JavaSDM.ensure(divergeFlowToAlt != null);
														// check object divergeFlowToFlow is really bound
														JavaSDM.ensure(divergeFlowToFlow != null);
														// check object egwToStep is really bound
														JavaSDM.ensure(egwToStep != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
														// check object exclusiveGateway is really bound
														JavaSDM.ensure(exclusiveGateway != null);
														// check object flow is really bound
														JavaSDM.ensure(flow != null);
														// check object inFlow is really bound
														JavaSDM.ensure(inFlow != null);
														// check object inFlowToStep is really bound
														JavaSDM.ensure(inFlowToStep != null);
														// check object initFlow is really bound
														JavaSDM.ensure(initFlow != null);
														// check object lane is really bound
														JavaSDM.ensure(lane != null);
														// check object laneSet is really bound
														JavaSDM.ensure(laneSet != null);
														// check object normalStep is really bound
														JavaSDM.ensure(normalStep != null);
														// check object outFlow is really bound
														JavaSDM.ensure(outFlow != null);
														// check object process is really bound
														JavaSDM.ensure(process != null);
														// check object step is really bound
														JavaSDM.ensure(step != null);
														// check isomorphic binding between objects divergeFlow and defaultFlow 
														JavaSDM.ensure(!divergeFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and defaultFlow 
														JavaSDM.ensure(!inFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects outFlow and defaultFlow 
														JavaSDM.ensure(!outFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects divergeFlowToFlow and defaultFlowToInitFlow 
														JavaSDM.ensure(!divergeFlowToFlow
																.equals(defaultFlowToInitFlow));

														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects exclusiveGateway and exConvGateway 
														JavaSDM.ensure(!exclusiveGateway
																.equals(exConvGateway));

														// check isomorphic binding between objects initFlow and flow 
														JavaSDM.ensure(!initFlow
																.equals(flow));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check isomorphic binding between objects step and normalStep 
														JavaSDM.ensure(!step
																.equals(normalStep));

														// check link default from exclusiveGateway to defaultFlow
														JavaSDM.ensure(defaultFlow
																.equals(exclusiveGateway
																		.getDefault()));

														// check link flowElements from defaultFlow to process
														JavaSDM.ensure(process
																.equals(defaultFlow
																		.eContainer()));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from exclusiveGateway to process
														JavaSDM.ensure(process
																.equals(exclusiveGateway
																		.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link incoming from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to exclusiveGateway
														JavaSDM.ensure(exclusiveGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link source from defaultFlowToInitFlow to defaultFlow
														JavaSDM.ensure(defaultFlow
																.equals(defaultFlowToInitFlow
																		.getSource()));

														// check link source from divergeFlowToAlt to divergeFlow
														JavaSDM.ensure(divergeFlow
																.equals(divergeFlowToAlt
																		.getSource()));

														// check link source from divergeFlowToFlow to divergeFlow
														JavaSDM.ensure(divergeFlow
																.equals(divergeFlowToFlow
																		.getSource()));

														// check link source from egwToStep to exclusiveGateway
														JavaSDM.ensure(exclusiveGateway
																.equals(egwToStep
																		.getSource()));

														// check link source from inFlowToStep to inFlow
														JavaSDM.ensure(inFlow
																.equals(inFlowToStep
																		.getSource()));

														// check link steps from step to flow
														JavaSDM.ensure(flow.equals(step
																.eContainer()));

														// check link target from defaultFlowToInitFlow to initFlow
														JavaSDM.ensure(initFlow
																.equals(defaultFlowToInitFlow
																		.getTarget()));

														// check link target from divergeFlowToAlt to alt
														JavaSDM.ensure(alt
																.equals(divergeFlowToAlt
																		.getTarget()));

														// check link target from divergeFlowToFlow to flow
														JavaSDM.ensure(flow
																.equals(divergeFlowToFlow
																		.getTarget()));

														// check link target from egwToStep to normalStep
														JavaSDM.ensure(normalStep
																.equals(egwToStep
																		.getTarget()));

														// check link target from inFlowToStep to step
														JavaSDM.ensure(step
																.equals(inFlowToStep
																		.getTarget()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

														// create object __inFlow_targetRef_exConvGateway
														__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object isApplicableMatch
														isApplicableMatch = TGGRuntimeFactory.eINSTANCE
																.createIsApplicableMatch();

														// create object __inFlowToStep_source_inFlow
														__inFlowToStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exConvGateway_incoming_inFlow
														__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __flow_steps_step
														__flow_steps_step = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToStep_target_step
														__inFlowToStep_target_step = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_divergeFlow
														__process_flowElements_divergeFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_exclusiveGateway
														__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_exConvGateway
														__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_outFlow
														__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_laneSets_laneSet
														__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_defaultFlow
														__process_flowElements_defaultFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __defaultFlowToInitFlow_source_defaultFlow
														__defaultFlowToInitFlow_source_defaultFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exclusiveGateway_default_defaultFlow
														__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __egwToStep_source_exclusiveGateway
														__egwToStep_source_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __divergeFlow_sourceRef_exclusiveGateway
														__divergeFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exclusiveGateway_outgoing_divergeFlow
														__exclusiveGateway_outgoing_divergeFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __divergeFlowToAlt_source_divergeFlow
														__divergeFlowToAlt_source_divergeFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __divergeFlowToFlow_source_divergeFlow
														__divergeFlowToFlow_source_divergeFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __egwToStep_target_normalStep
														__egwToStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __divergeFlowToAlt_target_alt
														__divergeFlowToAlt_target_alt = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __defaultFlowToInitFlow_target_initFlow
														__defaultFlowToInitFlow_target_initFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __divergeFlowToFlow_target_flow
														__divergeFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __lane_flowNodeRefs_exConvGateway
														__lane_flowNodeRefs_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __outFlow_sourceRef_exConvGateway
														__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exConvGateway_outgoing_outFlow
														__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __laneSet_lanes_lane
														__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// assign attribute __inFlowToStep_source_inFlow
														__inFlowToStep_source_inFlow
																.setName("source");
														// assign attribute __inFlowToStep_target_step
														__inFlowToStep_target_step
																.setName("target");
														// assign attribute __process_flowElements_exclusiveGateway
														__process_flowElements_exclusiveGateway
																.setName("flowElements");
														// assign attribute __process_flowElements_divergeFlow
														__process_flowElements_divergeFlow
																.setName("flowElements");
														// assign attribute __process_flowElements_defaultFlow
														__process_flowElements_defaultFlow
																.setName("flowElements");
														// assign attribute __exclusiveGateway_default_defaultFlow
														__exclusiveGateway_default_defaultFlow
																.setName("default");
														// assign attribute __divergeFlow_sourceRef_exclusiveGateway
														__divergeFlow_sourceRef_exclusiveGateway
																.setName("sourceRef");
														// assign attribute __exclusiveGateway_outgoing_divergeFlow
														__exclusiveGateway_outgoing_divergeFlow
																.setName("outgoing");
														// assign attribute __defaultFlowToInitFlow_source_defaultFlow
														__defaultFlowToInitFlow_source_defaultFlow
																.setName("source");
														// assign attribute __defaultFlowToInitFlow_target_initFlow
														__defaultFlowToInitFlow_target_initFlow
																.setName("target");
														// assign attribute __egwToStep_source_exclusiveGateway
														__egwToStep_source_exclusiveGateway
																.setName("source");
														// assign attribute __egwToStep_target_normalStep
														__egwToStep_target_normalStep
																.setName("target");
														// assign attribute __divergeFlowToAlt_source_divergeFlow
														__divergeFlowToAlt_source_divergeFlow
																.setName("source");
														// assign attribute __divergeFlowToAlt_target_alt
														__divergeFlowToAlt_target_alt
																.setName("target");
														// assign attribute __flow_steps_step
														__flow_steps_step
																.setName("steps");
														// assign attribute __divergeFlowToFlow_source_divergeFlow
														__divergeFlowToFlow_source_divergeFlow
																.setName("source");
														// assign attribute __divergeFlowToFlow_target_flow
														__divergeFlowToFlow_target_flow
																.setName("target");
														// assign attribute __process_flowElements_outFlow
														__process_flowElements_outFlow
																.setName("flowElements");
														// assign attribute __process_laneSets_laneSet
														__process_laneSets_laneSet
																.setName("laneSets");
														// assign attribute __process_flowElements_exConvGateway
														__process_flowElements_exConvGateway
																.setName("flowElements");
														// assign attribute __inFlow_targetRef_exConvGateway
														__inFlow_targetRef_exConvGateway
																.setName("targetRef");
														// assign attribute __exConvGateway_incoming_inFlow
														__exConvGateway_incoming_inFlow
																.setName("incoming");
														// assign attribute __outFlow_sourceRef_exConvGateway
														__outFlow_sourceRef_exConvGateway
																.setName("sourceRef");
														// assign attribute __exConvGateway_outgoing_outFlow
														__exConvGateway_outgoing_outFlow
																.setName("outgoing");
														// assign attribute __lane_flowNodeRefs_exConvGateway
														__lane_flowNodeRefs_exConvGateway
																.setName("flowNodeRefs");
														// assign attribute __laneSet_lanes_lane
														__laneSet_lanes_lane
																.setName("lanes");

														// create link
														__inFlow_targetRef_exConvGateway
																.setSrc(inFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlow);

														// create link
														__inFlowToStep_source_inFlow
																.setTrg(inFlow);

														// create link
														__exConvGateway_incoming_inFlow
																.setTrg(inFlow);

														// create link
														__flow_steps_step
																.setTrg(step);

														// create link
														__inFlowToStep_target_step
																.setTrg(step);

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
														__process_flowElements_divergeFlow
																.setSrc(process);

														// create link
														__process_flowElements_exclusiveGateway
																.setSrc(process);

														// create link
														__process_flowElements_exConvGateway
																.setSrc(process);

														// create link
														__process_flowElements_outFlow
																.setSrc(process);

														// create link
														__process_laneSets_laneSet
																.setSrc(process);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(process);

														// create link
														__process_flowElements_defaultFlow
																.setSrc(process);

														// create link
														__process_flowElements_defaultFlow
																.setTrg(defaultFlow);

														// create link
														__defaultFlowToInitFlow_source_defaultFlow
																.setTrg(defaultFlow);

														// create link
														__exclusiveGateway_default_defaultFlow
																.setTrg(defaultFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(defaultFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(exclusiveGateway);

														// create link
														__egwToStep_source_exclusiveGateway
																.setTrg(exclusiveGateway);

														// create link
														__process_flowElements_exclusiveGateway
																.setTrg(exclusiveGateway);

														// create link
														__divergeFlow_sourceRef_exclusiveGateway
																.setTrg(exclusiveGateway);

														// create link
														__exclusiveGateway_outgoing_divergeFlow
																.setSrc(exclusiveGateway);

														// create link
														__exclusiveGateway_default_defaultFlow
																.setSrc(exclusiveGateway);

														// create link
														__process_flowElements_divergeFlow
																.setTrg(divergeFlow);

														// create link
														__divergeFlowToAlt_source_divergeFlow
																.setTrg(divergeFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(divergeFlow);

														// create link
														__divergeFlowToFlow_source_divergeFlow
																.setTrg(divergeFlow);

														// create link
														__exclusiveGateway_outgoing_divergeFlow
																.setTrg(divergeFlow);

														// create link
														__divergeFlow_sourceRef_exclusiveGateway
																.setSrc(divergeFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(normalStep);

														// create link
														__egwToStep_target_normalStep
																.setTrg(normalStep);

														// create link
														__divergeFlowToAlt_target_alt
																.setTrg(alt);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(alt);

														// create link
														__defaultFlowToInitFlow_target_initFlow
																.setTrg(initFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(initFlow);

														// create link
														__defaultFlowToInitFlow_source_defaultFlow
																.setSrc(defaultFlowToInitFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(defaultFlowToInitFlow);

														// create link
														__defaultFlowToInitFlow_target_initFlow
																.setSrc(defaultFlowToInitFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(egwToStep);

														// create link
														__egwToStep_source_exclusiveGateway
																.setSrc(egwToStep);

														// create link
														__egwToStep_target_normalStep
																.setSrc(egwToStep);

														// create link
														__divergeFlowToAlt_source_divergeFlow
																.setSrc(divergeFlowToAlt);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(divergeFlowToAlt);

														// create link
														__divergeFlowToAlt_target_alt
																.setSrc(divergeFlowToAlt);

														// create link
														__flow_steps_step
																.setSrc(flow);

														// create link
														__divergeFlowToFlow_target_flow
																.setTrg(flow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(flow);

														// create link
														__divergeFlowToFlow_source_divergeFlow
																.setSrc(divergeFlowToFlow);

														// create link
														__divergeFlowToFlow_target_flow
																.setSrc(divergeFlowToFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(divergeFlowToFlow);

														// create link
														__lane_flowNodeRefs_exConvGateway
																.setTrg(exConvGateway);

														// create link
														__inFlow_targetRef_exConvGateway
																.setTrg(exConvGateway);

														// create link
														__outFlow_sourceRef_exConvGateway
																.setTrg(exConvGateway);

														// create link
														__exConvGateway_outgoing_outFlow
																.setSrc(exConvGateway);

														// create link
														__exConvGateway_incoming_inFlow
																.setSrc(exConvGateway);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(exConvGateway);

														// create link
														__process_flowElements_exConvGateway
																.setTrg(exConvGateway);

														// create link
														__process_flowElements_outFlow
																.setTrg(outFlow);

														// create link
														__outFlow_sourceRef_exConvGateway
																.setSrc(outFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(outFlow);

														// create link
														__exConvGateway_outgoing_outFlow
																.setTrg(outFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(lane);

														// create link
														__laneSet_lanes_lane
																.setTrg(lane);

														// create link
														__lane_flowNodeRefs_exConvGateway
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
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__egwToStep_source_exclusiveGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__defaultFlowToInitFlow_source_defaultFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__divergeFlowToAlt_source_divergeFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exclusiveGateway_outgoing_divergeFlow,
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
																		__egwToStep_target_normalStep,
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
																		__inFlow_targetRef_exConvGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__divergeFlow_sourceRef_exclusiveGateway,
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
																		__defaultFlowToInitFlow_target_initFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__divergeFlowToAlt_target_alt,
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
																		__inFlowToStep_target_step,
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
																		__lane_flowNodeRefs_exConvGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exConvGateway_incoming_inFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exConvGateway_outgoing_outFlow,
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
																		__process_flowElements_exConvGateway,
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
																		__outFlow_sourceRef_exConvGateway,
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
																		__process_laneSets_laneSet,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__process_flowElements_defaultFlow,
																		"allContextElements");
														// story node 'solve CSP'
														try {
															fujaba__Success = false;

															_TmpObject = (this
																	.isApplicable_solveCsp_FWD(
																			isApplicableMatch,
																			inFlow,
																			step,
																			inFlowToStep,
																			process,
																			defaultFlow,
																			exclusiveGateway,
																			divergeFlow,
																			normalStep,
																			alt,
																			initFlow,
																			defaultFlowToInitFlow,
																			egwToStep,
																			divergeFlowToAlt,
																			flow,
																			divergeFlowToFlow,
																			exConvGateway,
																			outFlow,
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
																		.setRuleName("ExcConvGwAfterExDivGwRule");

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
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("defaultFlow", defaultFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("divergeFlow", divergeFlow);
		match.registerObject("exConvGateway", exConvGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Converging");
		literal1.setType("String");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("EObject");
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", true, csp);
		var_exConvGateway_gatewayDirection.setValue(exConvGateway
				.getGatewayDirection());
		var_exConvGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0
				.solve(var_exConvGateway_gatewayDirection, literal1);
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
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
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
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
		isApplicableMatch.registerObject("egwToStep", egwToStep);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
		isApplicableMatch.registerObject("exConvGateway", exConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
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
			EObject inFlow, EObject step, EObject inFlowToStep,
			EObject process, EObject defaultFlow, EObject exclusiveGateway,
			EObject divergeFlow, EObject normalStep, EObject alt,
			EObject initFlow, EObject defaultFlowToInitFlow, EObject egwToStep,
			EObject divergeFlowToAlt, EObject flow, EObject divergeFlowToFlow,
			EObject exConvGateway, EObject outFlow, EObject ecgwToStep,
			EObject outFlowToInitFlow, EObject outFlowToNormalStep,
			EObject lane, EObject laneSet) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
		ruleresult.registerObject("egwToStep", egwToStep);
		ruleresult.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("divergeFlowToFlow", divergeFlowToFlow);
		ruleresult.registerObject("exConvGateway", exConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
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
				&& match.getObject("exConvGateway")
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_118(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_186239 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_944194 = null;
		SequenceFlow __DEC_exConvGateway_default_271447 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_805120 = null;
		ExclusiveGateway __DEC_outFlow_default_805120 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_753053 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_753053 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;
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
			_TmpObject = outFlow.getSourceRef();

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link incoming from exConvGateway to inFlow
					fujaba__Success = false;

					fujaba__IterExConvGatewayToInFlow = new ArrayList(
							exConvGateway.getIncoming()).iterator();

					while (fujaba__IterExConvGatewayToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// bind object
							_TmpObject = _edge_flowElements.getSrc();

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
							process = (bpmn2.Process) _TmpObject;

							// check link flowElements from exConvGateway to process
							JavaSDM.ensure(process.equals(exConvGateway
									.eContainer()));

							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// iterate to-many link flowElements from process to defaultFlow
							fujaba__Success = false;

							fujaba__IterProcessToDefaultFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToDefaultFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToDefaultFlow
											.next();

									// ensure correct type and really bound of object defaultFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									defaultFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects inFlow and defaultFlow 
									JavaSDM.ensure(!inFlow.equals(defaultFlow));

									// check isomorphic binding between objects outFlow and defaultFlow 
									JavaSDM.ensure(!outFlow.equals(defaultFlow));

									// iterate to-many link flowElements from process to divergeFlow
									fujaba__Success = false;

									fujaba__IterProcessToDivergeFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToDivergeFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToDivergeFlow
													.next();

											// ensure correct type and really bound of object divergeFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											divergeFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects divergeFlow and defaultFlow 
											JavaSDM.ensure(!divergeFlow
													.equals(defaultFlow));

											// check isomorphic binding between objects inFlow and divergeFlow 
											JavaSDM.ensure(!inFlow
													.equals(divergeFlow));

											// check isomorphic binding between objects outFlow and divergeFlow 
											JavaSDM.ensure(!outFlow
													.equals(divergeFlow));

											// bind object
											_TmpObject = divergeFlow
													.getSourceRef();

											// ensure correct type and really bound of object exclusiveGateway
											JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
											exclusiveGateway = (ExclusiveGateway) _TmpObject;

											// check isomorphic binding between objects exclusiveGateway and exConvGateway 
											JavaSDM.ensure(!exclusiveGateway
													.equals(exConvGateway));

											// check link default from exclusiveGateway to defaultFlow
											JavaSDM.ensure(defaultFlow
													.equals(exclusiveGateway
															.getDefault()));

											// check link flowElements from exclusiveGateway to process
											JavaSDM.ensure(process
													.equals(exclusiveGateway
															.eContainer()));

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

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_exConvGateway_flowElements_186239 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_186239 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_186239 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_186239
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_186239 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_186239
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
															__DEC_outFlow_flowElements_944194 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_944194 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_944194 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_944194
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_944194 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_944194
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
															__DEC_exConvGateway_default_271447 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_271447 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_271447 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_271447 and defaultFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_271447
																	.equals(defaultFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_271447 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_271447
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_271447 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_271447
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_271447 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_271447
																	.equals(outFlow));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link default from outFlow to __DEC_outFlow_default_805120
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_805120 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_805120
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_805120 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_805120
																			.next();

																	// check object __DEC_outFlow_default_805120 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_805120 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_805120 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_805120
																			.equals(exConvGateway));

																	// check isomorphic binding between objects __DEC_outFlow_default_805120 and exclusiveGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_805120
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

															// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_753053
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_753053 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_753053
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_753053 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_753053
																			.next();

																	// check object __DEC_exConvGateway_targetRef_753053 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_753053 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_753053 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_753053
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_753053 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_753053
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_753053 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_753053
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_753053 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_753053
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
														// check object defaultFlow is really bound
														JavaSDM.ensure(defaultFlow != null);
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
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
														// check isomorphic binding between objects divergeFlow and defaultFlow 
														JavaSDM.ensure(!divergeFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and defaultFlow 
														JavaSDM.ensure(!inFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects outFlow and defaultFlow 
														JavaSDM.ensure(!outFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects exclusiveGateway and exConvGateway 
														JavaSDM.ensure(!exclusiveGateway
																.equals(exConvGateway));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exclusiveGateway to defaultFlow
														JavaSDM.ensure(defaultFlow
																.equals(exclusiveGateway
																		.getDefault()));

														// check link default from exConvGateway to defaultFlow
														JavaSDM.ensure(!(defaultFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exclusiveGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exclusiveGateway
																		.getDefault())));

														// check link flowElements from defaultFlow to process
														JavaSDM.ensure(process
																.equals(defaultFlow
																		.eContainer()));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from exclusiveGateway to process
														JavaSDM.ensure(process
																.equals(exclusiveGateway
																		.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link incoming from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link incoming from defaultFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(defaultFlow
																		.getTargetRef())));

														// check link incoming from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link incoming from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to exclusiveGateway
														JavaSDM.ensure(exclusiveGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link src from _edge_flowElements to process
														JavaSDM.ensure(process
																.equals(_edge_flowElements
																		.getSrc()));

														// check link trg from _edge_flowElements to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_flowElements
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

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
																		inFlow,
																		process,
																		defaultFlow,
																		exclusiveGateway,
																		divergeFlow,
																		exConvGateway,
																		outFlow,
																		lane,
																		laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_119(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_24324 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_553239 = null;
		SequenceFlow __DEC_exConvGateway_default_31899 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_474889 = null;
		ExclusiveGateway __DEC_outFlow_default_474889 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_750243 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_750243 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link incoming from exConvGateway to inFlow
					fujaba__Success = false;

					fujaba__IterExConvGatewayToInFlow = new ArrayList(
							exConvGateway.getIncoming()).iterator();

					while (fujaba__IterExConvGatewayToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// bind object
							_TmpObject = _edge_flowElements.getSrc();

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
							process = (bpmn2.Process) _TmpObject;

							// check link flowElements from exConvGateway to process
							JavaSDM.ensure(process.equals(exConvGateway
									.eContainer()));

							// iterate to-many link flowElements from process to defaultFlow
							fujaba__Success = false;

							fujaba__IterProcessToDefaultFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToDefaultFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToDefaultFlow
											.next();

									// ensure correct type and really bound of object defaultFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									defaultFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects inFlow and defaultFlow 
									JavaSDM.ensure(!inFlow.equals(defaultFlow));

									// iterate to-many link flowElements from process to divergeFlow
									fujaba__Success = false;

									fujaba__IterProcessToDivergeFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToDivergeFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToDivergeFlow
													.next();

											// ensure correct type and really bound of object divergeFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											divergeFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects divergeFlow and defaultFlow 
											JavaSDM.ensure(!divergeFlow
													.equals(defaultFlow));

											// check isomorphic binding between objects inFlow and divergeFlow 
											JavaSDM.ensure(!inFlow
													.equals(divergeFlow));

											// bind object
											_TmpObject = divergeFlow
													.getSourceRef();

											// ensure correct type and really bound of object exclusiveGateway
											JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
											exclusiveGateway = (ExclusiveGateway) _TmpObject;

											// check isomorphic binding between objects exclusiveGateway and exConvGateway 
											JavaSDM.ensure(!exclusiveGateway
													.equals(exConvGateway));

											// check link default from exclusiveGateway to defaultFlow
											JavaSDM.ensure(defaultFlow
													.equals(exclusiveGateway
															.getDefault()));

											// check link flowElements from exclusiveGateway to process
											JavaSDM.ensure(process
													.equals(exclusiveGateway
															.eContainer()));

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

													// iterate to-many link outgoing from exConvGateway to outFlow
													fujaba__Success = false;

													fujaba__IterExConvGatewayToOutFlow = new ArrayList(
															exConvGateway
																	.getOutgoing())
															.iterator();

													while (fujaba__IterExConvGatewayToOutFlow
															.hasNext()) {
														try {
															outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
																	.next();

															// check object outFlow is really bound
															JavaSDM.ensure(outFlow != null);
															// check isomorphic binding between objects outFlow and defaultFlow 
															JavaSDM.ensure(!outFlow
																	.equals(defaultFlow));

															// check isomorphic binding between objects outFlow and divergeFlow 
															JavaSDM.ensure(!outFlow
																	.equals(divergeFlow));

															// check isomorphic binding between objects outFlow and inFlow 
															JavaSDM.ensure(!outFlow
																	.equals(inFlow));

															// check link flowElements from outFlow to process
															JavaSDM.ensure(process
																	.equals(outFlow
																			.eContainer()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_exConvGateway_flowElements_24324 = exConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_exConvGateway_flowElements_24324 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_24324 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_24324
																			.getFlowElements()
																			.contains(
																					exConvGateway));

																	// check isomorphic binding between objects __DEC_exConvGateway_flowElements_24324 and process 
																	JavaSDM.ensure(!__DEC_exConvGateway_flowElements_24324
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
																	__DEC_outFlow_flowElements_553239 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_553239 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_553239 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_553239
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_553239 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_553239
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
																	__DEC_exConvGateway_default_31899 = exConvGateway
																			.getDefault();

																	// check object __DEC_exConvGateway_default_31899 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_default_31899 != null);

																	// check isomorphic binding between objects __DEC_exConvGateway_default_31899 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_31899
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_31899 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_31899
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_31899 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_31899
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_31899 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_31899
																			.equals(outFlow));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link default from outFlow to __DEC_outFlow_default_474889
																	fujaba__Success = false;

																	fujaba__IterOutFlowTo__DEC_outFlow_default_474889 = new ArrayList(
																			org.moflon.util.eMoflonEMFUtil
																					.getOppositeReference(
																							outFlow,
																							ExclusiveGateway.class,
																							"default"))
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterOutFlowTo__DEC_outFlow_default_474889
																					.hasNext()) {
																		try {
																			__DEC_outFlow_default_474889 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_474889
																					.next();

																			// check object __DEC_outFlow_default_474889 is really bound
																			JavaSDM.ensure(__DEC_outFlow_default_474889 != null);
																			// check isomorphic binding between objects __DEC_outFlow_default_474889 and exConvGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_474889
																					.equals(exConvGateway));

																			// check isomorphic binding between objects __DEC_outFlow_default_474889 and exclusiveGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_474889
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

																	// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_750243
																	fujaba__Success = false;

																	fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_750243 = new ArrayList(
																			exConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_750243
																					.hasNext()) {
																		try {
																			__DEC_exConvGateway_targetRef_750243 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_750243
																					.next();

																			// check object __DEC_exConvGateway_targetRef_750243 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_targetRef_750243 != null);
																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_750243 and defaultFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_750243
																					.equals(defaultFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_750243 and divergeFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_750243
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_750243 and inFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_750243
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_750243 and outFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_750243
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
																// check object defaultFlow is really bound
																JavaSDM.ensure(defaultFlow != null);
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object exConvGateway is really bound
																JavaSDM.ensure(exConvGateway != null);
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
																// check isomorphic binding between objects divergeFlow and defaultFlow 
																JavaSDM.ensure(!divergeFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects inFlow and defaultFlow 
																JavaSDM.ensure(!inFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects outFlow and defaultFlow 
																JavaSDM.ensure(!outFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects exclusiveGateway and exConvGateway 
																JavaSDM.ensure(!exclusiveGateway
																		.equals(exConvGateway));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link default from exclusiveGateway to defaultFlow
																JavaSDM.ensure(defaultFlow
																		.equals(exclusiveGateway
																				.getDefault()));

																// check link default from exConvGateway to defaultFlow
																JavaSDM.ensure(!(defaultFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to divergeFlow
																JavaSDM.ensure(!(divergeFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to inFlow
																JavaSDM.ensure(!(inFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exclusiveGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exclusiveGateway
																				.getDefault())));

																// check link flowElements from defaultFlow to process
																JavaSDM.ensure(process
																		.equals(defaultFlow
																				.eContainer()));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from exConvGateway to process
																JavaSDM.ensure(process
																		.equals(exConvGateway
																				.eContainer()));

																// check link flowElements from exclusiveGateway to process
																JavaSDM.ensure(process
																		.equals(exclusiveGateway
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link incoming from inFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from defaultFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(defaultFlow
																				.getTargetRef())));

																// check link incoming from divergeFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link incoming from outFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
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

																// check link outgoing from outFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link outgoing from divergeFlow to exclusiveGateway
																JavaSDM.ensure(exclusiveGateway
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link src from _edge_flowElements to process
																JavaSDM.ensure(process
																		.equals(_edge_flowElements
																				.getSrc()));

																// check link trg from _edge_flowElements to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(_edge_flowElements
																				.getTrg()));

																// check link flowNodeRefs from lane to exConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				exConvGateway));

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
																				inFlow,
																				process,
																				defaultFlow,
																				exclusiveGateway,
																				divergeFlow,
																				exConvGateway,
																				outFlow,
																				lane,
																				laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_120(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_729250 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_804964 = null;
		SequenceFlow __DEC_exConvGateway_default_189377 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_93410 = null;
		ExclusiveGateway __DEC_outFlow_default_93410 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_425442 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_425442 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		bpmn2.Process process = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exConvGateway));

			// check link incoming from inFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

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
					// check isomorphic binding between objects inFlow and defaultFlow 
					JavaSDM.ensure(!inFlow.equals(defaultFlow));

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
							// check isomorphic binding between objects divergeFlow and defaultFlow 
							JavaSDM.ensure(!divergeFlow.equals(defaultFlow));

							// check isomorphic binding between objects inFlow and divergeFlow 
							JavaSDM.ensure(!inFlow.equals(divergeFlow));

							// bind object
							_TmpObject = divergeFlow.getSourceRef();

							// ensure correct type and really bound of object exclusiveGateway
							JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
							exclusiveGateway = (ExclusiveGateway) _TmpObject;

							// check isomorphic binding between objects exclusiveGateway and exConvGateway 
							JavaSDM.ensure(!exclusiveGateway
									.equals(exConvGateway));

							// check link default from exclusiveGateway to defaultFlow
							JavaSDM.ensure(defaultFlow.equals(exclusiveGateway
									.getDefault()));

							// check link flowElements from exclusiveGateway to process
							JavaSDM.ensure(process.equals(exclusiveGateway
									.eContainer()));

							// iterate to-many link flowNodeRefs from exConvGateway to lane
							fujaba__Success = false;

							fujaba__IterExConvGatewayToLane = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													exConvGateway, Lane.class,
													"flowNodeRefs")).iterator();

							while (fujaba__IterExConvGatewayToLane.hasNext()) {
								try {
									lane = (Lane) fujaba__IterExConvGatewayToLane
											.next();

									// check object lane is really bound
									JavaSDM.ensure(lane != null);
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

											// iterate to-many link outgoing from exConvGateway to outFlow
											fujaba__Success = false;

											fujaba__IterExConvGatewayToOutFlow = new ArrayList(
													exConvGateway.getOutgoing())
													.iterator();

											while (fujaba__IterExConvGatewayToOutFlow
													.hasNext()) {
												try {
													outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
															.next();

													// check object outFlow is really bound
													JavaSDM.ensure(outFlow != null);
													// check isomorphic binding between objects outFlow and defaultFlow 
													JavaSDM.ensure(!outFlow
															.equals(defaultFlow));

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
															__DEC_exConvGateway_flowElements_729250 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_729250 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_729250 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_729250
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_729250 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_729250
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
															__DEC_outFlow_flowElements_804964 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_804964 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_804964 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_804964
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_804964 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_804964
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
															__DEC_exConvGateway_default_189377 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_189377 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_189377 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_189377 and defaultFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_189377
																	.equals(defaultFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_189377 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_189377
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_189377 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_189377
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_189377 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_189377
																	.equals(outFlow));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link default from outFlow to __DEC_outFlow_default_93410
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_93410 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_93410
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_93410 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_93410
																			.next();

																	// check object __DEC_outFlow_default_93410 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_93410 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_93410 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_93410
																			.equals(exConvGateway));

																	// check isomorphic binding between objects __DEC_outFlow_default_93410 and exclusiveGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_93410
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

															// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_425442
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_425442 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_425442
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_425442 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_425442
																			.next();

																	// check object __DEC_exConvGateway_targetRef_425442 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_425442 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_425442 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_425442
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_425442 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_425442
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_425442 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_425442
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_425442 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_425442
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
														// check object defaultFlow is really bound
														JavaSDM.ensure(defaultFlow != null);
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
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
														// check isomorphic binding between objects divergeFlow and defaultFlow 
														JavaSDM.ensure(!divergeFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and defaultFlow 
														JavaSDM.ensure(!inFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects outFlow and defaultFlow 
														JavaSDM.ensure(!outFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects exclusiveGateway and exConvGateway 
														JavaSDM.ensure(!exclusiveGateway
																.equals(exConvGateway));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exclusiveGateway to defaultFlow
														JavaSDM.ensure(defaultFlow
																.equals(exclusiveGateway
																		.getDefault()));

														// check link default from exConvGateway to defaultFlow
														JavaSDM.ensure(!(defaultFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exclusiveGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exclusiveGateway
																		.getDefault())));

														// check link flowElements from defaultFlow to process
														JavaSDM.ensure(process
																.equals(defaultFlow
																		.eContainer()));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from exclusiveGateway to process
														JavaSDM.ensure(process
																.equals(exclusiveGateway
																		.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link incoming from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link incoming from defaultFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(defaultFlow
																		.getTargetRef())));

														// check link incoming from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link incoming from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to exclusiveGateway
														JavaSDM.ensure(exclusiveGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link src from _edge_targetRef to inFlow
														JavaSDM.ensure(inFlow
																.equals(_edge_targetRef
																		.getSrc()));

														// check link trg from _edge_targetRef to exConvGateway
														JavaSDM.ensure(exConvGateway
																.equals(_edge_targetRef
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

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
																		inFlow,
																		process,
																		defaultFlow,
																		exclusiveGateway,
																		divergeFlow,
																		exConvGateway,
																		outFlow,
																		lane,
																		laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_121(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_300308 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_280486 = null;
		SequenceFlow __DEC_exConvGateway_default_780081 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_817713 = null;
		ExclusiveGateway __DEC_outFlow_default_817713 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_985473 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_985473 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		SequenceFlow inFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(
							exConvGateway));

					// bind object
					_TmpObject = _edge_incoming.getTrg();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;

					// check link incoming from inFlow to exConvGateway
					JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

					// iterate to-many link flowElements from process to defaultFlow
					fujaba__Success = false;

					fujaba__IterProcessToDefaultFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToDefaultFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToDefaultFlow
									.next();

							// ensure correct type and really bound of object defaultFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							defaultFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects inFlow and defaultFlow 
							JavaSDM.ensure(!inFlow.equals(defaultFlow));

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
									// check isomorphic binding between objects divergeFlow and defaultFlow 
									JavaSDM.ensure(!divergeFlow
											.equals(defaultFlow));

									// check isomorphic binding between objects inFlow and divergeFlow 
									JavaSDM.ensure(!inFlow.equals(divergeFlow));

									// bind object
									_TmpObject = divergeFlow.getSourceRef();

									// ensure correct type and really bound of object exclusiveGateway
									JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
									exclusiveGateway = (ExclusiveGateway) _TmpObject;

									// check isomorphic binding between objects exclusiveGateway and exConvGateway 
									JavaSDM.ensure(!exclusiveGateway
											.equals(exConvGateway));

									// check link default from exclusiveGateway to defaultFlow
									JavaSDM.ensure(defaultFlow
											.equals(exclusiveGateway
													.getDefault()));

									// check link flowElements from exclusiveGateway to process
									JavaSDM.ensure(process
											.equals(exclusiveGateway
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

											// iterate to-many link outgoing from exConvGateway to outFlow
											fujaba__Success = false;

											fujaba__IterExConvGatewayToOutFlow = new ArrayList(
													exConvGateway.getOutgoing())
													.iterator();

											while (fujaba__IterExConvGatewayToOutFlow
													.hasNext()) {
												try {
													outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
															.next();

													// check object outFlow is really bound
													JavaSDM.ensure(outFlow != null);
													// check isomorphic binding between objects outFlow and defaultFlow 
													JavaSDM.ensure(!outFlow
															.equals(defaultFlow));

													// check isomorphic binding between objects outFlow and divergeFlow 
													JavaSDM.ensure(!outFlow
															.equals(divergeFlow));

													// check isomorphic binding between objects outFlow and inFlow 
													JavaSDM.ensure(!outFlow
															.equals(inFlow));

													// check link flowElements from outFlow to process
													JavaSDM.ensure(process.equals(outFlow
															.eContainer()));

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

															// check link trg from _edge_targetRef to exConvGateway
															JavaSDM.ensure(exConvGateway
																	.equals(_edge_targetRef
																			.getTrg()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_exConvGateway_flowElements_300308 = exConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_exConvGateway_flowElements_300308 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_300308 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_300308
																			.getFlowElements()
																			.contains(
																					exConvGateway));

																	// check isomorphic binding between objects __DEC_exConvGateway_flowElements_300308 and process 
																	JavaSDM.ensure(!__DEC_exConvGateway_flowElements_300308
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
																	__DEC_outFlow_flowElements_280486 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_280486 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_280486 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_280486
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_280486 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_280486
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
																	__DEC_exConvGateway_default_780081 = exConvGateway
																			.getDefault();

																	// check object __DEC_exConvGateway_default_780081 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_default_780081 != null);

																	// check isomorphic binding between objects __DEC_exConvGateway_default_780081 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_780081
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_780081 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_780081
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_780081 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_780081
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_780081 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_780081
																			.equals(outFlow));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link default from outFlow to __DEC_outFlow_default_817713
																	fujaba__Success = false;

																	fujaba__IterOutFlowTo__DEC_outFlow_default_817713 = new ArrayList(
																			org.moflon.util.eMoflonEMFUtil
																					.getOppositeReference(
																							outFlow,
																							ExclusiveGateway.class,
																							"default"))
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterOutFlowTo__DEC_outFlow_default_817713
																					.hasNext()) {
																		try {
																			__DEC_outFlow_default_817713 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_817713
																					.next();

																			// check object __DEC_outFlow_default_817713 is really bound
																			JavaSDM.ensure(__DEC_outFlow_default_817713 != null);
																			// check isomorphic binding between objects __DEC_outFlow_default_817713 and exConvGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_817713
																					.equals(exConvGateway));

																			// check isomorphic binding between objects __DEC_outFlow_default_817713 and exclusiveGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_817713
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

																	// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_985473
																	fujaba__Success = false;

																	fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_985473 = new ArrayList(
																			exConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_985473
																					.hasNext()) {
																		try {
																			__DEC_exConvGateway_targetRef_985473 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_985473
																					.next();

																			// check object __DEC_exConvGateway_targetRef_985473 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_targetRef_985473 != null);
																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_985473 and defaultFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_985473
																					.equals(defaultFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_985473 and divergeFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_985473
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_985473 and inFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_985473
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_985473 and outFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_985473
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
																// check object defaultFlow is really bound
																JavaSDM.ensure(defaultFlow != null);
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object exConvGateway is really bound
																JavaSDM.ensure(exConvGateway != null);
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

																// check isomorphic binding between objects divergeFlow and defaultFlow 
																JavaSDM.ensure(!divergeFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects inFlow and defaultFlow 
																JavaSDM.ensure(!inFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects outFlow and defaultFlow 
																JavaSDM.ensure(!outFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects exclusiveGateway and exConvGateway 
																JavaSDM.ensure(!exclusiveGateway
																		.equals(exConvGateway));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link default from exclusiveGateway to defaultFlow
																JavaSDM.ensure(defaultFlow
																		.equals(exclusiveGateway
																				.getDefault()));

																// check link default from exConvGateway to defaultFlow
																JavaSDM.ensure(!(defaultFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to divergeFlow
																JavaSDM.ensure(!(divergeFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to inFlow
																JavaSDM.ensure(!(inFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exclusiveGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exclusiveGateway
																				.getDefault())));

																// check link flowElements from defaultFlow to process
																JavaSDM.ensure(process
																		.equals(defaultFlow
																				.eContainer()));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from exConvGateway to process
																JavaSDM.ensure(process
																		.equals(exConvGateway
																				.eContainer()));

																// check link flowElements from exclusiveGateway to process
																JavaSDM.ensure(process
																		.equals(exclusiveGateway
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link incoming from inFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from defaultFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(defaultFlow
																				.getTargetRef())));

																// check link incoming from divergeFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link incoming from outFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
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

																// check link outgoing from outFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link outgoing from divergeFlow to exclusiveGateway
																JavaSDM.ensure(exclusiveGateway
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link src from _edge_incoming to exConvGateway
																JavaSDM.ensure(exConvGateway
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

																// check link trg from _edge_targetRef to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(_edge_targetRef
																				.getTrg()));

																// check link flowNodeRefs from lane to exConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				exConvGateway));

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
																				inFlow,
																				process,
																				defaultFlow,
																				exclusiveGateway,
																				divergeFlow,
																				exConvGateway,
																				outFlow,
																				lane,
																				laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_122(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_288118 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_701836 = null;
		SequenceFlow __DEC_exConvGateway_default_442469 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_351485 = null;
		ExclusiveGateway __DEC_outFlow_default_351485 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_689252 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_689252 = null;
		Match match = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link outgoing from outFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// iterate to-many link incoming from exConvGateway to inFlow
					fujaba__Success = false;

					fujaba__IterExConvGatewayToInFlow = new ArrayList(
							exConvGateway.getIncoming()).iterator();

					while (fujaba__IterExConvGatewayToInFlow.hasNext()) {
						try {
							inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
									.next();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// bind object
							_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
							process = (bpmn2.Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									exConvGateway));

							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// iterate to-many link flowElements from process to defaultFlow
							fujaba__Success = false;

							fujaba__IterProcessToDefaultFlow = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToDefaultFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToDefaultFlow
											.next();

									// ensure correct type and really bound of object defaultFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									defaultFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects inFlow and defaultFlow 
									JavaSDM.ensure(!inFlow.equals(defaultFlow));

									// check isomorphic binding between objects outFlow and defaultFlow 
									JavaSDM.ensure(!outFlow.equals(defaultFlow));

									// iterate to-many link flowElements from process to divergeFlow
									fujaba__Success = false;

									fujaba__IterProcessToDivergeFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToDivergeFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToDivergeFlow
													.next();

											// ensure correct type and really bound of object divergeFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											divergeFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects divergeFlow and defaultFlow 
											JavaSDM.ensure(!divergeFlow
													.equals(defaultFlow));

											// check isomorphic binding between objects inFlow and divergeFlow 
											JavaSDM.ensure(!inFlow
													.equals(divergeFlow));

											// check isomorphic binding between objects outFlow and divergeFlow 
											JavaSDM.ensure(!outFlow
													.equals(divergeFlow));

											// bind object
											_TmpObject = divergeFlow
													.getSourceRef();

											// ensure correct type and really bound of object exclusiveGateway
											JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
											exclusiveGateway = (ExclusiveGateway) _TmpObject;

											// check isomorphic binding between objects exclusiveGateway and exConvGateway 
											JavaSDM.ensure(!exclusiveGateway
													.equals(exConvGateway));

											// check link default from exclusiveGateway to defaultFlow
											JavaSDM.ensure(defaultFlow
													.equals(exclusiveGateway
															.getDefault()));

											// check link flowElements from exclusiveGateway to process
											JavaSDM.ensure(process
													.equals(exclusiveGateway
															.eContainer()));

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

													// story node 'test core match and DECs'
													try {
														fujaba__Success = false;

														// check negative bindings
														try {
															fujaba__Success = false;

															// bind object
															__DEC_exConvGateway_flowElements_288118 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_288118 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_288118 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_288118
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_288118 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_288118
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
															__DEC_outFlow_flowElements_701836 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_701836 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_701836 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_701836
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_701836 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_701836
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
															__DEC_exConvGateway_default_442469 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_442469 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_442469 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_442469 and defaultFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_442469
																	.equals(defaultFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_442469 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_442469
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_442469 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_442469
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_442469 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_442469
																	.equals(outFlow));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link default from outFlow to __DEC_outFlow_default_351485
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_351485 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_351485
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_351485 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_351485
																			.next();

																	// check object __DEC_outFlow_default_351485 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_351485 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_351485 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_351485
																			.equals(exConvGateway));

																	// check isomorphic binding between objects __DEC_outFlow_default_351485 and exclusiveGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_351485
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

															// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_689252
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_689252 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_689252
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_689252 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_689252
																			.next();

																	// check object __DEC_exConvGateway_targetRef_689252 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_689252 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_689252 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_689252
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_689252 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_689252
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_689252 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_689252
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_689252 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_689252
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
														// check object defaultFlow is really bound
														JavaSDM.ensure(defaultFlow != null);
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
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
														// check isomorphic binding between objects divergeFlow and defaultFlow 
														JavaSDM.ensure(!divergeFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and defaultFlow 
														JavaSDM.ensure(!inFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects outFlow and defaultFlow 
														JavaSDM.ensure(!outFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects exclusiveGateway and exConvGateway 
														JavaSDM.ensure(!exclusiveGateway
																.equals(exConvGateway));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exclusiveGateway to defaultFlow
														JavaSDM.ensure(defaultFlow
																.equals(exclusiveGateway
																		.getDefault()));

														// check link default from exConvGateway to defaultFlow
														JavaSDM.ensure(!(defaultFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exclusiveGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exclusiveGateway
																		.getDefault())));

														// check link flowElements from defaultFlow to process
														JavaSDM.ensure(process
																.equals(defaultFlow
																		.eContainer()));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from exclusiveGateway to process
														JavaSDM.ensure(process
																.equals(exclusiveGateway
																		.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link incoming from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link incoming from defaultFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(defaultFlow
																		.getTargetRef())));

														// check link incoming from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link incoming from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to exclusiveGateway
														JavaSDM.ensure(exclusiveGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link src from _edge_sourceRef to outFlow
														JavaSDM.ensure(outFlow
																.equals(_edge_sourceRef
																		.getSrc()));

														// check link trg from _edge_sourceRef to exConvGateway
														JavaSDM.ensure(exConvGateway
																.equals(_edge_sourceRef
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

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
																		inFlow,
																		process,
																		defaultFlow,
																		exclusiveGateway,
																		divergeFlow,
																		exConvGateway,
																		outFlow,
																		lane,
																		laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_123(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_469486 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_889953 = null;
		SequenceFlow __DEC_exConvGateway_default_160 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_926011 = null;
		ExclusiveGateway __DEC_outFlow_default_926011 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_74653 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_74653 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		SequenceFlow outFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToLane = null;
		Lane lane = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// iterate to-many link flowNodeRefs from exConvGateway to lane
			fujaba__Success = false;

			fujaba__IterExConvGatewayToLane = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							exConvGateway, Lane.class, "flowNodeRefs"))
					.iterator();

			while (fujaba__IterExConvGatewayToLane.hasNext()) {
				try {
					lane = (Lane) fujaba__IterExConvGatewayToLane.next();

					// check object lane is really bound
					JavaSDM.ensure(lane != null);
					// bind object
					_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(
							exConvGateway));

					// bind object
					_TmpObject = _edge_outgoing.getTrg();

					// ensure correct type and really bound of object outFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					outFlow = (SequenceFlow) _TmpObject;

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// check link outgoing from outFlow to exConvGateway
					JavaSDM.ensure(exConvGateway.equals(outFlow.getSourceRef()));

					// iterate to-many link flowElements from process to defaultFlow
					fujaba__Success = false;

					fujaba__IterProcessToDefaultFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToDefaultFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToDefaultFlow
									.next();

							// ensure correct type and really bound of object defaultFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							defaultFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and defaultFlow 
							JavaSDM.ensure(!outFlow.equals(defaultFlow));

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
									// check isomorphic binding between objects divergeFlow and defaultFlow 
									JavaSDM.ensure(!divergeFlow
											.equals(defaultFlow));

									// check isomorphic binding between objects outFlow and divergeFlow 
									JavaSDM.ensure(!outFlow.equals(divergeFlow));

									// bind object
									_TmpObject = divergeFlow.getSourceRef();

									// ensure correct type and really bound of object exclusiveGateway
									JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
									exclusiveGateway = (ExclusiveGateway) _TmpObject;

									// check isomorphic binding between objects exclusiveGateway and exConvGateway 
									JavaSDM.ensure(!exclusiveGateway
											.equals(exConvGateway));

									// check link default from exclusiveGateway to defaultFlow
									JavaSDM.ensure(defaultFlow
											.equals(exclusiveGateway
													.getDefault()));

									// check link flowElements from exclusiveGateway to process
									JavaSDM.ensure(process
											.equals(exclusiveGateway
													.eContainer()));

									// iterate to-many link incoming from exConvGateway to inFlow
									fujaba__Success = false;

									fujaba__IterExConvGatewayToInFlow = new ArrayList(
											exConvGateway.getIncoming())
											.iterator();

									while (fujaba__IterExConvGatewayToInFlow
											.hasNext()) {
										try {
											inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
													.next();

											// check object inFlow is really bound
											JavaSDM.ensure(inFlow != null);
											// check isomorphic binding between objects inFlow and defaultFlow 
											JavaSDM.ensure(!inFlow
													.equals(defaultFlow));

											// check isomorphic binding between objects inFlow and divergeFlow 
											JavaSDM.ensure(!inFlow
													.equals(divergeFlow));

											// check isomorphic binding between objects outFlow and inFlow 
											JavaSDM.ensure(!outFlow
													.equals(inFlow));

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

													// iterate to-many link trg from exConvGateway to _edge_sourceRef
													fujaba__Success = false;

													fujaba__IterExConvGatewayTo_edge_sourceRef = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			exConvGateway,
																			EMoflonEdge.class,
																			"trg"))
															.iterator();

													while (fujaba__IterExConvGatewayTo_edge_sourceRef
															.hasNext()) {
														try {
															_edge_sourceRef = (EMoflonEdge) fujaba__IterExConvGatewayTo_edge_sourceRef
																	.next();

															// check object _edge_sourceRef is really bound
															JavaSDM.ensure(_edge_sourceRef != null);
															// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
															JavaSDM.ensure(!_edge_sourceRef
																	.equals(_edge_outgoing));

															// check link src from _edge_sourceRef to outFlow
															JavaSDM.ensure(outFlow
																	.equals(_edge_sourceRef
																			.getSrc()));

															// story node 'test core match and DECs'
															try {
																fujaba__Success = false;

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// bind object
																	__DEC_exConvGateway_flowElements_469486 = exConvGateway
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																			.eContainer()
																			: null;

																	// check object __DEC_exConvGateway_flowElements_469486 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_469486 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_exConvGateway_flowElements_469486
																			.getFlowElements()
																			.contains(
																					exConvGateway));

																	// check isomorphic binding between objects __DEC_exConvGateway_flowElements_469486 and process 
																	JavaSDM.ensure(!__DEC_exConvGateway_flowElements_469486
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
																	__DEC_outFlow_flowElements_889953 = outFlow
																			.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																			.eContainer()
																			: null;

																	// check object __DEC_outFlow_flowElements_889953 is really bound
																	JavaSDM.ensure(__DEC_outFlow_flowElements_889953 != null);

																	// check if contained via correct reference
																	JavaSDM.ensure(__DEC_outFlow_flowElements_889953
																			.getFlowElements()
																			.contains(
																					outFlow));

																	// check isomorphic binding between objects __DEC_outFlow_flowElements_889953 and process 
																	JavaSDM.ensure(!__DEC_outFlow_flowElements_889953
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
																	__DEC_exConvGateway_default_160 = exConvGateway
																			.getDefault();

																	// check object __DEC_exConvGateway_default_160 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_default_160 != null);

																	// check isomorphic binding between objects __DEC_exConvGateway_default_160 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_160
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_160 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_160
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_160 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_160
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_default_160 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_default_160
																			.equals(outFlow));

																	fujaba__Success = true;
																} catch (JavaSDMException fujaba__InternalException) {
																	fujaba__Success = false;
																}

																fujaba__Success = !(fujaba__Success);

																JavaSDM.ensure(fujaba__Success);

																// check negative bindings
																try {
																	fujaba__Success = false;

																	// iterate to-many link default from outFlow to __DEC_outFlow_default_926011
																	fujaba__Success = false;

																	fujaba__IterOutFlowTo__DEC_outFlow_default_926011 = new ArrayList(
																			org.moflon.util.eMoflonEMFUtil
																					.getOppositeReference(
																							outFlow,
																							ExclusiveGateway.class,
																							"default"))
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterOutFlowTo__DEC_outFlow_default_926011
																					.hasNext()) {
																		try {
																			__DEC_outFlow_default_926011 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_926011
																					.next();

																			// check object __DEC_outFlow_default_926011 is really bound
																			JavaSDM.ensure(__DEC_outFlow_default_926011 != null);
																			// check isomorphic binding between objects __DEC_outFlow_default_926011 and exConvGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_926011
																					.equals(exConvGateway));

																			// check isomorphic binding between objects __DEC_outFlow_default_926011 and exclusiveGateway 
																			JavaSDM.ensure(!__DEC_outFlow_default_926011
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

																	// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_74653
																	fujaba__Success = false;

																	fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_74653 = new ArrayList(
																			exConvGateway
																					.getIncoming())
																			.iterator();

																	while (!(fujaba__Success)
																			&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_74653
																					.hasNext()) {
																		try {
																			__DEC_exConvGateway_targetRef_74653 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_74653
																					.next();

																			// check object __DEC_exConvGateway_targetRef_74653 is really bound
																			JavaSDM.ensure(__DEC_exConvGateway_targetRef_74653 != null);
																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_74653 and defaultFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_74653
																					.equals(defaultFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_74653 and divergeFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_74653
																					.equals(divergeFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_74653 and inFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_74653
																					.equals(inFlow));

																			// check isomorphic binding between objects __DEC_exConvGateway_targetRef_74653 and outFlow 
																			JavaSDM.ensure(!__DEC_exConvGateway_targetRef_74653
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
																// check object defaultFlow is really bound
																JavaSDM.ensure(defaultFlow != null);
																// check object divergeFlow is really bound
																JavaSDM.ensure(divergeFlow != null);
																// check object exConvGateway is really bound
																JavaSDM.ensure(exConvGateway != null);
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

																// check isomorphic binding between objects divergeFlow and defaultFlow 
																JavaSDM.ensure(!divergeFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects inFlow and defaultFlow 
																JavaSDM.ensure(!inFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects outFlow and defaultFlow 
																JavaSDM.ensure(!outFlow
																		.equals(defaultFlow));

																// check isomorphic binding between objects inFlow and divergeFlow 
																JavaSDM.ensure(!inFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects outFlow and divergeFlow 
																JavaSDM.ensure(!outFlow
																		.equals(divergeFlow));

																// check isomorphic binding between objects exclusiveGateway and exConvGateway 
																JavaSDM.ensure(!exclusiveGateway
																		.equals(exConvGateway));

																// check isomorphic binding between objects outFlow and inFlow 
																JavaSDM.ensure(!outFlow
																		.equals(inFlow));

																// check link default from exclusiveGateway to defaultFlow
																JavaSDM.ensure(defaultFlow
																		.equals(exclusiveGateway
																				.getDefault()));

																// check link default from exConvGateway to defaultFlow
																JavaSDM.ensure(!(defaultFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to divergeFlow
																JavaSDM.ensure(!(divergeFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to inFlow
																JavaSDM.ensure(!(inFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exConvGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exConvGateway
																				.getDefault())));

																// check link default from exclusiveGateway to outFlow
																JavaSDM.ensure(!(outFlow
																		.equals(exclusiveGateway
																				.getDefault())));

																// check link flowElements from defaultFlow to process
																JavaSDM.ensure(process
																		.equals(defaultFlow
																				.eContainer()));

																// check link flowElements from divergeFlow to process
																JavaSDM.ensure(process
																		.equals(divergeFlow
																				.eContainer()));

																// check link flowElements from exConvGateway to process
																JavaSDM.ensure(process
																		.equals(exConvGateway
																				.eContainer()));

																// check link flowElements from exclusiveGateway to process
																JavaSDM.ensure(process
																		.equals(exclusiveGateway
																				.eContainer()));

																// check link flowElements from outFlow to process
																JavaSDM.ensure(process
																		.equals(outFlow
																				.eContainer()));

																// check link incoming from inFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(inFlow
																				.getTargetRef()));

																// check link incoming from defaultFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(defaultFlow
																				.getTargetRef())));

																// check link incoming from divergeFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
																		.equals(divergeFlow
																				.getTargetRef())));

																// check link incoming from outFlow to exConvGateway
																JavaSDM.ensure(!(exConvGateway
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

																// check link outgoing from outFlow to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(outFlow
																				.getSourceRef()));

																// check link outgoing from divergeFlow to exclusiveGateway
																JavaSDM.ensure(exclusiveGateway
																		.equals(divergeFlow
																				.getSourceRef()));

																// check link src from _edge_outgoing to exConvGateway
																JavaSDM.ensure(exConvGateway
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

																// check link trg from _edge_sourceRef to exConvGateway
																JavaSDM.ensure(exConvGateway
																		.equals(_edge_sourceRef
																				.getTrg()));

																// check link flowNodeRefs from lane to exConvGateway
																JavaSDM.ensure(lane
																		.getFlowNodeRefs()
																		.contains(
																				exConvGateway));

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
																				inFlow,
																				process,
																				defaultFlow,
																				exclusiveGateway,
																				divergeFlow,
																				exConvGateway,
																				outFlow,
																				lane,
																				laneSet);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_124(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_736016 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_218128 = null;
		SequenceFlow __DEC_exConvGateway_default_628235 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_830752 = null;
		ExclusiveGateway __DEC_outFlow_default_830752 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_382951 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_382951 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToDivergeFlow = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterExConvGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link flowNodeRefs from lane to exConvGateway
			JavaSDM.ensure(lane.getFlowNodeRefs().contains(exConvGateway));

			// iterate to-many link incoming from exConvGateway to inFlow
			fujaba__Success = false;

			fujaba__IterExConvGatewayToInFlow = new ArrayList(
					exConvGateway.getIncoming()).iterator();

			while (fujaba__IterExConvGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterExConvGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// bind object
					_TmpObject = exConvGateway.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) exConvGateway
							.eContainer() : null;

					// ensure correct type and really bound of object process
					JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
					process = (bpmn2.Process) _TmpObject;

					// check if contained via correct reference
					JavaSDM.ensure(process.getFlowElements().contains(
							exConvGateway));

					// iterate to-many link flowElements from process to defaultFlow
					fujaba__Success = false;

					fujaba__IterProcessToDefaultFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToDefaultFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToDefaultFlow
									.next();

							// ensure correct type and really bound of object defaultFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							defaultFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects inFlow and defaultFlow 
							JavaSDM.ensure(!inFlow.equals(defaultFlow));

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
									// check isomorphic binding between objects divergeFlow and defaultFlow 
									JavaSDM.ensure(!divergeFlow
											.equals(defaultFlow));

									// check isomorphic binding between objects inFlow and divergeFlow 
									JavaSDM.ensure(!inFlow.equals(divergeFlow));

									// bind object
									_TmpObject = divergeFlow.getSourceRef();

									// ensure correct type and really bound of object exclusiveGateway
									JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
									exclusiveGateway = (ExclusiveGateway) _TmpObject;

									// check isomorphic binding between objects exclusiveGateway and exConvGateway 
									JavaSDM.ensure(!exclusiveGateway
											.equals(exConvGateway));

									// check link default from exclusiveGateway to defaultFlow
									JavaSDM.ensure(defaultFlow
											.equals(exclusiveGateway
													.getDefault()));

									// check link flowElements from exclusiveGateway to process
									JavaSDM.ensure(process
											.equals(exclusiveGateway
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

											// iterate to-many link outgoing from exConvGateway to outFlow
											fujaba__Success = false;

											fujaba__IterExConvGatewayToOutFlow = new ArrayList(
													exConvGateway.getOutgoing())
													.iterator();

											while (fujaba__IterExConvGatewayToOutFlow
													.hasNext()) {
												try {
													outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
															.next();

													// check object outFlow is really bound
													JavaSDM.ensure(outFlow != null);
													// check isomorphic binding between objects outFlow and defaultFlow 
													JavaSDM.ensure(!outFlow
															.equals(defaultFlow));

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
															__DEC_exConvGateway_flowElements_736016 = exConvGateway
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
																	.eContainer()
																	: null;

															// check object __DEC_exConvGateway_flowElements_736016 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_736016 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_exConvGateway_flowElements_736016
																	.getFlowElements()
																	.contains(
																			exConvGateway));

															// check isomorphic binding between objects __DEC_exConvGateway_flowElements_736016 and process 
															JavaSDM.ensure(!__DEC_exConvGateway_flowElements_736016
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
															__DEC_outFlow_flowElements_218128 = outFlow
																	.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
																	.eContainer()
																	: null;

															// check object __DEC_outFlow_flowElements_218128 is really bound
															JavaSDM.ensure(__DEC_outFlow_flowElements_218128 != null);

															// check if contained via correct reference
															JavaSDM.ensure(__DEC_outFlow_flowElements_218128
																	.getFlowElements()
																	.contains(
																			outFlow));

															// check isomorphic binding between objects __DEC_outFlow_flowElements_218128 and process 
															JavaSDM.ensure(!__DEC_outFlow_flowElements_218128
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
															__DEC_exConvGateway_default_628235 = exConvGateway
																	.getDefault();

															// check object __DEC_exConvGateway_default_628235 is really bound
															JavaSDM.ensure(__DEC_exConvGateway_default_628235 != null);

															// check isomorphic binding between objects __DEC_exConvGateway_default_628235 and defaultFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_628235
																	.equals(defaultFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_628235 and divergeFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_628235
																	.equals(divergeFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_628235 and inFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_628235
																	.equals(inFlow));

															// check isomorphic binding between objects __DEC_exConvGateway_default_628235 and outFlow 
															JavaSDM.ensure(!__DEC_exConvGateway_default_628235
																	.equals(outFlow));

															fujaba__Success = true;
														} catch (JavaSDMException fujaba__InternalException) {
															fujaba__Success = false;
														}

														fujaba__Success = !(fujaba__Success);

														JavaSDM.ensure(fujaba__Success);

														// check negative bindings
														try {
															fujaba__Success = false;

															// iterate to-many link default from outFlow to __DEC_outFlow_default_830752
															fujaba__Success = false;

															fujaba__IterOutFlowTo__DEC_outFlow_default_830752 = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					outFlow,
																					ExclusiveGateway.class,
																					"default"))
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterOutFlowTo__DEC_outFlow_default_830752
																			.hasNext()) {
																try {
																	__DEC_outFlow_default_830752 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_830752
																			.next();

																	// check object __DEC_outFlow_default_830752 is really bound
																	JavaSDM.ensure(__DEC_outFlow_default_830752 != null);
																	// check isomorphic binding between objects __DEC_outFlow_default_830752 and exConvGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_830752
																			.equals(exConvGateway));

																	// check isomorphic binding between objects __DEC_outFlow_default_830752 and exclusiveGateway 
																	JavaSDM.ensure(!__DEC_outFlow_default_830752
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

															// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_382951
															fujaba__Success = false;

															fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_382951 = new ArrayList(
																	exConvGateway
																			.getIncoming())
																	.iterator();

															while (!(fujaba__Success)
																	&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_382951
																			.hasNext()) {
																try {
																	__DEC_exConvGateway_targetRef_382951 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_382951
																			.next();

																	// check object __DEC_exConvGateway_targetRef_382951 is really bound
																	JavaSDM.ensure(__DEC_exConvGateway_targetRef_382951 != null);
																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_382951 and defaultFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_382951
																			.equals(defaultFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_382951 and divergeFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_382951
																			.equals(divergeFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_382951 and inFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_382951
																			.equals(inFlow));

																	// check isomorphic binding between objects __DEC_exConvGateway_targetRef_382951 and outFlow 
																	JavaSDM.ensure(!__DEC_exConvGateway_targetRef_382951
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
														// check object defaultFlow is really bound
														JavaSDM.ensure(defaultFlow != null);
														// check object divergeFlow is really bound
														JavaSDM.ensure(divergeFlow != null);
														// check object exConvGateway is really bound
														JavaSDM.ensure(exConvGateway != null);
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
														// check isomorphic binding between objects divergeFlow and defaultFlow 
														JavaSDM.ensure(!divergeFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and defaultFlow 
														JavaSDM.ensure(!inFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects outFlow and defaultFlow 
														JavaSDM.ensure(!outFlow
																.equals(defaultFlow));

														// check isomorphic binding between objects inFlow and divergeFlow 
														JavaSDM.ensure(!inFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects outFlow and divergeFlow 
														JavaSDM.ensure(!outFlow
																.equals(divergeFlow));

														// check isomorphic binding between objects exclusiveGateway and exConvGateway 
														JavaSDM.ensure(!exclusiveGateway
																.equals(exConvGateway));

														// check isomorphic binding between objects outFlow and inFlow 
														JavaSDM.ensure(!outFlow
																.equals(inFlow));

														// check link default from exclusiveGateway to defaultFlow
														JavaSDM.ensure(defaultFlow
																.equals(exclusiveGateway
																		.getDefault()));

														// check link default from exConvGateway to defaultFlow
														JavaSDM.ensure(!(defaultFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to divergeFlow
														JavaSDM.ensure(!(divergeFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to inFlow
														JavaSDM.ensure(!(inFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exConvGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exConvGateway
																		.getDefault())));

														// check link default from exclusiveGateway to outFlow
														JavaSDM.ensure(!(outFlow
																.equals(exclusiveGateway
																		.getDefault())));

														// check link flowElements from defaultFlow to process
														JavaSDM.ensure(process
																.equals(defaultFlow
																		.eContainer()));

														// check link flowElements from divergeFlow to process
														JavaSDM.ensure(process
																.equals(divergeFlow
																		.eContainer()));

														// check link flowElements from exConvGateway to process
														JavaSDM.ensure(process
																.equals(exConvGateway
																		.eContainer()));

														// check link flowElements from exclusiveGateway to process
														JavaSDM.ensure(process
																.equals(exclusiveGateway
																		.eContainer()));

														// check link flowElements from outFlow to process
														JavaSDM.ensure(process.equals(outFlow
																.eContainer()));

														// check link incoming from inFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(inFlow
																.getTargetRef()));

														// check link incoming from defaultFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(defaultFlow
																		.getTargetRef())));

														// check link incoming from divergeFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway
																.equals(divergeFlow
																		.getTargetRef())));

														// check link incoming from outFlow to exConvGateway
														JavaSDM.ensure(!(exConvGateway.equals(outFlow
																.getTargetRef())));

														// check link laneSets from laneSet to process
														JavaSDM.ensure(process.equals(laneSet
																.eContainer()));

														// check link lanes from lane to laneSet
														JavaSDM.ensure(laneSet.equals(lane
																.eContainer()));

														// check link outgoing from outFlow to exConvGateway
														JavaSDM.ensure(exConvGateway.equals(outFlow
																.getSourceRef()));

														// check link outgoing from divergeFlow to exclusiveGateway
														JavaSDM.ensure(exclusiveGateway
																.equals(divergeFlow
																		.getSourceRef()));

														// check link src from _edge_flowNodeRefs to lane
														JavaSDM.ensure(lane
																.equals(_edge_flowNodeRefs
																		.getSrc()));

														// check link trg from _edge_flowNodeRefs to exConvGateway
														JavaSDM.ensure(exConvGateway
																.equals(_edge_flowNodeRefs
																		.getTrg()));

														// check link flowNodeRefs from lane to exConvGateway
														JavaSDM.ensure(lane
																.getFlowNodeRefs()
																.contains(
																		exConvGateway));

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
																		inFlow,
																		process,
																		defaultFlow,
																		exclusiveGateway,
																		divergeFlow,
																		exConvGateway,
																		outFlow,
																		lane,
																		laneSet);
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
			SequenceFlowToStep inFlowToStepDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Step nextStep = null;
		Object _TmpObject = null;
		CSP csp = null;
		ExclusiveGateway exConvGateway = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep ecgwToStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterExclusiveGatewayToEgwToStep = null;
		FlowNodeToStep egwToStep = null;
		AlternativeFlowAlternative alt = null;
		Iterator fujaba__IterDivergeFlowToDivergeFlowToAlt = null;
		SeqFlowToAltFlowAlt divergeFlowToAlt = null;
		Flow initFlow = null;
		Iterator fujaba__IterDefaultFlowToDefaultFlowToInitFlow = null;
		SequenceFlowToUCFlow defaultFlowToInitFlow = null;
		Iterator fujaba__IterLaneSetToLane = null;
		Lane lane = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterProcessToDefaultFlow = null;
		SequenceFlow defaultFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		bpmn2.Process process = null;
		SequenceFlow divergeFlow = null;
		Iterator fujaba__IterFlowToDivergeFlowToFlow = null;
		SequenceFlowToUCFlow divergeFlowToFlow = null;
		AlternativeFlow flow = null;
		Step step = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterInFlowToStepListToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		Iterator fujaba__IterRuleEntryContainerToInFlowToStepList = null;
		RuleEntryList inFlowToStepList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to inFlowToStepList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToInFlowToStepList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToInFlowToStepList.hasNext()) {
				try {
					inFlowToStepList = (RuleEntryList) fujaba__IterRuleEntryContainerToInFlowToStepList
							.next();

					// check object inFlowToStepList is really bound
					JavaSDM.ensure(inFlowToStepList != null);
					// iterate to-many link entryObjects from inFlowToStepList to inFlowToStep
					fujaba__Success = false;

					fujaba__IterInFlowToStepListToInFlowToStep = new ArrayList(
							inFlowToStepList.getEntryObjects()).iterator();

					while (fujaba__IterInFlowToStepListToInFlowToStep.hasNext()) {
						try {
							_TmpObject = fujaba__IterInFlowToStepListToInFlowToStep
									.next();

							// ensure correct type and really bound of object inFlowToStep
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
							inFlowToStep = (SequenceFlowToStep) _TmpObject;
							// bind object
							inFlow = inFlowToStep.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// bind object
							step = inFlowToStep.getTarget();

							// check object step is really bound
							JavaSDM.ensure(step != null);

							// bind object
							_TmpObject = step.eContainer() instanceof AlternativeFlow ? (AlternativeFlow) step
									.eContainer() : null;

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
							flow = (AlternativeFlow) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(flow.getSteps().contains(step));

							// iterate to-many link target from flow to divergeFlowToFlow
							fujaba__Success = false;

							fujaba__IterFlowToDivergeFlowToFlow = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(flow,
													SequenceFlowToUCFlow.class,
													"target")).iterator();

							while (fujaba__IterFlowToDivergeFlowToFlow
									.hasNext()) {
								try {
									divergeFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterFlowToDivergeFlowToFlow
											.next();

									// check object divergeFlowToFlow is really bound
									JavaSDM.ensure(divergeFlowToFlow != null);
									// bind object
									divergeFlow = divergeFlowToFlow.getSource();

									// check object divergeFlow is really bound
									JavaSDM.ensure(divergeFlow != null);

									// check isomorphic binding between objects inFlow and divergeFlow 
									JavaSDM.ensure(!inFlow.equals(divergeFlow));

									// bind object
									_TmpObject = divergeFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) divergeFlow
											.eContainer() : null;

									// ensure correct type and really bound of object process
									JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
									process = (bpmn2.Process) _TmpObject;

									// check if contained via correct reference
									JavaSDM.ensure(process.getFlowElements()
											.contains(divergeFlow));

									// bind object
									_TmpObject = divergeFlow.getSourceRef();

									// ensure correct type and really bound of object exclusiveGateway
									JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
									exclusiveGateway = (ExclusiveGateway) _TmpObject;

									// check link flowElements from exclusiveGateway to process
									JavaSDM.ensure(process
											.equals(exclusiveGateway
													.eContainer()));

									// iterate to-many link flowElements from process to defaultFlow
									fujaba__Success = false;

									fujaba__IterProcessToDefaultFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToDefaultFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToDefaultFlow
													.next();

											// ensure correct type and really bound of object defaultFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											defaultFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects divergeFlow and defaultFlow 
											JavaSDM.ensure(!divergeFlow
													.equals(defaultFlow));

											// check isomorphic binding between objects inFlow and defaultFlow 
											JavaSDM.ensure(!inFlow
													.equals(defaultFlow));

											// check link default from exclusiveGateway to defaultFlow
											JavaSDM.ensure(defaultFlow
													.equals(exclusiveGateway
															.getDefault()));

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
															// iterate to-many link source from defaultFlow to defaultFlowToInitFlow
															fujaba__Success = false;

															fujaba__IterDefaultFlowToDefaultFlowToInitFlow = new ArrayList(
																	org.moflon.util.eMoflonEMFUtil
																			.getOppositeReference(
																					defaultFlow,
																					SequenceFlowToUCFlow.class,
																					"source"))
																	.iterator();

															while (fujaba__IterDefaultFlowToDefaultFlowToInitFlow
																	.hasNext()) {
																try {
																	defaultFlowToInitFlow = (SequenceFlowToUCFlow) fujaba__IterDefaultFlowToDefaultFlowToInitFlow
																			.next();

																	// check object defaultFlowToInitFlow is really bound
																	JavaSDM.ensure(defaultFlowToInitFlow != null);
																	// check isomorphic binding between objects divergeFlowToFlow and defaultFlowToInitFlow 
																	JavaSDM.ensure(!divergeFlowToFlow
																			.equals(defaultFlowToInitFlow));

																	// bind object
																	initFlow = defaultFlowToInitFlow
																			.getTarget();

																	// check object initFlow is really bound
																	JavaSDM.ensure(initFlow != null);

																	// check isomorphic binding between objects initFlow and flow 
																	JavaSDM.ensure(!initFlow
																			.equals(flow));

																	// iterate to-many link source from divergeFlow to divergeFlowToAlt
																	fujaba__Success = false;

																	fujaba__IterDivergeFlowToDivergeFlowToAlt = new ArrayList(
																			org.moflon.util.eMoflonEMFUtil
																					.getOppositeReference(
																							divergeFlow,
																							SeqFlowToAltFlowAlt.class,
																							"source"))
																			.iterator();

																	while (fujaba__IterDivergeFlowToDivergeFlowToAlt
																			.hasNext()) {
																		try {
																			divergeFlowToAlt = (SeqFlowToAltFlowAlt) fujaba__IterDivergeFlowToDivergeFlowToAlt
																					.next();

																			// check object divergeFlowToAlt is really bound
																			JavaSDM.ensure(divergeFlowToAlt != null);
																			// bind object
																			alt = divergeFlowToAlt
																					.getTarget();

																			// check object alt is really bound
																			JavaSDM.ensure(alt != null);

																			// iterate to-many link source from exclusiveGateway to egwToStep
																			fujaba__Success = false;

																			fujaba__IterExclusiveGatewayToEgwToStep = new ArrayList(
																					org.moflon.util.eMoflonEMFUtil
																							.getOppositeReference(
																									exclusiveGateway,
																									FlowNodeToStep.class,
																									"source"))
																					.iterator();

																			while (fujaba__IterExclusiveGatewayToEgwToStep
																					.hasNext()) {
																				try {
																					egwToStep = (FlowNodeToStep) fujaba__IterExclusiveGatewayToEgwToStep
																							.next();

																					// check object egwToStep is really bound
																					JavaSDM.ensure(egwToStep != null);
																					// bind object
																					_TmpObject = egwToStep
																							.getTarget();

																					// ensure correct type and really bound of object normalStep
																					JavaSDM.ensure(_TmpObject instanceof NormalStep);
																					normalStep = (NormalStep) _TmpObject;

																					// check negative bindings
																					try {
																						fujaba__Success = false;

																						// bind object
																						nextStep = step
																								.getNext();

																						// check object nextStep is really bound
																						JavaSDM.ensure(nextStep != null);

																						// check isomorphic binding between objects nextStep and normalStep 
																						JavaSDM.ensure(!nextStep
																								.equals(normalStep));

																						// check isomorphic binding between objects nextStep and step 
																						JavaSDM.ensure(!nextStep
																								.equals(step));

																						fujaba__Success = true;
																					} catch (JavaSDMException fujaba__InternalException) {
																						fujaba__Success = false;
																					}

																					fujaba__Success = !(fujaba__Success);

																					JavaSDM.ensure(fujaba__Success);

																					// check isomorphic binding between objects step and normalStep 
																					JavaSDM.ensure(!step
																							.equals(normalStep));

																					// story node 'solve CSP'
																					try {
																						fujaba__Success = false;

																						_TmpObject = (this
																								.generateModel_solveCsp_BWD(
																										isApplicableMatch,
																										inFlow,
																										step,
																										inFlowToStep,
																										process,
																										defaultFlow,
																										exclusiveGateway,
																										divergeFlow,
																										normalStep,
																										alt,
																										initFlow,
																										defaultFlowToInitFlow,
																										egwToStep,
																										divergeFlowToAlt,
																										flow,
																										divergeFlowToFlow,
																										exConvGateway,
																										outFlow,
																										ecgwToStep,
																										outFlowToInitFlow,
																										outFlowToNormalStep,
																										lane,
																										laneSet,
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

																							// check object alt is really bound
																							JavaSDM.ensure(alt != null);
																							// check object defaultFlow is really bound
																							JavaSDM.ensure(defaultFlow != null);
																							// check object defaultFlowToInitFlow is really bound
																							JavaSDM.ensure(defaultFlowToInitFlow != null);
																							// check object divergeFlow is really bound
																							JavaSDM.ensure(divergeFlow != null);
																							// check object divergeFlowToAlt is really bound
																							JavaSDM.ensure(divergeFlowToAlt != null);
																							// check object divergeFlowToFlow is really bound
																							JavaSDM.ensure(divergeFlowToFlow != null);
																							// check object egwToStep is really bound
																							JavaSDM.ensure(egwToStep != null);
																							// check object exclusiveGateway is really bound
																							JavaSDM.ensure(exclusiveGateway != null);
																							// check object flow is really bound
																							JavaSDM.ensure(flow != null);
																							// check object inFlow is really bound
																							JavaSDM.ensure(inFlow != null);
																							// check object inFlowToStep is really bound
																							JavaSDM.ensure(inFlowToStep != null);
																							// check object initFlow is really bound
																							JavaSDM.ensure(initFlow != null);
																							// check object lane is really bound
																							JavaSDM.ensure(lane != null);
																							// check object laneSet is really bound
																							JavaSDM.ensure(laneSet != null);
																							// check object normalStep is really bound
																							JavaSDM.ensure(normalStep != null);
																							// check object process is really bound
																							JavaSDM.ensure(process != null);
																							// check object ruleResult is really bound
																							JavaSDM.ensure(ruleResult != null);
																							// check object step is really bound
																							JavaSDM.ensure(step != null);
																							// check isomorphic binding between objects divergeFlow and defaultFlow 
																							JavaSDM.ensure(!divergeFlow
																									.equals(defaultFlow));

																							// check isomorphic binding between objects inFlow and defaultFlow 
																							JavaSDM.ensure(!inFlow
																									.equals(defaultFlow));

																							// check isomorphic binding between objects divergeFlowToFlow and defaultFlowToInitFlow 
																							JavaSDM.ensure(!divergeFlowToFlow
																									.equals(defaultFlowToInitFlow));

																							// check isomorphic binding between objects inFlow and divergeFlow 
																							JavaSDM.ensure(!inFlow
																									.equals(divergeFlow));

																							// check isomorphic binding between objects initFlow and flow 
																							JavaSDM.ensure(!initFlow
																									.equals(flow));

																							// check isomorphic binding between objects step and normalStep 
																							JavaSDM.ensure(!step
																									.equals(normalStep));

																							// create object exConvGateway
																							exConvGateway = Bpmn2Factory.eINSTANCE
																									.createExclusiveGateway();

																							// create object outFlow
																							outFlow = Bpmn2Factory.eINSTANCE
																									.createSequenceFlow();

																							// create object ecgwToStep
																							ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createFlowNodeToStep();

																							// create object outFlowToNormalStep
																							outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createSequenceFlowToStep();

																							// create object outFlowToInitFlow
																							outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createSequenceFlowToUCFlow();

																							// assign attribute exConvGateway
																							exConvGateway
																									.setGatewayDirection((bpmn2.GatewayDirection) csp
																											.getAttributeVariable(
																													"exConvGateway",
																													"gatewayDirection")
																											.getValue());
																							// assign attribute ruleResult
																							ruleResult
																									.setSuccess(true);

																							// create link
																							exConvGateway
																									.getIncoming()
																									.add(inFlow);

																							// create link
																							process.getFlowElements()
																									.add(outFlow); // add link

																							// create link
																							process.getFlowElements()
																									.add(exConvGateway); // add link

																							// create link
																							ecgwToStep
																									.setTarget(normalStep);

																							// create link
																							outFlowToNormalStep
																									.setTarget(normalStep);

																							// create link
																							outFlowToInitFlow
																									.setTarget(initFlow);

																							// create link
																							outFlow.setSourceRef(exConvGateway);

																							// create link
																							ecgwToStep
																									.setSource(exConvGateway);

																							// create link
																							ruleResult
																									.getSourceObjects()
																									.add(exConvGateway);

																							// create link
																							lane.getFlowNodeRefs()
																									.add(exConvGateway);

																							// create link
																							ruleResult
																									.getSourceObjects()
																									.add(outFlow);

																							// create link
																							outFlowToInitFlow
																									.setSource(outFlow);

																							// create link
																							outFlowToNormalStep
																									.setSource(outFlow);

																							// create link
																							ruleResult
																									.getCorrObjects()
																									.add(ecgwToStep);

																							// create link
																							ruleResult
																									.getCorrObjects()
																									.add(outFlowToInitFlow);

																							// create link
																							ruleResult
																									.getCorrObjects()
																									.add(outFlowToNormalStep);

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
			SequenceFlow inFlow, Step step, SequenceFlowToStep inFlowToStep,
			bpmn2.Process process, SequenceFlow defaultFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow divergeFlow,
			NormalStep normalStep, AlternativeFlowAlternative alt,
			Flow initFlow, SequenceFlowToUCFlow defaultFlowToInitFlow,
			FlowNodeToStep egwToStep, SeqFlowToAltFlowAlt divergeFlowToAlt,
			AlternativeFlow flow, SequenceFlowToUCFlow divergeFlowToFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			FlowNodeToStep ecgwToStep, SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");
		literal0.setType("String");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Converging");
		literal1.setType("String");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());
		var_exclusiveGateway_gatewayDirection.setType("EObject");

		// Create explicit parameters

		// Create unbound variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", csp);
		var_exConvGateway_gatewayDirection.setType("EObject");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0
				.solve(var_exConvGateway_gatewayDirection, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
		isApplicableMatch.registerObject("egwToStep", egwToStep);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("divergeFlowToFlow", divergeFlowToFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
			return null;
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(AlternativeFlowAlternative) arguments.get(9),
					(Flow) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(FlowNodeToStep) arguments.get(12),
					(SeqFlowToAltFlowAlt) arguments.get(13),
					(AlternativeFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(ExclusiveGateway) arguments.get(16),
					(SequenceFlow) arguments.get(17), (Lane) arguments.get(18),
					(LaneSet) arguments.get(19));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
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
					(EObject) arguments.get(19), (EObject) arguments.get(20),
					(EObject) arguments.get(21), (EObject) arguments.get(22));
			return null;
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_118__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_118((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_119__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_119((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_120__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_120((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_121((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_122((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_123((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_124((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(NormalStep) arguments.get(8),
					(AlternativeFlowAlternative) arguments.get(9),
					(Flow) arguments.get(10),
					(SequenceFlowToUCFlow) arguments.get(11),
					(FlowNodeToStep) arguments.get(12),
					(SeqFlowToAltFlowAlt) arguments.get(13),
					(AlternativeFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15),
					(ExclusiveGateway) arguments.get(16),
					(SequenceFlow) arguments.get(17),
					(FlowNodeToStep) arguments.get(18),
					(SequenceFlowToUCFlow) arguments.get(19),
					(SequenceFlowToStep) arguments.get(20),
					(Lane) arguments.get(21), (LaneSet) arguments.get(22),
					(ModelgeneratorRuleResult) arguments.get(23));
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExcConvGwAfterExDivGwRuleImpl
