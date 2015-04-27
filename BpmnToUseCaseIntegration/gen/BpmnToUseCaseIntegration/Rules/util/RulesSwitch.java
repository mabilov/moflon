/**
 */
package BpmnToUseCaseIntegration.Rules.util;

import BpmnToUseCaseIntegration.Rules.*;

import TGGRuntime.AbstractRule;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE: {
			BpModelToUseCaseModelRule bpModelToUseCaseModelRule = (BpModelToUseCaseModelRule) theEObject;
			T result = caseBpModelToUseCaseModelRule(bpModelToUseCaseModelRule);
			if (result == null)
				result = caseAbstractRule(bpModelToUseCaseModelRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE: {
			DefinitionsToPackageRule definitionsToPackageRule = (DefinitionsToPackageRule) theEObject;
			T result = caseDefinitionsToPackageRule(definitionsToPackageRule);
			if (result == null)
				result = caseAbstractRule(definitionsToPackageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PROCESS_TO_USE_CASE_RULE: {
			ProcessToUseCaseRule processToUseCaseRule = (ProcessToUseCaseRule) theEObject;
			T result = caseProcessToUseCaseRule(processToUseCaseRule);
			if (result == null)
				result = caseAbstractRule(processToUseCaseRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK_TO_STEP_CORE_RULE: {
			TaskToStepCoreRule taskToStepCoreRule = (TaskToStepCoreRule) theEObject;
			T result = caseTaskToStepCoreRule(taskToStepCoreRule);
			if (result == null)
				result = caseAbstractRule(taskToStepCoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRST_SERVICE_TASK_TO_STEP_RULE: {
			FirstServiceTaskToStepRule firstServiceTaskToStepRule = (FirstServiceTaskToStepRule) theEObject;
			T result = caseFirstServiceTaskToStepRule(firstServiceTaskToStepRule);
			if (result == null)
				result = caseAbstractRule(firstServiceTaskToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRST_USER_TASK_TO_STEP_RULE: {
			FirstUserTaskToStepRule firstUserTaskToStepRule = (FirstUserTaskToStepRule) theEObject;
			T result = caseFirstUserTaskToStepRule(firstUserTaskToStepRule);
			if (result == null)
				result = caseAbstractRule(firstUserTaskToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LANE_SET_RULE: {
			LaneSetRule laneSetRule = (LaneSetRule) theEObject;
			T result = caseLaneSetRule(laneSetRule);
			if (result == null)
				result = caseAbstractRule(laneSetRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LANE_TO_ACTOR_RULE: {
			LaneToActorRule laneToActorRule = (LaneToActorRule) theEObject;
			T result = caseLaneToActorRule(laneToActorRule);
			if (result == null)
				result = caseAbstractRule(laneToActorRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK_TO_STEP_RULE: {
			TaskToStepRule taskToStepRule = (TaskToStepRule) theEObject;
			T result = caseTaskToStepRule(taskToStepRule);
			if (result == null)
				result = caseAbstractRule(taskToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_TASK_TO_STEP_RULE: {
			ServiceTaskToStepRule serviceTaskToStepRule = (ServiceTaskToStepRule) theEObject;
			T result = caseServiceTaskToStepRule(serviceTaskToStepRule);
			if (result == null)
				result = caseAbstractRule(serviceTaskToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USER_TASK_TO_STEP_RULE: {
			UserTaskToStepRule userTaskToStepRule = (UserTaskToStepRule) theEObject;
			T result = caseUserTaskToStepRule(userTaskToStepRule);
			if (result == null)
				result = caseAbstractRule(userTaskToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTER_EVENT_TO_STEP_CORE_RULE: {
			InterEventToStepCoreRule interEventToStepCoreRule = (InterEventToStepCoreRule) theEObject;
			T result = caseInterEventToStepCoreRule(interEventToStepCoreRule);
			if (result == null)
				result = caseAbstractRule(interEventToStepCoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ITE_TO_STEP_RULE: {
			ITEToStepRule iteToStepRule = (ITEToStepRule) theEObject;
			T result = caseITEToStepRule(iteToStepRule);
			if (result == null)
				result = caseAbstractRule(iteToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_RULE: {
			ICEToStepRule iceToStepRule = (ICEToStepRule) theEObject;
			T result = caseICEToStepRule(iceToStepRule);
			if (result == null)
				result = caseAbstractRule(iceToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.END_EVENT_RULE: {
			EndEventRule endEventRule = (EndEventRule) theEObject;
			T result = caseEndEventRule(endEventRule);
			if (result == null)
				result = caseAbstractRule(endEventRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE: {
			ExclusiveGatewayToStepCoreRule exclusiveGatewayToStepCoreRule = (ExclusiveGatewayToStepCoreRule) theEObject;
			T result = caseExclusiveGatewayToStepCoreRule(exclusiveGatewayToStepCoreRule);
			if (result == null)
				result = caseAbstractRule(exclusiveGatewayToStepCoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTER_EVENT_TO_STEP_RULE: {
			InterEventToStepRule interEventToStepRule = (InterEventToStepRule) theEObject;
			T result = caseInterEventToStepRule(interEventToStepRule);
			if (result == null)
				result = caseAbstractRule(interEventToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE: {
			FirstInterThrowEventToStepRule firstInterThrowEventToStepRule = (FirstInterThrowEventToStepRule) theEObject;
			T result = caseFirstInterThrowEventToStepRule(firstInterThrowEventToStepRule);
			if (result == null)
				result = caseAbstractRule(firstInterThrowEventToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRST_ICE_TO_STEP_RULE: {
			FirstICEToStepRule firstICEToStepRule = (FirstICEToStepRule) theEObject;
			T result = caseFirstICEToStepRule(firstICEToStepRule);
			if (result == null)
				result = caseAbstractRule(firstICEToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE: {
			ParallelGatewayToParallelStepCoreRule parallelGatewayToParallelStepCoreRule = (ParallelGatewayToParallelStepCoreRule) theEObject;
			T result = caseParallelGatewayToParallelStepCoreRule(parallelGatewayToParallelStepCoreRule);
			if (result == null)
				result = caseAbstractRule(parallelGatewayToParallelStepCoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE: {
			EventBasedGatewayToStepCoreRule eventBasedGatewayToStepCoreRule = (EventBasedGatewayToStepCoreRule) theEObject;
			T result = caseEventBasedGatewayToStepCoreRule(eventBasedGatewayToStepCoreRule);
			if (result == null)
				result = caseAbstractRule(eventBasedGatewayToStepCoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE: {
			ExclusiveConvergingGatewayRule exclusiveConvergingGatewayRule = (ExclusiveConvergingGatewayRule) theEObject;
			T result = caseExclusiveConvergingGatewayRule(exclusiveConvergingGatewayRule);
			if (result == null)
				result = caseAbstractRule(exclusiveConvergingGatewayRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE: {
			ParallelConvergingGatewayRule parallelConvergingGatewayRule = (ParallelConvergingGatewayRule) theEObject;
			T result = caseParallelConvergingGatewayRule(parallelConvergingGatewayRule);
			if (result == null)
				result = caseAbstractRule(parallelConvergingGatewayRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE: {
			SeqFlowAfterEGToAltFlowRule seqFlowAfterEGToAltFlowRule = (SeqFlowAfterEGToAltFlowRule) theEObject;
			T result = caseSeqFlowAfterEGToAltFlowRule(seqFlowAfterEGToAltFlowRule);
			if (result == null)
				result = caseAbstractRule(seqFlowAfterEGToAltFlowRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE: {
			SeqFlowAfterPGToParallelFlowRule seqFlowAfterPGToParallelFlowRule = (SeqFlowAfterPGToParallelFlowRule) theEObject;
			T result = caseSeqFlowAfterPGToParallelFlowRule(seqFlowAfterPGToParallelFlowRule);
			if (result == null)
				result = caseAbstractRule(seqFlowAfterPGToParallelFlowRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE: {
			CatchEventAfterEBGToStepRule catchEventAfterEBGToStepRule = (CatchEventAfterEBGToStepRule) theEObject;
			T result = caseCatchEventAfterEBGToStepRule(catchEventAfterEBGToStepRule);
			if (result == null)
				result = caseAbstractRule(catchEventAfterEBGToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE: {
			ExclusiveGatewayToStepRule exclusiveGatewayToStepRule = (ExclusiveGatewayToStepRule) theEObject;
			T result = caseExclusiveGatewayToStepRule(exclusiveGatewayToStepRule);
			if (result == null)
				result = caseAbstractRule(exclusiveGatewayToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE: {
			ParallelGatewayToParallelStepRule parallelGatewayToParallelStepRule = (ParallelGatewayToParallelStepRule) theEObject;
			T result = caseParallelGatewayToParallelStepRule(parallelGatewayToParallelStepRule);
			if (result == null)
				result = caseAbstractRule(parallelGatewayToParallelStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE: {
			EventBasedGatewayToStepRule eventBasedGatewayToStepRule = (EventBasedGatewayToStepRule) theEObject;
			T result = caseEventBasedGatewayToStepRule(eventBasedGatewayToStepRule);
			if (result == null)
				result = caseAbstractRule(eventBasedGatewayToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LANE_START_EVENT_RULE: {
			LaneStartEventRule laneStartEventRule = (LaneStartEventRule) theEObject;
			T result = caseLaneStartEventRule(laneStartEventRule);
			if (result == null)
				result = caseAbstractRule(laneStartEventRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE: {
			ExcConvGwAfterEventGwRule excConvGwAfterEventGwRule = (ExcConvGwAfterEventGwRule) theEObject;
			T result = caseExcConvGwAfterEventGwRule(excConvGwAfterEventGwRule);
			if (result == null)
				result = caseAbstractRule(excConvGwAfterEventGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXC_CONV_GW_DEFAULT_SEQ_FLOW_RULE: {
			ExcConvGwDefaultSeqFlowRule excConvGwDefaultSeqFlowRule = (ExcConvGwDefaultSeqFlowRule) theEObject;
			T result = caseExcConvGwDefaultSeqFlowRule(excConvGwDefaultSeqFlowRule);
			if (result == null)
				result = caseAbstractRule(excConvGwDefaultSeqFlowRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE: {
			ParallelConvergingGatewayTwoInputsRule parallelConvergingGatewayTwoInputsRule = (ParallelConvergingGatewayTwoInputsRule) theEObject;
			T result = caseParallelConvergingGatewayTwoInputsRule(parallelConvergingGatewayTwoInputsRule);
			if (result == null)
				result = caseAbstractRule(parallelConvergingGatewayTwoInputsRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE: {
			ExcConvGwAfterExDivGwRule excConvGwAfterExDivGwRule = (ExcConvGwAfterExDivGwRule) theEObject;
			T result = caseExcConvGwAfterExDivGwRule(excConvGwAfterExDivGwRule);
			if (result == null)
				result = caseAbstractRule(excConvGwAfterExDivGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE: {
			ExConvGwAfterEventGwIceSeqFlowRule exConvGwAfterEventGwIceSeqFlowRule = (ExConvGwAfterEventGwIceSeqFlowRule) theEObject;
			T result = caseExConvGwAfterEventGwIceSeqFlowRule(exConvGwAfterEventGwIceSeqFlowRule);
			if (result == null)
				result = caseAbstractRule(exConvGwAfterEventGwIceSeqFlowRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONTINUATION_RULE: {
			ContinuationRule continuationRule = (ContinuationRule) theEObject;
			T result = caseContinuationRule(continuationRule);
			if (result == null)
				result = caseAbstractRule(continuationRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_SE_RULE: {
			ICEToStepAfterSERule iceToStepAfterSERule = (ICEToStepAfterSERule) theEObject;
			T result = caseICEToStepAfterSERule(iceToStepAfterSERule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterSERule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_EX_GW_RULE: {
			ICEToStepAfterExGwRule iceToStepAfterExGwRule = (ICEToStepAfterExGwRule) theEObject;
			T result = caseICEToStepAfterExGwRule(iceToStepAfterExGwRule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterExGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_PG_RULE: {
			ICEToStepAfterPGRule iceToStepAfterPGRule = (ICEToStepAfterPGRule) theEObject;
			T result = caseICEToStepAfterPGRule(iceToStepAfterPGRule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterPGRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_TASK_RULE: {
			ICEToStepAfterTaskRule iceToStepAfterTaskRule = (ICEToStepAfterTaskRule) theEObject;
			T result = caseICEToStepAfterTaskRule(iceToStepAfterTaskRule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterTaskRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_EVENT_RULE: {
			ICEToStepAfterEventRule iceToStepAfterEventRule = (ICEToStepAfterEventRule) theEObject;
			T result = caseICEToStepAfterEventRule(iceToStepAfterEventRule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterEventRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE: {
			ICEToStepAfterExConvGwRule iceToStepAfterExConvGwRule = (ICEToStepAfterExConvGwRule) theEObject;
			T result = caseICEToStepAfterExConvGwRule(iceToStepAfterExConvGwRule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterExConvGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ICE_TO_STEP_AFTER_PCONV_GW_RULE: {
			ICEToStepAfterPConvGwRule iceToStepAfterPConvGwRule = (ICEToStepAfterPConvGwRule) theEObject;
			T result = caseICEToStepAfterPConvGwRule(iceToStepAfterPConvGwRule);
			if (result == null)
				result = caseAbstractRule(iceToStepAfterPConvGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_SE_RULE: {
			ServiceTaskToStepAfterSERule serviceTaskToStepAfterSERule = (ServiceTaskToStepAfterSERule) theEObject;
			T result = caseServiceTaskToStepAfterSERule(serviceTaskToStepAfterSERule);
			if (result == null)
				result = caseAbstractRule(serviceTaskToStepAfterSERule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EX_GW_RULE: {
			ServiceTaskToStepAfterExGwRule serviceTaskToStepAfterExGwRule = (ServiceTaskToStepAfterExGwRule) theEObject;
			T result = caseServiceTaskToStepAfterExGwRule(serviceTaskToStepAfterExGwRule);
			if (result == null)
				result = caseAbstractRule(serviceTaskToStepAfterExGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_PG_RULE: {
			ServiceTaskToStepAfterPGRule serviceTaskToStepAfterPGRule = (ServiceTaskToStepAfterPGRule) theEObject;
			T result = caseServiceTaskToStepAfterPGRule(serviceTaskToStepAfterPGRule);
			if (result == null)
				result = caseAbstractRule(serviceTaskToStepAfterPGRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE: {
			ServiceTaskToStepAfterEvGwRule serviceTaskToStepAfterEvGwRule = (ServiceTaskToStepAfterEvGwRule) theEObject;
			T result = caseServiceTaskToStepAfterEvGwRule(serviceTaskToStepAfterEvGwRule);
			if (result == null)
				result = caseAbstractRule(serviceTaskToStepAfterEvGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USER_TASK_TO_STEP_AFTER_SE_RULE: {
			UserTaskToStepAfterSERule userTaskToStepAfterSERule = (UserTaskToStepAfterSERule) theEObject;
			T result = caseUserTaskToStepAfterSERule(userTaskToStepAfterSERule);
			if (result == null)
				result = caseAbstractRule(userTaskToStepAfterSERule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EX_GW_RULE: {
			UserTaskToStepAfterExGwRule userTaskToStepAfterExGwRule = (UserTaskToStepAfterExGwRule) theEObject;
			T result = caseUserTaskToStepAfterExGwRule(userTaskToStepAfterExGwRule);
			if (result == null)
				result = caseAbstractRule(userTaskToStepAfterExGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USER_TASK_TO_STEP_AFTER_PG_RULE: {
			UserTaskToStepAfterPGRule userTaskToStepAfterPGRule = (UserTaskToStepAfterPGRule) theEObject;
			T result = caseUserTaskToStepAfterPGRule(userTaskToStepAfterPGRule);
			if (result == null)
				result = caseAbstractRule(userTaskToStepAfterPGRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE: {
			UserTaskToStepAfterEvGwRule userTaskToStepAfterEvGwRule = (UserTaskToStepAfterEvGwRule) theEObject;
			T result = caseUserTaskToStepAfterEvGwRule(userTaskToStepAfterEvGwRule);
			if (result == null)
				result = caseAbstractRule(userTaskToStepAfterEvGwRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Model To Use Case Model Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Model To Use Case Model Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpModelToUseCaseModelRule(BpModelToUseCaseModelRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions To Package Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions To Package Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsToPackageRule(DefinitionsToPackageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process To Use Case Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process To Use Case Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessToUseCaseRule(ProcessToUseCaseRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task To Step Core Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskToStepCoreRule(TaskToStepCoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Service Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Service Task To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstServiceTaskToStepRule(FirstServiceTaskToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First User Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First User Task To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstUserTaskToStepRule(FirstUserTaskToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane Set Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane Set Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaneSetRule(LaneSetRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane To Actor Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane To Actor Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaneToActorRule(LaneToActorRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskToStepRule(TaskToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTaskToStepRule(ServiceTaskToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTaskToStepRule(UserTaskToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Event To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Event To Step Core Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterEventToStepCoreRule(InterEventToStepCoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITE To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITE To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITEToStepRule(ITEToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepRule(ICEToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEventRule(EndEventRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Gateway To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Gateway To Step Core Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveGatewayToStepCoreRule(
			ExclusiveGatewayToStepCoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterEventToStepRule(InterEventToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Inter Throw Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Inter Throw Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstInterThrowEventToStepRule(
			FirstInterThrowEventToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First ICE To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First ICE To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstICEToStepRule(FirstICEToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Gateway To Parallel Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Gateway To Parallel Step Core Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelGatewayToParallelStepCoreRule(
			ParallelGatewayToParallelStepCoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Based Gateway To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Based Gateway To Step Core Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBasedGatewayToStepCoreRule(
			EventBasedGatewayToStepCoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Converging Gateway Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Converging Gateway Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveConvergingGatewayRule(
			ExclusiveConvergingGatewayRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Converging Gateway Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Converging Gateway Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelConvergingGatewayRule(
			ParallelConvergingGatewayRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Flow After EG To Alt Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Flow After EG To Alt Flow Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqFlowAfterEGToAltFlowRule(SeqFlowAfterEGToAltFlowRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Flow After PG To Parallel Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Flow After PG To Parallel Flow Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqFlowAfterPGToParallelFlowRule(
			SeqFlowAfterPGToParallelFlowRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Event After EBG To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Event After EBG To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchEventAfterEBGToStepRule(
			CatchEventAfterEBGToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Gateway To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Gateway To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveGatewayToStepRule(ExclusiveGatewayToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Gateway To Parallel Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Gateway To Parallel Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelGatewayToParallelStepRule(
			ParallelGatewayToParallelStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Based Gateway To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Based Gateway To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBasedGatewayToStepRule(EventBasedGatewayToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane Start Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane Start Event Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaneStartEventRule(LaneStartEventRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exc Conv Gw After Event Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exc Conv Gw After Event Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcConvGwAfterEventGwRule(ExcConvGwAfterEventGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exc Conv Gw Default Seq Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exc Conv Gw Default Seq Flow Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcConvGwDefaultSeqFlowRule(ExcConvGwDefaultSeqFlowRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Converging Gateway Two Inputs Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Converging Gateway Two Inputs Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelConvergingGatewayTwoInputsRule(
			ParallelConvergingGatewayTwoInputsRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exc Conv Gw After Ex Div Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exc Conv Gw After Ex Div Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcConvGwAfterExDivGwRule(ExcConvGwAfterExDivGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex Conv Gw After Event Gw Ice Seq Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex Conv Gw After Event Gw Ice Seq Flow Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExConvGwAfterEventGwIceSeqFlowRule(
			ExConvGwAfterEventGwIceSeqFlowRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuationRule(ContinuationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After SE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After SE Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterSERule(ICEToStepAfterSERule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After Ex Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After Ex Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterExGwRule(ICEToStepAfterExGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After PG Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After PG Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterPGRule(ICEToStepAfterPGRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After Task Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After Task Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterTaskRule(ICEToStepAfterTaskRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After Event Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterEventRule(ICEToStepAfterEventRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After Ex Conv Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After Ex Conv Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterExConvGwRule(ICEToStepAfterExConvGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICE To Step After PConv Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICE To Step After PConv Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICEToStepAfterPConvGwRule(ICEToStepAfterPConvGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task To Step After SE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task To Step After SE Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTaskToStepAfterSERule(
			ServiceTaskToStepAfterSERule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task To Step After Ex Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task To Step After Ex Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTaskToStepAfterExGwRule(
			ServiceTaskToStepAfterExGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task To Step After PG Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task To Step After PG Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTaskToStepAfterPGRule(
			ServiceTaskToStepAfterPGRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task To Step After Ev Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task To Step After Ev Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTaskToStepAfterEvGwRule(
			ServiceTaskToStepAfterEvGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task To Step After SE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task To Step After SE Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTaskToStepAfterSERule(UserTaskToStepAfterSERule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task To Step After Ex Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task To Step After Ex Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTaskToStepAfterExGwRule(UserTaskToStepAfterExGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task To Step After PG Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task To Step After PG Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTaskToStepAfterPGRule(UserTaskToStepAfterPGRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task To Step After Ev Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task To Step After Ev Gw Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTaskToStepAfterEvGwRule(UserTaskToStepAfterEvGwRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
