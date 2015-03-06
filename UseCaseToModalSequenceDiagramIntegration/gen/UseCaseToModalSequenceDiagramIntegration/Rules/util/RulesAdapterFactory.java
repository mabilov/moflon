/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.util;

import TGGRuntime.AbstractRule;

import UseCaseToModalSequenceDiagramIntegration.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseUCModelToMSDModelRule(UCModelToMSDModelRule object) {
			return createUCModelToMSDModelRuleAdapter();
		}

		@Override
		public Adapter caseUCPackageToMSDPackage(UCPackageToMSDPackage object) {
			return createUCPackageToMSDPackageAdapter();
		}

		@Override
		public Adapter caseUseCaseToInteractionRule(
				UseCaseToInteractionRule object) {
			return createUseCaseToInteractionRuleAdapter();
		}

		@Override
		public Adapter caseActorToClassRule(ActorToClassRule object) {
			return createActorToClassRuleAdapter();
		}

		@Override
		public Adapter caseNormalStepToMessageRule(
				NormalStepToMessageRule object) {
			return createNormalStepToMessageRuleAdapter();
		}

		@Override
		public Adapter caseNormalStepBasicFlowToMessageRule(
				NormalStepBasicFlowToMessageRule object) {
			return createNormalStepBasicFlowToMessageRuleAdapter();
		}

		@Override
		public Adapter caseNormalStepNamedFlowToMessageRule(
				NormalStepNamedFlowToMessageRule object) {
			return createNormalStepNamedFlowToMessageRuleAdapter();
		}

		@Override
		public Adapter caseStepToCombinedFragmentRule(
				StepToCombinedFragmentRule object) {
			return createStepToCombinedFragmentRuleAdapter();
		}

		@Override
		public Adapter caseStepAltToOperandRule(StepAltToOperandRule object) {
			return createStepAltToOperandRuleAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule <em>UC Model To MSD Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule
	 * @generated
	 */
	public Adapter createUCModelToMSDModelRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage <em>UC Package To MSD Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage
	 * @generated
	 */
	public Adapter createUCPackageToMSDPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule <em>Use Case To Interaction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule
	 * @generated
	 */
	public Adapter createUseCaseToInteractionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule <em>Actor To Class Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule
	 * @generated
	 */
	public Adapter createActorToClassRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule <em>Normal Step To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule
	 * @generated
	 */
	public Adapter createNormalStepToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule <em>Normal Step Basic Flow To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule
	 * @generated
	 */
	public Adapter createNormalStepBasicFlowToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule <em>Normal Step Named Flow To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule
	 * @generated
	 */
	public Adapter createNormalStepNamedFlowToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule <em>Step To Combined Fragment Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule
	 * @generated
	 */
	public Adapter createStepToCombinedFragmentRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule <em>Step Alt To Operand Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule
	 * @generated
	 */
	public Adapter createStepAltToOperandRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
