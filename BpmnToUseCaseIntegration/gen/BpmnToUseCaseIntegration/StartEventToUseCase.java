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

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;
import bpmn2.EndEvent;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;
import bpmn2.UserTask;

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
 * A representation of the model object '<em><b>Start Event To Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BpmnToUseCaseIntegration.StartEventToUseCase#getSource <em>Source</em>}</li>
 *   <li>{@link BpmnToUseCaseIntegration.StartEventToUseCase#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getStartEventToUseCase()
 * @model
 * @generated
 */
public interface StartEventToUseCase extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StartEvent)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getStartEventToUseCase_Source()
	 * @model required="true"
	 * @generated
	 */
	StartEvent getSource();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.StartEventToUseCase#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StartEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UseCase)
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#getStartEventToUseCase_Target()
	 * @model required="true"
	 * @generated
	 */
	UseCase getTarget();

	/**
	 * Sets the value of the '{@link BpmnToUseCaseIntegration.StartEventToUseCase#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCase value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StartEventToUseCase
