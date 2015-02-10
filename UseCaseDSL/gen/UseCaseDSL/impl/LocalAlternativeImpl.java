/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.LocalAlternative;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseDSL.impl.LocalAlternativeImpl#getInvokedUseCase <em>Invoked Use Case</em>}</li>
 *   <li>{@link UseCaseDSL.impl.LocalAlternativeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalAlternativeImpl extends StepAlternativeImpl implements
		LocalAlternative {
	/**
	 * The cached value of the '{@link #getInvokedUseCase() <em>Invoked Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedUseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase invokedUseCase;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseDSLPackage.Literals.LOCAL_ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getInvokedUseCase() {
		if (invokedUseCase != null && invokedUseCase.eIsProxy()) {
			InternalEObject oldInvokedUseCase = (InternalEObject) invokedUseCase;
			invokedUseCase = (UseCase) eResolveProxy(oldInvokedUseCase);
			if (invokedUseCase != oldInvokedUseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							UseCaseDSLPackage.LOCAL_ALTERNATIVE__INVOKED_USE_CASE,
							oldInvokedUseCase, invokedUseCase));
			}
		}
		return invokedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetInvokedUseCase() {
		return invokedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokedUseCase(UseCase newInvokedUseCase) {
		UseCase oldInvokedUseCase = invokedUseCase;
		invokedUseCase = newInvokedUseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.LOCAL_ALTERNATIVE__INVOKED_USE_CASE,
					oldInvokedUseCase, invokedUseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.LOCAL_ALTERNATIVE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__INVOKED_USE_CASE:
			if (resolve)
				return getInvokedUseCase();
			return basicGetInvokedUseCase();
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__DESCRIPTION:
			return getDescription();
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
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__INVOKED_USE_CASE:
			setInvokedUseCase((UseCase) newValue);
			return;
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__DESCRIPTION:
			setDescription((String) newValue);
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
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__INVOKED_USE_CASE:
			setInvokedUseCase((UseCase) null);
			return;
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__INVOKED_USE_CASE:
			return invokedUseCase != null;
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LocalAlternativeImpl
