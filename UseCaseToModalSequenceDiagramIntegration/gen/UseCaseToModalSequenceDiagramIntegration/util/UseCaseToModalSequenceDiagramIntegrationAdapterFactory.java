/**
 */
package UseCaseToModalSequenceDiagramIntegration.util;

import TGGRuntime.AbstractCorrespondence;

import UseCaseToModalSequenceDiagramIntegration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage
 * @generated
 */
public class UseCaseToModalSequenceDiagramIntegrationAdapterFactory extends
		AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UseCaseToModalSequenceDiagramIntegrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE;
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
	protected UseCaseToModalSequenceDiagramIntegrationSwitch<Adapter> modelSwitch = new UseCaseToModalSequenceDiagramIntegrationSwitch<Adapter>() {
		@Override
		public Adapter caseUseCasesModelToModel(UseCasesModelToModel object) {
			return createUseCasesModelToModelAdapter();
		}

		@Override
		public Adapter casePackageDeclarationToPackage(
				PackageDeclarationToPackage object) {
			return createPackageDeclarationToPackageAdapter();
		}

		@Override
		public Adapter caseUseCaseToInteraction(UseCaseToInteraction object) {
			return createUseCaseToInteractionAdapter();
		}

		@Override
		public Adapter caseNormalStepToMessage(NormalStepToMessage object) {
			return createNormalStepToMessageAdapter();
		}

		@Override
		public Adapter caseActorToLifeline(ActorToLifeline object) {
			return createActorToLifelineAdapter();
		}

		@Override
		public Adapter caseFlowToInteractionFragment(
				FlowToInteractionFragment object) {
			return createFlowToInteractionFragmentAdapter();
		}

		@Override
		public Adapter caseUseCaseToMessage(UseCaseToMessage object) {
			return createUseCaseToMessageAdapter();
		}

		@Override
		public Adapter caseStepAlternativeToInteractionOperand(
				StepAlternativeToInteractionOperand object) {
			return createStepAlternativeToInteractionOperandAdapter();
		}

		@Override
		public Adapter caseParallelStepToCombinedFragment(
				ParallelStepToCombinedFragment object) {
			return createParallelStepToCombinedFragmentAdapter();
		}

		@Override
		public Adapter caseNormalStepToCombinedFragment(
				NormalStepToCombinedFragment object) {
			return createNormalStepToCombinedFragmentAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel <em>Use Cases Model To Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel
	 * @generated
	 */
	public Adapter createUseCasesModelToModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage <em>Package Declaration To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage
	 * @generated
	 */
	public Adapter createPackageDeclarationToPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction <em>Use Case To Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction
	 * @generated
	 */
	public Adapter createUseCaseToInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage <em>Normal Step To Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage
	 * @generated
	 */
	public Adapter createNormalStepToMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.ActorToLifeline <em>Actor To Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.ActorToLifeline
	 * @generated
	 */
	public Adapter createActorToLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment <em>Flow To Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment
	 * @generated
	 */
	public Adapter createFlowToInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.UseCaseToMessage <em>Use Case To Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToMessage
	 * @generated
	 */
	public Adapter createUseCaseToMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand <em>Step Alternative To Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand
	 * @generated
	 */
	public Adapter createStepAlternativeToInteractionOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment <em>Parallel Step To Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment
	 * @generated
	 */
	public Adapter createParallelStepToCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment <em>Normal Step To Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment
	 * @generated
	 */
	public Adapter createNormalStepToCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //UseCaseToModalSequenceDiagramIntegrationAdapterFactory
