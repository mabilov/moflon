/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>UC Model To MSD Model Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC Model To MSD Model Rule</em>'.
	 * @generated
	 */
	UCModelToMSDModelRule createUCModelToMSDModelRule();

	/**
	 * Returns a new object of class '<em>UC Package To MSD Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC Package To MSD Package</em>'.
	 * @generated
	 */
	UCPackageToMSDPackage createUCPackageToMSDPackage();

	/**
	 * Returns a new object of class '<em>Use Case To Interaction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case To Interaction Rule</em>'.
	 * @generated
	 */
	UseCaseToInteractionRule createUseCaseToInteractionRule();

	/**
	 * Returns a new object of class '<em>Actor To Class Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor To Class Rule</em>'.
	 * @generated
	 */
	ActorToClassRule createActorToClassRule();

	/**
	 * Returns a new object of class '<em>Normal Step To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step To Message Rule</em>'.
	 * @generated
	 */
	NormalStepToMessageRule createNormalStepToMessageRule();

	/**
	 * Returns a new object of class '<em>Normal Step Basic Flow To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step Basic Flow To Message Rule</em>'.
	 * @generated
	 */
	NormalStepBasicFlowToMessageRule createNormalStepBasicFlowToMessageRule();

	/**
	 * Returns a new object of class '<em>Normal Step Named Flow To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step Named Flow To Message Rule</em>'.
	 * @generated
	 */
	NormalStepNamedFlowToMessageRule createNormalStepNamedFlowToMessageRule();

	/**
	 * Returns a new object of class '<em>Step To Combined Fragment Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step To Combined Fragment Rule</em>'.
	 * @generated
	 */
	StepToCombinedFragmentRule createStepToCombinedFragmentRule();

	/**
	 * Returns a new object of class '<em>Step Alt To Operand Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Alt To Operand Rule</em>'.
	 * @generated
	 */
	StepAltToOperandRule createStepAltToOperandRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
