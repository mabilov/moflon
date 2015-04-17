/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.AlternativeFlowAlternative;

import bpmn2.SequenceFlow;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Flow To Alt Flow Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getSeqFlowToAltFlowAlt()
 * @model
 * @generated
 */
public interface SeqFlowToAltFlowAlt extends EObject, AbstractCorrespondence {
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
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getSeqFlowToAltFlowAlt_Source()
	 * @model required="true"
	 * @generated
	 */
	SequenceFlow getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(AlternativeFlowAlternative)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getSeqFlowToAltFlowAlt_Target()
	 * @model required="true"
	 * @generated
	 */
	AlternativeFlowAlternative getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AlternativeFlowAlternative value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SeqFlowToAltFlowAlt
