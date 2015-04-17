/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.Interaction#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Interaction#getFragment <em>Fragment</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Interaction#getMessage <em>Message</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Interaction#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Interaction#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Behavior, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Lifeline}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteraction_Lifeline()
	 * @see ModalSequenceDiagram.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true"
	 * @generated
	 */
	EList<Lifeline> getLifeline();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteraction_Fragment()
	 * @see ModalSequenceDiagram.InteractionFragment#getEnclosingInteraction
	 * @model opposite="enclosingInteraction" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Message}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteraction_Message()
	 * @see ModalSequenceDiagram.Message#getInteraction
	 * @model opposite="interaction" containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteraction_FormalGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getFormalGate();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getInteraction_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Interaction
