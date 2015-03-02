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
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link bpmn2.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Lane Sets</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.LaneSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lane Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane Sets</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getFlowElementsContainer_LaneSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<LaneSet> getLaneSets();

	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getFlowElementsContainer_FlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FlowElementsContainer
