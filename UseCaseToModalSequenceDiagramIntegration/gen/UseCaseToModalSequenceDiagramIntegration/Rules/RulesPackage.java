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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 308</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_308__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 309</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_309__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 310</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_310__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 311</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_311__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 312</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_312__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 313</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_313__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 487</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_487__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 488</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_STEP_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_488__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 314</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_314__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 315</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_315__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 316</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_316__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 317</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_317__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 318</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_318__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 319</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_319__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 489</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_489__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 490</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_STEP_TO_LOST_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_490__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

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
	 * The operation id for the '<em>Is Appropriate FWD Use Cases Model 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_1__USECASESMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Model 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_1__MODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 491</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_491__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 320</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_320__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 492</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_492__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 321</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_321__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 493</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_493__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 494</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_494__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 322</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_322__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 323</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TO_LIFELINE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_323__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 324</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_324__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 325</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_325__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 495</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_495__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 496</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_496__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 326</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_326__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 327</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_STEP_TO_COMBO_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_327__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 328</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_328__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 329</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_329__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 497</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_497__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 330</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_330__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 498</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_498__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 499</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_499__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 331</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_331__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 332</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_332__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 500</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_500__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 333</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_333__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 334</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_334__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 335</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_335__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 336</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_336__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 337</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_337__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 338</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_338__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 339</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_339__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 340</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_340__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 341</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_341__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 342</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_342__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 343</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_343__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 344</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_344__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 345</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_345__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 346</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_346__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 347</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_347__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 348</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_348__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 349</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_349__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 350</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_350__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 351</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_351__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 352</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_352__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 353</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_353__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 354</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_354__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 501</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_501__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 502</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_BF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_502__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 355</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_355__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 503</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_503__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 504</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_504__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 356</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_356__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 357</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_357__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 358</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_358__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 359</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_359__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 505</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALT_TO_OPERAND_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_505__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 360</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_360__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 361</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_361__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 362</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_362__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 363</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_363__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 364</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_364__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 365</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_365__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 366</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_366__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 367</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_367__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 368</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_368__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 369</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_369__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 370</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_370__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 371</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_371__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 372</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_372__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 373</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_373__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 506</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_506__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 507</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_507__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 374</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_374__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 375</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_375__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 376</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_376__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 377</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_377__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 378</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_378__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 379</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_379__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 380</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_380__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 381</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_381__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 382</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_382__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 383</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_383__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 384</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_384__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 385</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_385__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 386</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_386__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 387</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_387__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 388</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_388__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 389</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_389__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 508</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_508__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 509</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_509__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 390</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_390__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 391</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_391__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 392</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_392__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 393</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_393__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 394</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_394__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 395</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_395__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 396</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_396__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 397</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_397__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 398</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_398__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 399</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_399__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 400</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_400__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 401</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_401__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 402</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_402__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 403</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_403__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 404</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_404__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 405</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_405__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 406</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_406__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 407</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_407__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 510</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_510__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 511</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STEP_NF_TO_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_511__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_308(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 308</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 308</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_308(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_308__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_309(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 309</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 309</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_309(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_309__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_310(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 310</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 310</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_310(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_310__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_311(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 311</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 311</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_311(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_311__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_312(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 312</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 312</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_312(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_312__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_313(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 313</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 313</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_BWD_EMoflonEdge_313(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_BWD_EMoflonEdge_313__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_487(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 487</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 487</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_487(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_487__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_488(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 488</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 488</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.WaitStepToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_488(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWaitStepToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_488__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_314(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 314</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 314</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_314(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_314__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_315(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 315</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 315</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_315(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_315__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_316(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 316</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 316</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_316(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_316__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_317(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 317</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 317</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_317(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_317__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_318(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 318</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 318</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_318(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_318__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_319(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 319</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 319</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_BWD_EMoflonEdge_319(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_BWD_EMoflonEdge_319__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_489(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 489</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 489</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_489(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_FWD_EMoflonEdge_489__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_490(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 490</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 490</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SendStepToLostMessageRule#isAppropriate_FWD_EMoflonEdge_490(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSendStepToLostMessageRule__IsAppropriate_FWD_EMoflonEdge_490__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_1(UseCaseDSL.UseCasesModel) <em>Is Appropriate FWD Use Cases Model 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Use Cases Model 1</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_FWD_UseCasesModel_1(UseCaseDSL.UseCasesModel)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_FWD_UseCasesModel_1__UseCasesModel();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_1(ModalSequenceDiagram.Model) <em>Is Appropriate BWD Model 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Model 1</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule#isAppropriate_BWD_Model_1(ModalSequenceDiagram.Model)
	 * @generated
	 */
	EOperation getUCModelToMSDModelRule__IsAppropriate_BWD_Model_1__Model();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_491(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 491</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 491</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_FWD_EMoflonEdge_491(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_FWD_EMoflonEdge_491__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_320(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 320</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 320</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage#isAppropriate_BWD_EMoflonEdge_320(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUCPackageToMSDPackage__IsAppropriate_BWD_EMoflonEdge_320__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_492(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 492</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 492</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_492(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_492__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_321(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 321</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 321</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_BWD_EMoflonEdge_321(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_BWD_EMoflonEdge_321__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_493(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 493</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 493</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule#isAppropriate_FWD_EMoflonEdge_493(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCaseToInteractionRule__IsAppropriate_FWD_EMoflonEdge_493__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_494(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 494</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 494</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_FWD_EMoflonEdge_494(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_FWD_EMoflonEdge_494__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 322</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 322</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_322__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 323</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 323</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ActorToLifelineRule#isAppropriate_BWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getActorToLifelineRule__IsAppropriate_BWD_EMoflonEdge_323__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 324</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 324</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_324__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 325</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 325</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_325__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_495(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 495</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 495</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_495(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_FWD_EMoflonEdge_495__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_496(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 496</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 496</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_FWD_EMoflonEdge_496(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_FWD_EMoflonEdge_496__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 326</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 326</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_326__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 327</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 327</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.AltStepToComboRule#isAppropriate_BWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getAltStepToComboRule__IsAppropriate_BWD_EMoflonEdge_327__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 328</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 328</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_328__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 329</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 329</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_BWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_BWD_EMoflonEdge_329__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_497(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 497</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 497</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelStepToCombinedFragmentRule#isAppropriate_FWD_EMoflonEdge_497(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelStepToCombinedFragmentRule__IsAppropriate_FWD_EMoflonEdge_497__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_330(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 330</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 330</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_330(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_330__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_498(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 498</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 498</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_498(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_498__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_499(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 499</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 499</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_FWD_EMoflonEdge_499(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_FWD_EMoflonEdge_499__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_331(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 331</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 331</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_331(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_331__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_332(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 332</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 332</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.ParallelFlowToOperandRule#isAppropriate_BWD_EMoflonEdge_332(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelFlowToOperandRule__IsAppropriate_BWD_EMoflonEdge_332__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_500(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 500</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 500</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UseCasePrecondToFoundMessageRule#isAppropriate_FWD_EMoflonEdge_500(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUseCasePrecondToFoundMessageRule__IsAppropriate_FWD_EMoflonEdge_500__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_341(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 341</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 341</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_BWD_EMoflonEdge_341(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_BWD_EMoflonEdge_341__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_501(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 501</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 501</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_501(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_501__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_502(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 502</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 502</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepBFToMessageRule#isAppropriate_FWD_EMoflonEdge_502(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepBFToMessageRule__IsAppropriate_FWD_EMoflonEdge_502__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_355(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 355</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 355</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_BWD_EMoflonEdge_355(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_BWD_EMoflonEdge_355__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_503(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 503</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 503</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_503(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_503__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_504(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 504</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 504</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_504(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_504__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_505(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 505</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 505</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.StepAltToOperandRule#isAppropriate_FWD_EMoflonEdge_505(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStepAltToOperandRule__IsAppropriate_FWD_EMoflonEdge_505__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_360(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 360</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 360</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_BWD_EMoflonEdge_360(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_BWD_EMoflonEdge_360__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_506(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 506</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 506</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_506(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_506__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_507(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 507</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 507</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule#isAppropriate_FWD_EMoflonEdge_507(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepBFMessageRule__IsAppropriate_FWD_EMoflonEdge_507__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_374(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 374</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 374</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_BWD_EMoflonEdge_374(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_BWD_EMoflonEdge_374__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_508(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 508</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 508</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_508(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_508__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_509(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 509</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 509</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.SystemStepNFToMessageRule#isAppropriate_FWD_EMoflonEdge_509(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSystemStepNFToMessageRule__IsAppropriate_FWD_EMoflonEdge_509__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 390</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 390</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_BWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_BWD_EMoflonEdge_390__EMoflonEdge();

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
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_510(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 510</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 510</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_510(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_510__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_511(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 511</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 511</em>' operation.
	 * @see UseCaseToModalSequenceDiagramIntegration.Rules.UserStepNfToMessageRule#isAppropriate_FWD_EMoflonEdge_511(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getUserStepNfToMessageRule__IsAppropriate_FWD_EMoflonEdge_511__EMoflonEdge();

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
