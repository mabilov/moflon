/**
 */
package UseCaseDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.UseCase#getSuperCase <em>Super Case</em>}</li>
 *   <li>{@link UseCaseDSL.UseCase#getFlows <em>Flows</em>}</li>
 *   <li>{@link UseCaseDSL.UseCase#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link UseCaseDSL.UseCase#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link UseCaseDSL.UseCase#getDescription <em>Description</em>}</li>
 *   <li>{@link UseCaseDSL.UseCase#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Case</em>' reference.
	 * @see #setSuperCase(UseCase)
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase_SuperCase()
	 * @model
	 * @generated
	 */
	UseCase getSuperCase();

	/**
	 * Sets the value of the '{@link UseCaseDSL.UseCase#getSuperCase <em>Super Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Case</em>' reference.
	 * @see #getSuperCase()
	 * @generated
	 */
	void setSuperCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link UseCaseDSL.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlows();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link UseCaseDSL.UCCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase_Preconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCCondition> getPreconditions();

	/**
	 * Returns the value of the '<em><b>Postconditions</b></em>' containment reference list.
	 * The list contents are of type {@link UseCaseDSL.UCCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postconditions</em>' containment reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase_Postconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCCondition> getPostconditions();

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
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase_Description()
	 * @model ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link UseCaseDSL.UseCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCase_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UseCaseDSL.UseCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UseCase
