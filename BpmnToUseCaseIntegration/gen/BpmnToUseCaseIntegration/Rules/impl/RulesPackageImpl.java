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
	private EClass intermediateEventToStepCoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateThrowEventToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateCatchEventToStepRuleEClass = null;

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
	private EClass intermediateEventToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstIntermediateThrowEventToStepRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstIntermediateCatchEventToStepRuleEClass = null;

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
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD_DocumentRoot_4__DocumentRoot() {
		return getBpModelToUseCaseModelRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD_UseCasesModel_4__UseCasesModel() {
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
	public EOperation getBpModelToUseCaseModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult() {
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
	public EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel() {
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
	public EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel() {
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
	public EOperation getDefinitionsToPackageRule__IsAppropriate_FWD_EMoflonEdge_436__EMoflonEdge() {
		return getDefinitionsToPackageRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__IsAppropriate_BWD_EMoflonEdge_184__EMoflonEdge() {
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
	public EOperation getDefinitionsToPackageRule__GenerateModel__RuleEntryContainer_DocumentRootToUseCasesModel() {
		return getDefinitionsToPackageRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinitionsToPackageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult() {
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
	public EOperation getProcessToUseCaseRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_Process_StartEvent_SequenceFlow() {
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
	public EOperation getProcessToUseCaseRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_BasicFlow_Actor() {
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
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_437__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_185__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_186__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_438__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_439__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_187__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_440__EMoflonEdge() {
		return getProcessToUseCaseRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_441__EMoflonEdge() {
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
	public EOperation getProcessToUseCaseRule__GenerateModel__RuleEntryContainer_DefinitionsToPackageDeclaration() {
		return getProcessToUseCaseRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessToUseCaseRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_Process_UseCase_ProcessToUseCase_StartEvent_BasicFlow_StartEventToBasicFlow_SequenceFlow_SequenceFlowToUCFlow_Actor_ProcessToActor_ModelgeneratorRuleResult() {
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
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD__Match_Process_ServiceTask_SequenceFlow_SequenceFlow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__Perform_FWD__IsApplicableMatch() {
		return getFirstServiceTaskToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsApplicable_FWD__Match() {
		return getFirstServiceTaskToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__RegisterObjectsToMatch_FWD__Match_Process_ServiceTask_SequenceFlow_SequenceFlow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_Process_ServiceTask_SequenceFlow_SequenceFlow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getFirstServiceTaskToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_SequenceFlowToUCFlow_Flow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getFirstServiceTaskToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstServiceTaskToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__CheckTypes_FWD__Match() {
		return getFirstServiceTaskToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__Perform_BWD__IsApplicableMatch() {
		return getFirstServiceTaskToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsApplicable_BWD__Match() {
		return getFirstServiceTaskToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getFirstServiceTaskToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_SequenceFlow_NormalStep_SequenceFlowToUCFlow_Flow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getFirstServiceTaskToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstServiceTaskToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__CheckTypes_BWD__Match() {
		return getFirstServiceTaskToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_442__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_443__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_444__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_445__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_446__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_188__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_189__EMoflonEdge() {
		return getFirstServiceTaskToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getFirstServiceTaskToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getFirstServiceTaskToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getFirstServiceTaskToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_NormalStep_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult() {
		return getFirstServiceTaskToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstServiceTaskToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getFirstServiceTaskToStepRule().getEOperations().get(31);
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
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD__Match_Lane_UserTask_SequenceFlow_Process_SequenceFlow() {
		return getFirstUserTaskToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__Perform_FWD__IsApplicableMatch() {
		return getFirstUserTaskToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsApplicable_FWD__Match() {
		return getFirstUserTaskToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__RegisterObjectsToMatch_FWD__Match_Lane_UserTask_SequenceFlow_Process_SequenceFlow() {
		return getFirstUserTaskToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_Lane_UserTask_SequenceFlow_Process_SequenceFlow() {
		return getFirstUserTaskToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getFirstUserTaskToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_SequenceFlowToUCFlow_Flow() {
		return getFirstUserTaskToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getFirstUserTaskToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstUserTaskToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__CheckTypes_FWD__Match() {
		return getFirstUserTaskToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstUserTaskToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__Perform_BWD__IsApplicableMatch() {
		return getFirstUserTaskToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsApplicable_BWD__Match() {
		return getFirstUserTaskToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstUserTaskToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstUserTaskToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getFirstUserTaskToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Lane_Actor_LaneToActor_SequenceFlow_Process_NormalStep_SequenceFlowToUCFlow_Flow() {
		return getFirstUserTaskToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getFirstUserTaskToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstUserTaskToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__CheckTypes_BWD__Match() {
		return getFirstUserTaskToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_447__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_448__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_449__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_450__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_451__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_452__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_453__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_190__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_191__EMoflonEdge() {
		return getFirstUserTaskToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getFirstUserTaskToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getFirstUserTaskToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__GenerateModel__RuleEntryContainer_LaneToActor_SequenceFlowToUCFlow() {
		return getFirstUserTaskToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_NormalStep_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult() {
		return getFirstUserTaskToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstUserTaskToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getFirstUserTaskToStepRule().getEOperations().get(33);
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
	public EOperation getLaneSetRule__IsAppropriate_FWD_EMoflonEdge_454__EMoflonEdge() {
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
	public EOperation getLaneSetRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_LaneSet_ModelgeneratorRuleResult() {
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
	public EOperation getLaneToActorRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_ProcessToUseCase_Lane() {
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
	public EOperation getLaneToActorRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_ProcessToUseCase_Actor() {
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
	public EOperation getLaneToActorRule__IsAppropriate_FWD_EMoflonEdge_455__EMoflonEdge() {
		return getLaneToActorRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__IsAppropriate_BWD_EMoflonEdge_192__EMoflonEdge() {
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
	public EOperation getLaneToActorRule__GenerateModel__RuleEntryContainer_DefinitionsToPackageDeclaration() {
		return getLaneToActorRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneToActorRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_ProcessToUseCase_Lane_Actor_LaneToActor_ModelgeneratorRuleResult() {
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
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow() {
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
	public EOperation getServiceTaskToStepRule__RegisterObjectsToMatch_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow() {
		return getServiceTaskToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow() {
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
	public EOperation getServiceTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceTask_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_SequenceFlow_SequenceFlowToUCFlow_Flow() {
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
	public EOperation getServiceTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getServiceTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_SequenceFlowToUCFlow_Flow() {
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
	public EOperation getServiceTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_193__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_456__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_457__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_458__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_459__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_460__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_194__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_195__EMoflonEdge() {
		return getServiceTaskToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getServiceTaskToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getServiceTaskToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getServiceTaskToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ServiceTask_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_SequenceFlow_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult() {
		return getServiceTaskToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTaskToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getServiceTaskToStepRule().getEOperations().get(32);
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
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow() {
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
	public EOperation getUserTaskToStepRule__RegisterObjectsToMatch_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow() {
		return getUserTaskToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow() {
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
	public EOperation getUserTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UserTask_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_Process_SequenceFlow_SequenceFlowToUCFlow_Flow() {
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
	public EOperation getUserTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUserTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_Process_SequenceFlowToUCFlow_Flow() {
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
	public EOperation getUserTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_461__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_196__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_462__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_463__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_464__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_465__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_466__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_467__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_197__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_198__EMoflonEdge() {
		return getUserTaskToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getUserTaskToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getUserTaskToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__GenerateModel__RuleEntryContainer_LaneToActor_SequenceFlowToStep() {
		return getUserTaskToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UserTask_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_Process_SequenceFlow_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult() {
		return getUserTaskToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTaskToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getUserTaskToStepRule().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateEventToStepCoreRule() {
		if (intermediateEventToStepCoreRuleEClass == null) {
			intermediateEventToStepCoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return intermediateEventToStepCoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateThrowEventToStepRule() {
		if (intermediateThrowEventToStepRuleEClass == null) {
			intermediateThrowEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return intermediateThrowEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__Perform_FWD__IsApplicableMatch() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsApplicable_FWD__Match() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateThrowEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__CheckTypes_FWD__Match() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__Perform_BWD__IsApplicableMatch() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsApplicable_BWD__Match() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__CheckTypes_BWD__Match() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_199__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_468__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_469__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_470__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_471__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_472__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_473__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_200__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_201__EMoflonEdge() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateThrowEvent_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_SequenceFlow_Actor_ProcessToActor_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateThrowEventToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getIntermediateThrowEventToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateCatchEventToStepRule() {
		if (intermediateCatchEventToStepRuleEClass == null) {
			intermediateCatchEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return intermediateCatchEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__Perform_FWD__IsApplicableMatch() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsApplicable_FWD__Match() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__CheckTypes_FWD__Match() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__Perform_BWD__IsApplicableMatch() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsApplicable_BWD__Match() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__CheckTypes_BWD__Match() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_202__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_474__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_475__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_476__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_477__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_478__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_479__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_203__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_204__EMoflonEdge() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_SequenceFlow_Actor_ProcessToActor_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateCatchEventToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getIntermediateCatchEventToStepRule().getEOperations().get(33);
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
	public EOperation getEndEventRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EndEvent() {
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
	public EOperation getEndEventRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EndEvent() {
		return getEndEventRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EndEvent() {
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
	public EOperation getEndEventRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EndEvent_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getEndEventRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_480__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_481__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_482__EMoflonEdge() {
		return getEndEventRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__CheckAttributes_FWD__TripleMatch() {
		return getEndEventRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getEndEventRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EndEvent_Flow_SequenceFlowToUCFlow_EndEventToFlow_ModelgeneratorRuleResult() {
		return getEndEventRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEventRule__GenerateModel_checkCsp_BWD__CSP() {
		return getEndEventRule().getEOperations().get(16);
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
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow() {
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
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow() {
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
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlowToUCFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_Flow_Actor_ProcessToActor() {
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
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_SequenceFlowToUCFlow_Process_SequenceFlow_Flow_Actor_ProcessToActor() {
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
	public EOperation getExclusiveGatewayToStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_205__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_483__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_484__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_485__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_486__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_487__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_488__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_489__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_206__EMoflonEdge() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__CheckAttributes_FWD__TripleMatch() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__CheckAttributes_BWD__TripleMatch() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_NormalStep_SequenceFlowToUCFlow_SequenceFlowToUCFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_FlowNodeToStep_SequenceFlowToStep_Flow_Actor_ProcessToActor_ModelgeneratorRuleResult() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepCoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepCoreRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateEventToStepRule() {
		if (intermediateEventToStepRuleEClass == null) {
			intermediateEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return intermediateEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstIntermediateThrowEventToStepRule() {
		if (firstIntermediateThrowEventToStepRuleEClass == null) {
			firstIntermediateThrowEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return firstIntermediateThrowEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__Perform_FWD__IsApplicableMatch() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_FWD__Match() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__CheckTypes_FWD__Match() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__Perform_BWD__IsApplicableMatch() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_BWD__Match() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__CheckTypes_BWD__Match() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_490__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_491__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_492__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_493__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_494__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_495__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_207__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_208__EMoflonEdge() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_NormalStep_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateThrowEventToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getFirstIntermediateThrowEventToStepRule().getEOperations().get(
				32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstIntermediateCatchEventToStepRule() {
		if (firstIntermediateCatchEventToStepRuleEClass == null) {
			firstIntermediateCatchEventToStepRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return firstIntermediateCatchEventToStepRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__Perform_FWD__IsApplicableMatch() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_FWD__Match() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_checkCsp_FWD__CSP() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__CheckTypes_FWD__Match() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__Perform_BWD__IsApplicableMatch() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_BWD__Match() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_checkCsp_BWD__CSP() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__CheckTypes_BWD__Match() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_496__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_497__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_498__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_499__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_500__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_501__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_209__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_210__EMoflonEdge() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_NormalStep_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirstIntermediateCatchEventToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getFirstIntermediateCatchEventToStepRule().getEOperations().get(
				32);
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
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway() {
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
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway() {
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
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelStep_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_502__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_503__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_504__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_BWD_EMoflonEdge_211__EMoflonEdge() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__CheckAttributes_BWD__TripleMatch() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_ParallelStep_Flow_FlowNodeToStep_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepCoreRule().getEOperations().get(
				28);
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
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EventBasedGateway() {
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
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EventBasedGateway() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EventBasedGateway() {
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
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getEventBasedGatewayToStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_505__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_506__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_507__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_212__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_213__EMoflonEdge() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__CheckAttributes_FWD__TripleMatch() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__CheckAttributes_BWD__TripleMatch() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_FlowNodeToStep_ModelgeneratorRuleResult() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepCoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepCoreRule().getEOperations().get(29);
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
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__Perform_FWD__IsApplicableMatch() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsApplicable_FWD__Match() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_AlternativeFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_NormalStep_AlternativeFlowAlternative_Flow() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsApplicable_checkCsp_FWD__CSP() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__CheckTypes_FWD__Match() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_508__EMoflonEdge() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_509__EMoflonEdge() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_510__EMoflonEdge() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_511__EMoflonEdge() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_512__EMoflonEdge() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_513__EMoflonEdge() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__CheckAttributes_FWD__TripleMatch() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_AlternativeFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_Flow_SequenceFlowToUCFlow_SequenceFlowToStep_ModelgeneratorRuleResult() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveConvergingGatewayRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExclusiveConvergingGatewayRule().getEOperations().get(19);
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
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow() {
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
	public EOperation getParallelConvergingGatewayRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow() {
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
	public EOperation getParallelConvergingGatewayRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_ParallelStep() {
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
	public EOperation getParallelConvergingGatewayRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_514__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_515__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_516__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_517__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_518__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_519__EMoflonEdge() {
		return getParallelConvergingGatewayRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelConvergingGatewayRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow() {
		return getParallelConvergingGatewayRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_ParallelStep_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_ModelgeneratorRuleResult() {
		return getParallelConvergingGatewayRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelConvergingGatewayRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelConvergingGatewayRule().getEOperations().get(19);
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
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_214__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_215__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_216__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_520__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_521__EMoflonEdge() {
		return getSeqFlowAfterEGToAltFlowRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_522__EMoflonEdge() {
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
	public EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlow_SequenceFlowToUCFlow_AlternativeFlowAlternative_SequenceFlowToAlternativeFlowAlternative_ExclusiveGateway_Process_SequenceFlow_ModelgeneratorRuleResult() {
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
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_523__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_524__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_525__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD_EMoflonEdge_217__EMoflonEdge() {
		return getSeqFlowAfterPGToParallelFlowRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD_EMoflonEdge_218__EMoflonEdge() {
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
	public EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep_ParallelFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
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
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent() {
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
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent() {
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
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep() {
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
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getCatchEventAfterEBGToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_AlternativeFlow() {
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
	public EOperation getCatchEventAfterEBGToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_526__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_527__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_528__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_529__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_530__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_531__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_219__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_220__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_221__EMoflonEdge() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__GenerateModel__RuleEntryContainer_FlowNodeToStep() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_SequenceFlowToAlternativeFlowAlternative_AlternativeFlow_SequenceFlowToUCFlow_IntermediateCatchEventToAlternativeFlow_ModelgeneratorRuleResult() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEventAfterEBGToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getCatchEventAfterEBGToStepRule().getEOperations().get(33);
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
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow() {
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
	public EOperation getExclusiveGatewayToStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow() {
		return getExclusiveGatewayToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow() {
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
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_SequenceFlowToUCFlow_Process_ExclusiveGateway_SequenceFlow_Flow_Actor_ProcessToActor() {
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
	public EOperation getExclusiveGatewayToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getExclusiveGatewayToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_SequenceFlowToUCFlow_Process_Flow_Actor_ProcessToActor() {
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
	public EOperation getExclusiveGatewayToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_222__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_223__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_532__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_533__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_534__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_535__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_536__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_537__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_538__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_224__EMoflonEdge() {
		return getExclusiveGatewayToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getExclusiveGatewayToStepRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getExclusiveGatewayToStepRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getExclusiveGatewayToStepRule().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_SequenceFlowToUCFlow_SequenceFlowToUCFlow_Process_ExclusiveGateway_SequenceFlow_FlowNodeToStep_SequenceFlowToStep_Flow_Actor_ProcessToActor_ModelgeneratorRuleResult() {
		return getExclusiveGatewayToStepRule().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGatewayToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getExclusiveGatewayToStepRule().getEOperations().get(34);
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
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_ParallelGateway() {
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
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_ParallelGateway() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_ParallelGateway() {
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
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_ParallelGateway_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getParallelGatewayToParallelStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_ParallelStep_Process_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getParallelGatewayToParallelStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD_EMoflonEdge_225__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_539__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_540__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_541__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD_EMoflonEdge_226__EMoflonEdge() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__CheckAttributes_FWD__TripleMatch() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__CheckAttributes_BWD__TripleMatch() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_ParallelStep_Process_ParallelGateway_Flow_FlowNodeToStep_SequenceFlowToUCFlow_ModelgeneratorRuleResult() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGatewayToParallelStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGatewayToParallelStepRule().getEOperations().get(29);
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
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_EventBasedGateway() {
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
	public EOperation getEventBasedGatewayToStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_EventBasedGateway() {
		return getEventBasedGatewayToStepRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_EventBasedGateway() {
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
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getEventBasedGatewayToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getEventBasedGatewayToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow() {
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
	public EOperation getEventBasedGatewayToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_227__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_542__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_543__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_544__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_228__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_229__EMoflonEdge() {
		return getEventBasedGatewayToStepRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__CheckAttributes_FWD__TripleMatch() {
		return getEventBasedGatewayToStepRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__CheckAttributes_BWD__TripleMatch() {
		return getEventBasedGatewayToStepRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep() {
		return getEventBasedGatewayToStepRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNodeToStep_ModelgeneratorRuleResult() {
		return getEventBasedGatewayToStepRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBasedGatewayToStepRule__GenerateModel_checkCsp_BWD__CSP() {
		return getEventBasedGatewayToStepRule().getEOperations().get(30);
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
