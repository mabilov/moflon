/**
 */
package UseCaseDSL;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseDSL.ParallelStep#getInvokedFlows <em>Invoked Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseDSL.UseCaseDSLPackage#getParallelStep()
 * @model
 * @generated
 */
public interface ParallelStep extends Step {
	/**
	 * Returns the value of the '<em><b>Invoked Flows</b></em>' reference list.
	 * The list contents are of type {@link UseCaseDSL.ParallelFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Flows</em>' reference list.
	 * @see UseCaseDSL.UseCaseDSLPackage#getParallelStep_InvokedFlows()
	 * @model
	 * @generated
	 */
	EList<ParallelFlow> getInvokedFlows();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParallelStep
