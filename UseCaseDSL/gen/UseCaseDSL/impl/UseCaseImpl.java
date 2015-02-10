/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.Flow;
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
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link UseCaseDSL.impl.UseCaseImpl#getPostcondition <em>Postcondition</em>}</li>
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
	 * The default value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected String preConditions = PRE_CONDITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

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
	public String getPreConditions() {
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreConditions(String newPreConditions) {
		String oldPreConditions = preConditions;
		preConditions = newPreConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.USE_CASE__PRE_CONDITIONS,
					oldPreConditions, preConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.USE_CASE__POSTCONDITION,
					oldPostcondition, postcondition));
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
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			return getDescription();
		case UseCaseDSLPackage.USE_CASE__NAME:
			return getName();
		case UseCaseDSLPackage.USE_CASE__PRE_CONDITIONS:
			return getPreConditions();
		case UseCaseDSLPackage.USE_CASE__POSTCONDITION:
			return getPostcondition();
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
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__NAME:
			setName((String) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__PRE_CONDITIONS:
			setPreConditions((String) newValue);
			return;
		case UseCaseDSLPackage.USE_CASE__POSTCONDITION:
			setPostcondition((String) newValue);
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
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case UseCaseDSLPackage.USE_CASE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UseCaseDSLPackage.USE_CASE__PRE_CONDITIONS:
			setPreConditions(PRE_CONDITIONS_EDEFAULT);
			return;
		case UseCaseDSLPackage.USE_CASE__POSTCONDITION:
			setPostcondition(POSTCONDITION_EDEFAULT);
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
		case UseCaseDSLPackage.USE_CASE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case UseCaseDSLPackage.USE_CASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case UseCaseDSLPackage.USE_CASE__PRE_CONDITIONS:
			return PRE_CONDITIONS_EDEFAULT == null ? preConditions != null
					: !PRE_CONDITIONS_EDEFAULT.equals(preConditions);
		case UseCaseDSLPackage.USE_CASE__POSTCONDITION:
			return POSTCONDITION_EDEFAULT == null ? postcondition != null
					: !POSTCONDITION_EDEFAULT.equals(postcondition);
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
		result.append(", preConditions: ");
		result.append(preConditions);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCaseImpl
