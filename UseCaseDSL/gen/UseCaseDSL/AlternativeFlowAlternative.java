/**
 */
package UseCaseDSL;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Flow Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.AlternativeFlowAlternative#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getAlternativeFlowAlternative()
 * @model
 * @generated
 */
public interface AlternativeFlowAlternative extends StepAlternative {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(NamedFlow)
	 * @see UseCaseDSL.UseCaseDSLPackage#getAlternativeFlowAlternative_Ref()
	 * @model
	 * @generated
	 */
	NamedFlow getRef();

	/**
	 * Sets the value of the '{@link UseCaseDSL.AlternativeFlowAlternative#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(NamedFlow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AlternativeFlowAlternative
