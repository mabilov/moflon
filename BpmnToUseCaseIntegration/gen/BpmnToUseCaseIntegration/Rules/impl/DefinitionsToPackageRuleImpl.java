/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.DocRootToUCModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.DefinitionsToPackageRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

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

import TGGRuntime.impl.AbstractRuleImpl;

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
import bpmn2.Event;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;

import bpmn2.Task;
import bpmn2.UserTask;
import de.upb.tools.sdm.*;

import java.lang.reflect.InvocationTargetException;

import java.util.*;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.csp.CSPFactoryHelper;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions To Package Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DefinitionsToPackageRuleImpl extends AbstractRuleImpl implements
		DefinitionsToPackageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsToPackageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getDefinitionsToPackageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Definitions definitions,
			DocumentRoot documentRoot) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __documentRoot_definitions_definitions = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, definitions,
					documentRoot));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// create object __documentRoot_definitions_definitions
				__documentRoot_definitions_definitions = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __documentRoot_definitions_definitions
				__documentRoot_definitions_definitions.setName("definitions");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__documentRoot_definitions_definitions,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						definitions, "toBeTranslatedNodes");

				// create link
				__documentRoot_definitions_definitions.setTrg(definitions);

				// create link
				__documentRoot_definitions_definitions.setSrc(documentRoot);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						documentRoot, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, definitions, documentRoot);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Definitions definitions = null;
		DocumentRoot documentRoot = null;
		DocRootToUCModel documentRootToUseCasesModel = null;
		UseCasesModel useCasesModel = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		DefinitionsToPackage definitionsToPackage = null;
		PackageDeclaration packageDeclaration = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge definitionsToPackage__target__packageDeclaration = null;
		EMoflonEdge definitionsToPackage__source__definitions = null;
		EMoflonEdge useCasesModel__packages__packageDeclaration = null;
		EMoflonEdge __documentRoot_definitions_definitions = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("definitions"));

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("documentRoot"));

			// ensure correct type and really bound of object documentRoot
			JavaSDM.ensure(_TmpObject instanceof DocumentRoot);
			documentRoot = (DocumentRoot) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("documentRootToUseCasesModel"));

			// ensure correct type and really bound of object documentRootToUseCasesModel
			JavaSDM.ensure(_TmpObject instanceof DocRootToUCModel);
			documentRootToUseCasesModel = (DocRootToUCModel) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object definitionsToPackage
			definitionsToPackage = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createDefinitionsToPackage();

			// create object packageDeclaration
			packageDeclaration = UseCaseDSLFactory.eINSTANCE
					.createPackageDeclaration();

			// assign attribute packageDeclaration
			packageDeclaration.setName((java.lang.String) csp
					.getAttributeVariable("packageDeclaration", "name")
					.getValue());

			// create link
			definitionsToPackage.setSource(definitions);

			// create link
			useCasesModel.getPackages().add(packageDeclaration);

			// create link
			definitionsToPackage.setTarget(packageDeclaration);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackage is really bound
			JavaSDM.ensure(definitionsToPackage != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitions, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitionsToPackage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackage is really bound
			JavaSDM.ensure(definitionsToPackage != null);
			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object documentRootToUseCasesModel is really bound
			JavaSDM.ensure(documentRootToUseCasesModel != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check isomorphic binding between objects definitionsToPackage and definitions 
			JavaSDM.ensure(!definitionsToPackage.equals(definitions));

			// check isomorphic binding between objects documentRoot and definitions 
			JavaSDM.ensure(!documentRoot.equals(definitions));

			// check isomorphic binding between objects documentRootToUseCasesModel and definitions 
			JavaSDM.ensure(!documentRootToUseCasesModel.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitions 
			JavaSDM.ensure(!packageDeclaration.equals(definitions));

			// check isomorphic binding between objects useCasesModel and definitions 
			JavaSDM.ensure(!useCasesModel.equals(definitions));

			// check isomorphic binding between objects documentRoot and definitionsToPackage 
			JavaSDM.ensure(!documentRoot.equals(definitionsToPackage));

			// check isomorphic binding between objects documentRootToUseCasesModel and definitionsToPackage 
			JavaSDM.ensure(!documentRootToUseCasesModel
					.equals(definitionsToPackage));

			// check isomorphic binding between objects packageDeclaration and definitionsToPackage 
			JavaSDM.ensure(!packageDeclaration.equals(definitionsToPackage));

			// check isomorphic binding between objects useCasesModel and definitionsToPackage 
			JavaSDM.ensure(!useCasesModel.equals(definitionsToPackage));

			// check isomorphic binding between objects documentRootToUseCasesModel and documentRoot 
			JavaSDM.ensure(!documentRootToUseCasesModel.equals(documentRoot));

			// check isomorphic binding between objects packageDeclaration and documentRoot 
			JavaSDM.ensure(!packageDeclaration.equals(documentRoot));

			// check isomorphic binding between objects useCasesModel and documentRoot 
			JavaSDM.ensure(!useCasesModel.equals(documentRoot));

			// check isomorphic binding between objects packageDeclaration and documentRootToUseCasesModel 
			JavaSDM.ensure(!packageDeclaration
					.equals(documentRootToUseCasesModel));

			// check isomorphic binding between objects useCasesModel and documentRootToUseCasesModel 
			JavaSDM.ensure(!useCasesModel.equals(documentRootToUseCasesModel));

			// check isomorphic binding between objects useCasesModel and packageDeclaration 
			JavaSDM.ensure(!useCasesModel.equals(packageDeclaration));

			// create object definitionsToPackage__target__packageDeclaration
			definitionsToPackage__target__packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object definitionsToPackage__source__definitions
			definitionsToPackage__source__definitions = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCasesModel__packages__packageDeclaration
			useCasesModel__packages__packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __documentRoot_definitions_definitions
			__documentRoot_definitions_definitions = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("DefinitionsToPackageRule");
			// assign attribute definitionsToPackage__source__definitions
			definitionsToPackage__source__definitions.setName("source");
			// assign attribute definitionsToPackage__target__packageDeclaration
			definitionsToPackage__target__packageDeclaration.setName("target");
			// assign attribute __documentRoot_definitions_definitions
			__documentRoot_definitions_definitions.setName("definitions");
			// assign attribute useCasesModel__packages__packageDeclaration
			useCasesModel__packages__packageDeclaration.setName("packages");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitionsToPackage__target__packageDeclaration,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitionsToPackage__source__definitions, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							useCasesModel__packages__packageDeclaration,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__documentRoot_definitions_definitions, "translatedEdges");

			// create link
			definitionsToPackage__source__definitions.setTrg(definitions);

			// create link
			__documentRoot_definitions_definitions.setTrg(definitions);

			// create link
			definitionsToPackage__target__packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			useCasesModel__packages__packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			definitionsToPackage__source__definitions
					.setSrc(definitionsToPackage);

			// create link
			definitionsToPackage__target__packageDeclaration
					.setSrc(definitionsToPackage);

			// create link
			__documentRoot_definitions_definitions.setSrc(documentRoot);

			// create link
			useCasesModel__packages__packageDeclaration.setSrc(useCasesModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel,
				documentRootToUseCasesModel);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		Definitions definitions = null;
		DocumentRoot documentRoot = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __documentRoot_definitions_definitions = null;
		EMoflonEdge __documentRootToUseCasesModel_source_documentRoot = null;
		EMoflonEdge __documentRootToUseCasesModel_target_useCasesModel = null;
		CSP csp = null;
		UseCasesModel useCasesModel = null;
		Iterator fujaba__IterDocumentRootToDocumentRootToUseCasesModel = null;
		DocRootToUCModel documentRootToUseCasesModel = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("DefinitionsToPackageRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("definitions"));

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;
			_TmpObject = (match.getObject("documentRoot"));

			// ensure correct type and really bound of object documentRoot
			JavaSDM.ensure(_TmpObject instanceof DocumentRoot);
			documentRoot = (DocumentRoot) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from documentRoot to documentRootToUseCasesModel
			fujaba__Success = false;

			fujaba__IterDocumentRootToDocumentRootToUseCasesModel = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							documentRoot, DocRootToUCModel.class, "source"))
					.iterator();

			while (fujaba__IterDocumentRootToDocumentRootToUseCasesModel
					.hasNext()) {
				try {
					documentRootToUseCasesModel = (DocRootToUCModel) fujaba__IterDocumentRootToDocumentRootToUseCasesModel
							.next();

					// check object documentRootToUseCasesModel is really bound
					JavaSDM.ensure(documentRootToUseCasesModel != null);
					// bind object
					useCasesModel = documentRootToUseCasesModel.getTarget();

					// check object useCasesModel is really bound
					JavaSDM.ensure(useCasesModel != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object definitions is really bound
						JavaSDM.ensure(definitions != null);
						// check object documentRoot is really bound
						JavaSDM.ensure(documentRoot != null);
						// check object documentRootToUseCasesModel is really bound
						JavaSDM.ensure(documentRootToUseCasesModel != null);
						// check object useCasesModel is really bound
						JavaSDM.ensure(useCasesModel != null);
						// check link definitions from definitions to documentRoot
						JavaSDM.ensure(documentRoot.equals(definitions
								.eContainer()));

						// check link source from documentRootToUseCasesModel to documentRoot
						JavaSDM.ensure(documentRoot
								.equals(documentRootToUseCasesModel.getSource()));

						// check link target from documentRootToUseCasesModel to useCasesModel
						JavaSDM.ensure(useCasesModel
								.equals(documentRootToUseCasesModel.getTarget()));

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __documentRoot_definitions_definitions
						__documentRoot_definitions_definitions = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __documentRootToUseCasesModel_source_documentRoot
						__documentRootToUseCasesModel_source_documentRoot = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __documentRootToUseCasesModel_target_useCasesModel
						__documentRootToUseCasesModel_target_useCasesModel = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __documentRoot_definitions_definitions
						__documentRoot_definitions_definitions
								.setName("definitions");
						// assign attribute __documentRootToUseCasesModel_source_documentRoot
						__documentRootToUseCasesModel_source_documentRoot
								.setName("source");
						// assign attribute __documentRootToUseCasesModel_target_useCasesModel
						__documentRootToUseCasesModel_target_useCasesModel
								.setName("target");

						// create link
						isApplicableMatch.getAllContextElements().add(
								definitions);

						// create link
						__documentRoot_definitions_definitions
								.setTrg(definitions);

						// create link
						__documentRootToUseCasesModel_source_documentRoot
								.setTrg(documentRoot);

						// create link
						isApplicableMatch.getAllContextElements().add(
								documentRoot);

						// create link
						__documentRoot_definitions_definitions
								.setSrc(documentRoot);

						// create link
						isApplicableMatch.getAllContextElements().add(
								useCasesModel);

						// create link
						__documentRootToUseCasesModel_target_useCasesModel
								.setTrg(useCasesModel);

						// create link
						__documentRootToUseCasesModel_source_documentRoot
								.setSrc(documentRootToUseCasesModel);

						// create link
						__documentRootToUseCasesModel_target_useCasesModel
								.setSrc(documentRootToUseCasesModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								documentRootToUseCasesModel);

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__documentRootToUseCasesModel_source_documentRoot,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__documentRoot_definitions_definitions,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__documentRootToUseCasesModel_target_useCasesModel,
										"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, definitions,
									documentRoot, useCasesModel,
									documentRootToUseCasesModel));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_FWD(csp);
						if (fujaba__Success) {
							// story node 'add match to rule result'
							try {
								fujaba__Success = false;

								// check object isApplicableMatch is really bound
								JavaSDM.ensure(isApplicableMatch != null);
								// check object ruleresult is really bound
								JavaSDM.ensure(ruleresult != null);
								// assign attribute ruleresult
								ruleresult.setSuccess(true);
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("DefinitionsToPackageRule");

								// create link
								isApplicableMatch
										.setIsApplicableRuleResult(ruleresult);

								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			Definitions definitions, DocumentRoot documentRoot) {
		match.registerObject("definitions", definitions);
		match.registerObject("documentRoot", documentRoot);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Definitions definitions,
			DocumentRoot documentRoot) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			Definitions definitions, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("http://");
		literal0.setType("String");

		// Create attribute variables
		Variable var_definitions_targetNamespace = CSPFactoryHelper.eINSTANCE
				.createVariable("definitions.targetNamespace", true, csp);
		var_definitions_targetNamespace.setValue(definitions
				.getTargetNamespace());
		var_definitions_targetNamespace.setType("String");

		// Create explicit parameters

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_packageDeclaration_name,
				var_definitions_targetNamespace);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject documentRoot,
			EObject useCasesModel, EObject documentRootToUseCasesModel) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("documentRoot", documentRoot);
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("definitions").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getDefinitions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCasesModel_packages_packageDeclaration = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match,
					packageDeclaration, useCasesModel));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				// create object __useCasesModel_packages_packageDeclaration
				__useCasesModel_packages_packageDeclaration = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCasesModel_packages_packageDeclaration
				__useCasesModel_packages_packageDeclaration.setName("packages");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCasesModel_packages_packageDeclaration,
						"toBeTranslatedEdges");

				// create link
				__useCasesModel_packages_packageDeclaration
						.setTrg(packageDeclaration);

				// create link
				__useCasesModel_packages_packageDeclaration
						.setSrc(useCasesModel);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCasesModel, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, packageDeclaration,
					useCasesModel);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		DocumentRoot documentRoot = null;
		DocRootToUCModel documentRootToUseCasesModel = null;
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Definitions definitions = null;
		DefinitionsToPackage definitionsToPackage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge definitionsToPackage__target__packageDeclaration = null;
		EMoflonEdge documentRoot__definitions__definitions = null;
		EMoflonEdge definitionsToPackage__source__definitions = null;
		EMoflonEdge __useCasesModel_packages_packageDeclaration = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("documentRoot"));

			// ensure correct type and really bound of object documentRoot
			JavaSDM.ensure(_TmpObject instanceof DocumentRoot);
			documentRoot = (DocumentRoot) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("documentRootToUseCasesModel"));

			// ensure correct type and really bound of object documentRootToUseCasesModel
			JavaSDM.ensure(_TmpObject instanceof DocRootToUCModel);
			documentRootToUseCasesModel = (DocRootToUCModel) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object definitions
			definitions = Bpmn2Factory.eINSTANCE.createDefinitions();

			// create object definitionsToPackage
			definitionsToPackage = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createDefinitionsToPackage();

			// assign attribute definitions
			definitions.setTargetNamespace((java.lang.String) csp
					.getAttributeVariable("definitions", "targetNamespace")
					.getValue());

			// create link
			definitionsToPackage.setTarget(packageDeclaration);

			// create link
			documentRoot.getDefinitions().add(definitions);

			// create link
			definitionsToPackage.setSource(definitions);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackage is really bound
			JavaSDM.ensure(definitionsToPackage != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitions, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitionsToPackage, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackage is really bound
			JavaSDM.ensure(definitionsToPackage != null);
			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object documentRootToUseCasesModel is really bound
			JavaSDM.ensure(documentRootToUseCasesModel != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check isomorphic binding between objects definitionsToPackage and definitions 
			JavaSDM.ensure(!definitionsToPackage.equals(definitions));

			// check isomorphic binding between objects documentRoot and definitions 
			JavaSDM.ensure(!documentRoot.equals(definitions));

			// check isomorphic binding between objects documentRootToUseCasesModel and definitions 
			JavaSDM.ensure(!documentRootToUseCasesModel.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitions 
			JavaSDM.ensure(!packageDeclaration.equals(definitions));

			// check isomorphic binding between objects useCasesModel and definitions 
			JavaSDM.ensure(!useCasesModel.equals(definitions));

			// check isomorphic binding between objects documentRoot and definitionsToPackage 
			JavaSDM.ensure(!documentRoot.equals(definitionsToPackage));

			// check isomorphic binding between objects documentRootToUseCasesModel and definitionsToPackage 
			JavaSDM.ensure(!documentRootToUseCasesModel
					.equals(definitionsToPackage));

			// check isomorphic binding between objects packageDeclaration and definitionsToPackage 
			JavaSDM.ensure(!packageDeclaration.equals(definitionsToPackage));

			// check isomorphic binding between objects useCasesModel and definitionsToPackage 
			JavaSDM.ensure(!useCasesModel.equals(definitionsToPackage));

			// check isomorphic binding between objects documentRootToUseCasesModel and documentRoot 
			JavaSDM.ensure(!documentRootToUseCasesModel.equals(documentRoot));

			// check isomorphic binding between objects packageDeclaration and documentRoot 
			JavaSDM.ensure(!packageDeclaration.equals(documentRoot));

			// check isomorphic binding between objects useCasesModel and documentRoot 
			JavaSDM.ensure(!useCasesModel.equals(documentRoot));

			// check isomorphic binding between objects packageDeclaration and documentRootToUseCasesModel 
			JavaSDM.ensure(!packageDeclaration
					.equals(documentRootToUseCasesModel));

			// check isomorphic binding between objects useCasesModel and documentRootToUseCasesModel 
			JavaSDM.ensure(!useCasesModel.equals(documentRootToUseCasesModel));

			// check isomorphic binding between objects useCasesModel and packageDeclaration 
			JavaSDM.ensure(!useCasesModel.equals(packageDeclaration));

			// create object definitionsToPackage__target__packageDeclaration
			definitionsToPackage__target__packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object documentRoot__definitions__definitions
			documentRoot__definitions__definitions = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object definitionsToPackage__source__definitions
			definitionsToPackage__source__definitions = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCasesModel_packages_packageDeclaration
			__useCasesModel_packages_packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("DefinitionsToPackageRule");
			// assign attribute definitionsToPackage__source__definitions
			definitionsToPackage__source__definitions.setName("source");
			// assign attribute definitionsToPackage__target__packageDeclaration
			definitionsToPackage__target__packageDeclaration.setName("target");
			// assign attribute documentRoot__definitions__definitions
			documentRoot__definitions__definitions.setName("definitions");
			// assign attribute __useCasesModel_packages_packageDeclaration
			__useCasesModel_packages_packageDeclaration.setName("packages");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitionsToPackage__target__packageDeclaration,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRoot__definitions__definitions, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitionsToPackage__source__definitions, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCasesModel_packages_packageDeclaration,
					"translatedEdges");

			// create link
			definitionsToPackage__source__definitions.setTrg(definitions);

			// create link
			documentRoot__definitions__definitions.setTrg(definitions);

			// create link
			__useCasesModel_packages_packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			definitionsToPackage__target__packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			definitionsToPackage__source__definitions
					.setSrc(definitionsToPackage);

			// create link
			definitionsToPackage__target__packageDeclaration
					.setSrc(definitionsToPackage);

			// create link
			documentRoot__definitions__definitions.setSrc(documentRoot);

			// create link
			__useCasesModel_packages_packageDeclaration.setSrc(useCasesModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, documentRoot, useCasesModel,
				documentRootToUseCasesModel);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __useCasesModel_packages_packageDeclaration = null;
		EMoflonEdge __documentRootToUseCasesModel_source_documentRoot = null;
		EMoflonEdge __documentRootToUseCasesModel_target_useCasesModel = null;
		CSP csp = null;
		DocumentRoot documentRoot = null;
		Iterator fujaba__IterUseCasesModelToDocumentRootToUseCasesModel = null;
		DocRootToUCModel documentRootToUseCasesModel = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("DefinitionsToPackageRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (match.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link target from useCasesModel to documentRootToUseCasesModel
			fujaba__Success = false;

			fujaba__IterUseCasesModelToDocumentRootToUseCasesModel = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							useCasesModel, DocRootToUCModel.class, "target"))
					.iterator();

			while (fujaba__IterUseCasesModelToDocumentRootToUseCasesModel
					.hasNext()) {
				try {
					documentRootToUseCasesModel = (DocRootToUCModel) fujaba__IterUseCasesModelToDocumentRootToUseCasesModel
							.next();

					// check object documentRootToUseCasesModel is really bound
					JavaSDM.ensure(documentRootToUseCasesModel != null);
					// bind object
					documentRoot = documentRootToUseCasesModel.getSource();

					// check object documentRoot is really bound
					JavaSDM.ensure(documentRoot != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object documentRoot is really bound
						JavaSDM.ensure(documentRoot != null);
						// check object documentRootToUseCasesModel is really bound
						JavaSDM.ensure(documentRootToUseCasesModel != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCasesModel is really bound
						JavaSDM.ensure(useCasesModel != null);
						// check link packages from packageDeclaration to useCasesModel
						JavaSDM.ensure(useCasesModel.equals(packageDeclaration
								.eContainer()));

						// check link source from documentRootToUseCasesModel to documentRoot
						JavaSDM.ensure(documentRoot
								.equals(documentRootToUseCasesModel.getSource()));

						// check link target from documentRootToUseCasesModel to useCasesModel
						JavaSDM.ensure(useCasesModel
								.equals(documentRootToUseCasesModel.getTarget()));

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __useCasesModel_packages_packageDeclaration
						__useCasesModel_packages_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __documentRootToUseCasesModel_source_documentRoot
						__documentRootToUseCasesModel_source_documentRoot = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __documentRootToUseCasesModel_target_useCasesModel
						__documentRootToUseCasesModel_target_useCasesModel = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __useCasesModel_packages_packageDeclaration
						__useCasesModel_packages_packageDeclaration
								.setName("packages");
						// assign attribute __documentRootToUseCasesModel_source_documentRoot
						__documentRootToUseCasesModel_source_documentRoot
								.setName("source");
						// assign attribute __documentRootToUseCasesModel_target_useCasesModel
						__documentRootToUseCasesModel_target_useCasesModel
								.setName("target");

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__useCasesModel_packages_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__documentRootToUseCasesModel_source_documentRoot
								.setTrg(documentRoot);

						// create link
						isApplicableMatch.getAllContextElements().add(
								documentRoot);

						// create link
						__useCasesModel_packages_packageDeclaration
								.setSrc(useCasesModel);

						// create link
						__documentRootToUseCasesModel_target_useCasesModel
								.setTrg(useCasesModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								useCasesModel);

						// create link
						__documentRootToUseCasesModel_source_documentRoot
								.setSrc(documentRootToUseCasesModel);

						// create link
						__documentRootToUseCasesModel_target_useCasesModel
								.setSrc(documentRootToUseCasesModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								documentRootToUseCasesModel);

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__documentRootToUseCasesModel_target_useCasesModel,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__documentRootToUseCasesModel_source_documentRoot,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__useCasesModel_packages_packageDeclaration,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, packageDeclaration,
									documentRoot, useCasesModel,
									documentRootToUseCasesModel));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_BWD(csp);
						if (fujaba__Success) {
							// story node 'add match to rule result'
							try {
								fujaba__Success = false;

								// check object isApplicableMatch is really bound
								JavaSDM.ensure(isApplicableMatch != null);
								// check object ruleresult is really bound
								JavaSDM.ensure(ruleresult != null);
								// assign attribute ruleresult
								ruleresult.setSuccess(true);
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("DefinitionsToPackageRule");

								// create link
								isApplicableMatch
										.setIsApplicableRuleResult(ruleresult);

								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCasesModel", useCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCasesModel useCasesModel) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration, DocumentRoot documentRoot,
			UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("http://");
		literal0.setType("String");

		// Create attribute variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", true, csp);
		var_packageDeclaration_name.setValue(packageDeclaration.getName());
		var_packageDeclaration_name.setType("String");

		// Create explicit parameters

		// Create unbound variables
		Variable var_definitions_targetNamespace = CSPFactoryHelper.eINSTANCE
				.createVariable("definitions.targetNamespace", csp);
		var_definitions_targetNamespace.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_packageDeclaration_name,
				var_definitions_targetNamespace);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject definitions, EObject packageDeclaration,
			EObject definitionsToPackage, EObject documentRoot,
			EObject useCasesModel, EObject documentRootToUseCasesModel) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("documentRoot", documentRoot);
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("packageDeclaration")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getPackageDeclaration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(
			EMoflonEdge _edge_definitions) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		DocumentRoot __DEC_definitions_definitions_593074 = null;
		Match match = null;
		Definitions definitions = null;
		DocumentRoot documentRoot = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_definitions is really bound
			JavaSDM.ensure(_edge_definitions != null);
			// bind object
			_TmpObject = _edge_definitions.getSrc();

			// ensure correct type and really bound of object documentRoot
			JavaSDM.ensure(_TmpObject instanceof DocumentRoot);
			documentRoot = (DocumentRoot) _TmpObject;

			// bind object
			_TmpObject = _edge_definitions.getTrg();

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;

			// check link definitions from definitions to documentRoot
			JavaSDM.ensure(documentRoot.equals(definitions.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_definitions_definitions_593074 = definitions
							.eContainer() instanceof DocumentRoot ? (DocumentRoot) definitions
							.eContainer() : null;

					// check object __DEC_definitions_definitions_593074 is really bound
					JavaSDM.ensure(__DEC_definitions_definitions_593074 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_definitions_definitions_593074
							.getDefinitions().contains(definitions));

					// check isomorphic binding between objects __DEC_definitions_definitions_593074 and documentRoot 
					JavaSDM.ensure(!__DEC_definitions_definitions_593074
							.equals(documentRoot));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_definitions is really bound
				JavaSDM.ensure(_edge_definitions != null);
				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// check link definitions from definitions to documentRoot
				JavaSDM.ensure(documentRoot.equals(definitions.eContainer()));

				// check link src from _edge_definitions to documentRoot
				JavaSDM.ensure(documentRoot.equals(_edge_definitions.getSrc()));

				// check link trg from _edge_definitions to definitions
				JavaSDM.ensure(definitions.equals(_edge_definitions.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, definitions,
						documentRoot);
				if (fujaba__Success) {
					// statement node ''
					fujaba__Success = this.checkTypes_FWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(
			EMoflonEdge _edge_packages) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCasesModel __DEC_packageDeclaration_packages_60115 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_packages is really bound
			JavaSDM.ensure(_edge_packages != null);
			// bind object
			_TmpObject = _edge_packages.getSrc();

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;

			// bind object
			_TmpObject = _edge_packages.getTrg();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// check link packages from packageDeclaration to useCasesModel
			JavaSDM.ensure(useCasesModel.equals(packageDeclaration.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_packageDeclaration_packages_60115 = packageDeclaration
							.eContainer() instanceof UseCasesModel ? (UseCasesModel) packageDeclaration
							.eContainer() : null;

					// check object __DEC_packageDeclaration_packages_60115 is really bound
					JavaSDM.ensure(__DEC_packageDeclaration_packages_60115 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_packageDeclaration_packages_60115
							.getPackages().contains(packageDeclaration));

					// check isomorphic binding between objects __DEC_packageDeclaration_packages_60115 and useCasesModel 
					JavaSDM.ensure(!__DEC_packageDeclaration_packages_60115
							.equals(useCasesModel));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_packages is really bound
				JavaSDM.ensure(_edge_packages != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				// check link packages from packageDeclaration to useCasesModel
				JavaSDM.ensure(useCasesModel.equals(packageDeclaration
						.eContainer()));

				// check link src from _edge_packages to useCasesModel
				JavaSDM.ensure(useCasesModel.equals(_edge_packages.getSrc()));

				// check link trg from _edge_packages to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(_edge_packages
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match,
						packageDeclaration, useCasesModel);
				if (fujaba__Success) {
					// statement node ''
					fujaba__Success = this.checkTypes_BWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			DocRootToUCModel documentRootToUseCasesModelDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		Definitions definitions = null;
		DefinitionsToPackage definitionsToPackage = null;
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;
		DocumentRoot documentRoot = null;
		Iterator fujaba__IterDocumentRootToUseCasesModelListToDocumentRootToUseCasesModel = null;
		DocRootToUCModel documentRootToUseCasesModel = null;
		Iterator fujaba__IterRuleEntryContainerToDocumentRootToUseCasesModelList = null;
		RuleEntryList documentRootToUseCasesModelList = null;

		// story node 'create result'
		try {
			fujaba__Success = false;

			// create object ruleResult
			ruleResult = TGGRuntimeFactory.eINSTANCE
					.createModelgeneratorRuleResult();

			// create object isApplicableMatch
			isApplicableMatch = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableMatch();

			// assign attribute ruleResult
			ruleResult.setSuccess(false);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'is applicable core'
		try {
			fujaba__Success = false;

			// check object ruleEntryContainer is really bound
			JavaSDM.ensure(ruleEntryContainer != null);
			// iterate to-many link ruleEntryList from ruleEntryContainer to documentRootToUseCasesModelList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToDocumentRootToUseCasesModelList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToDocumentRootToUseCasesModelList
					.hasNext()) {
				try {
					documentRootToUseCasesModelList = (RuleEntryList) fujaba__IterRuleEntryContainerToDocumentRootToUseCasesModelList
							.next();

					// check object documentRootToUseCasesModelList is really bound
					JavaSDM.ensure(documentRootToUseCasesModelList != null);
					// iterate to-many link entryObjects from documentRootToUseCasesModelList to documentRootToUseCasesModel
					fujaba__Success = false;

					fujaba__IterDocumentRootToUseCasesModelListToDocumentRootToUseCasesModel = new ArrayList(
							documentRootToUseCasesModelList.getEntryObjects())
							.iterator();

					while (fujaba__IterDocumentRootToUseCasesModelListToDocumentRootToUseCasesModel
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterDocumentRootToUseCasesModelListToDocumentRootToUseCasesModel
									.next();

							// ensure correct type and really bound of object documentRootToUseCasesModel
							JavaSDM.ensure(_TmpObject instanceof DocRootToUCModel);
							documentRootToUseCasesModel = (DocRootToUCModel) _TmpObject;
							// bind object
							documentRoot = documentRootToUseCasesModel
									.getSource();

							// check object documentRoot is really bound
							JavaSDM.ensure(documentRoot != null);

							// bind object
							useCasesModel = documentRootToUseCasesModel
									.getTarget();

							// check object useCasesModel is really bound
							JavaSDM.ensure(useCasesModel != null);

							// story node 'solve CSP'
							try {
								fujaba__Success = false;

								_TmpObject = (this
										.generateModel_solveCsp_BWD(
												isApplicableMatch, definitions,
												packageDeclaration,
												definitionsToPackage,
												documentRoot, useCasesModel,
												documentRootToUseCasesModel,
												ruleResult));

								// ensure correct type and really bound of object csp
								JavaSDM.ensure(_TmpObject instanceof CSP);
								csp = (CSP) _TmpObject;
								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

							// statement node 'check CSP'
							fujaba__Success = this
									.generateModel_checkCsp_BWD(csp);
							if (fujaba__Success) {
								// story node 'perform'
								try {
									fujaba__Success = false;

									// check object documentRoot is really bound
									JavaSDM.ensure(documentRoot != null);
									// check object documentRootToUseCasesModel is really bound
									JavaSDM.ensure(documentRootToUseCasesModel != null);
									// check object ruleResult is really bound
									JavaSDM.ensure(ruleResult != null);
									// check object useCasesModel is really bound
									JavaSDM.ensure(useCasesModel != null);
									// create object definitions
									definitions = Bpmn2Factory.eINSTANCE
											.createDefinitions();

									// create object definitionsToPackage
									definitionsToPackage = BpmnToUseCaseIntegrationFactory.eINSTANCE
											.createDefinitionsToPackage();

									// create object packageDeclaration
									packageDeclaration = UseCaseDSLFactory.eINSTANCE
											.createPackageDeclaration();

									// assign attribute definitions
									definitions
											.setTargetNamespace((java.lang.String) csp
													.getAttributeVariable(
															"definitions",
															"targetNamespace")
													.getValue());
									// assign attribute packageDeclaration
									packageDeclaration
											.setName((java.lang.String) csp
													.getAttributeVariable(
															"packageDeclaration",
															"name").getValue());
									// assign attribute ruleResult
									ruleResult.setSuccess(true);

									// create link
									ruleResult.getSourceObjects().add(
											definitions);

									// create link
									documentRoot.getDefinitions().add(
											definitions);

									// create link
									definitionsToPackage.setSource(definitions);

									// create link
									useCasesModel.getPackages().add(
											packageDeclaration);

									// create link
									ruleResult.getTargetObjects().add(
											packageDeclaration);

									// create link
									definitionsToPackage
											.setTarget(packageDeclaration);

									// create link
									ruleResult.getCorrObjects().add(
											definitionsToPackage);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								return ruleResult;

							}

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage,
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocRootToUCModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("http://");
		literal0.setType("String");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("String");
		Variable var_definitions_targetNamespace = CSPFactoryHelper.eINSTANCE
				.createVariable("definitions.targetNamespace", csp);
		var_definitions_targetNamespace.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_packageDeclaration_name,
				var_definitions_targetNamespace);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("documentRootToUseCasesModel",
				documentRootToUseCasesModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_DOCUMENTROOT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_DOCUMENTROOT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_DOCUMENTROOT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_DOCUMENTROOT_USECASESMODEL_DOCROOTTOUCMODEL:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(DocumentRoot) arguments.get(2),
					(UseCasesModel) arguments.get(3),
					(DocRootToUCModel) arguments.get(4));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCasesModel) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCasesModel) arguments.get(2));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASESMODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCasesModel) arguments.get(2));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_DOCUMENTROOT_USECASESMODEL_DOCROOTTOUCMODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(DocumentRoot) arguments.get(2),
					(UseCasesModel) arguments.get(3),
					(DocRootToUCModel) arguments.get(4));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DOCROOTTOUCMODEL:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(DocRootToUCModel) arguments.get(1));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_DOCUMENTROOT_USECASESMODEL_DOCROOTTOUCMODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(DefinitionsToPackage) arguments.get(3),
					(DocumentRoot) arguments.get(4),
					(UseCasesModel) arguments.get(5),
					(DocRootToUCModel) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.DEFINITIONS_TO_PACKAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DefinitionsToPackageRuleImpl
