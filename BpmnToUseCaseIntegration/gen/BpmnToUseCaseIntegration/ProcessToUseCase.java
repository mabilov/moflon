/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.UseCase;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process To Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.ProcessToUseCase#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.ProcessToUseCase#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getProcessToUseCase()
 * @model
 * @generated
 */
public interface ProcessToUseCase extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(bpmn2.Process)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getProcessToUseCase_Source()
	 * @model required="true"
	 * @generated
	 */
	bpmn2.Process getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.ProcessToUseCase#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(bpmn2.Process value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UseCase)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getProcessToUseCase_Target()
	 * @model required="true"
	 * @generated
	 */
	UseCase getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.ProcessToUseCase#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCase value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ProcessToUseCase
