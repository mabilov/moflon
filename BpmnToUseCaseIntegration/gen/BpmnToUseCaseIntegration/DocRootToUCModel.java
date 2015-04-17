/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.UseCasesModel;

import bpmn2.DocumentRoot;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Root To UC Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.DocRootToUCModel#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.DocRootToUCModel#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDocRootToUCModel()
 * @model
 * @generated
 */
public interface DocRootToUCModel extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DocumentRoot)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDocRootToUCModel_Source()
	 * @model required="true"
	 * @generated
	 */
	DocumentRoot getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.DocRootToUCModel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DocumentRoot value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UseCasesModel)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDocRootToUCModel_Target()
	 * @model required="true"
	 * @generated
	 */
	UseCasesModel getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.DocRootToUCModel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCasesModel value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // DocRootToUCModel
