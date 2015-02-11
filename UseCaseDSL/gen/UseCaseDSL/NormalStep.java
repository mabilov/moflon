/**
 */
package UseCaseDSL;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.NormalStep#getStepAlternative <em>Step Alternative</em>}</li>
 *   <li>{@link UseCaseDSL.NormalStep#getActor <em>Actor</em>}</li>
 *   <li>{@link UseCaseDSL.NormalStep#getCustomStepType <em>Custom Step Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getNormalStep()
 * @model
 * @generated
 */
public interface NormalStep extends Step {
	/**
	 * Returns the value of the '<em><b>Step Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link UseCaseDSL.StepAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Alternative</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Alternative</em>' containment reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getNormalStep_StepAlternative()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepAlternative> getStepAlternative();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see UseCaseDSL.UseCaseDSLPackage#getNormalStep_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link UseCaseDSL.NormalStep#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Custom Step Type</b></em>' attribute.
	 * The literals are from the enumeration {@link UseCaseDSL.CustomStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Step Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Step Type</em>' attribute.
	 * @see UseCaseDSL.CustomStepType
	 * @see #setCustomStepType(CustomStepType)
	 * @see UseCaseDSL.UseCaseDSLPackage#getNormalStep_CustomStepType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomStepType getCustomStepType();

	/**
	 * Sets the value of the '{@link UseCaseDSL.NormalStep#getCustomStepType <em>Custom Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Step Type</em>' attribute.
	 * @see UseCaseDSL.CustomStepType
	 * @see #getCustomStepType()
	 * @generated
	 */
	void setCustomStepType(CustomStepType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NormalStep
