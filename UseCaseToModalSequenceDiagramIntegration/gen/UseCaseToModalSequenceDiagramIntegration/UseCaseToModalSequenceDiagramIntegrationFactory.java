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
	 * Returns a new object of class '<em>Use Case To Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case To Collaboration</em>'.
	 * @generated
	 */
	UseCaseToCollaboration createUseCaseToCollaboration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UseCaseToModalSequenceDiagramIntegrationPackage getUseCaseToModalSequenceDiagramIntegrationPackage();

} //UseCaseToModalSequenceDiagramIntegrationFactory
