/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.Actor;
import UseCaseDSL.NormalStep;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCaseDSLPackage;

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
 * An implementation of the model object '<em><b>Normal Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseDSL.impl.NormalStepImpl#getStepAlternative <em>Step Alternative</em>}</li>
 *   <li>{@link UseCaseDSL.impl.NormalStepImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link UseCaseDSL.impl.NormalStepImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalStepImpl extends StepImpl implements NormalStep {
	/**
	 * The cached value of the '{@link #getStepAlternative() <em>Step Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<StepAlternative> stepAlternative;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Actor actor;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StepType TYPE_EDEFAULT = StepType.ALT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StepType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseDSLPackage.Literals.NORMAL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepAlternative> getStepAlternative() {
		if (stepAlternative == null) {
			stepAlternative = new EObjectContainmentEList<StepAlternative>(
					StepAlternative.class, this,
					UseCaseDSLPackage.NORMAL_STEP__STEP_ALTERNATIVE);
		}
		return stepAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject) actor;
			actor = (Actor) eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UseCaseDSLPackage.NORMAL_STEP__ACTOR, oldActor,
							actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Actor newActor) {
		Actor oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.NORMAL_STEP__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StepType newType) {
		StepType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.NORMAL_STEP__TYPE, oldType, type));
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
		case UseCaseDSLPackage.NORMAL_STEP__STEP_ALTERNATIVE:
			return ((InternalEList<?>) getStepAlternative()).basicRemove(
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
		case UseCaseDSLPackage.NORMAL_STEP__STEP_ALTERNATIVE:
			return getStepAlternative();
		case UseCaseDSLPackage.NORMAL_STEP__ACTOR:
			if (resolve)
				return getActor();
			return basicGetActor();
		case UseCaseDSLPackage.NORMAL_STEP__TYPE:
			return getType();
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
		case UseCaseDSLPackage.NORMAL_STEP__STEP_ALTERNATIVE:
			getStepAlternative().clear();
			getStepAlternative().addAll(
					(Collection<? extends StepAlternative>) newValue);
			return;
		case UseCaseDSLPackage.NORMAL_STEP__ACTOR:
			setActor((Actor) newValue);
			return;
		case UseCaseDSLPackage.NORMAL_STEP__TYPE:
			setType((StepType) newValue);
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
		case UseCaseDSLPackage.NORMAL_STEP__STEP_ALTERNATIVE:
			getStepAlternative().clear();
			return;
		case UseCaseDSLPackage.NORMAL_STEP__ACTOR:
			setActor((Actor) null);
			return;
		case UseCaseDSLPackage.NORMAL_STEP__TYPE:
			setType(TYPE_EDEFAULT);
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
		case UseCaseDSLPackage.NORMAL_STEP__STEP_ALTERNATIVE:
			return stepAlternative != null && !stepAlternative.isEmpty();
		case UseCaseDSLPackage.NORMAL_STEP__ACTOR:
			return actor != null;
		case UseCaseDSLPackage.NORMAL_STEP__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NormalStepImpl
