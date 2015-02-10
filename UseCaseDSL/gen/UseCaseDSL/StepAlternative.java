/**
 */
package UseCaseDSL;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.StepAlternative#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link UseCaseDSL.StepAlternative#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getStepAlternative()
 * @model
 * @generated
 */
public interface StepAlternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation</em>' reference.
	 * @see #setContinuation(Step)
	 * @see UseCaseDSL.UseCaseDSLPackage#getStepAlternative_Continuation()
	 * @model
	 * @generated
	 */
	Step getContinuation();

	/**
	 * Sets the value of the '{@link UseCaseDSL.StepAlternative#getContinuation <em>Continuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation</em>' reference.
	 * @see #getContinuation()
	 * @generated
	 */
	void setContinuation(Step value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see UseCaseDSL.UseCaseDSLPackage#getStepAlternative_Condition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link UseCaseDSL.StepAlternative#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StepAlternative
