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
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl <em>Document Root To Use Cases Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDocumentRootToUseCasesModel()
	 * @generated
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Root To Use Cases Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Document Root To Use Cases Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl <em>Definitions To Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDefinitionsToPackageDeclaration()
	 * @generated
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definitions To Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definitions To Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.SequenceFlowToAlternativeFlowAlternativeImpl <em>Sequence Flow To Alternative Flow Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.SequenceFlowToAlternativeFlowAlternativeImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSequenceFlowToAlternativeFlowAlternative()
	 * @generated
	 */
	int SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow To Alternative Flow Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow To Alternative Flow Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.IntermediateCatchEventToAlternativeFlowImpl <em>Intermediate Catch Event To Alternative Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.IntermediateCatchEventToAlternativeFlowImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getIntermediateCatchEventToAlternativeFlow()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intermediate Catch Event To Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Intermediate Catch Event To Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel <em>Document Root To Use Cases Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root To Use Cases Model</em>'.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel
	 * @generated
	 */
	EClass getDocumentRootToUseCasesModel();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getSource()
	 * @see #getDocumentRootToUseCasesModel()
	 * @generated
	 */
	EReference getDocumentRootToUseCasesModel_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getTarget()
	 * @see #getDocumentRootToUseCasesModel()
	 * @generated
	 */
	EReference getDocumentRootToUseCasesModel_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration <em>Definitions To Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions To Package Declaration</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration
	 * @generated
	 */
	EClass getDefinitionsToPackageDeclaration();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getSource()
	 * @see #getDefinitionsToPackageDeclaration()
	 * @generated
	 */
	EReference getDefinitionsToPackageDeclaration_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getTarget()
	 * @see #getDefinitionsToPackageDeclaration()
	 * @generated
	 */
	EReference getDefinitionsToPackageDeclaration_Target();

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
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative <em>Sequence Flow To Alternative Flow Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow To Alternative Flow Alternative</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative
	 * @generated
	 */
	EClass getSequenceFlowToAlternativeFlowAlternative();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative#getSource()
	 * @see #getSequenceFlowToAlternativeFlowAlternative()
	 * @generated
	 */
	EReference getSequenceFlowToAlternativeFlowAlternative_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative#getTarget()
	 * @see #getSequenceFlowToAlternativeFlowAlternative()
	 * @generated
	 */
	EReference getSequenceFlowToAlternativeFlowAlternative_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow <em>Intermediate Catch Event To Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event To Alternative Flow</em>'.
	 * @see BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow
	 * @generated
	 */
	EClass getIntermediateCatchEventToAlternativeFlow();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow#getSource()
	 * @see #getIntermediateCatchEventToAlternativeFlow()
	 * @generated
	 */
	EReference getIntermediateCatchEventToAlternativeFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow#getTarget()
	 * @see #getIntermediateCatchEventToAlternativeFlow()
	 * @generated
	 */
	EReference getIntermediateCatchEventToAlternativeFlow_Target();

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
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl <em>Document Root To Use Cases Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDocumentRootToUseCasesModel()
		 * @generated
		 */
		EClass DOCUMENT_ROOT_TO_USE_CASES_MODEL = eINSTANCE
				.getDocumentRootToUseCasesModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE = eINSTANCE
				.getDocumentRootToUseCasesModel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET = eINSTANCE
				.getDocumentRootToUseCasesModel_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl <em>Definitions To Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDefinitionsToPackageDeclaration()
		 * @generated
		 */
		EClass DEFINITIONS_TO_PACKAGE_DECLARATION = eINSTANCE
				.getDefinitionsToPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_TO_PACKAGE_DECLARATION__SOURCE = eINSTANCE
				.getDefinitionsToPackageDeclaration_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_TO_PACKAGE_DECLARATION__TARGET = eINSTANCE
				.getDefinitionsToPackageDeclaration_Target();

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
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.SequenceFlowToAlternativeFlowAlternativeImpl <em>Sequence Flow To Alternative Flow Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.SequenceFlowToAlternativeFlowAlternativeImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getSequenceFlowToAlternativeFlowAlternative()
		 * @generated
		 */
		EClass SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE = eINSTANCE
				.getSequenceFlowToAlternativeFlowAlternative();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE__SOURCE = eINSTANCE
				.getSequenceFlowToAlternativeFlowAlternative_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE__TARGET = eINSTANCE
				.getSequenceFlowToAlternativeFlowAlternative_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.IntermediateCatchEventToAlternativeFlowImpl <em>Intermediate Catch Event To Alternative Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.IntermediateCatchEventToAlternativeFlowImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getIntermediateCatchEventToAlternativeFlow()
		 * @generated
		 */
		EClass INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW = eINSTANCE
				.getIntermediateCatchEventToAlternativeFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW__SOURCE = eINSTANCE
				.getIntermediateCatchEventToAlternativeFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW__TARGET = eINSTANCE
				.getIntermediateCatchEventToAlternativeFlow_Target();

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
