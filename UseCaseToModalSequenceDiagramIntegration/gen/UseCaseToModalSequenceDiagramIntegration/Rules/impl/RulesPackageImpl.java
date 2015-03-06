/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.ModalSequenceDiagramPackage;

import TGGLanguage.TGGLanguagePackage;

import TGGLanguage.csp.CspPackage;

import TGGLanguage.modelgenerator.ModelgeneratorPackage;

import TGGRuntime.TGGRuntimePackage;

import UseCaseDSL.UseCaseDSLPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesFactory;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule;
import UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToCollaborationRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;

import UseCaseToModalSequenceDiagramIntegration.impl.UseCaseToModalSequenceDiagramIntegrationPackageImpl;

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
	private EClass ucModelToMSDModelRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucPackageToMSDPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseToCollaborationRuleEClass = null;

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
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage#eNS_URI
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
		UseCaseDSLPackage.eINSTANCE.eClass();
		ModalSequenceDiagramPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UseCaseToModalSequenceDiagramIntegrationPackageImpl theUseCaseToModalSequenceDiagramIntegrationPackage = (UseCaseToModalSequenceDiagramIntegrationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI) instanceof UseCaseToModalSequenceDiagramIntegrationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
				: UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theUseCaseToModalSequenceDiagramIntegrationPackage
				.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theUseCaseToModalSequenceDiagramIntegrationPackage
				.initializePackageContents();

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
	public EClass getUCModelToMSDModelRule() {
		return ucModelToMSDModelRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_FWD__Match_UseCasesModel() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_FWD__Match() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__Perform_FWD__IsApplicableMatch() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjectsToMatch_FWD__Match_UseCasesModel() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_solveCsp_FWD__Match_UseCasesModel() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_checkCsp_FWD__CSP() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_checkCsp_FWD__CSP() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckTypes_FWD__Match() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_BWD__Match_Model() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_BWD__Match() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__Perform_BWD__IsApplicableMatch() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjectsToMatch_BWD__Match_Model() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_solveCsp_BWD__Match_Model() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_checkCsp_BWD__CSP() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_checkCsp_BWD__CSP() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckTypes_BWD__Match() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_2__UseCasesModel() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_2__Model() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckAttributes_FWD__TripleMatch() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckAttributes_BWD__TripleMatch() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__GenerateModel__RuleEntryContainer() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_ModelgeneratorRuleResult() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__GenerateModel_checkCsp_BWD__CSP() {
		return ucModelToMSDModelRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCPackageToMSDPackage() {
		return ucPackageToMSDPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_FWD__Match_UseCasesModel_PackageDeclaration() {
		return ucPackageToMSDPackageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_FWD__Match() {
		return ucPackageToMSDPackageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__Perform_FWD__IsApplicableMatch() {
		return ucPackageToMSDPackageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjectsToMatch_FWD__Match_UseCasesModel_PackageDeclaration() {
		return ucPackageToMSDPackageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_solveCsp_FWD__Match_UseCasesModel_PackageDeclaration() {
		return ucPackageToMSDPackageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return ucPackageToMSDPackageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration() {
		return ucPackageToMSDPackageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_checkCsp_FWD__CSP() {
		return ucPackageToMSDPackageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return ucPackageToMSDPackageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckTypes_FWD__Match() {
		return ucPackageToMSDPackageEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_BWD__Match_Model_Package() {
		return ucPackageToMSDPackageEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_BWD__Match() {
		return ucPackageToMSDPackageEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__Perform_BWD__IsApplicableMatch() {
		return ucPackageToMSDPackageEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjectsToMatch_BWD__Match_Model_Package() {
		return ucPackageToMSDPackageEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_solveCsp_BWD__Match_Model_Package() {
		return ucPackageToMSDPackageEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return ucPackageToMSDPackageEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_Package() {
		return ucPackageToMSDPackageEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_checkCsp_BWD__CSP() {
		return ucPackageToMSDPackageEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return ucPackageToMSDPackageEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckTypes_BWD__Match() {
		return ucPackageToMSDPackageEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return ucPackageToMSDPackageEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return ucPackageToMSDPackageEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckAttributes_FWD__TripleMatch() {
		return ucPackageToMSDPackageEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckAttributes_BWD__TripleMatch() {
		return ucPackageToMSDPackageEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__GenerateModel__RuleEntryContainer_UseCasesModelToModel() {
		return ucPackageToMSDPackageEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration_Package_PackageDeclarationToPackage_ModelgeneratorRuleResult() {
		return ucPackageToMSDPackageEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__GenerateModel_checkCsp_BWD__CSP() {
		return ucPackageToMSDPackageEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseToCollaborationRule() {
		return useCaseToCollaborationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_FWD__Match_PackageDeclaration_UseCase() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsApplicable_FWD__Match() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__Perform_FWD__IsApplicableMatch() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_UseCase() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_UseCase() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_checkCsp_FWD__CSP() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsApplicable_checkCsp_FWD__CSP() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__CheckTypes_FWD__Match() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_BWD__Match_Package_Collaboration() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsApplicable_BWD__Match() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__Perform_BWD__IsApplicableMatch() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__RegisterObjectsToMatch_BWD__Match_Package_Collaboration() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_solveCsp_BWD__Match_Package_Collaboration() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_checkCsp_BWD__CSP() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Collaboration() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsApplicable_checkCsp_BWD__CSP() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__CheckTypes_BWD__Match() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__CheckAttributes_FWD__TripleMatch() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__CheckAttributes_BWD__TripleMatch() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__GenerateModel__RuleEntryContainer_PackageDeclarationToPackage() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_Collaboration_UseCaseToCollaboration_ModelgeneratorRuleResult() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToCollaborationRule__GenerateModel_checkCsp_BWD__CSP() {
		return useCaseToCollaborationRuleEClass.getEOperations().get(26);
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
		ucModelToMSDModelRuleEClass = createEClass(UC_MODEL_TO_MSD_MODEL_RULE);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_MODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(
				ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_2__USECASESMODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_2__MODEL);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(
				ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_MODELGENERATORRULERESULT);
		createEOperation(ucModelToMSDModelRuleEClass,
				UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		ucPackageToMSDPackageEClass = createEClass(UC_PACKAGE_TO_MSD_PACKAGE);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGEDECLARATION);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_FWD__MATCH);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD__MATCH_MODEL_PACKAGE);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_PACKAGE);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_PACKAGE);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGE);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_BWD__MATCH);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASESMODELTOMODEL);
		createEOperation(
				ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_MODELGENERATORRULERESULT);
		createEOperation(ucPackageToMSDPackageEClass,
				UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		useCaseToCollaborationRuleEClass = createEClass(USE_CASE_TO_COLLABORATION_RULE);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_COLLABORATION);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_COLLABORATION);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_COLLABORATION);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_COLLABORATION);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE);
		createEOperation(
				useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_COLLABORATION_USECASETOCOLLABORATION_MODELGENERATORRULERESULT);
		createEOperation(useCaseToCollaborationRuleEClass,
				USE_CASE_TO_COLLABORATION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
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
		UseCaseDSLPackage theUseCaseDSLPackage = (UseCaseDSLPackage) EPackage.Registry.INSTANCE
				.getEPackage(UseCaseDSLPackage.eNS_URI);
		CspPackage theCspPackage = (CspPackage) EPackage.Registry.INSTANCE
				.getEPackage(CspPackage.eNS_URI);
		ModalSequenceDiagramPackage theModalSequenceDiagramPackage = (ModalSequenceDiagramPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModalSequenceDiagramPackage.eNS_URI);
		ModelgeneratorPackage theModelgeneratorPackage = (ModelgeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelgeneratorPackage.eNS_URI);
		UseCaseToModalSequenceDiagramIntegrationPackage theUseCaseToModalSequenceDiagramIntegrationPackage = (UseCaseToModalSequenceDiagramIntegrationPackage) EPackage.Registry.INSTANCE
				.getEPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ucModelToMSDModelRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		ucPackageToMSDPackageEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		useCaseToCollaborationRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(ucModelToMSDModelRuleEClass, UCModelToMSDModelRule.class,
				"UCModelToMSDModelRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_FWD__Match_UseCasesModel(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__RegisterObjectsToMatch_FWD__Match_UseCasesModel(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_solveCsp_FWD__Match_UseCasesModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUCModelToMSDModelRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_BWD__Match_Model(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__RegisterObjectsToMatch_BWD__Match_Model(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_solveCsp_BWD__Match_Model(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUCModelToMSDModelRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_2__UseCasesModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_UseCasesModel_2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__IsAppropriate_BWD_Model_2__Model(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_Model_2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__GenerateModel__RuleEntryContainer(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getUseCasesModelToModel(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCModelToMSDModelRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(ucPackageToMSDPackageEClass, UCPackageToMSDPackage.class,
				"UCPackageToMSDPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_FWD__Match_UseCasesModel_PackageDeclaration(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__RegisterObjectsToMatch_FWD__Match_UseCasesModel_PackageDeclaration(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_solveCsp_FWD__Match_UseCasesModel_PackageDeclaration(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getUseCasesModelToModel(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "packageDeclaration", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "p", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUCPackageToMSDPackage__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_BWD__Match_Model_Package(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(), "p", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__RegisterObjectsToMatch_BWD__Match_Model_Package(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(), "p", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_solveCsp_BWD__Match_Model_Package(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(), "p", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_Package(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getUseCasesModelToModel(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(), "p", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModel", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "packageDeclaration", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "p", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUCPackageToMSDPackage__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_packages", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_packagedElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__GenerateModel__RuleEntryContainer_UseCasesModelToModel(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getUseCasesModelToModel(),
				"useCasesModelToModelDummyParameter", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration_Package_PackageDeclarationToPackage_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCasesModel(),
				"useCasesModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getModel(), "model",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getUseCasesModelToModel(), "useCasesModelToModel", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(), "p", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getPackageDeclarationToPackage(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUCPackageToMSDPackage__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(useCaseToCollaborationRuleEClass,
				UseCaseToCollaborationRule.class, "UseCaseToCollaborationRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_FWD__Match_PackageDeclaration_UseCase(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCase(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_UseCase(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCase(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_UseCase(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCase(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(),
				"_package", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getPackageDeclarationToPackage(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCase(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "packageDeclaration", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "_package", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "collaboration", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCaseToCollaboration",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_BWD__Match_Package_Collaboration(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(),
				"_package", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getCollaboration(),
				"collaboration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__RegisterObjectsToMatch_BWD__Match_Package_Collaboration(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(),
				"_package", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getCollaboration(),
				"collaboration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_solveCsp_BWD__Match_Package_Collaboration(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(),
				"_package", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getCollaboration(),
				"collaboration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Collaboration(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(),
				"_package", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getPackageDeclarationToPackage(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getCollaboration(),
				"collaboration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "packageDeclaration", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "_package", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "collaboration", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "useCaseToCollaboration",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_5", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_useCases", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_5", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_packagedElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__GenerateModel__RuleEntryContainer_PackageDeclarationToPackage(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getPackageDeclarationToPackage(),
				"packageDeclarationToPackageDummyParameter", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_Collaboration_UseCaseToCollaboration_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getPackageDeclaration(),
				"packageDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getPackage(),
				"_package", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getPackageDeclarationToPackage(),
				"packageDeclarationToPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUseCaseDSLPackage.getUseCase(), "useCase", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModalSequenceDiagramPackage.getCollaboration(),
				"collaboration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theUseCaseToModalSequenceDiagramIntegrationPackage
						.getUseCaseToCollaboration(), "useCaseToCollaboration",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getUseCaseToCollaborationRule__GenerateModel_checkCsp_BWD__CSP(),
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
		addAnnotation(ucModelToMSDModelRuleEClass, source, new String[] {});
		addAnnotation(ucPackageToMSDPackageEClass, source, new String[] {});
		addAnnotation(useCaseToCollaborationRuleEClass, source, new String[] {});
	}

} //RulesPackageImpl
