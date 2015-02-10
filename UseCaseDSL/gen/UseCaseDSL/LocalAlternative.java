/**
 */
package UseCaseDSL;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.LocalAlternative#getInvokedUseCase <em>Invoked Use Case</em>}</li>
 *   <li>{@link UseCaseDSL.LocalAlternative#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getLocalAlternative()
 * @model
 * @generated
 */
public interface LocalAlternative extends StepAlternative {
	/**
	 * Returns the value of the '<em><b>Invoked Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Use Case</em>' reference.
	 * @see #setInvokedUseCase(UseCase)
	 * @see UseCaseDSL.UseCaseDSLPackage#getLocalAlternative_InvokedUseCase()
	 * @model
	 * @generated
	 */
	UseCase getInvokedUseCase();

	/**
	 * Sets the value of the '{@link UseCaseDSL.LocalAlternative#getInvokedUseCase <em>Invoked Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Use Case</em>' reference.
	 * @see #getInvokedUseCase()
	 * @generated
	 */
	void setInvokedUseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see UseCaseDSL.UseCaseDSLPackage#getLocalAlternative_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link UseCaseDSL.LocalAlternative#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LocalAlternative
