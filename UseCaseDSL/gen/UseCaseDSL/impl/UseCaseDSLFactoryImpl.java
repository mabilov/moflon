/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class UseCaseDSLFactoryImpl extends EFactoryImpl implements
		UseCaseDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UseCaseDSLFactory init() {
		try {
			UseCaseDSLFactory theUseCaseDSLFactory = (UseCaseDSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(UseCaseDSLPackage.eNS_URI);
			if (theUseCaseDSLFactory != null) {
				return theUseCaseDSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UseCaseDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDSLFactoryImpl() {
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
		case UseCaseDSLPackage.ACTOR:
			return createActor();
		case UseCaseDSLPackage.ALTERNATIVE_FLOW:
			return createAlternativeFlow();
		case UseCaseDSLPackage.ALTERNATIVE_FLOW_ALTERNATIVE:
			return createAlternativeFlowAlternative();
		case UseCaseDSLPackage.BASIC_FLOW:
			return createBasicFlow();
		case UseCaseDSLPackage.CONDITION:
			return createCondition();
		case UseCaseDSLPackage.EXCEPTION_FLOW:
			return createExceptionFlow();
		case UseCaseDSLPackage.LOCAL_ALTERNATIVE:
			return createLocalAlternative();
		case UseCaseDSLPackage.NORMAL_STEP:
			return createNormalStep();
		case UseCaseDSLPackage.PACKAGE_DECLARATION:
			return createPackageDeclaration();
		case UseCaseDSLPackage.PARALLEL_FLOW:
			return createParallelFlow();
		case UseCaseDSLPackage.PARALLEL_STEP:
			return createParallelStep();
		case UseCaseDSLPackage.USE_CASE:
			return createUseCase();
		case UseCaseDSLPackage.USE_CASES_MODEL:
			return createUseCasesModel();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UseCaseDSLPackage.ACTOR_TYPE:
			return createActorTypeFromString(eDataType, initialValue);
		case UseCaseDSLPackage.CUSTOM_STEP_TYPE:
			return createCustomStepTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UseCaseDSLPackage.ACTOR_TYPE:
			return convertActorTypeToString(eDataType, instanceValue);
		case UseCaseDSLPackage.CUSTOM_STEP_TYPE:
			return convertCustomStepTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeFlow createAlternativeFlow() {
		AlternativeFlowImpl alternativeFlow = new AlternativeFlowImpl();
		return alternativeFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeFlowAlternative createAlternativeFlowAlternative() {
		AlternativeFlowAlternativeImpl alternativeFlowAlternative = new AlternativeFlowAlternativeImpl();
		return alternativeFlowAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFlow createBasicFlow() {
		BasicFlowImpl basicFlow = new BasicFlowImpl();
		return basicFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionFlow createExceptionFlow() {
		ExceptionFlowImpl exceptionFlow = new ExceptionFlowImpl();
		return exceptionFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAlternative createLocalAlternative() {
		LocalAlternativeImpl localAlternative = new LocalAlternativeImpl();
		return localAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStep createNormalStep() {
		NormalStepImpl normalStep = new NormalStepImpl();
		return normalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclaration createPackageDeclaration() {
		PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
		return packageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelFlow createParallelFlow() {
		ParallelFlowImpl parallelFlow = new ParallelFlowImpl();
		return parallelFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelStep createParallelStep() {
		ParallelStepImpl parallelStep = new ParallelStepImpl();
		return parallelStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasesModel createUseCasesModel() {
		UseCasesModelImpl useCasesModel = new UseCasesModelImpl();
		return useCasesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorType createActorTypeFromString(EDataType eDataType,
			String initialValue) {
		ActorType result = ActorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActorTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStepType createCustomStepTypeFromString(EDataType eDataType,
			String initialValue) {
		CustomStepType result = CustomStepType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomStepTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDSLPackage getUseCaseDSLPackage() {
		return (UseCaseDSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UseCaseDSLPackage getPackage() {
		return UseCaseDSLPackage.eINSTANCE;
	}

} //UseCaseDSLFactoryImpl
