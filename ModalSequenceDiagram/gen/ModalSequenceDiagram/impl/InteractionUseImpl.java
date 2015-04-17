/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.Gate;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionUse;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.ValueSpecification;

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
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionUseImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionUseImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionUseImpl#getActualGate <em>Actual Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionUseImpl extends InteractionFragmentImpl implements
		InteractionUse {
	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification returnValue;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> argument;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Interaction refersTo;

	/**
	 * The cached value of the '{@link #getActualGate() <em>Actual Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(
			ValueSpecification newReturnValue, NotificationChain msgs) {
		ValueSpecification oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE,
					oldReturnValue, newReturnValue);
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
	public void setReturnValue(ValueSpecification newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject) returnValue)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE,
								null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject) newReturnValue)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE,
								null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE,
					newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<ValueSpecification>(
					ValueSpecification.class, this,
					ModalSequenceDiagramPackage.INTERACTION_USE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject) refersTo;
			refersTo = (Interaction) eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ModalSequenceDiagramPackage.INTERACTION_USE__REFERS_TO,
							oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.INTERACTION_USE__REFERS_TO,
					oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGate() {
		if (actualGate == null) {
			actualGate = new EObjectContainmentEList<Gate>(Gate.class, this,
					ModalSequenceDiagramPackage.INTERACTION_USE__ACTUAL_GATE);
		}
		return actualGate;
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
		case ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE:
			return basicSetReturnValue(null, msgs);
		case ModalSequenceDiagramPackage.INTERACTION_USE__ARGUMENT:
			return ((InternalEList<?>) getArgument()).basicRemove(otherEnd,
					msgs);
		case ModalSequenceDiagramPackage.INTERACTION_USE__ACTUAL_GATE:
			return ((InternalEList<?>) getActualGate()).basicRemove(otherEnd,
					msgs);
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
		case ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE:
			return getReturnValue();
		case ModalSequenceDiagramPackage.INTERACTION_USE__ARGUMENT:
			return getArgument();
		case ModalSequenceDiagramPackage.INTERACTION_USE__REFERS_TO:
			if (resolve)
				return getRefersTo();
			return basicGetRefersTo();
		case ModalSequenceDiagramPackage.INTERACTION_USE__ACTUAL_GATE:
			return getActualGate();
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
		case ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE:
			setReturnValue((ValueSpecification) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION_USE__ARGUMENT:
			getArgument().clear();
			getArgument().addAll(
					(Collection<? extends ValueSpecification>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION_USE__REFERS_TO:
			setRefersTo((Interaction) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION_USE__ACTUAL_GATE:
			getActualGate().clear();
			getActualGate().addAll((Collection<? extends Gate>) newValue);
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
		case ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE:
			setReturnValue((ValueSpecification) null);
			return;
		case ModalSequenceDiagramPackage.INTERACTION_USE__ARGUMENT:
			getArgument().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION_USE__REFERS_TO:
			setRefersTo((Interaction) null);
			return;
		case ModalSequenceDiagramPackage.INTERACTION_USE__ACTUAL_GATE:
			getActualGate().clear();
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
		case ModalSequenceDiagramPackage.INTERACTION_USE__RETURN_VALUE:
			return returnValue != null;
		case ModalSequenceDiagramPackage.INTERACTION_USE__ARGUMENT:
			return argument != null && !argument.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION_USE__REFERS_TO:
			return refersTo != null;
		case ModalSequenceDiagramPackage.INTERACTION_USE__ACTUAL_GATE:
			return actualGate != null && !actualGate.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InteractionUseImpl
