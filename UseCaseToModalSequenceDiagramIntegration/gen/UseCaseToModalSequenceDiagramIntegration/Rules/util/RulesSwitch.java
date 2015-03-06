/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.util;

import TGGRuntime.AbstractRule;

import UseCaseToModalSequenceDiagramIntegration.Rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE: {
			UCModelToMSDModelRule ucModelToMSDModelRule = (UCModelToMSDModelRule) theEObject;
			T result = caseUCModelToMSDModelRule(ucModelToMSDModelRule);
			if (result == null)
				result = caseAbstractRule(ucModelToMSDModelRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE: {
			UCPackageToMSDPackage ucPackageToMSDPackage = (UCPackageToMSDPackage) theEObject;
			T result = caseUCPackageToMSDPackage(ucPackageToMSDPackage);
			if (result == null)
				result = caseAbstractRule(ucPackageToMSDPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE: {
			UseCaseToInteractionRule useCaseToInteractionRule = (UseCaseToInteractionRule) theEObject;
			T result = caseUseCaseToInteractionRule(useCaseToInteractionRule);
			if (result == null)
				result = caseAbstractRule(useCaseToInteractionRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ACTOR_TO_CLASS_RULE: {
			ActorToClassRule actorToClassRule = (ActorToClassRule) theEObject;
			T result = caseActorToClassRule(actorToClassRule);
			if (result == null)
				result = caseAbstractRule(actorToClassRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE: {
			NormalStepToMessageRule normalStepToMessageRule = (NormalStepToMessageRule) theEObject;
			T result = caseNormalStepToMessageRule(normalStepToMessageRule);
			if (result == null)
				result = caseAbstractRule(normalStepToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE: {
			NormalStepBasicFlowToMessageRule normalStepBasicFlowToMessageRule = (NormalStepBasicFlowToMessageRule) theEObject;
			T result = caseNormalStepBasicFlowToMessageRule(normalStepBasicFlowToMessageRule);
			if (result == null)
				result = caseNormalStepToMessageRule(normalStepBasicFlowToMessageRule);
			if (result == null)
				result = caseAbstractRule(normalStepBasicFlowToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE: {
			NormalStepNamedFlowToMessageRule normalStepNamedFlowToMessageRule = (NormalStepNamedFlowToMessageRule) theEObject;
			T result = caseNormalStepNamedFlowToMessageRule(normalStepNamedFlowToMessageRule);
			if (result == null)
				result = caseNormalStepToMessageRule(normalStepNamedFlowToMessageRule);
			if (result == null)
				result = caseAbstractRule(normalStepNamedFlowToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.STEP_TO_COMBINED_FRAGMENT_RULE: {
			StepToCombinedFragmentRule stepToCombinedFragmentRule = (StepToCombinedFragmentRule) theEObject;
			T result = caseStepToCombinedFragmentRule(stepToCombinedFragmentRule);
			if (result == null)
				result = caseNormalStepToMessageRule(stepToCombinedFragmentRule);
			if (result == null)
				result = caseAbstractRule(stepToCombinedFragmentRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE: {
			StepAltToOperandRule stepAltToOperandRule = (StepAltToOperandRule) theEObject;
			T result = caseStepAltToOperandRule(stepAltToOperandRule);
			if (result == null)
				result = caseAbstractRule(stepAltToOperandRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Model To MSD Model Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Model To MSD Model Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCModelToMSDModelRule(UCModelToMSDModelRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Package To MSD Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Package To MSD Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCPackageToMSDPackage(UCPackageToMSDPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case To Interaction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case To Interaction Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCaseToInteractionRule(UseCaseToInteractionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor To Class Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor To Class Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorToClassRule(ActorToClassRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepToMessageRule(NormalStepToMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step Basic Flow To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step Basic Flow To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepBasicFlowToMessageRule(
			NormalStepBasicFlowToMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step Named Flow To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step Named Flow To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepNamedFlowToMessageRule(
			NormalStepNamedFlowToMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step To Combined Fragment Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step To Combined Fragment Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepToCombinedFragmentRule(StepToCombinedFragmentRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Alt To Operand Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Alt To Operand Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepAltToOperandRule(StepAltToOperandRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
