/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.ExecutionSpecification#getFinish <em>Finish</em>}</li>
 *   <li>{@link ModalSequenceDiagram.ExecutionSpecification#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getExecutionSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(OccurrenceSpecification)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getExecutionSpecification_Finish()
	 * @model required="true"
	 * @generated
	 */
	OccurrenceSpecification getFinish();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ExecutionSpecification#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OccurrenceSpecification)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getExecutionSpecification_Start()
	 * @model required="true"
	 * @generated
	 */
	OccurrenceSpecification getStart();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ExecutionSpecification#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OccurrenceSpecification value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExecutionSpecification
