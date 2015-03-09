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
import de.upb.tools.sdm.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
		boolean fujaba__Success = false;
		Iterator fujaba__IterThisToOutFlow = null;
		Object _TmpObject = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterThisToNextNode = null;
		FlowNode nextNode = null;
		Iterator fujaba__IterThisToInFlow = null;
		SequenceFlow inFlow = null;

		// story node 'removeNodeFromProcess'
		try {
			fujaba__Success = false;

			// check object node is really bound
			JavaSDM.ensure(node != null);
			// check link flowElements from node to this
			JavaSDM.ensure(this.equals(node.eContainer()));

			// iterate to-many link flowElements from this to inFlow
			fujaba__Success = false;

			fujaba__IterThisToInFlow = this.getFlowElements().iterator();

			while (!(fujaba__Success) && fujaba__IterThisToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterThisToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// check link incoming from inFlow to node
					JavaSDM.ensure(node.equals(inFlow.getTargetRef()));

					// iterate to-many link flowElements from this to nextNode
					fujaba__Success = false;

					fujaba__IterThisToNextNode = this.getFlowElements()
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterThisToNextNode.hasNext()) {
						try {
							_TmpObject = fujaba__IterThisToNextNode.next();

							// ensure correct type and really bound of object nextNode
							JavaSDM.ensure(_TmpObject instanceof FlowNode);
							nextNode = (FlowNode) _TmpObject;
							// check isomorphic binding between objects node and nextNode 
							JavaSDM.ensure(!node.equals(nextNode));

							// iterate to-many link flowElements from this to outFlow
							fujaba__Success = false;

							fujaba__IterThisToOutFlow = this.getFlowElements()
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterThisToOutFlow.hasNext()) {
								try {
									_TmpObject = fujaba__IterThisToOutFlow
											.next();

									// ensure correct type and really bound of object outFlow
									JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
									outFlow = (SequenceFlow) _TmpObject;
									// check isomorphic binding between objects outFlow and inFlow 
									JavaSDM.ensure(!outFlow.equals(inFlow));

									// check link incoming from outFlow to nextNode
									JavaSDM.ensure(nextNode.equals(outFlow
											.getTargetRef()));

									// check link outgoing from outFlow to node
									JavaSDM.ensure(node.equals(outFlow
											.getSourceRef()));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// destroy link
			this.getFlowElements().remove(node); // delete link

			// destroy link
			this.getFlowElements().remove(outFlow); // delete link

			// destroy link
			inFlow.setTargetRef(null);
			// destroy link
			outFlow.setSourceRef(null);
			// destroy link
			nextNode.getIncoming().remove(outFlow);
			// delete object node
			org.moflon.util.eMoflonEMFUtil.remove(node);
			// delete object outFlow
			org.moflon.util.eMoflonEMFUtil.remove(outFlow);

			// create link
			nextNode.getIncoming().add(inFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		if (fujaba__Success) {
			return nextNode;

		} else {
			throw new IllegalStateException();

		}
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
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProcessImpl
