/**
 */
package BpmnToUseCaseIntegration.Rules;

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
 * @see BpmnToUseCaseIntegration.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/BpmnToUseCaseIntegration/model/BpmnToUseCaseIntegration.ecore#//Rules";

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
	RulesPackage eINSTANCE = BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.BpModelToUseCaseModelRuleImpl <em>Bp Model To Use Case Model Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.BpModelToUseCaseModelRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getBpModelToUseCaseModelRule()
	 * @generated
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE = 0;

	/**
	 * The number of structural features of the '<em>Bp Model To Use Case Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Document Root 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD_DOCUMENT_ROOT_1__DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Use Cases Model 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD_USE_CASES_MODEL_1__USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Bp Model To Use Case Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODEL_TO_USE_CASE_MODEL_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.DefinitionsToPackageRuleImpl <em>Definitions To Package Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.DefinitionsToPackageRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getDefinitionsToPackageRule()
	 * @generated
	 */
	int DEFINITIONS_TO_PACKAGE_RULE = 1;

	/**
	 * The number of structural features of the '<em>Definitions To Package Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_DOCUMENTROOT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 109</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_109__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 46</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_46__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DOCUMENTROOTTOUSECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Definitions To Package Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ProcessToUseCaseRuleImpl <em>Process To Use Case Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ProcessToUseCaseRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getProcessToUseCaseRule()
	 * @generated
	 */
	int PROCESS_TO_USE_CASE_RULE = 2;

	/**
	 * The number of structural features of the '<em>Process To Use Case Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 110</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_110__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 47</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_47__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 48</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_48__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 111</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_111__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 112</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_112__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 113</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_113__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 114</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_114__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DEFINITIONSTOPACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_PROCESS_USECASE_PROCESSTOUSECASE_STARTEVENT_BASICFLOW_STARTEVENTTOBASICFLOW_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Process To Use Case Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TO_USE_CASE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.TaskToStepCoreRuleImpl <em>Task To Step Core Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.TaskToStepCoreRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getTaskToStepCoreRule()
	 * @generated
	 */
	int TASK_TO_STEP_CORE_RULE = 3;

	/**
	 * The number of structural features of the '<em>Task To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_STEP_CORE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_STEP_CORE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.FirstServiceTaskToStepRuleImpl <em>First Service Task To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.FirstServiceTaskToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getFirstServiceTaskToStepRule()
	 * @generated
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE = 4;

	/**
	 * The number of structural features of the '<em>First Service Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_ACTOR_PROCESSTOACTOR_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_ACTOR_PROCESSTOACTOR_SEQUENCEFLOW_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 115</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_115__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 116</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_116__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 117</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_117__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 118</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_118__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 119</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_119__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_ACTOR_PROCESSTOACTOR_SERVICETASK_SEQUENCEFLOW_SEQUENCEFLOW_NORMALSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>First Service Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_SERVICE_TASK_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.FirstUserTaskToStepRuleImpl <em>First User Task To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.FirstUserTaskToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getFirstUserTaskToStepRule()
	 * @generated
	 */
	int FIRST_USER_TASK_TO_STEP_RULE = 5;

	/**
	 * The number of structural features of the '<em>First User Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_LANE_USERTASK_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LANE_USERTASK_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LANE_USERTASK_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LANE_USERTASK_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANE_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 120</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_120__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 121</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 122</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 123</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_123__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 124</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_124__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 125</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_125__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 126</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_126__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 52</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 53</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_53__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_LANETOACTOR_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANE_USERTASK_ACTOR_LANETOACTOR_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW_NORMALSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>First User Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_USER_TASK_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.LaneSetRuleImpl <em>Lane Set Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.LaneSetRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getLaneSetRule()
	 * @generated
	 */
	int LANE_SET_RULE = 6;

	/**
	 * The number of structural features of the '<em>Lane Set Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_LANESET = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_LANESET = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_LANESET = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_LANESET = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 127</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_127__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_LANESET_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Lane Set Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.LaneToActorRuleImpl <em>Lane To Actor Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.LaneToActorRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getLaneToActorRule()
	 * @generated
	 */
	int LANE_TO_ACTOR_RULE = 7;

	/**
	 * The number of structural features of the '<em>Lane To Actor Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_PROCESSTOUSECASE_LANE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_PROCESSTOUSECASE_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 128</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_128__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 54</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_54__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DEFINITIONSTOPACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_PROCESSTOUSECASE_LANE_ACTOR_LANETOACTOR_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Lane To Actor Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_TO_ACTOR_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.TaskToStepRuleImpl <em>Task To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.TaskToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getTaskToStepRule()
	 * @generated
	 */
	int TASK_TO_STEP_RULE = 8;

	/**
	 * The number of structural features of the '<em>Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ServiceTaskToStepRuleImpl <em>Service Task To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ServiceTaskToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getServiceTaskToStepRule()
	 * @generated
	 */
	int SERVICE_TASK_TO_STEP_RULE = 9;

	/**
	 * The number of structural features of the '<em>Service Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SERVICETASK_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICETASK_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICETASK_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICETASK_PROCESS_ACTOR_PROCESSTOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOSTEP_STEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_STEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_STEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_STEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_ACTOR_PROCESSTOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOSTEP_STEP_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 55</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_55__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 129</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_129__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 130</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_130__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 131</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_131__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 132</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_132__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 133</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_133__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 56</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_56__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_57__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SERVICETASK_PROCESS_ACTOR_PROCESSTOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOSTEP_STEP_NORMALSTEP_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Service Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.UserTaskToStepRuleImpl <em>User Task To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.UserTaskToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getUserTaskToStepRule()
	 * @generated
	 */
	int USER_TASK_TO_STEP_RULE = 10;

	/**
	 * The number of structural features of the '<em>User Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_USERTASK_LANE_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USERTASK_LANE_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USERTASK_LANE_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USERTASK_LANE_ACTOR_LANETOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOSTEP_STEP_PROCESS_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_STEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_STEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_STEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANE_ACTOR_LANETOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOSTEP_STEP_NORMALSTEP_PROCESS_SEQUENCEFLOWTOUCFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 134</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_134__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 135</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_135__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 136</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_136__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 137</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_137__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 138</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_138__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 139</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_139__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 140</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_140__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 59</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_59__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 60</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_60__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_LANETOACTOR_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USERTASK_LANE_ACTOR_LANETOACTOR_SEQUENCEFLOW_SEQUENCEFLOWTOSTEP_STEP_NORMALSTEP_PROCESS_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The number of operations of the '<em>User Task To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.IntermediateEventToStepCoreRuleImpl <em>Intermediate Event To Step Core Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.IntermediateEventToStepCoreRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getIntermediateEventToStepCoreRule()
	 * @generated
	 */
	int INTERMEDIATE_EVENT_TO_STEP_CORE_RULE = 11;

	/**
	 * The number of structural features of the '<em>Intermediate Event To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_TO_STEP_CORE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate Event To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_TO_STEP_CORE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.IntermediateThrowEventToStepRuleImpl <em>Intermediate Throw Event To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.IntermediateThrowEventToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getIntermediateThrowEventToStepRule()
	 * @generated
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE = 12;

	/**
	 * The number of structural features of the '<em>Intermediate Throw Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 61</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_61__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 141</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_141__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 142</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_142__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 143</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 144</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_144__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 145</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_145__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 146</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_146__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 62</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 63</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_63__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Intermediate Throw Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.IntermediateCatchEventToStepRuleImpl <em>Intermediate Catch Event To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.IntermediateCatchEventToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getIntermediateCatchEventToStepRule()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE = 13;

	/**
	 * The number of structural features of the '<em>Intermediate Catch Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 64</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_64__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 147</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_147__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 148</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_148__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 149</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_149__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 150</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_150__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 151</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 152</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_152__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 65</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_65__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 66</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_66__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Intermediate Catch Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.EndEventRuleImpl <em>End Event Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.EndEventRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getEndEventRule()
	 * @generated
	 */
	int END_EVENT_RULE = 14;

	/**
	 * The number of structural features of the '<em>End Event Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 153</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_153__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 154</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_154__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 155</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_155__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ENDEVENT_FLOW_SEQUENCEFLOWTOUCFLOW_ENDEVENTTOFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>End Event Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ExclusiveGatewayToStepCoreRuleImpl <em>Exclusive Gateway To Step Core Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ExclusiveGatewayToStepCoreRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getExclusiveGatewayToStepCoreRule()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE = 15;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 67</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_67__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 156</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_156__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 157</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_157__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 158</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_158__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 159</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_159__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 160</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_160__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 161</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_161__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 162</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_162__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 68</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_68__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Exclusive Gateway To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.IntermediateEventToStepRuleImpl <em>Intermediate Event To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.IntermediateEventToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getIntermediateEventToStepRule()
	 * @generated
	 */
	int INTERMEDIATE_EVENT_TO_STEP_RULE = 16;

	/**
	 * The number of structural features of the '<em>Intermediate Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.FirstIntermediateThrowEventToStepRuleImpl <em>First Intermediate Throw Event To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.FirstIntermediateThrowEventToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getFirstIntermediateThrowEventToStepRule()
	 * @generated
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE = 17;

	/**
	 * The number of structural features of the '<em>First Intermediate Throw Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 163</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_163__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 164</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_164__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 165</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_165__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 166</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_166__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 167</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_167__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 168</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_168__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 69</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_69__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 70</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_70__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATETHROWEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>First Intermediate Throw Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_THROW_EVENT_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.FirstIntermediateCatchEventToStepRuleImpl <em>First Intermediate Catch Event To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.FirstIntermediateCatchEventToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getFirstIntermediateCatchEventToStepRule()
	 * @generated
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE = 18;

	/**
	 * The number of structural features of the '<em>First Intermediate Catch Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATECATCHEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATECATCHEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATECATCHEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 169</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_169__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 170</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_170__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 171</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_171__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 172</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_172__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 173</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_173__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 174</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_174__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 71</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 72</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_72__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_PROCESS_SEQUENCEFLOW_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>First Intermediate Catch Event To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_INTERMEDIATE_CATCH_EVENT_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ParallelGatewayToParallelStepCoreRuleImpl <em>Parallel Gateway To Parallel Step Core Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ParallelGatewayToParallelStepCoreRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getParallelGatewayToParallelStepCoreRule()
	 * @generated
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE = 19;

	/**
	 * The number of structural features of the '<em>Parallel Gateway To Parallel Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELSTEP_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 175</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_175__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 176</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_176__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 177</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_177__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_73__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELSTEP_FLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Parallel Gateway To Parallel Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.EventBasedGatewayToStepCoreRuleImpl <em>Event Based Gateway To Step Core Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.EventBasedGatewayToStepCoreRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getEventBasedGatewayToStepCoreRule()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE = 20;

	/**
	 * The number of structural features of the '<em>Event Based Gateway To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 178</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 179</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_179__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Event Based Gateway To Step Core Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_CORE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ExclusiveConvergingGatewayRuleImpl <em>Exclusive Converging Gateway Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ExclusiveConvergingGatewayRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getExclusiveConvergingGatewayRule()
	 * @generated
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE = 21;

	/**
	 * The number of structural features of the '<em>Exclusive Converging Gateway Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_EXCLUSIVEGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 181</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_181__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 182</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_182__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 183</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_183__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 184</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_184__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 185</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_185__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 186</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_186__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_EXCLUSIVEGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>Exclusive Converging Gateway Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CONVERGING_GATEWAY_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ParallelConvergingGatewayRuleImpl <em>Parallel Converging Gateway Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ParallelConvergingGatewayRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getParallelConvergingGatewayRule()
	 * @generated
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE = 22;

	/**
	 * The number of structural features of the '<em>Parallel Converging Gateway Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 187</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_187__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 188</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_188__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 189</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_189__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 190</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_190__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 191</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_191__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 192</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_192__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_FLOW_PARALLELSTEP_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>Parallel Converging Gateway Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_CONVERGING_GATEWAY_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.SeqFlowAfterEGToAltFlowRuleImpl <em>Seq Flow After EG To Alt Flow Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.SeqFlowAfterEGToAltFlowRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getSeqFlowAfterEGToAltFlowRule()
	 * @generated
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE = 23;

	/**
	 * The number of structural features of the '<em>Seq Flow After EG To Alt Flow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOW_ALTERNATIVEFLOWALTERNATIVE_EXCLUSIVEGATEWAY_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 76</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 77</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 78</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 193</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_193__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 194</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_194__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 195</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_195__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_PROCESSTOUSECASE_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_ALTERNATIVEFLOWALTERNATIVE_SEQUENCEFLOWTOALTERNATIVEFLOWALTERNATIVE_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Seq Flow After EG To Alt Flow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_EG_TO_ALT_FLOW_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.SeqFlowAfterPGToParallelFlowRuleImpl <em>Seq Flow After PG To Parallel Flow Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.SeqFlowAfterPGToParallelFlowRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getSeqFlowAfterPGToParallelFlowRule()
	 * @generated
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE = 24;

	/**
	 * The number of structural features of the '<em>Seq Flow After PG To Parallel Flow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_USECASE_PARALLELSTEP_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 196</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_196__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 197</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_197__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 198</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_198__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 79</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 80</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_FLOW_SEQUENCEFLOWTOUCFLOW_USECASE_PROCESSTOUSECASE_PARALLELSTEP_FLOWNODETOSTEP_PARALLELFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Seq Flow After PG To Parallel Flow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FLOW_AFTER_PG_TO_PARALLEL_FLOW_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.CatchEventAfterEBGToStepRuleImpl <em>Catch Event After EBG To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.CatchEventAfterEBGToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getCatchEventAfterEBGToStepRule()
	 * @generated
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE = 25;

	/**
	 * The number of structural features of the '<em>Catch Event After EBG To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 199</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_199__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 200</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_200__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 201</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_201__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 202</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_202__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 203</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_203__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 204</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_204__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 81</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 82</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 83</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_SEQUENCEFLOW_INTERMEDIATECATCHEVENT_USECASE_PROCESSTOUSECASE_FLOW_SEQUENCEFLOWTOUCFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_SEQUENCEFLOWTOALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_INTERMEDIATECATCHEVENTTOALTERNATIVEFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Catch Event After EBG To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_AFTER_EBG_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ExclusiveGatewayToStepRuleImpl <em>Exclusive Gateway To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ExclusiveGatewayToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getExclusiveGatewayToStepRule()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE = 26;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 67</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_67__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 156</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_156__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 157</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_157__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 158</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_158__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 159</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_159__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 160</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_160__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 161</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_161__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 162</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_162__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 68</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_68__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_FLOW_ACTOR_PROCESSTOACTOR = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 84</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 85</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_85__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 205</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_205__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 206</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_206__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 207</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_207__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 208</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_208__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 209</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_209__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 210</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_210__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 211</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_211__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 86</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_86__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 68;

	/**
	 * The number of operations of the '<em>Exclusive Gateway To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 69;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.ParallelGatewayToParallelStepRuleImpl <em>Parallel Gateway To Parallel Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.ParallelGatewayToParallelStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getParallelGatewayToParallelStepRule()
	 * @generated
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE = 27;

	/**
	 * The number of structural features of the '<em>Parallel Gateway To Parallel Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELSTEP_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 175</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_175__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 176</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_176__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 177</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_177__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_73__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELSTEP_FLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 87</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 212</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_212__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 213</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_213__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 214</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_214__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 88</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PARALLELSTEP_PROCESS_PARALLELGATEWAY_FLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 58;

	/**
	 * The number of operations of the '<em>Parallel Gateway To Parallel Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_TO_PARALLEL_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 59;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.Rules.impl.EventBasedGatewayToStepRuleImpl <em>Event Based Gateway To Step Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.Rules.impl.EventBasedGatewayToStepRuleImpl
	 * @see BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl#getEventBasedGatewayToStepRule()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE = 28;

	/**
	 * The number of structural features of the '<em>Event Based Gateway To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ACTOR_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 178</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 179</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_179__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_NORMALSTEP_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_PROCESS_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_ACTOR_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 89</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_89__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 215</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_215__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 216</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_216__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 217</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_217__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_PROCESS_EVENTBASEDGATEWAY_ACTOR_PROCESSTOACTOR_FLOW_SEQUENCEFLOWTOUCFLOW_FLOWNODETOSTEP_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 60;

	/**
	 * The number of operations of the '<em>Event Based Gateway To Step Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_TO_STEP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 61;

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule <em>Bp Model To Use Case Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Model To Use Case Model Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule
	 * @generated
	 */
	EClass getBpModelToUseCaseModelRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.DocumentRoot) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD__Match_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.DocumentRoot) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__RegisterObjectsToMatch_FWD__Match_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.DocumentRoot) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_FWD__Match_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.DocumentRoot) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD__Match_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__RegisterObjectsToMatch_BWD__Match_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_solveCsp_BWD__Match_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_FWD_DocumentRoot_1(bpmn2.DocumentRoot) <em>Is Appropriate FWD Document Root 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Document Root 1</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_FWD_DocumentRoot_1(bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_FWD_DocumentRoot_1__DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_BWD_UseCasesModel_1(UseCaseDSL.UseCasesModel) <em>Is Appropriate BWD Use Cases Model 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Use Cases Model 1</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#isAppropriate_BWD_UseCasesModel_1(UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__IsAppropriate_BWD_UseCasesModel_1__UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getBpModelToUseCaseModelRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule <em>Definitions To Package Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions To Package Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule
	 * @generated
	 */
	EClass getDefinitionsToPackageRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.DocumentRoot) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_FWD__Match_Definitions_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.DocumentRoot) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__RegisterObjectsToMatch_FWD__Match_Definitions_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.DocumentRoot) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.DocumentRoot)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_solveCsp_FWD__Match_Definitions_DocumentRoot();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCasesModel) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCasesModel) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCasesModel) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_FWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 109</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 109</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_FWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_BWD_EMoflonEdge_46(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 46</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 46</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#isAppropriate_BWD_EMoflonEdge_46(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__IsAppropriate_BWD_EMoflonEdge_46__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__GenerateModel__RuleEntryContainer_DocumentRootToUseCasesModel();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, bpmn2.DocumentRoot, UseCaseDSL.UseCasesModel, BpmnToUseCaseIntegration.DocumentRootToUseCasesModel, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_DocumentRoot_UseCasesModel_DocumentRootToUseCasesModel_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getDefinitionsToPackageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule <em>Process To Use Case Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process To Use Case Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule
	 * @generated
	 */
	EClass getProcessToUseCaseRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_FWD__Match_Definitions_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__RegisterObjectsToMatch_FWD__Match_Definitions_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Definitions, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_solveCsp_FWD__Match_Definitions_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, bpmn2.Process, bpmn2.StartEvent, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCase_BasicFlow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCase_BasicFlow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCase_BasicFlow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.BasicFlow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_BasicFlow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 110</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD_EMoflonEdge_47(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 47</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 47</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD_EMoflonEdge_47(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD_EMoflonEdge_48(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 48</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 48</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD_EMoflonEdge_48(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 111</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 111</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_111__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 112</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 112</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_112__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD_EMoflonEdge_49(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 49</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_BWD_EMoflonEdge_49(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 113</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 113</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_113__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 114</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 114</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#isAppropriate_FWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__IsAppropriate_FWD_EMoflonEdge_114__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__GenerateModel__RuleEntryContainer_DefinitionsToPackageDeclaration();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, bpmn2.Process, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.StartEvent, UseCaseDSL.BasicFlow, BpmnToUseCaseIntegration.StartEventToBasicFlow, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, bpmn2.Process, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.StartEvent, UseCaseDSL.BasicFlow, BpmnToUseCaseIntegration.StartEventToBasicFlow, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_Process_UseCase_ProcessToUseCase_StartEvent_BasicFlow_StartEventToBasicFlow_SequenceFlow_SequenceFlowToUCFlow_Actor_ProcessToActor_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcessToUseCaseRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.TaskToStepCoreRule <em>Task To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task To Step Core Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.TaskToStepCoreRule
	 * @generated
	 */
	EClass getTaskToStepCoreRule();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule <em>First Service Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Service Task To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule
	 * @generated
	 */
	EClass getFirstServiceTaskToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD__Match_Process_ServiceTask_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__RegisterObjectsToMatch_FWD__Match_Process_ServiceTask_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_Process_ServiceTask_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_SequenceFlow_NormalStep_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 115</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 115</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_115__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 116</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 116</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_116__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 117</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 117</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_117__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 118</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 118</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_118__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 119</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 119</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_119__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_50(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 50</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_50(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_51(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 51</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_51(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.ServiceTask, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_ServiceTask_SequenceFlow_SequenceFlow_NormalStep_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstServiceTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstServiceTaskToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule <em>First User Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First User Task To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule
	 * @generated
	 */
	EClass getFirstUserTaskToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Lane, bpmn2.UserTask, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Lane, bpmn2.UserTask, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD__Match_Lane_UserTask_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Lane, bpmn2.UserTask, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Lane, bpmn2.UserTask, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__RegisterObjectsToMatch_FWD__Match_Lane_UserTask_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Lane, bpmn2.UserTask, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Lane, bpmn2.UserTask, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_Lane_UserTask_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, bpmn2.UserTask, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, bpmn2.UserTask, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, bpmn2.Process, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, bpmn2.Process, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Lane_Actor_LaneToActor_SequenceFlow_Process_NormalStep_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 120</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 120</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_120__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 121</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 121</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_121__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 122</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 122</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_122__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 123</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 123</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_123__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 124</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 124</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_124__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 125</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 125</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_125__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 126</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 126</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_126__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_52(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 52</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 52</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_52(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_53(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 53</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 53</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_53(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.LaneToActor, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.LaneToActor, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__GenerateModel__RuleEntryContainer_LaneToActor_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, bpmn2.UserTask, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, bpmn2.UserTask, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lane_UserTask_Actor_LaneToActor_SequenceFlow_Process_SequenceFlow_NormalStep_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstUserTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstUserTaskToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule <em>Lane Set Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane Set Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule
	 * @generated
	 */
	EClass getLaneSetRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.LaneSet) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.LaneSet)
	 * @generated
	 */
	EOperation getLaneSetRule__IsAppropriate_FWD__Match_Process_LaneSet();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLaneSetRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLaneSetRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.LaneSet) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.LaneSet)
	 * @generated
	 */
	EOperation getLaneSetRule__RegisterObjectsToMatch_FWD__Match_Process_LaneSet();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.LaneSet) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.LaneSet)
	 * @generated
	 */
	EOperation getLaneSetRule__IsAppropriate_solveCsp_FWD__Match_Process_LaneSet();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneSetRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.LaneSet) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.LaneSet)
	 * @generated
	 */
	EOperation getLaneSetRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_LaneSet();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneSetRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLaneSetRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLaneSetRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_FWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 127</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 127</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#isAppropriate_FWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLaneSetRule__IsAppropriate_FWD_EMoflonEdge_127__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLaneSetRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, bpmn2.Process) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, bpmn2.Process)
	 * @generated
	 */
	EOperation getLaneSetRule__GenerateModel__RuleEntryContainer_Process();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.LaneSet, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.LaneSet, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLaneSetRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_LaneSet_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneSetRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneSetRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneSetRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule <em>Lane To Actor Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane To Actor Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule
	 * @generated
	 */
	EClass getLaneToActorRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, bpmn2.Lane) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, bpmn2.Lane)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_FWD__Match_LaneSet_Process_Definitions_Lane();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLaneToActorRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, bpmn2.Lane) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, bpmn2.Lane)
	 * @generated
	 */
	EOperation getLaneToActorRule__RegisterObjectsToMatch_FWD__Match_LaneSet_Process_Definitions_Lane();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, bpmn2.Lane) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, bpmn2.Lane)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_solveCsp_FWD__Match_LaneSet_Process_Definitions_Lane();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.Lane) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.Lane)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_ProcessToUseCase_Lane();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLaneToActorRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLaneToActorRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.Actor) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_BWD__Match_PackageDeclaration_UseCase_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLaneToActorRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.Actor) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getLaneToActorRule__RegisterObjectsToMatch_BWD__Match_PackageDeclaration_UseCase_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.Actor) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_solveCsp_BWD__Match_PackageDeclaration_UseCase_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Actor) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_ProcessToUseCase_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLaneToActorRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLaneToActorRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_FWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 128</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 128</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_FWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_FWD_EMoflonEdge_128__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_BWD_EMoflonEdge_54(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 54</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 54</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#isAppropriate_BWD_EMoflonEdge_54(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLaneToActorRule__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLaneToActorRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLaneToActorRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration)
	 * @generated
	 */
	EOperation getLaneToActorRule__GenerateModel__RuleEntryContainer_DefinitionsToPackageDeclaration();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.LaneSet, bpmn2.Process, bpmn2.Definitions, UseCaseDSL.PackageDeclaration, BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLaneToActorRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_LaneSet_Process_Definitions_PackageDeclaration_DefinitionsToPackageDeclaration_UseCase_ProcessToUseCase_Lane_Actor_LaneToActor_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.LaneToActorRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.LaneToActorRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLaneToActorRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.TaskToStepRule <em>Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.TaskToStepRule
	 * @generated
	 */
	EClass getTaskToStepRule();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule <em>Service Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Task To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule
	 * @generated
	 */
	EClass getServiceTaskToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.ServiceTask, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.ServiceTask, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.ServiceTask, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.ServiceTask, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__RegisterObjectsToMatch_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.ServiceTask, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.ServiceTask, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_ServiceTask_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.ServiceTask, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.ServiceTask, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceTask_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_SequenceFlow_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_BWD__Match_Actor_Step_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_Step_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_Step_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_55(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 55</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 55</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_55(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_55__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 129</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 129</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_129__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 130</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 130</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_130__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 131</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_131__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 132</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_132__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 133</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_FWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_133__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_56(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 56</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 56</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_56(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_56__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 57</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.ServiceTask, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.ServiceTask, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ServiceTask_Process_Actor_ProcessToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_SequenceFlow_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ServiceTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getServiceTaskToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule <em>User Task To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule
	 * @generated
	 */
	EClass getUserTaskToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.UserTask, bpmn2.Lane, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.UserTask, bpmn2.Lane, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.UserTask, bpmn2.Lane, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.UserTask, bpmn2.Lane, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__RegisterObjectsToMatch_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.UserTask, bpmn2.Lane, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.UserTask, bpmn2.Lane, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_solveCsp_FWD__Match_UserTask_Lane_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.UserTask, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, bpmn2.Process, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.UserTask, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, bpmn2.Process, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UserTask_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_Process_SequenceFlow_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_BWD__Match_Actor_Step_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_Step_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_Step_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, bpmn2.Process, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, bpmn2.Process, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_Process_SequenceFlowToUCFlow_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 134</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_134__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 58</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 135</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_135__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 136</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_136__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 137</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_137__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 138</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_138__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 139</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_139__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 140</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 140</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_FWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_FWD_EMoflonEdge_140__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_59(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 59</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 59</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_59(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_60(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 60</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 60</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#isAppropriate_BWD_EMoflonEdge_60(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.LaneToActor, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.LaneToActor, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__GenerateModel__RuleEntryContainer_LaneToActor_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.UserTask, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.UserTask, bpmn2.Lane, UseCaseDSL.Actor, BpmnToUseCaseIntegration.LaneToActor, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Step, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UserTask_Lane_Actor_LaneToActor_SequenceFlow_SequenceFlowToStep_Step_NormalStep_Process_SequenceFlow_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_SequenceFlowToUCFlow_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.UserTaskToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserTaskToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.IntermediateEventToStepCoreRule <em>Intermediate Event To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event To Step Core Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateEventToStepCoreRule
	 * @generated
	 */
	EClass getIntermediateEventToStepCoreRule();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule <em>Intermediate Throw Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Throw Event To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule
	 * @generated
	 */
	EClass getIntermediateThrowEventToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateThrowEvent_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateThrowEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_61(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 61</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 61</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_61(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 141</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 141</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_141__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 142</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 142</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_142__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 143</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 143</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_143__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 144</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 144</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_144__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 145</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 145</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_145__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 146</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 146</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_146__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_62(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 62</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 62</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_62(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_63(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 63</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 63</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_63(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateThrowEvent_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_SequenceFlow_Actor_ProcessToActor_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateThrowEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateThrowEventToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule <em>Intermediate Catch Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule
	 * @generated
	 */
	EClass getIntermediateCatchEventToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_SequenceFlow_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_Process_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_64(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 64</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 64</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_64(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_64__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 147</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 147</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_147__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 148</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 148</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_148__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 149</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 149</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_149__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 150</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 150</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_150__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 151</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 151</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_151__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 152</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 152</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_152__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_65(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 65</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 65</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_65(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_65__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_66(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 66</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 66</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_66(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_66__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_SequenceFlow_Actor_ProcessToActor_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateCatchEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getIntermediateCatchEventToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.EndEventRule <em>End Event Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule
	 * @generated
	 */
	EClass getEndEventRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent)
	 * @generated
	 */
	EOperation getEndEventRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEventRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEventRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent)
	 * @generated
	 */
	EOperation getEndEventRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent)
	 * @generated
	 */
	EOperation getEndEventRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEventRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEndEventRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EndEvent_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEventRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEventRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEventRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 153</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 153</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_153__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 154</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 154</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_154__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 155</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 155</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#isAppropriate_FWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEventRule__IsAppropriate_FWD_EMoflonEdge_155__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEventRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEndEventRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.EndEventToFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EndEvent, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.EndEventToFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEventRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EndEvent_Flow_SequenceFlowToUCFlow_EndEventToFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EndEventRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EndEventRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEventRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule <em>Exclusive Gateway To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway To Step Core Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule
	 * @generated
	 */
	EClass getExclusiveGatewayToStepCoreRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlowToUCFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_Flow_Actor_ProcessToActor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD__Match_NormalStep_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_SequenceFlowToUCFlow_Process_SequenceFlow_Flow_Actor_ProcessToActor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_67(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 67</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 67</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_67(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_67__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 156</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 156</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_156__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 157</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 157</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_157__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 158</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 158</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_158__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 159</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 159</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_159__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 160</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 160</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_160__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 161</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 161</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_161__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 162</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 162</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_162__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_68(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 68</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 68</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_68(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_68__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_NormalStep_SequenceFlowToUCFlow_SequenceFlowToUCFlow_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_FlowNodeToStep_SequenceFlowToStep_Flow_Actor_ProcessToActor_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepCoreRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.IntermediateEventToStepRule <em>Intermediate Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.IntermediateEventToStepRule
	 * @generated
	 */
	EClass getIntermediateEventToStepRule();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule <em>First Intermediate Throw Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Intermediate Throw Event To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule
	 * @generated
	 */
	EClass getFirstIntermediateThrowEventToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 163</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 163</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_163__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 164</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 164</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_164__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 165</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 165</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_165__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 166</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 166</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_166__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 167</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 167</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_167__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 168</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 168</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_FWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_FWD_EMoflonEdge_168__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_69(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 69</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 69</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_69(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_69__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_70(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 70</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 70</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#isAppropriate_BWD_EMoflonEdge_70(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__IsAppropriate_BWD_EMoflonEdge_70__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateThrowEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateThrowEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_NormalStep_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateThrowEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateThrowEventToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule <em>First Intermediate Catch Event To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Intermediate Catch Event To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule
	 * @generated
	 */
	EClass getFirstIntermediateCatchEventToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD__Match_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjectsToMatch_FWD__Match_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_FWD__Match_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 169</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 169</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_169__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 170</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 170</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_170__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 171</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 171</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_171__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 172</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 172</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_172__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 173</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 173</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_173__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 174</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 174</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_FWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_FWD_EMoflonEdge_174__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_71(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 71</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 71</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_71(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_71__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_72(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 72</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 72</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#isAppropriate_BWD_EMoflonEdge_72(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__IsAppropriate_BWD_EMoflonEdge_72__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.IntermediateCatchEvent, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_IntermediateCatchEvent_Process_SequenceFlow_SequenceFlow_Actor_ProcessToActor_NormalStep_FlowNodeToStep_SequenceFlowToStep_Flow_SequenceFlowToUCFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.FirstIntermediateCatchEventToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFirstIntermediateCatchEventToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule <em>Parallel Gateway To Parallel Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway To Parallel Step Core Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule
	 * @generated
	 */
	EClass getParallelGatewayToParallelStepCoreRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjectsToMatch_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_solveCsp_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.ParallelStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.ParallelStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelStep_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 175</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 175</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_175__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 176</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 176</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_176__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 177</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 177</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_FWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_FWD_EMoflonEdge_177__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_BWD_EMoflonEdge_73(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 73</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#isAppropriate_BWD_EMoflonEdge_73(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__IsAppropriate_BWD_EMoflonEdge_73__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, UseCaseDSL.ParallelStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, UseCaseDSL.ParallelStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_ParallelStep_Flow_FlowNodeToStep_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepCoreRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule <em>Event Based Gateway To Step Core Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Based Gateway To Step Core Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule
	 * @generated
	 */
	EClass getEventBasedGatewayToStepCoreRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EventBasedGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EventBasedGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EventBasedGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__RegisterObjectsToMatch_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NormalStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_solveCsp_BWD__Match_Actor_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 178</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 178</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_178__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 179</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 179</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_179__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 180</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 180</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_FWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_FWD_EMoflonEdge_180__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 74</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_74__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 75</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#isAppropriate_BWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__IsAppropriate_BWD_EMoflonEdge_75__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.FlowNodeToStep, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.NormalStep, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.FlowNodeToStep, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_Actor_ProcessToActor_NormalStep_Flow_SequenceFlowToUCFlow_FlowNodeToStep_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepCoreRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepCoreRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule <em>Exclusive Converging Gateway Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Converging Gateway Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule
	 * @generated
	 */
	EClass getExclusiveConvergingGatewayRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.Flow, bpmn2.ExclusiveGateway, BpmnToUseCaseIntegration.FlowNodeToStep, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.Flow, bpmn2.ExclusiveGateway, BpmnToUseCaseIntegration.FlowNodeToStep, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_AlternativeFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_NormalStep_AlternativeFlowAlternative_Flow_ExclusiveGateway_FlowNodeToStep_SequenceFlow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 181</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 181</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_181__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 182</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 182</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_182__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 183</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 183</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_183__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 184</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 184</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_184__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 185</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 185</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_185__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_186(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 186</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 186</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_186(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_186__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.ExclusiveGateway, BpmnToUseCaseIntegration.FlowNodeToStep, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.ExclusiveGateway, BpmnToUseCaseIntegration.FlowNodeToStep, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ExclusiveGateway_SequenceFlow_AlternativeFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_Flow_SequenceFlowToUCFlow_SequenceFlowToStep_ExclusiveGateway_FlowNodeToStep_SequenceFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveConvergingGatewayRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule <em>Parallel Converging Gateway Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Converging Gateway Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule
	 * @generated
	 */
	EClass getParallelConvergingGatewayRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow, UseCaseDSL.ParallelFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.ParallelStep) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow, UseCaseDSL.ParallelFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.ParallelStep)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_187(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 187</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 187</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_187(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_187__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_188(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 188</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 188</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_188(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_188__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_189(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 189</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 189</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_189(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_189__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_190(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 190</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 190</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_190(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_190__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_191(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 191</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 191</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_191(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_191__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_192(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 192</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 192</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#isAppropriate_FWD_EMoflonEdge_192(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__IsAppropriate_FWD_EMoflonEdge_192__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow, UseCaseDSL.ParallelFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.ParallelGateway, bpmn2.SequenceFlow, UseCaseDSL.ParallelFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToStep, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_ParallelGateway_SequenceFlow_ParallelFlow_SequenceFlowToUCFlow_Step_SequenceFlowToStep_Flow_ParallelStep_FlowNodeToStep_SequenceFlowToUCFlow_SequenceFlowToStep_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelConvergingGatewayRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelConvergingGatewayRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule <em>Seq Flow After EG To Alt Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Flow After EG To Alt Flow Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule
	 * @generated
	 */
	EClass getSeqFlowAfterEGToAltFlowRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_ExclusiveGateway_Process_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlow_AlternativeFlowAlternative();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjectsToMatch_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlow_AlternativeFlowAlternative();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_solveCsp_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlow_AlternativeFlowAlternative();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative, bpmn2.ExclusiveGateway, bpmn2.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlow, UseCaseDSL.AlternativeFlowAlternative, bpmn2.ExclusiveGateway, bpmn2.Process)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlow_AlternativeFlowAlternative_ExclusiveGateway_Process();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 76</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 76</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_76__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 77</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 77</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_77__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 78</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 78</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_BWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_BWD_EMoflonEdge_78__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD_EMoflonEdge_193(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 193</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 193</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD_EMoflonEdge_193(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_193__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD_EMoflonEdge_194(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 194</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 194</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD_EMoflonEdge_194(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_194__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD_EMoflonEdge_195(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 195</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 195</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#isAppropriate_FWD_EMoflonEdge_195(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__IsAppropriate_FWD_EMoflonEdge_195__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.FlowNodeToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.FlowNodeToStep)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel__RuleEntryContainer_FlowNodeToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.AlternativeFlowAlternative, BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.AlternativeFlowAlternative, BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative, bpmn2.ExclusiveGateway, bpmn2.Process, bpmn2.SequenceFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_ProcessToUseCase_SequenceFlow_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlow_SequenceFlowToUCFlow_AlternativeFlowAlternative_SequenceFlowToAlternativeFlowAlternative_ExclusiveGateway_Process_SequenceFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterEGToAltFlowRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterEGToAltFlowRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule <em>Seq Flow After PG To Parallel Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Flow After PG To Parallel Flow Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule
	 * @generated
	 */
	EClass getSeqFlowAfterPGToParallelFlowRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Flow, UseCaseDSL.UseCase, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Flow, UseCaseDSL.UseCase, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD__Match_Flow_UseCase_ParallelStep_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Flow, UseCaseDSL.UseCase, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Flow, UseCaseDSL.UseCase, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjectsToMatch_BWD__Match_Flow_UseCase_ParallelStep_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Flow, UseCaseDSL.UseCase, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Flow, UseCaseDSL.UseCase, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_solveCsp_BWD__Match_Flow_UseCase_ParallelStep_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.ParallelFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.ParallelFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD_EMoflonEdge_196(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 196</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 196</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD_EMoflonEdge_196(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_196__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD_EMoflonEdge_197(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 197</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 197</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD_EMoflonEdge_197(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_197__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD_EMoflonEdge_198(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 198</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 198</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_FWD_EMoflonEdge_198(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_FWD_EMoflonEdge_198__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_BWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 79</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 79</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_BWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD_EMoflonEdge_79__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_BWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 80</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 80</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#isAppropriate_BWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__IsAppropriate_BWD_EMoflonEdge_80__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel__RuleEntryContainer_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.ParallelFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.ParallelGateway, bpmn2.SequenceFlow, bpmn2.SequenceFlow, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.ParallelStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.ParallelFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_SequenceFlow_SequenceFlow_Flow_SequenceFlowToUCFlow_UseCase_ProcessToUseCase_ParallelStep_FlowNodeToStep_ParallelFlow_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.SeqFlowAfterPGToParallelFlowRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSeqFlowAfterPGToParallelFlowRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule <em>Catch Event After EBG To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Event After EBG To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule
	 * @generated
	 */
	EClass getCatchEventAfterEBGToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__RegisterObjectsToMatch_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_solveCsp_BWD__Match_UseCase_Flow_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_199(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 199</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 199</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_199(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_199__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_200(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 200</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 200</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_200(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_200__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_201(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 201</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 201</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_201(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_201__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_202(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 202</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 202</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_202(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_202__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_203(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 203</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 203</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_203(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_203__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_204(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 204</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 204</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_FWD_EMoflonEdge_204(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_FWD_EMoflonEdge_204__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 81</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 81</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_81__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 82</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 82</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_82__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 83</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 83</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#isAppropriate_BWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__IsAppropriate_BWD_EMoflonEdge_83__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.FlowNodeToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.FlowNodeToStep)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__GenerateModel__RuleEntryContainer_FlowNodeToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlowAlternative, BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.Process, bpmn2.SequenceFlow, bpmn2.EventBasedGateway, bpmn2.SequenceFlow, bpmn2.IntermediateCatchEvent, UseCaseDSL.UseCase, BpmnToUseCaseIntegration.ProcessToUseCase, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.FlowNodeToStep, UseCaseDSL.AlternativeFlowAlternative, BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_SequenceFlow_EventBasedGateway_SequenceFlow_IntermediateCatchEvent_UseCase_ProcessToUseCase_Flow_SequenceFlowToUCFlow_NormalStep_FlowNodeToStep_AlternativeFlowAlternative_SequenceFlowToAlternativeFlowAlternative_AlternativeFlow_SequenceFlowToUCFlow_IntermediateCatchEventToAlternativeFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.CatchEventAfterEBGToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getCatchEventAfterEBGToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule <em>Exclusive Gateway To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule
	 * @generated
	 */
	EClass getExclusiveGatewayToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_SequenceFlowToUCFlow_Process_ExclusiveGateway_SequenceFlow_Flow_Actor_ProcessToActor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Flow, UseCaseDSL.Actor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Flow_Actor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_SequenceFlowToUCFlow_Process_Flow_Actor_ProcessToActor();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 84</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 84</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_84__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 85</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 85</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_85__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_205(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 205</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 205</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_205(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_205__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_206(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 206</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 206</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_206(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_206__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_207(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 207</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 207</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_207(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_207__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_208(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 208</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 208</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_208(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_208__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_209(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 209</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 209</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_209(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_209__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_210(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 210</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 210</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_210(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_210__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_211(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 211</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 211</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_211(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_211__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 86</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 86</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_86__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, bpmn2.Process, bpmn2.ExclusiveGateway, bpmn2.SequenceFlow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.Flow, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_SequenceFlowToUCFlow_SequenceFlowToUCFlow_Process_ExclusiveGateway_SequenceFlow_FlowNodeToStep_SequenceFlowToStep_Flow_Actor_ProcessToActor_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getExclusiveGatewayToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule <em>Parallel Gateway To Parallel Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway To Parallel Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule
	 * @generated
	 */
	EClass getParallelGatewayToParallelStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ParallelGateway)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ParallelGateway)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.ParallelGateway)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.ParallelGateway, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.ParallelGateway, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_ParallelGateway_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.ParallelStep, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.ParallelStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD__Match_Step_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.ParallelStep, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.ParallelStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__RegisterObjectsToMatch_BWD__Match_Step_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.ParallelStep, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.ParallelStep, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_solveCsp_BWD__Match_Step_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.ParallelStep, bpmn2.Process, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.ParallelStep, bpmn2.Process, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_ParallelStep_Process_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_BWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 87</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 87</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_BWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD_EMoflonEdge_87__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD_EMoflonEdge_212(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 212</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 212</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD_EMoflonEdge_212(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_212__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD_EMoflonEdge_213(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 213</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 213</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD_EMoflonEdge_213(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_213__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD_EMoflonEdge_214(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 214</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 214</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_FWD_EMoflonEdge_214(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_FWD_EMoflonEdge_214__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_BWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 88</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 88</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#isAppropriate_BWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__IsAppropriate_BWD_EMoflonEdge_88__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.ParallelStep, bpmn2.Process, bpmn2.ParallelGateway, UseCaseDSL.Flow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.ParallelStep, bpmn2.Process, bpmn2.ParallelGateway, UseCaseDSL.Flow, BpmnToUseCaseIntegration.FlowNodeToStep, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_ParallelStep_Process_ParallelGateway_Flow_FlowNodeToStep_SequenceFlowToUCFlow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGatewayToParallelStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule <em>Event Based Gateway To Step Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Based Gateway To Step Rule</em>'.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule
	 * @generated
	 */
	EClass getEventBasedGatewayToStepRule();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.EventBasedGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.EventBasedGateway)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD__Match_SequenceFlow_Process_EventBasedGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.EventBasedGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjectsToMatch_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.EventBasedGateway)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__RegisterObjectsToMatch_FWD__Match_SequenceFlow_Process_EventBasedGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.EventBasedGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, bpmn2.SequenceFlow, bpmn2.Process, bpmn2.EventBasedGateway)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_Process_EventBasedGateway();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, bpmn2.Process, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_Process_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjectsToMatch_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__RegisterObjectsToMatch_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, UseCaseDSL.Step, UseCaseDSL.NormalStep, UseCaseDSL.Actor, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_solveCsp_BWD__Match_Step_NormalStep_Actor_Flow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 89</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 89</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_89__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_215(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 215</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 215</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_215(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_215__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_216(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 216</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 216</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_216(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_216__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_217(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 217</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 217</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_FWD_EMoflonEdge_217(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_FWD_EMoflonEdge_217__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 90</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_90__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 91</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__IsAppropriate_BWD_EMoflonEdge_91__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, BpmnToUseCaseIntegration.SequenceFlowToStep)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__GenerateModel__RuleEntryContainer_SequenceFlowToStep();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.FlowNodeToStep, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, bpmn2.SequenceFlow, UseCaseDSL.Step, BpmnToUseCaseIntegration.SequenceFlowToStep, UseCaseDSL.NormalStep, bpmn2.Process, bpmn2.EventBasedGateway, UseCaseDSL.Actor, BpmnToUseCaseIntegration.ProcessToActor, UseCaseDSL.Flow, BpmnToUseCaseIntegration.SequenceFlowToUCFlow, BpmnToUseCaseIntegration.FlowNodeToStep, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SequenceFlow_Step_SequenceFlowToStep_NormalStep_Process_EventBasedGateway_Actor_ProcessToActor_Flow_SequenceFlowToUCFlow_FlowNodeToStep_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see BpmnToUseCaseIntegration.Rules.EventBasedGatewayToStepRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEventBasedGatewayToStepRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
