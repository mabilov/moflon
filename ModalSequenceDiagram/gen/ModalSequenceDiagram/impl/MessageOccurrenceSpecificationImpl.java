/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.GeneralOrdering;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.OccurrenceSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl#getToAfter <em>To After</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl#getToBefore <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageOccurrenceSpecificationImpl extends MessageEndImpl
		implements MessageOccurrenceSpecification {
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
	 * The cached value of the '{@link #getToAfter() <em>To After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toAfter;

	/**
	 * The cached value of the '{@link #getToBefore() <em>To Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toBefore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.MESSAGE_OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID() != ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION)
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
		msgs = eBasicSetContainer(
				(InternalEObject) newEnclosingInteraction,
				ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION,
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
				|| (eContainerFeatureID() != ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
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
					ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION,
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
					Lifeline.class,
					this,
					ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED,
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
		if (eContainerFeatureID() != ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND)
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
		msgs = eBasicSetContainer(
				(InternalEObject) newEnclosingOperand,
				ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND,
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
				|| (eContainerFeatureID() != ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
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
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND,
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
					GeneralOrdering.class,
					this,
					ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToAfter() {
		if (toAfter == null) {
			toAfter = new EObjectWithInverseResolvingEList<GeneralOrdering>(
					GeneralOrdering.class,
					this,
					ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER,
					ModalSequenceDiagramPackage.GENERAL_ORDERING__BEFORE);
		}
		return toAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToBefore() {
		if (toBefore == null) {
			toBefore = new EObjectWithInverseResolvingEList<GeneralOrdering>(
					GeneralOrdering.class,
					this,
					ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE,
					ModalSequenceDiagramPackage.GENERAL_ORDERING__AFTER);
		}
		return toBefore;
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
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnclosingInteraction((Interaction) otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCovered())
					.basicAdd(otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnclosingOperand((InteractionOperand) otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getToAfter())
					.basicAdd(otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getToBefore())
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
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			return basicSetEnclosingInteraction(null, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
			return ((InternalEList<?>) getCovered())
					.basicRemove(otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
			return basicSetEnclosingOperand(null, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING:
			return ((InternalEList<?>) getGeneralOrdering()).basicRemove(
					otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
			return ((InternalEList<?>) getToAfter())
					.basicRemove(otherEnd, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
			return ((InternalEList<?>) getToBefore()).basicRemove(otherEnd,
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			return eInternalContainer().eInverseRemove(this,
					ModalSequenceDiagramPackage.INTERACTION__FRAGMENT,
					Interaction.class, msgs);
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
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
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			return getEnclosingInteraction();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
			return getCovered();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
			return getEnclosingOperand();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING:
			return getGeneralOrdering();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
			return getToAfter();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
			return getToBefore();
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
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			setEnclosingInteraction((Interaction) newValue);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
			getCovered().clear();
			getCovered().addAll((Collection<? extends Lifeline>) newValue);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
			setEnclosingOperand((InteractionOperand) newValue);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING:
			getGeneralOrdering().clear();
			getGeneralOrdering().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
			getToAfter().clear();
			getToAfter().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
			getToBefore().clear();
			getToBefore().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
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
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			setEnclosingInteraction((Interaction) null);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
			getCovered().clear();
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
			setEnclosingOperand((InteractionOperand) null);
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING:
			getGeneralOrdering().clear();
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
			getToAfter().clear();
			return;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
			getToBefore().clear();
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
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
			return getEnclosingInteraction() != null;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
			return covered != null && !covered.isEmpty();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
			return getEnclosingOperand() != null;
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING:
			return generalOrdering != null && !generalOrdering.isEmpty();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
			return toAfter != null && !toAfter.isEmpty();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
			return toBefore != null && !toBefore.isEmpty();
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
			case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
			case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__COVERED;
			case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
			case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING:
				return ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
			default:
				return -1;
			}
		}
		if (baseClass == OccurrenceSpecification.class) {
			switch (derivedFeatureID) {
			case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER:
				return ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER;
			case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE;
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
				return ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__COVERED:
				return ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED;
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;
			case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;
			default:
				return -1;
			}
		}
		if (baseClass == OccurrenceSpecification.class) {
			switch (baseFeatureID) {
			case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER;
			case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MessageOccurrenceSpecificationImpl
