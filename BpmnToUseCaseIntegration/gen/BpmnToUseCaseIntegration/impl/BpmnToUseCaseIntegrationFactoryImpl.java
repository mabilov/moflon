/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnToUseCaseIntegrationFactoryImpl extends EFactoryImpl implements
		BpmnToUseCaseIntegrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnToUseCaseIntegrationFactory init() {
		try {
			BpmnToUseCaseIntegrationFactory theBpmnToUseCaseIntegrationFactory = (BpmnToUseCaseIntegrationFactory) EPackage.Registry.INSTANCE
					.getEFactory(BpmnToUseCaseIntegrationPackage.eNS_URI);
			if (theBpmnToUseCaseIntegrationFactory != null) {
				return theBpmnToUseCaseIntegrationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnToUseCaseIntegrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BpmnToUseCaseIntegrationPackage.DOCUMENT_ROOT_TO_USE_CASES_MODEL:
			return createDocumentRootToUseCasesModel();
		case BpmnToUseCaseIntegrationPackage.DEFINITIONS_TO_PACKAGE_DECLARATION:
			return createDefinitionsToPackageDeclaration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootToUseCasesModel createDocumentRootToUseCasesModel() {
		DocumentRootToUseCasesModelImpl documentRootToUseCasesModel = new DocumentRootToUseCasesModelImpl();
		return documentRootToUseCasesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsToPackageDeclaration createDefinitionsToPackageDeclaration() {
		DefinitionsToPackageDeclarationImpl definitionsToPackageDeclaration = new DefinitionsToPackageDeclarationImpl();
		return definitionsToPackageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationPackage getBpmnToUseCaseIntegrationPackage() {
		return (BpmnToUseCaseIntegrationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmnToUseCaseIntegrationPackage getPackage() {
		return BpmnToUseCaseIntegrationPackage.eINSTANCE;
	}

} //BpmnToUseCaseIntegrationFactoryImpl
