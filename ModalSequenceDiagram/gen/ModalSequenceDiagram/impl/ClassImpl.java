/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.Connector;
import ModalSequenceDiagram.EncapsulatedClassifier;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.Operation;
import ModalSequenceDiagram.Property;
import ModalSequenceDiagram.StructuredClassifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.ClassImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link ModalSequenceDiagram.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends BehavioredClassifierImpl implements
		ModalSequenceDiagram.Class {
	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(
					Connector.class, this,
					ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(
					Property.class, this,
					ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<Operation>(
					Operation.class, this,
					ModalSequenceDiagramPackage.CLASS__OWNED_OPERATION);
		}
		return ownedOperation;
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
		case ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR:
			return ((InternalEList<?>) getOwnedConnector()).basicRemove(
					otherEnd, msgs);
		case ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE:
			return ((InternalEList<?>) getOwnedAttribute()).basicRemove(
					otherEnd, msgs);
		case ModalSequenceDiagramPackage.CLASS__OWNED_OPERATION:
			return ((InternalEList<?>) getOwnedOperation()).basicRemove(
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
		case ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR:
			return getOwnedConnector();
		case ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE:
			return getOwnedAttribute();
		case ModalSequenceDiagramPackage.CLASS__OWNED_OPERATION:
			return getOwnedOperation();
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
		case ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR:
			getOwnedConnector().clear();
			getOwnedConnector().addAll(
					(Collection<? extends Connector>) newValue);
			return;
		case ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
			getOwnedAttribute().addAll(
					(Collection<? extends Property>) newValue);
			return;
		case ModalSequenceDiagramPackage.CLASS__OWNED_OPERATION:
			getOwnedOperation().clear();
			getOwnedOperation().addAll(
					(Collection<? extends Operation>) newValue);
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
		case ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR:
			getOwnedConnector().clear();
			return;
		case ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
			return;
		case ModalSequenceDiagramPackage.CLASS__OWNED_OPERATION:
			getOwnedOperation().clear();
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
		case ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR:
			return ownedConnector != null && !ownedConnector.isEmpty();
		case ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE:
			return ownedAttribute != null && !ownedAttribute.isEmpty();
		case ModalSequenceDiagramPackage.CLASS__OWNED_OPERATION:
			return ownedOperation != null && !ownedOperation.isEmpty();
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
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
			case ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR:
				return ModalSequenceDiagramPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
			case ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE:
				return ModalSequenceDiagramPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
			default:
				return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
			case ModalSequenceDiagramPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ModalSequenceDiagramPackage.CLASS__OWNED_CONNECTOR;
			case ModalSequenceDiagramPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ModalSequenceDiagramPackage.CLASS__OWNED_ATTRIBUTE;
			default:
				return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassImpl
