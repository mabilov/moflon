/**
 */
package UseCaseToModalSequenceDiagramIntegration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage
 * @generated
 */
public interface UseCaseToModalSequenceDiagramIntegrationFactory extends
		EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UseCaseToModalSequenceDiagramIntegrationFactory eINSTANCE = UseCaseToModalSequenceDiagramIntegration.impl.UseCaseToModalSequenceDiagramIntegrationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Use Cases Model To Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Cases Model To Model</em>'.
	 * @generated
	 */
	UseCasesModelToModel createUseCasesModelToModel();

	/**
	 * Returns a new object of class '<em>Package Declaration To Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Declaration To Package</em>'.
	 * @generated
	 */
	PackageDeclarationToPackage createPackageDeclarationToPackage();

	/**
	 * Returns a new object of class '<em>Use Case To Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case To Interaction</em>'.
	 * @generated
	 */
	UseCaseToInteraction createUseCaseToInteraction();

	/**
	 * Returns a new object of class '<em>Normal Step To Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step To Message</em>'.
	 * @generated
	 */
	NormalStepToMessage createNormalStepToMessage();

	/**
	 * Returns a new object of class '<em>Actor To Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor To Lifeline</em>'.
	 * @generated
	 */
	ActorToLifeline createActorToLifeline();

	/**
	 * Returns a new object of class '<em>Flow To Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow To Interaction Fragment</em>'.
	 * @generated
	 */
	FlowToInteractionFragment createFlowToInteractionFragment();

	/**
	 * Returns a new object of class '<em>Step Alternative To Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Alternative To Interaction Operand</em>'.
	 * @generated
	 */
	StepAlternativeToInteractionOperand createStepAlternativeToInteractionOperand();

	/**
	 * Returns a new object of class '<em>Parallel Step To Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Step To Combined Fragment</em>'.
	 * @generated
	 */
	ParallelStepToCombinedFragment createParallelStepToCombinedFragment();

	/**
	 * Returns a new object of class '<em>Normal Step To Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step To Combined Fragment</em>'.
	 * @generated
	 */
	NormalStepToCombinedFragment createNormalStepToCombinedFragment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UseCaseToModalSequenceDiagramIntegrationPackage getUseCaseToModalSequenceDiagramIntegrationPackage();

} //UseCaseToModalSequenceDiagramIntegrationFactory
