/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Gate;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.InteractionOperatorKind;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;

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
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.CombinedFragmentImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.CombinedFragmentImpl#getCfragmentGate <em>Cfragment Gate</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements
		CombinedFragment {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionOperand> operand;

	/**
	 * The cached value of the '{@link #getCfragmentGate() <em>Cfragment Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfragmentGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> cfragmentGate;

	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperatorKind INTERACTION_OPERATOR_EDEFAULT = InteractionOperatorKind.SEQ;

	/**
	 * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperatorKind interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.COMBINED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionOperand> getOperand() {
		if (operand == null) {
			operand = new EObjectContainmentEList<InteractionOperand>(
					InteractionOperand.class, this,
					ModalSequenceDiagramPackage.COMBINED_FRAGMENT__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getCfragmentGate() {
		if (cfragmentGate == null) {
			cfragmentGate = new EObjectContainmentEList<Gate>(
					Gate.class,
					this,
					ModalSequenceDiagramPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		}
		return cfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind getInteractionOperator() {
		return interactionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(
			InteractionOperatorKind newInteractionOperator) {
		InteractionOperatorKind oldInteractionOperator = interactionOperator;
		interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT
				: newInteractionOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ModalSequenceDiagramPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR,
					oldInteractionOperator, interactionOperator));
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
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__OPERAND:
			return ((InternalEList<?>) getOperand())
					.basicRemove(otherEnd, msgs);
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
			return ((InternalEList<?>) getCfragmentGate()).basicRemove(
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
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__OPERAND:
			return getOperand();
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
			return getCfragmentGate();
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
			return getInteractionOperator();
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
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__OPERAND:
			getOperand().clear();
			getOperand().addAll(
					(Collection<? extends InteractionOperand>) newValue);
			return;
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
			getCfragmentGate().clear();
			getCfragmentGate().addAll((Collection<? extends Gate>) newValue);
			return;
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
			setInteractionOperator((InteractionOperatorKind) newValue);
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
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__OPERAND:
			getOperand().clear();
			return;
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
			getCfragmentGate().clear();
			return;
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
			setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
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
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__OPERAND:
			return operand != null && !operand.isEmpty();
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
			return cfragmentGate != null && !cfragmentGate.isEmpty();
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
			return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
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
		result.append(" (interactionOperator: ");
		result.append(interactionOperator);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CombinedFragmentImpl
