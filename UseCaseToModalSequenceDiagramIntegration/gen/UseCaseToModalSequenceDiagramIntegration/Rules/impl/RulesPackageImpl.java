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
	private EClass waitStepToFoundMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendStepToLostMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepToMessageRuleEClass = null;

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
	public EClass getWaitStepToFoundMessageRule() {
		if (waitStepToFoundMessageRuleEClass == null) {
			waitStepToFoundMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return waitStepToFoundMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration() {
		return getWaitStepToFoundMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__Perform_FWD__IsApplicableMatch() {
		return getWaitStepToFoundMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsApplicable_FWD__Match() {
		return getWaitStepToFoundMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__RegisterObjectsToMatch_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration() {
		return getWaitStepToFoundMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration() {
		return getWaitStepToFoundMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getWaitStepToFoundMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NormalStep_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration() {
		return getWaitStepToFoundMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getWaitStepToFoundMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getWaitStepToFoundMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__CheckTypes_FWD__Match() {
		return getWaitStepToFoundMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction() {
		return getWaitStepToFoundMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__Perform_BWD__IsApplicableMatch() {
		return getWaitStepToFoundMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsApplicable_BWD__Match() {
		return getWaitStepToFoundMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__RegisterObjectsToMatch_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction() {
		return getWaitStepToFoundMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction() {
		return getWaitStepToFoundMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getWaitStepToFoundMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Message_MessageOccurrenceSpecification_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration() {
		return getWaitStepToFoundMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getWaitStepToFoundMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getWaitStepToFoundMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__CheckTypes_BWD__Match() {
		return getWaitStepToFoundMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_869__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_870__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_871__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_872__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_873__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_874__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_424__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_425__EMoflonEdge() {
		return getWaitStepToFoundMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getWaitStepToFoundMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getWaitStepToFoundMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getWaitStepToFoundMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration_ModelgeneratorRuleResult() {
		return getWaitStepToFoundMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWaitStepToFoundMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getWaitStepToFoundMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendStepToLostMessageRule() {
		if (sendStepToLostMessageRuleEClass == null) {
			sendStepToLostMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return sendStepToLostMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration() {
		return getSendStepToLostMessageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__Perform_FWD__IsApplicableMatch() {
		return getSendStepToLostMessageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsApplicable_FWD__Match() {
		return getSendStepToLostMessageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__RegisterObjectsToMatch_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration() {
		return getSendStepToLostMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration() {
		return getSendStepToLostMessageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getSendStepToLostMessageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NormalStep_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration() {
		return getSendStepToLostMessageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getSendStepToLostMessageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSendStepToLostMessageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__CheckTypes_FWD__Match() {
		return getSendStepToLostMessageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction() {
		return getSendStepToLostMessageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__Perform_BWD__IsApplicableMatch() {
		return getSendStepToLostMessageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsApplicable_BWD__Match() {
		return getSendStepToLostMessageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__RegisterObjectsToMatch_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction() {
		return getSendStepToLostMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction() {
		return getSendStepToLostMessageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getSendStepToLostMessageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Message_MessageOccurrenceSpecification_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration() {
		return getSendStepToLostMessageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getSendStepToLostMessageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSendStepToLostMessageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__CheckTypes_BWD__Match() {
		return getSendStepToLostMessageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_875__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_876__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_877__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_878__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_879__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_880__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_FWD_EMoflonEdge_426__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__IsAppropriate_FWD_EMoflonEdge_427__EMoflonEdge() {
		return getSendStepToLostMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getSendStepToLostMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getSendStepToLostMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getSendStepToLostMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration_ModelgeneratorRuleResult() {
		return getSendStepToLostMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendStepToLostMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getSendStepToLostMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepToMessageRule() {
		if (stepToMessageRuleEClass == null) {
			stepToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return stepToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCModelToMSDModelRule() {
		if (ucModelToMSDModelRuleEClass == null) {
			ucModelToMSDModelRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
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
	public EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_8__UseCasesModel() {
		return getUCModelToMSDModelRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_8__Model() {
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
	public EOperation getUCModelToMSDModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
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
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
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
	public EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_428__EMoflonEdge() {
		return getUCPackageToMSDPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_881__EMoflonEdge() {
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
	public EOperation getUCPackageToMSDPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_ModelgeneratorRuleResult() {
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
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
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
	public EOperation getUseCaseToInteractionRule__Perform_FWD__IsApplicableMatch() {
		return getUseCaseToInteractionRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_FWD__Match() {
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
	public EOperation getUseCaseToInteractionRule__Perform_BWD__IsApplicableMatch() {
		return getUseCaseToInteractionRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsApplicable_BWD__Match() {
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
	public EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_429__EMoflonEdge() {
		return getUseCaseToInteractionRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_BWD_EMoflonEdge_882__EMoflonEdge() {
		return getUseCaseToInteractionRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_430__EMoflonEdge() {
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
	public EOperation getUseCaseToInteractionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_ModelgeneratorRuleResult() {
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
	public EClass getActorToLifelineRule() {
		if (actorToLifelineRuleEClass == null) {
			actorToLifelineRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return actorToLifelineRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_UseCase() {
		return getActorToLifelineRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__Perform_FWD__IsApplicableMatch() {
		return getActorToLifelineRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsApplicable_FWD__Match() {
		return getActorToLifelineRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_UseCase() {
		return getActorToLifelineRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_UseCase() {
		return getActorToLifelineRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getActorToLifelineRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Actor_UseCase_UseCaseToInteraction_Interaction() {
		return getActorToLifelineRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsApplicable_checkCsp_FWD__CSP() {
		return getActorToLifelineRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getActorToLifelineRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__CheckTypes_FWD__Match() {
		return getActorToLifelineRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_BWD__Match_Package_Lifeline_Interaction() {
		return getActorToLifelineRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__Perform_BWD__IsApplicableMatch() {
		return getActorToLifelineRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsApplicable_BWD__Match() {
		return getActorToLifelineRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__RegisterObjectsToMatch_BWD__Match_Package_Lifeline_Interaction() {
		return getActorToLifelineRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_solveCsp_BWD__Match_Package_Lifeline_Interaction() {
		return getActorToLifelineRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getActorToLifelineRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_UseCase_UseCaseToInteraction_Interaction() {
		return getActorToLifelineRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsApplicable_checkCsp_BWD__CSP() {
		return getActorToLifelineRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getActorToLifelineRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__CheckTypes_BWD__Match() {
		return getActorToLifelineRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_FWD_EMoflonEdge_431__EMoflonEdge() {
		return getActorToLifelineRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_883__EMoflonEdge() {
		return getActorToLifelineRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_884__EMoflonEdge() {
		return getActorToLifelineRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__CheckAttributes_FWD__TripleMatch() {
		return getActorToLifelineRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__CheckAttributes_BWD__TripleMatch() {
		return getActorToLifelineRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getActorToLifelineRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_UseCaseToInteraction_Interaction_ModelgeneratorRuleResult() {
		return getActorToLifelineRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActorToLifelineRule__GenerateModel_checkCsp_BWD__CSP() {
		return getActorToLifelineRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepToMessageRule() {
		if (normalStepToMessageRuleEClass == null) {
			normalStepToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return normalStepToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepBFToMessageRule() {
		if (normalStepBFToMessageRuleEClass == null) {
			normalStepBFToMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
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
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
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
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return altStepToComboRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_FWD__Match_UseCase_Flow_PackageDeclaration_Actor_NormalStep() {
		return getAltStepToComboRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__Perform_FWD__IsApplicableMatch() {
		return getAltStepToComboRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsApplicable_FWD__Match() {
		return getAltStepToComboRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__RegisterObjectsToMatch_FWD__Match_UseCase_Flow_PackageDeclaration_Actor_NormalStep() {
		return getAltStepToComboRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Flow_PackageDeclaration_Actor_NormalStep() {
		return getAltStepToComboRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getAltStepToComboRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Interaction_UseCase_UseCaseToInteraction_Flow_PackageDeclaration_Actor_ActorToLifeline_NormalStep_Lifeline() {
		return getAltStepToComboRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsApplicable_checkCsp_FWD__CSP() {
		return getAltStepToComboRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltStepToComboRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__CheckTypes_FWD__Match() {
		return getAltStepToComboRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_BWD__Match_Interaction_CombinedFragment_Lifeline() {
		return getAltStepToComboRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__Perform_BWD__IsApplicableMatch() {
		return getAltStepToComboRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsApplicable_BWD__Match() {
		return getAltStepToComboRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__RegisterObjectsToMatch_BWD__Match_Interaction_CombinedFragment_Lifeline() {
		return getAltStepToComboRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_solveCsp_BWD__Match_Interaction_CombinedFragment_Lifeline() {
		return getAltStepToComboRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getAltStepToComboRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interaction_UseCase_UseCaseToInteraction_Flow_PackageDeclaration_Actor_ActorToLifeline_CombinedFragment_Lifeline() {
		return getAltStepToComboRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsApplicable_checkCsp_BWD__CSP() {
		return getAltStepToComboRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAltStepToComboRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__CheckTypes_BWD__Match() {
		return getAltStepToComboRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_885__EMoflonEdge() {
		return getAltStepToComboRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_886__EMoflonEdge() {
		return getAltStepToComboRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_FWD_EMoflonEdge_432__EMoflonEdge() {
		return getAltStepToComboRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_FWD_EMoflonEdge_433__EMoflonEdge() {
		return getAltStepToComboRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_887__EMoflonEdge() {
		return getAltStepToComboRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_888__EMoflonEdge() {
		return getAltStepToComboRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__CheckAttributes_FWD__TripleMatch() {
		return getAltStepToComboRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__CheckAttributes_BWD__TripleMatch() {
		return getAltStepToComboRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getAltStepToComboRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Interaction_UseCase_UseCaseToInteraction_Flow_PackageDeclaration_Actor_ActorToLifeline_Lifeline_ModelgeneratorRuleResult() {
		return getAltStepToComboRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAltStepToComboRule__GenerateModel_checkCsp_BWD__CSP() {
		return getAltStepToComboRule().getEOperations().get(30);
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
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_889__EMoflonEdge() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_890__EMoflonEdge() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_434__EMoflonEdge() {
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
	public EOperation getParallelStepToCombinedFragmentRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_Interaction_Flow_UseCaseToInteraction_ModelgeneratorRuleResult() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelStepToCombinedFragmentRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelStepToCombinedFragmentRule().getEOperations().get(27);
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
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_891__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_435__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_436__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_892__EMoflonEdge() {
		return getParallelFlowToOperandRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_893__EMoflonEdge() {
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
	public EOperation getParallelFlowToOperandRule__GenerateModel__RuleEntryContainer_ParallelStepToCombinedFragment() {
		return getParallelFlowToOperandRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_CombinedFragment_ParallelStep_ParallelStepToCombinedFragment_UseCase_Flow_ModelgeneratorRuleResult() {
		return getParallelFlowToOperandRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelFlowToOperandRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelFlowToOperandRule().getEOperations().get(29);
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
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD__Match_UCCondition_UseCase_Actor_PackageDeclaration() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_FWD__Match_UCCondition_UseCase_Actor_PackageDeclaration() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_FWD__Match_UCCondition_UseCase_Actor_PackageDeclaration() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UCCondition_UseCaseToInteraction_UseCase_Interaction_Actor_PackageDeclaration_Lifeline_ActorToLifeline() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCaseToInteraction_UseCase_Message_Interaction_MessageOccurrenceSpecification_Actor_PackageDeclaration_Lifeline_ActorToLifeline() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_437__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_894__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_895__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_896__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_897__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_898__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_899__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_900__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_901__EMoflonEdge() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__CheckAttributes_FWD__TripleMatch() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__CheckAttributes_BWD__TripleMatch() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCaseToInteraction_UseCase_Interaction_Actor_PackageDeclaration_Lifeline_ActorToLifeline_ModelgeneratorRuleResult() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCasePrecondToFoundMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUseCasePrecondToFoundMessageRule().getEOperations().get(33);
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
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD__Match_Actor_BasicFlow_NormalStep_UseCase_PackageDeclaration() {
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
	public EOperation getSystemStepBFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_BasicFlow_NormalStep_UseCase_PackageDeclaration() {
		return getSystemStepBFToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_BasicFlow_NormalStep_UseCase_PackageDeclaration() {
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
	public EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_Interaction_BasicFlow_FlowToInteractionFragment_NormalStep_UseCase_UseCaseToInteraction_PackageDeclaration() {
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
	public EOperation getSystemStepBFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_Message_UseCase_UseCaseToInteraction_PackageDeclaration() {
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
	public EOperation getSystemStepBFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_902__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_903__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_904__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_905__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_906__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_907__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_908__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_909__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_910__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_911__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_912__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_913__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_914__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_915__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_438__EMoflonEdge() {
		return getSystemStepBFToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_439__EMoflonEdge() {
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
	public EOperation getSystemStepBFToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment() {
		return getSystemStepBFToMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_PackageDeclaration_ModelgeneratorRuleResult() {
		return getSystemStepBFToMessageRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepBFToMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getSystemStepBFToMessageRule().getEOperations().get(40);
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
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_916__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_440__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_441__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_917__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_918__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_919__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_920__EMoflonEdge() {
		return getStepAltToOperandRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_442__EMoflonEdge() {
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
	public EOperation getStepAltToOperandRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_PackageDeclaration_ActorToLifeline_CombinedFragment_NormalStep_NormalStepToCombinedFragment_Flow_UseCase_Lifeline_ModelgeneratorRuleResult() {
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
	public EClass getUserStepBFMessageRule() {
		if (userStepBFMessageRuleEClass == null) {
			userStepBFMessageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return userStepBFMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_NormalStep_UseCase() {
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
	public EOperation getUserStepBFMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_NormalStep_UseCase() {
		return getUserStepBFMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_NormalStep_UseCase() {
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
	public EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_NormalStep_Lifeline_UseCase_UseCaseToInteraction_ActorToLifeline() {
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
	public EOperation getUserStepBFMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_Message_Lifeline_UseCase_UseCaseToInteraction_ActorToLifeline() {
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
	public EOperation getUserStepBFMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_921__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_922__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_923__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_924__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_925__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_926__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_927__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_928__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_929__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_930__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_931__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_932__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_933__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_934__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_443__EMoflonEdge() {
		return getUserStepBFMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_444__EMoflonEdge() {
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
	public EOperation getUserStepBFMessageRule__GenerateModel__RuleEntryContainer_ActorToLifeline() {
		return getUserStepBFMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_Lifeline_UseCase_UseCaseToInteraction_ActorToLifeline_ModelgeneratorRuleResult() {
		return getUserStepBFMessageRule().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepBFMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserStepBFMessageRule().getEOperations().get(40);
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
					.get(17);
		}
		return systemStepNFToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD__Match_Actor_NamedFlow_NormalStep_UseCase_PackageDeclaration() {
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
	public EOperation getSystemStepNFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_NamedFlow_NormalStep_UseCase_PackageDeclaration() {
		return getSystemStepNFToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_NamedFlow_NormalStep_UseCase_PackageDeclaration() {
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
	public EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_NormalStep_UseCase_Interaction_UseCaseToInteraction_PackageDeclaration() {
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
	public EOperation getSystemStepNFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_CombinedFragment_Message_UseCase_Interaction_UseCaseToInteraction_PackageDeclaration() {
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
	public EOperation getSystemStepNFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_935__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_936__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_937__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_938__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_939__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_940__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_941__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_942__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_943__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_944__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_945__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_946__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_947__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_948__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_949__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_950__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_445__EMoflonEdge() {
		return getSystemStepNFToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_446__EMoflonEdge() {
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
	public EOperation getSystemStepNFToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment() {
		return getSystemStepNFToMessageRule().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_UseCase_Interaction_UseCaseToInteraction_PackageDeclaration_ModelgeneratorRuleResult() {
		return getSystemStepNFToMessageRule().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemStepNFToMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getSystemStepNFToMessageRule().getEOperations().get(42);
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
					.get(18);
		}
		return userStepNfToMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_NormalStep_UseCase() {
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
	public EOperation getUserStepNfToMessageRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_NormalStep_UseCase() {
		return getUserStepNfToMessageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_NormalStep_UseCase() {
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
	public EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_NormalStep_UseCase_Interaction_UseCaseToInteraction_ActorToLifeline() {
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
	public EOperation getUserStepNfToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_MessageOccurrenceSpecification_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_Lifeline_Message_UseCase_Interaction_UseCaseToInteraction_ActorToLifeline() {
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
	public EOperation getUserStepNfToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_951__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_952__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_953__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_954__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_955__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_956__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_957__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_958__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_959__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_960__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_961__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_962__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_963__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_964__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_965__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_966__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_967__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_968__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_447__EMoflonEdge() {
		return getUserStepNfToMessageRule().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_448__EMoflonEdge() {
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
	public EOperation getUserStepNfToMessageRule__GenerateModel__RuleEntryContainer_ActorToLifeline() {
		return getUserStepNfToMessageRule().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_UseCase_Interaction_UseCaseToInteraction_ActorToLifeline_ModelgeneratorRuleResult() {
		return getUserStepNfToMessageRule().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserStepNfToMessageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserStepNfToMessageRule().getEOperations().get(44);
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
