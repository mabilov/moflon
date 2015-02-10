/**
 */
package bpmn2;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link bpmn2.FlowNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getFlowNode()
 * @model
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getFlowNode_Outgoing()
	 * @see bpmn2.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getFlowNode_Incoming()
	 * @see bpmn2.SequenceFlow#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FlowNode
