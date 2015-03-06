/**
 */
package UseCaseToModalSequenceDiagramIntegration.impl;

import ModalSequenceDiagram.ModalSequenceDiagramPackage;

import TGGLanguage.TGGLanguagePackage;

import TGGRuntime.TGGRuntimePackage;

import UseCaseDSL.UseCaseDSLPackage;

import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToCollaboration;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;
import UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseToModalSequenceDiagramIntegrationPackageImpl extends
		EPackageImpl implements UseCaseToModalSequenceDiagramIntegrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCasesModelToModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDeclarationToPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseToCollaborationEClass = null;

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
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UseCaseToModalSequenceDiagramIntegrationPackageImpl() {
		super(eNS_URI,
				UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UseCaseToModalSequenceDiagramIntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UseCaseToModalSequenceDiagramIntegrationPackage init() {
		if (isInited)
			return (UseCaseToModalSequenceDiagramIntegrationPackage) EPackage.Registry.INSTANCE
					.getEPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI);

		// Obtain or create and register package
		UseCaseToModalSequenceDiagramIntegrationPackageImpl theUseCaseToModalSequenceDiagramIntegrationPackage = (UseCaseToModalSequenceDiagramIntegrationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UseCaseToModalSequenceDiagramIntegrationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new UseCaseToModalSequenceDiagramIntegrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UseCaseDSLPackage.eINSTANCE.eClass();
		ModalSequenceDiagramPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Create package meta-data objects
		theUseCaseToModalSequenceDiagramIntegrationPackage
				.createPackageContents();
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theUseCaseToModalSequenceDiagramIntegrationPackage
				.initializePackageContents();
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUseCaseToModalSequenceDiagramIntegrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(
				UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI,
				theUseCaseToModalSequenceDiagramIntegrationPackage);
		return theUseCaseToModalSequenceDiagramIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCasesModelToModel() {
		return useCasesModelToModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCasesModelToModel_Source() {
		return (EReference) useCasesModelToModelEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCasesModelToModel_Target() {
		return (EReference) useCasesModelToModelEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDeclarationToPackage() {
		return packageDeclarationToPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclarationToPackage_Source() {
		return (EReference) packageDeclarationToPackageEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclarationToPackage_Target() {
		return (EReference) packageDeclarationToPackageEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseToCollaboration() {
		return useCaseToCollaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseToCollaboration_Source() {
		return (EReference) useCaseToCollaborationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseToCollaboration_Target() {
		return (EReference) useCaseToCollaborationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationFactory getUseCaseToModalSequenceDiagramIntegrationFactory() {
		return (UseCaseToModalSequenceDiagramIntegrationFactory) getEFactoryInstance();
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
		useCasesModelToModelEClass = createEClass(USE_CASES_MODEL_TO_MODEL);
		createEReference(useCasesModelToModelEClass,
				USE_CASES_MODEL_TO_MODEL__SOURCE);
		createEReference(useCasesModelToModelEClass,
				USE_CASES_MODEL_TO_MODEL__TARGET);

		packageDeclarationToPackageEClass = createEClass(PACKAGE_DECLARATION_TO_PACKAGE);
		createEReference(packageDeclarationToPackageEClass,
				PACKAGE_DECLARATION_TO_PACKAGE__SOURCE);
		createEReference(packageDeclarationToPackageEClass,
				PACKAGE_DECLARATION_TO_PACKAGE__TARGET);

		useCaseToCollaborationEClass = createEClass(USE_CASE_TO_COLLABORATION);
		createEReference(useCaseToCollaborationEClass,
				USE_CASE_TO_COLLABORATION__SOURCE);
		createEReference(useCaseToCollaborationEClass,
				USE_CASE_TO_COLLABORATION__TARGET);
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

		// Obtain other dependent packages
		RulesPackage theRulesPackage = (RulesPackage) EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI);
		TGGRuntimePackage theTGGRuntimePackage = (TGGRuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(TGGRuntimePackage.eNS_URI);
		UseCaseDSLPackage theUseCaseDSLPackage = (UseCaseDSLPackage) EPackage.Registry.INSTANCE
				.getEPackage(UseCaseDSLPackage.eNS_URI);
		ModalSequenceDiagramPackage theModalSequenceDiagramPackage = (ModalSequenceDiagramPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModalSequenceDiagramPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRulesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		useCasesModelToModelEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());
		packageDeclarationToPackageEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());
		useCaseToCollaborationEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(useCasesModelToModelEClass, UseCasesModelToModel.class,
				"UseCasesModelToModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCasesModelToModel_Source(),
				theUseCaseDSLPackage.getUseCasesModel(), null, "source", null,
				1, 1, UseCasesModelToModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCasesModelToModel_Target(),
				theModalSequenceDiagramPackage.getModel(), null, "target",
				null, 1, 1, UseCasesModelToModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageDeclarationToPackageEClass,
				PackageDeclarationToPackage.class,
				"PackageDeclarationToPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageDeclarationToPackage_Source(),
				theUseCaseDSLPackage.getPackageDeclaration(), null, "source",
				null, 1, 1, PackageDeclarationToPackage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageDeclarationToPackage_Target(),
				theModalSequenceDiagramPackage.getPackage(), null, "target",
				null, 1, 1, PackageDeclarationToPackage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseToCollaborationEClass, UseCaseToCollaboration.class,
				"UseCaseToCollaboration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCaseToCollaboration_Source(),
				theUseCaseDSLPackage.getUseCase(), null, "source", null, 1, 1,
				UseCaseToCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCaseToCollaboration_Target(),
				theModalSequenceDiagramPackage.getCollaboration(), null,
				"target", null, 1, 1, UseCaseToCollaboration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UseCaseToModalSequenceDiagramIntegrationPackageImpl
