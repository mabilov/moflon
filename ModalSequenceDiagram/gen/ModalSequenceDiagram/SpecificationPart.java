/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.SpecificationPart#getPartKind <em>Part Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getSpecificationPart()
 * @model
 * @generated
 */
public interface SpecificationPart extends Property {
	/**
	 * Returns the value of the '<em><b>Part Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ModalSequenceDiagram.PartKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Kind</em>' attribute.
	 * @see ModalSequenceDiagram.PartKind
	 * @see #setPartKind(PartKind)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getSpecificationPart_PartKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PartKind getPartKind();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.SpecificationPart#getPartKind <em>Part Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Kind</em>' attribute.
	 * @see ModalSequenceDiagram.PartKind
	 * @see #getPartKind()
	 * @generated
	 */
	void setPartKind(PartKind value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SpecificationPart
