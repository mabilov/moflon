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
		public Adapter caseInterEventToStepCoreRule(
				InterEventToStepCoreRule object) {
			return createInterEventToStepCoreRuleAdapter();
		}

		@Override
		public Adapter caseITEToStepRule(ITEToStepRule object) {
			return createITEToStepRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepRule(ICEToStepRule object) {
			return createICEToStepRuleAdapter();
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
		public Adapter caseInterEventToStepRule(InterEventToStepRule object) {
			return createInterEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseFirstInterThrowEventToStepRule(
				FirstInterThrowEventToStepRule object) {
			return createFirstInterThrowEventToStepRuleAdapter();
		}

		@Override
		public Adapter caseFirstICEToStepRule(FirstICEToStepRule object) {
			return createFirstICEToStepRuleAdapter();
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
		public Adapter caseLaneStartEventRule(LaneStartEventRule object) {
			return createLaneStartEventRuleAdapter();
		}

		@Override
		public Adapter caseExcConvGwAfterEventGwRule(
				ExcConvGwAfterEventGwRule object) {
			return createExcConvGwAfterEventGwRuleAdapter();
		}

		@Override
		public Adapter caseExcConvGwDefaultSeqFlowRule(
				ExcConvGwDefaultSeqFlowRule object) {
			return createExcConvGwDefaultSeqFlowRuleAdapter();
		}

		@Override
		public Adapter caseParallelConvergingGatewayTwoInputsRule(
				ParallelConvergingGatewayTwoInputsRule object) {
			return createParallelConvergingGatewayTwoInputsRuleAdapter();
		}

		@Override
		public Adapter caseExcConvGwAfterExDivGwRule(
				ExcConvGwAfterExDivGwRule object) {
			return createExcConvGwAfterExDivGwRuleAdapter();
		}

		@Override
		public Adapter caseExConvGwAfterEventGwIceSeqFlowRule(
				ExConvGwAfterEventGwIceSeqFlowRule object) {
			return createExConvGwAfterEventGwIceSeqFlowRuleAdapter();
		}

		@Override
		public Adapter caseContinuationRule(ContinuationRule object) {
			return createContinuationRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterSERule(ICEToStepAfterSERule object) {
			return createICEToStepAfterSERuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterExGwRule(ICEToStepAfterExGwRule object) {
			return createICEToStepAfterExGwRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterPGRule(ICEToStepAfterPGRule object) {
			return createICEToStepAfterPGRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterTaskRule(ICEToStepAfterTaskRule object) {
			return createICEToStepAfterTaskRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterEventRule(
				ICEToStepAfterEventRule object) {
			return createICEToStepAfterEventRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterExConvGwRule(
				ICEToStepAfterExConvGwRule object) {
			return createICEToStepAfterExConvGwRuleAdapter();
		}

		@Override
		public Adapter caseICEToStepAfterPConvGwRule(
				ICEToStepAfterPConvGwRule object) {
			return createICEToStepAfterPConvGwRuleAdapter();
		}

		@Override
		public Adapter caseServiceTaskToStepAfterSERule(
				ServiceTaskToStepAfterSERule object) {
			return createServiceTaskToStepAfterSERuleAdapter();
		}

		@Override
		public Adapter caseServiceTaskToStepAfterExGwRule(
				ServiceTaskToStepAfterExGwRule object) {
			return createServiceTaskToStepAfterExGwRuleAdapter();
		}

		@Override
		public Adapter caseServiceTaskToStepAfterPGRule(
				ServiceTaskToStepAfterPGRule object) {
			return createServiceTaskToStepAfterPGRuleAdapter();
		}

		@Override
		public Adapter caseServiceTaskToStepAfterEvGwRule(
				ServiceTaskToStepAfterEvGwRule object) {
			return createServiceTaskToStepAfterEvGwRuleAdapter();
		}

		@Override
		public Adapter caseUserTaskToStepAfterSERule(
				UserTaskToStepAfterSERule object) {
			return createUserTaskToStepAfterSERuleAdapter();
		}

		@Override
		public Adapter caseUserTaskToStepAfterExGwRule(
				UserTaskToStepAfterExGwRule object) {
			return createUserTaskToStepAfterExGwRuleAdapter();
		}

		@Override
		public Adapter caseUserTaskToStepAfterPGRule(
				UserTaskToStepAfterPGRule object) {
			return createUserTaskToStepAfterPGRuleAdapter();
		}

		@Override
		public Adapter caseUserTaskToStepAfterEvGwRule(
				UserTaskToStepAfterEvGwRule object) {
			return createUserTaskToStepAfterEvGwRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.InterEventToStepCoreRule <em>Inter Event To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.InterEventToStepCoreRule
	 * @generated
	 */
	public Adapter createInterEventToStepCoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ITEToStepRule <em>ITE To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ITEToStepRule
	 * @generated
	 */
	public Adapter createITEToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepRule <em>ICE To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepRule
	 * @generated
	 */
	public Adapter createICEToStepRuleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.InterEventToStepRule <em>Inter Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.InterEventToStepRule
	 * @generated
	 */
	public Adapter createInterEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.FirstInterThrowEventToStepRule <em>First Inter Throw Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.FirstInterThrowEventToStepRule
	 * @generated
	 */
	public Adapter createFirstInterThrowEventToStepRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.FirstICEToStepRule <em>First ICE To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.FirstICEToStepRule
	 * @generated
	 */
	public Adapter createFirstICEToStepRuleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.LaneStartEventRule <em>Lane Start Event Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.LaneStartEventRule
	 * @generated
	 */
	public Adapter createLaneStartEventRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExcConvGwAfterEventGwRule <em>Exc Conv Gw After Event Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExcConvGwAfterEventGwRule
	 * @generated
	 */
	public Adapter createExcConvGwAfterEventGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExcConvGwDefaultSeqFlowRule <em>Exc Conv Gw Default Seq Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExcConvGwDefaultSeqFlowRule
	 * @generated
	 */
	public Adapter createExcConvGwDefaultSeqFlowRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayTwoInputsRule <em>Parallel Converging Gateway Two Inputs Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayTwoInputsRule
	 * @generated
	 */
	public Adapter createParallelConvergingGatewayTwoInputsRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExcConvGwAfterExDivGwRule <em>Exc Conv Gw After Ex Div Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExcConvGwAfterExDivGwRule
	 * @generated
	 */
	public Adapter createExcConvGwAfterExDivGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ExConvGwAfterEventGwIceSeqFlowRule <em>Ex Conv Gw After Event Gw Ice Seq Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ExConvGwAfterEventGwIceSeqFlowRule
	 * @generated
	 */
	public Adapter createExConvGwAfterEventGwIceSeqFlowRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ContinuationRule <em>Continuation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ContinuationRule
	 * @generated
	 */
	public Adapter createContinuationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterSERule <em>ICE To Step After SE Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterSERule
	 * @generated
	 */
	public Adapter createICEToStepAfterSERuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterExGwRule <em>ICE To Step After Ex Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterExGwRule
	 * @generated
	 */
	public Adapter createICEToStepAfterExGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterPGRule <em>ICE To Step After PG Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterPGRule
	 * @generated
	 */
	public Adapter createICEToStepAfterPGRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterTaskRule <em>ICE To Step After Task Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterTaskRule
	 * @generated
	 */
	public Adapter createICEToStepAfterTaskRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterEventRule <em>ICE To Step After Event Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterEventRule
	 * @generated
	 */
	public Adapter createICEToStepAfterEventRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterExConvGwRule <em>ICE To Step After Ex Conv Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterExConvGwRule
	 * @generated
	 */
	public Adapter createICEToStepAfterExConvGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ICEToStepAfterPConvGwRule <em>ICE To Step After PConv Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ICEToStepAfterPConvGwRule
	 * @generated
	 */
	public Adapter createICEToStepAfterPConvGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterSERule <em>Service Task To Step After SE Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterSERule
	 * @generated
	 */
	public Adapter createServiceTaskToStepAfterSERuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterExGwRule <em>Service Task To Step After Ex Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterExGwRule
	 * @generated
	 */
	public Adapter createServiceTaskToStepAfterExGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterPGRule <em>Service Task To Step After PG Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterPGRule
	 * @generated
	 */
	public Adapter createServiceTaskToStepAfterPGRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterEvGwRule <em>Service Task To Step After Ev Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepAfterEvGwRule
	 * @generated
	 */
	public Adapter createServiceTaskToStepAfterEvGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterSERule <em>User Task To Step After SE Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterSERule
	 * @generated
	 */
	public Adapter createUserTaskToStepAfterSERuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterExGwRule <em>User Task To Step After Ex Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterExGwRule
	 * @generated
	 */
	public Adapter createUserTaskToStepAfterExGwRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterPGRule <em>User Task To Step After PG Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterPGRule
	 * @generated
	 */
	public Adapter createUserTaskToStepAfterPGRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterEvGwRule <em>User Task To Step After Ev Gw Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepAfterEvGwRule
	 * @generated
	 */
	public Adapter createUserTaskToStepAfterEvGwRuleAdapter() {
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
