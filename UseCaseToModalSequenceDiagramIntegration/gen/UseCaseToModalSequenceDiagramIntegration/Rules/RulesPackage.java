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
	 * The operation id for the '<em>Is Appropriate FWD Use Cases Model 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_2__USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Model 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_2__MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	 * The number of operations of the '<em>UC Model To MSD Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 74</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_74__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 322</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_322__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	 * The number of operations of the '<em>UC Package To MSD Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

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
	 * The number of operations of the '<em>Use Case To Interaction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCaseNoPrecondRuleImpl <em>Use Case No Precond Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCaseNoPrecondRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUseCaseNoPrecondRule()
	 * @generated
	 */
	int USE_CASE_NO_PRECOND_RULE = 5;

	/**
	 * The number of structural features of the '<em>Use Case No Precond Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_PACKAGEDECLARATION_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_PACKAGEDECLARATION_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_PACKAGEDECLARATION_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 75</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_75__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 323</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_323__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 76</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_76__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Use Case No Precond Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_NO_PRECOND_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserActorToLifelineRuleImpl <em>User Actor To Lifeline Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserActorToLifelineRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUserActorToLifelineRule()
	 * @generated
	 */
	int USER_ACTOR_TO_LIFELINE_RULE = 6;

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
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int USER_ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 77</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_77__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 324</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_324__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 325</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_325__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	 * The number of operations of the '<em>User Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTOR_TO_LIFELINE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBFToMessageRuleImpl <em>Normal Step BF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepBFToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_BF_TO_MESSAGE_RULE = 7;

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
	int NORMAL_STEP_NF_TO_MESSAGE_RULE = 8;

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
	int ALT_STEP_TO_COMBO_RULE = 9;

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
	int ALT_STEP_NF_TO_COMBO_RULE = 10;

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
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE = 11;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 326</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_326__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 327</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_327__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 78</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_78__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	 * The number of operations of the '<em>Parallel Step To Combined Fragment Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.ParallelFlowToOperandRuleImpl <em>Parallel Flow To Operand Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.ParallelFlowToOperandRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getParallelFlowToOperandRule()
	 * @generated
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE = 12;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 328</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_328__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 79</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_79__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 80</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_80__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 329</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_329__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 330</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_330__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

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
	 * The number of operations of the '<em>Parallel Flow To Operand Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCasePrecondToFoundMessageRuleImpl <em>Use Case Precond To Found Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UseCasePrecondToFoundMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUseCasePrecondToFoundMessageRule()
	 * @generated
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE = 13;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_ACTOR_PACKAGEDECLARATION_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASE_ACTOR_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_BASICFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_PACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MESSAGE_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_PACKAGEDECLARATION_LIFELINE_PACKAGE_PACKAGEDECLARATIONTOPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 331</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_331__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 332</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_332__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 333</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_333__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 334</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_334__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 335</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_335__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 336</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_336__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 337</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_337__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 338</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_338__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 81</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_81__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 82</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_82__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 339</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_339__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 340</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_340__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 341</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_341__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 83</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_83__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The number of operations of the '<em>Use Case Precond To Found Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepBFToMessageRuleImpl <em>System Step BF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepBFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getSystemStepBFToMessageRule()
	 * @generated
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE = 14;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 342</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_342__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 343</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_343__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 344</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_344__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 345</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_345__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 346</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_346__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 347</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_347__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 84</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_84__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 85</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_85__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 348</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_348__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 349</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_349__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 350</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_350__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 351</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_351__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 352</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_352__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 353</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_353__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 354</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_354__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 355</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_355__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

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
	 * The number of operations of the '<em>System Step BF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepAltToOperandRuleImpl <em>Step Alt To Operand Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepAltToOperandRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getStepAltToOperandRule()
	 * @generated
	 */
	int STEP_ALT_TO_OPERAND_RULE = 15;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 356</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_356__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 86</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_86__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 87</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_87__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 357</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_357__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 358</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_358__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 359</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_359__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 360</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_360__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 88</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_88__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

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
	 * The number of operations of the '<em>Step Alt To Operand Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepBFToComboRuleImpl <em>Alt Step BF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltStepBFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltStepBFToComboRule()
	 * @generated
	 */
	int ALT_STEP_BF_TO_COMBO_RULE = 16;

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
	int USER_STEP_BF_MESSAGE_RULE = 17;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 361</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_361__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 362</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_362__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 363</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_363__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 364</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_364__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 365</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_365__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 366</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_366__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 89</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_89__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 90</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 367</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_367__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 368</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_368__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 369</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_369__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 370</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_370__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 371</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_371__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 372</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_372__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 373</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_373__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 374</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_374__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

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
	 * The number of operations of the '<em>User Step BF Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepNFToMessageRuleImpl <em>System Step NF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.SystemStepNFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getSystemStepNFToMessageRule()
	 * @generated
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE = 18;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 375</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_375__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 376</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_376__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 377</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_377__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 378</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_378__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 379</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_379__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 380</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_380__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 381</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_381__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 382</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_382__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 383</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_383__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 384</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_384__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 91</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_91__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 92</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_92__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 385</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_385__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 386</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_386__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 387</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_387__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 388</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_388__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 389</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_389__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 390</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_390__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

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
	 * The number of operations of the '<em>System Step NF To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserStepNfToMessageRuleImpl <em>User Step Nf To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UserStepNfToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUserStepNfToMessageRule()
	 * @generated
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE = 19;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 391</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_391__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 392</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_392__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 393</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_393__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 394</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_394__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 395</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_395__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 396</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_396__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 397</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_397__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 398</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_398__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 399</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_399__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 400</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_400__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 401</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_401__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 402</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_402__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 93</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 94</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_94__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 403</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_403__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 404</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_404__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 405</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_405__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 406</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_406__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 407</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_407__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 408</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_408__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

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
	 * The number of operations of the '<em>User Step Nf To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepBFToComboRuleImpl <em>Alt Sys Step BF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepBFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltSysStepBFToComboRule()
	 * @generated
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE = 20;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 409</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_409__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 410</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_410__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 411</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_411__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 412</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_412__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 413</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_413__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 414</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_414__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 415</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_415__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 416</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_416__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 95</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_95__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 96</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_96__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 97</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_97__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 98</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_98__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 417</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_417__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 418</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_418__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 419</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_419__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 420</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_420__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 421</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_421__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 422</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_422__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 423</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_423__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

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
	 * The number of operations of the '<em>Alt Sys Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_BF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepBFToComboRuleImpl <em>Alt User Step BF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepBFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltUserStepBFToComboRule()
	 * @generated
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE = 21;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 424</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_424__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 425</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_425__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 426</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_426__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 427</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_427__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 428</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_428__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 429</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_429__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 430</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_430__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 431</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_431__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 432</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_432__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 433</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_433__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 434</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_434__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 435</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_435__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 99</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_99__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 100</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_100__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 101</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_101__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 102</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_102__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 436</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_436__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 437</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_437__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 438</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_438__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 439</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_439__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 440</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_440__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 441</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_441__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

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
	 * The number of operations of the '<em>Alt User Step BF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_BF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepNFToComboRuleImpl <em>Alt Sys Step NF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltSysStepNFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltSysStepNFToComboRule()
	 * @generated
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE = 22;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 442</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_442__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 443</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_443__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 444</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_444__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 445</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_445__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 446</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_446__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 447</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_447__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 448</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_448__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 449</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_449__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 450</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_450__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 451</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_451__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 452</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_452__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 453</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_453__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 454</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_454__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 455</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_455__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 103</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_103__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 104</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 105</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 106</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 456</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_456__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 457</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_457__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 458</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_458__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 459</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_459__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 460</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_460__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

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
	 * The number of operations of the '<em>Alt Sys Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_SYS_STEP_NF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepNFToComboRuleImpl <em>Alt User Step NF To Combo Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.AltUserStepNFToComboRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getAltUserStepNFToComboRule()
	 * @generated
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE = 23;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 461</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_461__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 462</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_462__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 463</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_463__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 464</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_464__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 465</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_465__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 466</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_466__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 467</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_467__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 468</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_468__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 469</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_469__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 470</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_470__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 471</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_471__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 472</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_472__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 473</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_473__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 474</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_474__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 475</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_475__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 476</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_476__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 477</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_477__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 478</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_478__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 107</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_107__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 108</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_108__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 109</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_109__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 110</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_110__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 479</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_479__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 480</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_480__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 481</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_481__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 482</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_482__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 45;

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
	 * The number of operations of the '<em>Alt User Step NF To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_USER_STEP_NF_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 48;

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_2(UseCaseDSL.UseCasesModel) <em>Is Appropriate FWD Use Cases Model 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Use Cases Model 2</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_2(UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_2__UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_2(ModalSequenceDiagram.Model) <em>Is Appropriate BWD Model 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Model 2</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_2(ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_2__Model();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 74</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 74</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_74__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 322</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 322</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_322__EMoflonEdge();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule <em>Use Case To Interaction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case To Interaction Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule
	 * @generated
	 */
	EClass getUseCaseToInteractionRule();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule <em>Use Case No Precond Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case No Precond Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule
	 * @generated
	 */
	EClass getUseCaseNoPrecondRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_FWD__Match_UseCase_PackageDeclaration_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__RegisterObjectsToMatch_FWD__Match_UseCase_PackageDeclaration_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_solveCsp_FWD__Match_UseCase_PackageDeclaration_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.BasicFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_PackageDeclaration_Package_PackageDeclarationToPackage_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_BWD__Match_Package_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__RegisterObjectsToMatch_BWD__Match_Package_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_solveCsp_BWD__Match_Package_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_FWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 75</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 75</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_FWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_FWD_EMoflonEdge_75__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_BWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 323</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 323</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_BWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_BWD_EMoflonEdge_323__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_FWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 76</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 76</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#isAppropriate_FWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__IsAppropriate_FWD_EMoflonEdge_76__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseNoPrecondRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getUseCaseNoPrecondRule__CheckAttributes_BWD__TripleMatch();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_FWD__Match_Actor_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjectsToMatch_FWD__Match_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_solveCsp_FWD__Match_Actor_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_PackageDeclaration_Package_PackageDeclarationToPackage_Interaction();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_Interaction();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 77</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 77</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_FWD_EMoflonEdge_77__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 324</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 324</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_324__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 325</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 325</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_325__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 326</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 326</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_326__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 327</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 327</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_327__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 78</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 78</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_78__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 328</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 328</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_328__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 79</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 79</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_79__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 80</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 80</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_80__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 329</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 329</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_329__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_330(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 330</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 330</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_330(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_330__EMoflonEdge();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule <em>Use Case Precond To Found Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case Precond To Found Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule
	 * @generated
	 */
	EClass getUseCasePrecondToFoundMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD__Match_UseCase_Actor_PackageDeclaration_BasicFlow();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_FWD__Match_UseCase_Actor_PackageDeclaration_BasicFlow();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Actor_PackageDeclaration_BasicFlow();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.BasicFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.UseCase, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.BasicFlow)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_UseCase_Actor_PackageDeclaration_Package_PackageDeclarationToPackage_BasicFlow();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline_Package();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjectsToMatch_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline_Package();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_Interaction_MessageOccurrenceSpecification_Lifeline_Package();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Message, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Message_Interaction_MessageOccurrenceSpecification_PackageDeclaration_Lifeline_Package_PackageDeclarationToPackage();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_331(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 331</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 331</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_331(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_331__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_332(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 332</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 332</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_332(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_332__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_333(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 333</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 333</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_333(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_333__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_334(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 334</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 334</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_334(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_334__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_335(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 335</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 335</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_335(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_335__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_336(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 336</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 336</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_336(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_336__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_337(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 337</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 337</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_337(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_337__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_338(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 338</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 338</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_338(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_338__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 81</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 81</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_81__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 82</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 82</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_82__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_339(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 339</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 339</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_339(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_339__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_340(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 340</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 340</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_340(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_340__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_341(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 341</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 341</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_341(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_341__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 83</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 83</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_83__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_342(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 342</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 342</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_342(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_342__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_343(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 343</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 343</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_343(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_343__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_344(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 344</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 344</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_344(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_344__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_345(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 345</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 345</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_345(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_345__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_346(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 346</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 346</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_346(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_346__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_347(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 347</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 347</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_347(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_347__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 84</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 84</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_84__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 85</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 85</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_85__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_348(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 348</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 348</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_348(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_348__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_349(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 349</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 349</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_349(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_349__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_350(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 350</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 350</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_350(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_350__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_351(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 351</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 351</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_351(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_351__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_352(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 352</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 352</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_352(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_352__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_353(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 353</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 353</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_353(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_353__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_354(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 354</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 354</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_354(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_354__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_355(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 355</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 355</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_355(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_355__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_356(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 356</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 356</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_356(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_356__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 86</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 86</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_86__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 87</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 87</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_87__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_357(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 357</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 357</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_357(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_357__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_358(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 358</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 358</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_358(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_358__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_359(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 359</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 359</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_359(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_359__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_360(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 360</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 360</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_360(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_360__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 88</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 88</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_88__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_361(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 361</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 361</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_361(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_361__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_362(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 362</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 362</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_362(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_362__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_363(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 363</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 363</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_363(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_363__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_364(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 364</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 364</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_364(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_364__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_365(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 365</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 365</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_365(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_365__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_366(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 366</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 366</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_366(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_366__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 89</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 89</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_89__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 90</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 90</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_90__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_367(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 367</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 367</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_367(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_367__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_368(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 368</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 368</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_368(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_368__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_369(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 369</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 369</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_369(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_369__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_370(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 370</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 370</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_370(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_370__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_371(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 371</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 371</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_371(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_371__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_372(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 372</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 372</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_372(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_372__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_373(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 373</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 373</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_373(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_373__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_374(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 374</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 374</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_374(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_374__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_375(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 375</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 375</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_375(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_375__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_376(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 376</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 376</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_376(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_376__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_377(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 377</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 377</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_377(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_377__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_378(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 378</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 378</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_378(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_378__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_379(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 379</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 379</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_379(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_379__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_380(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 380</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 380</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_380(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_380__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_381(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 381</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 381</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_381(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_381__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_382(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 382</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 382</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_382(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_382__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_383(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 383</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 383</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_383(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_383__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_384(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 384</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 384</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_384(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_384__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 91</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 91</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_91__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 92</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 92</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_92__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_385(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 385</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 385</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_385(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_385__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_386(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 386</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 386</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_386(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_386__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_387(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 387</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 387</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_387(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_387__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_388(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 388</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 388</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_388(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_388__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_389(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 389</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 389</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_389(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_389__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 390</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 390</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_390__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_391(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 391</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 391</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_391(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_391__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_392(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 392</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 392</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_392(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_392__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_393(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 393</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 393</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_393(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_393__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_394(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 394</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 394</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_394(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_394__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_395(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 395</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 395</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_395(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_395__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_396(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 396</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 396</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_396(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_396__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_397(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 397</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 397</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_397(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_397__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_398(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 398</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 398</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_398(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_398__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_399(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 399</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 399</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_399(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_399__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_400(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 400</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 400</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_400(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_400__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_401(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 401</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 401</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_401(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_401__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_402(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 402</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 402</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_402(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_402__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 93</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 93</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_93__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 94</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 94</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_94__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_403(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 403</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 403</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_403(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_403__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_404(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 404</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 404</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_404(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_404__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_405(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 405</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 405</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_405(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_405__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 406</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 406</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_406__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 407</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 407</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_407__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 408</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 408</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_408__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 409</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 409</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_409__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 410</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 410</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_410__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 411</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 411</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_411__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 412</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 412</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_412__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 413</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 413</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_413__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 414</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 414</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_414__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 415</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 415</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_415__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 416</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 416</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_416__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 95</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 95</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_95__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 96</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 96</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_96__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 97</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 97</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_97__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 98</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 98</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_98__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 417</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 417</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_417__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 418</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 418</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_418__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 419</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 419</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_419__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 420</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 420</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_420__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 421</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 421</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_421__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 422</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 422</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_422__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 423</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 423</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_423__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 424</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_424__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 425</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_425__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 426</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_426__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 427</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_427__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 428</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_428__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 429</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 429</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_429__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 430</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 430</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_430__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 431</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 431</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_431__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 432</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 432</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_432__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 433</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 433</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_433__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 434</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 434</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_434__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 435</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 435</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_435__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 99</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 99</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_99__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 100</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 100</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_100__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 101</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 101</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_101__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 102</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 102</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_FWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_FWD_EMoflonEdge_102__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 436</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 436</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_436__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 437</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 437</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_437__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 438</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 438</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_438__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 439</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 439</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_439__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 440</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 440</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_440__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_441(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 441</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 441</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepBFToComboRule#isAppropriate_BWD_EMoflonEdge_441(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepBFToComboRule__IsAppropriate_BWD_EMoflonEdge_441__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_442(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 442</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 442</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_442(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_442__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_443(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 443</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 443</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_443(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_443__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_444(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 444</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 444</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_444(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_444__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_445(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 445</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 445</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_445(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_445__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_446(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 446</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 446</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_446(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_446__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_447(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 447</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 447</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_447(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_447__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_448(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 448</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 448</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_448(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_448__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_449(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 449</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 449</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_449(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_449__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_450(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 450</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 450</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_450(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_450__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_451(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 451</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 451</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_451(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_451__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_452(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 452</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 452</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_452(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_452__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_453(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 453</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 453</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_453(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_453__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_454(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 454</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 454</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_454(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_454__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_455(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 455</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 455</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_455(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_455__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 103</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 103</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_103__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 104</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 104</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_104__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 105</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 105</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_105__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 106</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 106</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_106__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_456(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 456</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 456</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_456(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_456__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_457(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 457</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 457</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_457(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_457__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_458(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 458</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 458</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_458(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_458__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_459(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 459</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 459</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_459(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_459__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_460(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 460</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 460</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltSysStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_460(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltSysStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_460__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_461(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 461</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 461</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_461(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_461__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_462(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 462</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 462</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_462(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_462__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_463(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 463</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 463</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_463(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_463__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_464(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 464</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 464</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_464(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_464__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_465(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 465</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 465</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_465(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_465__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_466(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 466</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 466</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_466(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_466__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_467(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 467</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 467</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_467(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_467__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_468(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 468</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 468</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_468(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_468__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_469(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 469</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 469</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_469(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_469__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_470(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 470</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 470</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_470(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_470__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_471(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 471</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 471</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_471(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_471__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_472(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 472</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 472</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_472(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_472__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_473(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 473</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 473</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_473(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_473__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_474(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 474</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 474</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_474(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_474__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_475(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 475</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 475</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_475(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_475__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_476(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 476</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 476</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_476(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_476__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_477(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 477</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 477</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_477(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_477__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_478(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 478</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 478</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_478(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_478__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 107</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 107</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_107__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 108</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 108</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_108__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 109</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 109</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 110</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_FWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_479(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 479</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 479</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_479(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_479__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_480(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 480</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 480</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_480(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_480__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_481(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 481</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 481</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_481(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_481__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_482(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 482</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 482</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltUserStepNFToComboRule#isAppropriate_BWD_EMoflonEdge_482(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltUserStepNFToComboRule__IsAppropriate_BWD_EMoflonEdge_482__EMoflonEdge();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
