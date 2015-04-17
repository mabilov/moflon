/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.PackageDeclaration;

import bpmn2.Definitions;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions To Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.DefinitionsToPackage#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.DefinitionsToPackage#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDefinitionsToPackage()
 * @model
 * @generated
 */
public interface DefinitionsToPackage extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Definitions)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDefinitionsToPackage_Source()
	 * @model required="true"
	 * @generated
	 */
	Definitions getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.DefinitionsToPackage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Definitions value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PackageDeclaration)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDefinitionsToPackage_Target()
	 * @model required="true"
	 * @generated
	 */
	PackageDeclaration getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.DefinitionsToPackage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PackageDeclaration value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // DefinitionsToPackage
