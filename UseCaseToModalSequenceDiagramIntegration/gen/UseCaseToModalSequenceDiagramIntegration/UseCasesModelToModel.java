/**
 */
package UseCaseToModalSequenceDiagramIntegration;

import ModalSequenceDiagram.Model;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.UseCasesModel;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Cases Model To Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getSource <em>Source</em>}</li>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getUseCasesModelToModel()
 * @model
 * @generated
 */
public interface UseCasesModelToModel extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UseCasesModel)
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getUseCasesModelToModel_Source()
	 * @model required="true"
	 * @generated
	 */
	UseCasesModel getSource();

	/**
	 * Sets the value of the '{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UseCasesModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Model)
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getUseCasesModelToModel_Target()
	 * @model required="true"
	 * @generated
	 */
	Model getTarget();

	/**
	 * Sets the value of the '{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Model value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UseCasesModelToModel
