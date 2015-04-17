/**
 */
package BpmnToUseCaseIntegration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage
 * @generated
 */
public interface BpmnToUseCaseIntegrationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnToUseCaseIntegrationFactory eINSTANCE = BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Doc Root To UC Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Root To UC Model</em>'.
	 * @generated
	 */
	DocRootToUCModel createDocRootToUCModel();

	/**
	 * Returns a new object of class '<em>Definitions To Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions To Package</em>'.
	 * @generated
	 */
	DefinitionsToPackage createDefinitionsToPackage();

	/**
	 * Returns a new object of class '<em>Process To Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process To Use Case</em>'.
	 * @generated
	 */
	ProcessToUseCase createProcessToUseCase();

	/**
	 * Returns a new object of class '<em>Start Event To Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event To Use Case</em>'.
	 * @generated
	 */
	StartEventToUseCase createStartEventToUseCase();

	/**
	 * Returns a new object of class '<em>Start Event To Basic Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event To Basic Flow</em>'.
	 * @generated
	 */
	StartEventToBasicFlow createStartEventToBasicFlow();

	/**
	 * Returns a new object of class '<em>Sequence Flow To UC Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow To UC Flow</em>'.
	 * @generated
	 */
	SequenceFlowToUCFlow createSequenceFlowToUCFlow();

	/**
	 * Returns a new object of class '<em>Process To Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process To Actor</em>'.
	 * @generated
	 */
	ProcessToActor createProcessToActor();

	/**
	 * Returns a new object of class '<em>Flow Node To Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Node To Step</em>'.
	 * @generated
	 */
	FlowNodeToStep createFlowNodeToStep();

	/**
	 * Returns a new object of class '<em>Sequence Flow To Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow To Step</em>'.
	 * @generated
	 */
	SequenceFlowToStep createSequenceFlowToStep();

	/**
	 * Returns a new object of class '<em>Lane To Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane To Actor</em>'.
	 * @generated
	 */
	LaneToActor createLaneToActor();

	/**
	 * Returns a new object of class '<em>Seq Flow To Alt Flow Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Flow To Alt Flow Alt</em>'.
	 * @generated
	 */
	SeqFlowToAltFlowAlt createSeqFlowToAltFlowAlt();

	/**
	 * Returns a new object of class '<em>ICE To Alt Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICE To Alt Flow</em>'.
	 * @generated
	 */
	ICEToAltFlow createICEToAltFlow();

	/**
	 * Returns a new object of class '<em>End Event To Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event To Flow</em>'.
	 * @generated
	 */
	EndEventToFlow createEndEventToFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BpmnToUseCaseIntegrationPackage getBpmnToUseCaseIntegrationPackage();

} //BpmnToUseCaseIntegrationFactory
