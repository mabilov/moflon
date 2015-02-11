/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.Rules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE
					.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE:
			return createBpModelToUseCaseModelRule();
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE:
			return createDefinitionsToPackageRule();
		case RulesPackage.PROCESS_TO_USE_CASE_RULE:
			return createProcessToUseCaseRule();
		case RulesPackage.FIRST_SERVICE_TASK_TO_STEP_RULE:
			return createFirstServiceTaskToStepRule();
		case RulesPackage.FIRST_USER_TASK_TO_STEP_RULE:
			return createFirstUserTaskToStepRule();
		case RulesPackage.LANE_SET_RULE:
			return createLaneSetRule();
		case RulesPackage.LANE_TO_ACTOR_RULE:
			return createLaneToActorRule();
		case RulesPackage.SERVICE_TASK_TO_STEP_RULE:
			return createServiceTaskToStepRule();
		case RulesPackage.USER_TASK_TO_STEP_RULE:
			return createUserTaskToStepRule();
		case RulesPackage.INTERMEDIATE_THROW_EVENT_TO_STEP_RULE:
			return createIntermediateThrowEventToStepRule();
		case RulesPackage.INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE:
			return createIntermediateCatchEventToStepRule();
		case RulesPackage.END_EVENT_RULE:
			return createEndEventRule();
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE:
			return createExclusiveGatewayToStepCoreRule();
		case RulesPackage.FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE:
			return createFirstIntermediateThrowEventToStepRule();
		case RulesPackage.FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE:
			return createFirstIntermediateCatchEventToStepRule();
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE:
			return createParallelGatewayToParallelStepCoreRule();
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE:
			return createEventBasedGatewayToStepCoreRule();
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE:
			return createExclusiveConvergingGatewayRule();
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_RULE:
			return createParallelConvergingGatewayRule();
		case RulesPackage.SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE:
			return createSeqFlowAfterEGToAltFlowRule();
		case RulesPackage.SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE:
			return createSeqFlowAfterPGToParallelFlowRule();
		case RulesPackage.CATCH_EVENT_AFTER_EBG_TO_STEP_RULE:
			return createCatchEventAfterEBGToStepRule();
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE:
			return createExclusiveGatewayToStepRule();
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE:
			return createParallelGatewayToParallelStepRule();
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_RULE:
			return createEventBasedGatewayToStepRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpModelToUseCaseModelRule createBpModelToUseCaseModelRule() {
		BpModelToUseCaseModelRuleImpl bpModelToUseCaseModelRule = new BpModelToUseCaseModelRuleImpl();
		return bpModelToUseCaseModelRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsToPackageRule createDefinitionsToPackageRule() {
		DefinitionsToPackageRuleImpl definitionsToPackageRule = new DefinitionsToPackageRuleImpl();
		return definitionsToPackageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessToUseCaseRule createProcessToUseCaseRule() {
		ProcessToUseCaseRuleImpl processToUseCaseRule = new ProcessToUseCaseRuleImpl();
		return processToUseCaseRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstServiceTaskToStepRule createFirstServiceTaskToStepRule() {
		FirstServiceTaskToStepRuleImpl firstServiceTaskToStepRule = new FirstServiceTaskToStepRuleImpl();
		return firstServiceTaskToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUserTaskToStepRule createFirstUserTaskToStepRule() {
		FirstUserTaskToStepRuleImpl firstUserTaskToStepRule = new FirstUserTaskToStepRuleImpl();
		return firstUserTaskToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSetRule createLaneSetRule() {
		LaneSetRuleImpl laneSetRule = new LaneSetRuleImpl();
		return laneSetRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneToActorRule createLaneToActorRule() {
		LaneToActorRuleImpl laneToActorRule = new LaneToActorRuleImpl();
		return laneToActorRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTaskToStepRule createServiceTaskToStepRule() {
		ServiceTaskToStepRuleImpl serviceTaskToStepRule = new ServiceTaskToStepRuleImpl();
		return serviceTaskToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTaskToStepRule createUserTaskToStepRule() {
		UserTaskToStepRuleImpl userTaskToStepRule = new UserTaskToStepRuleImpl();
		return userTaskToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEventToStepRule createIntermediateThrowEventToStepRule() {
		IntermediateThrowEventToStepRuleImpl intermediateThrowEventToStepRule = new IntermediateThrowEventToStepRuleImpl();
		return intermediateThrowEventToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEventToStepRule createIntermediateCatchEventToStepRule() {
		IntermediateCatchEventToStepRuleImpl intermediateCatchEventToStepRule = new IntermediateCatchEventToStepRuleImpl();
		return intermediateCatchEventToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEventRule createEndEventRule() {
		EndEventRuleImpl endEventRule = new EndEventRuleImpl();
		return endEventRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGatewayToStepCoreRule createExclusiveGatewayToStepCoreRule() {
		ExclusiveGatewayToStepCoreRuleImpl exclusiveGatewayToStepCoreRule = new ExclusiveGatewayToStepCoreRuleImpl();
		return exclusiveGatewayToStepCoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstIntermediateThrowEventToStepRule createFirstIntermediateThrowEventToStepRule() {
		FirstIntermediateThrowEventToStepRuleImpl firstIntermediateThrowEventToStepRule = new FirstIntermediateThrowEventToStepRuleImpl();
		return firstIntermediateThrowEventToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstIntermediateCatchEventToStepRule createFirstIntermediateCatchEventToStepRule() {
		FirstIntermediateCatchEventToStepRuleImpl firstIntermediateCatchEventToStepRule = new FirstIntermediateCatchEventToStepRuleImpl();
		return firstIntermediateCatchEventToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGatewayToParallelStepCoreRule createParallelGatewayToParallelStepCoreRule() {
		ParallelGatewayToParallelStepCoreRuleImpl parallelGatewayToParallelStepCoreRule = new ParallelGatewayToParallelStepCoreRuleImpl();
		return parallelGatewayToParallelStepCoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayToStepCoreRule createEventBasedGatewayToStepCoreRule() {
		EventBasedGatewayToStepCoreRuleImpl eventBasedGatewayToStepCoreRule = new EventBasedGatewayToStepCoreRuleImpl();
		return eventBasedGatewayToStepCoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveConvergingGatewayRule createExclusiveConvergingGatewayRule() {
		ExclusiveConvergingGatewayRuleImpl exclusiveConvergingGatewayRule = new ExclusiveConvergingGatewayRuleImpl();
		return exclusiveConvergingGatewayRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelConvergingGatewayRule createParallelConvergingGatewayRule() {
		ParallelConvergingGatewayRuleImpl parallelConvergingGatewayRule = new ParallelConvergingGatewayRuleImpl();
		return parallelConvergingGatewayRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqFlowAfterEGToAltFlowRule createSeqFlowAfterEGToAltFlowRule() {
		SeqFlowAfterEGToAltFlowRuleImpl seqFlowAfterEGToAltFlowRule = new SeqFlowAfterEGToAltFlowRuleImpl();
		return seqFlowAfterEGToAltFlowRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqFlowAfterPGToParallelFlowRule createSeqFlowAfterPGToParallelFlowRule() {
		SeqFlowAfterPGToParallelFlowRuleImpl seqFlowAfterPGToParallelFlowRule = new SeqFlowAfterPGToParallelFlowRuleImpl();
		return seqFlowAfterPGToParallelFlowRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchEventAfterEBGToStepRule createCatchEventAfterEBGToStepRule() {
		CatchEventAfterEBGToStepRuleImpl catchEventAfterEBGToStepRule = new CatchEventAfterEBGToStepRuleImpl();
		return catchEventAfterEBGToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGatewayToStepRule createExclusiveGatewayToStepRule() {
		ExclusiveGatewayToStepRuleImpl exclusiveGatewayToStepRule = new ExclusiveGatewayToStepRuleImpl();
		return exclusiveGatewayToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGatewayToParallelStepRule createParallelGatewayToParallelStepRule() {
		ParallelGatewayToParallelStepRuleImpl parallelGatewayToParallelStepRule = new ParallelGatewayToParallelStepRuleImpl();
		return parallelGatewayToParallelStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayToStepRule createEventBasedGatewayToStepRule() {
		EventBasedGatewayToStepRuleImpl eventBasedGatewayToStepRule = new EventBasedGatewayToStepRuleImpl();
		return eventBasedGatewayToStepRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
