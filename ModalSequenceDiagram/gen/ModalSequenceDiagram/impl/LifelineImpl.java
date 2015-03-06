/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.ConnectableElement;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;

import ModalSequenceDiagram.PartDecomposition;
import ModalSequenceDiagram.ValueSpecification;
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
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.LifelineImpl#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends NamedElementImpl implements Lifeline {
	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement represents;

	/**
	 * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> coveredBy;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> selector;

	/**
	 * The cached value of the '{@link #getDecomposedAs() <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedAs()
	 * @generated
	 * @ordered
	 */
	protected PartDecomposition decomposedAs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID() != ModalSequenceDiagramPackage.LIFELINE__INTERACTION)
			return null;
		return (Interaction) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInteraction,
				ModalSequenceDiagramPackage.LIFELINE__INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eInternalContainer()
				|| (eContainerFeatureID() != ModalSequenceDiagramPackage.LIFELINE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject) newInteraction).eInverseAdd(this,
						ModalSequenceDiagramPackage.INTERACTION__LIFELINE,
						Interaction.class, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.LIFELINE__INTERACTION,
					newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject) represents;
			represents = (ConnectableElement) eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModalSequenceDiagramPackage.LIFELINE__REPRESENTS,
							oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(ConnectableElement newRepresents) {
		ConnectableElement oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.LIFELINE__REPRESENTS,
					oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getCoveredBy() {
		if (coveredBy == null) {
			coveredBy = new EObjectWithInverseResolvingEList.ManyInverse<InteractionFragment>(
					InteractionFragment.class, this,
					ModalSequenceDiagramPackage.LIFELINE__COVERED_BY,
					ModalSequenceDiagramPackage.INTERACTION_FRAGMENT__COVERED);
		}
		return coveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getSelector() {
		if (selector == null) {
			selector = new EObjectContainmentEList<ValueSpecification>(
					ValueSpecification.class, this,
					ModalSequenceDiagramPackage.LIFELINE__SELECTOR);
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition getDecomposedAs() {
		if (decomposedAs != null && decomposedAs.eIsProxy()) {
			InternalEObject oldDecomposedAs = (InternalEObject) decomposedAs;
			decomposedAs = (PartDecomposition) eResolveProxy(oldDecomposedAs);
			if (decomposedAs != oldDecomposedAs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ModalSequenceDiagramPackage.LIFELINE__DECOMPOSED_AS,
							oldDecomposedAs, decomposedAs));
			}
		}
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition basicGetDecomposedAs() {
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs(PartDecomposition newDecomposedAs) {
		PartDecomposition oldDecomposedAs = decomposedAs;
		decomposedAs = newDecomposedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModalSequenceDiagramPackage.LIFELINE__DECOMPOSED_AS,
					oldDecomposedAs, decomposedAs));
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInteraction((Interaction) otherEnd, msgs);
		case ModalSequenceDiagramPackage.LIFELINE__COVERED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCoveredBy())
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			return basicSetInteraction(null, msgs);
		case ModalSequenceDiagramPackage.LIFELINE__COVERED_BY:
			return ((InternalEList<?>) getCoveredBy()).basicRemove(otherEnd,
					msgs);
		case ModalSequenceDiagramPackage.LIFELINE__SELECTOR:
			return ((InternalEList<?>) getSelector()).basicRemove(otherEnd,
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			return eInternalContainer().eInverseRemove(this,
					ModalSequenceDiagramPackage.INTERACTION__LIFELINE,
					Interaction.class, msgs);
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			return getInteraction();
		case ModalSequenceDiagramPackage.LIFELINE__REPRESENTS:
			if (resolve)
				return getRepresents();
			return basicGetRepresents();
		case ModalSequenceDiagramPackage.LIFELINE__COVERED_BY:
			return getCoveredBy();
		case ModalSequenceDiagramPackage.LIFELINE__SELECTOR:
			return getSelector();
		case ModalSequenceDiagramPackage.LIFELINE__DECOMPOSED_AS:
			if (resolve)
				return getDecomposedAs();
			return basicGetDecomposedAs();
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			setInteraction((Interaction) newValue);
			return;
		case ModalSequenceDiagramPackage.LIFELINE__REPRESENTS:
			setRepresents((ConnectableElement) newValue);
			return;
		case ModalSequenceDiagramPackage.LIFELINE__COVERED_BY:
			getCoveredBy().clear();
			getCoveredBy().addAll(
					(Collection<? extends InteractionFragment>) newValue);
			return;
		case ModalSequenceDiagramPackage.LIFELINE__SELECTOR:
			getSelector().clear();
			getSelector().addAll(
					(Collection<? extends ValueSpecification>) newValue);
			return;
		case ModalSequenceDiagramPackage.LIFELINE__DECOMPOSED_AS:
			setDecomposedAs((PartDecomposition) newValue);
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			setInteraction((Interaction) null);
			return;
		case ModalSequenceDiagramPackage.LIFELINE__REPRESENTS:
			setRepresents((ConnectableElement) null);
			return;
		case ModalSequenceDiagramPackage.LIFELINE__COVERED_BY:
			getCoveredBy().clear();
			return;
		case ModalSequenceDiagramPackage.LIFELINE__SELECTOR:
			getSelector().clear();
			return;
		case ModalSequenceDiagramPackage.LIFELINE__DECOMPOSED_AS:
			setDecomposedAs((PartDecomposition) null);
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
		case ModalSequenceDiagramPackage.LIFELINE__INTERACTION:
			return getInteraction() != null;
		case ModalSequenceDiagramPackage.LIFELINE__REPRESENTS:
			return represents != null;
		case ModalSequenceDiagramPackage.LIFELINE__COVERED_BY:
			return coveredBy != null && !coveredBy.isEmpty();
		case ModalSequenceDiagramPackage.LIFELINE__SELECTOR:
			return selector != null && !selector.isEmpty();
		case ModalSequenceDiagramPackage.LIFELINE__DECOMPOSED_AS:
			return decomposedAs != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LifelineImpl
