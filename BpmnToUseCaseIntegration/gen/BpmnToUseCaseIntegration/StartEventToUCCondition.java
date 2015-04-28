/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.UCCondition;

import bpmn2.StartEvent;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event To UC Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.StartEventToUCCondition#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.StartEventToUCCondition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getStartEventToUCCondition()
 * @model
 * @generated
 */
public interface StartEventToUCCondition extends EObject,
		AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StartEvent)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getStartEventToUCCondition_Source()
	 * @model required="true"
	 * @generated
	 */
	StartEvent getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.StartEventToUCCondition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StartEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UCCondition)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getStartEventToUCCondition_Target()
	 * @model required="true"
	 * @generated
	 */
	UCCondition getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.StartEventToUCCondition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UCCondition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StartEventToUCCondition
