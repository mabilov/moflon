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
		public Adapter caseActorToLifelineRule(ActorToLifelineRule object) {
			return createActorToLifelineRuleAdapter();
		}

		@Override
		public Adapter caseNormalStepToMessageRule(
				NormalStepToMessageRule object) {
			return createNormalStepToMessageRuleAdapter();
		}

		@Override
		public Adapter caseUserActorToLifelineRule(
				UserActorToLifelineRule object) {
			return createUserActorToLifelineRuleAdapter();
		}

		@Override
		public Adapter caseNormalStepBFToMessageRule(
				NormalStepBFToMessageRule object) {
			return createNormalStepBFToMessageRuleAdapter();
		}

		@Override
		public Adapter caseNormalStepNFToMessageRule(
				NormalStepNFToMessageRule object) {
			return createNormalStepNFToMessageRuleAdapter();
		}

		@Override
		public Adapter caseAltStepToComboRule(AltStepToComboRule object) {
			return createAltStepToComboRuleAdapter();
		}

		@Override
		public Adapter caseAltStepNFToComboRule(AltStepNFToComboRule object) {
			return createAltStepNFToComboRuleAdapter();
		}

		@Override
		public Adapter caseParallelStepToCombinedFragmentRule(
				ParallelStepToCombinedFragmentRule object) {
			return createParallelStepToCombinedFragmentRuleAdapter();
		}

		@Override
		public Adapter caseParallelFlowToOperandRule(
				ParallelFlowToOperandRule object) {
			return createParallelFlowToOperandRuleAdapter();
		}

		@Override
		public Adapter caseUseCasePrecondToFoundMessageRule(
				UseCasePrecondToFoundMessageRule object) {
			return createUseCasePrecondToFoundMessageRuleAdapter();
		}

		@Override
		public Adapter caseSystemStepBFToMessageRule(
				SystemStepBFToMessageRule object) {
			return createSystemStepBFToMessageRuleAdapter();
		}

		@Override
		public Adapter caseStepAltToOperandRule(StepAltToOperandRule object) {
			return createStepAltToOperandRuleAdapter();
		}

		@Override
		public Adapter caseAltStepBFToComboRule(AltStepBFToComboRule object) {
			return createAltStepBFToComboRuleAdapter();
		}

		@Override
		public Adapter caseUserStepBFMessageRule(UserStepBFMessageRule object) {
			return createUserStepBFMessageRuleAdapter();
		}

		@Override
		public Adapter caseSystemStepNFToMessageRule(
				SystemStepNFToMessageRule object) {
			return createSystemStepNFToMessageRuleAdapter();
		}

		@Override
		public Adapter caseUserStepNfToMessageRule(
				UserStepNfToMessageRule object) {
			return createUserStepNfToMessageRuleAdapter();
		}

		@Override
		public Adapter caseAltSysStepBFToComboRule(
				AltSysStepBFToComboRule object) {
			return createAltSysStepBFToComboRuleAdapter();
		}

		@Override
		public Adapter caseAltUserStepBFToComboRule(
				AltUserStepBFToComboRule object) {
			return createAltUserStepBFToComboRuleAdapter();
		}

		@Override
		public Adapter caseAltSysStepNFToComboRule(
				AltSysStepNFToComboRule object) {
			return createAltSysStepNFToComboRuleAdapter();
		}

		@Override
		public Adapter caseAltUserStepNFToComboRule(
				AltUserStepNFToComboRule object) {
			return createAltUserStepNFToComboRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule <em>Actor To Lifeline Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule
	 * @generated
	 */
	public Adapter createActorToLifelineRuleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule <em>User Actor To Lifeline Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule
	 * @generated
	 */
	public Adapter createUserActorToLifelineRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBFToMessageRule <em>Normal Step BF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBFToMessageRule
	 * @generated
	 */
	public Adapter createNormalStepBFToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNFToMessageRule <em>Normal Step NF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNFToMessageRule
	 * @generated
	 */
	public Adapter createNormalStepNFToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule <em>Alt Step To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule
	 * @generated
	 */
	public Adapter createAltStepToComboRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepNFToComboRule <em>Alt Step NF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepNFToComboRule
	 * @generated
	 */
	public Adapter createAltStepNFToComboRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule <em>Parallel Step To Combined Fragment Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule
	 * @generated
	 */
	public Adapter createParallelStepToCombinedFragmentRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule <em>Parallel Flow To Operand Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule
	 * @generated
	 */
	public Adapter createParallelFlowToOperandRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule <em>Use Case Precond To Found Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule
	 * @generated
	 */
	public Adapter createUseCasePrecondToFoundMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule <em>System Step BF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule
	 * @generated
	 */
	public Adapter createSystemStepBFToMessageRuleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepBFToComboRule <em>Alt Step BF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepBFToComboRule
	 * @generated
	 */
	public Adapter createAltStepBFToComboRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule <em>User Step BF Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule
	 * @generated
	 */
	public Adapter createUserStepBFMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule <em>System Step NF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule
	 * @generated
	 */
	public Adapter createSystemStepNFToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule <em>User Step Nf To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule
	 * @generated
	 */
	public Adapter createUserStepNfToMessageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule <em>Alt Sys Step BF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule
	 * @generated
	 */
	public Adapter createAltSysStepBFToComboRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule <em>Alt User Step BF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule
	 * @generated
	 */
	public Adapter createAltUserStepBFToComboRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule <em>Alt Sys Step NF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule
	 * @generated
	 */
	public Adapter createAltSysStepNFToComboRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule <em>Alt User Step NF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule
	 * @generated
	 */
	public Adapter createAltUserStepNFToComboRuleAdapter() {
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
