/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.Step;

import bpmn2.FlowNode;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node To Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.FlowNodeToStep#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.FlowNodeToStep#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getFlowNodeToStep()
 * @model
 * @generated
 */
public interface FlowNodeToStep extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FlowNode)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getFlowNodeToStep_Source()
	 * @model required="true"
	 * @generated
	 */
	FlowNode getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.FlowNodeToStep#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowNode value);

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
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getFlowNodeToStep_Target()
	 * @model required="true"
	 * @generated
	 */
	Step getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.FlowNodeToStep#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Step value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FlowNodeToStep
