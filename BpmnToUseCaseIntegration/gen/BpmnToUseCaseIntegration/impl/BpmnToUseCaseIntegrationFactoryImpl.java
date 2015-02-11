/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.*;

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
public class BpmnToUseCaseIntegrationFactoryImpl extends EFactoryImpl implements
		BpmnToUseCaseIntegrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnToUseCaseIntegrationFactory init() {
		try {
			BpmnToUseCaseIntegrationFactory theBpmnToUseCaseIntegrationFactory = (BpmnToUseCaseIntegrationFactory) EPackage.Registry.INSTANCE
					.getEFactory(BpmnToUseCaseIntegrationPackage.eNS_URI);
			if (theBpmnToUseCaseIntegrationFactory != null) {
				return theBpmnToUseCaseIntegrationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnToUseCaseIntegrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationFactoryImpl() {
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
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL:
			return createDocumentRootToUseCasesModel();
		case BpmnToUseCaseIntegrationPackage.DEFINITIONS_TO_PACKAGE_DECLARATION:
			return createDefinitionsToPackageDeclaration();
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_USE_CASE:
			return createProcessToUseCase();
		case BpmnToUseCaseIntegrationPackage.START_EVENT_TO_USE_CASE:
			return createStartEventToUseCase();
		case BpmnToUseCaseIntegrationPackage.START_EVENT_TO_BASIC_FLOW:
			return createStartEventToBasicFlow();
		case BpmnToUseCaseIntegrationPackage.SEQUENCE_FLOW_TO_UC_FLOW:
			return createSequenceFlowToUCFlow();
		case BpmnToUseCaseIntegrationPackage.PROCESS_TO_ACTOR:
			return createProcessToActor();
		case BpmnToUseCaseIntegrationPackage.FLOW_NODE_TO_STEP:
			return createFlowNodeToStep();
		case BpmnToUseCaseIntegrationPackage.SEQUENCE_FLOW_TO_STEP:
			return createSequenceFlowToStep();
		case BpmnToUseCaseIntegrationPackage.LANE_TO_ACTOR:
			return createLaneToActor();
		case BpmnToUseCaseIntegrationPackage.SEQUENCE_FLOW_TO_ALTERNATIVE_FLOW_ALTERNATIVE:
			return createSequenceFlowToAlternativeFlowAlternative();
		case BpmnToUseCaseIntegrationPackage.INTERMEDIATE_CATCH_EVENT_TO_ALTERNATIVE_FLOW:
			return createIntermediateCatchEventToAlternativeFlow();
		case BpmnToUseCaseIntegrationPackage.END_EVENT_TO_FLOW:
			return createEndEventToFlow();
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
	public DocumentRootToUseCasesModel createDocumentRootToUseCasesModel() {
		DocumentRootToUseCasesModelImpl documentRootToUseCasesModel = new DocumentRootToUseCasesModelImpl();
		return documentRootToUseCasesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsToPackageDeclaration createDefinitionsToPackageDeclaration() {
		DefinitionsToPackageDeclarationImpl definitionsToPackageDeclaration = new DefinitionsToPackageDeclarationImpl();
		return definitionsToPackageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessToUseCase createProcessToUseCase() {
		ProcessToUseCaseImpl processToUseCase = new ProcessToUseCaseImpl();
		return processToUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEventToUseCase createStartEventToUseCase() {
		StartEventToUseCaseImpl startEventToUseCase = new StartEventToUseCaseImpl();
		return startEventToUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEventToBasicFlow createStartEventToBasicFlow() {
		StartEventToBasicFlowImpl startEventToBasicFlow = new StartEventToBasicFlowImpl();
		return startEventToBasicFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlowToUCFlow createSequenceFlowToUCFlow() {
		SequenceFlowToUCFlowImpl sequenceFlowToUCFlow = new SequenceFlowToUCFlowImpl();
		return sequenceFlowToUCFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessToActor createProcessToActor() {
		ProcessToActorImpl processToActor = new ProcessToActorImpl();
		return processToActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeToStep createFlowNodeToStep() {
		FlowNodeToStepImpl flowNodeToStep = new FlowNodeToStepImpl();
		return flowNodeToStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlowToStep createSequenceFlowToStep() {
		SequenceFlowToStepImpl sequenceFlowToStep = new SequenceFlowToStepImpl();
		return sequenceFlowToStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneToActor createLaneToActor() {
		LaneToActorImpl laneToActor = new LaneToActorImpl();
		return laneToActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlowToAlternativeFlowAlternative createSequenceFlowToAlternativeFlowAlternative() {
		SequenceFlowToAlternativeFlowAlternativeImpl sequenceFlowToAlternativeFlowAlternative = new SequenceFlowToAlternativeFlowAlternativeImpl();
		return sequenceFlowToAlternativeFlowAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEventToAlternativeFlow createIntermediateCatchEventToAlternativeFlow() {
		IntermediateCatchEventToAlternativeFlowImpl intermediateCatchEventToAlternativeFlow = new IntermediateCatchEventToAlternativeFlowImpl();
		return intermediateCatchEventToAlternativeFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEventToFlow createEndEventToFlow() {
		EndEventToFlowImpl endEventToFlow = new EndEventToFlowImpl();
		return endEventToFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationPackage getBpmnToUseCaseIntegrationPackage() {
		return (BpmnToUseCaseIntegrationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmnToUseCaseIntegrationPackage getPackage() {
		return BpmnToUseCaseIntegrationPackage.eINSTANCE;
	}

} //BpmnToUseCaseIntegrationFactoryImpl
