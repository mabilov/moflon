/**
 */
package BpmnToUseCaseIntegration;

import TGGLanguage.csp.*;
import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;
import TGGRuntime.AbstractCorrespondence;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;

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
 * A representation of the model object '<em><b>Document Root To Use Cases Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDocumentRootToUseCasesModel()
 * @model
 * @generated
 */
public interface DocumentRootToUseCasesModel extends EObject,
		AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DocumentRoot)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDocumentRootToUseCasesModel_Source()
	 * @model required="true"
	 * @generated
	 */
	DocumentRoot getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DocumentRoot value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UseCasesModel)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getDocumentRootToUseCasesModel_Target()
	 * @model required="true"
	 * @generated
	 */
	UseCasesModel getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCasesModel value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // DocumentRootToUseCasesModel
