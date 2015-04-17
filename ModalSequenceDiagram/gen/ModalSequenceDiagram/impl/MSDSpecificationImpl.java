/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.MSDSpecification;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.SpecificationKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSD Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModalSequenceDiagram.impl.MSDSpecificationImpl#getSpecificationKind <em>Specification Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSDSpecificationImpl extends PackageImpl implements
		MSDSpecification {
	/**
	 * The default value of the '{@link #getSpecificationKind() <em>Specification Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationKind()
	 * @generated
	 * @ordered
	 */
	protected static final SpecificationKind SPECIFICATION_KIND_EDEFAULT = SpecificationKind.UNTIMED;

	/**
	 * The cached value of the '{@link #getSpecificationKind() <em>Specification Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationKind()
	 * @generated
	 * @ordered
	 */
	protected SpecificationKind specificationKind = SPECIFICATION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSDSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModalSequenceDiagramPackage.Literals.MSD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationKind getSpecificationKind() {
		return specificationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationKind(SpecificationKind newSpecificationKind) {
		SpecificationKind oldSpecificationKind = specificationKind;
		specificationKind = newSpecificationKind == null ? SPECIFICATION_KIND_EDEFAULT
				: newSpecificationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ModalSequenceDiagramPackage.MSD_SPECIFICATION__SPECIFICATION_KIND,
					oldSpecificationKind, specificationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModalSequenceDiagramPackage.MSD_SPECIFICATION__SPECIFICATION_KIND:
			return getSpecificationKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModalSequenceDiagramPackage.MSD_SPECIFICATION__SPECIFICATION_KIND:
			setSpecificationKind((SpecificationKind) newValue);
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
		case ModalSequenceDiagramPackage.MSD_SPECIFICATION__SPECIFICATION_KIND:
			setSpecificationKind(SPECIFICATION_KIND_EDEFAULT);
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
		case ModalSequenceDiagramPackage.MSD_SPECIFICATION__SPECIFICATION_KIND:
			return specificationKind != SPECIFICATION_KIND_EDEFAULT;
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
		result.append(" (specificationKind: ");
		result.append(specificationKind);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MSDSpecificationImpl
