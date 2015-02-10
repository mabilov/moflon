/**
 */
package UseCaseDSL.util;

import UseCaseDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UseCaseDSL.UseCaseDSLPackage
 * @generated
 */
public class UseCaseDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UseCaseDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UseCaseDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseDSLSwitch<Adapter> modelSwitch = new UseCaseDSLSwitch<Adapter>() {
		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseAlternativeFlow(AlternativeFlow object) {
			return createAlternativeFlowAdapter();
		}

		@Override
		public Adapter caseAlternativeFlowAlternative(
				AlternativeFlowAlternative object) {
			return createAlternativeFlowAlternativeAdapter();
		}

		@Override
		public Adapter caseBasicFlow(BasicFlow object) {
			return createBasicFlowAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseExceptionFlow(ExceptionFlow object) {
			return createExceptionFlowAdapter();
		}

		@Override
		public Adapter caseFlow(Flow object) {
			return createFlowAdapter();
		}

		@Override
		public Adapter caseLocalAlternative(LocalAlternative object) {
			return createLocalAlternativeAdapter();
		}

		@Override
		public Adapter caseNamedFlow(NamedFlow object) {
			return createNamedFlowAdapter();
		}

		@Override
		public Adapter caseNormalStep(NormalStep object) {
			return createNormalStepAdapter();
		}

		@Override
		public Adapter casePackageDeclaration(PackageDeclaration object) {
			return createPackageDeclarationAdapter();
		}

		@Override
		public Adapter caseParallelFlow(ParallelFlow object) {
			return createParallelFlowAdapter();
		}

		@Override
		public Adapter caseParallelStep(ParallelStep object) {
			return createParallelStepAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseStepAlternative(StepAlternative object) {
			return createStepAlternativeAdapter();
		}

		@Override
		public Adapter caseUseCase(UseCase object) {
			return createUseCaseAdapter();
		}

		@Override
		public Adapter caseUseCasesModel(UseCasesModel object) {
			return createUseCasesModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.UseCasesModel <em>Use Cases Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.UseCasesModel
	 * @generated
	 */
	public Adapter createUseCasesModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.PackageDeclaration
	 * @generated
	 */
	public Adapter createPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.BasicFlow
	 * @generated
	 */
	public Adapter createBasicFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.NamedFlow <em>Named Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.NamedFlow
	 * @generated
	 */
	public Adapter createNamedFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.ExceptionFlow <em>Exception Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.ExceptionFlow
	 * @generated
	 */
	public Adapter createExceptionFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.AlternativeFlow
	 * @generated
	 */
	public Adapter createAlternativeFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.ParallelFlow <em>Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.ParallelFlow
	 * @generated
	 */
	public Adapter createParallelFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.StepAlternative <em>Step Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.StepAlternative
	 * @generated
	 */
	public Adapter createStepAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.LocalAlternative <em>Local Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.LocalAlternative
	 * @generated
	 */
	public Adapter createLocalAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.AlternativeFlowAlternative <em>Alternative Flow Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.AlternativeFlowAlternative
	 * @generated
	 */
	public Adapter createAlternativeFlowAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.ParallelStep <em>Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.ParallelStep
	 * @generated
	 */
	public Adapter createParallelStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseDSL.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseDSL.NormalStep
	 * @generated
	 */
	public Adapter createNormalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UseCaseDSLAdapterFactory
