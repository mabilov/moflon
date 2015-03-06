/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.ModalMessage#getExecution <em>Execution</em>}</li>
 *   <li>{@link ModalSequenceDiagram.ModalMessage#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getModalMessage()
 * @model
 * @generated
 */
public interface ModalMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' attribute.
	 * The literals are from the enumeration {@link ModalSequenceDiagram.ExecutionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' attribute.
	 * @see ModalSequenceDiagram.ExecutionKind
	 * @see #setExecution(ExecutionKind)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getModalMessage_Execution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionKind getExecution();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ModalMessage#getExecution <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' attribute.
	 * @see ModalSequenceDiagram.ExecutionKind
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(ExecutionKind value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The literals are from the enumeration {@link ModalSequenceDiagram.TemperatureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see ModalSequenceDiagram.TemperatureKind
	 * @see #setTemperature(TemperatureKind)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getModalMessage_Temperature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemperatureKind getTemperature();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ModalMessage#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see ModalSequenceDiagram.TemperatureKind
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(TemperatureKind value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ModalMessage
