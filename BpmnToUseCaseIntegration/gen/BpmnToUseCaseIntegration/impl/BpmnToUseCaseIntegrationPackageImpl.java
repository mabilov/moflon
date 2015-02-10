/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration;
import BpmnToUseCaseIntegration.DocumentRootToUseCasesModel;

import BpmnToUseCaseIntegration.Rules.RulesPackage;
import BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl;
import TGGLanguage.TGGLanguagePackage;
import TGGRuntime.TGGRuntimePackage;

import UseCaseDSL.UseCaseDSLPackage;

import bpmn2.Bpmn2Package;

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
public class BpmnToUseCaseIntegrationPackageImpl extends EPackageImpl implements
		BpmnToUseCaseIntegrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootToUseCasesModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsToPackageDeclarationEClass = null;

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
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnToUseCaseIntegrationPackageImpl() {
		super(eNS_URI, BpmnToUseCaseIntegrationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BpmnToUseCaseIntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BpmnToUseCaseIntegrationPackage init() {
		if (isInited)
			return (BpmnToUseCaseIntegrationPackage) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI);

		// Obtain or create and register package
		BpmnToUseCaseIntegrationPackageImpl theBpmnToUseCaseIntegrationPackage = (BpmnToUseCaseIntegrationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BpmnToUseCaseIntegrationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new BpmnToUseCaseIntegrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		UseCaseDSLPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Create package meta-data objects
		theBpmnToUseCaseIntegrationPackage.createPackageContents();
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theBpmnToUseCaseIntegrationPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmnToUseCaseIntegrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnToUseCaseIntegrationPackage.eNS_URI,
				theBpmnToUseCaseIntegrationPackage);
		return theBpmnToUseCaseIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRootToUseCasesModel() {
		return documentRootToUseCasesModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRootToUseCasesModel_Source() {
		return (EReference) documentRootToUseCasesModelEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRootToUseCasesModel_Target() {
		return (EReference) documentRootToUseCasesModelEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsToPackageDeclaration() {
		return definitionsToPackageDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsToPackageDeclaration_Source() {
		return (EReference) definitionsToPackageDeclarationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsToPackageDeclaration_Target() {
		return (EReference) definitionsToPackageDeclarationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationFactory getBpmnToUseCaseIntegrationFactory() {
		return (BpmnToUseCaseIntegrationFactory) getEFactoryInstance();
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
		documentRootToUseCasesModelEClass = createEClass(DOCUMENT_ROOT_TO_USE_CASES_MODEL);
		createEReference(documentRootToUseCasesModelEClass,
				DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE);
		createEReference(documentRootToUseCasesModelEClass,
				DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET);

		definitionsToPackageDeclarationEClass = createEClass(DEFINITIONS_TO_PACKAGE_DECLARATION);
		createEReference(definitionsToPackageDeclarationEClass,
				DEFINITIONS_TO_PACKAGE_DECLARATION__SOURCE);
		createEReference(definitionsToPackageDeclarationEClass,
				DEFINITIONS_TO_PACKAGE_DECLARATION__TARGET);
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
		Bpmn2Package theBpmn2Package = (Bpmn2Package) EPackage.Registry.INSTANCE
				.getEPackage(Bpmn2Package.eNS_URI);
		UseCaseDSLPackage theUseCaseDSLPackage = (UseCaseDSLPackage) EPackage.Registry.INSTANCE
				.getEPackage(UseCaseDSLPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRulesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentRootToUseCasesModelEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());
		definitionsToPackageDeclarationEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootToUseCasesModelEClass,
				DocumentRootToUseCasesModel.class,
				"DocumentRootToUseCasesModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRootToUseCasesModel_Source(),
				theBpmn2Package.getDocumentRoot(), null, "source", null, 1, 1,
				DocumentRootToUseCasesModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRootToUseCasesModel_Target(),
				theUseCaseDSLPackage.getUseCasesModel(), null, "target", null,
				1, 1, DocumentRootToUseCasesModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionsToPackageDeclarationEClass,
				DefinitionsToPackageDeclaration.class,
				"DefinitionsToPackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionsToPackageDeclaration_Source(),
				theBpmn2Package.getDefinitions(), null, "source", null, 1, 1,
				DefinitionsToPackageDeclaration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionsToPackageDeclaration_Target(),
				theUseCaseDSLPackage.getPackageDeclaration(), null, "target",
				null, 1, 1, DefinitionsToPackageDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BpmnToUseCaseIntegrationPackageImpl
