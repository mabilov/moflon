/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.OccurrenceSpecification#getToAfter <em>To After</em>}</li>
 *   <li>{@link ModalSequenceDiagram.OccurrenceSpecification#getToBefore <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getOccurrenceSpecification()
 * @model
 * @generated
 */
public interface OccurrenceSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getOccurrenceSpecification_ToAfter()
	 * @see ModalSequenceDiagram.GeneralOrdering#getBefore
	 * @model opposite="before"
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getOccurrenceSpecification_ToBefore()
	 * @see ModalSequenceDiagram.GeneralOrdering#getAfter
	 * @model opposite="after"
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // OccurrenceSpecification
