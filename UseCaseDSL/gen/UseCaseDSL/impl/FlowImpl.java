/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.Flow;
import UseCaseDSL.Step;
import UseCaseDSL.UCCondition;
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
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseDSL.impl.FlowImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link UseCaseDSL.impl.FlowImpl#getFinalState <em>Final State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowImpl extends EObjectImpl implements Flow {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected UCCondition finalState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseDSLPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this,
					UseCaseDSLPackage.FLOW__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCCondition getFinalState() {
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalState(UCCondition newFinalState,
			NotificationChain msgs) {
		UCCondition oldFinalState = finalState;
		finalState = newFinalState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UseCaseDSLPackage.FLOW__FINAL_STATE,
					oldFinalState, newFinalState);
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
	public void setFinalState(UCCondition newFinalState) {
		if (newFinalState != finalState) {
			NotificationChain msgs = null;
			if (finalState != null)
				msgs = ((InternalEObject) finalState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UseCaseDSLPackage.FLOW__FINAL_STATE, null,
						msgs);
			if (newFinalState != null)
				msgs = ((InternalEObject) newFinalState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UseCaseDSLPackage.FLOW__FINAL_STATE, null,
						msgs);
			msgs = basicSetFinalState(newFinalState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UseCaseDSLPackage.FLOW__FINAL_STATE, newFinalState,
					newFinalState));
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
		case UseCaseDSLPackage.FLOW__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case UseCaseDSLPackage.FLOW__FINAL_STATE:
			return basicSetFinalState(null, msgs);
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
		case UseCaseDSLPackage.FLOW__STEPS:
			return getSteps();
		case UseCaseDSLPackage.FLOW__FINAL_STATE:
			return getFinalState();
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
		case UseCaseDSLPackage.FLOW__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case UseCaseDSLPackage.FLOW__FINAL_STATE:
			setFinalState((UCCondition) newValue);
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
		case UseCaseDSLPackage.FLOW__STEPS:
			getSteps().clear();
			return;
		case UseCaseDSLPackage.FLOW__FINAL_STATE:
			setFinalState((UCCondition) null);
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
		case UseCaseDSLPackage.FLOW__STEPS:
			return steps != null && !steps.isEmpty();
		case UseCaseDSLPackage.FLOW__FINAL_STATE:
			return finalState != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FlowImpl
