/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.InteractionOperand#getFragment <em>Fragment</em>}</li>
 *   <li>{@link ModalSequenceDiagram.InteractionOperand#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionOperand()
 * @model
 * @generated
 */
public interface InteractionOperand extends InteractionFragment, Namespace {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionOperand_Fragment()
	 * @see ModalSequenceDiagram.InteractionFragment#getEnclosingOperand
	 * @model opposite="enclosingOperand" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(InteractionConstraint)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteractionOperand_Guard()
	 * @model containment="true"
	 * @generated
	 */
	InteractionConstraint getGuard();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.InteractionOperand#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(InteractionConstraint value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // InteractionOperand
