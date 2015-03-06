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
import org.eclipse.emf.ecore.EClassifier;
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
	private EClass useCaseToInteractionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorToClassRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepBasicFlowToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepNamedFlowToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepToCombinedFragmentRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepAltToOperandRuleEClass = null;

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

		// Load packages
		theUseCaseToModalSequenceDiagramIntegrationPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theUseCaseToModalSequenceDiagramIntegrationPackage.fixPackageContents();

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
		if (ucModelToMSDModelRuleEClass == null) {
			ucModelToMSDModelRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return ucModelToMSDModelRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_FWD__Match_UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_FWD__Match() {
		return getUCModelToMSDModelRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__Perform_FWD__IsApplicableMatch() {
		return getUCModelToMSDModelRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjectsToMatch_FWD__Match_UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_solveCsp_FWD__Match_UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUCModelToMSDModelRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUCModelToMSDModelRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getUCModelToMSDModelRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckTypes_FWD__Match() {
		return getUCModelToMSDModelRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_BWD__Match_Model() {
		return getUCModelToMSDModelRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_BWD__Match() {
		return getUCModelToMSDModelRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__Perform_BWD__IsApplicableMatch() {
		return getUCModelToMSDModelRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjectsToMatch_BWD__Match_Model() {
		return getUCModelToMSDModelRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_solveCsp_BWD__Match_Model() {
		return getUCModelToMSDModelRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUCModelToMSDModelRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model() {
		return getUCModelToMSDModelRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUCModelToMSDModelRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getUCModelToMSDModelRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckTypes_BWD__Match() {
		return getUCModelToMSDModelRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_0__UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_0__Model() {
		return getUCModelToMSDModelRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckAttributes_FWD__TripleMatch() {
		return getUCModelToMSDModelRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__CheckAttributes_BWD__TripleMatch() {
		return getUCModelToMSDModelRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__GenerateModel__RuleEntryContainer() {
		return getUCModelToMSDModelRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_ModelgeneratorRuleResult() {
		return getUCModelToMSDModelRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUCModelToMSDModelRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCPackageToMSDPackage() {
		if (ucPackageToMSDPackageEClass == null) {
			ucPackageToMSDPackageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return ucPackageToMSDPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_FWD__Match_UseCasesModel_PackageDeclaration() {
		return getUCPackageToMSDPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_FWD__Match() {
		return getUCPackageToMSDPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__Perform_FWD__IsApplicableMatch() {
		return getUCPackageToMSDPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjectsToMatch_FWD__Match_UseCasesModel_PackageDeclaration() {
		return getUCPackageToMSDPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_solveCsp_FWD__Match_UseCasesModel_PackageDeclaration() {
		return getUCPackageToMSDPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getUCPackageToMSDPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration() {
		return getUCPackageToMSDPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getUCPackageToMSDPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUCPackageToMSDPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckTypes_FWD__Match() {
		return getUCPackageToMSDPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_BWD__Match_Model_Package() {
		return getUCPackageToMSDPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_BWD__Match() {
		return getUCPackageToMSDPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__Perform_BWD__IsApplicableMatch() {
		return getUCPackageToMSDPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjectsToMatch_BWD__Match_Model_Package() {
		return getUCPackageToMSDPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_solveCsp_BWD__Match_Model_Package() {
		return getUCPackageToMSDPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getUCPackageToMSDPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_Package() {
		return getUCPackageToMSDPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getUCPackageToMSDPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUCPackageToMSDPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckTypes_BWD__Match() {
		return getUCPackageToMSDPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getUCPackageToMSDPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getUCPackageToMSDPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckAttributes_FWD__TripleMatch() {
		return getUCPackageToMSDPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__CheckAttributes_BWD__TripleMatch() {
		return getUCPackageToMSDPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__GenerateModel__RuleEntryContainer_UseCasesModelToModel() {
		return getUCPackageToMSDPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration_Package_PackageDeclarationToPackage_ModelgeneratorRuleResult() {
		return getUCPackageToMSDPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getUCPackageToMSDPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseToInteractionRule() {
		if (useCaseToInteractionRuleEClass == null) {
			useCaseToInteractionRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return useCaseToInteractionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_FWD__Match_PackageDeclaration_UseCase_BasicFlow() {
		return getUseCaseToInteractionRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_FWD__Match() {
		return getUseCaseToInteractionRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__Perform_FWD__IsApplicableMatch() {
		return getUseCaseToInteractionRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_UseCase_BasicFlow() {
		return getUseCaseToInteractionRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_UseCase_BasicFlow() {
		return getUseCaseToInteractionRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUseCaseToInteractionRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_BasicFlow() {
		return getUseCaseToInteractionRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUseCaseToInteractionRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUseCaseToInteractionRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__CheckTypes_FWD__Match() {
		return getUseCaseToInteractionRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_BWD__Match_Package_Interaction() {
		return getUseCaseToInteractionRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_BWD__Match() {
		return getUseCaseToInteractionRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__Perform_BWD__IsApplicableMatch() {
		return getUseCaseToInteractionRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__RegisterObjectsToMatch_BWD__Match_Package_Interaction() {
		return getUseCaseToInteractionRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_solveCsp_BWD__Match_Package_Interaction() {
		return getUseCaseToInteractionRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUseCaseToInteractionRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Interaction() {
		return getUseCaseToInteractionRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUseCaseToInteractionRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUseCaseToInteractionRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__CheckTypes_BWD__Match() {
		return getUseCaseToInteractionRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getUseCaseToInteractionRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getUseCaseToInteractionRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getUseCaseToInteractionRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__CheckAttributes_FWD__TripleMatch() {
		return getUseCaseToInteractionRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__CheckAttributes_BWD__TripleMatch() {
		return getUseCaseToInteractionRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__GenerateModel__RuleEntryContainer_PackageDeclarationToPackage() {
		return getUseCaseToInteractionRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_Interaction_UseCaseToInteraction_BasicFlow_FlowToInteractionFragment_ModelgeneratorRuleResult() {
		return getUseCaseToInteractionRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUseCaseToInteractionRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorToClassRule() {
		if (actorToClassRuleEClass == null) {
			actorToClassRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return actorToClassRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor() {
		return getActorToClassRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsApplicable_FWD__Match() {
		return getActorToClassRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__Perform_FWD__IsApplicableMatch() {
		return getActorToClassRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor() {
		return getActorToClassRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor() {
		return getActorToClassRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getActorToClassRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Actor_Interaction() {
		return getActorToClassRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsApplicable_checkCsp_FWD__CSP() {
		return getActorToClassRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getActorToClassRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__CheckTypes_FWD__Match() {
		return getActorToClassRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_BWD__Match_Package_Lifeline_Interaction() {
		return getActorToClassRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsApplicable_BWD__Match() {
		return getActorToClassRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__Perform_BWD__IsApplicableMatch() {
		return getActorToClassRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__RegisterObjectsToMatch_BWD__Match_Package_Lifeline_Interaction() {
		return getActorToClassRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_solveCsp_BWD__Match_Package_Lifeline_Interaction() {
		return getActorToClassRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getActorToClassRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_Interaction() {
		return getActorToClassRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsApplicable_checkCsp_BWD__CSP() {
		return getActorToClassRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getActorToClassRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__CheckTypes_BWD__Match() {
		return getActorToClassRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getActorToClassRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getActorToClassRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getActorToClassRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__CheckAttributes_FWD__TripleMatch() {
		return getActorToClassRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__CheckAttributes_BWD__TripleMatch() {
		return getActorToClassRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__GenerateModel__RuleEntryContainer_PackageDeclarationToPackage() {
		return getActorToClassRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Actor_Lifeline_ActorToLifeline_Interaction_ModelgeneratorRuleResult() {
		return getActorToClassRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToClassRule__GenerateModel_checkCsp_BWD__CSP() {
		return getActorToClassRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepToMessageRule() {
		if (normalStepToMessageRuleEClass == null) {
			normalStepToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return normalStepToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_FWD__Match_UseCase_Flow_NormalStep_Actor() {
		return getNormalStepToMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsApplicable_FWD__Match() {
		return getNormalStepToMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__Perform_FWD__IsApplicableMatch() {
		return getNormalStepToMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__RegisterObjectsToMatch_FWD__Match_UseCase_Flow_NormalStep_Actor() {
		return getNormalStepToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Flow_NormalStep_Actor() {
		return getNormalStepToMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getNormalStepToMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_UseCaseToInteraction_Flow_NormalStep_Interaction_Lifeline_Actor_ActorToLifeline() {
		return getNormalStepToMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getNormalStepToMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNormalStepToMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__CheckTypes_FWD__Match() {
		return getNormalStepToMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline() {
		return getNormalStepToMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsApplicable_BWD__Match() {
		return getNormalStepToMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__Perform_BWD__IsApplicableMatch() {
		return getNormalStepToMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__RegisterObjectsToMatch_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline() {
		return getNormalStepToMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline() {
		return getNormalStepToMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getNormalStepToMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_UseCaseToInteraction_Flow_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline_Actor_ActorToLifeline() {
		return getNormalStepToMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getNormalStepToMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNormalStepToMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__CheckTypes_BWD__Match() {
		return getNormalStepToMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge() {
		return getNormalStepToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getNormalStepToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getNormalStepToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getNormalStepToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_UseCaseToInteraction_Flow_NormalStep_Message_Interaction_NormalStepToMessage_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline_Actor_ActorToLifeline_ModelgeneratorRuleResult() {
		return getNormalStepToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepToMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getNormalStepToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepBasicFlowToMessageRule() {
		if (normalStepBasicFlowToMessageRuleEClass == null) {
			normalStepBasicFlowToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return normalStepBasicFlowToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_FWD__Match_BasicFlow_UseCase_NormalStep_Actor() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_FWD__Match() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__Perform_FWD__IsApplicableMatch() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__RegisterObjectsToMatch_FWD__Match_BasicFlow_UseCase_NormalStep_Actor() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_solveCsp_FWD__Match_BasicFlow_UseCase_NormalStep_Actor() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Lifeline_Actor_ActorToLifeline() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__CheckTypes_FWD__Match() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD__Match_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Lifeline() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_BWD__Match() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__Perform_BWD__IsApplicableMatch() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__RegisterObjectsToMatch_BWD__Match_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Lifeline() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_solveCsp_BWD__Match_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Lifeline() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Message_Lifeline_Actor_ActorToLifeline() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__CheckTypes_BWD__Match() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Message_NormalStepToMessage_Lifeline_Actor_ActorToLifeline_ModelgeneratorRuleResult() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepBasicFlowToMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getNormalStepBasicFlowToMessageRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepNamedFlowToMessageRule() {
		if (normalStepNamedFlowToMessageRuleEClass == null) {
			normalStepNamedFlowToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return normalStepNamedFlowToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_FWD__Match_NamedFlow_UseCase_NormalStep_Actor() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_FWD__Match() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__Perform_FWD__IsApplicableMatch() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__RegisterObjectsToMatch_FWD__Match_NamedFlow_UseCase_NormalStep_Actor() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_solveCsp_FWD__Match_NamedFlow_UseCase_NormalStep_Actor() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_InteractionOperand_NamedFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Interaction_Lifeline_Actor_ActorToLifeline() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__CheckTypes_FWD__Match() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD__Match_InteractionOperand_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Interaction_Lifeline() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_BWD__Match() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__Perform_BWD__IsApplicableMatch() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__RegisterObjectsToMatch_BWD__Match_InteractionOperand_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Interaction_Lifeline() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_solveCsp_BWD__Match_InteractionOperand_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Interaction_Lifeline() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_MessageOccurrenceSpecification_UseCase_UseCaseToInteraction_Message_Interaction_Lifeline_Actor_ActorToLifeline() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__CheckTypes_BWD__Match() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_MessageOccurrenceSpecification_UseCase_UseCaseToInteraction_NormalStep_Message_Interaction_NormalStepToMessage_Lifeline_Actor_ActorToLifeline_ModelgeneratorRuleResult() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalStepNamedFlowToMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getNormalStepNamedFlowToMessageRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepToCombinedFragmentRule() {
		if (stepToCombinedFragmentRuleEClass == null) {
			stepToCombinedFragmentRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return stepToCombinedFragmentRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_UseCase_Flow_Actor() {
		return getStepToCombinedFragmentRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsApplicable_FWD__Match() {
		return getStepToCombinedFragmentRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__Perform_FWD__IsApplicableMatch() {
		return getStepToCombinedFragmentRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__RegisterObjectsToMatch_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_UseCase_Flow_Actor() {
		return getStepToCombinedFragmentRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_UseCase_Flow_Actor() {
		return getStepToCombinedFragmentRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getStepToCombinedFragmentRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Lifeline_UseCase_UseCaseToInteraction_Flow_Interaction_Actor_ActorToLifeline() {
		return getStepToCombinedFragmentRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsApplicable_checkCsp_FWD__CSP() {
		return getStepToCombinedFragmentRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getStepToCombinedFragmentRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__CheckTypes_FWD__Match() {
		return getStepToCombinedFragmentRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification() {
		return getStepToCombinedFragmentRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsApplicable_BWD__Match() {
		return getStepToCombinedFragmentRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__Perform_BWD__IsApplicableMatch() {
		return getStepToCombinedFragmentRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__RegisterObjectsToMatch_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification() {
		return getStepToCombinedFragmentRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_solveCsp_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification() {
		return getStepToCombinedFragmentRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getStepToCombinedFragmentRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_UseCase_UseCaseToInteraction_Flow_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Actor_ActorToLifeline() {
		return getStepToCombinedFragmentRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsApplicable_checkCsp_BWD__CSP() {
		return getStepToCombinedFragmentRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getStepToCombinedFragmentRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__CheckTypes_BWD__Match() {
		return getStepToCombinedFragmentRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_45__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_46__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_55__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_56__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge() {
		return getStepToCombinedFragmentRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__CheckAttributes_FWD__TripleMatch() {
		return getStepToCombinedFragmentRule().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__CheckAttributes_BWD__TripleMatch() {
		return getStepToCombinedFragmentRule().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getStepToCombinedFragmentRule().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_NormalStep_AlternativeFlowAlternative_CombinedFragment_NormalStepToCombinedFragment_InteractionOperand_StepAlternativeToInteractionOperand_InteractionConstraint_LiteralString_AlternativeFlow_Lifeline_UseCase_UseCaseToInteraction_Flow_Message_Interaction_NormalStepToMessage_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Actor_ActorToLifeline_ModelgeneratorRuleResult() {
		return getStepToCombinedFragmentRule().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepToCombinedFragmentRule__GenerateModel_checkCsp_BWD__CSP() {
		return getStepToCombinedFragmentRule().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepAltToOperandRule() {
		if (stepAltToOperandRuleEClass == null) {
			stepAltToOperandRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return stepAltToOperandRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase() {
		return getStepAltToOperandRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_FWD__Match() {
		return getStepAltToOperandRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__Perform_FWD__IsApplicableMatch() {
		return getStepAltToOperandRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__RegisterObjectsToMatch_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase() {
		return getStepAltToOperandRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase() {
		return getStepAltToOperandRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getStepAltToOperandRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_CombinedFragment_NormalStep_NormalStepToCombinedFragment_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase_Lifeline() {
		return getStepAltToOperandRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_checkCsp_FWD__CSP() {
		return getStepAltToOperandRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getStepAltToOperandRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__CheckTypes_FWD__Match() {
		return getStepAltToOperandRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline() {
		return getStepAltToOperandRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_BWD__Match() {
		return getStepAltToOperandRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__Perform_BWD__IsApplicableMatch() {
		return getStepAltToOperandRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__RegisterObjectsToMatch_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline() {
		return getStepAltToOperandRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_solveCsp_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline() {
		return getStepAltToOperandRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getStepAltToOperandRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CombinedFragment_NormalStep_NormalStepToCombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Flow_UseCase_Lifeline() {
		return getStepAltToOperandRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_checkCsp_BWD__CSP() {
		return getStepAltToOperandRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getStepAltToOperandRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__CheckTypes_BWD__Match() {
		return getStepAltToOperandRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__CheckAttributes_FWD__TripleMatch() {
		return getStepAltToOperandRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__CheckAttributes_BWD__TripleMatch() {
		return getStepAltToOperandRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__GenerateModel__RuleEntryContainer_NormalStepToCombinedFragment() {
		return getStepAltToOperandRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_CombinedFragment_NormalStep_NormalStepToCombinedFragment_AlternativeFlowAlternative_InteractionOperand_StepAlternativeToInteractionOperand_InteractionConstraint_LiteralString_AlternativeFlow_Flow_UseCase_Lifeline_ModelgeneratorRuleResult() {
		return getStepAltToOperandRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__GenerateModel_checkCsp_BWD__CSP() {
		return getStepAltToOperandRule().getEOperations().get(32);
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
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier
					.setInstanceClassName("UseCaseToModalSequenceDiagramIntegration.Rules."
							+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
