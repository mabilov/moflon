/**
 */
package UseCaseToModalSequenceDiagramIntegration.util;

import TGGRuntime.AbstractCorrespondence;

import UseCaseToModalSequenceDiagramIntegration.*;

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
 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage
 * @generated
 */
public class UseCaseToModalSequenceDiagramIntegrationSwitch<T> extends
		Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UseCaseToModalSequenceDiagramIntegrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationSwitch() {
		if (modelPackage == null) {
			modelPackage = UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE;
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASES_MODEL_TO_MODEL: {
			UseCasesModelToModel useCasesModelToModel = (UseCasesModelToModel) theEObject;
			T result = caseUseCasesModelToModel(useCasesModelToModel);
			if (result == null)
				result = caseAbstractCorrespondence(useCasesModelToModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.PACKAGE_DECLARATION_TO_PACKAGE: {
			PackageDeclarationToPackage packageDeclarationToPackage = (PackageDeclarationToPackage) theEObject;
			T result = casePackageDeclarationToPackage(packageDeclarationToPackage);
			if (result == null)
				result = caseAbstractCorrespondence(packageDeclarationToPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASE_TO_INTERACTION: {
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) theEObject;
			T result = caseUseCaseToInteraction(useCaseToInteraction);
			if (result == null)
				result = caseAbstractCorrespondence(useCaseToInteraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.NORMAL_STEP_TO_MESSAGE: {
			NormalStepToMessage normalStepToMessage = (NormalStepToMessage) theEObject;
			T result = caseNormalStepToMessage(normalStepToMessage);
			if (result == null)
				result = caseAbstractCorrespondence(normalStepToMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.ACTOR_TO_LIFELINE: {
			ActorToLifeline actorToLifeline = (ActorToLifeline) theEObject;
			T result = caseActorToLifeline(actorToLifeline);
			if (result == null)
				result = caseAbstractCorrespondence(actorToLifeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.FLOW_TO_INTERACTION_FRAGMENT: {
			FlowToInteractionFragment flowToInteractionFragment = (FlowToInteractionFragment) theEObject;
			T result = caseFlowToInteractionFragment(flowToInteractionFragment);
			if (result == null)
				result = caseAbstractCorrespondence(flowToInteractionFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND: {
			StepAlternativeToInteractionOperand stepAlternativeToInteractionOperand = (StepAlternativeToInteractionOperand) theEObject;
			T result = caseStepAlternativeToInteractionOperand(stepAlternativeToInteractionOperand);
			if (result == null)
				result = caseAbstractCorrespondence(stepAlternativeToInteractionOperand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT: {
			ParallelStepToCombinedFragment parallelStepToCombinedFragment = (ParallelStepToCombinedFragment) theEObject;
			T result = caseParallelStepToCombinedFragment(parallelStepToCombinedFragment);
			if (result == null)
				result = caseAbstractCorrespondence(parallelStepToCombinedFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseToModalSequenceDiagramIntegrationPackage.NORMAL_STEP_TO_COMBINED_FRAGMENT: {
			NormalStepToCombinedFragment normalStepToCombinedFragment = (NormalStepToCombinedFragment) theEObject;
			T result = caseNormalStepToCombinedFragment(normalStepToCombinedFragment);
			if (result == null)
				result = caseAbstractCorrespondence(normalStepToCombinedFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Cases Model To Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Cases Model To Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCasesModelToModel(UseCasesModelToModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Declaration To Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Declaration To Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDeclarationToPackage(PackageDeclarationToPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case To Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case To Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCaseToInteraction(UseCaseToInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step To Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step To Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepToMessage(NormalStepToMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor To Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor To Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorToLifeline(ActorToLifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow To Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow To Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowToInteractionFragment(FlowToInteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Alternative To Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Alternative To Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepAlternativeToInteractionOperand(
			StepAlternativeToInteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Step To Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Step To Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelStepToCombinedFragment(
			ParallelStepToCombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step To Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step To Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepToCombinedFragment(
			NormalStepToCombinedFragment object) {
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

} //UseCaseToModalSequenceDiagramIntegrationSwitch
