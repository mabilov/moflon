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

import BpmnToUseCaseIntegration.Rules.ExclusiveConvergingGatewayRule;
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

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Converging Gateway Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExclusiveConvergingGatewayRuleImpl extends AbstractRuleImpl
		implements ExclusiveConvergingGatewayRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveConvergingGatewayRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExclusiveConvergingGatewayRule();
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
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
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

				// create object __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");
				// assign attribute __inFlow_targetRef_exclusiveGateway
				__inFlow_targetRef_exclusiveGateway.setName("targetRef");
				// assign attribute __exclusiveGateway_incoming_inFlow
				__exclusiveGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exclusiveGateway
				__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
				// assign attribute __exclusiveGateway_outgoing_outFlow
				__exclusiveGateway_outgoing_outFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

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
						__outFlow_sourceRef_exclusiveGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_outgoing_outFlow,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

				// create link
				__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

				// create link
				__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

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
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

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
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		AlternativeFlowAlternative alt = null;
		ExclusiveGateway exclusiveGateway = null;
		AlternativeFlow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		SequenceFlowToStep inFlowToStep = null;
		Flow initFlow = null;
		NormalStep normalStep = null;
		SequenceFlow outFlow = null;
		Process process = null;
		Step step = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge exclusiveGatewayToNormalStep__target__normalStep = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge outFlowToInitFlow__source__outFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge exclusiveGatewayToNormalStep__source__exclusiveGateway = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge outFlowToInitFlow__target__initFlow = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
			flow = (AlternativeFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToStep"));

			// ensure correct type and really bound of object inFlowToStep
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToStep);
			inFlowToStep = (SequenceFlowToStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("initFlow"));

			// ensure correct type and really bound of object initFlow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			initFlow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("normalStep"));

			// ensure correct type and really bound of object normalStep
			JavaSDM.ensure(_TmpObject instanceof NormalStep);
			normalStep = (NormalStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("outFlow"));

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("step"));

			// ensure correct type and really bound of object step
			JavaSDM.ensure(_TmpObject instanceof Step);
			step = (Step) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects step and normalStep 
			JavaSDM.ensure(!step.equals(normalStep));

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
			// create object exclusiveGatewayToNormalStep
			exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToInitFlow
			outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create link
			exclusiveGatewayToNormalStep.setSource(exclusiveGateway);

			// create link
			outFlowToInitFlow.setSource(outFlow);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			exclusiveGatewayToNormalStep.setTarget(normalStep);

			// create link
			outFlowToInitFlow.setTarget(initFlow);

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
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep, "createdLinkElements");

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

			// check object alt is really bound
			JavaSDM.ensure(alt != null);
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
			// check object inFlowToStep is really bound
			JavaSDM.ensure(inFlowToStep != null);
			// check object initFlow is really bound
			JavaSDM.ensure(initFlow != null);
			// check object normalStep is really bound
			JavaSDM.ensure(normalStep != null);
			// check object outFlow is really bound
			JavaSDM.ensure(outFlow != null);
			// check object outFlowToInitFlow is really bound
			JavaSDM.ensure(outFlowToInitFlow != null);
			// check object outFlowToNormalStep is really bound
			JavaSDM.ensure(outFlowToNormalStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object step is really bound
			JavaSDM.ensure(step != null);
			// check isomorphic binding between objects exclusiveGateway and alt 
			JavaSDM.ensure(!exclusiveGateway.equals(alt));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and alt 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(alt));

			// check isomorphic binding between objects flow and alt 
			JavaSDM.ensure(!flow.equals(alt));

			// check isomorphic binding between objects inFlow and alt 
			JavaSDM.ensure(!inFlow.equals(alt));

			// check isomorphic binding between objects inFlowToFlow and alt 
			JavaSDM.ensure(!inFlowToFlow.equals(alt));

			// check isomorphic binding between objects inFlowToStep and alt 
			JavaSDM.ensure(!inFlowToStep.equals(alt));

			// check isomorphic binding between objects initFlow and alt 
			JavaSDM.ensure(!initFlow.equals(alt));

			// check isomorphic binding between objects normalStep and alt 
			JavaSDM.ensure(!normalStep.equals(alt));

			// check isomorphic binding between objects outFlow and alt 
			JavaSDM.ensure(!outFlow.equals(alt));

			// check isomorphic binding between objects outFlowToInitFlow and alt 
			JavaSDM.ensure(!outFlowToInitFlow.equals(alt));

			// check isomorphic binding between objects outFlowToNormalStep and alt 
			JavaSDM.ensure(!outFlowToNormalStep.equals(alt));

			// check isomorphic binding between objects process and alt 
			JavaSDM.ensure(!process.equals(alt));

			// check isomorphic binding between objects step and alt 
			JavaSDM.ensure(!step.equals(alt));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGateway 
			JavaSDM.ensure(!flow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects inFlowToStep and exclusiveGateway 
			JavaSDM.ensure(!inFlowToStep.equals(exclusiveGateway));

			// check isomorphic binding between objects initFlow and exclusiveGateway 
			JavaSDM.ensure(!initFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects normalStep and exclusiveGateway 
			JavaSDM.ensure(!normalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToInitFlow and exclusiveGateway 
			JavaSDM.ensure(!outFlowToInitFlow.equals(exclusiveGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exclusiveGateway));

			// check isomorphic binding between objects process and exclusiveGateway 
			JavaSDM.ensure(!process.equals(exclusiveGateway));

			// check isomorphic binding between objects step and exclusiveGateway 
			JavaSDM.ensure(!step.equals(exclusiveGateway));

			// check isomorphic binding between objects flow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects initFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!initFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToInitFlow and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToInitFlow
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep
					.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects process and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects step and exclusiveGatewayToNormalStep 
			JavaSDM.ensure(!step.equals(exclusiveGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects inFlowToStep and flow 
			JavaSDM.ensure(!inFlowToStep.equals(flow));

			// check isomorphic binding between objects initFlow and flow 
			JavaSDM.ensure(!initFlow.equals(flow));

			// check isomorphic binding between objects normalStep and flow 
			JavaSDM.ensure(!normalStep.equals(flow));

			// check isomorphic binding between objects outFlow and flow 
			JavaSDM.ensure(!outFlow.equals(flow));

			// check isomorphic binding between objects outFlowToInitFlow and flow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(flow));

			// check isomorphic binding between objects outFlowToNormalStep and flow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects step and flow 
			JavaSDM.ensure(!step.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects inFlowToStep and inFlow 
			JavaSDM.ensure(!inFlowToStep.equals(inFlow));

			// check isomorphic binding between objects initFlow and inFlow 
			JavaSDM.ensure(!initFlow.equals(inFlow));

			// check isomorphic binding between objects normalStep and inFlow 
			JavaSDM.ensure(!normalStep.equals(inFlow));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects step and inFlow 
			JavaSDM.ensure(!step.equals(inFlow));

			// check isomorphic binding between objects inFlowToStep and inFlowToFlow 
			JavaSDM.ensure(!inFlowToStep.equals(inFlowToFlow));

			// check isomorphic binding between objects initFlow and inFlowToFlow 
			JavaSDM.ensure(!initFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects normalStep and inFlowToFlow 
			JavaSDM.ensure(!normalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToFlow));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects step and inFlowToFlow 
			JavaSDM.ensure(!step.equals(inFlowToFlow));

			// check isomorphic binding between objects initFlow and inFlowToStep 
			JavaSDM.ensure(!initFlow.equals(inFlowToStep));

			// check isomorphic binding between objects normalStep and inFlowToStep 
			JavaSDM.ensure(!normalStep.equals(inFlowToStep));

			// check isomorphic binding between objects outFlow and inFlowToStep 
			JavaSDM.ensure(!outFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToInitFlow and inFlowToStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(inFlowToStep));

			// check isomorphic binding between objects outFlowToNormalStep and inFlowToStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(inFlowToStep));

			// check isomorphic binding between objects process and inFlowToStep 
			JavaSDM.ensure(!process.equals(inFlowToStep));

			// check isomorphic binding between objects step and inFlowToStep 
			JavaSDM.ensure(!step.equals(inFlowToStep));

			// check isomorphic binding between objects normalStep and initFlow 
			JavaSDM.ensure(!normalStep.equals(initFlow));

			// check isomorphic binding between objects outFlow and initFlow 
			JavaSDM.ensure(!outFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToInitFlow and initFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(initFlow));

			// check isomorphic binding between objects outFlowToNormalStep and initFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(initFlow));

			// check isomorphic binding between objects process and initFlow 
			JavaSDM.ensure(!process.equals(initFlow));

			// check isomorphic binding between objects step and initFlow 
			JavaSDM.ensure(!step.equals(initFlow));

			// check isomorphic binding between objects outFlow and normalStep 
			JavaSDM.ensure(!outFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToInitFlow and normalStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(normalStep));

			// check isomorphic binding between objects outFlowToNormalStep and normalStep 
			JavaSDM.ensure(!outFlowToNormalStep.equals(normalStep));

			// check isomorphic binding between objects process and normalStep 
			JavaSDM.ensure(!process.equals(normalStep));

			// check isomorphic binding between objects step and normalStep 
			JavaSDM.ensure(!step.equals(normalStep));

			// check isomorphic binding between objects outFlowToInitFlow and outFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlow));

			// check isomorphic binding between objects process and outFlow 
			JavaSDM.ensure(!process.equals(outFlow));

			// check isomorphic binding between objects step and outFlow 
			JavaSDM.ensure(!step.equals(outFlow));

			// check isomorphic binding between objects outFlowToNormalStep and outFlowToInitFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToInitFlow 
			JavaSDM.ensure(!process.equals(outFlowToInitFlow));

			// check isomorphic binding between objects step and outFlowToInitFlow 
			JavaSDM.ensure(!step.equals(outFlowToInitFlow));

			// check isomorphic binding between objects process and outFlowToNormalStep 
			JavaSDM.ensure(!process.equals(outFlowToNormalStep));

			// check isomorphic binding between objects step and outFlowToNormalStep 
			JavaSDM.ensure(!step.equals(outFlowToNormalStep));

			// check isomorphic binding between objects step and process 
			JavaSDM.ensure(!step.equals(process));

			// create object exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_exclusiveGateway
			__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_exclusiveGateway
			__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exclusiveGateway_incoming_inFlow
			__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExclusiveConvergingGatewayRule");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __process_flowElements_exclusiveGateway
			__process_flowElements_exclusiveGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_exclusiveGateway
			__inFlow_targetRef_exclusiveGateway.setName("targetRef");
			// assign attribute __exclusiveGateway_incoming_inFlow
			__exclusiveGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_exclusiveGateway
			__outFlow_sourceRef_exclusiveGateway.setName("sourceRef");
			// assign attribute __exclusiveGateway_outgoing_outFlow
			__exclusiveGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute exclusiveGatewayToNormalStep__source__exclusiveGateway
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setName("source");
			// assign attribute exclusiveGatewayToNormalStep__target__normalStep
			exclusiveGatewayToNormalStep__target__normalStep.setName("target");
			// assign attribute outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow.setName("source");
			// assign attribute outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow.setName("target");
			// assign attribute outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow.setName("source");
			// assign attribute outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__target__normalStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exclusiveGatewayToNormalStep__source__exclusiveGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_exclusiveGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__target__initFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exclusiveGateway_incoming_inFlow, "translatedEdges");

			// create link
			__process_flowElements_exclusiveGateway.setSrc(process);

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__exclusiveGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_exclusiveGateway.setSrc(inFlow);

			// create link
			__process_flowElements_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_outgoing_outFlow.setSrc(exclusiveGateway);

			// create link
			__inFlow_targetRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setTrg(exclusiveGateway);

			// create link
			__exclusiveGateway_incoming_inFlow.setSrc(exclusiveGateway);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setTrg(exclusiveGateway);

			// create link
			outFlowToInitFlow__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_exclusiveGateway.setSrc(outFlow);

			// create link
			__exclusiveGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			exclusiveGatewayToNormalStep__target__normalStep
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			exclusiveGatewayToNormalStep__source__exclusiveGateway
					.setSrc(exclusiveGatewayToNormalStep);

			// create link
			outFlowToInitFlow__target__initFlow.setTrg(initFlow);

			// create link
			outFlowToInitFlow__target__initFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow, exclusiveGateway,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, normalStep,
				exclusiveGatewayToNormalStep, alt, initFlow, outFlowToInitFlow,
				outFlowToNormalStep);
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
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlow_targetRef_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToStep_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __exclusiveGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exclusiveGateway = null;
		EMoflonEdge __alt_ref_flow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __inFlowToStep_target_step = null;
		EMoflonEdge __initFlow_steps_normalStep = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		CSP csp = null;
		Flow initFlow = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterFlowToAlt = null;
		AlternativeFlowAlternative alt = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		AlternativeFlow flow = null;
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
			ruleresult.setRule("ExclusiveConvergingGatewayRule");

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
					_TmpObject = inFlowToFlow.getTarget();

					// ensure correct type and really bound of object flow
					JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
					flow = (AlternativeFlow) _TmpObject;

					// iterate to-many link source from inFlow to inFlowToStep
					fujaba__Success = false;

					fujaba__IterInFlowToInFlowToStep = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(inFlow,
											SequenceFlowToStep.class, "source"))
							.iterator();

					while (fujaba__IterInFlowToInFlowToStep.hasNext()) {
						try {
							inFlowToStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToStep
									.next();

							// check object inFlowToStep is really bound
							JavaSDM.ensure(inFlowToStep != null);
							// bind object
							step = inFlowToStep.getTarget();

							// check object step is really bound
							JavaSDM.ensure(step != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object flow is really bound
								JavaSDM.ensure(flow != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object inFlowToFlow is really bound
								JavaSDM.ensure(inFlowToFlow != null);
								// check object inFlowToStep is really bound
								JavaSDM.ensure(inFlowToStep != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object step is really bound
								JavaSDM.ensure(step != null);
								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link source from inFlowToFlow to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToFlow
										.getSource()));

								// check link source from inFlowToStep to inFlow
								JavaSDM.ensure(inFlow.equals(inFlowToStep
										.getSource()));

								// check link sourceRef from outFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(outFlow
										.getSourceRef()));

								// check link steps from step to flow
								JavaSDM.ensure(flow.equals(step.eContainer()));

								// check link target from inFlowToFlow to flow
								JavaSDM.ensure(flow.equals(inFlowToFlow
										.getTarget()));

								// check link target from inFlowToStep to step
								JavaSDM.ensure(step.equals(inFlowToStep
										.getTarget()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// iterate to-many link ref from flow to alt
								fujaba__Success = false;

								fujaba__IterFlowToAlt = new ArrayList(
										org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														flow,
														AlternativeFlowAlternative.class,
														"ref")).iterator();

								while (fujaba__IterFlowToAlt.hasNext()) {
									try {
										alt = (AlternativeFlowAlternative) fujaba__IterFlowToAlt
												.next();

										// check object alt is really bound
										JavaSDM.ensure(alt != null);
										// bind object
										normalStep = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
												.eContainer() : null;

										// check object normalStep is really bound
										JavaSDM.ensure(normalStep != null);

										// check if contained via correct reference
										JavaSDM.ensure(normalStep
												.getStepAlternative().contains(
														alt));

										// check isomorphic binding between objects step and normalStep 
										JavaSDM.ensure(!step.equals(normalStep));

										// bind object
										initFlow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
												.eContainer() : null;

										// check object initFlow is really bound
										JavaSDM.ensure(initFlow != null);

										// check if contained via correct reference
										JavaSDM.ensure(initFlow.getSteps()
												.contains(normalStep));

										// check isomorphic binding between objects initFlow and flow 
										JavaSDM.ensure(!initFlow.equals(flow));

										// create object __process_flowElements_inFlow
										__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_outFlow
										__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __inFlow_targetRef_exclusiveGateway
										__inFlow_targetRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_incoming_inFlow
										__exclusiveGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToStep_source_inFlow
										__inFlowToStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __exclusiveGateway_outgoing_outFlow
										__exclusiveGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __outFlow_sourceRef_exclusiveGateway
										__outFlow_sourceRef_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __alt_ref_flow
										__alt_ref_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __flow_steps_step
										__flow_steps_step = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __inFlowToStep_target_step
										__inFlowToStep_target_step = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __initFlow_steps_normalStep
										__initFlow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __normalStep_stepAlternative_alt
										__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_flowElements_outFlow
										__process_flowElements_outFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_inFlow
										__process_flowElements_inFlow
												.setName("flowElements");
										// assign attribute __process_flowElements_exclusiveGateway
										__process_flowElements_exclusiveGateway
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
										// assign attribute __flow_steps_step
										__flow_steps_step.setName("steps");
										// assign attribute __inFlowToFlow_source_inFlow
										__inFlowToFlow_source_inFlow
												.setName("source");
										// assign attribute __inFlowToFlow_target_flow
										__inFlowToFlow_target_flow
												.setName("target");
										// assign attribute __inFlowToStep_source_inFlow
										__inFlowToStep_source_inFlow
												.setName("source");
										// assign attribute __inFlowToStep_target_step
										__inFlowToStep_target_step
												.setName("target");
										// assign attribute __normalStep_stepAlternative_alt
										__normalStep_stepAlternative_alt
												.setName("stepAlternative");
										// assign attribute __alt_ref_flow
										__alt_ref_flow.setName("ref");
										// assign attribute __initFlow_steps_normalStep
										__initFlow_steps_normalStep
												.setName("steps");

										// create link
										__process_flowElements_inFlow
												.setSrc(process);

										// create link
										__process_flowElements_outFlow
												.setSrc(process);

										// create link
										__process_flowElements_exclusiveGateway
												.setSrc(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlow);

										// create link
										__inFlow_targetRef_exclusiveGateway
												.setSrc(inFlow);

										// create link
										__exclusiveGateway_incoming_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToStep_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_inFlow
												.setTrg(inFlow);

										// create link
										__inFlowToFlow_source_inFlow
												.setTrg(inFlow);

										// create link
										__process_flowElements_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__exclusiveGateway_outgoing_outFlow
												.setSrc(exclusiveGateway);

										// create link
										__outFlow_sourceRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										__exclusiveGateway_incoming_inFlow
												.setSrc(exclusiveGateway);

										// create link
										__inFlow_targetRef_exclusiveGateway
												.setTrg(exclusiveGateway);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														exclusiveGateway);

										// create link
										__outFlow_sourceRef_exclusiveGateway
												.setSrc(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														outFlow);

										// create link
										__exclusiveGateway_outgoing_outFlow
												.setTrg(outFlow);

										// create link
										__process_flowElements_outFlow
												.setTrg(outFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														flow);

										// create link
										__alt_ref_flow.setTrg(flow);

										// create link
										__flow_steps_step.setSrc(flow);

										// create link
										__inFlowToFlow_target_flow.setTrg(flow);

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
										__flow_steps_step.setTrg(step);

										// create link
										__inFlowToStep_target_step.setTrg(step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														step);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														inFlowToStep);

										// create link
										__inFlowToStep_source_inFlow
												.setSrc(inFlowToStep);

										// create link
										__inFlowToStep_target_step
												.setSrc(inFlowToStep);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														normalStep);

										// create link
										__initFlow_steps_normalStep
												.setTrg(normalStep);

										// create link
										__normalStep_stepAlternative_alt
												.setSrc(normalStep);

										// create link
										__normalStep_stepAlternative_alt
												.setTrg(alt);

										// create link
										__alt_ref_flow.setSrc(alt);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														alt);

										// create link
										__initFlow_steps_normalStep
												.setSrc(initFlow);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														initFlow);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToStep_target_step,
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
														__inFlow_targetRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__normalStep_stepAlternative_alt,
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
														__process_flowElements_outFlow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__initFlow_steps_normalStep,
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
														__flow_steps_step,
														"allContextElements");

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
														__exclusiveGateway_incoming_inFlow,
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
														__outFlow_sourceRef_exclusiveGateway,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__alt_ref_flow,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__inFlowToStep_source_inFlow,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_FWD(
															isApplicableMatch,
															process, inFlow,
															exclusiveGateway,
															outFlow, flow,
															inFlowToFlow, step,
															inFlowToStep,
															normalStep, alt,
															initFlow));

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
														.setRuleName("ExclusiveConvergingGatewayRule");

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
								}
								JavaSDM.ensure(fujaba__Success);
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

		return ruleresult;
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
		literal0.setValue("Converging");

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
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			AlternativeFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, NormalStep normalStep,
			AlternativeFlowAlternative alt, Flow initFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
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
			EObject process, EObject inFlow, EObject exclusiveGateway,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject normalStep,
			EObject exclusiveGatewayToNormalStep, EObject alt,
			EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_508(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exclusiveGateway_default_143116 = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_184911 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_655309 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_975432 = null;
		ExclusiveGateway __DEC_outFlow_default_975432 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_321722 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_321722 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
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

			// iterate to-many link flowElements from process to exclusiveGateway
			fujaba__Success = false;

			fujaba__IterProcessToExclusiveGateway = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToExclusiveGateway.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToExclusiveGateway.next();

					// ensure correct type and really bound of object exclusiveGateway
					JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
					exclusiveGateway = (ExclusiveGateway) _TmpObject;
					// check link sourceRef from outFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(outFlow
							.getSourceRef()));

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
									__DEC_exclusiveGateway_default_143116 = exclusiveGateway
											.getDefault();

									// check object __DEC_exclusiveGateway_default_143116 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_default_143116 != null);

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_143116 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_143116
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_143116 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_143116
											.equals(outFlow));

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
									__DEC_exclusiveGateway_flowElements_184911 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_184911 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_184911 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_184911
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_184911 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_184911
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
									__DEC_outFlow_flowElements_655309 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_655309 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_655309 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_655309
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_655309 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_655309
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_975432
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_975432 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_975432
													.hasNext()) {
										try {
											__DEC_outFlow_default_975432 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_975432
													.next();

											// check object __DEC_outFlow_default_975432 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_975432 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_975432 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_975432
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

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_321722
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_321722 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_321722
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_321722 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_321722
													.next();

											// check object __DEC_exclusiveGateway_targetRef_321722 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_321722 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_321722 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_321722
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_321722 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_321722
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

								// check link default from exclusiveGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exclusiveGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

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

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_flowElements to outFlow
								JavaSDM.ensure(outFlow
										.equals(_edge_flowElements.getTrg()));

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_509(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exclusiveGateway_default_377980 = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_652015 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_218500 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_683102 = null;
		ExclusiveGateway __DEC_outFlow_default_683102 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_460803 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_460803 = null;
		Match match = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
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

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

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
					// check link targetRef from inFlow to exclusiveGateway
					JavaSDM.ensure(exclusiveGateway.equals(inFlow
							.getTargetRef()));

					// iterate to-many link flowElements from process to outFlow
					fujaba__Success = false;

					fujaba__IterProcessToOutFlow = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToOutFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToOutFlow.next();

							// ensure correct type and really bound of object outFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
							outFlow = (SequenceFlow) _TmpObject;
							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

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
									__DEC_exclusiveGateway_default_377980 = exclusiveGateway
											.getDefault();

									// check object __DEC_exclusiveGateway_default_377980 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_default_377980 != null);

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_377980 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_377980
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_377980 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_377980
											.equals(outFlow));

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
									__DEC_exclusiveGateway_flowElements_652015 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_652015 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_652015 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_652015
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_652015 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_652015
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
									__DEC_outFlow_flowElements_218500 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_218500 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_218500 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_218500
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_218500 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_218500
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_683102
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_683102 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_683102
													.hasNext()) {
										try {
											__DEC_outFlow_default_683102 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_683102
													.next();

											// check object __DEC_outFlow_default_683102 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_683102 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_683102 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_683102
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

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_460803
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_460803 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_460803
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_460803 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_460803
													.next();

											// check object __DEC_exclusiveGateway_targetRef_460803 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_460803 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_460803 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_460803
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_460803 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_460803
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

								// check link default from exclusiveGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exclusiveGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

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

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_flowElements to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_flowElements.getTrg()));

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_510(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exclusiveGateway_default_185408 = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_601127 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_366547 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_819597 = null;
		ExclusiveGateway __DEC_outFlow_default_819597 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677193 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_677193 = null;
		Match match = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		SequenceFlow inFlow = null;
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

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

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

			// check link flowElements from exclusiveGateway to process
			JavaSDM.ensure(process.equals(exclusiveGateway.eContainer()));

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link flowElements from process to outFlow
			fujaba__Success = false;

			fujaba__IterProcessToOutFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToOutFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToOutFlow.next();

					// ensure correct type and really bound of object outFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					outFlow = (SequenceFlow) _TmpObject;
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

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
							__DEC_exclusiveGateway_default_185408 = exclusiveGateway
									.getDefault();

							// check object __DEC_exclusiveGateway_default_185408 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_default_185408 != null);

							// check isomorphic binding between objects __DEC_exclusiveGateway_default_185408 and inFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_default_185408
									.equals(inFlow));

							// check isomorphic binding between objects __DEC_exclusiveGateway_default_185408 and outFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_default_185408
									.equals(outFlow));

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
							__DEC_exclusiveGateway_flowElements_601127 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_601127 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_601127 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_601127
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_601127 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_601127
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
							__DEC_outFlow_flowElements_366547 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_366547 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_366547 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_366547
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_366547 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_366547
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

							// iterate to-many link default from outFlow to __DEC_outFlow_default_819597
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_819597 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_819597
											.hasNext()) {
								try {
									__DEC_outFlow_default_819597 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_819597
											.next();

									// check object __DEC_outFlow_default_819597 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_819597 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_819597 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_819597
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

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_677193
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677193 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677193
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_677193 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_677193
											.next();

									// check object __DEC_exclusiveGateway_targetRef_677193 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_677193 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_677193 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_677193
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_677193 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_677193
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

						// check link default from exclusiveGateway to inFlow
						JavaSDM.ensure(!(inFlow.equals(exclusiveGateway
								.getDefault())));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(!(outFlow.equals(exclusiveGateway
								.getDefault())));

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

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link targetRef from inFlow to exclusiveGateway
						JavaSDM.ensure(exclusiveGateway.equals(inFlow
								.getTargetRef()));

						// check link targetRef from outFlow to exclusiveGateway
						JavaSDM.ensure(!(exclusiveGateway.equals(outFlow
								.getTargetRef())));

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_511(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exclusiveGateway_default_107852 = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_51413 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_518876 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_536060 = null;
		ExclusiveGateway __DEC_outFlow_default_536060 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_33028 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_33028 = null;
		Match match = null;
		Iterator fujaba__IterExclusiveGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterExclusiveGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
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

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

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

			// check link targetRef from inFlow to exclusiveGateway
			JavaSDM.ensure(exclusiveGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link sourceRef from exclusiveGateway to outFlow
			fujaba__Success = false;

			fujaba__IterExclusiveGatewayToOutFlow = new ArrayList(
					exclusiveGateway.getOutgoing()).iterator();

			while (fujaba__IterExclusiveGatewayToOutFlow.hasNext()) {
				try {
					outFlow = (SequenceFlow) fujaba__IterExclusiveGatewayToOutFlow
							.next();

					// check object outFlow is really bound
					JavaSDM.ensure(outFlow != null);
					// check isomorphic binding between objects outFlow and inFlow 
					JavaSDM.ensure(!outFlow.equals(inFlow));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// iterate to-many link trg from exclusiveGateway to _edge_targetRef
					fujaba__Success = false;

					fujaba__IterExclusiveGatewayTo_edge_targetRef = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(exclusiveGateway,
											EMoflonEdge.class, "trg"))
							.iterator();

					while (fujaba__IterExclusiveGatewayTo_edge_targetRef
							.hasNext()) {
						try {
							_edge_targetRef = (EMoflonEdge) fujaba__IterExclusiveGatewayTo_edge_targetRef
									.next();

							// check object _edge_targetRef is really bound
							JavaSDM.ensure(_edge_targetRef != null);
							// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
							JavaSDM.ensure(!_edge_targetRef
									.equals(_edge_incoming));

							// check link src from _edge_targetRef to inFlow
							JavaSDM.ensure(inFlow.equals(_edge_targetRef
									.getSrc()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exclusiveGateway_default_107852 = exclusiveGateway
											.getDefault();

									// check object __DEC_exclusiveGateway_default_107852 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_default_107852 != null);

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_107852 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_107852
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_107852 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_107852
											.equals(outFlow));

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
									__DEC_exclusiveGateway_flowElements_51413 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_51413 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_51413 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_51413
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_51413 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_51413
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
									__DEC_outFlow_flowElements_518876 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_518876 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_518876 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_518876
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_518876 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_518876
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_536060
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_536060 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_536060
													.hasNext()) {
										try {
											__DEC_outFlow_default_536060 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_536060
													.next();

											// check object __DEC_outFlow_default_536060 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_536060 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_536060 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_536060
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

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_33028
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_33028 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_33028
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_33028 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_33028
													.next();

											// check object __DEC_exclusiveGateway_targetRef_33028 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_33028 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_33028 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_33028
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_33028 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_33028
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
								JavaSDM.ensure(!_edge_targetRef
										.equals(_edge_incoming));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exclusiveGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

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

								// check link src from _edge_incoming to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_incoming.getSrc()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link targetRef from inFlow to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway.equals(inFlow
										.getTargetRef()));

								// check link targetRef from outFlow to exclusiveGateway
								JavaSDM.ensure(!(exclusiveGateway
										.equals(outFlow.getTargetRef())));

								// check link trg from _edge_incoming to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_incoming
										.getTrg()));

								// check link trg from _edge_targetRef to exclusiveGateway
								JavaSDM.ensure(exclusiveGateway
										.equals(_edge_targetRef.getTrg()));

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_512(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exclusiveGateway_default_963601 = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_267670 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_358757 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_73587 = null;
		ExclusiveGateway __DEC_outFlow_default_73587 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_227972 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_227972 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exclusiveGateway = null;
		Process process = null;
		SequenceFlow outFlow = null;

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
			_TmpObject = _edge_sourceRef.getSrc();

			// ensure correct type and really bound of object outFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			outFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = outFlow.eContainer() instanceof Process ? (Process) outFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(outFlow));

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;

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
							__DEC_exclusiveGateway_default_963601 = exclusiveGateway
									.getDefault();

							// check object __DEC_exclusiveGateway_default_963601 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_default_963601 != null);

							// check isomorphic binding between objects __DEC_exclusiveGateway_default_963601 and inFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_default_963601
									.equals(inFlow));

							// check isomorphic binding between objects __DEC_exclusiveGateway_default_963601 and outFlow 
							JavaSDM.ensure(!__DEC_exclusiveGateway_default_963601
									.equals(outFlow));

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
							__DEC_exclusiveGateway_flowElements_267670 = exclusiveGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
									.eContainer() : null;

							// check object __DEC_exclusiveGateway_flowElements_267670 is really bound
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_267670 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_267670
									.getFlowElements().contains(
											exclusiveGateway));

							// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_267670 and process 
							JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_267670
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
							__DEC_outFlow_flowElements_358757 = outFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
									.eContainer() : null;

							// check object __DEC_outFlow_flowElements_358757 is really bound
							JavaSDM.ensure(__DEC_outFlow_flowElements_358757 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_outFlow_flowElements_358757
									.getFlowElements().contains(outFlow));

							// check isomorphic binding between objects __DEC_outFlow_flowElements_358757 and process 
							JavaSDM.ensure(!__DEC_outFlow_flowElements_358757
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

							// iterate to-many link default from outFlow to __DEC_outFlow_default_73587
							fujaba__Success = false;

							fujaba__IterOutFlowTo__DEC_outFlow_default_73587 = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterOutFlowTo__DEC_outFlow_default_73587
											.hasNext()) {
								try {
									__DEC_outFlow_default_73587 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_73587
											.next();

									// check object __DEC_outFlow_default_73587 is really bound
									JavaSDM.ensure(__DEC_outFlow_default_73587 != null);
									// check isomorphic binding between objects __DEC_outFlow_default_73587 and exclusiveGateway 
									JavaSDM.ensure(!__DEC_outFlow_default_73587
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

							// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_227972
							fujaba__Success = false;

							fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_227972 = new ArrayList(
									exclusiveGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_227972
											.hasNext()) {
								try {
									__DEC_exclusiveGateway_targetRef_227972 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_227972
											.next();

									// check object __DEC_exclusiveGateway_targetRef_227972 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_227972 != null);
									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_227972 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_227972
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_227972 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_227972
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

						// check link default from exclusiveGateway to inFlow
						JavaSDM.ensure(!(inFlow.equals(exclusiveGateway
								.getDefault())));

						// check link default from exclusiveGateway to outFlow
						JavaSDM.ensure(!(outFlow.equals(exclusiveGateway
								.getDefault())));

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_513(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exclusiveGateway_default_998920 = null;
		FlowElementsContainer __DEC_exclusiveGateway_flowElements_263610 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_138068 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_971456 = null;
		ExclusiveGateway __DEC_outFlow_default_971456 = null;
		Iterator fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_793736 = null;
		SequenceFlow __DEC_exclusiveGateway_targetRef_793736 = null;
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
									__DEC_exclusiveGateway_default_998920 = exclusiveGateway
											.getDefault();

									// check object __DEC_exclusiveGateway_default_998920 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_default_998920 != null);

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_998920 and inFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_998920
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exclusiveGateway_default_998920 and outFlow 
									JavaSDM.ensure(!__DEC_exclusiveGateway_default_998920
											.equals(outFlow));

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
									__DEC_exclusiveGateway_flowElements_263610 = exclusiveGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exclusiveGateway
											.eContainer() : null;

									// check object __DEC_exclusiveGateway_flowElements_263610 is really bound
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_263610 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exclusiveGateway_flowElements_263610
											.getFlowElements().contains(
													exclusiveGateway));

									// check isomorphic binding between objects __DEC_exclusiveGateway_flowElements_263610 and process 
									JavaSDM.ensure(!__DEC_exclusiveGateway_flowElements_263610
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
									__DEC_outFlow_flowElements_138068 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_138068 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_138068 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_138068
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_138068 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_138068
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

									// iterate to-many link default from outFlow to __DEC_outFlow_default_971456
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_971456 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_971456
													.hasNext()) {
										try {
											__DEC_outFlow_default_971456 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_971456
													.next();

											// check object __DEC_outFlow_default_971456 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_971456 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_971456 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_971456
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

									// iterate to-many link targetRef from exclusiveGateway to __DEC_exclusiveGateway_targetRef_793736
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_793736 = new ArrayList(
											exclusiveGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_793736
													.hasNext()) {
										try {
											__DEC_exclusiveGateway_targetRef_793736 = (SequenceFlow) fujaba__IterExclusiveGatewayTo__DEC_exclusiveGateway_targetRef_793736
													.next();

											// check object __DEC_exclusiveGateway_targetRef_793736 is really bound
											JavaSDM.ensure(__DEC_exclusiveGateway_targetRef_793736 != null);
											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_793736 and inFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_793736
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exclusiveGateway_targetRef_793736 and outFlow 
											JavaSDM.ensure(!__DEC_exclusiveGateway_targetRef_793736
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

								// check link default from exclusiveGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exclusiveGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

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
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow outFlow = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		Flow initFlow = null;
		Process process = null;
		SequenceFlow inFlow = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterFlowToAlt = null;
		AlternativeFlowAlternative alt = null;
		AlternativeFlow flow = null;
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
							_TmpObject = inFlowToFlow.getTarget();

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
							flow = (AlternativeFlow) _TmpObject;

							// iterate to-many link ref from flow to alt
							fujaba__Success = false;

							fujaba__IterFlowToAlt = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													flow,
													AlternativeFlowAlternative.class,
													"ref")).iterator();

							while (fujaba__IterFlowToAlt.hasNext()) {
								try {
									alt = (AlternativeFlowAlternative) fujaba__IterFlowToAlt
											.next();

									// check object alt is really bound
									JavaSDM.ensure(alt != null);
									// bind object
									normalStep = alt.eContainer() instanceof NormalStep ? (NormalStep) alt
											.eContainer() : null;

									// check object normalStep is really bound
									JavaSDM.ensure(normalStep != null);

									// check if contained via correct reference
									JavaSDM.ensure(normalStep
											.getStepAlternative().contains(alt));

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
									JavaSDM.ensure(process.getFlowElements()
											.contains(inFlow));

									// bind object
									initFlow = normalStep.eContainer() instanceof Flow ? (Flow) normalStep
											.eContainer() : null;

									// check object initFlow is really bound
									JavaSDM.ensure(initFlow != null);

									// check if contained via correct reference
									JavaSDM.ensure(initFlow.getSteps()
											.contains(normalStep));

									// check isomorphic binding between objects initFlow and flow 
									JavaSDM.ensure(!initFlow.equals(flow));

									// iterate to-many link source from inFlow to inFlowToStep
									fujaba__Success = false;

									fujaba__IterInFlowToInFlowToStep = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															inFlow,
															SequenceFlowToStep.class,
															"source"))
											.iterator();

									while (fujaba__IterInFlowToInFlowToStep
											.hasNext()) {
										try {
											inFlowToStep = (SequenceFlowToStep) fujaba__IterInFlowToInFlowToStep
													.next();

											// check object inFlowToStep is really bound
											JavaSDM.ensure(inFlowToStep != null);
											// bind object
											step = inFlowToStep.getTarget();

											// check object step is really bound
											JavaSDM.ensure(step != null);

											// check isomorphic binding between objects step and normalStep 
											JavaSDM.ensure(!step
													.equals(normalStep));

											// check link steps from step to flow
											JavaSDM.ensure(flow.equals(step
													.eContainer()));

											// story node 'solve CSP'
											try {
												fujaba__Success = false;

												_TmpObject = (this
														.generateModel_solveCsp_BWD(
																isApplicableMatch,
																process,
																inFlow,
																exclusiveGateway,
																outFlow,
																flow,
																inFlowToFlow,
																step,
																inFlowToStep,
																normalStep,
																exclusiveGatewayToNormalStep,
																alt,
																initFlow,
																outFlowToInitFlow,
																outFlowToNormalStep,
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

													// check object alt is really bound
													JavaSDM.ensure(alt != null);
													// check object flow is really bound
													JavaSDM.ensure(flow != null);
													// check object inFlow is really bound
													JavaSDM.ensure(inFlow != null);
													// check object inFlowToFlow is really bound
													JavaSDM.ensure(inFlowToFlow != null);
													// check object inFlowToStep is really bound
													JavaSDM.ensure(inFlowToStep != null);
													// check object initFlow is really bound
													JavaSDM.ensure(initFlow != null);
													// check object normalStep is really bound
													JavaSDM.ensure(normalStep != null);
													// check object process is really bound
													JavaSDM.ensure(process != null);
													// check object ruleResult is really bound
													JavaSDM.ensure(ruleResult != null);
													// check object step is really bound
													JavaSDM.ensure(step != null);
													// check isomorphic binding between objects initFlow and flow 
													JavaSDM.ensure(!initFlow
															.equals(flow));

													// check isomorphic binding between objects step and normalStep 
													JavaSDM.ensure(!step
															.equals(normalStep));

													// create object exclusiveGateway
													exclusiveGateway = Bpmn2Factory.eINSTANCE
															.createExclusiveGateway();

													// create object outFlow
													outFlow = Bpmn2Factory.eINSTANCE
															.createSequenceFlow();

													// create object exclusiveGatewayToNormalStep
													exclusiveGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createFlowNodeToStep();

													// create object outFlowToNormalStep
													outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToStep();

													// create object outFlowToInitFlow
													outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
															.createSequenceFlowToUCFlow();

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
													process.getFlowElements()
															.add(exclusiveGateway); // add link

													// create link
													process.getFlowElements()
															.add(outFlow); // add link

													// create link
													exclusiveGateway
															.getIncoming().add(
																	inFlow);

													// create link
													exclusiveGatewayToNormalStep
															.setSource(exclusiveGateway);

													// create link
													ruleResult
															.getSourceObjects()
															.add(exclusiveGateway);

													// create link
													outFlow.setSourceRef(exclusiveGateway);

													// create link
													outFlowToNormalStep
															.setSource(outFlow);

													// create link
													outFlowToInitFlow
															.setSource(outFlow);

													// create link
													ruleResult
															.getSourceObjects()
															.add(outFlow);

													// create link
													outFlowToNormalStep
															.setTarget(normalStep);

													// create link
													exclusiveGatewayToNormalStep
															.setTarget(normalStep);

													// create link
													ruleResult
															.getCorrObjects()
															.add(exclusiveGatewayToNormalStep);

													// create link
													outFlowToInitFlow
															.setTarget(initFlow);

													// create link
													ruleResult
															.getCorrObjects()
															.add(outFlowToInitFlow);

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
			bpmn2.Process process, SequenceFlow inFlow,
			ExclusiveGateway exclusiveGateway, SequenceFlow outFlow,
			AlternativeFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, NormalStep normalStep,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", csp);

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
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
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(AlternativeFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(Step) arguments.get(7),
					(SequenceFlowToStep) arguments.get(8),
					(NormalStep) arguments.get(9),
					(AlternativeFlowAlternative) arguments.get(10),
					(Flow) arguments.get(11));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14));
			return null;
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_508__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_508((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_509__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_509((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_510__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_510((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_511__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_511((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_512__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_512((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_513__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_513((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(AlternativeFlow) arguments.get(5),
					(SequenceFlowToUCFlow) arguments.get(6),
					(Step) arguments.get(7),
					(SequenceFlowToStep) arguments.get(8),
					(NormalStep) arguments.get(9),
					(FlowNodeToStep) arguments.get(10),
					(AlternativeFlowAlternative) arguments.get(11),
					(Flow) arguments.get(12),
					(SequenceFlowToUCFlow) arguments.get(13),
					(SequenceFlowToStep) arguments.get(14),
					(ModelgeneratorRuleResult) arguments.get(15));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExclusiveConvergingGatewayRuleImpl
