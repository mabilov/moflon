/**
 */
package ModalSequenceDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.GeneralOrdering#getBefore <em>Before</em>}</li>
 *   <li>{@link ModalSequenceDiagram.GeneralOrdering#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.OccurrenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurrenceSpecification)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getGeneralOrdering_Before()
	 * @see ModalSequenceDiagram.OccurrenceSpecification#getToAfter
	 * @model opposite="toAfter" required="true"
	 * @generated
	 */
	OccurrenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.OccurrenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurrenceSpecification)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getGeneralOrdering_After()
	 * @see ModalSequenceDiagram.OccurrenceSpecification#getToBefore
	 * @model opposite="toBefore" required="true"
	 * @generated
	 */
	OccurrenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurrenceSpecification value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // GeneralOrdering
