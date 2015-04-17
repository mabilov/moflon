/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.AlternativeFlow;

import bpmn2.IntermediateCatchEvent;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICE To Alt Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.ICEToAltFlow#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.ICEToAltFlow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getICEToAltFlow()
 * @model
 * @generated
 */
public interface ICEToAltFlow extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IntermediateCatchEvent)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getICEToAltFlow_Source()
	 * @model required="true"
	 * @generated
	 */
	IntermediateCatchEvent getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.ICEToAltFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IntermediateCatchEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AlternativeFlow)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getICEToAltFlow_Target()
	 * @model required="true"
	 * @generated
	 */
	AlternativeFlow getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.ICEToAltFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AlternativeFlow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ICEToAltFlow
