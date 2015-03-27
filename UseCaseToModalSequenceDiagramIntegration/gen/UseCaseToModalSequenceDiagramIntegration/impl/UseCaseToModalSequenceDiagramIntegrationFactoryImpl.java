/**
 */
package UseCaseToModalSequenceDiagramIntegration.impl;

import UseCaseToModalSequenceDiagramIntegration.*;

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
public class UseCaseToModalSequenceDiagramIntegrationFactoryImpl extends
		EFactoryImpl implements UseCaseToModalSequenceDiagramIntegrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UseCaseToModalSequenceDiagramIntegrationFactory init() {
		try {
			UseCaseToModalSequenceDiagramIntegrationFactory theUseCaseToModalSequenceDiagramIntegrationFactory = (UseCaseToModalSequenceDiagramIntegrationFactory) EPackage.Registry.INSTANCE
					.getEFactory(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI);
			if (theUseCaseToModalSequenceDiagramIntegrationFactory != null) {
				return theUseCaseToModalSequenceDiagramIntegrationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UseCaseToModalSequenceDiagramIntegrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationFactoryImpl() {
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASES_MODEL_TO_MODEL:
			return createUseCasesModelToModel();
		case UseCaseToModalSequenceDiagramIntegrationPackage.PACKAGE_DECLARATION_TO_PACKAGE:
			return createPackageDeclarationToPackage();
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASE_TO_INTERACTION:
			return createUseCaseToInteraction();
		case UseCaseToModalSequenceDiagramIntegrationPackage.NORMAL_STEP_TO_MESSAGE:
			return createNormalStepToMessage();
		case UseCaseToModalSequenceDiagramIntegrationPackage.ACTOR_TO_LIFELINE:
			return createActorToLifeline();
		case UseCaseToModalSequenceDiagramIntegrationPackage.FLOW_TO_INTERACTION_FRAGMENT:
			return createFlowToInteractionFragment();
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASE_TO_MESSAGE:
			return createUseCaseToMessage();
		case UseCaseToModalSequenceDiagramIntegrationPackage.STEP_ALTERNATIVE_TO_INTERACTION_OPERAND:
			return createStepAlternativeToInteractionOperand();
		case UseCaseToModalSequenceDiagramIntegrationPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT:
			return createParallelStepToCombinedFragment();
		case UseCaseToModalSequenceDiagramIntegrationPackage.NORMAL_STEP_TO_COMBINED_FRAGMENT:
			return createNormalStepToCombinedFragment();
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
	public UseCasesModelToModel createUseCasesModelToModel() {
		UseCasesModelToModelImpl useCasesModelToModel = new UseCasesModelToModelImpl();
		return useCasesModelToModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclarationToPackage createPackageDeclarationToPackage() {
		PackageDeclarationToPackageImpl packageDeclarationToPackage = new PackageDeclarationToPackageImpl();
		return packageDeclarationToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToInteraction createUseCaseToInteraction() {
		UseCaseToInteractionImpl useCaseToInteraction = new UseCaseToInteractionImpl();
		return useCaseToInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStepToMessage createNormalStepToMessage() {
		NormalStepToMessageImpl normalStepToMessage = new NormalStepToMessageImpl();
		return normalStepToMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorToLifeline createActorToLifeline() {
		ActorToLifelineImpl actorToLifeline = new ActorToLifelineImpl();
		return actorToLifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowToInteractionFragment createFlowToInteractionFragment() {
		FlowToInteractionFragmentImpl flowToInteractionFragment = new FlowToInteractionFragmentImpl();
		return flowToInteractionFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToMessage createUseCaseToMessage() {
		UseCaseToMessageImpl useCaseToMessage = new UseCaseToMessageImpl();
		return useCaseToMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepAlternativeToInteractionOperand createStepAlternativeToInteractionOperand() {
		StepAlternativeToInteractionOperandImpl stepAlternativeToInteractionOperand = new StepAlternativeToInteractionOperandImpl();
		return stepAlternativeToInteractionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelStepToCombinedFragment createParallelStepToCombinedFragment() {
		ParallelStepToCombinedFragmentImpl parallelStepToCombinedFragment = new ParallelStepToCombinedFragmentImpl();
		return parallelStepToCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStepToCombinedFragment createNormalStepToCombinedFragment() {
		NormalStepToCombinedFragmentImpl normalStepToCombinedFragment = new NormalStepToCombinedFragmentImpl();
		return normalStepToCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationPackage getUseCaseToModalSequenceDiagramIntegrationPackage() {
		return (UseCaseToModalSequenceDiagramIntegrationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UseCaseToModalSequenceDiagramIntegrationPackage getPackage() {
		return UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE;
	}

} //UseCaseToModalSequenceDiagramIntegrationFactoryImpl
