/**
 */
package UseCaseToModalSequenceDiagramIntegration.impl;

import ModalSequenceDiagram.InteractionOperand;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import UseCaseDSL.StepAlternative;

import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Alternative To Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.impl.StepAlternativeToInteractionOperandImpl#getSource <em>Source</em>}</li>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.impl.StepAlternativeToInteractionOperandImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepAlternativeToInteractionOperandImpl extends
		AbstractCorrespondenceImpl implements
		StepAlternativeToInteractionOperand {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected StepAlternative source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperand target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepAlternativeToInteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseToModalSequenceDiagramIntegrationPackage.Literals.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepAlternative getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (StepAlternative) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__SOURCE,
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
	public StepAlternative basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(StepAlternative newSource) {
		StepAlternative oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (InteractionOperand) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__TARGET,
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
	public InteractionOperand basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InteractionOperand newTarget) {
		InteractionOperand oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__TARGET,
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__TARGET:
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__SOURCE:
			setSource((StepAlternative) newValue);
			return;
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__TARGET:
			setTarget((InteractionOperand) newValue);
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__SOURCE:
			setSource((StepAlternative) null);
			return;
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__TARGET:
			setTarget((InteractionOperand) null);
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__SOURCE:
			return source != null;
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StepAlternativeToInteractionOperandImpl
