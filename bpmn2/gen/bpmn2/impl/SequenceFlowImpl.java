/**
 */
package bpmn2.impl;

import bpmn2.Bpmn2Package;
import bpmn2.Expression;
import bpmn2.FlowNode;
import bpmn2.SequenceFlow;

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
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmn2.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link bpmn2.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link bpmn2.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode targetRef;

	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> conditionExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.SEQUENCE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getSourceRef() {
		if (sourceRef != null && sourceRef.eIsProxy()) {
			InternalEObject oldSourceRef = (InternalEObject) sourceRef;
			sourceRef = (FlowNode) eResolveProxy(oldSourceRef);
			if (sourceRef != oldSourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF,
							oldSourceRef, sourceRef));
			}
		}
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(FlowNode newSourceRef,
			NotificationChain msgs) {
		FlowNode oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF,
					oldSourceRef, newSourceRef);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(FlowNode newSourceRef) {
		if (newSourceRef != sourceRef) {
			NotificationChain msgs = null;
			if (sourceRef != null)
				msgs = ((InternalEObject) sourceRef).eInverseRemove(this,
						Bpmn2Package.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
			if (newSourceRef != null)
				msgs = ((InternalEObject) newSourceRef).eInverseAdd(this,
						Bpmn2Package.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
			msgs = basicSetSourceRef(newSourceRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF, newSourceRef,
					newSourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getTargetRef() {
		if (targetRef != null && targetRef.eIsProxy()) {
			InternalEObject oldTargetRef = (InternalEObject) targetRef;
			targetRef = (FlowNode) eResolveProxy(oldTargetRef);
			if (targetRef != oldTargetRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Bpmn2Package.SEQUENCE_FLOW__TARGET_REF,
							oldTargetRef, targetRef));
			}
		}
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRef(FlowNode newTargetRef,
			NotificationChain msgs) {
		FlowNode oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Bpmn2Package.SEQUENCE_FLOW__TARGET_REF,
					oldTargetRef, newTargetRef);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(FlowNode newTargetRef) {
		if (newTargetRef != targetRef) {
			NotificationChain msgs = null;
			if (targetRef != null)
				msgs = ((InternalEObject) targetRef).eInverseRemove(this,
						Bpmn2Package.FLOW_NODE__INCOMING, FlowNode.class, msgs);
			if (newTargetRef != null)
				msgs = ((InternalEObject) newTargetRef).eInverseAdd(this,
						Bpmn2Package.FLOW_NODE__INCOMING, FlowNode.class, msgs);
			msgs = basicSetTargetRef(newTargetRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.SEQUENCE_FLOW__TARGET_REF, newTargetRef,
					newTargetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getConditionExpression() {
		if (conditionExpression == null) {
			conditionExpression = new EObjectContainmentEList<Expression>(
					Expression.class, this,
					Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION);
		}
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			if (sourceRef != null)
				msgs = ((InternalEObject) sourceRef).eInverseRemove(this,
						Bpmn2Package.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
			return basicSetSourceRef((FlowNode) otherEnd, msgs);
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			if (targetRef != null)
				msgs = ((InternalEObject) targetRef).eInverseRemove(this,
						Bpmn2Package.FLOW_NODE__INCOMING, FlowNode.class, msgs);
			return basicSetTargetRef((FlowNode) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			return basicSetSourceRef(null, msgs);
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			return basicSetTargetRef(null, msgs);
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return ((InternalEList<?>) getConditionExpression()).basicRemove(
					otherEnd, msgs);
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
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			if (resolve)
				return getSourceRef();
			return basicGetSourceRef();
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			if (resolve)
				return getTargetRef();
			return basicGetTargetRef();
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return getConditionExpression();
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
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			setSourceRef((FlowNode) newValue);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			setTargetRef((FlowNode) newValue);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			getConditionExpression().clear();
			getConditionExpression().addAll(
					(Collection<? extends Expression>) newValue);
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
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			setSourceRef((FlowNode) null);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			setTargetRef((FlowNode) null);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			getConditionExpression().clear();
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
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			return sourceRef != null;
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			return targetRef != null;
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return conditionExpression != null
					&& !conditionExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SequenceFlowImpl
