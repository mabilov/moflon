/**
 */
package UseCaseDSL;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.Step#getNext <em>Next</em>}</li>
 *   <li>{@link UseCaseDSL.Step#getInvokedUseCase <em>Invoked Use Case</em>}</li>
 *   <li>{@link UseCaseDSL.Step#getLabel <em>Label</em>}</li>
 *   <li>{@link UseCaseDSL.Step#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Step)
	 * @see UseCaseDSL.UseCaseDSLPackage#getStep_Next()
	 * @model
	 * @generated
	 */
	Step getNext();

	/**
	 * Sets the value of the '{@link UseCaseDSL.Step#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Step value);

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
	 * @see UseCaseDSL.UseCaseDSLPackage#getStep_InvokedUseCase()
	 * @model
	 * @generated
	 */
	UseCase getInvokedUseCase();

	/**
	 * Sets the value of the '{@link UseCaseDSL.Step#getInvokedUseCase <em>Invoked Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Use Case</em>' reference.
	 * @see #getInvokedUseCase()
	 * @generated
	 */
	void setInvokedUseCase(UseCase value);

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
	 * @see UseCaseDSL.UseCaseDSLPackage#getStep_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UseCaseDSL.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see UseCaseDSL.UseCaseDSLPackage#getStep_Label()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link UseCaseDSL.Step#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Step
