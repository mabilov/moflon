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
	 * Returns a new object of class '<em>Document Root To Use Cases Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root To Use Cases Model</em>'.
	 * @generated
	 */
	DocumentRootToUseCasesModel createDocumentRootToUseCasesModel();

	/**
	 * Returns a new object of class '<em>Definitions To Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions To Package Declaration</em>'.
	 * @generated
	 */
	DefinitionsToPackageDeclaration createDefinitionsToPackageDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BpmnToUseCaseIntegrationPackage getBpmnToUseCaseIntegrationPackage();

} //BpmnToUseCaseIntegrationFactory
