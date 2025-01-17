/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getBehaviorExecutionSpecification()
 * @model
 * @generated
 */
public interface BehaviorExecutionSpecification extends ExecutionSpecification {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getBehaviorExecutionSpecification_Behavior()
	 * @model
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // BehaviorExecutionSpecification
