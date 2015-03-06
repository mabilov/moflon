/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.Action;
import ModalSequenceDiagram.Gate;
import ModalSequenceDiagram.GeneralOrdering;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.NamedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.InteractionImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> covered;

	/**
	 * The cached value of the '{@link #getGeneralOrdering() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> generalOrdering;

	/**
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifeline;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragment;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * The cached value of the '{@link #getFormalGate() <em>Formal Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> formalGate;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID() != ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingInteraction(
			Interaction newEnclosingInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnclosingInteraction,
				ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer()
				|| (eContainerFeatureID() != ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject) newEnclosingInteraction).eInverseAdd(
						this,
						ModalSequenceDiagramPackage.INTERACTION__FRAGMENT,
						Interaction.class, msgs);
			msgs = basicSetEnclosingInteraction(newEnclosingInteraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION,
					newEnclosingInteraction, newEnclosingInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered() {
		if (covered == null) {
			covered = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(
					Lifeline.class, this,
					ModalSequenceDiagramPackage.INTERACTION__COVERED,
					ModalSequenceDiagramPackage.LIFELINE__COVERED_BY);
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID() != ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND)
			return null;
		return (InteractionOperand) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingOperand(
			InteractionOperand newEnclosingOperand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnclosingOperand,
				ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer()
				|| (eContainerFeatureID() != ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject) newEnclosingOperand)
						.eInverseAdd(
								this,
								ModalSequenceDiagramPackage.INTERACTION_OPERAND__FRAGMENT,
								InteractionOperand.class, msgs);
			msgs = basicSetEnclosingOperand(newEnclosingOperand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND,
					newEnclosingOperand, newEnclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(
					GeneralOrdering.class, this,
					ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifeline() {
		if (lifeline == null) {
			lifeline = new EObjectContainmentWithInverseEList<Lifeline>(
					Lifeline.class, this,
					ModalSequenceDiagramPackage.INTERACTION__LIFELINE,
					ModalSequenceDiagramPackage.LIFELINE__INTERACTION);
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentWithInverseEList<InteractionFragment>(
					InteractionFragment.class,
					this,
					ModalSequenceDiagramPackage.INTERACTION__FRAGMENT,
					ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentWithInverseEList<Message>(
					Message.class, this,
					ModalSequenceDiagramPackage.INTERACTION__MESSAGE,
					ModalSequenceDiagramPackage.MESSAGE__INTERACTION);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getFormalGate() {
		if (formalGate == null) {
			formalGate = new EObjectContainmentEList<Gate>(Gate.class, this,
					ModalSequenceDiagramPackage.INTERACTION__FORMAL_GATE);
		}
		return formalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this,
					ModalSequenceDiagramPackage.INTERACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnclosingInteraction((Interaction) otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__COVERED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCovered())
					.basicAdd(otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnclosingOperand((InteractionOperand) otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__LIFELINE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLifeline())
					.basicAdd(otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__FRAGMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFragment())
					.basicAdd(otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__MESSAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMessage())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			return basicSetEnclosingInteraction(null, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__COVERED:
			return ((InternalEList<?>) getCovered())
					.basicRemove(otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			return basicSetEnclosingOperand(null, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING:
			return ((InternalEList<?>) getGeneralOrdering()).basicRemove(
					otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__LIFELINE:
			return ((InternalEList<?>) getLifeline()).basicRemove(otherEnd,
					msgs);
		case ModalSequenceDiagramPackage.INTERACTION__FRAGMENT:
			return ((InternalEList<?>) getFragment()).basicRemove(otherEnd,
					msgs);
		case ModalSequenceDiagramPackage.INTERACTION__MESSAGE:
			return ((InternalEList<?>) getMessage())
					.basicRemove(otherEnd, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__FORMAL_GATE:
			return ((InternalEList<?>) getFormalGate()).basicRemove(otherEnd,
					msgs);
		case ModalSequenceDiagramPackage.INTERACTION__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			return eInternalContainer().eInverseRemove(this,
					ModalSequenceDiagramPackage.INTERACTION__FRAGMENT,
					Interaction.class, msgs);
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			return eInternalContainer().eInverseRemove(this,
					ModalSequenceDiagramPackage.INTERACTION_OPERAND__FRAGMENT,
					InteractionOperand.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			return getEnclosingInteraction();
		case ModalSequenceDiagramPackage.INTERACTION__COVERED:
			return getCovered();
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			return getEnclosingOperand();
		case ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING:
			return getGeneralOrdering();
		case ModalSequenceDiagramPackage.INTERACTION__LIFELINE:
			return getLifeline();
		case ModalSequenceDiagramPackage.INTERACTION__FRAGMENT:
			return getFragment();
		case ModalSequenceDiagramPackage.INTERACTION__MESSAGE:
			return getMessage();
		case ModalSequenceDiagramPackage.INTERACTION__FORMAL_GATE:
			return getFormalGate();
		case ModalSequenceDiagramPackage.INTERACTION__ACTION:
			return getAction();
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
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			setEnclosingInteraction((Interaction) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__COVERED:
			getCovered().clear();
			getCovered().addAll((Collection<? extends Lifeline>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			setEnclosingOperand((InteractionOperand) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING:
			getGeneralOrdering().clear();
			getGeneralOrdering().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__LIFELINE:
			getLifeline().clear();
			getLifeline().addAll((Collection<? extends Lifeline>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__FRAGMENT:
			getFragment().clear();
			getFragment().addAll(
					(Collection<? extends InteractionFragment>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__FORMAL_GATE:
			getFormalGate().clear();
			getFormalGate().addAll((Collection<? extends Gate>) newValue);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
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
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			setEnclosingInteraction((Interaction) null);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__COVERED:
			getCovered().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			setEnclosingOperand((InteractionOperand) null);
			return;
		case ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING:
			getGeneralOrdering().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION__LIFELINE:
			getLifeline().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION__FRAGMENT:
			getFragment().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION__MESSAGE:
			getMessage().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION__FORMAL_GATE:
			getFormalGate().clear();
			return;
		case ModalSequenceDiagramPackage.INTERACTION__ACTION:
			getAction().clear();
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
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
			return getEnclosingInteraction() != null;
		case ModalSequenceDiagramPackage.INTERACTION__COVERED:
			return covered != null && !covered.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
			return getEnclosingOperand() != null;
		case ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING:
			return generalOrdering != null && !generalOrdering.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION__LIFELINE:
			return lifeline != null && !lifeline.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION__FRAGMENT:
			return fragment != null && !fragment.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION__MESSAGE:
			return message != null && !message.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION__FORMAL_GATE:
			return formalGate != null && !formalGate.isEmpty();
		case ModalSequenceDiagramPackage.INTERACTION__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
			case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
			case ModalSequenceDiagramPackage.INTERACTION__COVERED:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__COVERED;
			case ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
			case ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				return ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_INTERACTION;
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__COVERED:
				return ModalSequenceDiagramPackage.INTERACTION__COVERED;
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return ModalSequenceDiagramPackage.INTERACTION__ENCLOSING_OPERAND;
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return ModalSequenceDiagramPackage.INTERACTION__GENERAL_ORDERING;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InteractionImpl
