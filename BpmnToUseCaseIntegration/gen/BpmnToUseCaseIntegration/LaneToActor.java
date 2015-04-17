/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.Actor;

import bpmn2.Lane;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane To Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.LaneToActor#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.LaneToActor#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getLaneToActor()
 * @model
 * @generated
 */
public interface LaneToActor extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Lane)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getLaneToActor_Source()
	 * @model required="true"
	 * @generated
	 */
	Lane getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.LaneToActor#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Lane value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Actor)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getLaneToActor_Target()
	 * @model required="true"
	 * @generated
	 */
	Actor getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.LaneToActor#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Actor value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LaneToActor
