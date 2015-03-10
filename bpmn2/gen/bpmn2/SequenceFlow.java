/**
 */
package bpmn2;

import de.upb.tools.sdm.*;

import java.util.*;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link bpmn2.SequenceFlow#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(FlowNode)
	 * @see bpmn2.Bpmn2Package#getSequenceFlow_SourceRef()
	 * @see bpmn2.FlowNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	FlowNode getSourceRef();

	/**
	 * Sets the value of the '{@link bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn2.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(FlowNode)
	 * @see bpmn2.Bpmn2Package#getSequenceFlow_TargetRef()
	 * @see bpmn2.FlowNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	FlowNode getTargetRef();

	/**
	 * Sets the value of the '{@link bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getSequenceFlow_ConditionExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getConditionExpression();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SequenceFlow
