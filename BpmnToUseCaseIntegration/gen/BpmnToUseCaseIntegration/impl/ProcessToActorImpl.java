/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import BpmnToUseCaseIntegration.ProcessToActor;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import UseCaseDSL.Actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process To Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.impl.ProcessToActorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.impl.ProcessToActorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessToActorImpl extends AbstractCorrespondenceImpl implements
		ProcessToActor {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected bpmn2.Process source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Actor target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessToActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnToUseCaseIntegrationPackage.Literals.PROCESS_TO_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bpmn2.Process getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (bpmn2.Process) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__SOURCE,
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
	public bpmn2.Process basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(bpmn2.Process newSource) {
		bpmn2.Process oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Actor) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__TARGET,
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
	public Actor basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Actor newTarget) {
		Actor oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__TARGET,
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
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__TARGET:
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
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__SOURCE:
			setSource((bpmn2.Process) newValue);
			return;
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__TARGET:
			setTarget((Actor) newValue);
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
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__SOURCE:
			setSource((bpmn2.Process) null);
			return;
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__TARGET:
			setTarget((Actor) null);
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
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__SOURCE:
			return source != null;
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProcessToActorImpl
