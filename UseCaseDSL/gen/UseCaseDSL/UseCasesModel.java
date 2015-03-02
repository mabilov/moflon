/**
 */
package UseCaseDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Cases Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.UseCasesModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getUseCasesModel()
 * @model
 * @generated
 */
public interface UseCasesModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link UseCaseDSL.PackageDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getUseCasesModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageDeclaration> getPackages();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UseCasesModel
