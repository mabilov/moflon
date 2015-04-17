/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;

import BpmnToUseCaseIntegration.Rules.RulesFactory;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import UseCaseDSL.UseCaseDSLPackage;

import bpmn2.Bpmn2Package;

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
	private EClass bpModelToUseCaseModelRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsToPackageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processToUseCaseRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskToStepCoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstServiceTaskToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstUserTaskToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneSetRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneToActorRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interEventToStepCoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayToStepCoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interEventToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstInterThrowEventToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstICEToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayToParallelStepCoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBasedGatewayToStepCoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveConvergingGatewayRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelConvergingGatewayRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqFlowAfterEGToAltFlowRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqFlowAfterPGToParallelFlowRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchEventAfterEBGToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayToParallelStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBasedGatewayToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneStartEventRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excConvGwAfterEventGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excConvGwDefaultSeqFlowRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelConvergingGatewayTwoInputsRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excConvGwAfterExDivGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exConvGwAfterEventGwIceSeqFlowRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterSERuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterExGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterPGRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterTaskRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterEventRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterExConvGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToStepAfterPConvGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskToStepAfterSERuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskToStepAfterExGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskToStepAfterPGRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskToStepAfterEvGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskToStepAfterSERuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskToStepAfterExGwRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskToStepAfterPGRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskToStepAfterEvGwRuleEClass = null;

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

		// Load packages
		theBpmnToUseCaseIntegrationPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theBpmnToUseCaseIntegrationPackage.fixPackageContents();

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
		if (bpModelToUseCaseModelRuleEClass == null) {
			bpModelToUseCaseModelRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return bpModelToUseCaseModelRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD__Match_DocumentRoot() {
		return getBpModelToUseCaseModelRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__Perform_FWD__IsApplicableMatch() {
		return getBpModelToUseCaseModelRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_FWD__Match() {
		return getBpModelToUseCaseModelRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjectsToMatch_FWD__Match_DocumentRoot() {
		return getBpModelToUseCaseModelRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_FWD__Match_DocumentRoot() {
		return getBpModelToUseCaseModelRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getBpModelToUseCaseModelRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_DocumentRoot() {
		return getBpModelToUseCaseModelRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_checkCsp_FWD__CSP() {
		return getBpModelToUseCaseModelRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getBpModelToUseCaseModelRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckTypes_FWD__Match() {
		return getBpModelToUseCaseModelRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD__Match_UseCasesModel() {
		return getBpModelToUseCaseModelRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__Perform_BWD__IsApplicableMatch() {
		return getBpModelToUseCaseModelRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_BWD__Match() {
		return getBpModelToUseCaseModelRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjectsToMatch_BWD__Match_UseCasesModel() {
		return getBpModelToUseCaseModelRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_BWD__Match_UseCasesModel() {
		return getBpModelToUseCaseModelRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getBpModelToUseCaseModelRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel() {
		return getBpModelToUseCaseModelRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsApplicable_checkCsp_BWD__CSP() {
		return getBpModelToUseCaseModelRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getBpModelToUseCaseModelRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckTypes_BWD__Match() {
		return getBpModelToUseCaseModelRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD_DocumentRoot_0__DocumentRoot() {
		return getBpModelToUseCaseModelRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD_UseCasesModel_0__UseCasesModel() {
		return getBpModelToUseCaseModelRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckAttributes_FWD__TripleMatch() {
		return getBpModelToUseCaseModelRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__CheckAttributes_BWD__TripleMatch() {
		return getBpModelToUseCaseModelRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__GenerateModel__RuleEntryContainer() {
		return getBpModelToUseCaseModelRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getBpModelToUseCaseModelRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__GenerateModel_checkCsp_BWD__CSP() {
		return getBpModelToUseCaseModelRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsToPackageRule() {
		if (definitionsToPackageRuleEClass == null) {
			definitionsToPackageRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return definitionsToPackageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_FWD__Match_Definitions_DocumentRoot() {
		return getDefinitionsToPackageRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__Perform_FWD__IsApplicableMatch() {
		return getDefinitionsToPackageRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_FWD__Match() {
		return getDefinitionsToPackageRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjectsToMatch_FWD__Match_Definitions_DocumentRoot() {
		return getDefinitionsToPackageRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_solveCsp_FWD__Match_Definitions_DocumentRoot() {
		return getDefinitionsToPackageRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getDefinitionsToPackageRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_DocumentRoot_UseCasesModel_DocRootToUCModel() {
		return getDefinitionsToPackageRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_checkCsp_FWD__CSP() {
		return getDefinitionsToPackageRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDefinitionsToPackageRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckTypes_FWD__Match() {
		return getDefinitionsToPackageRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCasesModel() {
		return getDefinitionsToPackageRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__Perform_BWD__IsApplicableMatch() {
		return getDefinitionsToPackageRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_BWD__Match() {
		return getDefinitionsToPackageRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCasesModel() {
		return getDefinitionsToPackageRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCasesModel() {
		return getDefinitionsToPackageRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getDefinitionsToPackageRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_DocumentRoot_UseCasesModel_DocRootToUCModel() {
		return getDefinitionsToPackageRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsApplicable_checkCsp_BWD__CSP() {
		return getDefinitionsToPackageRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDefinitionsToPackageRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckTypes_BWD__Match() {
		return getDefinitionsToPackageRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getDefinitionsToPackageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getDefinitionsToPackageRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckAttributes_FWD__TripleMatch() {
		return getDefinitionsToPackageRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__CheckAttributes_BWD__TripleMatch() {
		return getDefinitionsToPackageRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel__RuleEntryContainer_DocRootToUCModel() {
		return getDefinitionsToPackageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_DocumentRoot_UseCasesModel_DocRootToUCModel_ModelgeneratorRuleResult() {
		return getDefinitionsToPackageRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel_checkCsp_BWD__CSP() {
		return getDefinitionsToPackageRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessToUseCaseRule() {
		if (processToUseCaseRuleEClass == null) {
			processToUseCaseRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return processToUseCaseRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD__Match_Definitions_Process_StartEvent_SequenceFlow() {
		return getProcessToUseCaseRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__Perform_FWD__IsApplicableMatch() {
		return getProcessToUseCaseRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsApplicable_FWD__Match() {
		return getProcessToUseCaseRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__RegisterObjectsToMatch_FWD__Match_Definitions_Process_StartEvent_SequenceFlow() {
		return getProcessToUseCaseRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_solveCsp_FWD__Match_Definitions_Process_StartEvent_SequenceFlow() {
		return getProcessToUseCaseRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getProcessToUseCaseRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackage_Process_StartEvent_SequenceFlow() {
		return getProcessToUseCaseRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsApplicable_checkCsp_FWD__CSP() {
		return getProcessToUseCaseRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getProcessToUseCaseRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__CheckTypes_FWD__Match() {
		return getProcessToUseCaseRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCase_BasicFlow_Actor() {
		return getProcessToUseCaseRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__Perform_BWD__IsApplicableMatch() {
		return getProcessToUseCaseRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsApplicable_BWD__Match() {
		return getProcessToUseCaseRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCase_BasicFlow_Actor() {
		return getProcessToUseCaseRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCase_BasicFlow_Actor() {
		return getProcessToUseCaseRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getProcessToUseCaseRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackage_UseCase_BasicFlow_Actor() {
		return getProcessToUseCaseRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsApplicable_checkCsp_BWD__CSP() {
		return getProcessToUseCaseRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getProcessToUseCaseRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__CheckTypes_BWD__Match() {
		return getProcessToUseCaseRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__CheckAttributes_FWD__TripleMatch() {
		return getProcessToUseCaseRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__CheckAttributes_BWD__TripleMatch() {
		return getProcessToUseCaseRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__GenerateModel__RuleEntryContainer_DefinitionsToPackage() {
		return getProcessToUseCaseRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackage_ModelgeneratorRuleResult() {
		return getProcessToUseCaseRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__GenerateModel_checkCsp_BWD__CSP() {
		return getProcessToUseCaseRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskToStepCoreRule() {
		if (taskToStepCoreRuleEClass == null) {
			taskToStepCoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return taskToStepCoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstServiceTaskToStepRule() {
		if (firstServiceTaskToStepRuleEClass == null) {
			firstServiceTaskToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return firstServiceTaskToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstUserTaskToStepRule() {
		if (firstUserTaskToStepRuleEClass == null) {
			firstUserTaskToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return firstUserTaskToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaneSetRule() {
		if (laneSetRuleEClass == null) {
			laneSetRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return laneSetRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsAppropriate_FWD__Match_Process_LaneSet() {
		return getLaneSetRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__Perform_FWD__IsApplicableMatch() {
		return getLaneSetRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsApplicable_FWD__Match() {
		return getLaneSetRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__RegisterObjectsToMatch_FWD__Match_Process_LaneSet() {
		return getLaneSetRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsAppropriate_solveCsp_FWD__Match_Process_LaneSet() {
		return getLaneSetRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getLaneSetRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_LaneSet() {
		return getLaneSetRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsApplicable_checkCsp_FWD__CSP() {
		return getLaneSetRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getLaneSetRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__CheckTypes_FWD__Match() {
		return getLaneSetRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getLaneSetRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__CheckAttributes_FWD__TripleMatch() {
		return getLaneSetRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__GenerateModel__RuleEntryContainer_Process() {
		return getLaneSetRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_ModelgeneratorRuleResult() {
		return getLaneSetRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSetRule__GenerateModel_checkCsp_BWD__CSP() {
		return getLaneSetRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaneToActorRule() {
		if (laneToActorRuleEClass == null) {
			laneToActorRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return laneToActorRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_FWD__Match_LaneSet_Process_Definitions_Lane() {
		return getLaneToActorRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__Perform_FWD__IsApplicableMatch() {
		return getLaneToActorRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsApplicable_FWD__Match() {
		return getLaneToActorRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__RegisterObjectsToMatch_FWD__Match_LaneSet_Process_Definitions_Lane() {
		return getLaneToActorRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_solveCsp_FWD__Match_LaneSet_Process_Definitions_Lane() {
		return getLaneToActorRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getLaneToActorRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackage_UseCase_ProcessToUseCase_Lane() {
		return getLaneToActorRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsApplicable_checkCsp_FWD__CSP() {
		return getLaneToActorRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLaneToActorRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__CheckTypes_FWD__Match() {
		return getLaneToActorRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCase_Actor() {
		return getLaneToActorRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__Perform_BWD__IsApplicableMatch() {
		return getLaneToActorRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsApplicable_BWD__Match() {
		return getLaneToActorRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCase_Actor() {
		return getLaneToActorRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCase_Actor() {
		return getLaneToActorRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getLaneToActorRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackage_UseCase_ProcessToUseCase_Actor() {
		return getLaneToActorRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsApplicable_checkCsp_BWD__CSP() {
		return getLaneToActorRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLaneToActorRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__CheckTypes_BWD__Match() {
		return getLaneToActorRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getLaneToActorRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getLaneToActorRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__CheckAttributes_FWD__TripleMatch() {
		return getLaneToActorRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__CheckAttributes_BWD__TripleMatch() {
		return getLaneToActorRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__GenerateModel__RuleEntryContainer_DefinitionsToPackage() {
		return getLaneToActorRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackage_UseCase_ProcessToUseCase_ModelgeneratorRuleResult() {
		return getLaneToActorRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__GenerateModel_checkCsp_BWD__CSP() {
		return getLaneToActorRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskToStepRule() {
		if (taskToStepRuleEClass == null) {
			taskToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return taskToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTaskToStepRule() {
		if (serviceTaskToStepRuleEClass == null) {
			serviceTaskToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return serviceTaskToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow_LaneSet_Lane_FlowNode() {
		return getServiceTaskToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__Perform_FWD__IsApplicableMatch() {
		return getServiceTaskToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsApplicable_FWD__Match() {
		return getServiceTaskToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__RegisterObjectsToMatch_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow_LaneSet_Lane_FlowNode() {
		return getServiceTaskToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow_LaneSet_Lane_FlowNode() {
		return getServiceTaskToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceTaskToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceTask_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane_FlowNode() {
		return getServiceTaskToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceTaskToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__CheckTypes_FWD__Match() {
		return getServiceTaskToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD__Match_Actor_Step_NormalStep_Flow() {
		return getServiceTaskToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__Perform_BWD__IsApplicableMatch() {
		return getServiceTaskToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsApplicable_BWD__Match() {
		return getServiceTaskToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_Step_NormalStep_Flow() {
		return getServiceTaskToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_Step_NormalStep_Flow() {
		return getServiceTaskToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getServiceTaskToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet_Lane_FlowNode() {
		return getServiceTaskToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getServiceTaskToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__CheckTypes_BWD__Match() {
		return getServiceTaskToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getServiceTaskToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getServiceTaskToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getServiceTaskToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_SequenceFlowToUCFlow_Flow_LaneSet_Lane_FlowNode_ModelgeneratorRuleResult() {
		return getServiceTaskToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getServiceTaskToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTaskToStepRule() {
		if (userTaskToStepRuleEClass == null) {
			userTaskToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return userTaskToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow_LaneSet_FlowNode() {
		return getUserTaskToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__Perform_FWD__IsApplicableMatch() {
		return getUserTaskToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsApplicable_FWD__Match() {
		return getUserTaskToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__RegisterObjectsToMatch_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow_LaneSet_FlowNode() {
		return getUserTaskToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow_LaneSet_FlowNode() {
		return getUserTaskToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserTaskToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UserTask_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_Process_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_FlowNode() {
		return getUserTaskToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserTaskToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__CheckTypes_FWD__Match() {
		return getUserTaskToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD__Match_Actor_Step_NormalStep_Flow() {
		return getUserTaskToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__Perform_BWD__IsApplicableMatch() {
		return getUserTaskToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsApplicable_BWD__Match() {
		return getUserTaskToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_Step_NormalStep_Flow() {
		return getUserTaskToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_Step_NormalStep_Flow() {
		return getUserTaskToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserTaskToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_Process_SequenceFlowToUCFlow_Flow_LaneSet_FlowNode() {
		return getUserTaskToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserTaskToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__CheckTypes_BWD__Match() {
		return getUserTaskToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getUserTaskToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getUserTaskToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__GenerateModel__RuleEntryContainer_LaneToActor() {
		return getUserTaskToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_Process_SequenceFlowToUCFlow_Flow_LaneSet_FlowNode_ModelgeneratorRuleResult() {
		return getUserTaskToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserTaskToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterEventToStepCoreRule() {
		if (interEventToStepCoreRuleEClass == null) {
			interEventToStepCoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return interEventToStepCoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITEToStepRule() {
		if (iteToStepRuleEClass == null) {
			iteToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return iteToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow_FlowNode_Lane_LaneSet() {
		return getITEToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__Perform_FWD__IsApplicableMatch() {
		return getITEToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsApplicable_FWD__Match() {
		return getITEToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow_FlowNode_Lane_LaneSet() {
		return getITEToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow_FlowNode_Lane_LaneSet() {
		return getITEToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getITEToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateThrowEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNode_Lane_LaneSet() {
		return getITEToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getITEToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getITEToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__CheckTypes_FWD__Match() {
		return getITEToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getITEToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__Perform_BWD__IsApplicableMatch() {
		return getITEToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsApplicable_BWD__Match() {
		return getITEToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getITEToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getITEToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getITEToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNode_Lane_LaneSet() {
		return getITEToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getITEToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getITEToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__CheckTypes_BWD__Match() {
		return getITEToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge() {
		return getITEToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getITEToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getITEToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getITEToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNode_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getITEToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getITEToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getITEToStepRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepRule() {
		if (iceToStepRuleEClass == null) {
			iceToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return iceToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEventRule() {
		if (endEventRuleEClass == null) {
			endEventRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return endEventRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EndEvent_Lane_LaneSet() {
		return getEndEventRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__Perform_FWD__IsApplicableMatch() {
		return getEndEventRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsApplicable_FWD__Match() {
		return getEndEventRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EndEvent_Lane_LaneSet() {
		return getEndEventRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EndEvent_Lane_LaneSet() {
		return getEndEventRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getEndEventRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EndEvent_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_Lane_LaneSet() {
		return getEndEventRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsApplicable_checkCsp_FWD__CSP() {
		return getEndEventRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEventRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__CheckTypes_FWD__Match() {
		return getEndEventRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__CheckAttributes_FWD__TripleMatch() {
		return getEndEventRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getEndEventRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getEndEventRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__GenerateModel_checkCsp_BWD__CSP() {
		return getEndEventRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveGatewayToStepCoreRule() {
		if (exclusiveGatewayToStepCoreRuleEClass == null) {
			exclusiveGatewayToStepCoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(15);
		}
		return exclusiveGatewayToStepCoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__Perform_FWD__IsApplicableMatch() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_FWD__Match() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlowToUCFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_Flow_Actor_ProcessToActor_Lane_LaneSet() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__CheckTypes_FWD__Match() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD__Match_NormalStep_Flow_Actor() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__Perform_BWD__IsApplicableMatch() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_BWD__Match() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_Actor() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_Actor() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_SequenceFlowToUCFlow_Process_SequenceFlow_Flow_Actor_ProcessToActor_Lane_LaneSet() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__CheckTypes_BWD__Match() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_33__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_34__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_35__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_36__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_37__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_38__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__CheckAttributes_FWD__TripleMatch() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__CheckAttributes_BWD__TripleMatch() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlowToUCFlow_Process_SequenceFlow_Flow_Actor_ProcessToActor_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterEventToStepRule() {
		if (interEventToStepRuleEClass == null) {
			interEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return interEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstInterThrowEventToStepRule() {
		if (firstInterThrowEventToStepRuleEClass == null) {
			firstInterThrowEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return firstInterThrowEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_FlowNode_Lane_LaneSet() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__Perform_FWD__IsApplicableMatch() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsApplicable_FWD__Match() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_FlowNode_Lane_LaneSet() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_FlowNode_Lane_LaneSet() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNode_Lane_LaneSet() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__CheckTypes_FWD__Match() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__Perform_BWD__IsApplicableMatch() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsApplicable_BWD__Match() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_FlowNode_Lane_LaneSet() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__CheckTypes_BWD__Match() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_39__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_40__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_41__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_44__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_45__EMoflonEdge() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNode_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstInterThrowEventToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getFirstInterThrowEventToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstICEToStepRule() {
		if (firstICEToStepRuleEClass == null) {
			firstICEToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return firstICEToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGatewayToParallelStepCoreRule() {
		if (parallelGatewayToParallelStepCoreRuleEClass == null) {
			parallelGatewayToParallelStepCoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return parallelGatewayToParallelStepCoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway_LaneSet_Lane() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__Perform_FWD__IsApplicableMatch() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_FWD__Match() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway_LaneSet_Lane() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway_LaneSet_Lane() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_Flow_SequenceFlowToUCFlow_LaneSet_Lane() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__CheckTypes_FWD__Match() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_BWD__Match_ParallelStep_Flow() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__Perform_BWD__IsApplicableMatch() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_BWD__Match() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjectsToMatch_BWD__Match_ParallelStep_Flow() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_solveCsp_BWD__Match_ParallelStep_Flow() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelStep_Flow_SequenceFlowToUCFlow_LaneSet_Lane() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__CheckTypes_BWD__Match() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_46__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_47__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_48__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_49__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__CheckAttributes_BWD__TripleMatch() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Flow_SequenceFlowToUCFlow_LaneSet_Lane_ModelgeneratorRuleResult() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBasedGatewayToStepCoreRule() {
		if (eventBasedGatewayToStepCoreRuleEClass == null) {
			eventBasedGatewayToStepCoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(20);
		}
		return eventBasedGatewayToStepCoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EventBasedGateway_Lane_LaneSet() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__Perform_FWD__IsApplicableMatch() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_FWD__Match() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EventBasedGateway_Lane_LaneSet() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EventBasedGateway_Lane_LaneSet() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_checkCsp_FWD__CSP() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__CheckTypes_FWD__Match() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__Perform_BWD__IsApplicableMatch() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_BWD__Match() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__CheckTypes_BWD__Match() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_50__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_51__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_52__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_53__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__CheckAttributes_FWD__TripleMatch() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__CheckAttributes_BWD__TripleMatch() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveConvergingGatewayRule() {
		if (exclusiveConvergingGatewayRuleEClass == null) {
			exclusiveConvergingGatewayRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(21);
		}
		return exclusiveConvergingGatewayRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelConvergingGatewayRule() {
		if (parallelConvergingGatewayRuleEClass == null) {
			parallelConvergingGatewayRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(22);
		}
		return parallelConvergingGatewayRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow_Lane_LaneSet_ParallelGateway_SequenceFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__Perform_FWD__IsApplicableMatch() {
		return getParallelConvergingGatewayRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsApplicable_FWD__Match() {
		return getParallelConvergingGatewayRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow_Lane_LaneSet_ParallelGateway_SequenceFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow_Lane_LaneSet_ParallelGateway_SequenceFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelConvergingGatewayRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_ParallelStep_Lane_LaneSet_ParallelGateway_FlowNodeToStep_SequenceFlow_SequenceFlowToUCFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelConvergingGatewayRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelConvergingGatewayRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__CheckTypes_FWD__Match() {
		return getParallelConvergingGatewayRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_54__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_55__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_56__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_57__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_58__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_59__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_60__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelConvergingGatewayRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_ParallelStep_Lane_LaneSet_ParallelGateway_FlowNodeToStep_SequenceFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getParallelConvergingGatewayRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelConvergingGatewayRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqFlowAfterEGToAltFlowRule() {
		if (seqFlowAfterEGToAltFlowRuleEClass == null) {
			seqFlowAfterEGToAltFlowRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(23);
		}
		return seqFlowAfterEGToAltFlowRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_Process_SequenceFlow() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__Perform_FWD__IsApplicableMatch() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_FWD__Match() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_Process_SequenceFlow() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_Process_SequenceFlow() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_ExclusiveGateway_Process_SequenceFlow() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_checkCsp_FWD__CSP() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__CheckTypes_FWD__Match() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlow_AlternativeFlowAlternative() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__Perform_BWD__IsApplicableMatch() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_BWD__Match() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjectsToMatch_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlow_AlternativeFlowAlternative() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_solveCsp_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlow_AlternativeFlowAlternative() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlow_AlternativeFlowAlternative_ExclusiveGateway_Process() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_checkCsp_BWD__CSP() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__CheckTypes_BWD__Match() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_61__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_62__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_63__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__CheckAttributes_FWD__TripleMatch() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__CheckAttributes_BWD__TripleMatch() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_ExclusiveGateway_Process_ModelgeneratorRuleResult() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel_checkCsp_BWD__CSP() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqFlowAfterPGToParallelFlowRule() {
		if (seqFlowAfterPGToParallelFlowRuleEClass == null) {
			seqFlowAfterPGToParallelFlowRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(24);
		}
		return seqFlowAfterPGToParallelFlowRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_SequenceFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__Perform_FWD__IsApplicableMatch() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_FWD__Match() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_SequenceFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_SequenceFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_checkCsp_FWD__CSP() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__CheckTypes_FWD__Match() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD__Match_Flow_UseCase_ParallelStep_ParallelFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__Perform_BWD__IsApplicableMatch() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_BWD__Match() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjectsToMatch_BWD__Match_Flow_UseCase_ParallelStep_ParallelFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_solveCsp_BWD__Match_Flow_UseCase_ParallelStep_ParallelFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep_ParallelFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_checkCsp_BWD__CSP() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__CheckTypes_BWD__Match() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_64__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_65__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_66__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__CheckAttributes_FWD__TripleMatch() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__CheckAttributes_BWD__TripleMatch() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep_ModelgeneratorRuleResult() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel_checkCsp_BWD__CSP() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchEventAfterEBGToStepRule() {
		if (catchEventAfterEBGToStepRuleEClass == null) {
			catchEventAfterEBGToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(25);
		}
		return catchEventAfterEBGToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_Lane_LaneSet_SequenceFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__Perform_FWD__IsApplicableMatch() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_FWD__Match() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_Lane_LaneSet_SequenceFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_Lane_LaneSet_SequenceFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_Lane_LaneSet_SequenceFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__CheckTypes_FWD__Match() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__Perform_BWD__IsApplicableMatch() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_BWD__Match() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjectsToMatch_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_solveCsp_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlowAlternative_AlternativeFlow() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_AlternativeFlow_Lane_LaneSet() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__CheckTypes_BWD__Match() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_67__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_68__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_69__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_70__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_71__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_72__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_73__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_74__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_75__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_76__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveGatewayToStepRule() {
		if (exclusiveGatewayToStepRuleEClass == null) {
			exclusiveGatewayToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(26);
		}
		return exclusiveGatewayToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExclusiveGatewayToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__Perform_FWD__IsApplicableMatch() {
		return getExclusiveGatewayToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_FWD__Match() {
		return getExclusiveGatewayToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExclusiveGatewayToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExclusiveGatewayToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExclusiveGatewayToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_SequenceFlowToUCFlow_Process_ExclusiveGateway_SequenceFlow_Flow_Actor_ProcessToActor_Lane_LaneSet() {
		return getExclusiveGatewayToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExclusiveGatewayToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExclusiveGatewayToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__CheckTypes_FWD__Match() {
		return getExclusiveGatewayToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Flow_Actor() {
		return getExclusiveGatewayToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__Perform_BWD__IsApplicableMatch() {
		return getExclusiveGatewayToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_BWD__Match() {
		return getExclusiveGatewayToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Flow_Actor() {
		return getExclusiveGatewayToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Flow_Actor() {
		return getExclusiveGatewayToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_SequenceFlowToUCFlow_Process_Flow_Actor_ProcessToActor_Lane_LaneSet() {
		return getExclusiveGatewayToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExclusiveGatewayToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__CheckTypes_BWD__Match() {
		return getExclusiveGatewayToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_77__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_78__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_79__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_80__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_81__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_82__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_83__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_84__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getExclusiveGatewayToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getExclusiveGatewayToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getExclusiveGatewayToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_SequenceFlowToUCFlow_Process_Flow_Actor_ProcessToActor_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getExclusiveGatewayToStepRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepRule().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGatewayToParallelStepRule() {
		if (parallelGatewayToParallelStepRuleEClass == null) {
			parallelGatewayToParallelStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(27);
		}
		return parallelGatewayToParallelStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_ParallelGateway_LaneSet_Lane() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__Perform_FWD__IsApplicableMatch() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_FWD__Match() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_ParallelGateway_LaneSet_Lane() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_ParallelGateway_LaneSet_Lane() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_ParallelGateway_Flow_SequenceFlowToUCFlow_LaneSet_Lane() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__CheckTypes_FWD__Match() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD__Match_Step_ParallelStep_Flow() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__Perform_BWD__IsApplicableMatch() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_BWD__Match() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjectsToMatch_BWD__Match_Step_ParallelStep_Flow() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_solveCsp_BWD__Match_Step_ParallelStep_Flow() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_ParallelStep_Process_Flow_SequenceFlowToUCFlow_LaneSet_Lane() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__CheckTypes_BWD__Match() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_85__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_86__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_87__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_88__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__CheckAttributes_BWD__TripleMatch() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_Flow_SequenceFlowToUCFlow_LaneSet_Lane_ModelgeneratorRuleResult() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBasedGatewayToStepRule() {
		if (eventBasedGatewayToStepRuleEClass == null) {
			eventBasedGatewayToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(28);
		}
		return eventBasedGatewayToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_EventBasedGateway_Lane_LaneSet() {
		return getEventBasedGatewayToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__Perform_FWD__IsApplicableMatch() {
		return getEventBasedGatewayToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_FWD__Match() {
		return getEventBasedGatewayToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_EventBasedGateway_Lane_LaneSet() {
		return getEventBasedGatewayToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_EventBasedGateway_Lane_LaneSet() {
		return getEventBasedGatewayToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getEventBasedGatewayToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getEventBasedGatewayToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getEventBasedGatewayToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEventBasedGatewayToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__CheckTypes_FWD__Match() {
		return getEventBasedGatewayToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getEventBasedGatewayToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__Perform_BWD__IsApplicableMatch() {
		return getEventBasedGatewayToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_BWD__Match() {
		return getEventBasedGatewayToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getEventBasedGatewayToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getEventBasedGatewayToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getEventBasedGatewayToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEventBasedGatewayToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__CheckTypes_BWD__Match() {
		return getEventBasedGatewayToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_89__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_90__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_91__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_92__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getEventBasedGatewayToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getEventBasedGatewayToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getEventBasedGatewayToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getEventBasedGatewayToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaneStartEventRule() {
		if (laneStartEventRuleEClass == null) {
			laneStartEventRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(29);
		}
		return laneStartEventRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsAppropriate_FWD__Match_Lane_StartEvent_Process_LaneSet() {
		return getLaneStartEventRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__Perform_FWD__IsApplicableMatch() {
		return getLaneStartEventRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsApplicable_FWD__Match() {
		return getLaneStartEventRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__RegisterObjectsToMatch_FWD__Match_Lane_StartEvent_Process_LaneSet() {
		return getLaneStartEventRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsAppropriate_solveCsp_FWD__Match_Lane_StartEvent_Process_LaneSet() {
		return getLaneStartEventRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getLaneStartEventRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Lane_StartEvent_Process_LaneSet() {
		return getLaneStartEventRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsApplicable_checkCsp_FWD__CSP() {
		return getLaneStartEventRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getLaneStartEventRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__CheckTypes_FWD__Match() {
		return getLaneStartEventRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__IsAppropriate_FWD_EMoflonEdge_93__EMoflonEdge() {
		return getLaneStartEventRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__CheckAttributes_FWD__TripleMatch() {
		return getLaneStartEventRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__GenerateModel__RuleEntryContainer_Lane() {
		return getLaneStartEventRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lane_StartEvent_Process_LaneSet_ModelgeneratorRuleResult() {
		return getLaneStartEventRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneStartEventRule__GenerateModel_checkCsp_BWD__CSP() {
		return getLaneStartEventRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcConvGwAfterEventGwRule() {
		if (excConvGwAfterEventGwRuleEClass == null) {
			excConvGwAfterEventGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(30);
		}
		return excConvGwAfterEventGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD__Match_Process_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__Perform_FWD__IsApplicableMatch() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsApplicable_FWD__Match() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__RegisterObjectsToMatch_FWD__Match_Process_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_solveCsp_FWD__Match_Process_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_SeqFlowToAltFlowAlt_AlternativeFlow_ICEToAltFlow_SequenceFlow_ExclusiveGateway_SequenceFlow_SequenceFlowToUCFlow_Flow_Lane_LaneSet() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__CheckTypes_FWD__Match() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_94__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_95__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_96__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_97__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_98__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_99__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__IsAppropriate_FWD_EMoflonEdge_100__EMoflonEdge() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__CheckAttributes_FWD__TripleMatch() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_SeqFlowToAltFlowAlt_AlternativeFlow_ICEToAltFlow_SequenceFlow_SequenceFlowToUCFlow_Flow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterEventGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExcConvGwAfterEventGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcConvGwDefaultSeqFlowRule() {
		if (excConvGwDefaultSeqFlowRuleEClass == null) {
			excConvGwDefaultSeqFlowRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(31);
		}
		return excConvGwDefaultSeqFlowRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__Perform_FWD__IsApplicableMatch() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsApplicable_FWD__Match() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_SequenceFlow_Step_SequenceFlowToStep_Process_ExclusiveGateway_SequenceFlow_NormalStep_AlternativeFlowAlternative_Flow_SequenceFlowToUCFlow_FlowNodeToStep_SeqFlowToAltFlowAlt_AlternativeFlow_SequenceFlowToUCFlow_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__CheckTypes_FWD__Match() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_101__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_102__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_103__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_104__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_105__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_106__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_107__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_108__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__CheckAttributes_FWD__TripleMatch() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_SequenceFlow_Step_SequenceFlowToStep_Process_ExclusiveGateway_SequenceFlow_NormalStep_AlternativeFlowAlternative_Flow_SequenceFlowToUCFlow_FlowNodeToStep_SeqFlowToAltFlowAlt_AlternativeFlow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwDefaultSeqFlowRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExcConvGwDefaultSeqFlowRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelConvergingGatewayTwoInputsRule() {
		if (parallelConvergingGatewayTwoInputsRuleEClass == null) {
			parallelConvergingGatewayTwoInputsRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(32);
		}
		return parallelConvergingGatewayTwoInputsRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow_SequenceFlow_SequenceFlow_Lane_LaneSet_SequenceFlow() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__Perform_FWD__IsApplicableMatch() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsApplicable_FWD__Match() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow_SequenceFlow_SequenceFlow_Lane_LaneSet_SequenceFlow() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow_SequenceFlow_SequenceFlow_Lane_LaneSet_SequenceFlow() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_ParallelStep_SequenceFlowToUCFlow_SequenceFlow_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_Lane_LaneSet_SequenceFlow_SequenceFlowToUCFlow() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__CheckTypes_FWD__Match() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_111__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_112__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_113__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_114__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_115__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_116__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__IsAppropriate_FWD_EMoflonEdge_117__EMoflonEdge() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_ParallelStep_SequenceFlowToUCFlow_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_Lane_LaneSet_SequenceFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayTwoInputsRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelConvergingGatewayTwoInputsRule().getEOperations()
				.get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcConvGwAfterExDivGwRule() {
		if (excConvGwAfterExDivGwRuleEClass == null) {
			excConvGwAfterExDivGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(33);
		}
		return excConvGwAfterExDivGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD__Match_SequenceFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__Perform_FWD__IsApplicableMatch() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsApplicable_FWD__Match() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_NormalStep_AlternativeFlowAlternative_Flow_SequenceFlowToUCFlow_FlowNodeToStep_SeqFlowToAltFlowAlt_AlternativeFlow_SequenceFlowToUCFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__CheckTypes_FWD__Match() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_118__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_119__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_120__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_121__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_122__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_123__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__IsAppropriate_FWD_EMoflonEdge_124__EMoflonEdge() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__CheckAttributes_FWD__TripleMatch() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_NormalStep_AlternativeFlowAlternative_Flow_SequenceFlowToUCFlow_FlowNodeToStep_SeqFlowToAltFlowAlt_AlternativeFlow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcConvGwAfterExDivGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExcConvGwAfterExDivGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExConvGwAfterEventGwIceSeqFlowRule() {
		if (exConvGwAfterEventGwIceSeqFlowRuleEClass == null) {
			exConvGwAfterEventGwIceSeqFlowRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(34);
		}
		return exConvGwAfterEventGwIceSeqFlowRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_EventBasedGateway_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__Perform_FWD__IsApplicableMatch() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsApplicable_FWD__Match() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_EventBasedGateway_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_EventBasedGateway_SequenceFlow_ExclusiveGateway_SequenceFlow_Lane_LaneSet() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_Process_EventBasedGateway_SequenceFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_SeqFlowToAltFlowAlt_AlternativeFlow_ICEToAltFlow_ExclusiveGateway_SequenceFlow_SequenceFlowToUCFlow_Flow_Lane_LaneSet() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__CheckTypes_FWD__Match() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_125__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_126__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_127__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_128__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_129__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_130__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__IsAppropriate_FWD_EMoflonEdge_131__EMoflonEdge() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__CheckAttributes_FWD__TripleMatch() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_Process_EventBasedGateway_SequenceFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_SeqFlowToAltFlowAlt_AlternativeFlow_ICEToAltFlow_SequenceFlowToUCFlow_Flow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExConvGwAfterEventGwIceSeqFlowRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExConvGwAfterEventGwIceSeqFlowRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuationRule() {
		if (continuationRuleEClass == null) {
			continuationRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(35);
		}
		return continuationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsAppropriate_BWD__Match_AlternativeFlowAlternative_AlternativeFlow_NormalStep_Step() {
		return getContinuationRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__Perform_BWD__IsApplicableMatch() {
		return getContinuationRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsApplicable_BWD__Match() {
		return getContinuationRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__RegisterObjectsToMatch_BWD__Match_AlternativeFlowAlternative_AlternativeFlow_NormalStep_Step() {
		return getContinuationRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsAppropriate_solveCsp_BWD__Match_AlternativeFlowAlternative_AlternativeFlow_NormalStep_Step() {
		return getContinuationRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getContinuationRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_SequenceFlow_FlowNode_AlternativeFlowAlternative_AlternativeFlow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_Step_FlowNodeToStep() {
		return getContinuationRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsApplicable_checkCsp_BWD__CSP() {
		return getContinuationRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getContinuationRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__CheckTypes_BWD__Match() {
		return getContinuationRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge() {
		return getContinuationRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__CheckAttributes_BWD__TripleMatch() {
		return getContinuationRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getContinuationRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_SequenceFlow_FlowNode_AlternativeFlowAlternative_AlternativeFlow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_Step_FlowNodeToStep_ModelgeneratorRuleResult() {
		return getContinuationRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuationRule__GenerateModel_checkCsp_BWD__CSP() {
		return getContinuationRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterSERule() {
		if (iceToStepAfterSERuleEClass == null) {
			iceToStepAfterSERuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(36);
		}
		return iceToStepAfterSERuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD__Match_StartEvent_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterSERule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterSERule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsApplicable_FWD__Match() {
		return getICEToStepAfterSERule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__RegisterObjectsToMatch_FWD__Match_StartEvent_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterSERule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_solveCsp_FWD__Match_StartEvent_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterSERule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterSERule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterSERule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterSERule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterSERule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__CheckTypes_FWD__Match() {
		return getICEToStepAfterSERule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterSERule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterSERule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsApplicable_BWD__Match() {
		return getICEToStepAfterSERule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterSERule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterSERule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterSERule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterSERule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterSERule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterSERule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__CheckTypes_BWD__Match() {
		return getICEToStepAfterSERule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_132__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_133__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_134__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_135__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_136__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_137__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_138__EMoflonEdge() {
		return getICEToStepAfterSERule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterSERule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterSERule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__GenerateModel__RuleEntryContainer_ProcessToActor() {
		return getICEToStepAfterSERule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterSERule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterSERule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterSERule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterExGwRule() {
		if (iceToStepAfterExGwRuleEClass == null) {
			iceToStepAfterExGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(37);
		}
		return iceToStepAfterExGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD__Match_ExclusiveGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterExGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterExGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsApplicable_FWD__Match() {
		return getICEToStepAfterExGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterExGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterExGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterExGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterExGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterExGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterExGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__CheckTypes_FWD__Match() {
		return getICEToStepAfterExGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterExGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterExGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsApplicable_BWD__Match() {
		return getICEToStepAfterExGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterExGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterExGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterExGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterExGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterExGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterExGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__CheckTypes_BWD__Match() {
		return getICEToStepAfterExGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_139__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_140__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_141__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_142__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_143__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_144__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_145__EMoflonEdge() {
		return getICEToStepAfterExGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterExGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterExGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__GenerateModel__RuleEntryContainer_ProcessToActor() {
		return getICEToStepAfterExGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterExGwRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterExGwRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterPGRule() {
		if (iceToStepAfterPGRuleEClass == null) {
			iceToStepAfterPGRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(38);
		}
		return iceToStepAfterPGRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD__Match_ParallelGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterPGRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterPGRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsApplicable_FWD__Match() {
		return getICEToStepAfterPGRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__RegisterObjectsToMatch_FWD__Match_ParallelGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterPGRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterPGRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterPGRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterPGRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterPGRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterPGRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__CheckTypes_FWD__Match() {
		return getICEToStepAfterPGRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterPGRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterPGRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsApplicable_BWD__Match() {
		return getICEToStepAfterPGRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterPGRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getICEToStepAfterPGRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterPGRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterPGRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterPGRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterPGRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__CheckTypes_BWD__Match() {
		return getICEToStepAfterPGRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_146__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_147__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_148__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_149__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_150__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_151__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_152__EMoflonEdge() {
		return getICEToStepAfterPGRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterPGRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterPGRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__GenerateModel__RuleEntryContainer_ProcessToActor() {
		return getICEToStepAfterPGRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterPGRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPGRule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterPGRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterTaskRule() {
		if (iceToStepAfterTaskRuleEClass == null) {
			iceToStepAfterTaskRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(39);
		}
		return iceToStepAfterTaskRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD__Match_Task_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterTaskRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterTaskRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsApplicable_FWD__Match() {
		return getICEToStepAfterTaskRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__RegisterObjectsToMatch_FWD__Match_Task_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterTaskRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_solveCsp_FWD__Match_Task_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterTaskRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterTaskRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterTaskRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterTaskRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterTaskRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__CheckTypes_FWD__Match() {
		return getICEToStepAfterTaskRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterTaskRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterTaskRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsApplicable_BWD__Match() {
		return getICEToStepAfterTaskRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterTaskRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterTaskRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterTaskRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Task_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterTaskRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterTaskRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterTaskRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__CheckTypes_BWD__Match() {
		return getICEToStepAfterTaskRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_153__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_154__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_155__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_156__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_157__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_158__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_BWD_EMoflonEdge_45__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_BWD_EMoflonEdge_46__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__IsAppropriate_FWD_EMoflonEdge_159__EMoflonEdge() {
		return getICEToStepAfterTaskRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterTaskRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterTaskRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getICEToStepAfterTaskRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Task_SequenceFlow_Step_SequenceFlowToStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterTaskRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterTaskRule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterTaskRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterEventRule() {
		if (iceToStepAfterEventRuleEClass == null) {
			iceToStepAfterEventRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(40);
		}
		return iceToStepAfterEventRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD__Match_Event_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterEventRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterEventRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsApplicable_FWD__Match() {
		return getICEToStepAfterEventRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__RegisterObjectsToMatch_FWD__Match_Event_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterEventRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_solveCsp_FWD__Match_Event_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterEventRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterEventRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Event_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterEventRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterEventRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterEventRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__CheckTypes_FWD__Match() {
		return getICEToStepAfterEventRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterEventRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterEventRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsApplicable_BWD__Match() {
		return getICEToStepAfterEventRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterEventRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterEventRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterEventRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Event_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterEventRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterEventRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterEventRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__CheckTypes_BWD__Match() {
		return getICEToStepAfterEventRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_160__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_161__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_162__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_163__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_164__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_165__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__IsAppropriate_FWD_EMoflonEdge_166__EMoflonEdge() {
		return getICEToStepAfterEventRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterEventRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterEventRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getICEToStepAfterEventRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Event_SequenceFlow_Step_SequenceFlowToStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterEventRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterEventRule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterEventRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterExConvGwRule() {
		if (iceToStepAfterExConvGwRuleEClass == null) {
			iceToStepAfterExConvGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(41);
		}
		return iceToStepAfterExConvGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD__Match_ExclusiveGateway_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsApplicable_FWD__Match() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__CheckTypes_FWD__Match() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsApplicable_BWD__Match() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__CheckTypes_BWD__Match() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_167__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_168__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_169__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_170__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_171__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_172__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__IsAppropriate_FWD_EMoflonEdge_173__EMoflonEdge() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_SequenceFlow_Step_SequenceFlowToStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterExConvGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterExConvGwRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToStepAfterPConvGwRule() {
		if (iceToStepAfterPConvGwRuleEClass == null) {
			iceToStepAfterPConvGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(42);
		}
		return iceToStepAfterPConvGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD__Match_ParallelGateway_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__Perform_FWD__IsApplicableMatch() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsApplicable_FWD__Match() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__RegisterObjectsToMatch_FWD__Match_ParallelGateway_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow_Lane_LaneSet() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__CheckTypes_FWD__Match() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__Perform_BWD__IsApplicableMatch() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsApplicable_BWD__Match() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__CheckTypes_BWD__Match() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_174__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_175__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_176__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_177__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_178__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_179__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_BWD_EMoflonEdge_55__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__IsAppropriate_FWD_EMoflonEdge_180__EMoflonEdge() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__CheckAttributes_FWD__TripleMatch() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__CheckAttributes_BWD__TripleMatch() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_SequenceFlow_Step_SequenceFlowToStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_Lane_LaneSet_ModelgeneratorRuleResult() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICEToStepAfterPConvGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getICEToStepAfterPConvGwRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTaskToStepAfterSERule() {
		if (serviceTaskToStepAfterSERuleEClass == null) {
			serviceTaskToStepAfterSERuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(43);
		}
		return serviceTaskToStepAfterSERuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD__Match_StartEvent_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__Perform_FWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsApplicable_FWD__Match() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__RegisterObjectsToMatch_FWD__Match_StartEvent_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_solveCsp_FWD__Match_StartEvent_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__CheckTypes_FWD__Match() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__Perform_BWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsApplicable_BWD__Match() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_Actor_ProcessToActor_SequenceFlow_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsApplicable_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__CheckTypes_BWD__Match() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_181__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_182__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_183__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_184__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_185__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_BWD_EMoflonEdge_56__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_186__EMoflonEdge() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__CheckAttributes_FWD__TripleMatch() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__CheckAttributes_BWD__TripleMatch() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane_ModelgeneratorRuleResult() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterSERule__GenerateModel_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterSERule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTaskToStepAfterExGwRule() {
		if (serviceTaskToStepAfterExGwRuleEClass == null) {
			serviceTaskToStepAfterExGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(44);
		}
		return serviceTaskToStepAfterExGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD__Match_ExclusiveGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__Perform_FWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsApplicable_FWD__Match() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__CheckTypes_FWD__Match() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__Perform_BWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsApplicable_BWD__Match() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_Process_Actor_ProcessToActor_SequenceFlow_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__CheckTypes_BWD__Match() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_187__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_188__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_189__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_190__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_191__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_192__EMoflonEdge() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__CheckAttributes_FWD__TripleMatch() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__CheckAttributes_BWD__TripleMatch() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane_ModelgeneratorRuleResult() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterExGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterExGwRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTaskToStepAfterPGRule() {
		if (serviceTaskToStepAfterPGRuleEClass == null) {
			serviceTaskToStepAfterPGRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(45);
		}
		return serviceTaskToStepAfterPGRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD__Match_ParallelGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__Perform_FWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsApplicable_FWD__Match() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__CheckTypes_FWD__Match() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__Perform_BWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsApplicable_BWD__Match() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_Actor_ProcessToActor_SequenceFlow_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsApplicable_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__CheckTypes_BWD__Match() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_193__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_194__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_195__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_196__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_197__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_198__EMoflonEdge() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__CheckAttributes_FWD__TripleMatch() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__CheckAttributes_BWD__TripleMatch() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane_ModelgeneratorRuleResult() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterPGRule__GenerateModel_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterPGRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTaskToStepAfterEvGwRule() {
		if (serviceTaskToStepAfterEvGwRuleEClass == null) {
			serviceTaskToStepAfterEvGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(46);
		}
		return serviceTaskToStepAfterEvGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__Perform_FWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsApplicable_FWD__Match() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Process_ServiceTask_SequenceFlow_SequenceFlow_LaneSet_Lane() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__CheckTypes_FWD__Match() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__Perform_BWD__IsApplicableMatch() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsApplicable_BWD__Match() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Process_Actor_ProcessToActor_SequenceFlow_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet_Lane() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__CheckTypes_BWD__Match() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_199__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_200__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_201__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_202__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_203__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_204__EMoflonEdge() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__CheckAttributes_FWD__TripleMatch() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__CheckAttributes_BWD__TripleMatch() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet_Lane_ModelgeneratorRuleResult() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepAfterEvGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getServiceTaskToStepAfterEvGwRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTaskToStepAfterSERule() {
		if (userTaskToStepAfterSERuleEClass == null) {
			userTaskToStepAfterSERuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(47);
		}
		return userTaskToStepAfterSERuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD__Match_StartEvent_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterSERule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__Perform_FWD__IsApplicableMatch() {
		return getUserTaskToStepAfterSERule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsApplicable_FWD__Match() {
		return getUserTaskToStepAfterSERule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__RegisterObjectsToMatch_FWD__Match_StartEvent_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterSERule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_solveCsp_FWD__Match_StartEvent_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterSERule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterSERule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterSERule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterSERule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterSERule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__CheckTypes_FWD__Match() {
		return getUserTaskToStepAfterSERule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterSERule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__Perform_BWD__IsApplicableMatch() {
		return getUserTaskToStepAfterSERule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsApplicable_BWD__Match() {
		return getUserTaskToStepAfterSERule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterSERule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterSERule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterSERule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_Lane_Actor_LaneToActor_SequenceFlow_Process_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterSERule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterSERule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterSERule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__CheckTypes_BWD__Match() {
		return getUserTaskToStepAfterSERule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_205__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_206__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_207__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_208__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_209__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_FWD_EMoflonEdge_210__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_BWD_EMoflonEdge_64__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__IsAppropriate_BWD_EMoflonEdge_65__EMoflonEdge() {
		return getUserTaskToStepAfterSERule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__CheckAttributes_FWD__TripleMatch() {
		return getUserTaskToStepAfterSERule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__CheckAttributes_BWD__TripleMatch() {
		return getUserTaskToStepAfterSERule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__GenerateModel__RuleEntryContainer_LaneToActor() {
		return getUserTaskToStepAfterSERule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_Lane_Actor_LaneToActor_SequenceFlow_Process_SequenceFlowToUCFlow_Flow_LaneSet_ModelgeneratorRuleResult() {
		return getUserTaskToStepAfterSERule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterSERule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterSERule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTaskToStepAfterExGwRule() {
		if (userTaskToStepAfterExGwRuleEClass == null) {
			userTaskToStepAfterExGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(48);
		}
		return userTaskToStepAfterExGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD__Match_ExclusiveGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__Perform_FWD__IsApplicableMatch() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsApplicable_FWD__Match() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__CheckTypes_FWD__Match() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__Perform_BWD__IsApplicableMatch() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsApplicable_BWD__Match() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_Lane_Actor_LaneToActor_SequenceFlow_Process_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__CheckTypes_BWD__Match() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_211__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_212__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_213__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_214__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_215__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_FWD_EMoflonEdge_216__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_BWD_EMoflonEdge_66__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__IsAppropriate_BWD_EMoflonEdge_67__EMoflonEdge() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__CheckAttributes_FWD__TripleMatch() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__CheckAttributes_BWD__TripleMatch() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__GenerateModel__RuleEntryContainer_LaneToActor() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_Lane_Actor_LaneToActor_SequenceFlow_Process_SequenceFlowToUCFlow_Flow_LaneSet_ModelgeneratorRuleResult() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterExGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterExGwRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTaskToStepAfterPGRule() {
		if (userTaskToStepAfterPGRuleEClass == null) {
			userTaskToStepAfterPGRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(49);
		}
		return userTaskToStepAfterPGRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD__Match_ParallelGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__Perform_FWD__IsApplicableMatch() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsApplicable_FWD__Match() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__CheckTypes_FWD__Match() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__Perform_BWD__IsApplicableMatch() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsApplicable_BWD__Match() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Lane_Actor_LaneToActor_SequenceFlow_Process_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__CheckTypes_BWD__Match() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_217__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_218__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_219__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_220__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_221__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_FWD_EMoflonEdge_222__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_BWD_EMoflonEdge_68__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__IsAppropriate_BWD_EMoflonEdge_69__EMoflonEdge() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__CheckAttributes_FWD__TripleMatch() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__CheckAttributes_BWD__TripleMatch() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__GenerateModel__RuleEntryContainer_LaneToActor() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Lane_Actor_LaneToActor_SequenceFlow_Process_SequenceFlowToUCFlow_Flow_LaneSet_ModelgeneratorRuleResult() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterPGRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterPGRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTaskToStepAfterEvGwRule() {
		if (userTaskToStepAfterEvGwRuleEClass == null) {
			userTaskToStepAfterEvGwRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(50);
		}
		return userTaskToStepAfterEvGwRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__Perform_FWD__IsApplicableMatch() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsApplicable_FWD__Match() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Lane_UserTask_SequenceFlow_Process_SequenceFlow_LaneSet() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsApplicable_checkCsp_FWD__CSP() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__CheckTypes_FWD__Match() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__Perform_BWD__IsApplicableMatch() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsApplicable_BWD__Match() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Lane_Actor_LaneToActor_SequenceFlow_Process_NormalStep_SequenceFlowToUCFlow_Flow_LaneSet() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsApplicable_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__CheckTypes_BWD__Match() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_223__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_224__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_225__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_226__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_227__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_FWD_EMoflonEdge_228__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_BWD_EMoflonEdge_70__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__IsAppropriate_BWD_EMoflonEdge_71__EMoflonEdge() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__CheckAttributes_FWD__TripleMatch() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__CheckAttributes_BWD__TripleMatch() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__GenerateModel__RuleEntryContainer_LaneToActor() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_EventBasedGateway_Lane_Actor_LaneToActor_SequenceFlow_Process_SequenceFlowToUCFlow_Flow_LaneSet_ModelgeneratorRuleResult() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepAfterEvGwRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserTaskToStepAfterEvGwRule().getEOperations().get(32);
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
			eClassifier.setInstanceClassName("BpmnToUseCaseIntegration.Rules."
					+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
