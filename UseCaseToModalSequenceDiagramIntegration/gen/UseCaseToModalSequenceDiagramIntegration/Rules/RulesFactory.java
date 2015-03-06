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
	 * Returns a new object of class '<em>Use Case To Collaboration Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case To Collaboration Rule</em>'.
	 * @generated
	 */
	UseCaseToCollaborationRule createUseCaseToCollaborationRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
