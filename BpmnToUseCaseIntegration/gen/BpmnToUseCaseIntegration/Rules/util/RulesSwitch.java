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
	 * @parameter ePackage the package in question.
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
				result = caseTaskToStepCoreRule(firstServiceTaskToStepRule);
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
				result = caseTaskToStepCoreRule(firstUserTaskToStepRule);
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
				result = caseTaskToStepCoreRule(taskToStepRule);
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
				result = caseTaskToStepRule(serviceTaskToStepRule);
			if (result == null)
				result = caseTaskToStepCoreRule(serviceTaskToStepRule);
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
				result = caseTaskToStepRule(userTaskToStepRule);
			if (result == null)
				result = caseTaskToStepCoreRule(userTaskToStepRule);
			if (result == null)
				result = caseAbstractRule(userTaskToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERMEDIATE_EVENT_TO_STEP_CORE_RULE: {
			IntermediateEventToStepCoreRule intermediateEventToStepCoreRule = (IntermediateEventToStepCoreRule) theEObject;
			T result = caseIntermediateEventToStepCoreRule(intermediateEventToStepCoreRule);
			if (result == null)
				result = caseAbstractRule(intermediateEventToStepCoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE: {
			IntermediateThrowEventToStepRule intermediateThrowEventToStepRule = (IntermediateThrowEventToStepRule) theEObject;
			T result = caseIntermediateThrowEventToStepRule(intermediateThrowEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepRule(intermediateThrowEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepCoreRule(intermediateThrowEventToStepRule);
			if (result == null)
				result = caseAbstractRule(intermediateThrowEventToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE: {
			IntermediateCatchEventToStepRule intermediateCatchEventToStepRule = (IntermediateCatchEventToStepRule) theEObject;
			T result = caseIntermediateCatchEventToStepRule(intermediateCatchEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepRule(intermediateCatchEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepCoreRule(intermediateCatchEventToStepRule);
			if (result == null)
				result = caseAbstractRule(intermediateCatchEventToStepRule);
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
		case RulesPackage.INTERMEDIATE_EVENT_TO_STEP_RULE: {
			IntermediateEventToStepRule intermediateEventToStepRule = (IntermediateEventToStepRule) theEObject;
			T result = caseIntermediateEventToStepRule(intermediateEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepCoreRule(intermediateEventToStepRule);
			if (result == null)
				result = caseAbstractRule(intermediateEventToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE: {
			FirstIntermediateThrowEventToStepRule firstIntermediateThrowEventToStepRule = (FirstIntermediateThrowEventToStepRule) theEObject;
			T result = caseFirstIntermediateThrowEventToStepRule(firstIntermediateThrowEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepCoreRule(firstIntermediateThrowEventToStepRule);
			if (result == null)
				result = caseAbstractRule(firstIntermediateThrowEventToStepRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE: {
			FirstIntermediateCatchEventToStepRule firstIntermediateCatchEventToStepRule = (FirstIntermediateCatchEventToStepRule) theEObject;
			T result = caseFirstIntermediateCatchEventToStepRule(firstIntermediateCatchEventToStepRule);
			if (result == null)
				result = caseIntermediateEventToStepCoreRule(firstIntermediateCatchEventToStepRule);
			if (result == null)
				result = caseAbstractRule(firstIntermediateCatchEventToStepRule);
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
				result = caseExclusiveGatewayToStepCoreRule(exclusiveGatewayToStepRule);
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
				result = caseParallelGatewayToParallelStepCoreRule(parallelGatewayToParallelStepRule);
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
				result = caseEventBasedGatewayToStepCoreRule(eventBasedGatewayToStepRule);
			if (result == null)
				result = caseAbstractRule(eventBasedGatewayToStepRule);
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
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event To Step Core Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEventToStepCoreRule(
			IntermediateEventToStepCoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Throw Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Throw Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateThrowEventToStepRule(
			IntermediateThrowEventToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Catch Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Catch Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateCatchEventToStepRule(
			IntermediateCatchEventToStepRule object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEventToStepRule(IntermediateEventToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Intermediate Throw Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Intermediate Throw Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstIntermediateThrowEventToStepRule(
			FirstIntermediateThrowEventToStepRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Intermediate Catch Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Intermediate Catch Event To Step Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstIntermediateCatchEventToStepRule(
			FirstIntermediateCatchEventToStepRule object) {
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
