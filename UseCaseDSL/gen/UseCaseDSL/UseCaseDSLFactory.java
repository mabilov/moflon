/**
 */
package UseCaseDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UseCaseDSL.UseCaseDSLPackage
 * @generated
 */
public interface UseCaseDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UseCaseDSLFactory eINSTANCE = UseCaseDSL.impl.UseCaseDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Alternative Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Flow</em>'.
	 * @generated
	 */
	AlternativeFlow createAlternativeFlow();

	/**
	 * Returns a new object of class '<em>Alternative Flow Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Flow Alternative</em>'.
	 * @generated
	 */
	AlternativeFlowAlternative createAlternativeFlowAlternative();

	/**
	 * Returns a new object of class '<em>Basic Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Flow</em>'.
	 * @generated
	 */
	BasicFlow createBasicFlow();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Exception Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Flow</em>'.
	 * @generated
	 */
	ExceptionFlow createExceptionFlow();

	/**
	 * Returns a new object of class '<em>Local Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Alternative</em>'.
	 * @generated
	 */
	LocalAlternative createLocalAlternative();

	/**
	 * Returns a new object of class '<em>Normal Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step</em>'.
	 * @generated
	 */
	NormalStep createNormalStep();

	/**
	 * Returns a new object of class '<em>Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Declaration</em>'.
	 * @generated
	 */
	PackageDeclaration createPackageDeclaration();

	/**
	 * Returns a new object of class '<em>Parallel Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Flow</em>'.
	 * @generated
	 */
	ParallelFlow createParallelFlow();

	/**
	 * Returns a new object of class '<em>Parallel Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Step</em>'.
	 * @generated
	 */
	ParallelStep createParallelStep();

	/**
	 * Returns a new object of class '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Use Cases Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Cases Model</em>'.
	 * @generated
	 */
	UseCasesModel createUseCasesModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UseCaseDSLPackage getUseCaseDSLPackage();

} //UseCaseDSLFactory
