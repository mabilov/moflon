/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import TGGRuntime.impl.AbstractRuleImpl;

import org.eclipse.emf.ecore.EClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First User Task To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FirstUserTaskToStepRuleImpl extends AbstractRuleImpl
		implements FirstUserTaskToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstUserTaskToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFirstUserTaskToStepRule();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FirstUserTaskToStepRuleImpl
