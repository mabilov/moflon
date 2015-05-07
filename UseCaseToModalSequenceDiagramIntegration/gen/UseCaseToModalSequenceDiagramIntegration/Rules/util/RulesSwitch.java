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
	 * @param ePackage the package in question.
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
		case RulesPackage.WAIT_STEP_TO_FOUND_MESSAGE_RULE: {
			WaitStepToFoundMessageRule waitStepToFoundMessageRule = (WaitStepToFoundMessageRule) theEObject;
			T result = caseWaitStepToFoundMessageRule(waitStepToFoundMessageRule);
			if (result == null)
				result = caseAbstractRule(waitStepToFoundMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE: {
			SendStepToLostMessageRule sendStepToLostMessageRule = (SendStepToLostMessageRule) theEObject;
			T result = caseSendStepToLostMessageRule(sendStepToLostMessageRule);
			if (result == null)
				result = caseAbstractRule(sendStepToLostMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.STEP_TO_MESSAGE_RULE: {
			StepToMessageRule stepToMessageRule = (StepToMessageRule) theEObject;
			T result = caseStepToMessageRule(stepToMessageRule);
			if (result == null)
				result = caseAbstractRule(stepToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
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
		case RulesPackage.ACTOR_TO_LIFELINE_RULE: {
			ActorToLifelineRule actorToLifelineRule = (ActorToLifelineRule) theEObject;
			T result = caseActorToLifelineRule(actorToLifelineRule);
			if (result == null)
				result = caseAbstractRule(actorToLifelineRule);
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
		case RulesPackage.NORMAL_STEP_BF_TO_MESSAGE_RULE: {
			NormalStepBFToMessageRule normalStepBFToMessageRule = (NormalStepBFToMessageRule) theEObject;
			T result = caseNormalStepBFToMessageRule(normalStepBFToMessageRule);
			if (result == null)
				result = caseAbstractRule(normalStepBFToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NORMAL_STEP_NF_TO_MESSAGE_RULE: {
			NormalStepNFToMessageRule normalStepNFToMessageRule = (NormalStepNFToMessageRule) theEObject;
			T result = caseNormalStepNFToMessageRule(normalStepNFToMessageRule);
			if (result == null)
				result = caseAbstractRule(normalStepNFToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ALT_STEP_TO_COMBO_RULE: {
			AltStepToComboRule altStepToComboRule = (AltStepToComboRule) theEObject;
			T result = caseAltStepToComboRule(altStepToComboRule);
			if (result == null)
				result = caseAbstractRule(altStepToComboRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE: {
			ParallelStepToCombinedFragmentRule parallelStepToCombinedFragmentRule = (ParallelStepToCombinedFragmentRule) theEObject;
			T result = caseParallelStepToCombinedFragmentRule(parallelStepToCombinedFragmentRule);
			if (result == null)
				result = caseAbstractRule(parallelStepToCombinedFragmentRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE: {
			ParallelFlowToOperandRule parallelFlowToOperandRule = (ParallelFlowToOperandRule) theEObject;
			T result = caseParallelFlowToOperandRule(parallelFlowToOperandRule);
			if (result == null)
				result = caseAbstractRule(parallelFlowToOperandRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE: {
			UseCasePrecondToFoundMessageRule useCasePrecondToFoundMessageRule = (UseCasePrecondToFoundMessageRule) theEObject;
			T result = caseUseCasePrecondToFoundMessageRule(useCasePrecondToFoundMessageRule);
			if (result == null)
				result = caseAbstractRule(useCasePrecondToFoundMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE: {
			SystemStepBFToMessageRule systemStepBFToMessageRule = (SystemStepBFToMessageRule) theEObject;
			T result = caseSystemStepBFToMessageRule(systemStepBFToMessageRule);
			if (result == null)
				result = caseAbstractRule(systemStepBFToMessageRule);
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
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE: {
			UserStepBFMessageRule userStepBFMessageRule = (UserStepBFMessageRule) theEObject;
			T result = caseUserStepBFMessageRule(userStepBFMessageRule);
			if (result == null)
				result = caseAbstractRule(userStepBFMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE: {
			SystemStepNFToMessageRule systemStepNFToMessageRule = (SystemStepNFToMessageRule) theEObject;
			T result = caseSystemStepNFToMessageRule(systemStepNFToMessageRule);
			if (result == null)
				result = caseAbstractRule(systemStepNFToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE: {
			UserStepNfToMessageRule userStepNfToMessageRule = (UserStepNfToMessageRule) theEObject;
			T result = caseUserStepNfToMessageRule(userStepNfToMessageRule);
			if (result == null)
				result = caseAbstractRule(userStepNfToMessageRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Step To Found Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Step To Found Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitStepToFoundMessageRule(WaitStepToFoundMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Step To Lost Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Step To Lost Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendStepToLostMessageRule(SendStepToLostMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepToMessageRule(StepToMessageRule object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Actor To Lifeline Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor To Lifeline Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorToLifelineRule(ActorToLifelineRule object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step BF To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step BF To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepBFToMessageRule(NormalStepBFToMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step NF To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step NF To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStepNFToMessageRule(NormalStepNFToMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Step To Combo Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Step To Combo Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltStepToComboRule(AltStepToComboRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Step To Combined Fragment Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Step To Combined Fragment Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelStepToCombinedFragmentRule(
			ParallelStepToCombinedFragmentRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Flow To Operand Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Flow To Operand Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelFlowToOperandRule(ParallelFlowToOperandRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case Precond To Found Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case Precond To Found Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCasePrecondToFoundMessageRule(
			UseCasePrecondToFoundMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Step BF To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Step BF To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemStepBFToMessageRule(SystemStepBFToMessageRule object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>User Step BF Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Step BF Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserStepBFMessageRule(UserStepBFMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Step NF To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Step NF To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemStepNFToMessageRule(SystemStepNFToMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Step Nf To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Step Nf To Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserStepNfToMessageRule(UserStepNfToMessageRule object) {
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
