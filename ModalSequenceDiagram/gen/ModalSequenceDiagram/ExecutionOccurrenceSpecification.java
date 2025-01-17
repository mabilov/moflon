/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getExecutionOccurrenceSpecification()
 * @model
 * @generated
 */
public interface ExecutionOccurrenceSpecification extends
		OccurrenceSpecification {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(ExecutionSpecification)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getExecutionOccurrenceSpecification_Execution()
	 * @model required="true"
	 * @generated
	 */
	ExecutionSpecification getExecution();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(ExecutionSpecification value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExecutionOccurrenceSpecification
