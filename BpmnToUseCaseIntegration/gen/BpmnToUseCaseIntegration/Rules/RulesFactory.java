/**
 */
package BpmnToUseCaseIntegration.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = BpmnToUseCaseIntegration.Rules.impl.RulesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Bp Model To Use Case Model Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bp Model To Use Case Model Rule</em>'.
	 * @generated
	 */
	BpModelToUseCaseModelRule createBpModelToUseCaseModelRule();

	/**
	 * Returns a new object of class '<em>Definitions To Package Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions To Package Rule</em>'.
	 * @generated
	 */
	DefinitionsToPackageRule createDefinitionsToPackageRule();

	/**
	 * Returns a new object of class '<em>Process To Use Case Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process To Use Case Rule</em>'.
	 * @generated
	 */
	ProcessToUseCaseRule createProcessToUseCaseRule();

	/**
	 * Returns a new object of class '<em>Lane Set Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane Set Rule</em>'.
	 * @generated
	 */
	LaneSetRule createLaneSetRule();

	/**
	 * Returns a new object of class '<em>Lane To Actor Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane To Actor Rule</em>'.
	 * @generated
	 */
	LaneToActorRule createLaneToActorRule();

	/**
	 * Returns a new object of class '<em>Service Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task To Step Rule</em>'.
	 * @generated
	 */
	ServiceTaskToStepRule createServiceTaskToStepRule();

	/**
	 * Returns a new object of class '<em>User Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task To Step Rule</em>'.
	 * @generated
	 */
	UserTaskToStepRule createUserTaskToStepRule();

	/**
	 * Returns a new object of class '<em>ITE To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ITE To Step Rule</em>'.
	 * @generated
	 */
	ITEToStepRule createITEToStepRule();

	/**
	 * Returns a new object of class '<em>End Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event Rule</em>'.
	 * @generated
	 */
	EndEventRule createEndEventRule();

	/**
	 * Returns a new object of class '<em>First Inter Throw Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Inter Throw Event To Step Rule</em>'.
	 * @generated
	 */
	FirstInterThrowEventToStepRule createFirstInterThrowEventToStepRule();

	/**
	 * Returns a new object of class '<em>Event Based Gateway To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Based Gateway To Step Core Rule</em>'.
	 * @generated
	 */
	EventBasedGatewayToStepCoreRule createEventBasedGatewayToStepCoreRule();

	/**
	 * Returns a new object of class '<em>Parallel Converging Gateway Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Converging Gateway Rule</em>'.
	 * @generated
	 */
	ParallelConvergingGatewayRule createParallelConvergingGatewayRule();

	/**
	 * Returns a new object of class '<em>Seq Flow After EG To Alt Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Flow After EG To Alt Flow Rule</em>'.
	 * @generated
	 */
	SeqFlowAfterEGToAltFlowRule createSeqFlowAfterEGToAltFlowRule();

	/**
	 * Returns a new object of class '<em>Seq Flow After PG To Parallel Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Flow After PG To Parallel Flow Rule</em>'.
	 * @generated
	 */
	SeqFlowAfterPGToParallelFlowRule createSeqFlowAfterPGToParallelFlowRule();

	/**
	 * Returns a new object of class '<em>Catch Event After EBG To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Event After EBG To Step Rule</em>'.
	 * @generated
	 */
	CatchEventAfterEBGToStepRule createCatchEventAfterEBGToStepRule();

	/**
	 * Returns a new object of class '<em>Exclusive Gateway To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Gateway To Step Rule</em>'.
	 * @generated
	 */
	ExclusiveGatewayToStepRule createExclusiveGatewayToStepRule();

	/**
	 * Returns a new object of class '<em>Parallel Gateway To Parallel Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Gateway To Parallel Step Rule</em>'.
	 * @generated
	 */
	ParallelGatewayToParallelStepRule createParallelGatewayToParallelStepRule();

	/**
	 * Returns a new object of class '<em>Event Based Gateway To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Based Gateway To Step Rule</em>'.
	 * @generated
	 */
	EventBasedGatewayToStepRule createEventBasedGatewayToStepRule();

	/**
	 * Returns a new object of class '<em>Lane Start Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane Start Event Rule</em>'.
	 * @generated
	 */
	LaneStartEventRule createLaneStartEventRule();

	/**
	 * Returns a new object of class '<em>Exc Conv Gw After Event Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exc Conv Gw After Event Gw Rule</em>'.
	 * @generated
	 */
	ExcConvGwAfterEventGwRule createExcConvGwAfterEventGwRule();

	/**
	 * Returns a new object of class '<em>Exc Conv Gw Default Seq Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exc Conv Gw Default Seq Flow Rule</em>'.
	 * @generated
	 */
	ExcConvGwDefaultSeqFlowRule createExcConvGwDefaultSeqFlowRule();

	/**
	 * Returns a new object of class '<em>Parallel Converging Gateway Two Inputs Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Converging Gateway Two Inputs Rule</em>'.
	 * @generated
	 */
	ParallelConvergingGatewayTwoInputsRule createParallelConvergingGatewayTwoInputsRule();

	/**
	 * Returns a new object of class '<em>Exc Conv Gw After Ex Div Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exc Conv Gw After Ex Div Gw Rule</em>'.
	 * @generated
	 */
	ExcConvGwAfterExDivGwRule createExcConvGwAfterExDivGwRule();

	/**
	 * Returns a new object of class '<em>Ex Conv Gw After Event Gw Ice Seq Flow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex Conv Gw After Event Gw Ice Seq Flow Rule</em>'.
	 * @generated
	 */
	ExConvGwAfterEventGwIceSeqFlowRule createExConvGwAfterEventGwIceSeqFlowRule();

	/**
	 * Returns a new object of class '<em>Continuation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuation Rule</em>'.
	 * @generated
	 */
	ContinuationRule createContinuationRule();

	/**
	 * Returns a new object of class '<em>ICE To Step After SE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After SE Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterSERule createICEToStepAfterSERule();

	/**
	 * Returns a new object of class '<em>ICE To Step After Ex Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After Ex Gw Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterExGwRule createICEToStepAfterExGwRule();

	/**
	 * Returns a new object of class '<em>ICE To Step After PG Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After PG Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterPGRule createICEToStepAfterPGRule();

	/**
	 * Returns a new object of class '<em>ICE To Step After Task Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After Task Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterTaskRule createICEToStepAfterTaskRule();

	/**
	 * Returns a new object of class '<em>ICE To Step After Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After Event Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterEventRule createICEToStepAfterEventRule();

	/**
	 * Returns a new object of class '<em>ICE To Step After Ex Conv Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After Ex Conv Gw Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterExConvGwRule createICEToStepAfterExConvGwRule();

	/**
	 * Returns a new object of class '<em>ICE To Step After PConv Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Step After PConv Gw Rule</em>'.
	 * @generated
	 */
	ICEToStepAfterPConvGwRule createICEToStepAfterPConvGwRule();

	/**
	 * Returns a new object of class '<em>Service Task To Step After SE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task To Step After SE Rule</em>'.
	 * @generated
	 */
	ServiceTaskToStepAfterSERule createServiceTaskToStepAfterSERule();

	/**
	 * Returns a new object of class '<em>Service Task To Step After Ex Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task To Step After Ex Gw Rule</em>'.
	 * @generated
	 */
	ServiceTaskToStepAfterExGwRule createServiceTaskToStepAfterExGwRule();

	/**
	 * Returns a new object of class '<em>Service Task To Step After PG Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task To Step After PG Rule</em>'.
	 * @generated
	 */
	ServiceTaskToStepAfterPGRule createServiceTaskToStepAfterPGRule();

	/**
	 * Returns a new object of class '<em>Service Task To Step After Ev Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task To Step After Ev Gw Rule</em>'.
	 * @generated
	 */
	ServiceTaskToStepAfterEvGwRule createServiceTaskToStepAfterEvGwRule();

	/**
	 * Returns a new object of class '<em>User Task To Step After SE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task To Step After SE Rule</em>'.
	 * @generated
	 */
	UserTaskToStepAfterSERule createUserTaskToStepAfterSERule();

	/**
	 * Returns a new object of class '<em>User Task To Step After Ex Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task To Step After Ex Gw Rule</em>'.
	 * @generated
	 */
	UserTaskToStepAfterExGwRule createUserTaskToStepAfterExGwRule();

	/**
	 * Returns a new object of class '<em>User Task To Step After PG Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task To Step After PG Rule</em>'.
	 * @generated
	 */
	UserTaskToStepAfterPGRule createUserTaskToStepAfterPGRule();

	/**
	 * Returns a new object of class '<em>User Task To Step After Ev Gw Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task To Step After Ev Gw Rule</em>'.
	 * @generated
	 */
	UserTaskToStepAfterEvGwRule createUserTaskToStepAfterEvGwRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
