/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/UseCaseToModalSequenceDiagramIntegration/model/UseCaseToModalSequenceDiagramIntegration.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UCModelToMSDModelRuleImpl <em>UC Model To MSD Model Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UCModelToMSDModelRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUCModelToMSDModelRule()
	 * @generated
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE = 0;

	/**
	 * The number of structural features of the '<em>UC Model To MSD Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Use Cases Model 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_0__USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Model 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_0__MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>UC Model To MSD Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UCPackageToMSDPackageImpl <em>UC Package To MSD Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UCPackageToMSDPackageImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUCPackageToMSDPackage()
	 * @generated
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>UC Package To MSD Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD__MATCH_MODEL_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASESMODELTOMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>UC Package To MSD Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCaseToInteractionRuleImpl <em>Use Case To Interaction Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCaseToInteractionRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUseCaseToInteractionRule()
	 * @generated
	 */
	int USE_CASE_TO_INTERACTION_RULE = 2;

	/**
	 * The number of structural features of the '<em>Use Case To Interaction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_INTERACTION_USECASETOINTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Use Case To Interaction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.ActorToClassRuleImpl <em>Actor To Class Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.ActorToClassRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getActorToClassRule()
	 * @generated
	 */
	int ACTOR_TO_CLASS_RULE = 3;

	/**
	 * The number of structural features of the '<em>Actor To Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_ACTOR_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Actor To Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_CLASS_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepToMessageRuleImpl <em>Normal Step To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE = 4;

	/**
	 * The number of structural features of the '<em>Normal Step To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_MESSAGE_INTERACTION_NORMALSTEPTOMESSAGE_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The number of operations of the '<em>Normal Step To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBasicFlowToMessageRuleImpl <em>Normal Step Basic Flow To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBasicFlowToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepBasicFlowToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE = 5;

	/**
	 * The number of structural features of the '<em>Normal Step Basic Flow To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_MESSAGE_INTERACTION_NORMALSTEPTOMESSAGE_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BASICFLOW_USECASE_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 16</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 17</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 18</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 19</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 21</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 22</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 23</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 24</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_24__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 25</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 26</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_26__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_27__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_MESSAGE_NORMALSTEPTOMESSAGE_LIFELINE_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 77;

	/**
	 * The number of operations of the '<em>Normal Step Basic Flow To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 78;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepNamedFlowToMessageRuleImpl <em>Normal Step Named Flow To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepNamedFlowToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepNamedFlowToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE = 6;

	/**
	 * The number of structural features of the '<em>Normal Step Named Flow To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_MESSAGE_INTERACTION_NORMALSTEPTOMESSAGE_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_NAMEDFLOW_USECASE_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NAMEDFLOW_USECASE_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NAMEDFLOW_USECASE_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_INTERACTION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_INTERACTION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_INTERACTION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_USECASE_USECASETOINTERACTION_MESSAGE_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 28</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 29</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 30</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 31</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_39__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 41</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_USECASE_USECASETOINTERACTION_NORMALSTEP_MESSAGE_INTERACTION_NORMALSTEPTOMESSAGE_LIFELINE_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 77;

	/**
	 * The number of operations of the '<em>Normal Step Named Flow To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 78;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepToCombinedFragmentRuleImpl <em>Step To Combined Fragment Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepToCombinedFragmentRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getStepToCombinedFragmentRule()
	 * @generated
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE = 7;

	/**
	 * The number of structural features of the '<em>Step To Combined Fragment Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_NORMALSTEP_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_INTERACTION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_USECASETOINTERACTION_FLOW_NORMALSTEP_MESSAGE_INTERACTION_NORMALSTEPTOMESSAGE_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_USECASE_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_LIFELINE_USECASE_USECASETOINTERACTION_FLOW_INTERACTION_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_ACTOR_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 42</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_42__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 43</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 44</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 45</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_45__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 46</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_46__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 47</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_47__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 48</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_48__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 52</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 53</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_53__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 54</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_54__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 55</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_55__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 56</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_56__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_57__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 77;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 78;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 79;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 80;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_COMBINEDFRAGMENT_NORMALSTEPTOCOMBINEDFRAGMENT_INTERACTIONOPERAND_STEPALTERNATIVETOINTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_ALTERNATIVEFLOW_LIFELINE_USECASE_USECASETOINTERACTION_FLOW_MESSAGE_INTERACTION_NORMALSTEPTOMESSAGE_MESSAGEOCCURRENCESPECIFICATION_MESSAGEOCCURRENCESPECIFICATION_ACTOR_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 81;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 82;

	/**
	 * The number of operations of the '<em>Step To Combined Fragment Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_COMBINED_FRAGMENT_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 83;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepAltToOperandRuleImpl <em>Step Alt To Operand Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepAltToOperandRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getStepAltToOperandRule()
	 * @generated
	 */
	int STEP_ALT_TO_OPERAND_RULE = 8;

	/**
	 * The number of structural features of the '<em>Step Alt To Operand Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_FLOW_USECASE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 59</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_59__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_14__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 60</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_60__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 61</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_61__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 62</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 63</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_63__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 16</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_16__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_NORMALSTEPTOCOMBINEDFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_ALTERNATIVEFLOWALTERNATIVE_INTERACTIONOPERAND_STEPALTERNATIVETOINTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_ALTERNATIVEFLOW_FLOW_USECASE_LIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Step Alt To Operand Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule <em>UC Model To MSD Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Model To MSD Model Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule
	 * @generated
	 */
	EClass getUCModelToMSDModelRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_FWD__Match_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__RegisterObjectsToMatch_FWD__Match_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_solveCsp_FWD__Match_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_BWD__Match_Model();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__RegisterObjectsToMatch_BWD__Match_Model();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_solveCsp_BWD__Match_Model();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Model) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_0(UseCaseDSL.UseCasesModel) <em>Is Appropriate FWD Use Cases Model 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Use Cases Model 0</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_0(UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_0__UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_0(ModalSequenceDiagram.Model) <em>Is Appropriate BWD Model 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Model 0</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_0(ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_0__Model();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage <em>UC Package To MSD Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Package To MSD Package</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage
	 * @generated
	 */
	EClass getUCPackageToMSDPackage();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_FWD__Match_UseCasesModel_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__RegisterObjectsToMatch_FWD__Match_UseCasesModel_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_solveCsp_FWD__Match_UseCasesModel_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model, ModalSequenceDiagram.Package) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_BWD__Match_Model_Package();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model, ModalSequenceDiagram.Package) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__RegisterObjectsToMatch_BWD__Match_Model_Package();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model, ModalSequenceDiagram.Package) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Model, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_solveCsp_BWD__Match_Model_Package();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, ModalSequenceDiagram.Package) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_Package();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__GenerateModel__RuleEntryContainer_UseCasesModelToModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_PackageDeclaration_Package_PackageDeclarationToPackage_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule <em>Use Case To Interaction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case To Interaction Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule
	 * @generated
	 */
	EClass getUseCaseToInteractionRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD__Match_PackageDeclaration_UseCase_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_UseCase_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_UseCase_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_BWD__Match_Package_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__RegisterObjectsToMatch_BWD__Match_Package_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_solveCsp_BWD__Match_Package_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__GenerateModel__RuleEntryContainer_PackageDeclarationToPackage();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_Interaction_UseCaseToInteraction_BasicFlow_FlowToInteractionFragment_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule <em>Actor To Class Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor To Class Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule
	 * @generated
	 */
	EClass getActorToClassRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToClassRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getActorToClassRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getActorToClassRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.Actor, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.Actor, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToClassRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Actor_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToClassRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getActorToClassRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToClassRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToClassRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getActorToClassRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToClassRule__RegisterObjectsToMatch_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_solveCsp_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToClassRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToClassRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getActorToClassRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToClassRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_FWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_FWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_BWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#isAppropriate_BWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToClassRule__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getActorToClassRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getActorToClassRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage)
	 * @generated
	 */
	EOperation getActorToClassRule__GenerateModel__RuleEntryContainer_PackageDeclarationToPackage();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getActorToClassRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Actor_Lifeline_ActorToLifeline_Interaction_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToClassRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToClassRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule <em>Normal Step To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule
	 * @generated
	 */
	EClass getNormalStepToMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_FWD__Match_UseCase_Flow_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__RegisterObjectsToMatch_FWD__Match_UseCase_Flow_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Flow_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_UseCaseToInteraction_Flow_NormalStep_Interaction_Lifeline_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__RegisterObjectsToMatch_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_UseCaseToInteraction_Flow_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_FWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_FWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_FWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_FWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#isAppropriate_BWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.NormalStep, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.NormalStep, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_UseCaseToInteraction_Flow_NormalStep_Message_Interaction_NormalStepToMessage_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Lifeline_Actor_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepToMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule <em>Normal Step Basic Flow To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step Basic Flow To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule
	 * @generated
	 */
	EClass getNormalStepBasicFlowToMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_FWD__Match_BasicFlow_UseCase_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__RegisterObjectsToMatch_FWD__Match_BasicFlow_UseCase_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_solveCsp_FWD__Match_BasicFlow_UseCase_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Lifeline_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD__Match_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__RegisterObjectsToMatch_BWD__Match_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_solveCsp_BWD__Match_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Message_Lifeline_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 14</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 15</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 16</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 16</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_17(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 17</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 17</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_17(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_18(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 18</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 18</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_18(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_19(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 19</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 19</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_19(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_20(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 20</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_20(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_21(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 21</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 21</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_21(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_22(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 22</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 22</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_22(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_23(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 23</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 23</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_23(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_24(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 24</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 24</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_24(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_25(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 25</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 25</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_25(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_26(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 26</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 26</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_26(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_27(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 27</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 27</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_27(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Message, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Message, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Message_NormalStepToMessage_Lifeline_Actor_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBasicFlowToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepBasicFlowToMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule <em>Normal Step Named Flow To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step Named Flow To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule
	 * @generated
	 */
	EClass getNormalStepNamedFlowToMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_FWD__Match_NamedFlow_UseCase_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__RegisterObjectsToMatch_FWD__Match_NamedFlow_UseCase_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_solveCsp_FWD__Match_NamedFlow_UseCase_NormalStep_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_InteractionOperand_NamedFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Interaction_Lifeline_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD__Match_InteractionOperand_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Interaction_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__RegisterObjectsToMatch_BWD__Match_InteractionOperand_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Interaction_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_solveCsp_BWD__Match_InteractionOperand_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Message_Interaction_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_MessageOccurrenceSpecification_UseCase_UseCaseToInteraction_Message_Interaction_Lifeline_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_28(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 28</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 28</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_28(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 29</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 29</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 30</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 30</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 31</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 31</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_FWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_32(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_32(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_33(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 33</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_33(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_34(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 34</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_34(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_35(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 35</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_35(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_36(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_36(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_37(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_37(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_38(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_38(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_39(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 39</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_39(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_40(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 40</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_40(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_41(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 41</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 41</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#isAppropriate_BWD_EMoflonEdge_41(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.Lifeline, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_MessageOccurrenceSpecification_UseCase_UseCaseToInteraction_NormalStep_Message_Interaction_NormalStepToMessage_Lifeline_Actor_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNamedFlowToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNormalStepNamedFlowToMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule <em>Step To Combined Fragment Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step To Combined Fragment Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule
	 * @generated
	 */
	EClass getStepToCombinedFragmentRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_UseCase_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__RegisterObjectsToMatch_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_UseCase_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_UseCase_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Interaction, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Interaction, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Lifeline_UseCase_UseCaseToInteraction_Flow_Interaction_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__RegisterObjectsToMatch_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_solveCsp_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline_UseCase_UseCaseToInteraction_Flow_Message_Interaction_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Actor_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_42(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 42</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_42(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_43(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 43</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 43</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_43(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_44(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 44</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 44</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_44(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_45(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 45</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 45</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_45(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_45__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_46(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 46</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 46</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_46(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_46__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_47(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 47</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 47</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_47(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_48(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 48</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 48</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_48(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_49(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 49</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_49(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_50(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 50</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_50(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_51(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 51</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_51(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_52(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 52</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 52</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_52(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_53(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 53</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 53</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_53(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_54(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 54</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 54</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_54(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_55(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 55</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 55</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_55(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_55__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_56(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 56</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 56</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_56(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_56__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 57</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 58</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, ModalSequenceDiagram.CombinedFragment, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.AlternativeFlow, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, ModalSequenceDiagram.CombinedFragment, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.AlternativeFlow, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_NormalStep_AlternativeFlowAlternative_CombinedFragment_NormalStepToCombinedFragment_InteractionOperand_StepAlternativeToInteractionOperand_InteractionConstraint_LiteralString_AlternativeFlow_Lifeline_UseCase_UseCaseToInteraction_Flow_Message_Interaction_NormalStepToMessage_MessageOccurrenceSpecification_MessageOccurrenceSpecification_Actor_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToCombinedFragmentRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepToCombinedFragmentRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule <em>Step Alt To Operand Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Alt To Operand Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule
	 * @generated
	 */
	EClass getStepAltToOperandRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjectsToMatch_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_CombinedFragment_NormalStep_NormalStepToCombinedFragment_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjectsToMatch_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_solveCsp_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CombinedFragment_NormalStep_NormalStepToCombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Flow_UseCase_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_59(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 59</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 59</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_59(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 14</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 15</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_60(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 60</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 60</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_60(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_61(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 61</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 61</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_61(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_62(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 62</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 62</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_62(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_63(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 63</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 63</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_63(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 16</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 16</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__GenerateModel__RuleEntryContainer_NormalStepToCombinedFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.AlternativeFlowAlternative, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.AlternativeFlowAlternative, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_CombinedFragment_NormalStep_NormalStepToCombinedFragment_AlternativeFlowAlternative_InteractionOperand_StepAlternativeToInteractionOperand_InteractionConstraint_LiteralString_AlternativeFlow_Flow_UseCase_Lifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
