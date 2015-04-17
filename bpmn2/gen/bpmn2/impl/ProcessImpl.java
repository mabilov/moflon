/**
 */
package bpmn2.impl;

import bpmn2.BaseElement;
import bpmn2.Bpmn2Package;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.LaneSet;
import bpmn2.SequenceFlow;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmn2.impl.ProcessImpl#getId <em>Id</em>}</li>
 *   <li>{@link bpmn2.impl.ProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link bpmn2.impl.ProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements bpmn2.Process {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLaneSets() <em>Lane Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneSets()
	 * @generated
	 * @ordered
	 */
	protected EList<LaneSet> laneSets;

	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.PROCESS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaneSet> getLaneSets() {
		if (laneSets == null) {
			laneSets = new EObjectContainmentEList<LaneSet>(LaneSet.class,
					this, Bpmn2Package.PROCESS__LANE_SETS);
		}
		return laneSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentEList<FlowElement>(
					FlowElement.class, this,
					Bpmn2Package.PROCESS__FLOW_ELEMENTS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode removeNode(FlowNode node) {
		// removeNodeFromProcess
		Object[] result1_black = ProcessImpl.pattern_Process_0_1_blackBBFFF(
				this, node);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [removeNodeFromProcess] failed");
		}
		SequenceFlow inFlow = (SequenceFlow) result1_black[2];
		SequenceFlow outFlow = (SequenceFlow) result1_black[3];
		FlowNode nextNode = (FlowNode) result1_black[4];
		ProcessImpl.pattern_Process_0_1_redBBBBB(this, node, inFlow, outFlow,
				nextNode);

		ProcessImpl.pattern_Process_0_1_greenBB(inFlow, nextNode);

		EcoreUtil.delete(node);
		node = null;
		EcoreUtil.delete(outFlow);
		outFlow = null;
		;

		return ProcessImpl.pattern_Process_0_2_expressionFB(nextNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__LANE_SETS:
			return ((InternalEList<?>) getLaneSets()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__ID:
			return getId();
		case Bpmn2Package.PROCESS__LANE_SETS:
			return getLaneSets();
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			return getFlowElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__ID:
			setId((String) newValue);
			return;
		case Bpmn2Package.PROCESS__LANE_SETS:
			getLaneSets().clear();
			getLaneSets().addAll((Collection<? extends LaneSet>) newValue);
			return;
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			getFlowElements().clear();
			getFlowElements().addAll(
					(Collection<? extends FlowElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__ID:
			setId(ID_EDEFAULT);
			return;
		case Bpmn2Package.PROCESS__LANE_SETS:
			getLaneSets().clear();
			return;
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			getFlowElements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Bpmn2Package.PROCESS__LANE_SETS:
			return laneSets != null && !laneSets.isEmpty();
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			return flowElements != null && !flowElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BaseElement.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.PROCESS__ID:
				return Bpmn2Package.BASE_ELEMENT__ID;
			default:
				return -1;
			}
		}
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.PROCESS__LANE_SETS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BaseElement.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.BASE_ELEMENT__ID:
				return Bpmn2Package.PROCESS__ID;
			default:
				return -1;
			}
		}
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return Bpmn2Package.PROCESS__LANE_SETS;
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				return Bpmn2Package.PROCESS__FLOW_ELEMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case Bpmn2Package.PROCESS___REMOVE_NODE__FLOWNODE:
			return removeNode((FlowNode) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_Process_0_1_blackBBFFF(
			bpmn2.Process _this, FlowNode node) {
		if (_this.getFlowElements().contains(node)) {
			for (FlowElement tmpInFlow : _this.getFlowElements()) {
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (node.equals(inFlow.getTargetRef())) {
						for (FlowElement tmpOutFlow : _this.getFlowElements()) {
							if (tmpOutFlow instanceof SequenceFlow) {
								SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
								if (!inFlow.equals(outFlow)) {
									if (node.equals(outFlow.getSourceRef())) {
										FlowNode nextNode = outFlow
												.getTargetRef();
										if (nextNode != null) {
											if (!nextNode.equals(node)) {
												if (_this.getFlowElements()
														.contains(nextNode)) {
													return new Object[] {
															_this, node,
															inFlow, outFlow,
															nextNode };
												}
											}
										}

									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Process_0_1_redBBBBB(
			bpmn2.Process _this, FlowNode node, SequenceFlow inFlow,
			SequenceFlow outFlow, FlowNode nextNode) {
		_this.getFlowElements().remove(outFlow);
		_this.getFlowElements().remove(node);
		inFlow.setTargetRef(null);
		outFlow.setSourceRef(null);
		outFlow.setTargetRef(null);
		return new Object[] { _this, node, inFlow, outFlow, nextNode };
	}

	public static final Object[] pattern_Process_0_1_greenBB(
			SequenceFlow inFlow, FlowNode nextNode) {
		inFlow.setTargetRef(nextNode);
		return new Object[] { inFlow, nextNode };
	}

	public static final FlowNode pattern_Process_0_2_expressionFB(
			FlowNode nextNode) {
		FlowNode _result = nextNode;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProcessImpl
