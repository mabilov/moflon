/**
 */
package bpmn2.impl;

import bpmn2.Bpmn2Package;
import bpmn2.Gateway;
import bpmn2.GatewayDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmn2.impl.GatewayImpl#getGatewayDirection <em>Gateway Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GatewayImpl extends FlowNodeImpl implements Gateway {
	/**
	 * The default value of the '{@link #getGatewayDirection() <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayDirection()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayDirection GATEWAY_DIRECTION_EDEFAULT = GatewayDirection.CONVERGING;

	/**
	 * The cached value of the '{@link #getGatewayDirection() <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayDirection()
	 * @generated
	 * @ordered
	 */
	protected GatewayDirection gatewayDirection = GATEWAY_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection getGatewayDirection() {
		return gatewayDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayDirection(GatewayDirection newGatewayDirection) {
		GatewayDirection oldGatewayDirection = gatewayDirection;
		gatewayDirection = newGatewayDirection == null ? GATEWAY_DIRECTION_EDEFAULT
				: newGatewayDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.GATEWAY__GATEWAY_DIRECTION,
					oldGatewayDirection, gatewayDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.GATEWAY__GATEWAY_DIRECTION:
			return getGatewayDirection();
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
		case Bpmn2Package.GATEWAY__GATEWAY_DIRECTION:
			setGatewayDirection((GatewayDirection) newValue);
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
		case Bpmn2Package.GATEWAY__GATEWAY_DIRECTION:
			setGatewayDirection(GATEWAY_DIRECTION_EDEFAULT);
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
		case Bpmn2Package.GATEWAY__GATEWAY_DIRECTION:
			return gatewayDirection != GATEWAY_DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (gatewayDirection: ");
		result.append(gatewayDirection);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //GatewayImpl
