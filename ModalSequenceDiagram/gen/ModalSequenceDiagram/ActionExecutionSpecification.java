/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.ActionExecutionSpecification#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getActionExecutionSpecification()
 * @model
 * @generated
 */
public interface ActionExecutionSpecification extends ExecutionSpecification {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getActionExecutionSpecification_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ActionExecutionSpecification#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ActionExecutionSpecification
