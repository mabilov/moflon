/**
 */
package UseCaseDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.Flow#getSteps <em>Steps</em>}</li>
 *   <li>{@link UseCaseDSL.Flow#getFinalState <em>Final State</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getFlow()
 * @model abstract="true"
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link UseCaseDSL.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getFlow_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' containment reference.
	 * @see #setFinalState(UCCondition)
	 * @see UseCaseDSL.UseCaseDSLPackage#getFlow_FinalState()
	 * @model containment="true"
	 * @generated
	 */
	UCCondition getFinalState();

	/**
	 * Sets the value of the '{@link UseCaseDSL.Flow#getFinalState <em>Final State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' containment reference.
	 * @see #getFinalState()
	 * @generated
	 */
	void setFinalState(UCCondition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Flow
