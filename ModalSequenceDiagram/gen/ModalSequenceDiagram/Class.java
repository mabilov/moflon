/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends BehavioredClassifier, EncapsulatedClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getClass_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Class
