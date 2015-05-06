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
	 * Returns a new object of class '<em>Actor To Lifeline Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor To Lifeline Rule</em>'.
	 * @generated
	 */
	ActorToLifelineRule createActorToLifelineRule();

	/**
	 * Returns a new object of class '<em>Parallel Step To Combined Fragment Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Step To Combined Fragment Rule</em>'.
	 * @generated
	 */
	ParallelStepToCombinedFragmentRule createParallelStepToCombinedFragmentRule();

	/**
	 * Returns a new object of class '<em>Parallel Flow To Operand Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Flow To Operand Rule</em>'.
	 * @generated
	 */
	ParallelFlowToOperandRule createParallelFlowToOperandRule();

	/**
	 * Returns a new object of class '<em>Use Case Precond To Found Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case Precond To Found Message Rule</em>'.
	 * @generated
	 */
	UseCasePrecondToFoundMessageRule createUseCasePrecondToFoundMessageRule();

	/**
	 * Returns a new object of class '<em>System Step BF To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Step BF To Message Rule</em>'.
	 * @generated
	 */
	SystemStepBFToMessageRule createSystemStepBFToMessageRule();

	/**
	 * Returns a new object of class '<em>Step Alt To Operand Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Alt To Operand Rule</em>'.
	 * @generated
	 */
	StepAltToOperandRule createStepAltToOperandRule();

	/**
	 * Returns a new object of class '<em>User Step BF Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Step BF Message Rule</em>'.
	 * @generated
	 */
	UserStepBFMessageRule createUserStepBFMessageRule();

	/**
	 * Returns a new object of class '<em>System Step NF To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Step NF To Message Rule</em>'.
	 * @generated
	 */
	SystemStepNFToMessageRule createSystemStepNFToMessageRule();

	/**
	 * Returns a new object of class '<em>User Step Nf To Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Step Nf To Message Rule</em>'.
	 * @generated
	 */
	UserStepNfToMessageRule createUserStepNfToMessageRule();

	/**
	 * Returns a new object of class '<em>Alt Sys Step BF To Combo Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Sys Step BF To Combo Rule</em>'.
	 * @generated
	 */
	AltSysStepBFToComboRule createAltSysStepBFToComboRule();

	/**
	 * Returns a new object of class '<em>Alt User Step BF To Combo Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt User Step BF To Combo Rule</em>'.
	 * @generated
	 */
	AltUserStepBFToComboRule createAltUserStepBFToComboRule();

	/**
	 * Returns a new object of class '<em>Alt Sys Step NF To Combo Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Sys Step NF To Combo Rule</em>'.
	 * @generated
	 */
	AltSysStepNFToComboRule createAltSysStepNFToComboRule();

	/**
	 * Returns a new object of class '<em>Alt User Step NF To Combo Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt User Step NF To Combo Rule</em>'.
	 * @generated
	 */
	AltUserStepNFToComboRule createAltUserStepNFToComboRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
