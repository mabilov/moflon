/**
 */
package BpmnToUseCaseIntegration.Rules.util;

import BpmnToUseCaseIntegration.Rules.*;

import TGGRuntime.AbstractRule;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage
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
		public Adapter caseBpModelToUseCaseModelRule(
				BpModelToUseCaseModelRule object) {
			return createBpModelToUseCaseModelRuleAdapter();
		}

		@Override
		public Adapter caseDefinitionsToPackageRule(
				DefinitionsToPackageRule object) {
			return createDefinitionsToPackageRuleAdapter();
		}

		@Override
		public Adapter caseProcessToUseCaseRule(ProcessToUseCaseRule object) {
			return createProcessToUseCaseRuleAdapter();
		}

		@Override
		public Adapter caseTaskToStepCoreRule(TaskToStepCoreRule object) {
			return createTaskToStepCoreRuleAdapter();
		}

		@Override
		public Adapter caseFirstServiceTaskToStepRule(
				FirstServiceTaskToStepRule object) {
			return createFirstServiceTaskToStepRuleAdapter();
		}

		@Override
		public Adapter caseFirstUserTaskToStepRule(
				FirstUserTaskToStepRule object) {
			return createFirstUserTaskToStepRuleAdapter();
		}

		@Override
		public Adapter caseLaneSetRule(LaneSetRule object) {
			return createLaneSetRuleAdapter();
		}

		@Override
		public Adapter caseLaneToActorRule(LaneToActorRule object) {
			return createLaneToActorRuleAdapter();
		}

		@Override
		public Adapter caseTaskToStepRule(TaskToStepRule object) {
			return createTaskToStepRuleAdapter();
		}

		@Override
		public Adapter caseServiceTaskToStepRule(ServiceTaskToStepRule object) {
			return createServiceTaskToStepRuleAdapter();
		}

		@Override
		public Adapter caseUserTaskToStepRule(UserTaskToStepRule object) {
			return createUserTaskToStepRuleAdapter();
		}

		@Override
		public Adapter caseIntermediateEventToStepCoreRule(
				IntermediateEventToStepCoreRule object) {
			return createIntermediateEventToStepCoreRuleAdapter();
		}

		@Override
		public Adapter caseIntermediateThrowEventToStepRule(
				IntermediateThrowEventToStepRule object) {
			return createIntermediateThrowEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseIntermediateCatchEventToStepRule(
				IntermediateCatchEventToStepRule object) {
			return createIntermediateCatchEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseEndEventRule(EndEventRule object) {
			return createEndEventRuleAdapter();
		}

		@Override
		public Adapter caseExclusiveGatewayToStepCoreRule(
				ExclusiveGatewayToStepCoreRule object) {
			return createExclusiveGatewayToStepCoreRuleAdapter();
		}

		@Override
		public Adapter caseIntermediateEventToStepRule(
				IntermediateEventToStepRule object) {
			return createIntermediateEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseFirstIntermediateThrowEventToStepRule(
				FirstIntermediateThrowEventToStepRule object) {
			return createFirstIntermediateThrowEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseFirstIntermediateCatchEventToStepRule(
				FirstIntermediateCatchEventToStepRule object) {
			return createFirstIntermediateCatchEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseParallelGatewayToParallelStepCoreRule(
				ParallelGatewayToParallelStepCoreRule object) {
			return createParallelGatewayToParallelStepCoreRuleAdapter();
		}

		@Override
		public Adapter caseEventBasedGatewayToStepCoreRule(
				EventBasedGatewayToStepCoreRule object) {
			return createEventBasedGatewayToStepCoreRuleAdapter();
		}

		@Override
		public Adapter caseExclusiveConvergingGatewayRule(
				ExclusiveConvergingGatewayRule object) {
			return createExclusiveConvergingGatewayRuleAdapter();
		}

		@Override
		public Adapter caseParallelConvergingGatewayRule(
				ParallelConvergingGatewayRule object) {
			return createParallelConvergingGatewayRuleAdapter();
		}

		@Override
		public Adapter caseSeqFlowAfterEGToAltFlowRule(
				SeqFlowAfterEGToAltFlowRule object) {
			return createSeqFlowAfterEGToAltFlowRuleAdapter();
		}

		@Override
		public Adapter caseSeqFlowAfterPGToParallelFlowRule(
				SeqFlowAfterPGToParallelFlowRule object) {
			return createSeqFlowAfterPGToParallelFlowRuleAdapter();
		}

		@Override
		public Adapter caseCatchEventAfterEBGToStepRule(
				CatchEventAfterEBGToStepRule object) {
			return createCatchEventAfterEBGToStepRuleAdapter();
		}

		@Override
		public Adapter caseExclusiveGatewayToStepRule(
				ExclusiveGatewayToStepRule object) {
			return createExclusiveGatewayToStepRuleAdapter();
		}

		@Override
		public Adapter caseParallelGatewayToParallelStepRule(
				ParallelGatewayToParallelStepRule object) {
			return createParallelGatewayToParallelStepRuleAdapter();
		}

		@Override
		public Adapter caseEventBasedGatewayToStepRule(
				EventBasedGatewayToStepRule object) {
			return createEventBasedGatewayToStepRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule <em>Bp Model To Use Case Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule
	 * @generated
	 */
	public Adapter createBpModelToUseCaseModelRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule <em>Definitions To Package Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule
	 * @generated
	 */
	public Adapter createDefinitionsToPackageRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule <em>Process To Use Case Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule
	 * @generated
	 */
	public Adapter createProcessToUseCaseRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.TaskToStepCoreRule <em>Task To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.TaskToStepCoreRule
	 * @generated
	 */
	public Adapter createTaskToStepCoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule <em>First Service Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule
	 * @generated
	 */
	public Adapter createFirstServiceTaskToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule <em>First User Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule
	 * @generated
	 */
	public Adapter createFirstUserTaskToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule <em>Lane Set Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule
	 * @generated
	 */
	public Adapter createLaneSetRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule <em>Lane To Actor Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule
	 * @generated
	 */
	public Adapter createLaneToActorRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.TaskToStepRule <em>Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.TaskToStepRule
	 * @generated
	 */
	public Adapter createTaskToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule <em>Service Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule
	 * @generated
	 */
	public Adapter createServiceTaskToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule <em>User Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule
	 * @generated
	 */
	public Adapter createUserTaskToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.IntermediateEventToStepCoreRule <em>Intermediate Event To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateEventToStepCoreRule
	 * @generated
	 */
	public Adapter createIntermediateEventToStepCoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule <em>Intermediate Throw Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule
	 * @generated
	 */
	public Adapter createIntermediateThrowEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule <em>Intermediate Catch Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule
	 * @generated
	 */
	public Adapter createIntermediateCatchEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.EndEventRule <em>End Event Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule
	 * @generated
	 */
	public Adapter createEndEventRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule <em>Exclusive Gateway To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule
	 * @generated
	 */
	public Adapter createExclusiveGatewayToStepCoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.IntermediateEventToStepRule <em>Intermediate Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateEventToStepRule
	 * @generated
	 */
	public Adapter createIntermediateEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule <em>First Intermediate Throw Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule
	 * @generated
	 */
	public Adapter createFirstIntermediateThrowEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule <em>First Intermediate Catch Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule
	 * @generated
	 */
	public Adapter createFirstIntermediateCatchEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule <em>Parallel Gateway To Parallel Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule
	 * @generated
	 */
	public Adapter createParallelGatewayToParallelStepCoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule <em>Event Based Gateway To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule
	 * @generated
	 */
	public Adapter createEventBasedGatewayToStepCoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule <em>Exclusive Converging Gateway Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule
	 * @generated
	 */
	public Adapter createExclusiveConvergingGatewayRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule <em>Parallel Converging Gateway Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule
	 * @generated
	 */
	public Adapter createParallelConvergingGatewayRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule <em>Seq Flow After EG To Alt Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule
	 * @generated
	 */
	public Adapter createSeqFlowAfterEGToAltFlowRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule <em>Seq Flow After PG To Parallel Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule
	 * @generated
	 */
	public Adapter createSeqFlowAfterPGToParallelFlowRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule <em>Catch Event After EBG To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule
	 * @generated
	 */
	public Adapter createCatchEventAfterEBGToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule <em>Exclusive Gateway To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule
	 * @generated
	 */
	public Adapter createExclusiveGatewayToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule <em>Parallel Gateway To Parallel Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule
	 * @generated
	 */
	public Adapter createParallelGatewayToParallelStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule <em>Event Based Gateway To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule
	 * @generated
	 */
	public Adapter createEventBasedGatewayToStepRuleAdapter() {
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
