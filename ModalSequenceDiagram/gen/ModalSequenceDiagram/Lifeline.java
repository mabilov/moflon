/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.Lifeline#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Lifeline#getSelector <em>Selector</em>}</li>
 *   <li>{@link ModalSequenceDiagram.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getLifeline_Interaction()
	 * @see ModalSequenceDiagram.Interaction#getLifeline
	 * @model opposite="lifeline" transient="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.Lifeline#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(ConnectableElement)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getLifeline_Represents()
	 * @model
	 * @generated
	 */
	ConnectableElement getRepresents();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.Lifeline#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link ModalSequenceDiagram.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getLifeline_CoveredBy()
	 * @see ModalSequenceDiagram.InteractionFragment#getCovered
	 * @model opposite="covered"
	 * @generated
	 */
	EList<InteractionFragment> getCoveredBy();

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getLifeline_Selector()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getSelector();

	/**
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed As</em>' reference.
	 * @see #setDecomposedAs(PartDecomposition)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getLifeline_DecomposedAs()
	 * @model
	 * @generated
	 */
	PartDecomposition getDecomposedAs();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.Lifeline#getDecomposedAs <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposed As</em>' reference.
	 * @see #getDecomposedAs()
	 * @generated
	 */
	void setDecomposedAs(PartDecomposition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Lifeline
