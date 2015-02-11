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
	 * Returns a new object of class '<em>First Service Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Service Task To Step Rule</em>'.
	 * @generated
	 */
	FirstServiceTaskToStepRule createFirstServiceTaskToStepRule();

	/**
	 * Returns a new object of class '<em>First User Task To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First User Task To Step Rule</em>'.
	 * @generated
	 */
	FirstUserTaskToStepRule createFirstUserTaskToStepRule();

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
	 * Returns a new object of class '<em>Intermediate Throw Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Throw Event To Step Rule</em>'.
	 * @generated
	 */
	IntermediateThrowEventToStepRule createIntermediateThrowEventToStepRule();

	/**
	 * Returns a new object of class '<em>Intermediate Catch Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Catch Event To Step Rule</em>'.
	 * @generated
	 */
	IntermediateCatchEventToStepRule createIntermediateCatchEventToStepRule();

	/**
	 * Returns a new object of class '<em>End Event Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event Rule</em>'.
	 * @generated
	 */
	EndEventRule createEndEventRule();

	/**
	 * Returns a new object of class '<em>Exclusive Gateway To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Gateway To Step Core Rule</em>'.
	 * @generated
	 */
	ExclusiveGatewayToStepCoreRule createExclusiveGatewayToStepCoreRule();

	/**
	 * Returns a new object of class '<em>First Intermediate Throw Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Intermediate Throw Event To Step Rule</em>'.
	 * @generated
	 */
	FirstIntermediateThrowEventToStepRule createFirstIntermediateThrowEventToStepRule();

	/**
	 * Returns a new object of class '<em>First Intermediate Catch Event To Step Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Intermediate Catch Event To Step Rule</em>'.
	 * @generated
	 */
	FirstIntermediateCatchEventToStepRule createFirstIntermediateCatchEventToStepRule();

	/**
	 * Returns a new object of class '<em>Parallel Gateway To Parallel Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Gateway To Parallel Step Core Rule</em>'.
	 * @generated
	 */
	ParallelGatewayToParallelStepCoreRule createParallelGatewayToParallelStepCoreRule();

	/**
	 * Returns a new object of class '<em>Event Based Gateway To Step Core Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Based Gateway To Step Core Rule</em>'.
	 * @generated
	 */
	EventBasedGatewayToStepCoreRule createEventBasedGatewayToStepCoreRule();

	/**
	 * Returns a new object of class '<em>Exclusive Converging Gateway Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Converging Gateway Rule</em>'.
	 * @generated
	 */
	ExclusiveConvergingGatewayRule createExclusiveConvergingGatewayRule();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
