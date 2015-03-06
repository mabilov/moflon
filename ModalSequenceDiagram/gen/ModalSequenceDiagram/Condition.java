/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.Condition#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends StateInvariant {
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
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getCondition_Temperature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemperatureKind getTemperature();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.Condition#getTemperature <em>Temperature</em>}' attribute.
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
} // Condition
