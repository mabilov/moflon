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
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

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
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

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
	int UC_MODEL_TO_MSD_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

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
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

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
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 228</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_228__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 71</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	int UC_PACKAGE_TO_MSD_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

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
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

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
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 229</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_229__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 72</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_72__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 230</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_230__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	int USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

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
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.ActorToLifelineRuleImpl <em>Actor To Lifeline Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.ActorToLifelineRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getActorToLifelineRule()
	 * @generated
	 */
	int ACTOR_TO_LIFELINE_RULE = 3;

	/**
	 * The number of structural features of the '<em>Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Normal Step To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserActorToLifelineRuleImpl <em>User Actor To Lifeline Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserActorToLifelineRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUserActorToLifelineRule()
	 * @generated
	 */
	int USER_ACTOR_TO_LIFELINE_RULE = 5;

	/**
	 * The number of structural features of the '<em>User Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_PACKAGEDECLARATION_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_PACKAGEDECLARATION_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_PACKAGEDECLARATION_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_USECASETOINTERACTION_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_USECASE_USECASETOINTERACTION_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 231</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_231__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_73__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_USECASETOINTERACTION_INTERACTION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>User Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBFToMessageRuleImpl <em>Normal Step BF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepBFToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_BF_TO_MESSAGE_RULE = 6;

	/**
	 * The number of structural features of the '<em>Normal Step BF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BF_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal Step BF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_BF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepNFToMessageRuleImpl <em>Normal Step NF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepNFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepNFToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_NF_TO_MESSAGE_RULE = 7;

	/**
	 * The number of structural features of the '<em>Normal Step NF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NF_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal Step NF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_NF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepToComboRuleImpl <em>Alt Step To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltStepToComboRule()
	 * @generated
	 */
	int ALT_STEP_TO_COMBO_RULE = 8;

	/**
	 * The number of structural features of the '<em>Alt Step To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alt Step To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepNFToComboRuleImpl <em>Alt Step NF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepNFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltStepNFToComboRule()
	 * @generated
	 */
	int ALT_STEP_NF_TO_COMBO_RULE = 9;

	/**
	 * The number of structural features of the '<em>Alt Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_NF_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alt Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_NF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.ParallelStepToCombinedFragmentRuleImpl <em>Parallel Step To Combined Fragment Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.ParallelStepToCombinedFragmentRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getParallelStepToCombinedFragmentRule()
	 * @generated
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE = 10;

	/**
	 * The number of structural features of the '<em>Parallel Step To Combined Fragment Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_INTERACTION_FLOW_USECASETOINTERACTION_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_INTERACTION_FLOW_USECASETOINTERACTION_COMBINEDFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 76</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 232</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_232__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_INTERACTION_FLOW_USECASETOINTERACTION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Parallel Step To Combined Fragment Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.ParallelFlowToOperandRuleImpl <em>Parallel Flow To Operand Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.ParallelFlowToOperandRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getParallelFlowToOperandRule()
	 * @generated
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE = 11;

	/**
	 * The number of structural features of the '<em>Parallel Flow To Operand Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELSTEP_PARALLELFLOW_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_PARALLELFLOW_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_USECASE_FLOW_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 77</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 233</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_233__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 234</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_234__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 78</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 79</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PARALLELSTEPTOCOMBINEDFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMBINEDFRAGMENT_PARALLELSTEP_PARALLELSTEPTOCOMBINEDFRAGMENT_USECASE_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Parallel Flow To Operand Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCasePrecondToFoundMessageRuleImpl <em>Use Case Precond To Found Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCasePrecondToFoundMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUseCasePrecondToFoundMessageRule()
	 * @generated
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE = 12;

	/**
	 * The number of structural features of the '<em>Use Case Precond To Found Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_UCCONDITION_USECASE_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_UCCONDITION_USECASE_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_UCCONDITION_USECASE_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_UCCONDITION_USECASETOINTERACTION_USECASE_INTERACTION_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASETOINTERACTION_USECASE_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 235</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_235__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 80</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 81</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 82</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 83</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 84</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 85</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_85__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 86</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_86__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 87</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASETOINTERACTION_USECASE_INTERACTION_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Use Case Precond To Found Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepBFToMessageRuleImpl <em>System Step BF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepBFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getSystemStepBFToMessageRule()
	 * @generated
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE = 13;

	/**
	 * The number of structural features of the '<em>System Step BF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 88</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 89</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_89__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 92</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 93</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_93__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 236</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_236__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 237</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_237__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 94</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_94__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 95</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_95__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 96</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_96__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 97</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_97__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 98</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_98__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 99</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_99__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 100</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 101</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_101__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The number of operations of the '<em>System Step BF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepAltToOperandRuleImpl <em>Step Alt To Operand Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepAltToOperandRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getStepAltToOperandRule()
	 * @generated
	 */
	int STEP_ALT_TO_OPERAND_RULE = 14;

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
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_ACTORTOLIFELINE_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW_FLOW_USECASE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

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
	int STEP_ALT_TO_OPERAND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_ACTORTOLIFELINE_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING_FLOW_USECASE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int STEP_ALT_TO_OPERAND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 102</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_102__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 238</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_238__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 239</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_239__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 103</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_103__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 104</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_104__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 105</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_105__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 106</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_106__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 240</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_240__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

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
	int STEP_ALT_TO_OPERAND_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_ACTORTOLIFELINE_COMBINEDFRAGMENT_NORMALSTEP_NORMALSTEPTOCOMBINEDFRAGMENT_FLOW_USECASE_LIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

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
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepBFToComboRuleImpl <em>Alt Step BF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepBFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltStepBFToComboRule()
	 * @generated
	 */
	int ALT_STEP_BF_TO_COMBO_RULE = 15;

	/**
	 * The number of structural features of the '<em>Alt Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_BF_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alt Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_BF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserStepBFMessageRuleImpl <em>User Step BF Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserStepBFMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUserStepBFMessageRule()
	 * @generated
	 */
	int USER_STEP_BF_MESSAGE_RULE = 16;

	/**
	 * The number of structural features of the '<em>User Step BF Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_USECASE_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_USECASE_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_USECASE_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_LIFELINE_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_LIFELINE_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 107</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_107__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 108</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_108__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 109</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_109__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 110</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_110__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 111</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_111__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 112</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_112__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 241</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_241__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 242</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_242__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 113</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_113__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 114</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_114__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 115</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_115__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 116</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_116__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 117</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_117__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 118</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_118__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 119</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_119__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 120</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_120__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_USECASE_USECASETOINTERACTION_LIFELINE_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The number of operations of the '<em>User Step BF Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepNFToMessageRuleImpl <em>System Step NF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepNFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getSystemStepNFToMessageRule()
	 * @generated
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE = 17;

	/**
	 * The number of structural features of the '<em>System Step NF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_NORMALSTEP_INTERACTION_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_MESSAGE_INTERACTION_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 121</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_121__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 122</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_122__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 123</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_123__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 124</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 125</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_125__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 126</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 127</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 128</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 129</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_129__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 130</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_130__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 243</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_243__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 244</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_244__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 131</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_131__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 132</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_132__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 133</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_133__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 134</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 135</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 136</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_136__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_USECASE_USECASETOINTERACTION_INTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The number of operations of the '<em>System Step NF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserStepNfToMessageRuleImpl <em>User Step Nf To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserStepNfToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUserStepNfToMessageRule()
	 * @generated
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE = 18;

	/**
	 * The number of structural features of the '<em>User Step Nf To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_USECASETOINTERACTION_NORMALSTEP_INTERACTION_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_USECASE_USECASETOINTERACTION_MESSAGE_INTERACTION_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 137</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_137__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 138</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_138__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 139</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_139__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 140</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_140__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 141</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_141__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 142</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_142__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 143</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 144</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_144__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 145</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_145__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 146</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_146__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 147</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_147__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 148</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_148__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 245</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_245__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 246</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_246__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 149</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_149__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 150</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_150__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 151</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_151__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 152</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_152__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 153</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_153__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 154</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_154__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_USECASETOINTERACTION_INTERACTION_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The number of operations of the '<em>User Step Nf To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepBFToComboRuleImpl <em>Alt Sys Step BF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepBFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltSysStepBFToComboRule()
	 * @generated
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE = 19;

	/**
	 * The number of structural features of the '<em>Alt Sys Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_COMBINEDFRAGMENT_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 155</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_155__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 156</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_156__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 157</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_157__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 158</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_158__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 159</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_159__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 160</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_160__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 161</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_161__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 162</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_162__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 247</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_247__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 248</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_248__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 249</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_249__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 250</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_250__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 163</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_163__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 164</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_164__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 165</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_165__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 166</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_166__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 167</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_167__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 168</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_168__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 169</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_169__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The number of operations of the '<em>Alt Sys Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepBFToComboRuleImpl <em>Alt User Step BF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepBFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltUserStepBFToComboRule()
	 * @generated
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE = 20;

	/**
	 * The number of structural features of the '<em>Alt User Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_BASICFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_LIFELINE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTION_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_LIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 170</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_170__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 171</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_171__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 172</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_172__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 173</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_173__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 174</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_174__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 175</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_175__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 176</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_176__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 177</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_177__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 178</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_178__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 179</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_179__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_180__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 181</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_181__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 251</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_251__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 252</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_252__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 253</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_253__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 254</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_254__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 182</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_182__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 183</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_183__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 184</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_184__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 185</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_185__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 186</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_186__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 187</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_187__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTION_FLOWTOINTERACTIONFRAGMENT_BASICFLOW_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_LIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The number of operations of the '<em>Alt User Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepNFToComboRuleImpl <em>Alt Sys Step NF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepNFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltSysStepNFToComboRule()
	 * @generated
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE = 21;

	/**
	 * The number of structural features of the '<em>Alt Sys Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_USECASE_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_INTERACTIONOPERAND_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 188</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_188__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 189</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_189__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 190</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_190__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 191</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_191__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 192</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_192__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 193</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_193__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 194</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_194__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 195</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_195__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 196</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_196__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 197</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_197__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 198</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_198__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 199</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_199__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 200</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_200__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 201</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_201__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 255</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_255__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 256</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_256__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 257</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_257__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 258</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_258__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 202</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_202__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 203</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_203__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 204</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_204__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 205</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_205__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 206</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_206__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWTOINTERACTIONFRAGMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_NAMEDFLOW_INTERACTIONOPERAND_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_INTERACTION_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The number of operations of the '<em>Alt Sys Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepNFToComboRuleImpl <em>Alt User Step NF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepNFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltUserStepNFToComboRule()
	 * @generated
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE = 22;

	/**
	 * The number of structural features of the '<em>Alt User Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_USECASE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_INTERACTION_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_ALTERNATIVEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONOPERAND_COMBINEDFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_INTERACTIONOPERAND_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_INTERACTIONCONSTRAINT_LITERALSTRING = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 207</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_207__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 208</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_208__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 209</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_209__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 210</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_210__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 211</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_211__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 212</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_212__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 213</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_213__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 214</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_214__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 215</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_215__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 216</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_216__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 217</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_217__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 218</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_218__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 219</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_219__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 220</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_220__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 221</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_221__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 222</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_222__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 223</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_223__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 224</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_224__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 259</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_259__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 260</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_260__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 261</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_261__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 262</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_262__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 225</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_225__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 226</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_226__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 227</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_227__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 228</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_228__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_INTERACTION_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 50;

	/**
	 * The number of operations of the '<em>Alt User Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 51;

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__Perform_FWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__Perform_BWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__Perform_FWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__Perform_BWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_228(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 228</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 228</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_228(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_228__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_71(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 71</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 71</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_71(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_71__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCasesModel, ModalSequenceDiagram.Model, UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCasesModel_Model_UseCasesModelToModel_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__Perform_FWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__Perform_BWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_229(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 229</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 229</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_229(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_229__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_72(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 72</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 72</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_72(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_BWD_EMoflonEdge_72__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_230(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 230</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 230</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_230(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_230__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_ModelgeneratorRuleResult();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule <em>Actor To Lifeline Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor To Lifeline Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule
	 * @generated
	 */
	EClass getActorToLifelineRule();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule <em>User Actor To Lifeline Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Actor To Lifeline Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule
	 * @generated
	 */
	EClass getUserActorToLifelineRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_FWD__Match_Actor_PackageDeclaration_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjectsToMatch_FWD__Match_Actor_PackageDeclaration_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_solveCsp_FWD__Match_Actor_PackageDeclaration_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_UseCaseToInteraction_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjectsToMatch_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_solveCsp_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_UseCase_UseCaseToInteraction_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_231(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 231</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 231</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_231(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_FWD_EMoflonEdge_231__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_73(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 73</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_73(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_73__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 74</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_74__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_UseCaseToInteraction_Interaction_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBFToMessageRule <em>Normal Step BF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step BF To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepBFToMessageRule
	 * @generated
	 */
	EClass getNormalStepBFToMessageRule();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNFToMessageRule <em>Normal Step NF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step NF To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.NormalStepNFToMessageRule
	 * @generated
	 */
	EClass getNormalStepNFToMessageRule();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule <em>Alt Step To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Step To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule
	 * @generated
	 */
	EClass getAltStepToComboRule();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepNFToComboRule <em>Alt Step NF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Step NF To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepNFToComboRule
	 * @generated
	 */
	EClass getAltStepNFToComboRule();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule <em>Parallel Step To Combined Fragment Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Step To Combined Fragment Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule
	 * @generated
	 */
	EClass getParallelStepToCombinedFragmentRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.ParallelStep) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.ParallelStep)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD__Match_UseCase_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.ParallelStep) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.ParallelStep)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__RegisterObjectsToMatch_FWD__Match_UseCase_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.ParallelStep) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.ParallelStep)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Flow, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.ParallelStep) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Flow, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.ParallelStep)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_Interaction_Flow_UseCaseToInteraction_ParallelStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD__Match_Interaction_CombinedFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__RegisterObjectsToMatch_BWD__Match_Interaction_CombinedFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_solveCsp_BWD__Match_Interaction_CombinedFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Flow, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.CombinedFragment) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Flow, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.CombinedFragment)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_Interaction_Flow_UseCaseToInteraction_CombinedFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 75</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_75__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 76</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 76</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_76__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_232(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 232</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 232</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_232(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_232__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Flow, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Flow, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCase_Interaction_Flow_UseCaseToInteraction_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule <em>Parallel Flow To Operand Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Flow To Operand Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule
	 * @generated
	 */
	EClass getParallelFlowToOperandRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD__Match_ParallelStep_ParallelFlow_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__RegisterObjectsToMatch_FWD__Match_ParallelStep_ParallelFlow_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.ParallelStep, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_solveCsp_FWD__Match_ParallelStep_ParallelFlow_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.ParallelStep, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.ParallelStep, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment, UseCaseDSL.ParallelFlow, UseCaseDSL.UseCase, UseCaseDSL.Flow)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_CombinedFragment_ParallelStep_ParallelStepToCombinedFragment_ParallelFlow_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__RegisterObjectsToMatch_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_solveCsp_BWD__Match_CombinedFragment_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.ParallelStep, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment, UseCaseDSL.UseCase, UseCaseDSL.Flow, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.ParallelStep, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment, UseCaseDSL.UseCase, UseCaseDSL.Flow, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CombinedFragment_ParallelStep_ParallelStepToCombinedFragment_UseCase_Flow_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 77</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 77</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_77__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_233(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 233</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 233</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_233(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_233__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_234(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 234</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 234</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_234(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_234__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 78</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 78</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_78__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 79</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 79</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_79__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__GenerateModel__RuleEntryContainer_ParallelStepToCombinedFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.ParallelStep, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment, UseCaseDSL.UseCase, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.ParallelStep, UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment, UseCaseDSL.UseCase, UseCaseDSL.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_CombinedFragment_ParallelStep_ParallelStepToCombinedFragment_UseCase_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule <em>Use Case Precond To Found Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case Precond To Found Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule
	 * @generated
	 */
	EClass getUseCasePrecondToFoundMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UCCondition, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UCCondition, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD__Match_UCCondition_UseCase_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UCCondition, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UCCondition, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_FWD__Match_UCCondition_UseCase_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UCCondition, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UCCondition, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_FWD__Match_UCCondition_UseCase_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UCCondition, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UCCondition, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UCCondition_UseCaseToInteraction_UseCase_Interaction_Actor_PackageDeclaration_Lifeline_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.UseCase, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.UseCase, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCaseToInteraction_UseCase_Message_Interaction_MessageOccurrenceSpecification_Actor_PackageDeclaration_Lifeline_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_235(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 235</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 235</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_235(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_235__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 80</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 80</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_80__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 81</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 81</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_81__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 82</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 82</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_82__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 83</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 83</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_83__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 84</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 84</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_84__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 85</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 85</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_85__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 86</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 86</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_86__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 87</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 87</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_87__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_UseCaseToInteraction_UseCase_Interaction_Actor_PackageDeclaration_Lifeline_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule <em>System Step BF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Step BF To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule
	 * @generated
	 */
	EClass getSystemStepBFToMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD__Match_Actor_BasicFlow_UseCase_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_BasicFlow_UseCase_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_BasicFlow_UseCase_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Message_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 88</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 88</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_88__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 89</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 89</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_89__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 90</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_90__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 91</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_91__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 92</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 92</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_92__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 93</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 93</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_93__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_236(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 236</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 236</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_236(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_236__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_237(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 237</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 237</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_237(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_237__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 94</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 94</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_94__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 95</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 95</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_95__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 96</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 96</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_96__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 97</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 97</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_97__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 98</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 98</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_98__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 99</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 99</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_99__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 100</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 100</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_100__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 101</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 101</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_101__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_PackageDeclaration_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD__Match_Actor_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjectsToMatch_FWD__Match_Actor_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_solveCsp_FWD__Match_Actor_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_PackageDeclaration_ActorToLifeline_CombinedFragment_NormalStep_NormalStepToCombinedFragment_AlternativeFlowAlternative_AlternativeFlow_Flow_UseCase_Lifeline();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__Perform_BWD__IsApplicableMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_PackageDeclaration_ActorToLifeline_CombinedFragment_NormalStep_NormalStepToCombinedFragment_InteractionOperand_InteractionConstraint_LiteralString_Flow_UseCase_Lifeline();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 102</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 102</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_102__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_238(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 238</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 238</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_238(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_238__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_239(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 239</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 239</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_239(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_239__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 103</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 103</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_103__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 104</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 104</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_104__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 105</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 105</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_105__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 106</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 106</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_106__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_240(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 240</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 240</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_240(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_240__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment, UseCaseDSL.Flow, UseCaseDSL.UseCase, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_PackageDeclaration_ActorToLifeline_CombinedFragment_NormalStep_NormalStepToCombinedFragment_Flow_UseCase_Lifeline_ModelgeneratorRuleResult();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepBFToComboRule <em>Alt Step BF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Step BF To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepBFToComboRule
	 * @generated
	 */
	EClass getAltStepBFToComboRule();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule <em>User Step BF Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Step BF Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule
	 * @generated
	 */
	EClass getUserStepBFMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_UseCase_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_UseCase_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_UseCase_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_NormalStep_Lifeline_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_Message_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Message_Lifeline_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 107</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 107</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_107__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 108</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 108</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_108__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 109</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 109</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_109__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 110</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_110__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 111</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 111</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_111__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 112</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 112</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_112__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_241(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 241</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 241</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_241(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_241__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_242(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 242</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 242</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_242(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_242__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 113</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 113</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_113__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 114</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 114</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_114__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 115</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 115</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_115__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 116</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 116</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_116__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 117</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 117</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_117__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 118</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 118</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_118__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 119</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 119</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_119__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 120</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 120</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_120__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__GenerateModel__RuleEntryContainer_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_UseCase_UseCaseToInteraction_Lifeline_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule <em>System Step NF To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Step NF To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule
	 * @generated
	 */
	EClass getSystemStepNFToMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD__Match_Actor_NamedFlow_UseCase_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_NamedFlow_UseCase_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_NamedFlow_UseCase_NormalStep_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_UseCase_UseCaseToInteraction_NormalStep_Interaction_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_Message_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_Message_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_Message_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_CombinedFragment_UseCase_UseCaseToInteraction_Message_Interaction_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 121</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 121</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_121__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 122</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 122</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_122__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 123</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 123</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_123__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 124</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 124</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_124__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 125</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 125</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_125__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 126</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 126</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_126__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 127</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 127</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_127__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 128</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 128</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_128__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 129</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 129</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_129__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 130</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 130</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_130__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_243(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 243</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 243</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_243(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_243__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_244(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 244</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 244</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_244(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_244__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 131</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_131__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 132</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_132__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 133</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_133__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 134</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_134__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 135</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_135__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 136</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_136__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_UseCase_UseCaseToInteraction_Interaction_PackageDeclaration_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule <em>User Step Nf To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Step Nf To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule
	 * @generated
	 */
	EClass getUserStepNfToMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.NormalStep, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_UseCase_UseCaseToInteraction_NormalStep_Interaction_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Message_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Message_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Message_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_MessageOccurrenceSpecification_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_Lifeline_UseCase_UseCaseToInteraction_Message_Interaction_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 137</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_137__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 138</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_138__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 139</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_139__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 140</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 140</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_140__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 141</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 141</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_141__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 142</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 142</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_142__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 143</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 143</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_143__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 144</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 144</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_144__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 145</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 145</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_145__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 146</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 146</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_146__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 147</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 147</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_147__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 148</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 148</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_148__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_245(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 245</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 245</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_245(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_245__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_246(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 246</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 246</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_246(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_246__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 149</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 149</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_149__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 150</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 150</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_150__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 151</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 151</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_151__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 152</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 152</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_152__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 153</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 153</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_153__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 154</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 154</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_154__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__GenerateModel__RuleEntryContainer_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_UseCase_UseCaseToInteraction_Interaction_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule <em>Alt Sys Step BF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Sys Step BF To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule
	 * @generated
	 */
	EClass getAltSysStepBFToComboRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD__Match_Actor_BasicFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__RegisterObjectsToMatch_FWD__Match_Actor_BasicFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_solveCsp_FWD__Match_Actor_BasicFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_Interaction_FlowToInteractionFragment_BasicFlow_UseCase_UseCaseToInteraction_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_MessageOccurrenceSpecification_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_MessageOccurrenceSpecification_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_MessageOccurrenceSpecification_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_Interaction_CombinedFragment_FlowToInteractionFragment_MessageOccurrenceSpecification_BasicFlow_UseCase_UseCaseToInteraction_PackageDeclaration_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 155</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 155</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_155__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 156</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 156</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_156__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 157</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 157</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_157__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 158</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 158</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_158__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 159</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 159</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_159__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 160</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 160</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_160__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 161</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 161</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_161__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 162</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 162</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_162__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_247(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 247</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 247</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_247(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_247__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_248(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 248</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 248</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_248(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_248__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_249(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 249</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 249</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_249(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_249__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_250(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 250</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 250</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_250(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_250__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 163</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 163</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_163__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 164</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 164</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_164__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 165</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 165</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_165__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 166</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 166</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_166__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 167</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 167</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_167__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 168</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 168</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_168__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 169</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 169</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_169__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_Interaction_FlowToInteractionFragment_BasicFlow_UseCase_UseCaseToInteraction_PackageDeclaration_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule <em>Alt User Step BF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt User Step BF To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule
	 * @generated
	 */
	EClass getAltUserStepBFToComboRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_BasicFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_BasicFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_BasicFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, ModalSequenceDiagram.Lifeline, UseCaseDSL.AlternativeFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, ModalSequenceDiagram.Lifeline, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_Interaction_FlowToInteractionFragment_BasicFlow_UseCase_UseCaseToInteraction_ActorToLifeline_NormalStep_AlternativeFlowAlternative_Lifeline_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_MessageOccurrenceSpecification_Lifeline_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_MessageOccurrenceSpecification_Lifeline_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_MessageOccurrenceSpecification_Lifeline_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_Interaction_FlowToInteractionFragment_MessageOccurrenceSpecification_BasicFlow_UseCase_UseCaseToInteraction_ActorToLifeline_Lifeline_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 170</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 170</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_170__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 171</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 171</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_171__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 172</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 172</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_172__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 173</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 173</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_173__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 174</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 174</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_174__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 175</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 175</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_175__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 176</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 176</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_176__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 177</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 177</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_177__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 178</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 178</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_178__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 179</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 179</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_179__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 180</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 180</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_180__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 181</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 181</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_181__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_251(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 251</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 251</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_251(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_251__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_252(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 252</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 252</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_252(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_252__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_253(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 253</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 253</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_253(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_253__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_254(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 254</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 254</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_254(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_254__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 182</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 182</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_182__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 183</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 183</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_183__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 184</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 184</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_184__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 185</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 185</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_185__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_186(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 186</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 186</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_186(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_186__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_187(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 187</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 187</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_187(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_187__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__GenerateModel__RuleEntryContainer_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.BasicFlow, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_Interaction_FlowToInteractionFragment_BasicFlow_UseCase_UseCaseToInteraction_ActorToLifeline_Lifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule <em>Alt Sys Step NF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Sys Step NF To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule
	 * @generated
	 */
	EClass getAltSysStepNFToComboRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD__Match_Actor_NamedFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__RegisterObjectsToMatch_FWD__Match_Actor_NamedFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_solveCsp_FWD__Match_Actor_NamedFlow_UseCase_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseDSL.NamedFlow, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseDSL.NamedFlow, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_NamedFlow_InteractionOperand_FlowToInteractionFragment_CombinedFragment_Interaction_UseCase_UseCaseToInteraction_PackageDeclaration_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_InteractionOperand_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.NamedFlow, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.NamedFlow, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_NamedFlow_InteractionOperand_FlowToInteractionFragment_MessageOccurrenceSpecification_CombinedFragment_CombinedFragment_Interaction_UseCase_UseCaseToInteraction_PackageDeclaration_InteractionOperand_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_188(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 188</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 188</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_188(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_188__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_189(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 189</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 189</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_189(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_189__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_190(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 190</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 190</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_190(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_190__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_191(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 191</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 191</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_191(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_191__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_192(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 192</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 192</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_192(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_192__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_193(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 193</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 193</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_193(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_193__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_194(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 194</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 194</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_194(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_194__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_195(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 195</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 195</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_195(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_195__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_196(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 196</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 196</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_196(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_196__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_197(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 197</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 197</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_197(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_197__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_198(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 198</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 198</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_198(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_198__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_199(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 199</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 199</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_199(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_199__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_200(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 200</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 200</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_200(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_200__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_201(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 201</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 201</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_201(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_201__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_255(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 255</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 255</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_255(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_255__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_256(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 256</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 256</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_256(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_256__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_257(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 257</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 257</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_257(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_257__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_258(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 258</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 258</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_258(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_258__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_202(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 202</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 202</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_202(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_202__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_203(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 203</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 203</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_203(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_203__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_204(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 204</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 204</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_204(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_204__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_205(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 205</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 205</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_205(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_205__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_206(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 206</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 206</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_206(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_206__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__GenerateModel__RuleEntryContainer_FlowToInteractionFragment();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseDSL.NamedFlow, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseDSL.NamedFlow, ModalSequenceDiagram.InteractionOperand, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_NamedFlow_InteractionOperand_FlowToInteractionFragment_CombinedFragment_Interaction_UseCase_UseCaseToInteraction_PackageDeclaration_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule <em>Alt User Step NF To Combo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt User Step NF To Combo Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule
	 * @generated
	 */
	EClass getAltUserStepNFToComboRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.UseCase, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_UseCase_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.NormalStep, UseCaseDSL.AlternativeFlowAlternative, UseCaseDSL.AlternativeFlow)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_Interaction_UseCase_UseCaseToInteraction_ActorToLifeline_NormalStep_AlternativeFlowAlternative_AlternativeFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Interaction_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__RegisterObjectsToMatch_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Interaction_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_solveCsp_BWD__Match_Lifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_MessageOccurrenceSpecification_Lifeline_Interaction_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionConstraint, ModalSequenceDiagram.LiteralString)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_CombinedFragment_InteractionOperand_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_Lifeline_Interaction_UseCase_UseCaseToInteraction_ActorToLifeline_InteractionConstraint_LiteralString();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_207(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 207</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 207</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_207(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_207__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_208(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 208</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 208</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_208(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_208__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_209(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 209</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 209</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_209(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_209__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_210(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 210</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 210</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_210(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_210__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_211(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 211</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 211</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_211(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_211__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_212(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 212</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 212</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_212(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_212__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_213(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 213</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 213</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_213(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_213__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_214(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 214</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 214</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_214(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_214__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_215(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 215</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 215</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_215(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_215__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_216(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 216</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 216</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_216(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_216__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_217(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 217</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 217</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_217(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_217__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_218(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 218</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 218</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_218(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_218__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_219(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 219</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 219</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_219(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_219__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_220(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 220</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 220</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_220(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_220__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_221(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 221</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 221</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_221(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_221__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_222(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 222</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 222</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_222(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_222__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_223(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 223</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 223</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_223(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_223__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_224(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 224</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 224</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_224(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_224__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_259(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 259</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 259</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_259(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_259__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_260(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 260</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 260</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_260(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_260__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_261(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 261</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 261</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_261(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_261__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_262(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 262</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 262</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_262(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_262__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_225(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 225</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 225</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_225(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_225__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_226(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 226</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 226</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_226(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_226__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_227(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 227</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 227</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_227(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_227__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_228(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 228</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 228</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_228(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_228__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__GenerateModel__RuleEntryContainer_ActorToLifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_Interaction_UseCase_UseCaseToInteraction_ActorToLifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
