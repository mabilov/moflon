/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.UseCaseDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCaseDSL.impl.ParallelStepImpl#getInvokedFlows <em>Invoked Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelStepImpl extends StepImpl implements ParallelStep {
	/**
	 * The cached value of the '{@link #getInvokedFlows() <em>Invoked Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<ParallelFlow> invokedFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCaseDSLPackage.Literals.PARALLEL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParallelFlow> getInvokedFlows() {
		if (invokedFlows == null) {
			invokedFlows = new EObjectResolvingEList<ParallelFlow>(
					ParallelFlow.class, this,
					UseCaseDSLPackage.PARALLEL_STEP__INVOKED_FLOWS);
		}
		return invokedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UseCaseDSLPackage.PARALLEL_STEP__INVOKED_FLOWS:
			return getInvokedFlows();
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
		case UseCaseDSLPackage.PARALLEL_STEP__INVOKED_FLOWS:
			getInvokedFlows().clear();
			getInvokedFlows().addAll(
					(Collection<? extends ParallelFlow>) newValue);
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
		case UseCaseDSLPackage.PARALLEL_STEP__INVOKED_FLOWS:
			getInvokedFlows().clear();
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
		case UseCaseDSLPackage.PARALLEL_STEP__INVOKED_FLOWS:
			return invokedFlows != null && !invokedFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelStepImpl
