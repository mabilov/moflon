/**
 */
package UseCaseToModalSequenceDiagramIntegration;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Constraint;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.LiteralString;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.Model;

import TGGLanguage.csp.*;

import TGGRuntime.AbstractCorrespondence;
import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import csp.constraints.*;

import de.upb.tools.sdm.*;

import java.util.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.csp.CSPFactoryHelper;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Cases Model To Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getSource <em>Source</em>}</li>
 *   <li>{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getUseCasesModelToModel()
 * @model
 * @generated
 */
public interface UseCasesModelToModel extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UseCasesModel)
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getUseCasesModelToModel_Source()
	 * @model required="true"
	 * @generated
	 */
	UseCasesModel getSource();

	/**
	 * Sets the value of the '{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UseCasesModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Model)
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#getUseCasesModelToModel_Target()
	 * @model required="true"
	 * @generated
	 */
	Model getTarget();

	/**
	 * Sets the value of the '{@link UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Model value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UseCasesModelToModel
