/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration;
import BpmnToUseCaseIntegration.DocumentRootToUseCasesModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepCoreRule;
import BpmnToUseCaseIntegration.Rules.ExclusiveGatewayToStepRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative;
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
import bpmn2.Process;

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

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Gateway To Step Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExclusiveGatewayToStepRuleImpl extends AbstractRuleImpl implements
		ExclusiveGatewayToStepRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveGatewayToStepRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExclusiveGatewayToStepRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, inFlow,
					process, exclusiveGateway, outFlow));

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

				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_default_outFlow
				__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway.setName("targetRef");
				// assign attribute __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __exclusiveGateway_default_outFlow
				__exclusiveGateway_default_outFlow.setName("default");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_default_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

				// create link
				__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

				// create link
				__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_default_outFlow.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_default_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

				// create link
				__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_inFlow.setSrc(process);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, inFlow, process,
					exclusiveGateway, outFlow);
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
		Actor actor = null;
		ExclusiveGateway exclusiveGateway = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		SequenceFlow outFlow = null;
		Step prevStep = null;
		Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		NormalStep normalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge exclusiveGatewayToNormalStep__target__normalStep = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge prevStep__next__normalStep = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge flow__steps__normalStep = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge normalStep__actor__actor = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge exclusiveGatewayToNormalStep__source__exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToPrevStep"));

			// ensure correct type and really bound of object inFlowToPrevStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToActor"));

			// ensure correct type and really bound of object processToActor
			JavaSDM.ensure(_TmpObject instanceof ProcessToActor);
			processToActor = (ProcessToActor) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

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
			// create object normalStep
			normalStep = UseCaseDSLFactory.eINSTANCE.createNormalStep();

			// create object exclusiveGatewayToNormalStep
			exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute normalStep
			normalStep.setName((java.lang.String) csp.getAttributeVariable(
					"normalStep", "name").getValue());
			// assign attribute normalStep
			normalStep.setLabel((java.lang.String) csp.getAttributeVariable(
					"normalStep", "label").getValue());

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					outFlow, "source");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					flow, "target");

			// create link
			exclusiveGatewayToNormalStep.setSource(exclusiveGateway);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(prevStep,
					normalStep, "next");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(normalStep,
					actor, "actor");

			// create link
			exclusiveGatewayToNormalStep.setTarget(normalStep);

			// create link
			flow.getSteps().add(normalStep);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object inFlowToPrevStep is really bound
			JavaSDM.ensure(inFlowToPrevStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects exclusiveGateway and actor 
			JavaSDM.ensure(!exclusiveGateway.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and actor 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects inFlowToPrevStep and actor 
			JavaSDM.ensure(!inFlowToPrevStep.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToPrevStep and exclusiveGateway 
			JavaSDM.ensure(!inFlowToPrevStep.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects prevStep and exclusiveGateway 
			JavaSDM.ensure(!prevStep.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects processToActor and exclusiveGateway 
			JavaSDM.ensure(!processToActor.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects prevStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!prevStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects processToActor and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!processToActor.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects prevStep and flow 
			JavaSDM.ensure(!prevStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects prevStep and inFlow 
			JavaSDM.ensure(!prevStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects prevStep and outFlow 
			JavaSDM.ensure(!prevStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToNormalStep 
			JavaSDM.ensure(!prevStep.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object __process_flowElements_exclusiveGateway
			__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_incoming_inFlow
			__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object prevStep__next__normalStep
			prevStep__next__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_default_outFlow
			__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object flow__steps__normalStep
			flow__steps__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object normalStep__actor__actor
			normalStep__actor__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_exclusiveGateway
			__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExclusiveGatewayToStepRule");
			// assign attribute prevStep__next__normalStep
			prevStep__next__normalStep.setName("next");
			// assign attribute normalStep__actor__actor
			normalStep__actor__actor.setName("actor");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute __process_flowElements_exclusiveGateway
			__process_flowElements_exclusiveGateway.setName("flowElements");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __inFlow_targetRef_exclusiveGateway
			__inFlow_targetRef_exclusiveGateway.setName("targetRef");
			// assign attribute __exclusiveGateway_incoming_inFlow
			__exclusiveGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
			// assign attribute __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute __exclusiveGateway_default_outFlow
			__exclusiveGateway_default_outFlow.setName("default");
			// assign attribute exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setName("source");
			// assign attribute exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute flow__steps__normalStep
			flow__steps__normalStep.setName("steps");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__target__normalStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					prevStep__next__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_default_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep__actor__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__source__exclusiveGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_outgoing_outFlow, "translatedEdges");

			// create link
			__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

			// create link
			prevStep__next__normalStep.setSrc(prevStep);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			normalStep__actor__actor.setSrc(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			flow__steps__normalStep.setTrg(normalStep);

			// create link
			prevStep__next__normalStep.setTrg(normalStep);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			__process_flowElements_exclusiveGateway.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setTrg(exclusiveGateway);

			// create link
			__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

			// create link
			__exclusiveGateway_default_outFlow.setSrc(exclusiveGateway);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__process_flowElements_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

			// create link
			__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__exclusiveGateway_default_outFlow.setTrg(outFlow);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			flow__steps__normalStep.setSrc(flow);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			normalStep__actor__actor.setTrg(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, outFlowToFlow, inFlowToFlow,
				process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor);
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
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __processToActor_target_actor = null;
		CSP csp = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Step prevStep = null;
		Iterator fujaba__IterInFlowToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

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
			ruleresult.setRule("ExclusiveGatewayToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// iterate to-many link source from inFlow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterInFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							SequenceFlowToUCFlow.class, "source")).iterator();

			while (fujaba__IterInFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// bind object
					flow = inFlowToFlow.getTarget();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// iterate to-many link source from inFlow to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterInFlowToInFlowToPrevStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(inFlow,
											SequenceFlowToStep.class, "source"))
							.iterator();

					while (fujaba__IterInFlowToInFlowToPrevStep.hasNext()) {
						try {
							inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToPrevStep
									.next();

							// check object inFlowToPrevStep is really bound
							JavaSDM.ensure(inFlowToPrevStep != null);
							// bind object
							prevStep = inFlowToPrevStep.getTarget();

							// check object prevStep is really bound
							JavaSDM.ensure(prevStep != null);

							// iterate to-many link source from process to processToActor
							fujaba__Success = false;

							fujaba__IterProcessToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(process,
													ProcessToActor.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToActor
									.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterProcessToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									actor = processToActor.getTarget();

									// check object actor is really bound
									JavaSDM.ensure(actor != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object inFlowToPrevStep is really bound
										JavaSDM.ensure(inFlowToPrevStep != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object prevStep is really bound
										JavaSDM.ensure(prevStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToActor is really bound
										JavaSDM.ensure(processToActor != null);
										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(outFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link flowElements from exclusiveGateway to process
										JavaSDM.ensure(process
												.equals(exclusiveGateway
														.eContainer()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link flowElements from outFlow to process
										JavaSDM.ensure(process.equals(outFlow
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from inFlowToPrevStep to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToPrevStep
														.getSource()));

										// check link source from processToActor to process
										JavaSDM.ensure(process
												.equals(processToActor
														.getSource()));

										// check link sourceRef from outFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(outFlow.getSourceRef()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from inFlowToPrevStep to prevStep
										JavaSDM.ensure(prevStep
												.equals(inFlowToPrevStep
														.getTarget()));

										// check link target from processToActor to actor
										JavaSDM.ensure(actor
												.equals(processToActor
														.getTarget()));

										// check link targetRef from inFlow to exclusiveGateway
										JavaSDM.ensure(exclusiveGateway
												.equals(inFlow.getTargetRef()));

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __inFlow_targetRef_exclusiveGateway
										__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_incoming_inFlow
										__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_source_process
										__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_exclusiveGateway
										__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_default_outFlow
										__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_outgoing_outFlow
										__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_target_actor
										__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep
												.setName("target");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway
												.setName("flowElements");
										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
												.setName("flowElements");
										// assign attribute __inFlow_targetRef_exclusiveGateway
										__inFlow_targetRef_exclusiveGateway
												.setName("targetRef");
										// assign attribute __exclusiveGateway_incoming_inFlow
										__exclusiveGateway_incoming_inFlow
												.setName("incoming");
										// assign attribute __outFlow_sourceRef_exclusiveGateway
										__outFlow_sourceRef_exclusiveGateway
												.setName("sourceRef");
										// assign attribute __exclusiveGateway_outgoing_outFlow
										__exclusiveGateway_outgoing_outFlow
												.setName("outgoing");
										// assign attribute __exclusiveGateway_default_outFlow
										__exclusiveGateway_default_outFlow
												.setName("default");
										// assign attribute __processToActor_source_process
										__processToActor_source_process
												.setName("source");
										// assign attribute __processToActor_target_actor
										__processToActor_target_actor
												.setName("target");

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlow_targetRef_exclusiveGateway
												.setSrc(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__exclusiveGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__processToActor_source_process
												.setTrg(process);

										// create link
										__process_flowElements_exclusiveGateway
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__outFlow_sourceRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__inFlow_targetRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__exclusiveGateway_default_outFlow
												.setSrc(exclusiveGateway);

										// create link
										__process_flowElements_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__exclusiveGateway_outgoing_outFlow
												.setSrc(exclusiveGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														exclusiveGateway);

										// create link
										__exclusiveGateway_incoming_inFlow
												.setSrc(exclusiveGateway);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										__exclusiveGateway_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										__outFlow_sourceRef_exclusiveGateway
												.setSrc(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__exclusiveGateway_default_outFlow
												.setTrg(outFlow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

										// create link
										__processToActor_source_process
												.setSrc(processToActor);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlow_targetRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__outFlow_sourceRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGateway_default_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_target_prevStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGateway_outgoing_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__exclusiveGateway_incoming_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_target_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_inFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															inFlow, prevStep,
															inFlowToPrevStep,
															inFlowToFlow,
															process,
															exclusiveGateway,
															outFlow, flow,
															actor,
															processToActor));

											// ensure correct type and really bound of object csp
											JavaSDM.ensure(_TmpObject instanceof CSP);
											csp = (CSP) _TmpObject;
											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										// statement node 'check CSP'
										fujaba__Success = this
												.isApplicable_checkCsp_FWD(csp);
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
														.setRuleName("ExclusiveGatewayToStepRule");

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow) {
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow inFlow,
			bpmn2.Process process, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow, Flow flow,
			Actor actor, ProcessToActor processToActor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", true, csp);
		var_exclusiveGateway_id.setValue(exclusiveGateway.getId());
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", true, csp);
		var_exclusiveGateway_name.setValue(exclusiveGateway.getName());

		// Create explicit parameters

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
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
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("exclusiveGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getExclusiveGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __prevStep_next_normalStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, prevStep,
					normalStep, flow, actor));

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

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __prevStep_next_normalStep
				__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __prevStep_next_normalStep
				__prevStep_next_normalStep.setName("next");
				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__prevStep_next_normalStep, "toBeTranslatedEdges");

				// create link
				__prevStep_next_normalStep.setSrc(prevStep);

				// create link
				__prevStep_next_normalStep.setTrg(normalStep);

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				// create link
				__normalStep_actor_actor.setTrg(actor);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						prevStep, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, prevStep, normalStep, flow,
					actor);
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
		Actor actor = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		NormalStep normalStep = null;
		Step prevStep = null;
		Process process = null;
		ProcessToActor processToActor = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		SequenceFlow outFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge exclusiveGateway__incoming__inFlow = null;
		EMoflonEdge exclusiveGateway__outgoing__outFlow = null;
		EMoflonEdge process__flowElements__outFlow = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge outFlowToFlow__source__outFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge outFlow__sourceRef__exclusiveGateway = null;
		EMoflonEdge outFlowToFlow__target__flow = null;
		EMoflonEdge exclusiveGatewayToNormalStep__source__exclusiveGateway = null;
		EMoflonEdge inFlow__targetRef__exclusiveGateway = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge exclusiveGateway__default__outFlow = null;
		EMoflonEdge process__flowElements__exclusiveGateway = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge exclusiveGatewayToNormalStep__target__normalStep = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToPrevStep"));

			// ensure correct type and really bound of object inFlowToPrevStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToActor"));

			// ensure correct type and really bound of object processToActor
			JavaSDM.ensure(_TmpObject instanceof ProcessToActor);
			processToActor = (ProcessToActor) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

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
			// create object exclusiveGateway
			exclusiveGateway = Bpmn2Factory.eINSTANCE.createExclusiveGateway();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create object exclusiveGatewayToNormalStep
			exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToFlow
			outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlow
			outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// assign attribute exclusiveGateway
			exclusiveGateway.setId((java.lang.String) csp.getAttributeVariable(
					"exclusiveGateway", "id").getValue());
			// assign attribute exclusiveGateway
			exclusiveGateway.setName((java.lang.String) csp
					.getAttributeVariable("exclusiveGateway", "name")
					.getValue());
			// assign attribute exclusiveGateway
			exclusiveGateway.setGatewayDirection((bpmn2.GatewayDirection) csp
					.getAttributeVariable("exclusiveGateway",
							"gatewayDirection").getValue());

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			exclusiveGateway.getIncoming().add(inFlow);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			exclusiveGatewayToNormalStep.setTarget(normalStep);

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					flow, "target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(outFlowToFlow,
					outFlow, "source");

			// create link
			process.getFlowElements().add(exclusiveGateway); // add link

			// create link
			process.getFlowElements().add(outFlow); // add link

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(
					exclusiveGateway, outFlow, "default");

			// create link
			outFlow.setSourceRef(exclusiveGateway);

			// create link
			exclusiveGatewayToNormalStep.setSource(exclusiveGateway);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					normalStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object exclusiveGatewayToNormalStep is really bound
			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object inFlowToPrevStep is really bound
			JavaSDM.ensure(inFlowToPrevStep != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToFlow is really bound
			JavaSDM.ensure(outFlowToFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object prevStep is really bound
			JavaSDM.ensure(prevStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects exclusiveGateway and actor 
			JavaSDM.ensure(!exclusiveGateway.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and actor 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(actor));

			// check isomorphic binding between objects flow and actor 
			JavaSDM.ensure(!flow.equals(actor));

			// check isomorphic binding between objects inFlow and actor 
			JavaSDM.ensure(!inFlow.equals(actor));

			// check isomorphic binding between objects inFlowToFlow and actor 
			JavaSDM.ensure(!inFlowToFlow.equals(actor));

			// check isomorphic binding between objects inFlowToPrevStep and actor 
			JavaSDM.ensure(!inFlowToPrevStep.equals(actor));

			// check isomorphic binding between objects normalStep and actor 
			JavaSDM.ensure(!normalStep.equals(actor));

			// check isomorphic binding between objects outFlow and actor 
			JavaSDM.ensure(!outFlow.equals(actor));

			// check isomorphic binding between objects outFlowToFlow and actor 
			JavaSDM.ensure(!outFlowToFlow.equals(actor));

			// check isomorphic binding between objects outFlowToNormalStep and actor 
			JavaSDM.ensure(!outFlowToNormalStep.equals(actor));

			// check isomorphic binding between objects prevStep and actor 
			JavaSDM.ensure(!prevStep.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToPrevStep and exclusiveGateway 
			JavaSDM.ensure(!inFlowToPrevStep.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects prevStep and exclusiveGateway 
			JavaSDM.ensure(!prevStep.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects processToActor and exclusiveGateway 
			JavaSDM.ensure(!processToActor.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToPrevStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToPrevStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects prevStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!prevStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects processToActor and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!processToActor.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToPrevStep and flow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToFlow and flow 
			JavaSDM.ensure(!outFlowToFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects prevStep and flow 
			JavaSDM.ensure(!prevStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects processToActor and flow 
			JavaSDM.ensure(!processToActor.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects prevStep and inFlow 
			JavaSDM.ensure(!prevStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects processToActor and inFlow 
			JavaSDM.ensure(!processToActor.equals(inFlow));

			// check isomorphic binding between objects inFlowToPrevStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToPrevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects prevStep and inFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects processToActor and inFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToPrevStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToFlow and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToFlow.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToPrevStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects prevStep and inFlowToPrevStep 
			JavaSDM.ensure(!prevStep.equals(inFlowToPrevStep));

			// check isomorphic binding between objects process and inFlowToPrevStep 
			JavaSDM.ensure(!process.equals(inFlowToPrevStep));

			// check isomorphic binding between objects processToActor and inFlowToPrevStep 
			JavaSDM.ensure(!processToActor.equals(inFlowToPrevStep));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and normalStep 
			JavaSDM.ensure(!outFlowToFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects processToActor and normalStep 
			JavaSDM.ensure(!processToActor.equals(normalStep));

			// check isomorphic binding between objects outFlowToFlow and outFlow 
			JavaSDM.ensure(!outFlowToFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects prevStep and outFlow 
			JavaSDM.ensure(!prevStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects processToActor and outFlow 
			JavaSDM.ensure(!processToActor.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToFlow 
			JavaSDM.ensure(!prevStep.equals(outFlowToFlow));

			// check isomorphic binding between objects process and outFlowToFlow 
			JavaSDM.ensure(!process.equals(outFlowToFlow));

			// check isomorphic binding between objects processToActor and outFlowToFlow 
			JavaSDM.ensure(!processToActor.equals(outFlowToFlow));

			// check isomorphic binding between objects prevStep and outFlowToNormalStep 
			JavaSDM.ensure(!prevStep.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects processToActor and outFlowToNormalStep 
			JavaSDM.ensure(!processToActor.equals(outFlowToNormalStep));

			// check isomorphic binding between objects process and prevStep 
			JavaSDM.ensure(!process.equals(prevStep));

			// check isomorphic binding between objects processToActor and prevStep 
			JavaSDM.ensure(!processToActor.equals(prevStep));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__incoming__inFlow
			exclusiveGateway__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__outgoing__outFlow
			exclusiveGateway__outgoing__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__outFlow
			process__flowElements__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __prevStep_next_normalStep
			__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlow__sourceRef__exclusiveGateway
			outFlow__sourceRef__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToFlow__target__flow
			outFlowToFlow__target__flow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object inFlow__targetRef__exclusiveGateway
			inFlow__targetRef__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __normalStep_actor_actor
			__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGateway__default__outFlow
			exclusiveGateway__default__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__exclusiveGateway
			process__flowElements__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_normalStep
			__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExclusiveGatewayToStepRule");
			// assign attribute __prevStep_next_normalStep
			__prevStep_next_normalStep.setName("next");
			// assign attribute __normalStep_actor_actor
			__normalStep_actor_actor.setName("actor");
			// assign attribute outFlowToFlow__source__outFlow
			outFlowToFlow__source__outFlow.setName("source");
			// assign attribute outFlowToFlow__target__flow
			outFlowToFlow__target__flow.setName("target");
			// assign attribute process__flowElements__exclusiveGateway
			process__flowElements__exclusiveGateway.setName("flowElements");
			// assign attribute process__flowElements__outFlow
			process__flowElements__outFlow.setName("flowElements");
			// assign attribute inFlow__targetRef__exclusiveGateway
			inFlow__targetRef__exclusiveGateway.setName("targetRef");
			// assign attribute exclusiveGateway__incoming__inFlow
			exclusiveGateway__incoming__inFlow.setName("incoming");
			// assign attribute outFlow__sourceRef__exclusiveGateway
			outFlow__sourceRef__exclusiveGateway.setName("sourceRef");
			// assign attribute exclusiveGateway__outgoing__outFlow
			exclusiveGateway__outgoing__outFlow.setName("outgoing");
			// assign attribute exclusiveGateway__default__outFlow
			exclusiveGateway__default__outFlow.setName("default");
			// assign attribute exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setName("source");
			// assign attribute exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");
			// assign attribute __flow_steps_normalStep
			__flow_steps_normalStep.setName("steps");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__outgoing__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__prevStep_next_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlow__sourceRef__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToFlow__target__flow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__source__exclusiveGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__normalStep_actor_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway__default__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__exclusiveGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_normalStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__target__normalStep,
					"createdEdges");

			// create link
			inFlow__targetRef__exclusiveGateway.setSrc(inFlow);

			// create link
			exclusiveGateway__incoming__inFlow.setTrg(inFlow);

			// create link
			__prevStep_next_normalStep.setSrc(prevStep);

			// create link
			__flow_steps_normalStep.setTrg(normalStep);

			// create link
			__normalStep_actor_actor.setSrc(normalStep);

			// create link
			__prevStep_next_normalStep.setTrg(normalStep);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			outFlowToFlow__source__outFlow.setSrc(outFlowToFlow);

			// create link
			outFlowToFlow__target__flow.setSrc(outFlowToFlow);

			// create link
			process__flowElements__exclusiveGateway.setSrc(process);

			// create link
			process__flowElements__outFlow.setSrc(process);

			// create link
			process__flowElements__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__outgoing__outFlow.setSrc(exclusiveGateway);

			// create link
			inFlow__targetRef__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__default__outFlow.setSrc(exclusiveGateway);

			// create link
			outFlow__sourceRef__exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setTrg(exclusiveGateway);

			// create link
			exclusiveGateway__incoming__inFlow.setSrc(exclusiveGateway);

			// create link
			outFlow__sourceRef__exclusiveGateway.setSrc(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			process__flowElements__outFlow.setTrg(outFlow);

			// create link
			exclusiveGateway__outgoing__outFlow.setTrg(outFlow);

			// create link
			exclusiveGateway__default__outFlow.setTrg(outFlow);

			// create link
			outFlowToFlow__source__outFlow.setTrg(outFlow);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToFlow__target__flow.setTrg(flow);

			// create link
			__flow_steps_normalStep.setSrc(flow);

			// create link
			__normalStep_actor_actor.setTrg(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, inFlow, prevStep,
				inFlowToPrevStep, normalStep, outFlowToFlow, inFlowToFlow,
				process, exclusiveGateway, outFlow,
				exclusiveGatewayToNormalStep, outFlowToNormalStep, flow, actor,
				processToActor);
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
		Actor actor = null;
		Flow flow = null;
		NormalStep normalStep = null;
		Step prevStep = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __inFlowToPrevStep_source_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToPrevStep_target_prevStep = null;
		EMoflonEdge __prevStep_next_normalStep = null;
		EMoflonEdge __flow_steps_normalStep = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __processToActor_source_process = null;
		EMoflonEdge __processToActor_target_actor = null;
		CSP csp = null;
		Process process = null;
		Iterator fujaba__IterActorToProcessToActor = null;
		ProcessToActor processToActor = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterPrevStepToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

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
			ruleresult.setRule("ExclusiveGatewayToStepRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (match.getObject("prevStep"));

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// iterate to-many link target from flow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							SequenceFlowToUCFlow.class, "target")).iterator();

			while (fujaba__IterFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// iterate to-many link target from prevStep to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterPrevStepToInFlowToPrevStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(prevStep,
											SequenceFlowToStep.class, "target"))
							.iterator();

					while (fujaba__IterPrevStepToInFlowToPrevStep.hasNext()) {
						try {
							inFlowToPrevStep = (SequenceFlowToStep) fujaba__IterPrevStepToInFlowToPrevStep
									.next();

							// check object inFlowToPrevStep is really bound
							JavaSDM.ensure(inFlowToPrevStep != null);
							// bind object
							inFlow = inFlowToPrevStep.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// check link source from inFlowToFlow to inFlow
							JavaSDM.ensure(inFlow.equals(inFlowToFlow
									.getSource()));

							// iterate to-many link target from actor to processToActor
							fujaba__Success = false;

							fujaba__IterActorToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(actor,
													ProcessToActor.class,
													"target")).iterator();

							while (fujaba__IterActorToProcessToActor.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterActorToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									process = processToActor.getSource();

									// check object process is really bound
									JavaSDM.ensure(process != null);

									// story node 'find context'
									try {
										fujaba__Success = false;

										// check object actor is really bound
										JavaSDM.ensure(actor != null);
										// check object flow is really bound
										JavaSDM.ensure(flow != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object inFlowToFlow is really bound
										JavaSDM.ensure(inFlowToFlow != null);
										// check object inFlowToPrevStep is really bound
										JavaSDM.ensure(inFlowToPrevStep != null);
										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);
										// check object prevStep is really bound
										JavaSDM.ensure(prevStep != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check object processToActor is really bound
										JavaSDM.ensure(processToActor != null);
										// check isomorphic binding between objects prevStep and normalStep 
										JavaSDM.ensure(!prevStep
												.equals(normalStep));

										// check link actor from normalStep to actor
										JavaSDM.ensure(actor.equals(normalStep
												.getActor()));

										// check link next from prevStep to normalStep
										JavaSDM.ensure(normalStep
												.equals(prevStep.getNext()));

										// check link flowElements from inFlow to process
										JavaSDM.ensure(process.equals(inFlow
												.eContainer()));

										// check link source from inFlowToFlow to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToFlow
														.getSource()));

										// check link source from inFlowToPrevStep to inFlow
										JavaSDM.ensure(inFlow
												.equals(inFlowToPrevStep
														.getSource()));

										// check link source from processToActor to process
										JavaSDM.ensure(process
												.equals(processToActor
														.getSource()));

										// check link steps from normalStep to flow
										JavaSDM.ensure(flow.equals(normalStep
												.eContainer()));

										// check link target from inFlowToFlow to flow
										JavaSDM.ensure(flow.equals(inFlowToFlow
												.getTarget()));

										// check link target from inFlowToPrevStep to prevStep
										JavaSDM.ensure(prevStep
												.equals(inFlowToPrevStep
														.getTarget()));

										// check link target from processToActor to actor
										JavaSDM.ensure(actor
												.equals(processToActor
														.getTarget()));

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __prevStep_next_normalStep
										__prevStep_next_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_normalStep
										__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_actor_actor
										__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_source_process
										__processToActor_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToActor_target_actor
										__processToActor_target_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __prevStep_next_normalStep
										__prevStep_next_normalStep
												.setName("next");
										// assign attribute __inFlowToPrevStep_source_inFlow
										__inFlowToPrevStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToPrevStep_target_prevStep
										__inFlowToPrevStep_target_prevStep
												.setName("target");
										// assign attribute __normalStep_actor_actor
										__normalStep_actor_actor
												.setName("actor");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __flow_steps_normalStep
										__flow_steps_normalStep
												.setName("steps");
										// assign attribute __processToActor_source_process
										__processToActor_source_process
												.setName("source");
										// assign attribute __processToActor_target_actor
										__processToActor_target_actor
												.setName("target");

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setTrg(inFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setTrg(prevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														prevStep);

										// create link
										__prevStep_next_normalStep
												.setSrc(prevStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_source_inFlow
												.setSrc(inFlowToPrevStep);

										// create link
										__inFlowToPrevStep_target_prevStep
												.setSrc(inFlowToPrevStep);

										// create link
										__flow_steps_normalStep
												.setTrg(normalStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__normalStep_actor_actor
												.setSrc(normalStep);

										// create link
										__prevStep_next_normalStep
												.setTrg(normalStep);

										// create link
										__inFlowToFlow_source_inFlow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToFlow);

										// create link
										__inFlowToFlow_target_flow
												.setSrc(inFlowToFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__processToActor_source_process
												.setTrg(process);

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__flow_steps_normalStep.setSrc(flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__normalStep_actor_actor.setTrg(actor);

										// create link
										__processToActor_target_actor
												.setTrg(actor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__processToActor_target_actor
												.setSrc(processToActor);

										// create link
										__processToActor_source_process
												.setSrc(processToActor);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToActor);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_flowElements_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_target_prevStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__flow_steps_normalStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToFlow_target_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__normalStep_actor_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__prevStep_next_normalStep,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_target_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToPrevStep_source_inFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToActor_source_process,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															inFlow, prevStep,
															inFlowToPrevStep,
															normalStep,
															inFlowToFlow,
															process, flow,
															actor,
															processToActor));

											// ensure correct type and really bound of object csp
											JavaSDM.ensure(_TmpObject instanceof CSP);
											csp = (CSP) _TmpObject;
											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										// statement node 'check CSP'
										fujaba__Success = this
												.isApplicable_checkCsp_BWD(csp);
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
														.setRuleName("ExclusiveGatewayToStepRule");

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step prevStep,
			NormalStep normalStep, Flow flow, Actor actor) {
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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			Flow flow, Actor actor, ProcessToActor processToActor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());

		// Create explicit parameters

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
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
			EObject inFlow, EObject prevStep, EObject inFlowToPrevStep,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject exclusiveGateway, EObject outFlow,
			EObject exclusiveGatewayToNormalStep, EObject outFlowToNormalStep,
			EObject flow, EObject actor, EObject processToActor) {
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("normalStep").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_222(
			EMoflonEdge _edge_next) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_863500 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_885569 = null;
		Step __DEC_normalStep_next_885569 = null;
		Match match = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Step prevStep = null;

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

			// check object _edge_next is really bound
			JavaSDM.ensure(_edge_next != null);
			// bind object
			_TmpObject = _edge_next.getSrc();

			// ensure correct type and really bound of object prevStep
			JavaSDM.ensure(_TmpObject instanceof Step);
			prevStep = (Step) _TmpObject;

			// bind object
			_TmpObject = prevStep.getNext();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// check isomorphic binding between objects prevStep and normalStep 
			JavaSDM.ensure(!prevStep.equals(normalStep));

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_next to normalStep
			JavaSDM.ensure(normalStep.equals(_edge_next.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_863500 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_863500 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_863500 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_863500.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_863500 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_863500.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_885569
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_885569 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_885569
									.hasNext()) {
						try {
							__DEC_normalStep_next_885569 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_885569
									.next();

							// check object __DEC_normalStep_next_885569 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_885569 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_885569 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_885569
									.equals(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_next_885569 and prevStep 
							JavaSDM.ensure(!__DEC_normalStep_next_885569
									.equals(prevStep));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_next is really bound
				JavaSDM.ensure(_edge_next != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check object prevStep is really bound
				JavaSDM.ensure(prevStep != null);
				// check isomorphic binding between objects prevStep and normalStep 
				JavaSDM.ensure(!prevStep.equals(normalStep));

				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link next from prevStep to normalStep
				JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

				// check link src from _edge_next to prevStep
				JavaSDM.ensure(prevStep.equals(_edge_next.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_next to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_next.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, prevStep,
						normalStep, flow, actor);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_223(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_492361 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_404600 = null;
		Step __DEC_normalStep_next_404600 = null;
		Match match = null;
		Iterator fujaba__IterNormalStepToPrevStep = null;
		Step prevStep = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;

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

			// check object _edge_actor is really bound
			JavaSDM.ensure(_edge_actor != null);
			// bind object
			_TmpObject = _edge_actor.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_actor to actor
			JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

			// iterate to-many link next from normalStep to prevStep
			fujaba__Success = false;

			fujaba__IterNormalStepToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, Step.class, "next")).iterator();

			while (fujaba__IterNormalStepToPrevStep.hasNext()) {
				try {
					prevStep = (Step) fujaba__IterNormalStepToPrevStep.next();

					// check object prevStep is really bound
					JavaSDM.ensure(prevStep != null);
					// check isomorphic binding between objects prevStep and normalStep 
					JavaSDM.ensure(!prevStep.equals(normalStep));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_normalStep_steps_492361 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_492361 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_492361 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_492361
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_492361 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_492361
									.equals(flow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link next from normalStep to __DEC_normalStep_next_404600
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_404600 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_404600
											.hasNext()) {
								try {
									__DEC_normalStep_next_404600 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_404600
											.next();

									// check object __DEC_normalStep_next_404600 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_404600 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_404600 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_404600
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_404600 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_404600
											.equals(prevStep));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check object _edge_actor is really bound
						JavaSDM.ensure(_edge_actor != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object prevStep is really bound
						JavaSDM.ensure(prevStep != null);
						// check isomorphic binding between objects prevStep and normalStep 
						JavaSDM.ensure(!prevStep.equals(normalStep));

						// check link actor from normalStep to actor
						JavaSDM.ensure(actor.equals(normalStep.getActor()));

						// check link next from prevStep to normalStep
						JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

						// check link src from _edge_actor to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_actor.getSrc()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_actor to actor
						JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								prevStep, normalStep, flow, actor);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_532(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_471536 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_137763 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_80740 = null;
		ExclusiveGateway __DEC_outFlow_default_80740 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_241783 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_241783 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Process process = null;

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

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link targetRef from exclusiveGateway to inFlow
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
					exclusiveGateway.getIncoming()).iterator();

			while (fujaba__IterExclusiveGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_471536 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_471536 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_471536 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_471536
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_471536 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_471536
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_137763 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_137763 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_137763 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_137763
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_137763 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_137763
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_80740
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_80740 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_80740
											.hasNext()) {
								try {
									__DEC_outFlow_default_80740 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_80740
											.next();

									// check object __DEC_outFlow_default_80740 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_80740 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_80740 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_80740
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_241783
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_241783 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_241783
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_241783 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_241783
											.next();

									// check object __DEC_exclusiveGateway_targetRef_241783 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_241783 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_241783 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_241783
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_241783 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_241783
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flowElements is really bound
						JavaSDM.ensure(_edge_flowElements != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_flowElements to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway
								.equals(_edge_flowElements.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_533(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_291827 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_156825 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_690055 = null;
		ExclusiveGateway __DEC_outFlow_default_690055 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_896204 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_896204 = null;
		Match match = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;

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

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// iterate to-many link flowElements from process to inFlow
			fujaba__Success = false;

			fujaba__IterProcessToInFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// bind object
					_TmpObject = inFlow.getTargetRef();

					// ensure correct type and really bound of object exclusiveGateway
					JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
					exclusiveGateway = (ExclusiveGateway) _TmpObject;

					// bind object
					outFlow = exclusiveGateway.getDefault();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);

					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from exclusiveGateway to process
					JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
							.getSourceRef()));

					// check link trg from _edge_flowElements to outFlow
					JavaSDM.ensure(outFlow.equals(_edge_flowElements.getTrg()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_291827 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_291827 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_291827 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_291827
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_291827 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_291827
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_156825 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_156825 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_156825 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_156825
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_156825 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_156825
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_690055
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_690055 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_690055
											.hasNext()) {
								try {
									__DEC_outFlow_default_690055 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_690055
											.next();

									// check object __DEC_outFlow_default_690055 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_690055 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_690055 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_690055
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_896204
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_896204 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_896204
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_896204 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_896204
											.next();

									// check object __DEC_exclusiveGateway_targetRef_896204 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_896204 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_896204 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_896204
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_896204 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_896204
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flowElements is really bound
						JavaSDM.ensure(_edge_flowElements != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_flowElements to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_flowElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_534(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_259162 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_568937 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_437961 = null;
		ExclusiveGateway __DEC_outFlow_default_437961 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_360103 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_360103 = null;
		Match match = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Process process = null;
		SequenceFlow inFlow = null;

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

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_exclusiveGateway_flowElements_259162 = exclusiveGateway
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
							.eContainer() : null;

					// check object __DEC_exclusiveGateway_flowElements_259162 is really bound
					JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_259162 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_259162
							.getFlowElements().contains(exclusiveGateway));

					// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_259162 and process 
					JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_259162
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_outFlow_flowElements_568937 = outFlow.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
							.eContainer() : null;

					// check object __DEC_outFlow_flowElements_568937 is really bound
					JavaSDM.ensure(__DEC_outFlow_flowElements_568937 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_outFlow_flowElements_568937
							.getFlowElements().contains(outFlow));

					// check isomorphic binding between objects __DEC_outFlow_flowElements_568937 and process 
					JavaSDM.ensure(!__DEC_outFlow_flowElements_568937
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link flowNodeRefs from exclusiveGateway
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(exclusiveGateway, Lane.class,
								"flowNodeRefs").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link default from outFlow to __DEC_outFlow_default_437961
					fujaba__Success = false;

					fujaba__IterOutFlowTo__DEC_outFlow_default_437961 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(outFlow,
											ExclusiveGateway.class, "default"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterOutFlowTo__DEC_outFlow_default_437961
									.hasNext()) {
						try {
							__DEC_outFlow_default_437961 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_437961
									.next();

							// check object __DEC_outFlow_default_437961 is really bound
							JavaSDM.ensure(__DEC_outFlow_default_437961 != null);
							// check isomorphic binding between objects __DEC_outFlow_default_437961 and exclusiveGateway 
							JavaSDM.ensure(!__DEC_outFlow_default_437961
									.equals(exclusiveGateway));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_360103
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_360103 = new ArrayList(
							exclusiveGateway.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_360103
									.hasNext()) {
						try {
							__DEC_exclusiveGateway_targetRef_360103 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_360103
									.next();

							// check object __DEC_exclusiveGateway_targetRef_360103 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_360103 != null);
							// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_360103 and inFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_360103
									.equals(inFlow));

							// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_360103 and outFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_360103
									.equals(outFlow));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_targetRef is really bound
				JavaSDM.ensure(_edge_targetRef != null);
				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// check link default from exclusiveGateway to outFlow
				JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

				// check link flowElements from exclusiveGateway to process
				JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

				// check link flowElements from inFlow to process
				JavaSDM.ensure(process.equals(inFlow.eContainer()));

				// check link flowElements from outFlow to process
				JavaSDM.ensure(process.equals(outFlow.eContainer()));

				// check link sourceRef from outFlow to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

				// check link src from _edge_targetRef to inFlow
				JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

				// check link targetRef from inFlow to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

				// check link targetRef from outFlow to exclusiveGateway
				JavaSDM.ensure(!(exclusiveGateway.equals(outFlow.getTargetRef())));

				// check link trg from _edge_targetRef to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(_edge_targetRef.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, inFlow,
						process, exclusiveGateway, outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_535(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_321952 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_890661 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_224869 = null;
		ExclusiveGateway __DEC_outFlow_default_224869 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_361987 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_361987 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Process process = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link src from inFlow to _edge_targetRef
			fujaba__Success = false;

			fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterInFlowTo_edge_targetRef.hasNext()) {
				try {
					_edge_targetRef = (EMoflonEdge) fujaba__IterInFlowTo_edge_targetRef
							.next();

					// check object _edge_targetRef is really bound
					JavaSDM.ensure(_edge_targetRef != null);
					// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
					JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

					// check link trg from _edge_targetRef to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(_edge_targetRef
							.getTrg()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_321952 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_321952 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_321952 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_321952
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_321952 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_321952
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_890661 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_890661 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_890661 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_890661
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_890661 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_890661
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_224869
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_224869 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_224869
											.hasNext()) {
								try {
									__DEC_outFlow_default_224869 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_224869
											.next();

									// check object __DEC_outFlow_default_224869 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_224869 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_224869 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_224869
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_361987
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_361987 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_361987
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_361987 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_361987
											.next();

									// check object __DEC_exclusiveGateway_targetRef_361987 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_361987 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_361987 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_361987
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_361987 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_361987
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_incoming is really bound
						JavaSDM.ensure(_edge_incoming != null);
						// check object _edge_targetRef is really bound
						JavaSDM.ensure(_edge_targetRef != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
						JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_incoming to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_incoming
								.getSrc()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_incoming to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_incoming.getTrg()));

						// check link trg from _edge_targetRef to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_targetRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_536(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_724790 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_156823 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_255874 = null;
		ExclusiveGateway __DEC_outFlow_default_255874 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_294275 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_294275 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_sourceRef is really bound
			JavaSDM.ensure(_edge_sourceRef != null);
			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof Process ? (Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link src from _edge_sourceRef to outFlow
			JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

			// iterate to-many link targetRef from exclusiveGateway to inFlow
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
					exclusiveGateway.getIncoming()).iterator();

			while (fujaba__IterExclusiveGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_724790 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_724790 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_724790 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_724790
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_724790 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_724790
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_156823 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_156823 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_156823 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_156823
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_156823 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_156823
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_255874
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_255874 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_255874
											.hasNext()) {
								try {
									__DEC_outFlow_default_255874 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_255874
											.next();

									// check object __DEC_outFlow_default_255874 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_255874 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_255874 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_255874
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_294275
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_294275 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_294275
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_294275 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_294275
											.next();

									// check object __DEC_exclusiveGateway_targetRef_294275 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_294275 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_294275 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_294275
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_294275 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_294275
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_sourceRef is really bound
						JavaSDM.ensure(_edge_sourceRef != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_sourceRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_sourceRef to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_537(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_211619 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_58028 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_751587 = null;
		ExclusiveGateway __DEC_outFlow_default_751587 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_454005 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_454005 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof Process ? (Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link trg from _edge_outgoing to outFlow
			JavaSDM.ensure(outFlow.equals(_edge_outgoing.getTrg()));

			// iterate to-many link targetRef from exclusiveGateway to inFlow
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
					exclusiveGateway.getIncoming()).iterator();

			while (fujaba__IterExclusiveGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// iterate to-many link trg from exclusiveGateway to _edge_sourceRef
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayTo_edge_sourceRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(exclusiveGateway,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterExclusiveGatewayTo_edge_sourceRef
							.hasNext()) {
						try {
							_edge_sourceRef = (EMoflonEdge) fujaba__IterExclusiveGatewayTo_edge_sourceRef
									.next();

							// check object _edge_sourceRef is really bound
							JavaSDM.ensure(_edge_sourceRef != null);
							// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
							JavaSDM.ensure(!_edge_sourceRef
									.equals(_edge_outgoing));

							// check link src from _edge_sourceRef to outFlow
							JavaSDM.ensure(outFlow.equals(_edge_sourceRef
									.getSrc()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exclusiveGateway_flowElements_211619 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_211619 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_211619 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_211619
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_211619 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_211619
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_58028 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_58028 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_58028 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_58028
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_58028 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_58028
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link flowNodeRefs from exclusiveGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(exclusiveGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link default from outFlow to __DEC_outFlow_default_751587
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_751587 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_751587
													.hasNext()) {
										try {
											__DEC_outFlow_default_751587 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_751587
													.next();

											// check object __DEC_outFlow_default_751587 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_751587 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_751587 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_751587
													.equals(exclusiveGateway));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_454005
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_454005 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_454005
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_454005 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_454005
													.next();

											// check object __DEC_exclusiveGateway_targetRef_454005 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_454005 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_454005 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_454005
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_454005 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_454005
													.equals(outFlow));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_outgoing is really bound
								JavaSDM.ensure(_edge_outgoing != null);
								// check object _edge_sourceRef is really bound
								JavaSDM.ensure(_edge_sourceRef != null);
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
								JavaSDM.ensure(!_edge_sourceRef
										.equals(_edge_outgoing));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(outFlow.equals(exclusiveGateway
										.getDefault()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link sourceRef from outFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_outgoing to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_outgoing.getSrc()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_outgoing to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_outgoing
										.getTrg()));

								// check link trg from _edge_sourceRef to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_sourceRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										inFlow, process, exclusiveGateway,
										outFlow);
								if (fujaba__Success) {
									// statement node ''
									fujaba__Success = this
											.checkTypes_FWD(match);
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
													.addOppositeReference(
															match,
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

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_538(
			EMoflonEdge _edge_default) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_2397 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_932603 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_919943 = null;
		ExclusiveGateway __DEC_outFlow_default_919943 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_618019 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_618019 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_default is really bound
			JavaSDM.ensure(_edge_default != null);
			// bind object
			_TmpObject = _edge_default.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof Process ? (Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link trg from _edge_default to outFlow
			JavaSDM.ensure(outFlow.equals(_edge_default.getTrg()));

			// iterate to-many link targetRef from exclusiveGateway to inFlow
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
					exclusiveGateway.getIncoming()).iterator();

			while (fujaba__IterExclusiveGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_2397 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_2397 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_2397 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_2397
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_2397 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_2397
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_932603 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_932603 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_932603 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_932603
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_932603 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_932603
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_919943
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_919943 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_919943
											.hasNext()) {
								try {
									__DEC_outFlow_default_919943 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_919943
											.next();

									// check object __DEC_outFlow_default_919943 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_919943 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_919943 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_919943
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_618019
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_618019 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_618019
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_618019 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_618019
											.next();

									// check object __DEC_exclusiveGateway_targetRef_618019 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_618019 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_618019 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_618019
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_618019 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_618019
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_default is really bound
						JavaSDM.ensure(_edge_default != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_default to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_default
								.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_default to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_default.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match, inFlow,
								process, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_224(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_133752 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_310007 = null;
		Step __DEC_normalStep_next_310007 = null;
		Match match = null;
		Iterator fujaba__IterNormalStepToPrevStep = null;
		Step prevStep = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Flow flow = null;

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

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// check link steps from normalStep to flow
			JavaSDM.ensure(flow.equals(normalStep.eContainer()));

			// iterate to-many link next from normalStep to prevStep
			fujaba__Success = false;

			fujaba__IterNormalStepToPrevStep = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							normalStep, Step.class, "next")).iterator();

			while (fujaba__IterNormalStepToPrevStep.hasNext()) {
				try {
					prevStep = (Step) fujaba__IterNormalStepToPrevStep.next();

					// check object prevStep is really bound
					JavaSDM.ensure(prevStep != null);
					// check isomorphic binding between objects prevStep and normalStep 
					JavaSDM.ensure(!prevStep.equals(normalStep));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_normalStep_steps_133752 = normalStep
									.eContainer() instanceof Flow ? (Flow) normalStep
									.eContainer() : null;

							// check object __DEC_normalStep_steps_133752 is really bound
							JavaSDM.ensure(__DEC_normalStep_steps_133752 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_normalStep_steps_133752
									.getSteps().contains(normalStep));

							// check isomorphic binding between objects __DEC_normalStep_steps_133752 and flow 
							JavaSDM.ensure(!__DEC_normalStep_steps_133752
									.equals(flow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link next from normalStep to __DEC_normalStep_next_310007
							fujaba__Success = false;

							fujaba__IterNormalStepTo__DEC_normalStep_next_310007 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(normalStep,
													Step.class, "next"))
									.iterator();

							while (!(fujaba__Success)
									&& fujaba__IterNormalStepTo__DEC_normalStep_next_310007
											.hasNext()) {
								try {
									__DEC_normalStep_next_310007 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_310007
											.next();

									// check object __DEC_normalStep_next_310007 is really bound
									JavaSDM.ensure(__DEC_normalStep_next_310007 != null);
									// check isomorphic binding between objects __DEC_normalStep_next_310007 and normalStep 
									JavaSDM.ensure(!__DEC_normalStep_next_310007
											.equals(normalStep));

									// check isomorphic binding between objects __DEC_normalStep_next_310007 and prevStep 
									JavaSDM.ensure(!__DEC_normalStep_next_310007
											.equals(prevStep));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check link next from normalStep to normalStep
						JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(normalStep,
										NormalStep.class, "next")
								.contains(normalStep)));

						// check object _edge_steps is really bound
						JavaSDM.ensure(_edge_steps != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object normalStep is really bound
						JavaSDM.ensure(normalStep != null);
						// check object prevStep is really bound
						JavaSDM.ensure(prevStep != null);
						// check isomorphic binding between objects prevStep and normalStep 
						JavaSDM.ensure(!prevStep.equals(normalStep));

						// check link actor from normalStep to actor
						JavaSDM.ensure(actor.equals(normalStep.getActor()));

						// check link next from prevStep to normalStep
						JavaSDM.ensure(normalStep.equals(prevStep.getNext()));

						// check link src from _edge_steps to flow
						JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

						// check link steps from normalStep to flow
						JavaSDM.ensure(flow.equals(normalStep.eContainer()));

						// check link trg from _edge_steps to normalStep
						JavaSDM.ensure(normalStep.equals(_edge_steps.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								prevStep, normalStep, flow, actor);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
			SequenceFlowToStep inFlowToPrevStepDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		ExclusiveGateway exclusiveGateway = null;
		NormalStep normalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		SequenceFlow outFlow = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Step prevStep = null;
		Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterInFlowToPrevStepListToInFlowToPrevStep = null;
		SequenceFlowToStep inFlowToPrevStep = null;
		Iterator fujaba__IterRuleEntryContainerToInFlowToPrevStepList = null;
		RuleEntryList inFlowToPrevStepList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to inFlowToPrevStepList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToInFlowToPrevStepList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToInFlowToPrevStepList
					.hasNext()) {
				try {
					inFlowToPrevStepList = (RuleEntryList) fujaba__IterRuleEntryContainerToInFlowToPrevStepList
							.next();

					// check object inFlowToPrevStepList is really bound
					JavaSDM.ensure(inFlowToPrevStepList != null);
					// iterate to-many link entryObjects from inFlowToPrevStepList to inFlowToPrevStep
					fujaba__Success = false;

					fujaba__IterInFlowToPrevStepListToInFlowToPrevStep = new ArrayList(
							inFlowToPrevStepList.getEntryObjects()).iterator();

					while (fujaba__IterInFlowToPrevStepListToInFlowToPrevStep
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterInFlowToPrevStepListToInFlowToPrevStep
									.next();

							// ensure correct type and really bound of object inFlowToPrevStep
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
							inFlowToPrevStep = (SequenceFlowToStep) _TmpObject;
							// bind object
							inFlow = inFlowToPrevStep.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// bind object
							_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof Process);
							process = (Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									inFlow));

							// bind object
							prevStep = inFlowToPrevStep.getTarget();

							// check object prevStep is really bound
							JavaSDM.ensure(prevStep != null);

							// iterate to-many link source from inFlow to inFlowToFlow
							fujaba__Success = false;

							fujaba__IterInFlowToInFlowToFlow = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(inFlow,
													SequenceFlowToUCFlow.class,
													"source")).iterator();

							while (fujaba__IterInFlowToInFlowToFlow.hasNext()) {
								try {
									inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
											.next();

									// check object inFlowToFlow is really bound
									JavaSDM.ensure(inFlowToFlow != null);
									// bind object
									flow = inFlowToFlow.getTarget();

									// check object flow is really bound
									JavaSDM.ensure(flow != null);

									// iterate to-many link source from process to processToActor
									fujaba__Success = false;

									fujaba__IterProcessToProcessToActor = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															process,
															ProcessToActor.class,
															"source"))
											.iterator();

									while (fujaba__IterProcessToProcessToActor
											.hasNext()) {
										try {
											processToActor = (ProcessToActor) fujaba__IterProcessToProcessToActor
													.next();

											// check object processToActor is really bound
											JavaSDM.ensure(processToActor != null);
											// bind object
											actor = processToActor.getTarget();

											// check object actor is really bound
											JavaSDM.ensure(actor != null);

											// story node 'solve CSP'
											try {
												fujaba__Success = false;

												_TmpObject = (this
														.generateModel_solveCsp_BWD(
																isApplicableMatch,
																inFlow,
																prevStep,
																inFlowToPrevStep,
																normalStep,
																outFlowToFlow,
																inFlowToFlow,
																process,
																exclusiveGateway,
																outFlow,
																exclusiveGatewayToNormalStep,
																outFlowToNormalStep,
																flow, actor,
																processToActor,
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

													// check object actor is really bound
													JavaSDM.ensure(actor != null);
													// check object flow is really bound
													JavaSDM.ensure(flow != null);
													// check object inFlow is really bound
													JavaSDM.ensure(inFlow != null);
													// check object inFlowToFlow is really bound
													JavaSDM.ensure(inFlowToFlow != null);
													// check object inFlowToPrevStep is really bound
													JavaSDM.ensure(inFlowToPrevStep != null);
													// check object prevStep is really bound
													JavaSDM.ensure(prevStep != null);
													// check object process is really bound
													JavaSDM.ensure(process != null);
													// check object processToActor is really bound
													JavaSDM.ensure(processToActor != null);
													// check object ruleResult is really bound
													JavaSDM.ensure(ruleResult != null);
													// create object exclusiveGateway
													exclusiveGateway = Bpmn2Factory.eINSTANCE
															.createExclusiveGateway();

													// create object normalStep
													normalStep = UseCaseDSLFactory.eINSTANCE
															.createNormalStep();

													// create object exclusiveGatewayToNormalStep
													exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createFlowNodeToStep();

													// create object outFlowToNormalStep
													outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToStep();

													// create object outFlowToFlow
													outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToUCFlow();

													// create object outFlow
													outFlow = Bpmn2Factory.eINSTANCE
															.createSequenceFlow();

													// assign attribute normalStep
													normalStep
															.setName((java.lang.String) csp
																	.getAttributeVariable(
																			"normalStep",
																			"name")
																	.getValue());
													// assign attribute normalStep
													normalStep
															.setLabel((java.lang.String) csp
																	.getAttributeVariable(
																			"normalStep",
																			"label")
																	.getValue());
													// assign attribute exclusiveGateway
													exclusiveGateway
															.setId((java.lang.String) csp
																	.getAttributeVariable(
																			"exclusiveGateway",
																			"id")
																	.getValue());
													// assign attribute exclusiveGateway
													exclusiveGateway
															.setName((java.lang.String) csp
																	.getAttributeVariable(
																			"exclusiveGateway",
																			"name")
																	.getValue());
													// assign attribute exclusiveGateway
													exclusiveGateway
															.setGatewayDirection((bpmn2.GatewayDirection) csp
																	.getAttributeVariable(
																			"exclusiveGateway",
																			"gatewayDirection")
																	.getValue());
													// assign attribute ruleResult
													ruleResult.setSuccess(true);

													// create link
													exclusiveGateway
															.getIncoming().add(
																	inFlow);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	prevStep,
																	normalStep,
																	"next");

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	normalStep,
																	actor,
																	"actor");

													// create link
													exclusiveGatewayToNormalStep
															.setTarget(normalStep);

													// create link
													flow.getSteps().add(
															normalStep);

													// create link
													ruleResult
															.getTargetObjects()
															.add(normalStep);

													// create link
													outFlowToNormalStep
															.setTarget(normalStep);

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	outFlowToFlow,
																	flow,
																	"target");

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	outFlowToFlow,
																	outFlow,
																	"source");

													// create link
													ruleResult.getCorrObjects()
															.add(outFlowToFlow);

													// create link
													process.getFlowElements()
															.add(outFlow); // add link

													// create link
													process.getFlowElements()
															.add(exclusiveGateway); // add link

													// create link
													org.moflon.util.eMoflonEMFUtil
															.addOppositeReference(
																	exclusiveGateway,
																	outFlow,
																	"default");

													// create link
													exclusiveGatewayToNormalStep
															.setSource(exclusiveGateway);

													// create link
													outFlow.setSourceRef(exclusiveGateway);

													// create link
													ruleResult
															.getSourceObjects()
															.add(exclusiveGateway);

													// create link
													ruleResult
															.getSourceObjects()
															.add(outFlow);

													// create link
													outFlowToNormalStep
															.setSource(outFlow);

													// create link
													ruleResult
															.getCorrObjects()
															.add(exclusiveGatewayToNormalStep);

													// create link
													ruleResult
															.getCorrObjects()
															.add(outFlowToNormalStep);

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
			SequenceFlow inFlow, Step prevStep,
			SequenceFlowToStep inFlowToPrevStep, NormalStep normalStep,
			SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep, Flow flow, Actor actor,
			ProcessToActor processToActor, ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);

		// Create constraints
		Eq_modelgenGatewayDirection eq_modelgenGatewayDirection = new Eq_modelgenGatewayDirection();
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgenGatewayDirection);
		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgenGatewayDirection.setRuleName("");
		eq_modelgenGatewayDirection.solve(
				var_exclusiveGateway_gatewayDirection, literal0);
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("inFlowToPrevStep", inFlowToPrevStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
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
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __exclusiveGateway_default_outFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object exclusiveGateway is really bound
			JavaSDM.ensure(exclusiveGateway != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					inFlow, exclusiveGateway, outFlow));

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

				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_default_outFlow
				__exclusiveGateway_default_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");
				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway.setName("targetRef");
				// assign attribute __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow.setName("outgoing");
				// assign attribute __exclusiveGateway_default_outFlow
				__exclusiveGateway_default_outFlow.setName("default");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_default_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "toBeTranslatedNodes");

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

				// create link
				__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_default_outFlow.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__exclusiveGateway_default_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					exclusiveGateway, outFlow);
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
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("outFlow", outFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, Flow flow, Actor actor,
			ProcessToActor processToActor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", true, csp);
		var_exclusiveGateway_id.setValue(exclusiveGateway.getId());
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", true, csp);
		var_exclusiveGateway_name.setValue(exclusiveGateway.getName());

		// Create explicit parameters

		// Create unbound variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor) {
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __normalStep_actor_actor = null;
		EMoflonEdge __flow_steps_normalStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, normalStep,
					flow, actor));

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

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// create object __normalStep_actor_actor
				__normalStep_actor_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __flow_steps_normalStep
				__flow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __normalStep_actor_actor
				__normalStep_actor_actor.setName("actor");
				// assign attribute __flow_steps_normalStep
				__flow_steps_normalStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						normalStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__normalStep_actor_actor, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_normalStep, "toBeTranslatedEdges");

				// create link
				__normalStep_actor_actor.setSrc(normalStep);

				// create link
				__flow_steps_normalStep.setTrg(normalStep);

				// create link
				__flow_steps_normalStep.setSrc(flow);

				// create link
				__normalStep_actor_actor.setTrg(actor);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, normalStep, flow, actor);
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
	public void registerObjectsToMatch_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
		match.registerObject("normalStep", normalStep);
		match.registerObject("flow", flow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep normalStep,
			Flow flow, Actor actor) {
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			NormalStep normalStep, SequenceFlowToUCFlow inFlowToFlow,
			bpmn2.Process process, SequenceFlow inFlow, Flow flow, Actor actor,
			ProcessToActor processToActor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", true, csp);
		var_normalStep_name.setValue(normalStep.getName());
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", true, csp);
		var_normalStep_label.setValue(normalStep.getLabel());

		// Create explicit parameters

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_exclusiveGateway_name, var_normalStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject normalStep, EObject outFlowToFlow, EObject inFlowToFlow,
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject exclusiveGatewayToNormalStep,
			EObject outFlowToNormalStep, EObject flow, EObject actor,
			EObject processToActor) {
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("outFlowToFlow", outFlowToFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_205(
			EMoflonEdge _edge_actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_728404 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_748103 = null;
		Step __DEC_normalStep_next_748103 = null;
		Match match = null;
		Flow flow = null;
		Actor actor = null;
		NormalStep normalStep = null;

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

			// check object _edge_actor is really bound
			JavaSDM.ensure(_edge_actor != null);
			// bind object
			_TmpObject = _edge_actor.getSrc();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// bind object
			flow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
					.eContainer() : null;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);

			// check if contained via correct reference
			JavaSDM.ensure(flow.getSteps().contains(normalStep));

			// check link trg from _edge_actor to actor
			JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_728404 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_728404 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_728404 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_728404.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_728404 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_728404.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_748103
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_748103 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_748103
									.hasNext()) {
						try {
							__DEC_normalStep_next_748103 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_748103
									.next();

							// check object __DEC_normalStep_next_748103 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_748103 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_748103 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_748103
									.equals(normalStep));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_actor is really bound
				JavaSDM.ensure(_edge_actor != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link src from _edge_actor to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_actor.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_actor to actor
				JavaSDM.ensure(actor.equals(_edge_actor.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, normalStep,
						flow, actor);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_483(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_441647 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_965057 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_718749 = null;
		ExclusiveGateway __DEC_outFlow_default_718749 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_536786 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_536786 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Process process = null;

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

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to inFlow
			fujaba__Success = false;

			fujaba__IterProcessToInFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_441647 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_441647 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_441647 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_441647
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_441647 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_441647
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_965057 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_965057 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_965057 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_965057
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_965057 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_965057
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_718749
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_718749 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_718749
											.hasNext()) {
								try {
									__DEC_outFlow_default_718749 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_718749
											.next();

									// check object __DEC_outFlow_default_718749 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_718749 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_718749 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_718749
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_536786
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_536786 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_536786
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_536786 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_536786
											.next();

									// check object __DEC_exclusiveGateway_targetRef_536786 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_536786 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_536786 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_536786
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_536786 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_536786
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flowElements is really bound
						JavaSDM.ensure(_edge_flowElements != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_flowElements to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway
								.equals(_edge_flowElements.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_484(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_709463 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_209420 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_723069 = null;
		ExclusiveGateway __DEC_outFlow_default_723069 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_67016 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_67016 = null;
		Match match = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;

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

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// iterate to-many link flowElements from process to inFlow
			fujaba__Success = false;

			fujaba__IterProcessToInFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// bind object
					_TmpObject = inFlow.getTargetRef();

					// ensure correct type and really bound of object exclusiveGateway
					JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
					exclusiveGateway = (ExclusiveGateway) _TmpObject;

					// check link default from exclusiveGateway to outFlow
					JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

					// check link flowElements from exclusiveGateway to process
					JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
							.getSourceRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_709463 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_709463 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_709463 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_709463
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_709463 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_709463
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_209420 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_209420 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_209420 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_209420
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_209420 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_209420
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_723069
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_723069 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_723069
											.hasNext()) {
								try {
									__DEC_outFlow_default_723069 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_723069
											.next();

									// check object __DEC_outFlow_default_723069 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_723069 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_723069 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_723069
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_67016
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_67016 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_67016
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_67016 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_67016
											.next();

									// check object __DEC_exclusiveGateway_targetRef_67016 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_67016 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_67016 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_67016
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_67016 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_67016
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flowElements is really bound
						JavaSDM.ensure(_edge_flowElements != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_flowElements to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_flowElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_485(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_925570 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_928765 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_12564 = null;
		ExclusiveGateway __DEC_outFlow_default_12564 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677606 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_677606 = null;
		Match match = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow inFlow = null;

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

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof Process ? (Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_exclusiveGateway_flowElements_925570 = exclusiveGateway
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
							.eContainer() : null;

					// check object __DEC_exclusiveGateway_flowElements_925570 is really bound
					JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_925570 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_925570
							.getFlowElements().contains(exclusiveGateway));

					// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_925570 and process 
					JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_925570
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_outFlow_flowElements_928765 = outFlow.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
							.eContainer() : null;

					// check object __DEC_outFlow_flowElements_928765 is really bound
					JavaSDM.ensure(__DEC_outFlow_flowElements_928765 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_outFlow_flowElements_928765
							.getFlowElements().contains(outFlow));

					// check isomorphic binding between objects __DEC_outFlow_flowElements_928765 and process 
					JavaSDM.ensure(!__DEC_outFlow_flowElements_928765
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link flowNodeRefs from exclusiveGateway
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(exclusiveGateway, Lane.class,
								"flowNodeRefs").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link default from outFlow to __DEC_outFlow_default_12564
					fujaba__Success = false;

					fujaba__IterOutFlowTo__DEC_outFlow_default_12564 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(outFlow,
											ExclusiveGateway.class, "default"))
							.iterator();

					while (!(fujaba__Success)
							&& fujaba__IterOutFlowTo__DEC_outFlow_default_12564
									.hasNext()) {
						try {
							__DEC_outFlow_default_12564 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_12564
									.next();

							// check object __DEC_outFlow_default_12564 is really bound
							JavaSDM.ensure(__DEC_outFlow_default_12564 != null);
							// check isomorphic binding between objects __DEC_outFlow_default_12564 and exclusiveGateway 
							JavaSDM.ensure(!__DEC_outFlow_default_12564
									.equals(exclusiveGateway));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_677606
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677606 = new ArrayList(
							exclusiveGateway.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677606
									.hasNext()) {
						try {
							__DEC_exclusiveGateway_targetRef_677606 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677606
									.next();

							// check object __DEC_exclusiveGateway_targetRef_677606 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_677606 != null);
							// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_677606 and inFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_677606
									.equals(inFlow));

							// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_677606 and outFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_677606
									.equals(outFlow));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_targetRef is really bound
				JavaSDM.ensure(_edge_targetRef != null);
				// check object exclusiveGateway is really bound
				JavaSDM.ensure(exclusiveGateway != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object outFlow is really bound
				JavaSDM.ensure(outFlow != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// check link default from exclusiveGateway to outFlow
				JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

				// check link flowElements from exclusiveGateway to process
				JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

				// check link flowElements from inFlow to process
				JavaSDM.ensure(process.equals(inFlow.eContainer()));

				// check link flowElements from outFlow to process
				JavaSDM.ensure(process.equals(outFlow.eContainer()));

				// check link sourceRef from outFlow to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

				// check link src from _edge_targetRef to inFlow
				JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

				// check link targetRef from inFlow to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

				// check link targetRef from outFlow to exclusiveGateway
				JavaSDM.ensure(!(exclusiveGateway.equals(outFlow.getTargetRef())));

				// check link trg from _edge_targetRef to exclusiveGateway
				JavaSDM.ensure(exclusiveGateway.equals(_edge_targetRef.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, process,
						inFlow, exclusiveGateway, outFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_486(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_748933 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_642487 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_781271 = null;
		ExclusiveGateway __DEC_outFlow_default_781271 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_188737 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_188737 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Process process = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link src from inFlow to _edge_targetRef
			fujaba__Success = false;

			fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterInFlowTo_edge_targetRef.hasNext()) {
				try {
					_edge_targetRef = (EMoflonEdge) fujaba__IterInFlowTo_edge_targetRef
							.next();

					// check object _edge_targetRef is really bound
					JavaSDM.ensure(_edge_targetRef != null);
					// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
					JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

					// check link trg from _edge_targetRef to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(_edge_targetRef
							.getTrg()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_748933 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_748933 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_748933 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_748933
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_748933 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_748933
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_642487 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_642487 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_642487 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_642487
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_642487 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_642487
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_781271
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_781271 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_781271
											.hasNext()) {
								try {
									__DEC_outFlow_default_781271 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_781271
											.next();

									// check object __DEC_outFlow_default_781271 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_781271 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_781271 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_781271
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_188737
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_188737 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_188737
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_188737 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_188737
											.next();

									// check object __DEC_exclusiveGateway_targetRef_188737 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_188737 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_188737 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_188737
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_188737 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_188737
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_incoming is really bound
						JavaSDM.ensure(_edge_incoming != null);
						// check object _edge_targetRef is really bound
						JavaSDM.ensure(_edge_targetRef != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
						JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_incoming to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_incoming
								.getSrc()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_incoming to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_incoming.getTrg()));

						// check link trg from _edge_targetRef to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_targetRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_487(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_312768 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_176610 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_676352 = null;
		ExclusiveGateway __DEC_outFlow_default_676352 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_60449 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_60449 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_sourceRef is really bound
			JavaSDM.ensure(_edge_sourceRef != null);
			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_sourceRef.getSrc();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link default from exclusiveGateway to outFlow
			JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

			// bind object
			_TmpObject = outFlow.eContainer() instanceof Process ? (Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to inFlow
			fujaba__Success = false;

			fujaba__IterProcessToInFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_312768 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_312768 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_312768 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_312768
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_312768 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_312768
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_176610 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_176610 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_176610 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_176610
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_176610 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_176610
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_676352
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_676352 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_676352
											.hasNext()) {
								try {
									__DEC_outFlow_default_676352 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_676352
											.next();

									// check object __DEC_outFlow_default_676352 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_676352 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_676352 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_676352
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_60449
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_60449 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_60449
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_60449 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_60449
											.next();

									// check object __DEC_exclusiveGateway_targetRef_60449 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_60449 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_60449 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_60449
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_60449 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_60449
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_sourceRef is really bound
						JavaSDM.ensure(_edge_sourceRef != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_sourceRef to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_sourceRef.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_sourceRef to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_488(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_136314 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_268971 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_308729 = null;
		ExclusiveGateway __DEC_outFlow_default_308729 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_495249 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_495249 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_outgoing is really bound
			JavaSDM.ensure(_edge_outgoing != null);
			// bind object
			_TmpObject = _edge_outgoing.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// check link default from exclusiveGateway to outFlow
			JavaSDM.ensure(outFlow.equals(exclusiveGateway.getDefault()));

			// bind object
			_TmpObject = outFlow.eContainer() instanceof Process ? (Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// iterate to-many link flowElements from process to inFlow
			fujaba__Success = false;

			fujaba__IterProcessToInFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link src from outFlow to _edge_sourceRef
					fujaba__Success = false;

					fujaba__IterOutFlowTo_edge_sourceRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(outFlow,
											EMoflonEdge.class, "src"))
							.iterator();

					while (fujaba__IterOutFlowTo_edge_sourceRef.hasNext()) {
						try {
							_edge_sourceRef = (EMoflonEdge) fujaba__IterOutFlowTo_edge_sourceRef
									.next();

							// check object _edge_sourceRef is really bound
							JavaSDM.ensure(_edge_sourceRef != null);
							// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
							JavaSDM.ensure(!_edge_sourceRef
									.equals(_edge_outgoing));

							// check link trg from _edge_sourceRef to exclusiveGateway
							JavaSDM.ensure(exclusiveGateway
									.equals(_edge_sourceRef.getTrg()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exclusiveGateway_flowElements_136314 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_136314 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_136314 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_136314
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_136314 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_136314
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_outFlow_flowElements_268971 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_268971 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_268971 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_268971
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_268971 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_268971
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link flowNodeRefs from exclusiveGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(exclusiveGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link default from outFlow to __DEC_outFlow_default_308729
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_308729 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_308729
													.hasNext()) {
										try {
											__DEC_outFlow_default_308729 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_308729
													.next();

											// check object __DEC_outFlow_default_308729 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_308729 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_308729 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_308729
													.equals(exclusiveGateway));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_495249
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_495249 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_495249
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_495249 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_495249
													.next();

											// check object __DEC_exclusiveGateway_targetRef_495249 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_495249 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_495249 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_495249
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_495249 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_495249
													.equals(outFlow));

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

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_outgoing is really bound
								JavaSDM.ensure(_edge_outgoing != null);
								// check object _edge_sourceRef is really bound
								JavaSDM.ensure(_edge_sourceRef != null);
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
								JavaSDM.ensure(!_edge_sourceRef
										.equals(_edge_outgoing));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(outFlow.equals(exclusiveGateway
										.getDefault()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link sourceRef from outFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_outgoing to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_outgoing.getSrc()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_outgoing to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_outgoing
										.getTrg()));

								// check link trg from _edge_sourceRef to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_sourceRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, exclusiveGateway,
										outFlow);
								if (fujaba__Success) {
									// statement node ''
									fujaba__Success = this
											.checkTypes_FWD(match);
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
													.addOppositeReference(
															match,
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

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_489(
			EMoflonEdge _edge_default) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_952526 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_857117 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_509397 = null;
		ExclusiveGateway __DEC_outFlow_default_509397 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_398145 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_398145 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;

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

			// check object _edge_default is really bound
			JavaSDM.ensure(_edge_default != null);
			// bind object
			_TmpObject = _edge_default.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			outFlow = exclusiveGateway.getDefault();

			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);

			// bind object
			_TmpObject = exclusiveGateway.eContainer() instanceof Process ? (Process) exclusiveGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exclusiveGateway));

			// check link flowElements from outFlow to process
			JavaSDM.ensure(process.equals(outFlow.eContainer()));

			// check link sourceRef from outFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(outFlow.getSourceRef()));

			// check link trg from _edge_default to outFlow
			JavaSDM.ensure(outFlow.equals(_edge_default.getTrg()));

			// iterate to-many link targetRef from exclusiveGateway to inFlow
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToInFlow = new ArrayList(
					exclusiveGateway.getIncoming()).iterator();

			while (fujaba__IterExclusiveGatewayToInFlow.hasNext()) {
				try {
					inFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToInFlow
							.next();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from inFlow to process
					JavaSDM.ensure(process.equals(inFlow.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_exclusiveGateway_flowElements_952526 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_952526 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_952526 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_952526
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_952526 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_952526
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_outFlow_flowElements_857117 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_857117 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_857117 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_857117
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_857117 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_857117
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from exclusiveGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(exclusiveGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link default from outFlow to __DEC_outFlow_default_509397
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_509397 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_509397
											.hasNext()) {
								try {
									__DEC_outFlow_default_509397 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_509397
											.next();

									// check object __DEC_outFlow_default_509397 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_509397 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_509397 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_509397
											.equals(exclusiveGateway));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_398145
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_398145 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_398145
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_398145 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_398145
											.next();

									// check object __DEC_exclusiveGateway_targetRef_398145 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_398145 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_398145 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_398145
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_398145 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_398145
											.equals(outFlow));

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

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_default is really bound
						JavaSDM.ensure(_edge_default != null);
						// check object exclusiveGateway is really bound
						JavaSDM.ensure(exclusiveGateway != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object outFlow is really bound
						JavaSDM.ensure(outFlow != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects outFlow and inFlow 
						JavaSDM.ensure(!outFlow.equals(inFlow));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(outFlow.equals(exclusiveGateway
								.getDefault()));

						// check link flowElements from exclusiveGateway to process
						JavaSDM.ensure(process.equals(exclusiveGateway
								.eContainer()));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from outFlow to process
						JavaSDM.ensure(process.equals(outFlow.eContainer()));

						// check link sourceRef from outFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(outFlow
								.getSourceRef()));

						// check link src from _edge_default to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(_edge_default
								.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

						// check link trg from _edge_default to outFlow
						JavaSDM.ensure(outFlow.equals(_edge_default.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, exclusiveGateway, outFlow);
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
			}
			JavaSDM.ensure(fujaba__Success);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_206(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_normalStep_steps_880094 = null;
		Iterator fujaba__IterNormalStepTo__DEC_normalStep_next_69015 = null;
		Step __DEC_normalStep_next_69015 = null;
		Match match = null;
		Actor actor = null;
		NormalStep normalStep = null;
		Flow flow = null;

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

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;

			// bind object
			actor = normalStep.getActor();

			// check object actor is really bound
			JavaSDM.ensure(actor != null);

			// check link steps from normalStep to flow
			JavaSDM.ensure(flow.equals(normalStep.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_normalStep_steps_880094 = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
							.eContainer() : null;

					// check object __DEC_normalStep_steps_880094 is really bound
					JavaSDM.ensure(__DEC_normalStep_steps_880094 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_normalStep_steps_880094.getSteps()
							.contains(normalStep));

					// check isomorphic binding between objects __DEC_normalStep_steps_880094 and flow 
					JavaSDM.ensure(!__DEC_normalStep_steps_880094.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from normalStep to __DEC_normalStep_next_69015
					fujaba__Success = false;

					fujaba__IterNormalStepTo__DEC_normalStep_next_69015 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(normalStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterNormalStepTo__DEC_normalStep_next_69015
									.hasNext()) {
						try {
							__DEC_normalStep_next_69015 = (Step) fujaba__IterNormalStepTo__DEC_normalStep_next_69015
									.next();

							// check object __DEC_normalStep_next_69015 is really bound
							JavaSDM.ensure(__DEC_normalStep_next_69015 != null);
							// check isomorphic binding between objects __DEC_normalStep_next_69015 and normalStep 
							JavaSDM.ensure(!__DEC_normalStep_next_69015
									.equals(normalStep));

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

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check link next from normalStep to normalStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(normalStep, NormalStep.class,
								"next").contains(normalStep)));

				// check object _edge_steps is really bound
				JavaSDM.ensure(_edge_steps != null);
				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object normalStep is really bound
				JavaSDM.ensure(normalStep != null);
				// check link actor from normalStep to actor
				JavaSDM.ensure(actor.equals(normalStep.getActor()));

				// check link src from _edge_steps to flow
				JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

				// check link steps from normalStep to flow
				JavaSDM.ensure(flow.equals(normalStep.eContainer()));

				// check link trg from _edge_steps to normalStep
				JavaSDM.ensure(normalStep.equals(_edge_steps.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, normalStep,
						flow, actor);
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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		NormalStep normalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToUCFlow outFlowToFlow = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Actor actor = null;
		Iterator fujaba__IterProcessToProcessToActor = null;
		ProcessToActor processToActor = null;
		Flow flow = null;
		Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterInFlowToFlowListToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterRuleEntryContainerToInFlowToFlowList = null;
		RuleEntryList inFlowToFlowList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to inFlowToFlowList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToInFlowToFlowList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToInFlowToFlowList.hasNext()) {
				try {
					inFlowToFlowList = (RuleEntryList) fujaba__IterRuleEntryContainerToInFlowToFlowList
							.next();

					// check object inFlowToFlowList is really bound
					JavaSDM.ensure(inFlowToFlowList != null);
					// iterate to-many link entryObjects from inFlowToFlowList to inFlowToFlow
					fujaba__Success = false;

					fujaba__IterInFlowToFlowListToInFlowToFlow = new ArrayList(
							inFlowToFlowList.getEntryObjects()).iterator();

					while (fujaba__IterInFlowToFlowListToInFlowToFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterInFlowToFlowListToInFlowToFlow
									.next();

							// ensure correct type and really bound of object inFlowToFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
							inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
							// bind object
							inFlow = inFlowToFlow.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// bind object
							_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof Process);
							process = (Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									inFlow));

							// bind object
							flow = inFlowToFlow.getTarget();

							// check object flow is really bound
							JavaSDM.ensure(flow != null);

							// iterate to-many link source from process to processToActor
							fujaba__Success = false;

							fujaba__IterProcessToProcessToActor = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(process,
													ProcessToActor.class,
													"source")).iterator();

							while (fujaba__IterProcessToProcessToActor
									.hasNext()) {
								try {
									processToActor = (ProcessToActor) fujaba__IterProcessToProcessToActor
											.next();

									// check object processToActor is really bound
									JavaSDM.ensure(processToActor != null);
									// bind object
									actor = processToActor.getTarget();

									// check object actor is really bound
									JavaSDM.ensure(actor != null);

									// story node 'solve CSP'
									try {
										fujaba__Success = false;

										_TmpObject = (this
												.generateModel_solveCsp_BWD(
														isApplicableMatch,
														normalStep,
														outFlowToFlow,
														inFlowToFlow,
														process,
														inFlow,
														exclusiveGateway,
														outFlow,
														exclusiveGatewayToNormalStep,
														outFlowToNormalStep,
														flow, actor,
														processToActor,
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

											// check object actor is really bound
											JavaSDM.ensure(actor != null);
											// check object flow is really bound
											JavaSDM.ensure(flow != null);
											// check object inFlow is really bound
											JavaSDM.ensure(inFlow != null);
											// check object inFlowToFlow is really bound
											JavaSDM.ensure(inFlowToFlow != null);
											// check object process is really bound
											JavaSDM.ensure(process != null);
											// check object processToActor is really bound
											JavaSDM.ensure(processToActor != null);
											// check object ruleResult is really bound
											JavaSDM.ensure(ruleResult != null);
											// create object normalStep
											normalStep = UseCaseDSLFactory.eINSTANCE
													.createNormalStep();

											// create object outFlowToNormalStep
											outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
													.createSequenceFlowToStep();

											// create object exclusiveGatewayToNormalStep
											exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
													.createFlowNodeToStep();

											// create object outFlowToFlow
											outFlowToFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
													.createSequenceFlowToUCFlow();

											// create object outFlow
											outFlow = Bpmn2Factory.eINSTANCE
													.createSequenceFlow();

											// create object exclusiveGateway
											exclusiveGateway = Bpmn2Factory.eINSTANCE
													.createExclusiveGateway();

											// assign attribute normalStep
											normalStep
													.setName((java.lang.String) csp
															.getAttributeVariable(
																	"normalStep",
																	"name")
															.getValue());
											// assign attribute normalStep
											normalStep
													.setLabel((java.lang.String) csp
															.getAttributeVariable(
																	"normalStep",
																	"label")
															.getValue());
											// assign attribute exclusiveGateway
											exclusiveGateway
													.setId((java.lang.String) csp
															.getAttributeVariable(
																	"exclusiveGateway",
																	"id")
															.getValue());
											// assign attribute exclusiveGateway
											exclusiveGateway
													.setName((java.lang.String) csp
															.getAttributeVariable(
																	"exclusiveGateway",
																	"name")
															.getValue());
											// assign attribute exclusiveGateway
											exclusiveGateway
													.setGatewayDirection((bpmn2.GatewayDirection) csp
															.getAttributeVariable(
																	"exclusiveGateway",
																	"gatewayDirection")
															.getValue());
											// assign attribute ruleResult
											ruleResult.setSuccess(true);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															normalStep, actor,
															"actor");

											// create link
											outFlowToNormalStep
													.setTarget(normalStep);

											// create link
											flow.getSteps().add(normalStep);

											// create link
											ruleResult.getTargetObjects().add(
													normalStep);

											// create link
											exclusiveGatewayToNormalStep
													.setTarget(normalStep);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															outFlowToFlow,
															flow, "target");

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															outFlowToFlow,
															outFlow, "source");

											// create link
											ruleResult.getCorrObjects().add(
													outFlowToFlow);

											// create link
											process.getFlowElements().add(
													exclusiveGateway); // add link

											// create link
											process.getFlowElements().add(
													outFlow); // add link

											// create link
											exclusiveGateway.getIncoming().add(
													inFlow);

											// create link
											org.moflon.util.eMoflonEMFUtil
													.addOppositeReference(
															exclusiveGateway,
															outFlow, "default");

											// create link
											exclusiveGatewayToNormalStep
													.setSource(exclusiveGateway);

											// create link
											outFlow.setSourceRef(exclusiveGateway);

											// create link
											ruleResult.getSourceObjects().add(
													exclusiveGateway);

											// create link
											ruleResult.getSourceObjects().add(
													outFlow);

											// create link
											outFlowToNormalStep
													.setSource(outFlow);

											// create link
											ruleResult
													.getCorrObjects()
													.add(exclusiveGatewayToNormalStep);

											// create link
											ruleResult.getCorrObjects().add(
													outFlowToNormalStep);

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
			NormalStep normalStep, SequenceFlowToUCFlow outFlowToFlow,
			SequenceFlowToUCFlow inFlowToFlow, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow outFlow, FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlowToStep outFlowToNormalStep, Flow flow, Actor actor,
			ProcessToActor processToActor, ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_exclusiveGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.id", csp);
		Variable var_normalStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.name", csp);
		Variable var_exclusiveGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.name", csp);
		Variable var_normalStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("normalStep.label", csp);
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);

		// Create constraints
		Eq_modelgenGatewayDirection eq_modelgenGatewayDirection = new Eq_modelgenGatewayDirection();
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgenGatewayDirection);
		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgenGatewayDirection.setRuleName("");
		eq_modelgenGatewayDirection.solve(
				var_exclusiveGateway_gatewayDirection, literal0);
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_exclusiveGateway_id, var_normalStep_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_exclusiveGateway_name, var_normalStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("processToActor", processToActor);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ExclusiveGatewayToStepCoreRule.class) {
			switch (baseOperationID) {
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_205__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_205__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_483__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_483__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_484__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_484__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_485__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_485__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_486__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_486__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_487__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_487__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_488__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_488__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_489__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_489__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_206__EMOFLONEDGE:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_206__EMOFLONEDGE;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT;
			case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SequenceFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(SequenceFlowToUCFlow) arguments.get(4),
					(bpmn2.Process) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Flow) arguments.get(8),
					(Actor) arguments.get(9),
					(ProcessToActor) arguments.get(10));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (NormalStep) arguments.get(2),
					(Flow) arguments.get(3), (Actor) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_FLOW_ACTOR_PROCESSTOACTOR:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(bpmn2.Process) arguments.get(6), (Flow) arguments.get(7),
					(Actor) arguments.get(8), (ProcessToActor) arguments.get(9));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_222__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_222((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_223__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_223((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_532__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_532((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_533__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_533((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_534__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_534((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_535__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_535((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_536__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_536((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_537__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_537((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_538__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_538((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_224__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_224((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToStep) arguments.get(1));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlow) arguments.get(1), (Step) arguments.get(2),
					(SequenceFlowToStep) arguments.get(3),
					(NormalStep) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(bpmn2.Process) arguments.get(7),
					(ExclusiveGateway) arguments.get(8),
					(SequenceFlow) arguments.get(9),
					(FlowNodeToStep) arguments.get(10),
					(SequenceFlowToStep) arguments.get(11),
					(Flow) arguments.get(12), (Actor) arguments.get(13),
					(ProcessToActor) arguments.get(14),
					(ModelgeneratorRuleResult) arguments.get(15));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Flow) arguments.get(6),
					(Actor) arguments.get(7), (ProcessToActor) arguments.get(8));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(Actor) arguments.get(3));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_FLOW_ACTOR_PROCESSTOACTOR:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(NormalStep) arguments.get(1),
					(SequenceFlowToUCFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5),
					(Actor) arguments.get(6), (ProcessToActor) arguments.get(7));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_205__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_205((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_483__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_483((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_484__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_484((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_485__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_485((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_486__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_486((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_487__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_487((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_488__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_488((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_489__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_489((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_206__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_206((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.EXCLUSIVE_GATEWAY_TO_STEP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOUCFLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOSTEP_FLOW_ACTOR_PROCESSTOACTOR_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(NormalStep) arguments.get(1),
					(SequenceFlowToUCFlow) arguments.get(2),
					(SequenceFlowToUCFlow) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7),
					(FlowNodeToStep) arguments.get(8),
					(SequenceFlowToStep) arguments.get(9),
					(Flow) arguments.get(10), (Actor) arguments.get(11),
					(ProcessToActor) arguments.get(12),
					(ModelgeneratorRuleResult) arguments.get(13));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExclusiveGatewayToStepRuleImpl
