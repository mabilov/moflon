/**
 */
package bpmn2;

import de.upb.tools.sdm.*;
import java.util.*;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.Definitions#getRootElements <em>Root Elements</em>}</li>
 *   <li>{@link bpmn2.Definitions#getName <em>Name</em>}</li>
 *   <li>{@link bpmn2.Definitions#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.RootElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Elements</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getDefinitions_RootElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RootElement> getRootElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bpmn2.Bpmn2Package#getDefinitions_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn2.Definitions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see bpmn2.Bpmn2Package#getDefinitions_TargetNamespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link bpmn2.Definitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Definitions
