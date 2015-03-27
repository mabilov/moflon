/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.ModalSequenceDiagramPackage;

import TGGLanguage.TGGLanguagePackage;

import UseCaseDSL.UseCaseDSLPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesFactory;
import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

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
	private EClass actorToLifelineRuleEClass = null;

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
	private EClass useCaseNoPrecondRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userActorToLifelineRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepBFToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepNFToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altStepToComboRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altStepNFToComboRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelStepToCombinedFragmentRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelFlowToOperandRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCasePrecondToFoundMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemStepBFToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepAltToOperandRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altStepBFToComboRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStepBFMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemStepNFToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStepNfToMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altSysStepBFToComboRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altUserStepBFToComboRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altSysStepNFToComboRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altUserStepNFToComboRuleEClass = null;

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
	public EOperation getUCModelToMSDModelRule__Perform_FWD__IsApplicableMatch() {
		return getUCModelToMSDModelRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_FWD__Match() {
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
	public EOperation getUCModelToMSDModelRule__Perform_BWD__IsApplicableMatch() {
		return getUCModelToMSDModelRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsApplicable_BWD__Match() {
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
	public EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_2__UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_2__Model() {
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
	public EOperation getUCPackageToMSDPackage__Perform_FWD__IsApplicableMatch() {
		return getUCPackageToMSDPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_FWD__Match() {
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
	public EOperation getUCPackageToMSDPackage__Perform_BWD__IsApplicableMatch() {
		return getUCPackageToMSDPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsApplicable_BWD__Match() {
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
	public EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_74__EMoflonEdge() {
		return getUCPackageToMSDPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_322__EMoflonEdge() {
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
	public EClass getActorToLifelineRule() {
		if (actorToLifelineRuleEClass == null) {
			actorToLifelineRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return actorToLifelineRuleEClass;
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
	public EClass getUseCaseNoPrecondRule() {
		if (useCaseNoPrecondRuleEClass == null) {
			useCaseNoPrecondRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return useCaseNoPrecondRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_FWD__Match_UseCase_PackageDeclaration_BasicFlow() {
		return getUseCaseNoPrecondRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__Perform_FWD__IsApplicableMatch() {
		return getUseCaseNoPrecondRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsApplicable_FWD__Match() {
		return getUseCaseNoPrecondRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__RegisterObjectsToMatch_FWD__Match_UseCase_PackageDeclaration_BasicFlow() {
		return getUseCaseNoPrecondRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_solveCsp_FWD__Match_UseCase_PackageDeclaration_BasicFlow() {
		return getUseCaseNoPrecondRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUseCaseNoPrecondRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_PackageDeclaration_Package_PackageDeclarationToPackage_BasicFlow() {
		return getUseCaseNoPrecondRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUseCaseNoPrecondRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUseCaseNoPrecondRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__CheckTypes_FWD__Match() {
		return getUseCaseNoPrecondRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_BWD__Match_Package_Interaction() {
		return getUseCaseNoPrecondRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__Perform_BWD__IsApplicableMatch() {
		return getUseCaseNoPrecondRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsApplicable_BWD__Match() {
		return getUseCaseNoPrecondRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__RegisterObjectsToMatch_BWD__Match_Package_Interaction() {
		return getUseCaseNoPrecondRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_solveCsp_BWD__Match_Package_Interaction() {
		return getUseCaseNoPrecondRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUseCaseNoPrecondRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Interaction() {
		return getUseCaseNoPrecondRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUseCaseNoPrecondRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUseCaseNoPrecondRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__CheckTypes_BWD__Match() {
		return getUseCaseNoPrecondRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_FWD_EMoflonEdge_75__EMoflonEdge() {
		return getUseCaseNoPrecondRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_BWD_EMoflonEdge_323__EMoflonEdge() {
		return getUseCaseNoPrecondRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__IsAppropriate_FWD_EMoflonEdge_76__EMoflonEdge() {
		return getUseCaseNoPrecondRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__CheckAttributes_FWD__TripleMatch() {
		return getUseCaseNoPrecondRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseNoPrecondRule__CheckAttributes_BWD__TripleMatch() {
		return getUseCaseNoPrecondRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserActorToLifelineRule() {
		if (userActorToLifelineRuleEClass == null) {
			userActorToLifelineRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return userActorToLifelineRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_FWD__Match_Actor_PackageDeclaration() {
		return getUserActorToLifelineRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__Perform_FWD__IsApplicableMatch() {
		return getUserActorToLifelineRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsApplicable_FWD__Match() {
		return getUserActorToLifelineRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__RegisterObjectsToMatch_FWD__Match_Actor_PackageDeclaration() {
		return getUserActorToLifelineRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_solveCsp_FWD__Match_Actor_PackageDeclaration() {
		return getUserActorToLifelineRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserActorToLifelineRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_PackageDeclaration_Package_PackageDeclarationToPackage_Interaction() {
		return getUserActorToLifelineRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserActorToLifelineRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserActorToLifelineRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__CheckTypes_FWD__Match() {
		return getUserActorToLifelineRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_BWD__Match_Package_Lifeline_Interaction() {
		return getUserActorToLifelineRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__Perform_BWD__IsApplicableMatch() {
		return getUserActorToLifelineRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsApplicable_BWD__Match() {
		return getUserActorToLifelineRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__RegisterObjectsToMatch_BWD__Match_Package_Lifeline_Interaction() {
		return getUserActorToLifelineRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_solveCsp_BWD__Match_Package_Lifeline_Interaction() {
		return getUserActorToLifelineRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserActorToLifelineRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_Interaction() {
		return getUserActorToLifelineRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserActorToLifelineRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserActorToLifelineRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__CheckTypes_BWD__Match() {
		return getUserActorToLifelineRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_FWD_EMoflonEdge_77__EMoflonEdge() {
		return getUserActorToLifelineRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_324__EMoflonEdge() {
		return getUserActorToLifelineRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_325__EMoflonEdge() {
		return getUserActorToLifelineRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__CheckAttributes_FWD__TripleMatch() {
		return getUserActorToLifelineRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserActorToLifelineRule__CheckAttributes_BWD__TripleMatch() {
		return getUserActorToLifelineRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepBFToMessageRule() {
		if (normalStepBFToMessageRuleEClass == null) {
			normalStepBFToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return normalStepBFToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepNFToMessageRule() {
		if (normalStepNFToMessageRuleEClass == null) {
			normalStepNFToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return normalStepNFToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltStepToComboRule() {
		if (altStepToComboRuleEClass == null) {
			altStepToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return altStepToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltStepNFToComboRule() {
		if (altStepNFToComboRuleEClass == null) {
			altStepNFToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return altStepNFToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelStepToCombinedFragmentRule() {
		if (parallelStepToCombinedFragmentRuleEClass == null) {
			parallelStepToCombinedFragmentRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return parallelStepToCombinedFragmentRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD__Match_UseCase_Flow_ParallelStep() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__Perform_FWD__IsApplicableMatch() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsApplicable_FWD__Match() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__RegisterObjectsToMatch_FWD__Match_UseCase_Flow_ParallelStep() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Flow_ParallelStep() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_Interaction_Flow_UseCaseToInteraction_ParallelStep() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__CheckTypes_FWD__Match() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD__Match_Interaction_CombinedFragment() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__Perform_BWD__IsApplicableMatch() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsApplicable_BWD__Match() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__RegisterObjectsToMatch_BWD__Match_Interaction_CombinedFragment() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_solveCsp_BWD__Match_Interaction_CombinedFragment() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_Interaction_Flow_UseCaseToInteraction_CombinedFragment() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__CheckTypes_BWD__Match() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_326__EMoflonEdge() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_327__EMoflonEdge() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_78__EMoflonEdge() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__CheckAttributes_BWD__TripleMatch() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelFlowToOperandRule() {
		if (parallelFlowToOperandRuleEClass == null) {
			parallelFlowToOperandRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return parallelFlowToOperandRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_FWD__Match_ParallelStep_ParallelFlow_UseCase_Flow() {
		return getParallelFlowToOperandRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__Perform_FWD__IsApplicableMatch() {
		return getParallelFlowToOperandRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsApplicable_FWD__Match() {
		return getParallelFlowToOperandRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__RegisterObjectsToMatch_FWD__Match_ParallelStep_ParallelFlow_UseCase_Flow() {
		return getParallelFlowToOperandRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_solveCsp_FWD__Match_ParallelStep_ParallelFlow_UseCase_Flow() {
		return getParallelFlowToOperandRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelFlowToOperandRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_CombinedFragment_ParallelStep_ParallelStepToCombinedFragment_ParallelFlow_UseCase_Flow() {
		return getParallelFlowToOperandRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelFlowToOperandRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelFlowToOperandRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__CheckTypes_FWD__Match() {
		return getParallelFlowToOperandRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString() {
		return getParallelFlowToOperandRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__Perform_BWD__IsApplicableMatch() {
		return getParallelFlowToOperandRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsApplicable_BWD__Match() {
		return getParallelFlowToOperandRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__RegisterObjectsToMatch_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString() {
		return getParallelFlowToOperandRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_solveCsp_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString() {
		return getParallelFlowToOperandRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelFlowToOperandRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CombinedFragment_ParallelStep_ParallelStepToCombinedFragment_UseCase_Flow_InteractionOperand_InteractionConstraint_LiteralString() {
		return getParallelFlowToOperandRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelFlowToOperandRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelFlowToOperandRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__CheckTypes_BWD__Match() {
		return getParallelFlowToOperandRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_328__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_79__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_80__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_329__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_330__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelFlowToOperandRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__CheckAttributes_BWD__TripleMatch() {
		return getParallelFlowToOperandRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCasePrecondToFoundMessageRule() {
		if (useCasePrecondToFoundMessageRuleEClass == null) {
			useCasePrecondToFoundMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return useCasePrecondToFoundMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD__Match_UseCase_Actor_PackageDeclaration_BasicFlow() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__Perform_FWD__IsApplicableMatch() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_FWD__Match() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_FWD__Match_UseCase_Actor_PackageDeclaration_BasicFlow() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Actor_PackageDeclaration_BasicFlow() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_Actor_PackageDeclaration_Package_PackageDeclarationToPackage_BasicFlow() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__CheckTypes_FWD__Match() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline_Package() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__Perform_BWD__IsApplicableMatch() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_BWD__Match() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline_Package() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline_Package() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Message_Interaction_MessageOccurrenceSpecification_PackageDeclaration_Lifeline_Package_PackageDeclarationToPackage() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__CheckTypes_BWD__Match() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_331__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_332__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_333__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_334__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_335__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_336__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_337__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_338__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_81__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_82__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_339__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_340__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_341__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_83__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemStepBFToMessageRule() {
		if (systemStepBFToMessageRuleEClass == null) {
			systemStepBFToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return systemStepBFToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD__Match_Actor_BasicFlow_UseCase_NormalStep_PackageDeclaration() {
		return getSystemStepBFToMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__Perform_FWD__IsApplicableMatch() {
		return getSystemStepBFToMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsApplicable_FWD__Match() {
		return getSystemStepBFToMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_BasicFlow_UseCase_NormalStep_PackageDeclaration() {
		return getSystemStepBFToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_BasicFlow_UseCase_NormalStep_PackageDeclaration() {
		return getSystemStepBFToMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getSystemStepBFToMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_PackageDeclaration() {
		return getSystemStepBFToMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getSystemStepBFToMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSystemStepBFToMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__CheckTypes_FWD__Match() {
		return getSystemStepBFToMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message() {
		return getSystemStepBFToMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__Perform_BWD__IsApplicableMatch() {
		return getSystemStepBFToMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsApplicable_BWD__Match() {
		return getSystemStepBFToMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message() {
		return getSystemStepBFToMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message() {
		return getSystemStepBFToMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getSystemStepBFToMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Message_PackageDeclaration() {
		return getSystemStepBFToMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getSystemStepBFToMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSystemStepBFToMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__CheckTypes_BWD__Match() {
		return getSystemStepBFToMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_342__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_343__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_344__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_345__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_346__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_347__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_84__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_85__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_348__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_349__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_350__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_351__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_352__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_353__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_354__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_355__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getSystemStepBFToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getSystemStepBFToMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepAltToOperandRule() {
		if (stepAltToOperandRuleEClass == null) {
			stepAltToOperandRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(15);
		}
		return stepAltToOperandRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD__Match_Actor_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase() {
		return getStepAltToOperandRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__Perform_FWD__IsApplicableMatch() {
		return getStepAltToOperandRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_FWD__Match() {
		return getStepAltToOperandRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__RegisterObjectsToMatch_FWD__Match_Actor_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase() {
		return getStepAltToOperandRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_solveCsp_FWD__Match_Actor_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase() {
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
	public EOperation getStepAltToOperandRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_PackageDeclaration_ActorToLifeline_CombinedFragment_NormalStep_NormalStepToCombinedFragment_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase_Lifeline() {
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
	public EOperation getStepAltToOperandRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getStepAltToOperandRule__Perform_BWD__IsApplicableMatch() {
		return getStepAltToOperandRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsApplicable_BWD__Match() {
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
	public EOperation getStepAltToOperandRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_PackageDeclaration_ActorToLifeline_CombinedFragment_NormalStep_NormalStepToCombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Flow_UseCase_Lifeline() {
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
	public EOperation getStepAltToOperandRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_356__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_86__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_87__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_357__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_358__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_359__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_360__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_88__EMoflonEdge() {
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
	public EClass getAltStepBFToComboRule() {
		if (altStepBFToComboRuleEClass == null) {
			altStepBFToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return altStepBFToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserStepBFMessageRule() {
		if (userStepBFMessageRuleEClass == null) {
			userStepBFMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return userStepBFMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_UseCase_NormalStep() {
		return getUserStepBFMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__Perform_FWD__IsApplicableMatch() {
		return getUserStepBFMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsApplicable_FWD__Match() {
		return getUserStepBFMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_UseCase_NormalStep() {
		return getUserStepBFMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_UseCase_NormalStep() {
		return getUserStepBFMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserStepBFMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Lifeline_ActorToLifeline() {
		return getUserStepBFMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserStepBFMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserStepBFMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__CheckTypes_FWD__Match() {
		return getUserStepBFMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message_Lifeline() {
		return getUserStepBFMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__Perform_BWD__IsApplicableMatch() {
		return getUserStepBFMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsApplicable_BWD__Match() {
		return getUserStepBFMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message_Lifeline() {
		return getUserStepBFMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message_Lifeline() {
		return getUserStepBFMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserStepBFMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Message_Lifeline_ActorToLifeline() {
		return getUserStepBFMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserStepBFMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserStepBFMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__CheckTypes_BWD__Match() {
		return getUserStepBFMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_361__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_362__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_363__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_364__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_365__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_366__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_89__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_90__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_367__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_368__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_369__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_370__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_371__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_372__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_373__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_374__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getUserStepBFMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getUserStepBFMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemStepNFToMessageRule() {
		if (systemStepNFToMessageRuleEClass == null) {
			systemStepNFToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return systemStepNFToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD__Match_Actor_NamedFlow_UseCase_NormalStep_PackageDeclaration() {
		return getSystemStepNFToMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__Perform_FWD__IsApplicableMatch() {
		return getSystemStepNFToMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsApplicable_FWD__Match() {
		return getSystemStepNFToMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_NamedFlow_UseCase_NormalStep_PackageDeclaration() {
		return getSystemStepNFToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_NamedFlow_UseCase_NormalStep_PackageDeclaration() {
		return getSystemStepNFToMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getSystemStepNFToMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_UseCase_UseCaseToInteraction_NormalStep_Interaction_PackageDeclaration() {
		return getSystemStepNFToMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getSystemStepNFToMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSystemStepNFToMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__CheckTypes_FWD__Match() {
		return getSystemStepNFToMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_Message_Interaction() {
		return getSystemStepNFToMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__Perform_BWD__IsApplicableMatch() {
		return getSystemStepNFToMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsApplicable_BWD__Match() {
		return getSystemStepNFToMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_Message_Interaction() {
		return getSystemStepNFToMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_Message_Interaction() {
		return getSystemStepNFToMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getSystemStepNFToMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_CombinedFragment_UseCase_UseCaseToInteraction_Message_Interaction_PackageDeclaration() {
		return getSystemStepNFToMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getSystemStepNFToMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSystemStepNFToMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__CheckTypes_BWD__Match() {
		return getSystemStepNFToMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_375__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_376__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_377__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_378__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_379__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_380__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_381__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_382__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_383__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_384__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_91__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_92__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_385__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_386__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_387__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_388__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_389__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_390__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getSystemStepNFToMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getSystemStepNFToMessageRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserStepNfToMessageRule() {
		if (userStepNfToMessageRuleEClass == null) {
			userStepNfToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return userStepNfToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep() {
		return getUserStepNfToMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__Perform_FWD__IsApplicableMatch() {
		return getUserStepNfToMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsApplicable_FWD__Match() {
		return getUserStepNfToMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep() {
		return getUserStepNfToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep() {
		return getUserStepNfToMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserStepNfToMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_UseCase_UseCaseToInteraction_NormalStep_Interaction_ActorToLifeline() {
		return getUserStepNfToMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserStepNfToMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserStepNfToMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__CheckTypes_FWD__Match() {
		return getUserStepNfToMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Message_Interaction() {
		return getUserStepNfToMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__Perform_BWD__IsApplicableMatch() {
		return getUserStepNfToMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsApplicable_BWD__Match() {
		return getUserStepNfToMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Message_Interaction() {
		return getUserStepNfToMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Message_Interaction() {
		return getUserStepNfToMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserStepNfToMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_MessageOccurrenceSpecification_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_Lifeline_UseCase_UseCaseToInteraction_Message_Interaction_ActorToLifeline() {
		return getUserStepNfToMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserStepNfToMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserStepNfToMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__CheckTypes_BWD__Match() {
		return getUserStepNfToMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_391__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_392__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_393__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_394__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_395__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_396__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_397__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_398__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_399__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_400__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_401__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_402__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_93__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_94__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_403__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_404__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_405__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_406__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_407__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_408__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getUserStepNfToMessageRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getUserStepNfToMessageRule().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltSysStepBFToComboRule() {
		if (altSysStepBFToComboRuleEClass == null) {
			altSysStepBFToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(20);
		}
		return altSysStepBFToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD__Match_Actor_BasicFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepBFToComboRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__Perform_FWD__IsApplicableMatch() {
		return getAltSysStepBFToComboRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsApplicable_FWD__Match() {
		return getAltSysStepBFToComboRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__RegisterObjectsToMatch_FWD__Match_Actor_BasicFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepBFToComboRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_solveCsp_FWD__Match_Actor_BasicFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepBFToComboRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getAltSysStepBFToComboRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_Interaction_FlowToInteractionFragment_BasicFlow_UseCase_UseCaseToInteraction_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepBFToComboRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsApplicable_checkCsp_FWD__CSP() {
		return getAltSysStepBFToComboRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltSysStepBFToComboRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__CheckTypes_FWD__Match() {
		return getAltSysStepBFToComboRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_MessageOccurrenceSpecification_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepBFToComboRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__Perform_BWD__IsApplicableMatch() {
		return getAltSysStepBFToComboRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsApplicable_BWD__Match() {
		return getAltSysStepBFToComboRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_MessageOccurrenceSpecification_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepBFToComboRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_MessageOccurrenceSpecification_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepBFToComboRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getAltSysStepBFToComboRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_FlowToInteractionFragment_MessageOccurrenceSpecification_BasicFlow_UseCase_UseCaseToInteraction_PackageDeclaration_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepBFToComboRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsApplicable_checkCsp_BWD__CSP() {
		return getAltSysStepBFToComboRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltSysStepBFToComboRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__CheckTypes_BWD__Match() {
		return getAltSysStepBFToComboRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_409__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_410__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_411__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_412__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_413__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_414__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_415__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_416__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_95__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_96__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_97__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_98__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_417__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_418__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_419__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_420__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_421__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_422__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_423__EMoflonEdge() {
		return getAltSysStepBFToComboRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__CheckAttributes_FWD__TripleMatch() {
		return getAltSysStepBFToComboRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepBFToComboRule__CheckAttributes_BWD__TripleMatch() {
		return getAltSysStepBFToComboRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltUserStepBFToComboRule() {
		if (altUserStepBFToComboRuleEClass == null) {
			altUserStepBFToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(21);
		}
		return altUserStepBFToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_BasicFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepBFToComboRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__Perform_FWD__IsApplicableMatch() {
		return getAltUserStepBFToComboRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsApplicable_FWD__Match() {
		return getAltUserStepBFToComboRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_BasicFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepBFToComboRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_BasicFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepBFToComboRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getAltUserStepBFToComboRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_Interaction_FlowToInteractionFragment_BasicFlow_UseCase_UseCaseToInteraction_ActorToLifeline_NormalStep_AlternativeFlowAlternative_Lifeline_AlternativeFlow() {
		return getAltUserStepBFToComboRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsApplicable_checkCsp_FWD__CSP() {
		return getAltUserStepBFToComboRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltUserStepBFToComboRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__CheckTypes_FWD__Match() {
		return getAltUserStepBFToComboRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_MessageOccurrenceSpecification_Lifeline_InteractionConstraint_LiteralString() {
		return getAltUserStepBFToComboRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__Perform_BWD__IsApplicableMatch() {
		return getAltUserStepBFToComboRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsApplicable_BWD__Match() {
		return getAltUserStepBFToComboRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_MessageOccurrenceSpecification_Lifeline_InteractionConstraint_LiteralString() {
		return getAltUserStepBFToComboRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_MessageOccurrenceSpecification_Lifeline_InteractionConstraint_LiteralString() {
		return getAltUserStepBFToComboRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getAltUserStepBFToComboRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_FlowToInteractionFragment_MessageOccurrenceSpecification_BasicFlow_UseCase_UseCaseToInteraction_ActorToLifeline_Lifeline_InteractionConstraint_LiteralString() {
		return getAltUserStepBFToComboRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsApplicable_checkCsp_BWD__CSP() {
		return getAltUserStepBFToComboRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltUserStepBFToComboRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__CheckTypes_BWD__Match() {
		return getAltUserStepBFToComboRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_424__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_425__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_426__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_427__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_428__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_429__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_430__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_431__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_432__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_433__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_434__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_435__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_99__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_100__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_101__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_102__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_436__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_437__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_438__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_439__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_440__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_441__EMoflonEdge() {
		return getAltUserStepBFToComboRule().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__CheckAttributes_FWD__TripleMatch() {
		return getAltUserStepBFToComboRule().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepBFToComboRule__CheckAttributes_BWD__TripleMatch() {
		return getAltUserStepBFToComboRule().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltSysStepNFToComboRule() {
		if (altSysStepNFToComboRuleEClass == null) {
			altSysStepNFToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(22);
		}
		return altSysStepNFToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD__Match_Actor_NamedFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepNFToComboRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__Perform_FWD__IsApplicableMatch() {
		return getAltSysStepNFToComboRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsApplicable_FWD__Match() {
		return getAltSysStepNFToComboRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__RegisterObjectsToMatch_FWD__Match_Actor_NamedFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepNFToComboRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_solveCsp_FWD__Match_Actor_NamedFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepNFToComboRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getAltSysStepNFToComboRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_NamedFlow_InteractionOperand_FlowToInteractionFragment_CombinedFragment_Interaction_UseCase_UseCaseToInteraction_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltSysStepNFToComboRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsApplicable_checkCsp_FWD__CSP() {
		return getAltSysStepNFToComboRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltSysStepNFToComboRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__CheckTypes_FWD__Match() {
		return getAltSysStepNFToComboRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepNFToComboRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__Perform_BWD__IsApplicableMatch() {
		return getAltSysStepNFToComboRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsApplicable_BWD__Match() {
		return getAltSysStepNFToComboRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepNFToComboRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepNFToComboRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getAltSysStepNFToComboRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_NamedFlow_InteractionOperand_FlowToInteractionFragment_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_UseCase_UseCaseToInteraction_PackageDeclaration_InteractionOperand_InteractionConstraint_LiteralString() {
		return getAltSysStepNFToComboRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsApplicable_checkCsp_BWD__CSP() {
		return getAltSysStepNFToComboRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltSysStepNFToComboRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__CheckTypes_BWD__Match() {
		return getAltSysStepNFToComboRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_442__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_443__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_444__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_445__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_446__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_447__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_448__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_449__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_450__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_451__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_452__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_453__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_454__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_455__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_103__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_104__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_105__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_106__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_456__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_457__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_458__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_459__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_460__EMoflonEdge() {
		return getAltSysStepNFToComboRule().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__CheckAttributes_FWD__TripleMatch() {
		return getAltSysStepNFToComboRule().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltSysStepNFToComboRule__CheckAttributes_BWD__TripleMatch() {
		return getAltSysStepNFToComboRule().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltUserStepNFToComboRule() {
		if (altUserStepNFToComboRuleEClass == null) {
			altUserStepNFToComboRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(23);
		}
		return altUserStepNFToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepNFToComboRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__Perform_FWD__IsApplicableMatch() {
		return getAltUserStepNFToComboRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsApplicable_FWD__Match() {
		return getAltUserStepNFToComboRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepNFToComboRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepNFToComboRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getAltUserStepNFToComboRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_Interaction_UseCase_UseCaseToInteraction_ActorToLifeline_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getAltUserStepNFToComboRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsApplicable_checkCsp_FWD__CSP() {
		return getAltUserStepNFToComboRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltUserStepNFToComboRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__CheckTypes_FWD__Match() {
		return getAltUserStepNFToComboRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Interaction_InteractionConstraint_LiteralString() {
		return getAltUserStepNFToComboRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__Perform_BWD__IsApplicableMatch() {
		return getAltUserStepNFToComboRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsApplicable_BWD__Match() {
		return getAltUserStepNFToComboRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Interaction_InteractionConstraint_LiteralString() {
		return getAltUserStepNFToComboRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Interaction_InteractionConstraint_LiteralString() {
		return getAltUserStepNFToComboRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getAltUserStepNFToComboRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_Lifeline_Interaction_UseCase_UseCaseToInteraction_ActorToLifeline_InteractionConstraint_LiteralString() {
		return getAltUserStepNFToComboRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsApplicable_checkCsp_BWD__CSP() {
		return getAltUserStepNFToComboRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltUserStepNFToComboRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__CheckTypes_BWD__Match() {
		return getAltUserStepNFToComboRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_461__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_462__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_463__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_464__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_465__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_466__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_467__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_468__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_469__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_470__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_471__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_472__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_473__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_474__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_475__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_476__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_477__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_478__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_107__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_108__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_479__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_480__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_481__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_482__EMoflonEdge() {
		return getAltUserStepNFToComboRule().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__CheckAttributes_FWD__TripleMatch() {
		return getAltUserStepNFToComboRule().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltUserStepNFToComboRule__CheckAttributes_BWD__TripleMatch() {
		return getAltUserStepNFToComboRule().getEOperations().get(47);
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
