/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.GeneralOrdering;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.OccurrenceSpecification;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.OccurrenceSpecificationImpl#getToAfter <em>To After</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.OccurrenceSpecificationImpl#getToBefore <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccurrenceSpecificationImpl extends InteractionFragmentImpl
		implements OccurrenceSpecification {
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
	protected OccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.OCCURRENCE_SPECIFICATION;
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
					ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER,
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
					ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE,
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
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getToAfter())
					.basicAdd(otherEnd, msgs);
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
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
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
			return ((InternalEList<?>) getToAfter())
					.basicRemove(otherEnd, msgs);
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
			return getToAfter();
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
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
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
			getToAfter().clear();
			getToAfter().addAll(
					(Collection<? extends GeneralOrdering>) newValue);
			return;
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
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
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
			getToAfter().clear();
			return;
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
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
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
			return toAfter != null && !toAfter.isEmpty();
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
			return toBefore != null && !toBefore.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OccurrenceSpecificationImpl
