/**
 */
package BpmnToUseCaseIntegration;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory
 * @model kind="package"
 * @generated
 */
public interface BpmnToUseCaseIntegrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BpmnToUseCaseIntegration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/BpmnToUseCaseIntegration/model/BpmnToUseCaseIntegration.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BpmnToUseCaseIntegration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnToUseCaseIntegrationPackage eINSTANCE = BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl <em>Document Root To Use Cases Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDocumentRootToUseCasesModel()
	 * @generated
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Root To Use Cases Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Document Root To Use Cases Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TO_USE_CASES_MODEL_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl <em>Definitions To Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl
	 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDefinitionsToPackageDeclaration()
	 * @generated
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definitions To Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definitions To Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TO_PACKAGE_DECLARATION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel <em>Document Root To Use Cases Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root To Use Cases Model</em>'.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel
	 * @generated
	 */
	EClass getDocumentRootToUseCasesModel();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getSource()
	 * @see #getDocumentRootToUseCasesModel()
	 * @generated
	 */
	EReference getDocumentRootToUseCasesModel_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getTarget()
	 * @see #getDocumentRootToUseCasesModel()
	 * @generated
	 */
	EReference getDocumentRootToUseCasesModel_Target();

	/**
	 * Returns the meta object for class '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration <em>Definitions To Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions To Package Declaration</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration
	 * @generated
	 */
	EClass getDefinitionsToPackageDeclaration();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getSource()
	 * @see #getDefinitionsToPackageDeclaration()
	 * @generated
	 */
	EReference getDefinitionsToPackageDeclaration_Source();

	/**
	 * Returns the meta object for the reference '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration#getTarget()
	 * @see #getDefinitionsToPackageDeclaration()
	 * @generated
	 */
	EReference getDefinitionsToPackageDeclaration_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpmnToUseCaseIntegrationFactory getBpmnToUseCaseIntegrationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl <em>Document Root To Use Cases Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.DocumentRootToUseCasesModelImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDocumentRootToUseCasesModel()
		 * @generated
		 */
		EClass DOCUMENT_ROOT_TO_USE_CASES_MODEL = eINSTANCE
				.getDocumentRootToUseCasesModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT_TO_USE_CASES_MODEL__SOURCE = eINSTANCE
				.getDocumentRootToUseCasesModel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT_TO_USE_CASES_MODEL__TARGET = eINSTANCE
				.getDocumentRootToUseCasesModel_Target();

		/**
		 * The meta object literal for the '{@link BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl <em>Definitions To Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BpmnToUseCaseIntegration.impl.DefinitionsToPackageDeclarationImpl
		 * @see BpmnToUseCaseIntegration.impl.BpmnToUseCaseIntegrationPackageImpl#getDefinitionsToPackageDeclaration()
		 * @generated
		 */
		EClass DEFINITIONS_TO_PACKAGE_DECLARATION = eINSTANCE
				.getDefinitionsToPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_TO_PACKAGE_DECLARATION__SOURCE = eINSTANCE
				.getDefinitionsToPackageDeclaration_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_TO_PACKAGE_DECLARATION__TARGET = eINSTANCE
				.getDefinitionsToPackageDeclaration_Target();

	}

} //BpmnToUseCaseIntegrationPackage
