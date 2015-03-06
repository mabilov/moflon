/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory
 * @model kind="package"
 * @generated
 */
public interface BpmnToUseCaseIntegrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BpmnToUseCaseIntegration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/BpmnToUseCaseIntegration/model/BpmnToUseCaseIntegration.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BpmnToUseCaseIntegration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnToUseCaseIntegrationPackage eINSTANCE = BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.DocRootToUCModelImpl <em>Doc Root To UC Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.DocRootToUCModelImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDocRootToUCModel()
	 * @generated
	 */
	int DOC_ROOT_TO_UC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ROOT_TO_UC_MODEL__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ROOT_TO_UC_MODEL__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Root To UC Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ROOT_TO_UC_MODEL_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Root To UC Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ROOT_TO_UC_MODEL_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.DefinitionsToPackageImpl <em>Definitions To Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.DefinitionsToPackageImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDefinitionsToPackage()
	 * @generated
	 */
	int DEFINITIONS_TO_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definitions To Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definitions To Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.ProcessToUseCaseImpl <em>Process To Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.ProcessToUseCaseImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getProcessToUseCase()
	 * @generated
	 */
	int PROCESS_TO_USE_CASE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process To Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process To Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.StartEventToUseCaseImpl <em>Start Event To Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.StartEventToUseCaseImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getStartEventToUseCase()
	 * @generated
	 */
	int START_EVENT_TO_USE_CASE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_USE_CASE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_USE_CASE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Event To Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_USE_CASE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Event To Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_USE_CASE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.StartEventToBasicFlowImpl <em>Start Event To Basic Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.StartEventToBasicFlowImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getStartEventToBasicFlow()
	 * @generated
	 */
	int START_EVENT_TO_BASIC_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_BASIC_FLOW__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_BASIC_FLOW__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Event To Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_BASIC_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Event To Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_TO_BASIC_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.SequenceFlowToUCFlowImpl <em>Sequence Flow To UC Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.SequenceFlowToUCFlowImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSequenceFlowToUCFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW_TO_UC_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_UC_FLOW__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_UC_FLOW__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow To UC Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_UC_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow To UC Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_UC_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.ProcessToActorImpl <em>Process To Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.ProcessToActorImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getProcessToActor()
	 * @generated
	 */
	int PROCESS_TO_ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_ACTOR__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_ACTOR__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process To Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_ACTOR_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process To Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_ACTOR_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.FlowNodeToStepImpl <em>Flow Node To Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.FlowNodeToStepImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getFlowNodeToStep()
	 * @generated
	 */
	int FLOW_NODE_TO_STEP = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TO_STEP__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TO_STEP__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Node To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TO_STEP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow Node To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TO_STEP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.SequenceFlowToStepImpl <em>Sequence Flow To Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.SequenceFlowToStepImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSequenceFlowToStep()
	 * @generated
	 */
	int SEQUENCE_FLOW_TO_STEP = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_STEP__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_STEP__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_STEP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_STEP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.LaneToActorImpl <em>Lane To Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.LaneToActorImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getLaneToActor()
	 * @generated
	 */
	int LANE_TO_ACTOR = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lane To Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lane To Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.SeqFlowToAltFlowAltImpl <em>Seq Flow To Alt Flow Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.SeqFlowToAltFlowAltImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSeqFlowToAltFlowAlt()
	 * @generated
	 */
	int SEQ_FLOW_TO_ALT_FLOW_ALT = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_TO_ALT_FLOW_ALT__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_TO_ALT_FLOW_ALT__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Seq Flow To Alt Flow Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_TO_ALT_FLOW_ALT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Seq Flow To Alt Flow Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_TO_ALT_FLOW_ALT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.ICEToAltFlowImpl <em>ICE To Alt Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.ICEToAltFlowImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getICEToAltFlow()
	 * @generated
	 */
	int ICE_TO_ALT_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_TO_ALT_FLOW__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_TO_ALT_FLOW__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ICE To Alt Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_TO_ALT_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ICE To Alt Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_TO_ALT_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.EndEventToFlowImpl <em>End Event To Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.EndEventToFlowImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getEndEventToFlow()
	 * @generated
	 */
	int END_EVENT_TO_FLOW = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_TO_FLOW__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_TO_FLOW__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Event To Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_TO_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>End Event To Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_TO_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.DocRootToUCModel <em>Doc Root To UC Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Root To UC Model</em>'.
	 * @see BpmnToUseCaseIntegration.DocRootToUCModel
	 * @generated
	 */
	EClass getDocRootToUCModel();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DocRootToUCModel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.DocRootToUCModel#getSource()
	 * @see #getDocRootToUCModel()
	 * @generated
	 */
	EReference getDocRootToUCModel_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DocRootToUCModel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.DocRootToUCModel#getTarget()
	 * @see #getDocRootToUCModel()
	 * @generated
	 */
	EReference getDocRootToUCModel_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.DefinitionsToPackage <em>Definitions To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions To Package</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackage
	 * @generated
	 */
	EClass getDefinitionsToPackage();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DefinitionsToPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackage#getSource()
	 * @see #getDefinitionsToPackage()
	 * @generated
	 */
	EReference getDefinitionsToPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DefinitionsToPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackage#getTarget()
	 * @see #getDefinitionsToPackage()
	 * @generated
	 */
	EReference getDefinitionsToPackage_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.ProcessToUseCase <em>Process To Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process To Use Case</em>'.
	 * @see BpmnToUseCaseIntegration.ProcessToUseCase
	 * @generated
	 */
	EClass getProcessToUseCase();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.ProcessToUseCase#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.ProcessToUseCase#getSource()
	 * @see #getProcessToUseCase()
	 * @generated
	 */
	EReference getProcessToUseCase_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.ProcessToUseCase#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.ProcessToUseCase#getTarget()
	 * @see #getProcessToUseCase()
	 * @generated
	 */
	EReference getProcessToUseCase_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.StartEventToUseCase <em>Start Event To Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event To Use Case</em>'.
	 * @see BpmnToUseCaseIntegration.StartEventToUseCase
	 * @generated
	 */
	EClass getStartEventToUseCase();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.StartEventToUseCase#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.StartEventToUseCase#getSource()
	 * @see #getStartEventToUseCase()
	 * @generated
	 */
	EReference getStartEventToUseCase_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.StartEventToUseCase#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.StartEventToUseCase#getTarget()
	 * @see #getStartEventToUseCase()
	 * @generated
	 */
	EReference getStartEventToUseCase_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.StartEventToBasicFlow <em>Start Event To Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event To Basic Flow</em>'.
	 * @see BpmnToUseCaseIntegration.StartEventToBasicFlow
	 * @generated
	 */
	EClass getStartEventToBasicFlow();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.StartEventToBasicFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.StartEventToBasicFlow#getSource()
	 * @see #getStartEventToBasicFlow()
	 * @generated
	 */
	EReference getStartEventToBasicFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.StartEventToBasicFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.StartEventToBasicFlow#getTarget()
	 * @see #getStartEventToBasicFlow()
	 * @generated
	 */
	EReference getStartEventToBasicFlow_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.SequenceFlowToUCFlow <em>Sequence Flow To UC Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow To UC Flow</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToUCFlow
	 * @generated
	 */
	EClass getSequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SequenceFlowToUCFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToUCFlow#getSource()
	 * @see #getSequenceFlowToUCFlow()
	 * @generated
	 */
	EReference getSequenceFlowToUCFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SequenceFlowToUCFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToUCFlow#getTarget()
	 * @see #getSequenceFlowToUCFlow()
	 * @generated
	 */
	EReference getSequenceFlowToUCFlow_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.ProcessToActor <em>Process To Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process To Actor</em>'.
	 * @see BpmnToUseCaseIntegration.ProcessToActor
	 * @generated
	 */
	EClass getProcessToActor();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.ProcessToActor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.ProcessToActor#getSource()
	 * @see #getProcessToActor()
	 * @generated
	 */
	EReference getProcessToActor_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.ProcessToActor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.ProcessToActor#getTarget()
	 * @see #getProcessToActor()
	 * @generated
	 */
	EReference getProcessToActor_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.FlowNodeToStep <em>Flow Node To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node To Step</em>'.
	 * @see BpmnToUseCaseIntegration.FlowNodeToStep
	 * @generated
	 */
	EClass getFlowNodeToStep();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.FlowNodeToStep#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.FlowNodeToStep#getSource()
	 * @see #getFlowNodeToStep()
	 * @generated
	 */
	EReference getFlowNodeToStep_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.FlowNodeToStep#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.FlowNodeToStep#getTarget()
	 * @see #getFlowNodeToStep()
	 * @generated
	 */
	EReference getFlowNodeToStep_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.SequenceFlowToStep <em>Sequence Flow To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow To Step</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToStep
	 * @generated
	 */
	EClass getSequenceFlowToStep();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SequenceFlowToStep#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToStep#getSource()
	 * @see #getSequenceFlowToStep()
	 * @generated
	 */
	EReference getSequenceFlowToStep_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SequenceFlowToStep#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToStep#getTarget()
	 * @see #getSequenceFlowToStep()
	 * @generated
	 */
	EReference getSequenceFlowToStep_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.LaneToActor <em>Lane To Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane To Actor</em>'.
	 * @see BpmnToUseCaseIntegration.LaneToActor
	 * @generated
	 */
	EClass getLaneToActor();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.LaneToActor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.LaneToActor#getSource()
	 * @see #getLaneToActor()
	 * @generated
	 */
	EReference getLaneToActor_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.LaneToActor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.LaneToActor#getTarget()
	 * @see #getLaneToActor()
	 * @generated
	 */
	EReference getLaneToActor_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt <em>Seq Flow To Alt Flow Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Flow To Alt Flow Alt</em>'.
	 * @see BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt
	 * @generated
	 */
	EClass getSeqFlowToAltFlowAlt();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getSource()
	 * @see #getSeqFlowToAltFlowAlt()
	 * @generated
	 */
	EReference getSeqFlowToAltFlowAlt_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt#getTarget()
	 * @see #getSeqFlowToAltFlowAlt()
	 * @generated
	 */
	EReference getSeqFlowToAltFlowAlt_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.ICEToAltFlow <em>ICE To Alt Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICE To Alt Flow</em>'.
	 * @see BpmnToUseCaseIntegration.ICEToAltFlow
	 * @generated
	 */
	EClass getICEToAltFlow();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.ICEToAltFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.ICEToAltFlow#getSource()
	 * @see #getICEToAltFlow()
	 * @generated
	 */
	EReference getICEToAltFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.ICEToAltFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.ICEToAltFlow#getTarget()
	 * @see #getICEToAltFlow()
	 * @generated
	 */
	EReference getICEToAltFlow_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.EndEventToFlow <em>End Event To Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event To Flow</em>'.
	 * @see BpmnToUseCaseIntegration.EndEventToFlow
	 * @generated
	 */
	EClass getEndEventToFlow();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.EndEventToFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.EndEventToFlow#getSource()
	 * @see #getEndEventToFlow()
	 * @generated
	 */
	EReference getEndEventToFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.EndEventToFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.EndEventToFlow#getTarget()
	 * @see #getEndEventToFlow()
	 * @generated
	 */
	EReference getEndEventToFlow_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpmnToUseCaseIntegrationFactory getBpmnToUseCaseIntegrationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.DocRootToUCModelImpl <em>Doc Root To UC Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.DocRootToUCModelImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDocRootToUCModel()
		 * @generated
		 */
		EClass DOC_ROOT_TO_UC_MODEL = eINSTANCE.getDocRootToUCModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ROOT_TO_UC_MODEL__SOURCE = eINSTANCE
				.getDocRootToUCModel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ROOT_TO_UC_MODEL__TARGET = eINSTANCE
				.getDocRootToUCModel_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.DefinitionsToPackageImpl <em>Definitions To Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.DefinitionsToPackageImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDefinitionsToPackage()
		 * @generated
		 */
		EClass DEFINITIONS_TO_PACKAGE = eINSTANCE.getDefinitionsToPackage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_TO_PACKAGE__SOURCE = eINSTANCE
				.getDefinitionsToPackage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_TO_PACKAGE__TARGET = eINSTANCE
				.getDefinitionsToPackage_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.ProcessToUseCaseImpl <em>Process To Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.ProcessToUseCaseImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getProcessToUseCase()
		 * @generated
		 */
		EClass PROCESS_TO_USE_CASE = eINSTANCE.getProcessToUseCase();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TO_USE_CASE__SOURCE = eINSTANCE
				.getProcessToUseCase_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TO_USE_CASE__TARGET = eINSTANCE
				.getProcessToUseCase_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.StartEventToUseCaseImpl <em>Start Event To Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.StartEventToUseCaseImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getStartEventToUseCase()
		 * @generated
		 */
		EClass START_EVENT_TO_USE_CASE = eINSTANCE.getStartEventToUseCase();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EVENT_TO_USE_CASE__SOURCE = eINSTANCE
				.getStartEventToUseCase_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EVENT_TO_USE_CASE__TARGET = eINSTANCE
				.getStartEventToUseCase_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.StartEventToBasicFlowImpl <em>Start Event To Basic Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.StartEventToBasicFlowImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getStartEventToBasicFlow()
		 * @generated
		 */
		EClass START_EVENT_TO_BASIC_FLOW = eINSTANCE.getStartEventToBasicFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EVENT_TO_BASIC_FLOW__SOURCE = eINSTANCE
				.getStartEventToBasicFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EVENT_TO_BASIC_FLOW__TARGET = eINSTANCE
				.getStartEventToBasicFlow_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.SequenceFlowToUCFlowImpl <em>Sequence Flow To UC Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.SequenceFlowToUCFlowImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSequenceFlowToUCFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW_TO_UC_FLOW = eINSTANCE.getSequenceFlowToUCFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW_TO_UC_FLOW__SOURCE = eINSTANCE
				.getSequenceFlowToUCFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW_TO_UC_FLOW__TARGET = eINSTANCE
				.getSequenceFlowToUCFlow_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.ProcessToActorImpl <em>Process To Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.ProcessToActorImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getProcessToActor()
		 * @generated
		 */
		EClass PROCESS_TO_ACTOR = eINSTANCE.getProcessToActor();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TO_ACTOR__SOURCE = eINSTANCE
				.getProcessToActor_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TO_ACTOR__TARGET = eINSTANCE
				.getProcessToActor_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.FlowNodeToStepImpl <em>Flow Node To Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.FlowNodeToStepImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getFlowNodeToStep()
		 * @generated
		 */
		EClass FLOW_NODE_TO_STEP = eINSTANCE.getFlowNodeToStep();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_TO_STEP__SOURCE = eINSTANCE
				.getFlowNodeToStep_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_TO_STEP__TARGET = eINSTANCE
				.getFlowNodeToStep_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.SequenceFlowToStepImpl <em>Sequence Flow To Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.SequenceFlowToStepImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSequenceFlowToStep()
		 * @generated
		 */
		EClass SEQUENCE_FLOW_TO_STEP = eINSTANCE.getSequenceFlowToStep();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW_TO_STEP__SOURCE = eINSTANCE
				.getSequenceFlowToStep_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW_TO_STEP__TARGET = eINSTANCE
				.getSequenceFlowToStep_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.LaneToActorImpl <em>Lane To Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.LaneToActorImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getLaneToActor()
		 * @generated
		 */
		EClass LANE_TO_ACTOR = eINSTANCE.getLaneToActor();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE_TO_ACTOR__SOURCE = eINSTANCE.getLaneToActor_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE_TO_ACTOR__TARGET = eINSTANCE.getLaneToActor_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.SeqFlowToAltFlowAltImpl <em>Seq Flow To Alt Flow Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.SeqFlowToAltFlowAltImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSeqFlowToAltFlowAlt()
		 * @generated
		 */
		EClass SEQ_FLOW_TO_ALT_FLOW_ALT = eINSTANCE.getSeqFlowToAltFlowAlt();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_FLOW_TO_ALT_FLOW_ALT__SOURCE = eINSTANCE
				.getSeqFlowToAltFlowAlt_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_FLOW_TO_ALT_FLOW_ALT__TARGET = eINSTANCE
				.getSeqFlowToAltFlowAlt_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.ICEToAltFlowImpl <em>ICE To Alt Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.ICEToAltFlowImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getICEToAltFlow()
		 * @generated
		 */
		EClass ICE_TO_ALT_FLOW = eINSTANCE.getICEToAltFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_TO_ALT_FLOW__SOURCE = eINSTANCE.getICEToAltFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_TO_ALT_FLOW__TARGET = eINSTANCE.getICEToAltFlow_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.EndEventToFlowImpl <em>End Event To Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.EndEventToFlowImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getEndEventToFlow()
		 * @generated
		 */
		EClass END_EVENT_TO_FLOW = eINSTANCE.getEndEventToFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_EVENT_TO_FLOW__SOURCE = eINSTANCE
				.getEndEventToFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_EVENT_TO_FLOW__TARGET = eINSTANCE
				.getEndEventToFlow_Target();

	}

} //BpmnToUseCaseIntegrationPackage
