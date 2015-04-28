/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.Flow;
import UseCaseDSL.UCCondition;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getSuperCase <em>Super Case</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends EObjectImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getSuperCase() <em>Super Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase superCase;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flows;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<UCCondition> preconditions;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<UCCondition> postconditions;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseDSLPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getSuperCase() {
		if (superCase != null && superCase.eIsProxy()) {
			InternalEObject oldSuperCase = (InternalEObject) superCase;
			superCase = (UseCase) eResolveProxy(oldSuperCase);
			if (superCase != oldSuperCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UseCaseDSLPackage.USE_CASE__SUPER_CASE,
							oldSuperCase, superCase));
			}
		}
		return superCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetSuperCase() {
		return superCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperCase(UseCase newSuperCase) {
		UseCase oldSuperCase = superCase;
		superCase = newSuperCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.USE_CASE__SUPER_CASE, oldSuperCase,
					superCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<Flow>(Flow.class, this,
					UseCaseDSLPackage.USE_CASE__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCCondition> getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentEList<UCCondition>(
					UCCondition.class, this,
					UseCaseDSLPackage.USE_CASE__PRECONDITIONS);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCCondition> getPostconditions() {
		if (postconditions == null) {
			postconditions = new EObjectContainmentEList<UCCondition>(
					UCCondition.class, this,
					UseCaseDSLPackage.USE_CASE__POSTCONDITIONS);
		}
		return postconditions;
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
					UseCaseDSLPackage.USE_CASE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.USE_CASE__NAME, oldName, name));
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
		case UseCaseDSLPackage.USE_CASE__FLOWS:
			return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
		case UseCaseDSLPackage.USE_CASE__PRECONDITIONS:
			return ((InternalEList<?>) getPreconditions()).basicRemove(
					otherEnd, msgs);
		case UseCaseDSLPackage.USE_CASE__POSTCONDITIONS:
			return ((InternalEList<?>) getPostconditions()).basicRemove(
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
		case UseCaseDSLPackage.USE_CASE__SUPER_CASE:
			if (resolve)
				return getSuperCase();
			return basicGetSuperCase();
		case UseCaseDSLPackage.USE_CASE__FLOWS:
			return getFlows();
		case UseCaseDSLPackage.USE_CASE__PRECONDITIONS:
			return getPreconditions();
		case UseCaseDSLPackage.USE_CASE__POSTCONDITIONS:
			return getPostconditions();
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			return getDescription();
		case UseCaseDSLPackage.USE_CASE__NAME:
			return getName();
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
		case UseCaseDSLPackage.USE_CASE__SUPER_CASE:
			setSuperCase((UseCase) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends Flow>) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__PRECONDITIONS:
			getPreconditions().clear();
			getPreconditions().addAll(
					(Collection<? extends UCCondition>) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__POSTCONDITIONS:
			getPostconditions().clear();
			getPostconditions().addAll(
					(Collection<? extends UCCondition>) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__NAME:
			setName((String) newValue);
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
		case UseCaseDSLPackage.USE_CASE__SUPER_CASE:
			setSuperCase((UseCase) null);
			return;
		case UseCaseDSLPackage.USE_CASE__FLOWS:
			getFlows().clear();
			return;
		case UseCaseDSLPackage.USE_CASE__PRECONDITIONS:
			getPreconditions().clear();
			return;
		case UseCaseDSLPackage.USE_CASE__POSTCONDITIONS:
			getPostconditions().clear();
			return;
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case UseCaseDSLPackage.USE_CASE__NAME:
			setName(NAME_EDEFAULT);
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
		case UseCaseDSLPackage.USE_CASE__SUPER_CASE:
			return superCase != null;
		case UseCaseDSLPackage.USE_CASE__FLOWS:
			return flows != null && !flows.isEmpty();
		case UseCaseDSLPackage.USE_CASE__PRECONDITIONS:
			return preconditions != null && !preconditions.isEmpty();
		case UseCaseDSLPackage.USE_CASE__POSTCONDITIONS:
			return postconditions != null && !postconditions.isEmpty();
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case UseCaseDSLPackage.USE_CASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCaseImpl
