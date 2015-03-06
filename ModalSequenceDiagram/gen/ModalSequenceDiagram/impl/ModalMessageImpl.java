/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.ExecutionKind;
import ModalSequenceDiagram.ModalMessage;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.TemperatureKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.ModalMessageImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.ModalMessageImpl#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModalMessageImpl extends MessageImpl implements ModalMessage {
	/**
	 * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionKind EXECUTION_EDEFAULT = ExecutionKind.MONITOR;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected ExecutionKind execution = EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final TemperatureKind TEMPERATURE_EDEFAULT = TemperatureKind.COLD;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected TemperatureKind temperature = TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.MODAL_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionKind getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(ExecutionKind newExecution) {
		ExecutionKind oldExecution = execution;
		execution = newExecution == null ? EXECUTION_EDEFAULT : newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.MODAL_MESSAGE__EXECUTION,
					oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureKind getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(TemperatureKind newTemperature) {
		TemperatureKind oldTemperature = temperature;
		temperature = newTemperature == null ? TEMPERATURE_EDEFAULT
				: newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.MODAL_MESSAGE__TEMPERATURE,
					oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__EXECUTION:
			return getExecution();
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__TEMPERATURE:
			return getTemperature();
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
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__EXECUTION:
			setExecution((ExecutionKind) newValue);
			return;
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__TEMPERATURE:
			setTemperature((TemperatureKind) newValue);
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
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__EXECUTION:
			setExecution(EXECUTION_EDEFAULT);
			return;
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__TEMPERATURE:
			setTemperature(TEMPERATURE_EDEFAULT);
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
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__EXECUTION:
			return execution != EXECUTION_EDEFAULT;
		case ModalSequenceDiagramPackage.MODAL_MESSAGE__TEMPERATURE:
			return temperature != TEMPERATURE_EDEFAULT;
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
		result.append(" (execution: ");
		result.append(execution);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModalMessageImpl
