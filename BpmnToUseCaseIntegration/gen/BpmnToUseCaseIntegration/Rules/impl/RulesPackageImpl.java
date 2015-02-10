/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;

import BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule;
import BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule;
import BpmnToUseCaseIntegration.Rules.RulesFactory;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import TGGLanguage.csp.CspPackage;

import TGGLanguage.modelgenerator.ModelgeneratorPackage;

import TGGRuntime.TGGRuntimePackage;

import UseCaseDSL.UseCaseDSLPackage;

import bpmn2.Bpmn2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModelToUseCaseModelRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsToPackageRuleEClass = null;

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
	 * @see BpmnToUseCaseIntegration.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		UseCaseDSLPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BpmnToUseCaseIntegrationPackageImpl theBpmnToUseCaseIntegrationPackage = (BpmnToUseCaseIntegrationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI) instanceof BpmnToUseCaseIntegrationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
				: BpmnToUseCaseIntegrationPackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theBpmnToUseCaseIntegrationPackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theBpmnToUseCaseIntegrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpModelToUseCaseModelRule() {
		return bpModelToUseCaseModelRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD__Match_DocumentRoot() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__Perform_FWD__IsApplicableMatch() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_FWD__Match() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjectsToMatch_FWD__Match_DocumentRoot() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_FWD__Match_DocumentRoot() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_FWD__CSP() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_DocumentRoot() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_checkCsp_FWD__CSP() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckTypes_FWD__Match() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD__Match_UseCasesModel() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__Perform_BWD__IsApplicableMatch() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_BWD__Match() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjectsToMatch_BWD__Match_UseCasesModel() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_BWD__Match_UseCasesModel() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_BWD__CSP() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_checkCsp_BWD__CSP() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckTypes_BWD__Match() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD_DocumentRoot_0__DocumentRoot() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD_UseCasesModel_0__UseCasesModel() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckAttributes_FWD__TripleMatch() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckAttributes_BWD__TripleMatch() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__GenerateModel__RuleEntryContainer() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__GenerateModel_checkCsp_BWD__CSP() {
		return bpModelToUseCaseModelRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsToPackageRule() {
		return definitionsToPackageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_FWD__Match_Definitions_DocumentRoot() {
		return definitionsToPackageRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__Perform_FWD__IsApplicableMatch() {
		return definitionsToPackageRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_FWD__Match() {
		return definitionsToPackageRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjectsToMatch_FWD__Match_Definitions_DocumentRoot() {
		return definitionsToPackageRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_solveCsp_FWD__Match_Definitions_DocumentRoot() {
		return definitionsToPackageRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return definitionsToPackageRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel() {
		return definitionsToPackageRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_checkCsp_FWD__CSP() {
		return definitionsToPackageRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return definitionsToPackageRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckTypes_FWD__Match() {
		return definitionsToPackageRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCasesModel() {
		return definitionsToPackageRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__Perform_BWD__IsApplicableMatch() {
		return definitionsToPackageRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_BWD__Match() {
		return definitionsToPackageRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCasesModel() {
		return definitionsToPackageRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCasesModel() {
		return definitionsToPackageRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return definitionsToPackageRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel() {
		return definitionsToPackageRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_checkCsp_BWD__CSP() {
		return definitionsToPackageRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return definitionsToPackageRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckTypes_BWD__Match() {
		return definitionsToPackageRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return definitionsToPackageRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return definitionsToPackageRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckAttributes_FWD__TripleMatch() {
		return definitionsToPackageRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckAttributes_BWD__TripleMatch() {
		return definitionsToPackageRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel__RuleEntryContainer_DocumentRootToUseCasesModel() {
		return definitionsToPackageRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult() {
		return definitionsToPackageRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel_checkCsp_BWD__CSP() {
		return definitionsToPackageRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
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
		bpModelToUseCaseModelRuleEClass = createEClass(BP_MODEL_TO_USE_CASE_MODEL_RULE);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_DOCUMENTROOT);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DOCUMENTROOT);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DOCUMENTROOT);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DOCUMENTROOT);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_USECASESMODEL);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASESMODEL);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASESMODEL);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD_DOCUMENT_ROOT_0__DOCUMENTROOT);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD_USE_CASES_MODEL_0__USECASESMODEL);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(
				bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL_MODELGENERATORRULERESULT);
		createEOperation(bpModelToUseCaseModelRuleEClass,
				BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		definitionsToPackageRuleEClass = createEClass(DEFINITIONS_TO_PACKAGE_RULE);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_DOCUMENTROOT);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_DOCUMENTROOT);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_DOCUMENTROOT);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DOCUMENTROOTTOUSECASESMODEL);
		createEOperation(
				definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL_MODELGENERATORRULERESULT);
		createEOperation(definitionsToPackageRuleEClass,
				DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
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
		TGGRuntimePackage theTGGRuntimePackage = (TGGRuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(TGGRuntimePackage.eNS_URI);
		Bpmn2Package theBpmn2Package = (Bpmn2Package) EPackage.Registry.INSTANCE
				.getEPackage(Bpmn2Package.eNS_URI);
		CspPackage theCspPackage = (CspPackage) EPackage.Registry.INSTANCE
				.getEPackage(CspPackage.eNS_URI);
		UseCaseDSLPackage theUseCaseDSLPackage = (UseCaseDSLPackage) EPackage.Registry.INSTANCE
				.getEPackage(UseCaseDSLPackage.eNS_URI);
		ModelgeneratorPackage theModelgeneratorPackage = (ModelgeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelgeneratorPackage.eNS_URI);
		BpmnToUseCaseIntegrationPackage theBpmnToUseCaseIntegrationPackage = (BpmnToUseCaseIntegrationPackage) EPackage.Registry.INSTANCE
				.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bpModelToUseCaseModelRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		definitionsToPackageRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(bpModelToUseCaseModelRuleEClass,
				BpModelToUseCaseModelRule.class, "BpModelToUseCaseModelRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_FWD__Match_DocumentRoot(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__RegisterObjectsToMatch_FWD__Match_DocumentRoot(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_FWD__Match_DocumentRoot(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_DocumentRoot(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "documentRoot", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_BWD__Match_UseCasesModel(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__RegisterObjectsToMatch_BWD__Match_UseCasesModel(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_BWD__Match_UseCasesModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "documentRoot", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_FWD_DocumentRoot_0__DocumentRoot(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_DocumentRoot_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__IsAppropriate_BWD_UseCasesModel_0__UseCasesModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_UseCasesModel_0", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__GenerateModel__RuleEntryContainer(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theBpmnToUseCaseIntegrationPackage
						.getDocumentRootToUseCasesModel(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getBpModelToUseCaseModelRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(definitionsToPackageRuleEClass,
				DefinitionsToPackageRule.class, "DefinitionsToPackageRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_FWD__Match_Definitions_DocumentRoot(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDefinitions(), "definitions", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__RegisterObjectsToMatch_FWD__Match_Definitions_DocumentRoot(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDefinitions(), "definitions", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_solveCsp_FWD__Match_Definitions_DocumentRoot(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDefinitions(), "definitions", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDefinitions(), "definitions", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theBpmnToUseCaseIntegrationPackage
						.getDocumentRootToUseCasesModel(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "definitions", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "packageDeclaration", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"definitionsToPackageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "documentRoot", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCasesModel(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCasesModel(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCasesModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theBpmnToUseCaseIntegrationPackage
						.getDocumentRootToUseCasesModel(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "definitions", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "packageDeclaration", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"definitionsToPackageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "documentRoot", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_definitions", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_packages", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__GenerateModel__RuleEntryContainer_DocumentRootToUseCasesModel(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theBpmnToUseCaseIntegrationPackage
						.getDocumentRootToUseCasesModel(),
				"documentRootToUseCasesModelDummyParameter", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDefinitions(), "definitions", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theBpmnToUseCaseIntegrationPackage
						.getDefinitionsToPackageDeclaration(),
				"definitionsToPackageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBpmn2Package.getDocumentRoot(), "documentRoot", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theBpmnToUseCaseIntegrationPackage
						.getDocumentRootToUseCasesModel(),
				"documentRootToUseCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getDefinitionsToPackageRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Create annotations
		// TGGRule
		createTGGRuleAnnotations();
	}

	/**
	 * Initializes the annotations for <b>TGGRule</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTGGRuleAnnotations() {
		String source = "TGGRule";
		addAnnotation(bpModelToUseCaseModelRuleEClass, source, new String[] {});
		addAnnotation(definitionsToPackageRuleEClass, source, new String[] {});
	}

} //RulesPackageImpl
