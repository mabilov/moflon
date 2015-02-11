/**
 */
package BpmnToUseCaseIntegration.util;

import BpmnToUseCaseIntegration.*;

import TGGRuntime.AbstractCorrespondence;

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
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage
 * @generated
 */
public class BpmnToUseCaseIntegrationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnToUseCaseIntegrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationSwitch() {
		if (modelPackage == null) {
			modelPackage = BpmnToUseCaseIntegrationPackage.eINSTANCE;
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
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL: {
			DocumentRootToUseCasesModel documentRootToUseCasesModel = (DocumentRootToUseCasesModel) theEObject;
			T result = caseDocumentRootToUseCasesModel(documentRootToUseCasesModel);
			if (result == null)
				result = caseAbstractCorrespondence(documentRootToUseCasesModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.DEFINITIONS_TO_PACKAGE_DECLARATION: {
			DefinitionsToPackageDeclaration definitionsToPackageDeclaration = (DefinitionsToPackageDeclaration) theEObject;
			T result = caseDefinitionsToPackageDeclaration(definitionsToPackageDeclaration);
			if (result == null)
				result = caseAbstractCorrespondence(definitionsToPackageDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_USE_CASE: {
			ProcessToUseCase processToUseCase = (ProcessToUseCase) theEObject;
			T result = caseProcessToUseCase(processToUseCase);
			if (result == null)
				result = caseAbstractCorrespondence(processToUseCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.START_EVENT_TO_USE_CASE: {
			StartEventToUseCase startEventToUseCase = (StartEventToUseCase) theEObject;
			T result = caseStartEventToUseCase(startEventToUseCase);
			if (result == null)
				result = caseAbstractCorrespondence(startEventToUseCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.START_EVENT_TO_BASIC_FLOW: {
			StartEventToBasicFlow startEventToBasicFlow = (StartEventToBasicFlow) theEObject;
			T result = caseStartEventToBasicFlow(startEventToBasicFlow);
			if (result == null)
				result = caseAbstractCorrespondence(startEventToBasicFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.SEQUENCE_FLOW_TO_UC_FLOW: {
			SequenceFlowToUCFlow sequenceFlowToUCFlow = (SequenceFlowToUCFlow) theEObject;
			T result = caseSequenceFlowToUCFlow(sequenceFlowToUCFlow);
			if (result == null)
				result = caseAbstractCorrespondence(sequenceFlowToUCFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR: {
			ProcessToActor processToActor = (ProcessToActor) theEObject;
			T result = caseProcessToActor(processToActor);
			if (result == null)
				result = caseAbstractCorrespondence(processToActor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.FLOW_NODE_TO_STEP: {
			FlowNodeToStep flowNodeToStep = (FlowNodeToStep) theEObject;
			T result = caseFlowNodeToStep(flowNodeToStep);
			if (result == null)
				result = caseAbstractCorrespondence(flowNodeToStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.SEQUENCE_FLOW_TO_STEP: {
			SequenceFlowToStep sequenceFlowToStep = (SequenceFlowToStep) theEObject;
			T result = caseSequenceFlowToStep(sequenceFlowToStep);
			if (result == null)
				result = caseAbstractCorrespondence(sequenceFlowToStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.LANE_TO_ACTOR: {
			LaneToActor laneToActor = (LaneToActor) theEObject;
			T result = caseLaneToActor(laneToActor);
			if (result == null)
				result = caseAbstractCorrespondence(laneToActor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE: {
			SequenceFlowToAlternativeFlowAlternative sequenceFlowToAlternativeFlowAlternative = (SequenceFlowToAlternativeFlowAlternative) theEObject;
			T result = caseSequenceFlowToAlternativeFlowAlternative(sequenceFlowToAlternativeFlowAlternative);
			if (result == null)
				result = caseAbstractCorrespondence(sequenceFlowToAlternativeFlowAlternative);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW: {
			IntermediateCatchEventToAlternativeFlow intermediateCatchEventToAlternativeFlow = (IntermediateCatchEventToAlternativeFlow) theEObject;
			T result = caseIntermediateCatchEventToAlternativeFlow(intermediateCatchEventToAlternativeFlow);
			if (result == null)
				result = caseAbstractCorrespondence(intermediateCatchEventToAlternativeFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_FLOW: {
			EndEventToFlow endEventToFlow = (EndEventToFlow) theEObject;
			T result = caseEndEventToFlow(endEventToFlow);
			if (result == null)
				result = caseAbstractCorrespondence(endEventToFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root To Use Cases Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root To Use Cases Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRootToUseCasesModel(DocumentRootToUseCasesModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions To Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions To Package Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsToPackageDeclaration(
			DefinitionsToPackageDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process To Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process To Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessToUseCase(ProcessToUseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event To Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event To Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEventToUseCase(StartEventToUseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event To Basic Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event To Basic Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEventToBasicFlow(StartEventToBasicFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow To UC Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow To UC Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlowToUCFlow(SequenceFlowToUCFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process To Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process To Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessToActor(ProcessToActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node To Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node To Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNodeToStep(FlowNodeToStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow To Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow To Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlowToStep(SequenceFlowToStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane To Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane To Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaneToActor(LaneToActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow To Alternative Flow Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow To Alternative Flow Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlowToAlternativeFlowAlternative(
			SequenceFlowToAlternativeFlowAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Catch Event To Alternative Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Catch Event To Alternative Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateCatchEventToAlternativeFlow(
			IntermediateCatchEventToAlternativeFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event To Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event To Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEventToFlow(EndEventToFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //BpmnToUseCaseIntegrationSwitch
