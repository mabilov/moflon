/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.InteractionUse#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link ModalSequenceDiagram.InteractionUse#getArgument <em>Argument</em>}</li>
 *   <li>{@link ModalSequenceDiagram.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link ModalSequenceDiagram.InteractionUse#getActualGate <em>Actual Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(ValueSpecification)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionUse_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getReturnValue();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.InteractionUse#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionUse_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionUse_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.InteractionUse#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionUse_ActualGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getActualGate();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // InteractionUse
