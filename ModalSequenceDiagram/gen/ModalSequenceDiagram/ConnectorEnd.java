/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.ConnectorEnd#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getConnectorEnd_Role()
	 * @model required="true"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ConnectorEnd
