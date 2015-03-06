/**
 */
package UseCaseToModalSequenceDiagramIntegration.impl;

import UseCaseToModalSequenceDiagramIntegration.*;

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
public class UseCaseToModalSequenceDiagramIntegrationFactoryImpl extends
		EFactoryImpl implements UseCaseToModalSequenceDiagramIntegrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UseCaseToModalSequenceDiagramIntegrationFactory init() {
		try {
			UseCaseToModalSequenceDiagramIntegrationFactory theUseCaseToModalSequenceDiagramIntegrationFactory = (UseCaseToModalSequenceDiagramIntegrationFactory) EPackage.Registry.INSTANCE
					.getEFactory(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI);
			if (theUseCaseToModalSequenceDiagramIntegrationFactory != null) {
				return theUseCaseToModalSequenceDiagramIntegrationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UseCaseToModalSequenceDiagramIntegrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationFactoryImpl() {
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
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASES_MODEL_TO_MODEL:
			return createUseCasesModelToModel();
		case UseCaseToModalSequenceDiagramIntegrationPackage.PACKAGE_DECLARATION_TO_PACKAGE:
			return createPackageDeclarationToPackage();
		case UseCaseToModalSequenceDiagramIntegrationPackage.USE_CASE_TO_COLLABORATION:
			return createUseCaseToCollaboration();
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
	public UseCasesModelToModel createUseCasesModelToModel() {
		UseCasesModelToModelImpl useCasesModelToModel = new UseCasesModelToModelImpl();
		return useCasesModelToModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclarationToPackage createPackageDeclarationToPackage() {
		PackageDeclarationToPackageImpl packageDeclarationToPackage = new PackageDeclarationToPackageImpl();
		return packageDeclarationToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToCollaboration createUseCaseToCollaboration() {
		UseCaseToCollaborationImpl useCaseToCollaboration = new UseCaseToCollaborationImpl();
		return useCaseToCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationPackage getUseCaseToModalSequenceDiagramIntegrationPackage() {
		return (UseCaseToModalSequenceDiagramIntegrationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UseCaseToModalSequenceDiagramIntegrationPackage getPackage() {
		return UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE;
	}

} //UseCaseToModalSequenceDiagramIntegrationFactoryImpl
