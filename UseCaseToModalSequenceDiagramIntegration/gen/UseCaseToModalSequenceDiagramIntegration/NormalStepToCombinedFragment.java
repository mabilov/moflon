/**
 */
package UseCaseToModalSequenceDiagramIntegration;

import ModalSequenceDiagram.CombinedFragment;

import TGGRuntime.AbstractCorrespondence;

import UseCaseDSL.NormalStep;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Step To Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment#getSource <em>Source</em>}</li>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getNormalStepToCombinedFragment()
 * @model
 * @generated
 */
public interface NormalStepToCombinedFragment extends EObject,
		AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NormalStep)
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getNormalStepToCombinedFragment_Source()
	 * @model required="true"
	 * @generated
	 */
	NormalStep getSource();

	/**
	 * Sets the value of the '{@link UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NormalStep value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CombinedFragment)
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getNormalStepToCombinedFragment_Target()
	 * @model required="true"
	 * @generated
	 */
	CombinedFragment getTarget();

	/**
	 * Sets the value of the '{@link UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CombinedFragment value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NormalStepToCombinedFragment
