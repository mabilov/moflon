/**
 */
package UseCaseToModalSequenceDiagramIntegration.impl;

import ModalSequenceDiagram.Message;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import UseCaseDSL.UCCondition;

import UseCaseToModalSequenceDiagramIntegration.UCConditionToMessage;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Condition To Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.impl.UCConditionToMessageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.impl.UCConditionToMessageImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UCConditionToMessageImpl extends AbstractCorrespondenceImpl
		implements UCConditionToMessage {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UCCondition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Message target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCConditionToMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseToModalSequenceDiagramIntegrationPackage.Literals.UC_CONDITION_TO_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCCondition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (UCCondition) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__SOURCE,
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
	public UCCondition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UCCondition newSource) {
		UCCondition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Message) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__TARGET,
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
	public Message basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Message newTarget) {
		Message oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__TARGET,
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__TARGET:
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__SOURCE:
			setSource((UCCondition) newValue);
			return;
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__TARGET:
			setTarget((Message) newValue);
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__SOURCE:
			setSource((UCCondition) null);
			return;
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__TARGET:
			setTarget((Message) null);
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__SOURCE:
			return source != null;
		case UseCaseToModalSequenceDiagramIntegrationPackage.UC_CONDITION_TO_MESSAGE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UCConditionToMessageImpl
