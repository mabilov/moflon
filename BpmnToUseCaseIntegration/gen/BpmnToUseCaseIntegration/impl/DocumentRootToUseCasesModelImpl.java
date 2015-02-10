/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration;
import BpmnToUseCaseIntegration.DocumentRootToUseCasesModel;

import TGGLanguage.csp.*;
import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;
import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;
import TGGRuntime.impl.AbstractCorrespondenceImpl;

import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;

import csp.constraints.*;
import de.upb.tools.sdm.*;
import java.util.*;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.moflon.csp.CSPFactoryHelper;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root To Use Cases Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootToUseCasesModelImpl extends AbstractCorrespondenceImpl
		implements DocumentRootToUseCasesModel {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DocumentRoot source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected UseCasesModel target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootToUseCasesModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnToUseCaseIntegrationPackage.Literals.DOCUMENT_ROOT_TO_USE_CASES_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (DocumentRoot) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DocumentRoot newSource) {
		DocumentRoot oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasesModel getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (UseCasesModel) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasesModel basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(UseCasesModel newTarget) {
		UseCasesModel oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE:
			setSource((DocumentRoot) newValue);
			return;
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET:
			setTarget((UseCasesModel) newValue);
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
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE:
			setSource((DocumentRoot) null);
			return;
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET:
			setTarget((UseCasesModel) null);
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
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE:
			return source != null;
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DocumentRootToUseCasesModelImpl