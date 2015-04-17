/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.CombinedFragment#getOperand <em>Operand</em>}</li>
 *   <li>{@link ModalSequenceDiagram.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}</li>
 *   <li>{@link ModalSequenceDiagram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getCombinedFragment_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionOperand> getOperand();

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link ModalSequenceDiagram.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfragment Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getCombinedFragment_CfragmentGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getCfragmentGate();

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The default value is <code>"seq"</code>.
	 * The literals are from the enumeration {@link ModalSequenceDiagram.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see ModalSequenceDiagram.InteractionOperatorKind
	 * @see #setInteractionOperator(InteractionOperatorKind)
	 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getCombinedFragment_InteractionOperator()
	 * @model default="seq" required="true" ordered="false"
	 * @generated
	 */
	InteractionOperatorKind getInteractionOperator();

	/**
	 * Sets the value of the '{@link ModalSequenceDiagram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see ModalSequenceDiagram.InteractionOperatorKind
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperatorKind value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CombinedFragment
