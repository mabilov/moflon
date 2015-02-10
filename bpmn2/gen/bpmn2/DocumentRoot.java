/**
 */
package bpmn2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.DocumentRoot#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getDocumentRoot()
 * @model
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Definitions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getDocumentRoot_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definitions> getDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // DocumentRoot
