/**
 */
package UseCaseDSL.util;

import UseCaseDSL.*;

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
 * @see UseCaseDSL.UseCaseDSLPackage
 * @generated
 */
public class UseCaseDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UseCaseDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = UseCaseDSLPackage.eINSTANCE;
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
		case UseCaseDSLPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.ALTERNATIVE_FLOW: {
			AlternativeFlow alternativeFlow = (AlternativeFlow) theEObject;
			T result = caseAlternativeFlow(alternativeFlow);
			if (result == null)
				result = caseNamedFlow(alternativeFlow);
			if (result == null)
				result = caseFlow(alternativeFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.ALTERNATIVE_FLOW_ALTERNATIVE: {
			AlternativeFlowAlternative alternativeFlowAlternative = (AlternativeFlowAlternative) theEObject;
			T result = caseAlternativeFlowAlternative(alternativeFlowAlternative);
			if (result == null)
				result = caseStepAlternative(alternativeFlowAlternative);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.BASIC_FLOW: {
			BasicFlow basicFlow = (BasicFlow) theEObject;
			T result = caseBasicFlow(basicFlow);
			if (result == null)
				result = caseFlow(basicFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseStepAlternative(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.EXCEPTION_FLOW: {
			ExceptionFlow exceptionFlow = (ExceptionFlow) theEObject;
			T result = caseExceptionFlow(exceptionFlow);
			if (result == null)
				result = caseNamedFlow(exceptionFlow);
			if (result == null)
				result = caseFlow(exceptionFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.FLOW: {
			Flow flow = (Flow) theEObject;
			T result = caseFlow(flow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE: {
			LocalAlternative localAlternative = (LocalAlternative) theEObject;
			T result = caseLocalAlternative(localAlternative);
			if (result == null)
				result = caseStepAlternative(localAlternative);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.NAMED_FLOW: {
			NamedFlow namedFlow = (NamedFlow) theEObject;
			T result = caseNamedFlow(namedFlow);
			if (result == null)
				result = caseFlow(namedFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.NORMAL_STEP: {
			NormalStep normalStep = (NormalStep) theEObject;
			T result = caseNormalStep(normalStep);
			if (result == null)
				result = caseStep(normalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.PACKAGE_DECLARATION: {
			PackageDeclaration packageDeclaration = (PackageDeclaration) theEObject;
			T result = casePackageDeclaration(packageDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.PARALLEL_FLOW: {
			ParallelFlow parallelFlow = (ParallelFlow) theEObject;
			T result = caseParallelFlow(parallelFlow);
			if (result == null)
				result = caseNamedFlow(parallelFlow);
			if (result == null)
				result = caseFlow(parallelFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.PARALLEL_STEP: {
			ParallelStep parallelStep = (ParallelStep) theEObject;
			T result = caseParallelStep(parallelStep);
			if (result == null)
				result = caseStep(parallelStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.STEP_ALTERNATIVE: {
			StepAlternative stepAlternative = (StepAlternative) theEObject;
			T result = caseStepAlternative(stepAlternative);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.USE_CASE: {
			UseCase useCase = (UseCase) theEObject;
			T result = caseUseCase(useCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.USE_CASES_MODEL: {
			UseCasesModel useCasesModel = (UseCasesModel) theEObject;
			T result = caseUseCasesModel(useCasesModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UseCaseDSLPackage.UC_CONDITION: {
			UCCondition ucCondition = (UCCondition) theEObject;
			T result = caseUCCondition(ucCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeFlow(AlternativeFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Flow Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Flow Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeFlowAlternative(AlternativeFlowAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicFlow(BasicFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionFlow(ExceptionFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalAlternative(LocalAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedFlow(NamedFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStep(NormalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDeclaration(PackageDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelFlow(ParallelFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelStep(ParallelStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepAlternative(StepAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Cases Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Cases Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCasesModel(UseCasesModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCCondition(UCCondition object) {
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

} //UseCaseDSLSwitch
