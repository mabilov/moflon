/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import BpmnToUseCaseIntegration.EndEventToUCCondition;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import UseCaseDSL.UCCondition;

import bpmn2.EndEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Event To UC Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.impl.EndEventToUCConditionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.impl.EndEventToUCConditionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndEventToUCConditionImpl extends AbstractCorrespondenceImpl
		implements EndEventToUCCondition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EndEvent source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected UCCondition target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventToUCConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnToUseCaseIntegrationPackage.Literals.END_EVENT_TO_UC_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (EndEvent) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EndEvent newSource) {
		EndEvent oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCCondition getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (UCCondition) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCCondition basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(UCCondition newTarget) {
		UCCondition oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__SOURCE:
			setSource((EndEvent) newValue);
			return;
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__TARGET:
			setTarget((UCCondition) newValue);
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
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__SOURCE:
			setSource((EndEvent) null);
			return;
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__TARGET:
			setTarget((UCCondition) null);
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
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__SOURCE:
			return source != null;
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_UC_CONDITION__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEventToUCConditionImpl
