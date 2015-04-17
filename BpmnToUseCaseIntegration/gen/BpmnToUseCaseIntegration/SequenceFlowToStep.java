/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.Step;

import bpmn2.SequenceFlow;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow To Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.SequenceFlowToStep#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.SequenceFlowToStep#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getSequenceFlowToStep()
 * @model
 * @generated
 */
public interface SequenceFlowToStep extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SequenceFlow)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getSequenceFlowToStep_Source()
	 * @model required="true"
	 * @generated
	 */
	SequenceFlow getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.SequenceFlowToStep#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Step)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getSequenceFlowToStep_Target()
	 * @model required="true"
	 * @generated
	 */
	Step getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.SequenceFlowToStep#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Step value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SequenceFlowToStep
