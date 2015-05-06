/**
 */
package UseCaseDSL.impl;

import UseCaseDSL.Actor;
import UseCaseDSL.ActorType;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Condition;
import UseCaseDSL.ExceptionFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.LocalAlternative;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;
import UseCaseDSL.StepType;
import UseCaseDSL.UCCondition;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCaseDSLPackage;
import UseCaseDSL.UseCasesModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseDSLPackageImpl extends EPackageImpl implements
		UseCaseDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeFlowAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCasesModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UseCaseDSL.UseCaseDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UseCaseDSLPackageImpl() {
		super(eNS_URI, UseCaseDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UseCaseDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UseCaseDSLPackage init() {
		if (isInited)
			return (UseCaseDSLPackage) EPackage.Registry.INSTANCE
					.getEPackage(UseCaseDSLPackage.eNS_URI);

		// Obtain or create and register package
		UseCaseDSLPackageImpl theUseCaseDSLPackage = (UseCaseDSLPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UseCaseDSLPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new UseCaseDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUseCaseDSLPackage.createPackageContents();

		// Initialize created meta-data
		theUseCaseDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUseCaseDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UseCaseDSLPackage.eNS_URI,
				theUseCaseDSLPackage);
		return theUseCaseDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Extends() {
		return (EReference) actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Description() {
		return (EAttribute) actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Name() {
		return (EAttribute) actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Type() {
		return (EAttribute) actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeFlow() {
		return alternativeFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeFlowAlternative() {
		return alternativeFlowAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeFlowAlternative_Ref() {
		return (EReference) alternativeFlowAlternativeEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicFlow() {
		return basicFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionFlow() {
		return exceptionFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionFlow_Condition() {
		return (EAttribute) exceptionFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Steps() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FinalState() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAlternative() {
		return localAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAlternative_InvokedUseCase() {
		return (EReference) localAlternativeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAlternative_Description() {
		return (EAttribute) localAlternativeEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedFlow() {
		return namedFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedFlow_Name() {
		return (EAttribute) namedFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStep() {
		return normalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalStep_StepAlternative() {
		return (EReference) normalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalStep_Actor() {
		return (EReference) normalStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalStep_Type() {
		return (EAttribute) normalStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDeclaration() {
		return packageDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclaration_UseCases() {
		return (EReference) packageDeclarationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclaration_Actors() {
		return (EReference) packageDeclarationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageDeclaration_Description() {
		return (EAttribute) packageDeclarationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageDeclaration_Name() {
		return (EAttribute) packageDeclarationEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelFlow() {
		return parallelFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelStep() {
		return parallelStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelStep_InvokedFlows() {
		return (EReference) parallelStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Next() {
		return (EReference) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InvokedUseCase() {
		return (EReference) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Label() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepAlternative() {
		return stepAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepAlternative_Continuation() {
		return (EReference) stepAlternativeEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepAlternative_Condition() {
		return (EAttribute) stepAlternativeEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_SuperCase() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Flows() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Preconditions() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Postconditions() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Description() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Name() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCasesModel() {
		return useCasesModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCasesModel_Packages() {
		return (EReference) useCasesModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCCondition() {
		return ucConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUCCondition_Name() {
		return (EAttribute) ucConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActorType() {
		return actorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepType() {
		return stepTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDSLFactory getUseCaseDSLFactory() {
		return (UseCaseDSLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__EXTENDS);
		createEAttribute(actorEClass, ACTOR__DESCRIPTION);
		createEAttribute(actorEClass, ACTOR__NAME);
		createEAttribute(actorEClass, ACTOR__TYPE);

		alternativeFlowEClass = createEClass(ALTERNATIVE_FLOW);

		alternativeFlowAlternativeEClass = createEClass(ALTERNATIVE_FLOW_ALTERNATIVE);
		createEReference(alternativeFlowAlternativeEClass,
				ALTERNATIVE_FLOW_ALTERNATIVE__REF);

		basicFlowEClass = createEClass(BASIC_FLOW);

		conditionEClass = createEClass(CONDITION);

		exceptionFlowEClass = createEClass(EXCEPTION_FLOW);
		createEAttribute(exceptionFlowEClass, EXCEPTION_FLOW__CONDITION);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__STEPS);
		createEReference(flowEClass, FLOW__FINAL_STATE);

		localAlternativeEClass = createEClass(LOCAL_ALTERNATIVE);
		createEReference(localAlternativeEClass,
				LOCAL_ALTERNATIVE__INVOKED_USE_CASE);
		createEAttribute(localAlternativeEClass, LOCAL_ALTERNATIVE__DESCRIPTION);

		namedFlowEClass = createEClass(NAMED_FLOW);
		createEAttribute(namedFlowEClass, NAMED_FLOW__NAME);

		normalStepEClass = createEClass(NORMAL_STEP);
		createEReference(normalStepEClass, NORMAL_STEP__STEP_ALTERNATIVE);
		createEReference(normalStepEClass, NORMAL_STEP__ACTOR);
		createEAttribute(normalStepEClass, NORMAL_STEP__TYPE);

		packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
		createEReference(packageDeclarationEClass,
				PACKAGE_DECLARATION__USE_CASES);
		createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ACTORS);
		createEAttribute(packageDeclarationEClass,
				PACKAGE_DECLARATION__DESCRIPTION);
		createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

		parallelFlowEClass = createEClass(PARALLEL_FLOW);

		parallelStepEClass = createEClass(PARALLEL_STEP);
		createEReference(parallelStepEClass, PARALLEL_STEP__INVOKED_FLOWS);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__NEXT);
		createEReference(stepEClass, STEP__INVOKED_USE_CASE);
		createEAttribute(stepEClass, STEP__LABEL);
		createEAttribute(stepEClass, STEP__NAME);

		stepAlternativeEClass = createEClass(STEP_ALTERNATIVE);
		createEReference(stepAlternativeEClass, STEP_ALTERNATIVE__CONTINUATION);
		createEAttribute(stepAlternativeEClass, STEP_ALTERNATIVE__CONDITION);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__SUPER_CASE);
		createEReference(useCaseEClass, USE_CASE__FLOWS);
		createEReference(useCaseEClass, USE_CASE__PRECONDITIONS);
		createEReference(useCaseEClass, USE_CASE__POSTCONDITIONS);
		createEAttribute(useCaseEClass, USE_CASE__DESCRIPTION);
		createEAttribute(useCaseEClass, USE_CASE__NAME);

		useCasesModelEClass = createEClass(USE_CASES_MODEL);
		createEReference(useCasesModelEClass, USE_CASES_MODEL__PACKAGES);

		ucConditionEClass = createEClass(UC_CONDITION);
		createEAttribute(ucConditionEClass, UC_CONDITION__NAME);

		// Create enums
		actorTypeEEnum = createEEnum(ACTOR_TYPE);
		stepTypeEEnum = createEEnum(STEP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alternativeFlowEClass.getESuperTypes().add(this.getNamedFlow());
		alternativeFlowAlternativeEClass.getESuperTypes().add(
				this.getStepAlternative());
		basicFlowEClass.getESuperTypes().add(this.getFlow());
		conditionEClass.getESuperTypes().add(this.getStepAlternative());
		exceptionFlowEClass.getESuperTypes().add(this.getNamedFlow());
		localAlternativeEClass.getESuperTypes().add(this.getStepAlternative());
		namedFlowEClass.getESuperTypes().add(this.getFlow());
		normalStepEClass.getESuperTypes().add(this.getStep());
		parallelFlowEClass.getESuperTypes().add(this.getNamedFlow());
		parallelStepEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Extends(), this.getActor(), null, "extends",
				null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Description(), ecorePackage.getEString(),
				"description", null, 0, 1, Actor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActor_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getActor_Type(), this.getActorType(), "type", null, 1,
				1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(alternativeFlowEClass, AlternativeFlow.class,
				"AlternativeFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(alternativeFlowAlternativeEClass,
				AlternativeFlowAlternative.class, "AlternativeFlowAlternative",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeFlowAlternative_Ref(),
				this.getNamedFlow(), null, "ref", null, 0, 1,
				AlternativeFlowAlternative.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicFlowEClass, BasicFlow.class, "BasicFlow", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionFlowEClass, ExceptionFlow.class, "ExceptionFlow",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionFlow_Condition(), ecorePackage.getEString(),
				"condition", null, 1, 1, ExceptionFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Steps(), this.getStep(), null, "steps", null, 0,
				-1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_FinalState(), this.getUCCondition(), null,
				"finalState", null, 0, 1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAlternativeEClass, LocalAlternative.class,
				"LocalAlternative", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAlternative_InvokedUseCase(), this.getUseCase(),
				null, "invokedUseCase", null, 0, 1, LocalAlternative.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLocalAlternative_Description(),
				ecorePackage.getEString(), "description", null, 0, 1,
				LocalAlternative.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(namedFlowEClass, NamedFlow.class, "NamedFlow", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedFlow_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, NamedFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(normalStepEClass, NormalStep.class, "NormalStep",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalStep_StepAlternative(),
				this.getStepAlternative(), null, "stepAlternative", null, 0,
				-1, NormalStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalStep_Actor(), this.getActor(), null, "actor",
				null, 0, 1, NormalStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalStep_Type(), this.getStepType(), "type", null,
				1, 1, NormalStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(packageDeclarationEClass, PackageDeclaration.class,
				"PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageDeclaration_UseCases(), this.getUseCase(),
				null, "useCases", null, 0, -1, PackageDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPackageDeclaration_Actors(), this.getActor(), null,
				"actors", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageDeclaration_Description(),
				ecorePackage.getEString(), "description", null, 0, 1,
				PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, PackageDeclaration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(parallelFlowEClass, ParallelFlow.class, "ParallelFlow",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelStepEClass, ParallelStep.class, "ParallelStep",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelStep_InvokedFlows(), this.getParallelFlow(),
				null, "invokedFlows", null, 0, -1, ParallelStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Next(), this.getStep(), null, "next", null, 0,
				1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStep_InvokedUseCase(), this.getUseCase(), null,
				"invokedUseCase", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Label(), ecorePackage.getEString(), "label",
				null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null,
				1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stepAlternativeEClass, StepAlternative.class,
				"StepAlternative", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepAlternative_Continuation(), this.getStep(), null,
				"continuation", null, 0, 1, StepAlternative.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStepAlternative_Condition(),
				ecorePackage.getEString(), "condition", null, 1, 1,
				StepAlternative.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_SuperCase(), this.getUseCase(), null,
				"superCase", null, 0, 1, UseCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Flows(), this.getFlow(), null, "flows", null,
				0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Preconditions(), this.getUCCondition(), null,
				"preconditions", null, 0, -1, UseCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Postconditions(), this.getUCCondition(),
				null, "postconditions", null, 0, -1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUseCase_Description(), ecorePackage.getEString(),
				"description", null, 0, 1, UseCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUseCase_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(useCasesModelEClass, UseCasesModel.class, "UseCasesModel",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCasesModel_Packages(),
				this.getPackageDeclaration(), null, "packages", null, 0, -1,
				UseCasesModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucConditionEClass, UCCondition.class, "UCCondition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUCCondition_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, UCCondition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actorTypeEEnum, ActorType.class, "ActorType");
		addEEnumLiteral(actorTypeEEnum, ActorType.PERSON);
		addEEnumLiteral(actorTypeEEnum, ActorType.SYSTEM);
		addEEnumLiteral(actorTypeEEnum, ActorType.ORGANIZATION);

		initEEnum(stepTypeEEnum, StepType.class, "StepType");
		addEEnumLiteral(stepTypeEEnum, StepType.ALT);
		addEEnumLiteral(stepTypeEEnum, StepType.WAIT);
		addEEnumLiteral(stepTypeEEnum, StepType.SEND);
		addEEnumLiteral(stepTypeEEnum, StepType.PERFORM);
		addEEnumLiteral(stepTypeEEnum, StepType.CALL);

		// Create resource
		createResource(eNS_URI);
	}

} //UseCaseDSLPackageImpl
