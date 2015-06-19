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
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.WaitStepToFoundMessageRuleImpl <em>Wait Step To Found Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.WaitStepToFoundMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getWaitStepToFoundMessageRule()
	 * @generated
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE = 0;

	/**
	 * The number of structural features of the '<em>Wait Step To Found Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NORMALSTEP_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 869</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_869__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 870</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_870__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 871</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_871__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 872</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_872__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 873</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_873__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 874</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_874__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 424</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_424__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 425</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_425__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Wait Step To Found Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.SendStepToLostMessageRuleImpl <em>Send Step To Lost Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.SendStepToLostMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getSendStepToLostMessageRule()
	 * @generated
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE = 1;

	/**
	 * The number of structural features of the '<em>Send Step To Lost Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NORMALSTEP_USECASE_FLOW_ACTOR_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NORMALSTEP_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MESSAGE_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 875</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_875__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 876</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_876__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 877</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_877__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 878</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_878__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 879</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_879__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 880</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_880__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 426</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_426__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 427</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_427__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_FLOW_ACTOR_ACTORTOLIFELINE_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Send Step To Lost Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepToMessageRuleImpl <em>Step To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.StepToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getStepToMessageRule()
	 * @generated
	 */
	int STEP_TO_MESSAGE_RULE = 2;

	/**
	 * The number of structural features of the '<em>Step To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_MESSAGE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step To Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TO_MESSAGE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.UCModelToMSDModelRuleImpl <em>UC Model To MSD Model Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.UCModelToMSDModelRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getUCModelToMSDModelRule()
	 * @generated
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE = 3;

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
	 * The operation id for the '<em>Is Appropriate FWD Use Cases Model 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_8__USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Model 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_8__MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	int UC_PACKAGE_TO_MSD_PACKAGE = 4;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 428</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_428__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 881</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_881__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	int USE_CASE_TO_INTERACTION_RULE = 5;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 429</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_429__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 882</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_882__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 430</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_430__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	int ACTOR_TO_LIFELINE_RULE = 6;

	/**
	 * The number of structural features of the '<em>Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_ACTOR_USECASE_USECASETOINTERACTION_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_LIFELINE_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_LIFELINE_USECASE_USECASETOINTERACTION_INTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 431</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_431__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 883</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_883__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 884</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_884__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_USECASETOINTERACTION_INTERACTION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Actor To Lifeline Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepToMessageRuleImpl <em>Normal Step To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_TO_MESSAGE_RULE = 7;

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
	 * The meta object id for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBFToMessageRuleImpl <em>Normal Step BF To Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.NormalStepBFToMessageRuleImpl
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl#getNormalStepBFToMessageRule()
	 * @generated
	 */
	int NORMAL_STEP_BF_TO_MESSAGE_RULE = 8;

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
	int NORMAL_STEP_NF_TO_MESSAGE_RULE = 9;

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
	int ALT_STEP_TO_COMBO_RULE = 10;

	/**
	 * The number of structural features of the '<em>Alt Step To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD__MATCH_USECASE_FLOW_PACKAGEDECLARATION_ACTOR_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASE_FLOW_PACKAGEDECLARATION_ACTOR_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASE_FLOW_PACKAGEDECLARATION_ACTOR_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERACTION_USECASE_USECASETOINTERACTION_FLOW_PACKAGEDECLARATION_ACTOR_ACTORTOLIFELINE_NORMALSTEP_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERACTION_COMBINEDFRAGMENT_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_USECASE_USECASETOINTERACTION_FLOW_PACKAGEDECLARATION_ACTOR_ACTORTOLIFELINE_COMBINEDFRAGMENT_LIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 885</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_885__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 886</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_886__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 432</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_432__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 433</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_433__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 887</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_887__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 888</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_888__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_USECASETOINTERACTION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERACTION_USECASE_USECASETOINTERACTION_FLOW_PACKAGEDECLARATION_ACTOR_ACTORTOLIFELINE_LIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Alt Step To Combo Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 889</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_889__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 890</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_890__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 434</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_434__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 891</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_891__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 435</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_435__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 436</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_436__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 892</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_892__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 893</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_893__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 437</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_437__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 894</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_894__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 895</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_895__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 896</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_896__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 897</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_897__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 898</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_898__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 899</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_899__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 900</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_900__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 901</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_901__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

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
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_BASICFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_BASICFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_BASICFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_NORMALSTEP_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGE_USECASE_USECASETOINTERACTION_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 902</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_902__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 903</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_903__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 904</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_904__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 905</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_905__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 906</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_906__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 907</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_907__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 908</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_908__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 909</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_909__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 910</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_910__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 911</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_911__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 912</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_912__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 913</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_913__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 914</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_914__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 915</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_915__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 438</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_438__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 439</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_439__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 916</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_916__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 440</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_440__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 441</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_441__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 917</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_917__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 918</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_918__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 919</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_919__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 920</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_920__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 442</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_442__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

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
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_NORMALSTEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_NORMALSTEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_NORMALSTEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_NORMALSTEP_LIFELINE_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	int USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGE_LIFELINE_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 921</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_921__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 922</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_922__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 923</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_923__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 924</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_924__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 925</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_925__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 926</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_926__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 927</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_927__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 928</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_928__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 929</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_929__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 930</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_930__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 931</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_931__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 932</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_932__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 933</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_933__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 934</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_934__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 443</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_443__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 444</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_444__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

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
	int USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_NORMALSTEP_USECASE_INTERACTION_USECASETOINTERACTION_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_COMBINEDFRAGMENT_MESSAGE_USECASE_INTERACTION_USECASETOINTERACTION_PACKAGEDECLARATION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 935</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_935__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 936</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_936__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 937</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_937__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 938</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_938__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 939</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_939__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 940</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_940__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 941</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_941__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 942</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_942__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 943</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_943__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 944</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_944__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 945</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_945__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 946</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_946__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 947</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_947__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 948</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_948__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 949</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_949__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 950</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_950__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 445</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_445__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 446</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_446__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

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
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_LIFELINE_INTERACTIONOPERAND_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_COMBINEDFRAGMENT_USECASE_INTERACTION_USECASETOINTERACTION_PACKAGEDECLARATION_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_ACTOR_ACTOR_NAMEDFLOW_NORMALSTEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_NORMALSTEP_USECASE_INTERACTION_USECASETOINTERACTION_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGEOCCURRENCESPECIFICATION_LIFELINE_MESSAGE_USECASE_INTERACTION_USECASETOINTERACTION_ACTORTOLIFELINE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 951</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_951__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 952</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_952__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 953</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_953__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 954</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_954__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 955</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_955__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 956</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_956__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 957</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_957__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 958</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_958__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 959</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_959__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 960</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_960__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 961</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_961__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 962</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_962__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 963</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_963__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 964</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_964__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 965</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_965__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 966</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_966__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 967</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_967__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 968</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_968__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 447</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_447__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 448</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_448__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

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
	int USER_STEP_NF_TO_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_ACTOR_ACTOR_LIFELINE_ACTORTOLIFELINE_INTERACTIONOPERAND_COMBINEDFRAGMENT_NAMEDFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_INTERACTION_USECASETOINTERACTION_ACTORTOLIFELINE_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 43;

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule <em>Wait Step To Found Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Step To Found Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule
	 * @generated
	 */
	EClass getWaitStepToFoundMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__RegisterObjectsToMatch_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NormalStep_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__RegisterObjectsToMatch_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Message_MessageOccurrenceSpecification_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_869(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 869</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 869</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_869(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_869__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_870(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 870</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 870</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_870(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_870__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_871(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 871</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 871</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_871(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_871__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_872(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 872</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 872</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_872(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_872__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_873(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 873</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 873</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_873(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_873__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_874(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 874</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 874</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_874(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_874__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 424</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_424__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 425</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_425__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule <em>Send Step To Lost Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Step To Lost Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule
	 * @generated
	 */
	EClass getSendStepToLostMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__RegisterObjectsToMatch_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_solveCsp_FWD__Match_NormalStep_UseCase_Flow_Actor_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NormalStep_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__RegisterObjectsToMatch_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_solveCsp_BWD__Match_Message_MessageOccurrenceSpecification_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Message, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Message_MessageOccurrenceSpecification_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_875(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 875</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 875</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_875(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_875__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_876(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 876</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 876</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_876(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_876__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_877(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 877</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 877</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_877(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_877__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_878(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 878</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 878</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_878(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_878__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_879(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 879</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 879</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_879(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_879__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_880(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 880</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 880</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_880(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_880__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 426</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_FWD_EMoflonEdge_426__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 427</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_FWD_EMoflonEdge_427__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Lifeline_UseCase_Interaction_UseCaseToInteraction_Flow_Actor_ActorToLifeline_PackageDeclaration_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepToMessageRule <em>Step To Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step To Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepToMessageRule
	 * @generated
	 */
	EClass getStepToMessageRule();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_8(UseCaseDSL.UseCasesModel) <em>Is Appropriate FWD Use Cases Model 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Use Cases Model 8</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_8(UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_8__UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_8(ModalSequenceDiagram.Model) <em>Is Appropriate BWD Model 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Model 8</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_8(ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_8__Model();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 428</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_428__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_881(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 881</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 881</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_881(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_881__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 429</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 429</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_429__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_882(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 882</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 882</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_882(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_BWD_EMoflonEdge_882__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 430</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 430</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_430__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.UseCase) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getActorToLifelineRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.UseCase) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getActorToLifelineRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.UseCase) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.Actor, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.Actor, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Actor_UseCase_UseCaseToInteraction_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getActorToLifelineRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToLifelineRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getActorToLifelineRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToLifelineRule__RegisterObjectsToMatch_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Package, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_solveCsp_BWD__Match_Package_Lifeline_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_Lifeline_UseCase_UseCaseToInteraction_Interaction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getActorToLifelineRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getActorToLifelineRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 431</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 431</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_FWD_EMoflonEdge_431__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_883(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 883</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 883</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_883(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_883__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_884(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 884</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 884</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_884(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_884__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getActorToLifelineRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getActorToLifelineRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getActorToLifelineRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Package, UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, ModalSequenceDiagram.Interaction, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getActorToLifelineRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Package_PackageDeclarationToPackage_UseCase_UseCaseToInteraction_Interaction_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getActorToLifelineRule__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.NormalStep) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_FWD__Match_UseCase_Flow_PackageDeclaration_Actor_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltStepToComboRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.NormalStep) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getAltStepToComboRule__RegisterObjectsToMatch_FWD__Match_UseCase_Flow_PackageDeclaration_Actor_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.NormalStep) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.UseCase, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.NormalStep)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_solveCsp_FWD__Match_UseCase_Flow_PackageDeclaration_Actor_NormalStep();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Interaction_UseCase_UseCaseToInteraction_Flow_PackageDeclaration_Actor_ActorToLifeline_NormalStep_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltStepToComboRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltStepToComboRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD__Match_Interaction_CombinedFragment_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getAltStepToComboRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjectsToMatch_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getAltStepToComboRule__RegisterObjectsToMatch_BWD__Match_Interaction_CombinedFragment_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_solveCsp_BWD__Match_Interaction_CombinedFragment_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Lifeline)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interaction_UseCase_UseCaseToInteraction_Flow_PackageDeclaration_Actor_ActorToLifeline_CombinedFragment_Lifeline();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAltStepToComboRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getAltStepToComboRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_885(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 885</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 885</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_885(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_885__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_886(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 886</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 886</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_886(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_886__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 432</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 432</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_FWD_EMoflonEdge_432__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 433</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 433</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_FWD_EMoflonEdge_433__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_887(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 887</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 887</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_887(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_887__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_888(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 888</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 888</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_888(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_888__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltStepToComboRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getAltStepToComboRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction)
	 * @generated
	 */
	EOperation getAltStepToComboRule__GenerateModel__RuleEntryContainer_UseCaseToInteraction();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ModalSequenceDiagram.Interaction, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.Flow, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Lifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getAltStepToComboRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Interaction_UseCase_UseCaseToInteraction_Flow_PackageDeclaration_Actor_ActorToLifeline_Lifeline_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getAltStepToComboRule__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_889(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 889</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 889</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_889(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_889__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_890(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 890</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 890</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_890(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_890__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 434</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 434</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_434__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_891(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 891</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 891</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_891(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_891__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 435</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 435</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_435__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 436</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 436</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_436__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_892(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 892</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 892</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_892(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_892__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_893(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 893</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 893</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_893(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_893__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 437</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 437</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_437__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_894(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 894</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 894</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_894(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_894__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_895(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 895</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 895</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_895(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_895__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_896(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 896</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 896</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_896(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_896__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_897(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 897</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 897</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_897(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_897__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_898(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 898</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 898</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_898(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_898__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_899(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 899</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 899</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_899(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_899__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_900(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 900</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 900</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_900(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_900__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_901(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 901</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 901</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_901(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_901__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD__Match_Actor_BasicFlow_NormalStep_UseCase_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_BasicFlow_NormalStep_UseCase_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_BasicFlow_NormalStep_UseCase_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_Interaction_BasicFlow_FlowToInteractionFragment_NormalStep_UseCase_UseCaseToInteraction_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Message, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Message, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_Message_UseCase_UseCaseToInteraction_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_902(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 902</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 902</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_902(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_902__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_903(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 903</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 903</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_903(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_903__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_904(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 904</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 904</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_904(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_904__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_905(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 905</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 905</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_905(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_905__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_906(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 906</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 906</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_906(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_906__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_907(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 907</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 907</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_907(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_907__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_908(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 908</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 908</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_908(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_908__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_909(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 909</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 909</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_909(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_909__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_910(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 910</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 910</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_910(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_910__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_911(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 911</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 911</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_911(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_911__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_912(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 912</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 912</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_912(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_912__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_913(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 913</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 913</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_913(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_913__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_914(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 914</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 914</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_914(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_914__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_915(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 915</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 915</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_915(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_915__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 438</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 438</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_438__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 439</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 439</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_439__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_916(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 916</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 916</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_916(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_916__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 440</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 440</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_440__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_441(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 441</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 441</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_441(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_441__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_917(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 917</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 917</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_917(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_917__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_918(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 918</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 918</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_918(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_918__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_919(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 919</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 919</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_919(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_919__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_920(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 920</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 920</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_920(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_920__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_442(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 442</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 442</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_442(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_442__EMoflonEdge();

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
	 * Returns the meta object for class '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule <em>User Step BF Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Step BF Message Rule</em>'.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule
	 * @generated
	 */
	EClass getUserStepBFMessageRule();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_NormalStep_UseCase();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_NormalStep_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, UseCaseDSL.BasicFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_Actor_PackageDeclaration_BasicFlow_NormalStep_UseCase();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, UseCaseDSL.NormalStep, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_NormalStep_Lifeline_UseCase_UseCaseToInteraction_ActorToLifeline();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Interaction, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Message, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_MessageOccurrenceSpecification_Interaction_MessageOccurrenceSpecification_BasicFlow_FlowToInteractionFragment_Message_Lifeline_UseCase_UseCaseToInteraction_ActorToLifeline();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_921(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 921</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 921</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_921(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_921__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_922(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 922</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 922</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_922(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_922__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_923(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 923</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 923</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_923(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_923__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_924(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 924</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 924</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_924(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_924__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_925(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 925</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 925</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_925(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_925__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_926(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 926</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 926</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_926(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_926__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_927(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 927</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 927</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_927(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_927__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_928(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 928</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 928</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_928(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_928__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_929(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 929</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 929</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_929(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_929__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_930(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 930</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 930</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_930(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_930__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_931(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 931</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 931</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_931(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_931__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_932(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 932</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 932</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_932(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_932__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_933(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 933</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 933</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_933(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_933__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_934(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 934</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 934</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_934(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_934__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_443(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 443</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 443</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_443(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_443__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_444(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 444</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 444</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_444(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_444__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.PackageDeclaration, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.Interaction, UseCaseDSL.BasicFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Actor_PackageDeclaration_Lifeline_ActorToLifeline_Interaction_BasicFlow_FlowToInteractionFragment_Lifeline_UseCase_UseCaseToInteraction_ActorToLifeline_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD__Match_Actor_NamedFlow_NormalStep_UseCase_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjectsToMatch_FWD__Match_Actor_NamedFlow_NormalStep_UseCase_PackageDeclaration();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_solveCsp_FWD__Match_Actor_NamedFlow_NormalStep_UseCase_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_NormalStep_UseCase_Interaction_UseCaseToInteraction_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.CombinedFragment, ModalSequenceDiagram.Message, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_MessageOccurrenceSpecification_InteractionOperand_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_CombinedFragment_Message_UseCase_Interaction_UseCaseToInteraction_PackageDeclaration();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_935(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 935</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 935</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_935(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_935__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_936(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 936</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 936</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_936(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_936__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_937(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 937</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 937</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_937(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_937__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_938(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 938</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 938</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_938(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_938__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_939(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 939</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 939</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_939(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_939__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_940(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 940</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 940</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_940(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_940__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_941(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 941</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 941</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_941(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_941__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_942(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 942</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 942</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_942(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_942__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_943(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 943</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 943</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_943(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_943__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_944(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 944</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 944</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_944(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_944__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_945(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 945</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 945</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_945(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_945__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_946(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 946</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 946</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_946(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_946__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_947(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 947</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 947</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_947(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_947__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_948(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 948</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 948</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_948(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_948__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_949(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 949</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 949</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_949(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_949__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_950(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 950</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 950</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_950(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_950__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_445(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 445</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 445</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_445(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_445__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_446(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 446</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 446</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_446(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_446__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.InteractionOperand, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseDSL.PackageDeclaration, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Actor_Lifeline_InteractionOperand_NamedFlow_FlowToInteractionFragment_CombinedFragment_UseCase_Interaction_UseCaseToInteraction_PackageDeclaration_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_NormalStep_UseCase();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjectsToMatch_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjectsToMatch_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_NormalStep_UseCase();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, UseCaseDSL.NamedFlow, UseCaseDSL.NormalStep, UseCaseDSL.UseCase)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_solveCsp_FWD__Match_PackageDeclaration_Actor_Actor_NamedFlow_NormalStep_UseCase();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.NormalStep, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_NormalStep_UseCase_Interaction_UseCaseToInteraction_ActorToLifeline();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.MessageOccurrenceSpecification, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.MessageOccurrenceSpecification, ModalSequenceDiagram.Lifeline, ModalSequenceDiagram.Message, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_MessageOccurrenceSpecification_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_MessageOccurrenceSpecification_Lifeline_Message_UseCase_Interaction_UseCaseToInteraction_ActorToLifeline();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_951(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 951</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 951</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_951(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_951__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_952(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 952</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 952</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_952(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_952__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_953(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 953</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 953</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_953(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_953__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_954(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 954</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 954</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_954(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_954__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_955(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 955</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 955</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_955(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_955__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_956(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 956</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 956</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_956(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_956__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_957(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 957</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 957</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_957(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_957__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_958(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 958</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 958</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_958(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_958__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_959(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 959</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 959</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_959(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_959__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_960(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 960</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 960</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_960(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_960__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_961(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 961</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 961</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_961(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_961__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_962(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 962</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 962</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_962(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_962__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_963(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 963</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 963</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_963(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_963__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_964(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 964</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 964</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_964(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_964__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_965(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 965</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 965</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_965(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_965__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_966(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 966</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 966</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_966(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_966__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_967(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 967</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 967</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_967(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_967__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_968(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 968</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 968</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_968(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_968__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_447(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 447</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 447</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_447(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_447__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_448(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 448</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 448</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_448(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_448__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, UseCaseDSL.PackageDeclaration, UseCaseDSL.Actor, UseCaseDSL.Actor, ModalSequenceDiagram.Lifeline, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, ModalSequenceDiagram.InteractionOperand, ModalSequenceDiagram.CombinedFragment, UseCaseDSL.NamedFlow, UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment, ModalSequenceDiagram.Lifeline, UseCaseDSL.UseCase, ModalSequenceDiagram.Interaction, UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction, UseCaseToModalSequenceDiagramIntegration.ActorToLifeline, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageDeclaration_Actor_Actor_Lifeline_ActorToLifeline_InteractionOperand_CombinedFragment_NamedFlow_FlowToInteractionFragment_Lifeline_UseCase_Interaction_UseCaseToInteraction_ActorToLifeline_ModelgeneratorRuleResult();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
