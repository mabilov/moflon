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
		case RulesPackage.CLASS1:
			return createClass1();
		case RulesPackage.LANE_SET_RULE:
			return createLaneSetRule();
		case RulesPackage.LANE_TO_ACTOR_RULE:
			return createLaneToActorRule();
		case RulesPackage.SERVICE_TASK_TO_STEP_RULE:
			return createServiceTaskToStepRule();
		case RulesPackage.USER_TASK_TO_STEP_RULE:
			return createUserTaskToStepRule();
		case RulesPackage.ITE_TO_STEP_RULE:
			return createITEToStepRule();
		case RulesPackage.END_EVENT_RULE:
			return createEndEventRule();
		case RulesPackage.FIRST_INTER_THROW_EVENT_TO_STEP_RULE:
			return createFirstInterThrowEventToStepRule();
		case RulesPackage.EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE:
			return createEventBasedGatewayToStepCoreRule();
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
		case RulesPackage.LANE_START_EVENT_RULE:
			return createLaneStartEventRule();
		case RulesPackage.EXC_CONV_GW_AFTER_EVENT_GW_RULE:
			return createExcConvGwAfterEventGwRule();
		case RulesPackage.EXC_CONV_GW_DEFAULT_SEQ_FLOW_RULE:
			return createExcConvGwDefaultSeqFlowRule();
		case RulesPackage.PARALLEL_CONVERGING_GATEWAY_TWO_INPUTS_RULE:
			return createParallelConvergingGatewayTwoInputsRule();
		case RulesPackage.EXC_CONV_GW_AFTER_EX_DIV_GW_RULE:
			return createExcConvGwAfterExDivGwRule();
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE:
			return createExConvGwAfterEventGwIceSeqFlowRule();
		case RulesPackage.CONTINUATION_RULE:
			return createContinuationRule();
		case RulesPackage.ICE_TO_STEP_AFTER_SE_RULE:
			return createICEToStepAfterSERule();
		case RulesPackage.ICE_TO_STEP_AFTER_EX_GW_RULE:
			return createICEToStepAfterExGwRule();
		case RulesPackage.ICE_TO_STEP_AFTER_PG_RULE:
			return createICEToStepAfterPGRule();
		case RulesPackage.ICE_TO_STEP_AFTER_TASK_RULE:
			return createICEToStepAfterTaskRule();
		case RulesPackage.ICE_TO_STEP_AFTER_EVENT_RULE:
			return createICEToStepAfterEventRule();
		case RulesPackage.ICE_TO_STEP_AFTER_EX_CONV_GW_RULE:
			return createICEToStepAfterExConvGwRule();
		case RulesPackage.ICE_TO_STEP_AFTER_PCONV_GW_RULE:
			return createICEToStepAfterPConvGwRule();
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_SE_RULE:
			return createServiceTaskToStepAfterSERule();
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EX_GW_RULE:
			return createServiceTaskToStepAfterExGwRule();
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_PG_RULE:
			return createServiceTaskToStepAfterPGRule();
		case RulesPackage.SERVICE_TASK_TO_STEP_AFTER_EV_GW_RULE:
			return createServiceTaskToStepAfterEvGwRule();
		case RulesPackage.USER_TASK_TO_STEP_AFTER_SE_RULE:
			return createUserTaskToStepAfterSERule();
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EX_GW_RULE:
			return createUserTaskToStepAfterExGwRule();
		case RulesPackage.USER_TASK_TO_STEP_AFTER_PG_RULE:
			return createUserTaskToStepAfterPGRule();
		case RulesPackage.USER_TASK_TO_STEP_AFTER_EV_GW_RULE:
			return createUserTaskToStepAfterEvGwRule();
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
	public Class1 createClass1() {
		Class1Impl class1 = new Class1Impl();
		return class1;
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
	public ITEToStepRule createITEToStepRule() {
		ITEToStepRuleImpl iteToStepRule = new ITEToStepRuleImpl();
		return iteToStepRule;
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
	public FirstInterThrowEventToStepRule createFirstInterThrowEventToStepRule() {
		FirstInterThrowEventToStepRuleImpl firstInterThrowEventToStepRule = new FirstInterThrowEventToStepRuleImpl();
		return firstInterThrowEventToStepRule;
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
	public LaneStartEventRule createLaneStartEventRule() {
		LaneStartEventRuleImpl laneStartEventRule = new LaneStartEventRuleImpl();
		return laneStartEventRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcConvGwAfterEventGwRule createExcConvGwAfterEventGwRule() {
		ExcConvGwAfterEventGwRuleImpl excConvGwAfterEventGwRule = new ExcConvGwAfterEventGwRuleImpl();
		return excConvGwAfterEventGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcConvGwDefaultSeqFlowRule createExcConvGwDefaultSeqFlowRule() {
		ExcConvGwDefaultSeqFlowRuleImpl excConvGwDefaultSeqFlowRule = new ExcConvGwDefaultSeqFlowRuleImpl();
		return excConvGwDefaultSeqFlowRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelConvergingGatewayTwoInputsRule createParallelConvergingGatewayTwoInputsRule() {
		ParallelConvergingGatewayTwoInputsRuleImpl parallelConvergingGatewayTwoInputsRule = new ParallelConvergingGatewayTwoInputsRuleImpl();
		return parallelConvergingGatewayTwoInputsRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcConvGwAfterExDivGwRule createExcConvGwAfterExDivGwRule() {
		ExcConvGwAfterExDivGwRuleImpl excConvGwAfterExDivGwRule = new ExcConvGwAfterExDivGwRuleImpl();
		return excConvGwAfterExDivGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExConvGwAfterEventGwIceSeqFlowRule createExConvGwAfterEventGwIceSeqFlowRule() {
		ExConvGwAfterEventGwIceSeqFlowRuleImpl exConvGwAfterEventGwIceSeqFlowRule = new ExConvGwAfterEventGwIceSeqFlowRuleImpl();
		return exConvGwAfterEventGwIceSeqFlowRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationRule createContinuationRule() {
		ContinuationRuleImpl continuationRule = new ContinuationRuleImpl();
		return continuationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterSERule createICEToStepAfterSERule() {
		ICEToStepAfterSERuleImpl iceToStepAfterSERule = new ICEToStepAfterSERuleImpl();
		return iceToStepAfterSERule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterExGwRule createICEToStepAfterExGwRule() {
		ICEToStepAfterExGwRuleImpl iceToStepAfterExGwRule = new ICEToStepAfterExGwRuleImpl();
		return iceToStepAfterExGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterPGRule createICEToStepAfterPGRule() {
		ICEToStepAfterPGRuleImpl iceToStepAfterPGRule = new ICEToStepAfterPGRuleImpl();
		return iceToStepAfterPGRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterTaskRule createICEToStepAfterTaskRule() {
		ICEToStepAfterTaskRuleImpl iceToStepAfterTaskRule = new ICEToStepAfterTaskRuleImpl();
		return iceToStepAfterTaskRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterEventRule createICEToStepAfterEventRule() {
		ICEToStepAfterEventRuleImpl iceToStepAfterEventRule = new ICEToStepAfterEventRuleImpl();
		return iceToStepAfterEventRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterExConvGwRule createICEToStepAfterExConvGwRule() {
		ICEToStepAfterExConvGwRuleImpl iceToStepAfterExConvGwRule = new ICEToStepAfterExConvGwRuleImpl();
		return iceToStepAfterExConvGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICEToStepAfterPConvGwRule createICEToStepAfterPConvGwRule() {
		ICEToStepAfterPConvGwRuleImpl iceToStepAfterPConvGwRule = new ICEToStepAfterPConvGwRuleImpl();
		return iceToStepAfterPConvGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTaskToStepAfterSERule createServiceTaskToStepAfterSERule() {
		ServiceTaskToStepAfterSERuleImpl serviceTaskToStepAfterSERule = new ServiceTaskToStepAfterSERuleImpl();
		return serviceTaskToStepAfterSERule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTaskToStepAfterExGwRule createServiceTaskToStepAfterExGwRule() {
		ServiceTaskToStepAfterExGwRuleImpl serviceTaskToStepAfterExGwRule = new ServiceTaskToStepAfterExGwRuleImpl();
		return serviceTaskToStepAfterExGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTaskToStepAfterPGRule createServiceTaskToStepAfterPGRule() {
		ServiceTaskToStepAfterPGRuleImpl serviceTaskToStepAfterPGRule = new ServiceTaskToStepAfterPGRuleImpl();
		return serviceTaskToStepAfterPGRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTaskToStepAfterEvGwRule createServiceTaskToStepAfterEvGwRule() {
		ServiceTaskToStepAfterEvGwRuleImpl serviceTaskToStepAfterEvGwRule = new ServiceTaskToStepAfterEvGwRuleImpl();
		return serviceTaskToStepAfterEvGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTaskToStepAfterSERule createUserTaskToStepAfterSERule() {
		UserTaskToStepAfterSERuleImpl userTaskToStepAfterSERule = new UserTaskToStepAfterSERuleImpl();
		return userTaskToStepAfterSERule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTaskToStepAfterExGwRule createUserTaskToStepAfterExGwRule() {
		UserTaskToStepAfterExGwRuleImpl userTaskToStepAfterExGwRule = new UserTaskToStepAfterExGwRuleImpl();
		return userTaskToStepAfterExGwRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTaskToStepAfterPGRule createUserTaskToStepAfterPGRule() {
		UserTaskToStepAfterPGRuleImpl userTaskToStepAfterPGRule = new UserTaskToStepAfterPGRuleImpl();
		return userTaskToStepAfterPGRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTaskToStepAfterEvGwRule createUserTaskToStepAfterEvGwRule() {
		UserTaskToStepAfterEvGwRuleImpl userTaskToStepAfterEvGwRule = new UserTaskToStepAfterEvGwRuleImpl();
		return userTaskToStepAfterEvGwRule;
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
