/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSD Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.MSDSpecification#getSpecificationKind <em>Specification Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getMSDSpecification()
 * @model
 * @generated
 */
public interface MSDSpecification extends ModalSequenceDiagram.Package {
	/**
	 * Returns the value of the '<em><b>Specification Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ModalSequenceDiagram.SpecificationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Kind</em>' attribute.
	 * @see ModalSequenceDiagram.SpecificationKind
	 * @see #setSpecificationKind(SpecificationKind)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getMSDSpecification_SpecificationKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecificationKind getSpecificationKind();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.MSDSpecification#getSpecificationKind <em>Specification Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Kind</em>' attribute.
	 * @see ModalSequenceDiagram.SpecificationKind
	 * @see #getSpecificationKind()
	 * @generated
	 */
	void setSpecificationKind(SpecificationKind value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MSDSpecification
