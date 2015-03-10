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

import BpmnToUseCaseIntegration.Rules.LaneStartEventRule;
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
 * An implementation of the model object '<em><b>Lane Start Event Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaneStartEventRuleImpl extends AbstractRuleImpl implements
		LaneStartEventRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneStartEventRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLaneStartEventRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __lane_flowNodeRefs_flowNode = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_flowElements_flowNode = null;
		EMoflonEdge __process_laneSets_laneSet = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, lane,
					flowNode, process, laneSet));

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

				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __lane_flowNodeRefs_flowNode
				__lane_flowNodeRefs_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __lane_flowNodeRefs_flowNode
				__lane_flowNodeRefs_flowNode.setName("flowNodeRefs");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__lane_flowNodeRefs_flowNode, "toBeTranslatedEdges");

				// create link
				__lane_flowNodeRefs_flowNode.setSrc(lane);

				// create link
				__lane_flowNodeRefs_flowNode.setTrg(flowNode);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_flowNode
				__process_flowElements_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_flowNode
				__process_flowElements_flowNode.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flowNode, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_flowNode, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "contextNodes");

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__process_flowElements_flowNode.setTrg(flowNode);

				// create link
				__process_flowElements_flowNode.setSrc(process);

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, lane, flowNode, process,
					laneSet);
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
		StartEvent flowNode = null;
		Lane lane = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __lane_flowNodeRefs_flowNode = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			flowNode = (StartEvent) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
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
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object flowNode is really bound
			JavaSDM.ensure(flowNode != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects lane and flowNode 
			JavaSDM.ensure(!lane.equals(flowNode));

			// check isomorphic binding between objects laneSet and flowNode 
			JavaSDM.ensure(!laneSet.equals(flowNode));

			// check isomorphic binding between objects process and flowNode 
			JavaSDM.ensure(!process.equals(flowNode));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// create object __lane_flowNodeRefs_flowNode
			__lane_flowNodeRefs_flowNode = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("LaneStartEventRule");
			// assign attribute __lane_flowNodeRefs_flowNode
			__lane_flowNodeRefs_flowNode.setName("flowNodeRefs");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__lane_flowNodeRefs_flowNode, "translatedEdges");

			// create link
			__lane_flowNodeRefs_flowNode.setSrc(lane);

			// create link
			__lane_flowNodeRefs_flowNode.setTrg(flowNode);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, lane, flowNode, process, laneSet);
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
		StartEvent flowNode = null;
		Lane lane = null;
		LaneSet laneSet = null;
		bpmn2.Process process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __lane_flowNodeRefs_flowNode = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_flowElements_flowNode = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		CSP csp = null;

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
			ruleresult.setRule("LaneStartEventRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("flowNode"));

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			flowNode = (StartEvent) _TmpObject;
			_TmpObject = (match.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (match.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// story node 'find context'
			try {
				fujaba__Success = false;

				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link flowElements from flowNode to process
				JavaSDM.ensure(process.equals(flowNode.eContainer()));

				// check link laneSets from laneSet to process
				JavaSDM.ensure(process.equals(laneSet.eContainer()));

				// check link lanes from lane to laneSet
				JavaSDM.ensure(laneSet.equals(lane.eContainer()));

				// check link flowNodeRefs from flowNode to lane
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(flowNode, Lane.class,
								"flowNodeRefs").contains(lane));

				// create object isApplicableMatch
				isApplicableMatch = TGGRuntimeFactory.eINSTANCE
						.createIsApplicableMatch();

				// create object __lane_flowNodeRefs_flowNode
				__lane_flowNodeRefs_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_flowNode
				__process_flowElements_flowNode = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __lane_flowNodeRefs_flowNode
				__lane_flowNodeRefs_flowNode.setName("flowNodeRefs");
				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __process_flowElements_flowNode
				__process_flowElements_flowNode.setName("flowElements");
				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				isApplicableMatch.getAllContextElements().add(lane);

				// create link
				__lane_flowNodeRefs_flowNode.setSrc(lane);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				// create link
				__lane_flowNodeRefs_flowNode.setTrg(flowNode);

				// create link
				isApplicableMatch.getAllContextElements().add(flowNode);

				// create link
				__process_flowElements_flowNode.setTrg(flowNode);

				// create link
				__process_flowElements_flowNode.setSrc(process);

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				isApplicableMatch.getAllContextElements().add(process);

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				isApplicableMatch.getAllContextElements().add(laneSet);

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(
						isApplicableMatch, __laneSet_lanes_lane,
						"allContextElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(
						isApplicableMatch, __lane_flowNodeRefs_flowNode,
						"allContextElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(
						isApplicableMatch, __process_flowElements_flowNode,
						"allContextElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(
						isApplicableMatch, __process_laneSets_laneSet,
						"allContextElements");
				// story node 'solve CSP'
				try {
					fujaba__Success = false;

					_TmpObject = (this
							.isApplicable_solveCsp_FWD(isApplicableMatch, lane,
									flowNode, process, laneSet));

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
						// assign attribute isApplicableMatch
						isApplicableMatch.setRuleName("LaneStartEventRule");
						// assign attribute ruleresult
						ruleresult.setSuccess(true);

						// create link
						ruleresult.getIsApplicableMatch()
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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		match.registerObject("lane", lane);
		match.registerObject("flowNode", flowNode);
		match.registerObject("process", process);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Lane lane,
			StartEvent flowNode, bpmn2.Process process, LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			Lane lane, StartEvent flowNode, bpmn2.Process process,
			LaneSet laneSet) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("flowNode", flowNode);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("laneSet", laneSet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject lane,
			EObject flowNode, EObject process, EObject laneSet) {
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("flowNode", flowNode);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_93(
			EMoflonEdge _edge_flowNodeRefs) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Match match = null;
		bpmn2.Process process = null;
		StartEvent flowNode = null;
		LaneSet laneSet = null;
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
			laneSet = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
					.eContainer() : null;

			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);

			// check if contained via correct reference
			JavaSDM.ensure(laneSet.getLanes().contains(lane));

			// bind object
			_TmpObject = _edge_flowNodeRefs.getTrg();

			// ensure correct type and really bound of object flowNode
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			flowNode = (StartEvent) _TmpObject;

			// bind object
			_TmpObject = flowNode.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) flowNode
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(flowNode));

			// check link laneSets from laneSet to process
			JavaSDM.ensure(process.equals(laneSet.eContainer()));

			// check link flowNodeRefs from flowNode to lane
			JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil.getOppositeReference(
					flowNode, Lane.class, "flowNodeRefs").contains(lane));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check object _edge_flowNodeRefs is really bound
				JavaSDM.ensure(_edge_flowNodeRefs != null);
				// check object flowNode is really bound
				JavaSDM.ensure(flowNode != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link flowElements from flowNode to process
				JavaSDM.ensure(process.equals(flowNode.eContainer()));

				// check link laneSets from laneSet to process
				JavaSDM.ensure(process.equals(laneSet.eContainer()));

				// check link lanes from lane to laneSet
				JavaSDM.ensure(laneSet.equals(lane.eContainer()));

				// check link src from _edge_flowNodeRefs to lane
				JavaSDM.ensure(lane.equals(_edge_flowNodeRefs.getSrc()));

				// check link trg from _edge_flowNodeRefs to flowNode
				JavaSDM.ensure(flowNode.equals(_edge_flowNodeRefs.getTrg()));

				// check link flowNodeRefs from flowNode to lane
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(flowNode, Lane.class,
								"flowNodeRefs").contains(lane));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, lane, flowNode,
						process, laneSet);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_FWD__MATCH_LANE_STARTEVENT_PROCESS_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
		case RulesPackage.LANE_START_EVENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LANE_STARTEVENT_PROCESS_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
			return null;
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LANE_STARTEVENT_PROCESS_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LANE_STARTEVENT_PROCESS_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Lane) arguments.get(1), (StartEvent) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(LaneSet) arguments.get(4));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.LANE_START_EVENT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_93((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_START_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LaneStartEventRuleImpl
