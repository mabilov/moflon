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
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
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
			SequenceFlow inFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow defaultFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
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
			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

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
					inFlow, exConvGateway, outFlow, exclusiveGateway,
					defaultFlow));

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

				// check object defaultFlow is really bound
				JavaSDM.ensure(defaultFlow != null);
				// check object exConvGateway is really bound
				JavaSDM.ensure(exConvGateway != null);
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
				// check isomorphic binding between objects inFlow and defaultFlow 
				JavaSDM.ensure(!inFlow.equals(defaultFlow));

				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// check isomorphic binding between objects exclusiveGateway and exConvGateway 
				JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __inFlow_targetRef_exConvGateway
				__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_outFlow
				__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_exConvGateway
				__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __outFlow_sourceRef_exConvGateway
				__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exConvGateway_outgoing_outFlow
				__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exConvGateway_incoming_inFlow
				__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_outFlow
				__process_flowElements_outFlow.setName("flowElements");
				// assign attribute __process_flowElements_exConvGateway
				__process_flowElements_exConvGateway.setName("flowElements");
				// assign attribute __inFlow_targetRef_exConvGateway
				__inFlow_targetRef_exConvGateway.setName("targetRef");
				// assign attribute __exConvGateway_incoming_inFlow
				__exConvGateway_incoming_inFlow.setName("incoming");
				// assign attribute __outFlow_sourceRef_exConvGateway
				__outFlow_sourceRef_exConvGateway.setName("sourceRef");
				// assign attribute __exConvGateway_outgoing_outFlow
				__exConvGateway_outgoing_outFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						outFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__inFlow_targetRef_exConvGateway,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_outFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__outFlow_sourceRef_exConvGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__exConvGateway_outgoing_outFlow,
								"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exConvGateway_incoming_inFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exConvGateway, "toBeTranslatedNodes");

				// create link
				__process_flowElements_outFlow.setSrc(process);

				// create link
				__process_flowElements_exConvGateway.setSrc(process);

				// create link
				__inFlow_targetRef_exConvGateway.setSrc(inFlow);

				// create link
				__exConvGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__inFlow_targetRef_exConvGateway.setTrg(exConvGateway);

				// create link
				__exConvGateway_incoming_inFlow.setSrc(exConvGateway);

				// create link
				__outFlow_sourceRef_exConvGateway.setTrg(exConvGateway);

				// create link
				__process_flowElements_exConvGateway.setTrg(exConvGateway);

				// create link
				__exConvGateway_outgoing_outFlow.setSrc(exConvGateway);

				// create link
				__exConvGateway_outgoing_outFlow.setTrg(outFlow);

				// create link
				__process_flowElements_outFlow.setTrg(outFlow);

				// create link
				__outFlow_sourceRef_exConvGateway.setSrc(outFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object defaultFlow is really bound
				JavaSDM.ensure(defaultFlow != null);
				// check object exConvGateway is really bound
				JavaSDM.ensure(exConvGateway != null);
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
				// check isomorphic binding between objects inFlow and defaultFlow 
				JavaSDM.ensure(!inFlow.equals(defaultFlow));

				// check isomorphic binding between objects outFlow and defaultFlow 
				JavaSDM.ensure(!outFlow.equals(defaultFlow));

				// check isomorphic binding between objects exclusiveGateway and exConvGateway 
				JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

				// check isomorphic binding between objects outFlow and inFlow 
				JavaSDM.ensure(!outFlow.equals(inFlow));

				// create object __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __exclusiveGateway_default_defaultFlow
				__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_exclusiveGateway
				__process_flowElements_exclusiveGateway.setName("flowElements");
				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");
				// assign attribute __exclusiveGateway_default_defaultFlow
				__exclusiveGateway_default_defaultFlow.setName("default");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						defaultFlow, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil
						.addOppositeReference(match,
								__process_flowElements_exclusiveGateway,
								"contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						exclusiveGateway, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__exclusiveGateway_default_defaultFlow, "contextEdges");

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
				__process_flowElements_exclusiveGateway.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				// create link
				__process_flowElements_exclusiveGateway
						.setTrg(exclusiveGateway);

				// create link
				__exclusiveGateway_default_defaultFlow.setSrc(exclusiveGateway);

				// create link
				__exclusiveGateway_default_defaultFlow.setTrg(defaultFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					exConvGateway, outFlow, exclusiveGateway, defaultFlow);
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
		SequenceFlow defaultFlow = null;
		SequenceFlowToUCFlow defaultFlowToInitFlow = null;
		ExclusiveGateway exConvGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
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
		FlowNodeToStep exConvGatewayToNormalStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge exConvGatewayToNormalStep__target__normalStep = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge outFlowToInitFlow__source__outFlow = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge outFlowToNormalStep__source__outFlow = null;
		EMoflonEdge outFlowToNormalStep__target__normalStep = null;
		EMoflonEdge outFlowToInitFlow__target__initFlow = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge exConvGatewayToNormalStep__source__exConvGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("alt"));

			// ensure correct type and really bound of object alt
			JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
			alt = (AlternativeFlowAlternative) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("defaultFlow"));

			// ensure correct type and really bound of object defaultFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			defaultFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("defaultFlowToInitFlow"));

			// ensure correct type and really bound of object defaultFlowToInitFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			defaultFlowToInitFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exConvGateway"));

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("exclusiveGateway"));

			// ensure correct type and really bound of object exclusiveGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exclusiveGateway = (ExclusiveGateway) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("exclusiveGatewayToNormalStep"));

			// ensure correct type and really bound of object exclusiveGatewayToNormalStep
			JavaSDM.ensure(_TmpObject instanceof FlowNodeToStep);
			exclusiveGatewayToNormalStep = (FlowNodeToStep) _TmpObject;
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
			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlowToFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

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
			// create object exConvGatewayToNormalStep
			exConvGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object outFlowToInitFlow
			outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// create object outFlowToNormalStep
			outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToStep();

			// create link
			exConvGatewayToNormalStep.setSource(exConvGateway);

			// create link
			outFlowToInitFlow.setSource(outFlow);

			// create link
			outFlowToNormalStep.setSource(outFlow);

			// create link
			outFlowToNormalStep.setTarget(normalStep);

			// create link
			exConvGatewayToNormalStep.setTarget(normalStep);

			// create link
			outFlowToInitFlow.setTarget(initFlow);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object exConvGatewayToNormalStep is really bound
			JavaSDM.ensure(exConvGatewayToNormalStep != null);
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
					outFlowToInitFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exConvGatewayToNormalStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exConvGateway, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep, "createdLinkElements");

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
			// check object defaultFlow is really bound
			JavaSDM.ensure(defaultFlow != null);
			// check object defaultFlowToInitFlow is really bound
			JavaSDM.ensure(defaultFlowToInitFlow != null);
			// check object exConvGateway is really bound
			JavaSDM.ensure(exConvGateway != null);
			// check object exConvGatewayToNormalStep is really bound
			JavaSDM.ensure(exConvGatewayToNormalStep != null);
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
			// check isomorphic binding between objects defaultFlow and alt 
			JavaSDM.ensure(!defaultFlow.equals(alt));

			// check isomorphic binding between objects defaultFlowToInitFlow and alt 
			JavaSDM.ensure(!defaultFlowToInitFlow.equals(alt));

			// check isomorphic binding between objects exConvGateway and alt 
			JavaSDM.ensure(!exConvGateway.equals(alt));

			// check isomorphic binding between objects exConvGatewayToNormalStep and alt 
			JavaSDM.ensure(!exConvGatewayToNormalStep.equals(alt));

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

			// check isomorphic binding between objects defaultFlowToInitFlow and defaultFlow 
			JavaSDM.ensure(!defaultFlowToInitFlow.equals(defaultFlow));

			// check isomorphic binding between objects exConvGateway and defaultFlow 
			JavaSDM.ensure(!exConvGateway.equals(defaultFlow));

			// check isomorphic binding between objects exConvGatewayToNormalStep and defaultFlow 
			JavaSDM.ensure(!exConvGatewayToNormalStep.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and defaultFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(defaultFlow));

			// check isomorphic binding between objects flow and defaultFlow 
			JavaSDM.ensure(!flow.equals(defaultFlow));

			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlowToFlow and defaultFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(defaultFlow));

			// check isomorphic binding between objects inFlowToStep and defaultFlow 
			JavaSDM.ensure(!inFlowToStep.equals(defaultFlow));

			// check isomorphic binding between objects initFlow and defaultFlow 
			JavaSDM.ensure(!initFlow.equals(defaultFlow));

			// check isomorphic binding between objects normalStep and defaultFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToInitFlow and defaultFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlowToNormalStep and defaultFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(defaultFlow));

			// check isomorphic binding between objects process and defaultFlow 
			JavaSDM.ensure(!process.equals(defaultFlow));

			// check isomorphic binding between objects step and defaultFlow 
			JavaSDM.ensure(!step.equals(defaultFlow));

			// check isomorphic binding between objects exConvGateway and defaultFlowToInitFlow 
			JavaSDM.ensure(!exConvGateway.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exConvGatewayToNormalStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!exConvGatewayToNormalStep
					.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exclusiveGateway and defaultFlowToInitFlow 
			JavaSDM.ensure(!exclusiveGateway.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects flow and defaultFlowToInitFlow 
			JavaSDM.ensure(!flow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects inFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects inFlowToFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects inFlowToStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!inFlowToStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects initFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!initFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects normalStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!normalStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects outFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects outFlowToInitFlow and defaultFlowToInitFlow 
			JavaSDM.ensure(!outFlowToInitFlow.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects outFlowToNormalStep and defaultFlowToInitFlow 
			JavaSDM.ensure(!outFlowToNormalStep.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects process and defaultFlowToInitFlow 
			JavaSDM.ensure(!process.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects step and defaultFlowToInitFlow 
			JavaSDM.ensure(!step.equals(defaultFlowToInitFlow));

			// check isomorphic binding between objects exConvGatewayToNormalStep and exConvGateway 
			JavaSDM.ensure(!exConvGatewayToNormalStep.equals(exConvGateway));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exConvGateway 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep.equals(exConvGateway));

			// check isomorphic binding between objects flow and exConvGateway 
			JavaSDM.ensure(!flow.equals(exConvGateway));

			// check isomorphic binding between objects inFlow and exConvGateway 
			JavaSDM.ensure(!inFlow.equals(exConvGateway));

			// check isomorphic binding between objects inFlowToFlow and exConvGateway 
			JavaSDM.ensure(!inFlowToFlow.equals(exConvGateway));

			// check isomorphic binding between objects inFlowToStep and exConvGateway 
			JavaSDM.ensure(!inFlowToStep.equals(exConvGateway));

			// check isomorphic binding between objects initFlow and exConvGateway 
			JavaSDM.ensure(!initFlow.equals(exConvGateway));

			// check isomorphic binding between objects normalStep and exConvGateway 
			JavaSDM.ensure(!normalStep.equals(exConvGateway));

			// check isomorphic binding between objects outFlow and exConvGateway 
			JavaSDM.ensure(!outFlow.equals(exConvGateway));

			// check isomorphic binding between objects outFlowToInitFlow and exConvGateway 
			JavaSDM.ensure(!outFlowToInitFlow.equals(exConvGateway));

			// check isomorphic binding between objects outFlowToNormalStep and exConvGateway 
			JavaSDM.ensure(!outFlowToNormalStep.equals(exConvGateway));

			// check isomorphic binding between objects process and exConvGateway 
			JavaSDM.ensure(!process.equals(exConvGateway));

			// check isomorphic binding between objects step and exConvGateway 
			JavaSDM.ensure(!step.equals(exConvGateway));

			// check isomorphic binding between objects exclusiveGateway and exConvGatewayToNormalStep 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects exclusiveGatewayToNormalStep and exConvGatewayToNormalStep 
			JavaSDM.ensure(!exclusiveGatewayToNormalStep
					.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects flow and exConvGatewayToNormalStep 
			JavaSDM.ensure(!flow.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects inFlow and exConvGatewayToNormalStep 
			JavaSDM.ensure(!inFlow.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToFlow and exConvGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToFlow.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects inFlowToStep and exConvGatewayToNormalStep 
			JavaSDM.ensure(!inFlowToStep.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects initFlow and exConvGatewayToNormalStep 
			JavaSDM.ensure(!initFlow.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects normalStep and exConvGatewayToNormalStep 
			JavaSDM.ensure(!normalStep.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects outFlow and exConvGatewayToNormalStep 
			JavaSDM.ensure(!outFlow.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToInitFlow and exConvGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToInitFlow.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects outFlowToNormalStep and exConvGatewayToNormalStep 
			JavaSDM.ensure(!outFlowToNormalStep
					.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects process and exConvGatewayToNormalStep 
			JavaSDM.ensure(!process.equals(exConvGatewayToNormalStep));

			// check isomorphic binding between objects step and exConvGatewayToNormalStep 
			JavaSDM.ensure(!step.equals(exConvGatewayToNormalStep));

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

			// create object exConvGatewayToNormalStep__target__normalStep
			exConvGatewayToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_outFlow
			__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exConvGateway_incoming_inFlow
			__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__source__outFlow
			outFlowToInitFlow__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_exConvGateway
			__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_exConvGateway
			__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__source__outFlow
			outFlowToNormalStep__source__outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToNormalStep__target__normalStep
			outFlowToNormalStep__target__normalStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object outFlowToInitFlow__target__initFlow
			outFlowToInitFlow__target__initFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __exConvGateway_outgoing_outFlow
			__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __outFlow_sourceRef_exConvGateway
			__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object exConvGatewayToNormalStep__source__exConvGateway
			exConvGatewayToNormalStep__source__exConvGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ExclusiveConvergingGatewayRule");
			// assign attribute __process_flowElements_outFlow
			__process_flowElements_outFlow.setName("flowElements");
			// assign attribute __process_flowElements_exConvGateway
			__process_flowElements_exConvGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_exConvGateway
			__inFlow_targetRef_exConvGateway.setName("targetRef");
			// assign attribute __exConvGateway_incoming_inFlow
			__exConvGateway_incoming_inFlow.setName("incoming");
			// assign attribute __outFlow_sourceRef_exConvGateway
			__outFlow_sourceRef_exConvGateway.setName("sourceRef");
			// assign attribute __exConvGateway_outgoing_outFlow
			__exConvGateway_outgoing_outFlow.setName("outgoing");
			// assign attribute exConvGatewayToNormalStep__source__exConvGateway
			exConvGatewayToNormalStep__source__exConvGateway.setName("source");
			// assign attribute exConvGatewayToNormalStep__target__normalStep
			exConvGatewayToNormalStep__target__normalStep.setName("target");
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
					exConvGatewayToNormalStep__target__normalStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exConvGateway_incoming_inFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__source__outFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToNormalStep__target__normalStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					outFlowToInitFlow__target__initFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__exConvGateway_outgoing_outFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__outFlow_sourceRef_exConvGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					exConvGatewayToNormalStep__source__exConvGateway,
					"createdEdges");

			// create link
			__process_flowElements_outFlow.setSrc(process);

			// create link
			__process_flowElements_exConvGateway.setSrc(process);

			// create link
			__inFlow_targetRef_exConvGateway.setSrc(inFlow);

			// create link
			__exConvGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__exConvGateway_incoming_inFlow.setSrc(exConvGateway);

			// create link
			__process_flowElements_exConvGateway.setTrg(exConvGateway);

			// create link
			__inFlow_targetRef_exConvGateway.setTrg(exConvGateway);

			// create link
			__exConvGateway_outgoing_outFlow.setSrc(exConvGateway);

			// create link
			__outFlow_sourceRef_exConvGateway.setTrg(exConvGateway);

			// create link
			exConvGatewayToNormalStep__source__exConvGateway
					.setTrg(exConvGateway);

			// create link
			outFlowToNormalStep__source__outFlow.setTrg(outFlow);

			// create link
			__process_flowElements_outFlow.setTrg(outFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setTrg(outFlow);

			// create link
			__outFlow_sourceRef_exConvGateway.setSrc(outFlow);

			// create link
			__exConvGateway_outgoing_outFlow.setTrg(outFlow);

			// create link
			outFlowToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			exConvGatewayToNormalStep__target__normalStep.setTrg(normalStep);

			// create link
			exConvGatewayToNormalStep__source__exConvGateway
					.setSrc(exConvGatewayToNormalStep);

			// create link
			exConvGatewayToNormalStep__target__normalStep
					.setSrc(exConvGatewayToNormalStep);

			// create link
			outFlowToInitFlow__target__initFlow.setTrg(initFlow);

			// create link
			outFlowToInitFlow__target__initFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToInitFlow__source__outFlow.setSrc(outFlowToInitFlow);

			// create link
			outFlowToNormalStep__target__normalStep.setSrc(outFlowToNormalStep);

			// create link
			outFlowToNormalStep__source__outFlow.setSrc(outFlowToNormalStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow, exConvGateway,
				outFlow, flow, inFlowToFlow, step, inFlowToStep, normalStep,
				exConvGatewayToNormalStep, alt, initFlow, outFlowToInitFlow,
				outFlowToNormalStep, exclusiveGateway,
				exclusiveGatewayToNormalStep, defaultFlow,
				defaultFlowToInitFlow);
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
		SequenceFlow defaultFlow = null;
		ExclusiveGateway exConvGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow inFlow = null;
		SequenceFlow outFlow = null;
		Process process = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		EMoflonEdge __process_flowElements_outFlow = null;
		EMoflonEdge __process_flowElements_exclusiveGateway = null;
		EMoflonEdge __process_flowElements_exConvGateway = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __exConvGateway_incoming_inFlow = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlow_targetRef_exConvGateway = null;
		EMoflonEdge __inFlowToStep_source_inFlow = null;
		EMoflonEdge __exConvGateway_outgoing_outFlow = null;
		EMoflonEdge __outFlow_sourceRef_exConvGateway = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		EMoflonEdge __flow_steps_step = null;
		EMoflonEdge __alt_ref_flow = null;
		EMoflonEdge __inFlowToStep_target_step = null;
		EMoflonEdge __exclusiveGatewayToNormalStep_target_normalStep = null;
		EMoflonEdge __initFlow_steps_normalStep = null;
		EMoflonEdge __normalStep_stepAlternative_alt = null;
		EMoflonEdge __defaultFlowToInitFlow_target_initFlow = null;
		EMoflonEdge __exclusiveGatewayToNormalStep_source_exclusiveGateway = null;
		EMoflonEdge __exclusiveGateway_default_defaultFlow = null;
		EMoflonEdge __defaultFlowToInitFlow_source_defaultFlow = null;
		CSP csp = null;
		Iterator fujaba__IterFlowToAlt = null;
		AlternativeFlowAlternative alt = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		Step step = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		AlternativeFlow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Flow initFlow = null;
		Iterator fujaba__IterDefaultFlowToDefaultFlowToInitFlow = null;
		SequenceFlowToUCFlow defaultFlowToInitFlow = null;

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

			_TmpObject = (match.getObject("defaultFlow"));

			// ensure correct type and really bound of object defaultFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			defaultFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("exConvGateway"));

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;
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
			// check isomorphic binding between objects inFlow and defaultFlow 
			JavaSDM.ensure(!inFlow.equals(defaultFlow));

			// check isomorphic binding between objects outFlow and defaultFlow 
			JavaSDM.ensure(!outFlow.equals(defaultFlow));

			// check isomorphic binding between objects exclusiveGateway and exConvGateway 
			JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

			// check isomorphic binding between objects outFlow and inFlow 
			JavaSDM.ensure(!outFlow.equals(inFlow));

			// iterate to-many link source from defaultFlow to defaultFlowToInitFlow
			fujaba__Success = false;

			fujaba__IterDefaultFlowToDefaultFlowToInitFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							defaultFlow, SequenceFlowToUCFlow.class, "source"))
					.iterator();

			while (fujaba__IterDefaultFlowToDefaultFlowToInitFlow.hasNext()) {
				try {
					defaultFlowToInitFlow = (SequenceFlowToUCFlow) fujaba__IterDefaultFlowToDefaultFlowToInitFlow
							.next();

					// check object defaultFlowToInitFlow is really bound
					JavaSDM.ensure(defaultFlowToInitFlow != null);
					// bind object
					initFlow = defaultFlowToInitFlow.getTarget();

					// check object initFlow is really bound
					JavaSDM.ensure(initFlow != null);

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
							// check isomorphic binding between objects inFlowToFlow and defaultFlowToInitFlow 
							JavaSDM.ensure(!inFlowToFlow
									.equals(defaultFlowToInitFlow));

							// bind object
							_TmpObject = inFlowToFlow.getTarget();

							// ensure correct type and really bound of object flow
							JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
							flow = (AlternativeFlow) _TmpObject;

							// check isomorphic binding between objects initFlow and flow 
							JavaSDM.ensure(!initFlow.equals(flow));

							// iterate to-many link source from inFlow to inFlowToStep
							fujaba__Success = false;

							fujaba__IterInFlowToInFlowToStep = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(inFlow,
													SequenceFlowToStep.class,
													"source")).iterator();

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

									// iterate to-many link source from exclusiveGateway to exclusiveGatewayToNormalStep
									fujaba__Success = false;

									fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															exclusiveGateway,
															FlowNodeToStep.class,
															"source"))
											.iterator();

									while (fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep
											.hasNext()) {
										try {
											exclusiveGatewayToNormalStep = (FlowNodeToStep) fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep
													.next();

											// check object exclusiveGatewayToNormalStep is really bound
											JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
											// bind object
											_TmpObject = exclusiveGatewayToNormalStep
													.getTarget();

											// ensure correct type and really bound of object normalStep
											JavaSDM.ensure(_TmpObject instanceof NormalStep);
											normalStep = (NormalStep) _TmpObject;

											// check isomorphic binding between objects step and normalStep 
											JavaSDM.ensure(!step
													.equals(normalStep));

											// story node 'find context'
											try {
												fujaba__Success = false;

												// check object defaultFlow is really bound
												JavaSDM.ensure(defaultFlow != null);
												// check object defaultFlowToInitFlow is really bound
												JavaSDM.ensure(defaultFlowToInitFlow != null);
												// check object exConvGateway is really bound
												JavaSDM.ensure(exConvGateway != null);
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
												// check object process is really bound
												JavaSDM.ensure(process != null);
												// check object step is really bound
												JavaSDM.ensure(step != null);
												// check isomorphic binding between objects inFlow and defaultFlow 
												JavaSDM.ensure(!inFlow
														.equals(defaultFlow));

												// check isomorphic binding between objects outFlow and defaultFlow 
												JavaSDM.ensure(!outFlow
														.equals(defaultFlow));

												// check isomorphic binding between objects inFlowToFlow and defaultFlowToInitFlow 
												JavaSDM.ensure(!inFlowToFlow
														.equals(defaultFlowToInitFlow));

												// check isomorphic binding between objects exclusiveGateway and exConvGateway 
												JavaSDM.ensure(!exclusiveGateway
														.equals(exConvGateway));

												// check isomorphic binding between objects initFlow and flow 
												JavaSDM.ensure(!initFlow
														.equals(flow));

												// check isomorphic binding between objects outFlow and inFlow 
												JavaSDM.ensure(!outFlow
														.equals(inFlow));

												// check isomorphic binding between objects step and normalStep 
												JavaSDM.ensure(!step
														.equals(normalStep));

												// check link default from exclusiveGateway to defaultFlow
												JavaSDM.ensure(defaultFlow
														.equals(exclusiveGateway
																.getDefault()));

												// check link flowElements from exConvGateway to process
												JavaSDM.ensure(process
														.equals(exConvGateway
																.eContainer()));

												// check link flowElements from exclusiveGateway to process
												JavaSDM.ensure(process
														.equals(exclusiveGateway
																.eContainer()));

												// check link flowElements from inFlow to process
												JavaSDM.ensure(process
														.equals(inFlow
																.eContainer()));

												// check link flowElements from outFlow to process
												JavaSDM.ensure(process
														.equals(outFlow
																.eContainer()));

												// check link incoming from inFlow to exConvGateway
												JavaSDM.ensure(exConvGateway.equals(inFlow
														.getTargetRef()));

												// check link outgoing from outFlow to exConvGateway
												JavaSDM.ensure(exConvGateway.equals(outFlow
														.getSourceRef()));

												// check link source from defaultFlowToInitFlow to defaultFlow
												JavaSDM.ensure(defaultFlow
														.equals(defaultFlowToInitFlow
																.getSource()));

												// check link source from exclusiveGatewayToNormalStep to exclusiveGateway
												JavaSDM.ensure(exclusiveGateway
														.equals(exclusiveGatewayToNormalStep
																.getSource()));

												// check link source from inFlowToFlow to inFlow
												JavaSDM.ensure(inFlow
														.equals(inFlowToFlow
																.getSource()));

												// check link source from inFlowToStep to inFlow
												JavaSDM.ensure(inFlow
														.equals(inFlowToStep
																.getSource()));

												// check link steps from step to flow
												JavaSDM.ensure(flow.equals(step
														.eContainer()));

												// check link steps from normalStep to initFlow
												JavaSDM.ensure(initFlow
														.equals(normalStep
																.eContainer()));

												// check link target from defaultFlowToInitFlow to initFlow
												JavaSDM.ensure(initFlow
														.equals(defaultFlowToInitFlow
																.getTarget()));

												// check link target from exclusiveGatewayToNormalStep to normalStep
												JavaSDM.ensure(normalStep
														.equals(exclusiveGatewayToNormalStep
																.getTarget()));

												// check link target from inFlowToFlow to flow
												JavaSDM.ensure(flow
														.equals(inFlowToFlow
																.getTarget()));

												// check link target from inFlowToStep to step
												JavaSDM.ensure(step
														.equals(inFlowToStep
																.getTarget()));

												// iterate to-many link ref from flow to alt
												fujaba__Success = false;

												fujaba__IterFlowToAlt = new ArrayList(
														org.moflon.util.eMoflonEMFUtil
																.getOppositeReference(
																		flow,
																		AlternativeFlowAlternative.class,
																		"ref"))
														.iterator();

												while (fujaba__IterFlowToAlt
														.hasNext()) {
													try {
														alt = (AlternativeFlowAlternative) fujaba__IterFlowToAlt
																.next();

														// check object alt is really bound
														JavaSDM.ensure(alt != null);
														// check link stepAlternative from alt to normalStep
														JavaSDM.ensure(normalStep.equals(alt
																.eContainer()));

														// create object __process_flowElements_inFlow
														__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_outFlow
														__process_flowElements_outFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_exclusiveGateway
														__process_flowElements_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __process_flowElements_exConvGateway
														__process_flowElements_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object isApplicableMatch
														isApplicableMatch = TGGRuntimeFactory.eINSTANCE
																.createIsApplicableMatch();

														// create object __exConvGateway_incoming_inFlow
														__exConvGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToFlow_source_inFlow
														__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlow_targetRef_exConvGateway
														__inFlow_targetRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToStep_source_inFlow
														__inFlowToStep_source_inFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exConvGateway_outgoing_outFlow
														__exConvGateway_outgoing_outFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __outFlow_sourceRef_exConvGateway
														__outFlow_sourceRef_exConvGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToFlow_target_flow
														__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __flow_steps_step
														__flow_steps_step = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __alt_ref_flow
														__alt_ref_flow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __inFlowToStep_target_step
														__inFlowToStep_target_step = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exclusiveGatewayToNormalStep_target_normalStep
														__exclusiveGatewayToNormalStep_target_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __initFlow_steps_normalStep
														__initFlow_steps_normalStep = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __normalStep_stepAlternative_alt
														__normalStep_stepAlternative_alt = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __defaultFlowToInitFlow_target_initFlow
														__defaultFlowToInitFlow_target_initFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exclusiveGatewayToNormalStep_source_exclusiveGateway
														__exclusiveGatewayToNormalStep_source_exclusiveGateway = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __exclusiveGateway_default_defaultFlow
														__exclusiveGateway_default_defaultFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// create object __defaultFlowToInitFlow_source_defaultFlow
														__defaultFlowToInitFlow_source_defaultFlow = TGGRuntimeFactory.eINSTANCE
																.createEMoflonEdge();

														// assign attribute __process_flowElements_outFlow
														__process_flowElements_outFlow
																.setName("flowElements");
														// assign attribute __process_flowElements_exclusiveGateway
														__process_flowElements_exclusiveGateway
																.setName("flowElements");
														// assign attribute __process_flowElements_inFlow
														__process_flowElements_inFlow
																.setName("flowElements");
														// assign attribute __process_flowElements_exConvGateway
														__process_flowElements_exConvGateway
																.setName("flowElements");
														// assign attribute __inFlow_targetRef_exConvGateway
														__inFlow_targetRef_exConvGateway
																.setName("targetRef");
														// assign attribute __exConvGateway_incoming_inFlow
														__exConvGateway_incoming_inFlow
																.setName("incoming");
														// assign attribute __outFlow_sourceRef_exConvGateway
														__outFlow_sourceRef_exConvGateway
																.setName("sourceRef");
														// assign attribute __exConvGateway_outgoing_outFlow
														__exConvGateway_outgoing_outFlow
																.setName("outgoing");
														// assign attribute __flow_steps_step
														__flow_steps_step
																.setName("steps");
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
														__alt_ref_flow
																.setName("ref");
														// assign attribute __initFlow_steps_normalStep
														__initFlow_steps_normalStep
																.setName("steps");
														// assign attribute __exclusiveGateway_default_defaultFlow
														__exclusiveGateway_default_defaultFlow
																.setName("default");
														// assign attribute __exclusiveGatewayToNormalStep_source_exclusiveGateway
														__exclusiveGatewayToNormalStep_source_exclusiveGateway
																.setName("source");
														// assign attribute __exclusiveGatewayToNormalStep_target_normalStep
														__exclusiveGatewayToNormalStep_target_normalStep
																.setName("target");
														// assign attribute __defaultFlowToInitFlow_source_defaultFlow
														__defaultFlowToInitFlow_source_defaultFlow
																.setName("source");
														// assign attribute __defaultFlowToInitFlow_target_initFlow
														__defaultFlowToInitFlow_target_initFlow
																.setName("target");

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
														__process_flowElements_exConvGateway
																.setSrc(process);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(process);

														// create link
														__exConvGateway_incoming_inFlow
																.setTrg(inFlow);

														// create link
														__inFlowToFlow_source_inFlow
																.setTrg(inFlow);

														// create link
														__process_flowElements_inFlow
																.setTrg(inFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlow);

														// create link
														__inFlow_targetRef_exConvGateway
																.setSrc(inFlow);

														// create link
														__inFlowToStep_source_inFlow
																.setTrg(inFlow);

														// create link
														__exConvGateway_outgoing_outFlow
																.setSrc(exConvGateway);

														// create link
														__exConvGateway_incoming_inFlow
																.setSrc(exConvGateway);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(exConvGateway);

														// create link
														__outFlow_sourceRef_exConvGateway
																.setTrg(exConvGateway);

														// create link
														__inFlow_targetRef_exConvGateway
																.setTrg(exConvGateway);

														// create link
														__process_flowElements_exConvGateway
																.setTrg(exConvGateway);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(outFlow);

														// create link
														__exConvGateway_outgoing_outFlow
																.setTrg(outFlow);

														// create link
														__process_flowElements_outFlow
																.setTrg(outFlow);

														// create link
														__outFlow_sourceRef_exConvGateway
																.setSrc(outFlow);

														// create link
														__inFlowToFlow_target_flow
																.setTrg(flow);

														// create link
														__flow_steps_step
																.setSrc(flow);

														// create link
														__alt_ref_flow
																.setTrg(flow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(flow);

														// create link
														__inFlowToFlow_target_flow
																.setSrc(inFlowToFlow);

														// create link
														__inFlowToFlow_source_inFlow
																.setSrc(inFlowToFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlowToFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(step);

														// create link
														__inFlowToStep_target_step
																.setTrg(step);

														// create link
														__flow_steps_step
																.setTrg(step);

														// create link
														__inFlowToStep_source_inFlow
																.setSrc(inFlowToStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(inFlowToStep);

														// create link
														__inFlowToStep_target_step
																.setSrc(inFlowToStep);

														// create link
														__exclusiveGatewayToNormalStep_target_normalStep
																.setTrg(normalStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(normalStep);

														// create link
														__initFlow_steps_normalStep
																.setTrg(normalStep);

														// create link
														__normalStep_stepAlternative_alt
																.setSrc(normalStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(alt);

														// create link
														__normalStep_stepAlternative_alt
																.setTrg(alt);

														// create link
														__alt_ref_flow
																.setSrc(alt);

														// create link
														__defaultFlowToInitFlow_target_initFlow
																.setTrg(initFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(initFlow);

														// create link
														__initFlow_steps_normalStep
																.setSrc(initFlow);

														// create link
														__process_flowElements_exclusiveGateway
																.setTrg(exclusiveGateway);

														// create link
														__exclusiveGatewayToNormalStep_source_exclusiveGateway
																.setTrg(exclusiveGateway);

														// create link
														__exclusiveGateway_default_defaultFlow
																.setSrc(exclusiveGateway);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(exclusiveGateway);

														// create link
														__exclusiveGatewayToNormalStep_target_normalStep
																.setSrc(exclusiveGatewayToNormalStep);

														// create link
														__exclusiveGatewayToNormalStep_source_exclusiveGateway
																.setSrc(exclusiveGatewayToNormalStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(exclusiveGatewayToNormalStep);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(defaultFlow);

														// create link
														__exclusiveGateway_default_defaultFlow
																.setTrg(defaultFlow);

														// create link
														__defaultFlowToInitFlow_source_defaultFlow
																.setTrg(defaultFlow);

														// create link
														__defaultFlowToInitFlow_target_initFlow
																.setSrc(defaultFlowToInitFlow);

														// create link
														isApplicableMatch
																.getAllContextElements()
																.add(defaultFlowToInitFlow);

														// create link
														__defaultFlowToInitFlow_source_defaultFlow
																.setSrc(defaultFlowToInitFlow);

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
																		__process_flowElements_inFlow,
																		"allContextElements");

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
																		__process_flowElements_exConvGateway,
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
																		__inFlowToStep_source_inFlow,
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
																		__process_flowElements_exclusiveGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__defaultFlowToInitFlow_source_defaultFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exclusiveGatewayToNormalStep_source_exclusiveGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__defaultFlowToInitFlow_target_initFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exclusiveGatewayToNormalStep_target_normalStep,
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
																		__initFlow_steps_normalStep,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exclusiveGateway_default_defaultFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exConvGateway_outgoing_outFlow,
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
																		__outFlow_sourceRef_exConvGateway,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__exConvGateway_incoming_inFlow,
																		"allContextElements");

														// create link
														org.moflon.util.eMoflonEMFUtil
																.addOppositeReference(
																		isApplicableMatch,
																		__inFlow_targetRef_exConvGateway,
																		"allContextElements");
														// story node 'solve CSP'
														try {
															fujaba__Success = false;

															_TmpObject = (this
																	.isApplicable_solveCsp_FWD(
																			isApplicableMatch,
																			process,
																			inFlow,
																			exConvGateway,
																			outFlow,
																			flow,
																			inFlowToFlow,
																			step,
																			inFlowToStep,
																			normalStep,
																			alt,
																			initFlow,
																			exclusiveGateway,
																			exclusiveGatewayToNormalStep,
																			defaultFlow,
																			defaultFlowToInitFlow));

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
																ruleresult
																		.setSuccess(true);
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
			SequenceFlow inFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow defaultFlow) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("exConvGateway", exConvGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("exclusiveGateway", exclusiveGateway);
		match.registerObject("defaultFlow", defaultFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, ExclusiveGateway exclusiveGateway,
			SequenceFlow defaultFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");

		// Create attribute variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", true, csp);
		var_exConvGateway_gatewayDirection.setValue(exConvGateway
				.getGatewayDirection());
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exConvGateway_gatewayDirection, literal0);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0.solve(var_exclusiveGateway_gatewayDirection,
				literal1);
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
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			AlternativeFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, NormalStep normalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			ExclusiveGateway exclusiveGateway,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlow defaultFlow, SequenceFlowToUCFlow defaultFlowToInitFlow) {
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
		isApplicableMatch.registerObject("exConvGateway", exConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("inFlowToStep", inFlowToStep);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
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
			EObject process, EObject inFlow, EObject exConvGateway,
			EObject outFlow, EObject flow, EObject inFlowToFlow, EObject step,
			EObject inFlowToStep, EObject normalStep,
			EObject exConvGatewayToNormalStep, EObject alt, EObject initFlow,
			EObject outFlowToInitFlow, EObject outFlowToNormalStep,
			EObject exclusiveGateway, EObject exclusiveGatewayToNormalStep,
			EObject defaultFlow, EObject defaultFlowToInitFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("exConvGateway", exConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("inFlowToStep", inFlowToStep);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("exConvGatewayToNormalStep",
				exConvGatewayToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("exclusiveGateway", exclusiveGateway);
		ruleresult.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		ruleresult.registerObject("defaultFlow", defaultFlow);
		ruleresult.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("exConvGateway")
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_181(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_502492 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_500789 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_59079 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_207790 = null;
		ExclusiveGateway __DEC_outFlow_default_207790 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_736200 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_736200 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exConvGateway = null;
		SequenceFlow outFlow = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
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
					// bind object
					defaultFlow = exclusiveGateway.getDefault();

					// check object defaultFlow is really bound
					JavaSDM.ensure(defaultFlow != null);

					// bind object
					_TmpObject = _edge_flowElements.getTrg();

					// ensure correct type and really bound of object outFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					outFlow = (SequenceFlow) _TmpObject;

					// check isomorphic binding between objects outFlow and defaultFlow 
					JavaSDM.ensure(!outFlow.equals(defaultFlow));

					// check link flowElements from outFlow to process
					JavaSDM.ensure(process.equals(outFlow.eContainer()));

					// bind object
					_TmpObject = outFlow.getSourceRef();

					// ensure correct type and really bound of object exConvGateway
					JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
					exConvGateway = (ExclusiveGateway) _TmpObject;

					// check isomorphic binding between objects exclusiveGateway and exConvGateway 
					JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

					// check link flowElements from exConvGateway to process
					JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

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
							// check isomorphic binding between objects inFlow and defaultFlow 
							JavaSDM.ensure(!inFlow.equals(defaultFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link incoming from inFlow to exConvGateway
							JavaSDM.ensure(exConvGateway.equals(inFlow
									.getTargetRef()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exConvGateway_default_502492 = exConvGateway
											.getDefault();

									// check object __DEC_exConvGateway_default_502492 is really bound
									JavaSDM.ensure(__DEC_exConvGateway_default_502492 != null);

									// check isomorphic binding between objects __DEC_exConvGateway_default_502492 and defaultFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_502492
											.equals(defaultFlow));

									// check isomorphic binding between objects __DEC_exConvGateway_default_502492 and inFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_502492
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exConvGateway_default_502492 and outFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_502492
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
									__DEC_exConvGateway_flowElements_500789 = exConvGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
											.eContainer() : null;

									// check object __DEC_exConvGateway_flowElements_500789 is really bound
									JavaSDM.ensure(__DEC_exConvGateway_flowElements_500789 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exConvGateway_flowElements_500789
											.getFlowElements().contains(
													exConvGateway));

									// check isomorphic binding between objects __DEC_exConvGateway_flowElements_500789 and process 
									JavaSDM.ensure(!__DEC_exConvGateway_flowElements_500789
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
									__DEC_outFlow_flowElements_59079 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_59079 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_59079 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_59079
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_59079 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_59079
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link flowNodeRefs from exConvGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(exConvGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link default from outFlow to __DEC_outFlow_default_207790
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_207790 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_207790
													.hasNext()) {
										try {
											__DEC_outFlow_default_207790 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_207790
													.next();

											// check object __DEC_outFlow_default_207790 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_207790 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_207790 and exConvGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_207790
													.equals(exConvGateway));

											// check isomorphic binding between objects __DEC_outFlow_default_207790 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_207790
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

									// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_736200
									fujaba__Success = false;

									fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_736200 = new ArrayList(
											exConvGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_736200
													.hasNext()) {
										try {
											__DEC_exConvGateway_targetRef_736200 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_736200
													.next();

											// check object __DEC_exConvGateway_targetRef_736200 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_targetRef_736200 != null);
											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_736200 and defaultFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_736200
													.equals(defaultFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_736200 and inFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_736200
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_736200 and outFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_736200
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
								// check object defaultFlow is really bound
								JavaSDM.ensure(defaultFlow != null);
								// check object exConvGateway is really bound
								JavaSDM.ensure(exConvGateway != null);
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects inFlow and defaultFlow 
								JavaSDM.ensure(!inFlow.equals(defaultFlow));

								// check isomorphic binding between objects outFlow and defaultFlow 
								JavaSDM.ensure(!outFlow.equals(defaultFlow));

								// check isomorphic binding between objects exclusiveGateway and exConvGateway 
								JavaSDM.ensure(!exclusiveGateway
										.equals(exConvGateway));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to defaultFlow
								JavaSDM.ensure(defaultFlow
										.equals(exclusiveGateway.getDefault()));

								// check link default from exConvGateway to defaultFlow
								JavaSDM.ensure(!(defaultFlow
										.equals(exConvGateway.getDefault())));

								// check link default from exConvGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exConvGateway
										.getDefault())));

								// check link default from exConvGateway to outFlow
								JavaSDM.ensure(!(outFlow.equals(exConvGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

								// check link flowElements from exConvGateway to process
								JavaSDM.ensure(process.equals(exConvGateway
										.eContainer()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link incoming from inFlow to exConvGateway
								JavaSDM.ensure(exConvGateway.equals(inFlow
										.getTargetRef()));

								// check link incoming from defaultFlow to exConvGateway
								JavaSDM.ensure(!(exConvGateway
										.equals(defaultFlow.getTargetRef())));

								// check link incoming from outFlow to exConvGateway
								JavaSDM.ensure(!(exConvGateway.equals(outFlow
										.getTargetRef())));

								// check link outgoing from outFlow to exConvGateway
								JavaSDM.ensure(exConvGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_flowElements to process
								JavaSDM.ensure(process
										.equals(_edge_flowElements.getSrc()));

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
										process, inFlow, exConvGateway,
										outFlow, exclusiveGateway, defaultFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_182(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_156446 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_808189 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_206071 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_282256 = null;
		ExclusiveGateway __DEC_outFlow_default_282256 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_589490 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_589490 = null;
		Match match = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

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
					// check link incoming from inFlow to exConvGateway
					JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

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

							// check link outgoing from outFlow to exConvGateway
							JavaSDM.ensure(exConvGateway.equals(outFlow
									.getSourceRef()));

							// iterate to-many link flowElements from process to exclusiveGateway
							fujaba__Success = false;

							fujaba__IterProcessToExclusiveGateway = new ArrayList(
									process.getFlowElements()).iterator();

							while (fujaba__IterProcessToExclusiveGateway
									.hasNext()) {
								try {
									_TmpObject = fujaba__IterProcessToExclusiveGateway
											.next();

									// ensure correct type and really bound of object exclusiveGateway
									JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
									exclusiveGateway = (ExclusiveGateway) _TmpObject;
									// check isomorphic binding between objects exclusiveGateway and exConvGateway 
									JavaSDM.ensure(!exclusiveGateway
											.equals(exConvGateway));

									// bind object
									defaultFlow = exclusiveGateway.getDefault();

									// check object defaultFlow is really bound
									JavaSDM.ensure(defaultFlow != null);

									// check isomorphic binding between objects inFlow and defaultFlow 
									JavaSDM.ensure(!inFlow.equals(defaultFlow));

									// check isomorphic binding between objects outFlow and defaultFlow 
									JavaSDM.ensure(!outFlow.equals(defaultFlow));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exConvGateway_default_156446 = exConvGateway
													.getDefault();

											// check object __DEC_exConvGateway_default_156446 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_default_156446 != null);

											// check isomorphic binding between objects __DEC_exConvGateway_default_156446 and defaultFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_156446
													.equals(defaultFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_default_156446 and inFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_156446
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_default_156446 and outFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_156446
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
											__DEC_exConvGateway_flowElements_808189 = exConvGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
													.eContainer() : null;

											// check object __DEC_exConvGateway_flowElements_808189 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_flowElements_808189 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exConvGateway_flowElements_808189
													.getFlowElements()
													.contains(exConvGateway));

											// check isomorphic binding between objects __DEC_exConvGateway_flowElements_808189 and process 
											JavaSDM.ensure(!__DEC_exConvGateway_flowElements_808189
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
											__DEC_outFlow_flowElements_206071 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_206071 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_206071 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_206071
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_206071 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_206071
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link flowNodeRefs from exConvGateway
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														exConvGateway,
														Lane.class,
														"flowNodeRefs").size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link default from outFlow to __DEC_outFlow_default_282256
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_282256 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_282256
															.hasNext()) {
												try {
													__DEC_outFlow_default_282256 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_282256
															.next();

													// check object __DEC_outFlow_default_282256 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_282256 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_282256 and exConvGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_282256
															.equals(exConvGateway));

													// check isomorphic binding between objects __DEC_outFlow_default_282256 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_282256
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

											// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_589490
											fujaba__Success = false;

											fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_589490 = new ArrayList(
													exConvGateway.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_589490
															.hasNext()) {
												try {
													__DEC_exConvGateway_targetRef_589490 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_589490
															.next();

													// check object __DEC_exConvGateway_targetRef_589490 is really bound
													JavaSDM.ensure(__DEC_exConvGateway_targetRef_589490 != null);
													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_589490 and defaultFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_589490
															.equals(defaultFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_589490 and inFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_589490
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_589490 and outFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_589490
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
										// check object defaultFlow is really bound
										JavaSDM.ensure(defaultFlow != null);
										// check object exConvGateway is really bound
										JavaSDM.ensure(exConvGateway != null);
										// check object exclusiveGateway is really bound
										JavaSDM.ensure(exclusiveGateway != null);
										// check object inFlow is really bound
										JavaSDM.ensure(inFlow != null);
										// check object outFlow is really bound
										JavaSDM.ensure(outFlow != null);
										// check object process is really bound
										JavaSDM.ensure(process != null);
										// check isomorphic binding between objects inFlow and defaultFlow 
										JavaSDM.ensure(!inFlow
												.equals(defaultFlow));

										// check isomorphic binding between objects outFlow and defaultFlow 
										JavaSDM.ensure(!outFlow
												.equals(defaultFlow));

										// check isomorphic binding between objects exclusiveGateway and exConvGateway 
										JavaSDM.ensure(!exclusiveGateway
												.equals(exConvGateway));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link default from exConvGateway to defaultFlow
										JavaSDM.ensure(!(defaultFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exConvGateway to inFlow
										JavaSDM.ensure(!(inFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exConvGateway to outFlow
										JavaSDM.ensure(!(outFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(!(outFlow
												.equals(exclusiveGateway
														.getDefault())));

										// check link flowElements from exConvGateway to process
										JavaSDM.ensure(process
												.equals(exConvGateway
														.eContainer()));

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

										// check link incoming from inFlow to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from defaultFlow to exConvGateway
										JavaSDM.ensure(!(exConvGateway
												.equals(defaultFlow
														.getTargetRef())));

										// check link incoming from outFlow to exConvGateway
										JavaSDM.ensure(!(exConvGateway
												.equals(outFlow.getTargetRef())));

										// check link outgoing from outFlow to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_flowElements to process
										JavaSDM.ensure(process
												.equals(_edge_flowElements
														.getSrc()));

										// check link trg from _edge_flowElements to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(_edge_flowElements
														.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exConvGateway, outFlow,
														exclusiveGateway,
														defaultFlow);
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
													__result.getContents().add(
															match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_183(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_456647 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_380859 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_816963 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_861378 = null;
		ExclusiveGateway __DEC_outFlow_default_861378 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_244359 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_244359 = null;
		Match match = null;
		Iterator fujaba__IterProcessToOutFlow = null;
		SequenceFlow outFlow = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

			// check link incoming from inFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

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
					// check isomorphic binding between objects exclusiveGateway and exConvGateway 
					JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

					// bind object
					defaultFlow = exclusiveGateway.getDefault();

					// check object defaultFlow is really bound
					JavaSDM.ensure(defaultFlow != null);

					// check isomorphic binding between objects inFlow and defaultFlow 
					JavaSDM.ensure(!inFlow.equals(defaultFlow));

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
							// check isomorphic binding between objects outFlow and defaultFlow 
							JavaSDM.ensure(!outFlow.equals(defaultFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link outgoing from outFlow to exConvGateway
							JavaSDM.ensure(exConvGateway.equals(outFlow
									.getSourceRef()));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exConvGateway_default_456647 = exConvGateway
											.getDefault();

									// check object __DEC_exConvGateway_default_456647 is really bound
									JavaSDM.ensure(__DEC_exConvGateway_default_456647 != null);

									// check isomorphic binding between objects __DEC_exConvGateway_default_456647 and defaultFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_456647
											.equals(defaultFlow));

									// check isomorphic binding between objects __DEC_exConvGateway_default_456647 and inFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_456647
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exConvGateway_default_456647 and outFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_456647
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
									__DEC_exConvGateway_flowElements_380859 = exConvGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
											.eContainer() : null;

									// check object __DEC_exConvGateway_flowElements_380859 is really bound
									JavaSDM.ensure(__DEC_exConvGateway_flowElements_380859 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exConvGateway_flowElements_380859
											.getFlowElements().contains(
													exConvGateway));

									// check isomorphic binding between objects __DEC_exConvGateway_flowElements_380859 and process 
									JavaSDM.ensure(!__DEC_exConvGateway_flowElements_380859
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
									__DEC_outFlow_flowElements_816963 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_816963 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_816963 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_816963
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_816963 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_816963
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link flowNodeRefs from exConvGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(exConvGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link default from outFlow to __DEC_outFlow_default_861378
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_861378 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_861378
													.hasNext()) {
										try {
											__DEC_outFlow_default_861378 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_861378
													.next();

											// check object __DEC_outFlow_default_861378 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_861378 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_861378 and exConvGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_861378
													.equals(exConvGateway));

											// check isomorphic binding between objects __DEC_outFlow_default_861378 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_861378
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

									// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_244359
									fujaba__Success = false;

									fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_244359 = new ArrayList(
											exConvGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_244359
													.hasNext()) {
										try {
											__DEC_exConvGateway_targetRef_244359 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_244359
													.next();

											// check object __DEC_exConvGateway_targetRef_244359 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_targetRef_244359 != null);
											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_244359 and defaultFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_244359
													.equals(defaultFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_244359 and inFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_244359
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_244359 and outFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_244359
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
								// check object defaultFlow is really bound
								JavaSDM.ensure(defaultFlow != null);
								// check object exConvGateway is really bound
								JavaSDM.ensure(exConvGateway != null);
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects inFlow and defaultFlow 
								JavaSDM.ensure(!inFlow.equals(defaultFlow));

								// check isomorphic binding between objects outFlow and defaultFlow 
								JavaSDM.ensure(!outFlow.equals(defaultFlow));

								// check isomorphic binding between objects exclusiveGateway and exConvGateway 
								JavaSDM.ensure(!exclusiveGateway
										.equals(exConvGateway));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to defaultFlow
								JavaSDM.ensure(defaultFlow
										.equals(exclusiveGateway.getDefault()));

								// check link default from exConvGateway to defaultFlow
								JavaSDM.ensure(!(defaultFlow
										.equals(exConvGateway.getDefault())));

								// check link default from exConvGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exConvGateway
										.getDefault())));

								// check link default from exConvGateway to outFlow
								JavaSDM.ensure(!(outFlow.equals(exConvGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

								// check link flowElements from exConvGateway to process
								JavaSDM.ensure(process.equals(exConvGateway
										.eContainer()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link incoming from inFlow to exConvGateway
								JavaSDM.ensure(exConvGateway.equals(inFlow
										.getTargetRef()));

								// check link incoming from defaultFlow to exConvGateway
								JavaSDM.ensure(!(exConvGateway
										.equals(defaultFlow.getTargetRef())));

								// check link incoming from outFlow to exConvGateway
								JavaSDM.ensure(!(exConvGateway.equals(outFlow
										.getTargetRef())));

								// check link outgoing from outFlow to exConvGateway
								JavaSDM.ensure(exConvGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_targetRef to inFlow
								JavaSDM.ensure(inFlow.equals(_edge_targetRef
										.getSrc()));

								// check link trg from _edge_targetRef to exConvGateway
								JavaSDM.ensure(exConvGateway
										.equals(_edge_targetRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, exConvGateway,
										outFlow, exclusiveGateway, defaultFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_184(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_885553 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_314078 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_171428 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_722477 = null;
		ExclusiveGateway __DEC_outFlow_default_722477 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_936726 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_936726 = null;
		Match match = null;
		Iterator fujaba__IterExConvGatewayTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Iterator fujaba__IterExConvGatewayToOutFlow = null;
		SequenceFlow outFlow = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow inFlow = null;
		Process process = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// bind object
			_TmpObject = exConvGateway.eContainer() instanceof Process ? (Process) exConvGateway
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(exConvGateway));

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from inFlow to process
			JavaSDM.ensure(process.equals(inFlow.eContainer()));

			// check link incoming from inFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

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
					// check isomorphic binding between objects exclusiveGateway and exConvGateway 
					JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

					// bind object
					defaultFlow = exclusiveGateway.getDefault();

					// check object defaultFlow is really bound
					JavaSDM.ensure(defaultFlow != null);

					// check isomorphic binding between objects inFlow and defaultFlow 
					JavaSDM.ensure(!inFlow.equals(defaultFlow));

					// iterate to-many link outgoing from exConvGateway to outFlow
					fujaba__Success = false;

					fujaba__IterExConvGatewayToOutFlow = new ArrayList(
							exConvGateway.getOutgoing()).iterator();

					while (fujaba__IterExConvGatewayToOutFlow.hasNext()) {
						try {
							outFlow = (SequenceFlow) fujaba__IterExConvGatewayToOutFlow
									.next();

							// check object outFlow is really bound
							JavaSDM.ensure(outFlow != null);
							// check isomorphic binding between objects outFlow and defaultFlow 
							JavaSDM.ensure(!outFlow.equals(defaultFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link flowElements from outFlow to process
							JavaSDM.ensure(process.equals(outFlow.eContainer()));

							// iterate to-many link trg from exConvGateway to _edge_targetRef
							fujaba__Success = false;

							fujaba__IterExConvGatewayTo_edge_targetRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(
													exConvGateway,
													EMoflonEdge.class, "trg"))
									.iterator();

							while (fujaba__IterExConvGatewayTo_edge_targetRef
									.hasNext()) {
								try {
									_edge_targetRef = (EMoflonEdge) fujaba__IterExConvGatewayTo_edge_targetRef
											.next();

									// check object _edge_targetRef is really bound
									JavaSDM.ensure(_edge_targetRef != null);
									// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
									JavaSDM.ensure(!_edge_targetRef
											.equals(_edge_incoming));

									// check link src from _edge_targetRef to inFlow
									JavaSDM.ensure(inFlow
											.equals(_edge_targetRef.getSrc()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exConvGateway_default_885553 = exConvGateway
													.getDefault();

											// check object __DEC_exConvGateway_default_885553 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_default_885553 != null);

											// check isomorphic binding between objects __DEC_exConvGateway_default_885553 and defaultFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_885553
													.equals(defaultFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_default_885553 and inFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_885553
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_default_885553 and outFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_885553
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
											__DEC_exConvGateway_flowElements_314078 = exConvGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
													.eContainer() : null;

											// check object __DEC_exConvGateway_flowElements_314078 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_flowElements_314078 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exConvGateway_flowElements_314078
													.getFlowElements()
													.contains(exConvGateway));

											// check isomorphic binding between objects __DEC_exConvGateway_flowElements_314078 and process 
											JavaSDM.ensure(!__DEC_exConvGateway_flowElements_314078
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
											__DEC_outFlow_flowElements_171428 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_171428 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_171428 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_171428
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_171428 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_171428
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link flowNodeRefs from exConvGateway
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														exConvGateway,
														Lane.class,
														"flowNodeRefs").size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link default from outFlow to __DEC_outFlow_default_722477
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_722477 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_722477
															.hasNext()) {
												try {
													__DEC_outFlow_default_722477 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_722477
															.next();

													// check object __DEC_outFlow_default_722477 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_722477 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_722477 and exConvGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_722477
															.equals(exConvGateway));

													// check isomorphic binding between objects __DEC_outFlow_default_722477 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_722477
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

											// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_936726
											fujaba__Success = false;

											fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_936726 = new ArrayList(
													exConvGateway.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_936726
															.hasNext()) {
												try {
													__DEC_exConvGateway_targetRef_936726 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_936726
															.next();

													// check object __DEC_exConvGateway_targetRef_936726 is really bound
													JavaSDM.ensure(__DEC_exConvGateway_targetRef_936726 != null);
													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_936726 and defaultFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_936726
															.equals(defaultFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_936726 and inFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_936726
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_936726 and outFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_936726
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
										// check object defaultFlow is really bound
										JavaSDM.ensure(defaultFlow != null);
										// check object exConvGateway is really bound
										JavaSDM.ensure(exConvGateway != null);
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

										// check isomorphic binding between objects inFlow and defaultFlow 
										JavaSDM.ensure(!inFlow
												.equals(defaultFlow));

										// check isomorphic binding between objects outFlow and defaultFlow 
										JavaSDM.ensure(!outFlow
												.equals(defaultFlow));

										// check isomorphic binding between objects exclusiveGateway and exConvGateway 
										JavaSDM.ensure(!exclusiveGateway
												.equals(exConvGateway));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link default from exConvGateway to defaultFlow
										JavaSDM.ensure(!(defaultFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exConvGateway to inFlow
										JavaSDM.ensure(!(inFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exConvGateway to outFlow
										JavaSDM.ensure(!(outFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(!(outFlow
												.equals(exclusiveGateway
														.getDefault())));

										// check link flowElements from exConvGateway to process
										JavaSDM.ensure(process
												.equals(exConvGateway
														.eContainer()));

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

										// check link incoming from inFlow to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from defaultFlow to exConvGateway
										JavaSDM.ensure(!(exConvGateway
												.equals(defaultFlow
														.getTargetRef())));

										// check link incoming from outFlow to exConvGateway
										JavaSDM.ensure(!(exConvGateway
												.equals(outFlow.getTargetRef())));

										// check link outgoing from outFlow to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_incoming to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(_edge_incoming.getSrc()));

										// check link src from _edge_targetRef to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_targetRef
														.getSrc()));

										// check link trg from _edge_incoming to inFlow
										JavaSDM.ensure(inFlow
												.equals(_edge_incoming.getTrg()));

										// check link trg from _edge_targetRef to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(_edge_targetRef
														.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exConvGateway, outFlow,
														exclusiveGateway,
														defaultFlow);
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
													__result.getContents().add(
															match);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_185(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_911118 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_50531 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_43620 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_841214 = null;
		ExclusiveGateway __DEC_outFlow_default_841214 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_721947 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_721947 = null;
		Match match = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ExclusiveGateway exConvGateway = null;
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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

			// check link outgoing from outFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(outFlow.getSourceRef()));

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

					// check link incoming from inFlow to exConvGateway
					JavaSDM.ensure(exConvGateway.equals(inFlow.getTargetRef()));

					// iterate to-many link flowElements from process to exclusiveGateway
					fujaba__Success = false;

					fujaba__IterProcessToExclusiveGateway = new ArrayList(
							process.getFlowElements()).iterator();

					while (fujaba__IterProcessToExclusiveGateway.hasNext()) {
						try {
							_TmpObject = fujaba__IterProcessToExclusiveGateway
									.next();

							// ensure correct type and really bound of object exclusiveGateway
							JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
							exclusiveGateway = (ExclusiveGateway) _TmpObject;
							// check isomorphic binding between objects exclusiveGateway and exConvGateway 
							JavaSDM.ensure(!exclusiveGateway
									.equals(exConvGateway));

							// bind object
							defaultFlow = exclusiveGateway.getDefault();

							// check object defaultFlow is really bound
							JavaSDM.ensure(defaultFlow != null);

							// check isomorphic binding between objects inFlow and defaultFlow 
							JavaSDM.ensure(!inFlow.equals(defaultFlow));

							// check isomorphic binding between objects outFlow and defaultFlow 
							JavaSDM.ensure(!outFlow.equals(defaultFlow));

							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_exConvGateway_default_911118 = exConvGateway
											.getDefault();

									// check object __DEC_exConvGateway_default_911118 is really bound
									JavaSDM.ensure(__DEC_exConvGateway_default_911118 != null);

									// check isomorphic binding between objects __DEC_exConvGateway_default_911118 and defaultFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_911118
											.equals(defaultFlow));

									// check isomorphic binding between objects __DEC_exConvGateway_default_911118 and inFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_911118
											.equals(inFlow));

									// check isomorphic binding between objects __DEC_exConvGateway_default_911118 and outFlow 
									JavaSDM.ensure(!__DEC_exConvGateway_default_911118
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
									__DEC_exConvGateway_flowElements_50531 = exConvGateway
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
											.eContainer() : null;

									// check object __DEC_exConvGateway_flowElements_50531 is really bound
									JavaSDM.ensure(__DEC_exConvGateway_flowElements_50531 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_exConvGateway_flowElements_50531
											.getFlowElements().contains(
													exConvGateway));

									// check isomorphic binding between objects __DEC_exConvGateway_flowElements_50531 and process 
									JavaSDM.ensure(!__DEC_exConvGateway_flowElements_50531
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
									__DEC_outFlow_flowElements_43620 = outFlow
											.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
											.eContainer() : null;

									// check object __DEC_outFlow_flowElements_43620 is really bound
									JavaSDM.ensure(__DEC_outFlow_flowElements_43620 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_outFlow_flowElements_43620
											.getFlowElements()
											.contains(outFlow));

									// check isomorphic binding between objects __DEC_outFlow_flowElements_43620 and process 
									JavaSDM.ensure(!__DEC_outFlow_flowElements_43620
											.equals(process));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// negative check for link flowNodeRefs from exConvGateway
								JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
										.getOppositeReference(exConvGateway,
												Lane.class, "flowNodeRefs")
										.size() == 0);
								// check negative bindings
								try {
									fujaba__Success = false;

									// iterate to-many link default from outFlow to __DEC_outFlow_default_841214
									fujaba__Success = false;

									fujaba__IterOutFlowTo__DEC_outFlow_default_841214 = new ArrayList(
											org.moflon.util.eMoflonEMFUtil
													.getOppositeReference(
															outFlow,
															ExclusiveGateway.class,
															"default"))
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterOutFlowTo__DEC_outFlow_default_841214
													.hasNext()) {
										try {
											__DEC_outFlow_default_841214 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_841214
													.next();

											// check object __DEC_outFlow_default_841214 is really bound
											JavaSDM.ensure(__DEC_outFlow_default_841214 != null);
											// check isomorphic binding between objects __DEC_outFlow_default_841214 and exConvGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_841214
													.equals(exConvGateway));

											// check isomorphic binding between objects __DEC_outFlow_default_841214 and exclusiveGateway 
											JavaSDM.ensure(!__DEC_outFlow_default_841214
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

									// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_721947
									fujaba__Success = false;

									fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_721947 = new ArrayList(
											exConvGateway.getIncoming())
											.iterator();

									while (!(fujaba__Success)
											&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_721947
													.hasNext()) {
										try {
											__DEC_exConvGateway_targetRef_721947 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_721947
													.next();

											// check object __DEC_exConvGateway_targetRef_721947 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_targetRef_721947 != null);
											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_721947 and defaultFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_721947
													.equals(defaultFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_721947 and inFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_721947
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_targetRef_721947 and outFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_targetRef_721947
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
								// check object defaultFlow is really bound
								JavaSDM.ensure(defaultFlow != null);
								// check object exConvGateway is really bound
								JavaSDM.ensure(exConvGateway != null);
								// check object exclusiveGateway is really bound
								JavaSDM.ensure(exclusiveGateway != null);
								// check object inFlow is really bound
								JavaSDM.ensure(inFlow != null);
								// check object outFlow is really bound
								JavaSDM.ensure(outFlow != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check isomorphic binding between objects inFlow and defaultFlow 
								JavaSDM.ensure(!inFlow.equals(defaultFlow));

								// check isomorphic binding between objects outFlow and defaultFlow 
								JavaSDM.ensure(!outFlow.equals(defaultFlow));

								// check isomorphic binding between objects exclusiveGateway and exConvGateway 
								JavaSDM.ensure(!exclusiveGateway
										.equals(exConvGateway));

								// check isomorphic binding between objects outFlow and inFlow 
								JavaSDM.ensure(!outFlow.equals(inFlow));

								// check link default from exclusiveGateway to defaultFlow
								JavaSDM.ensure(defaultFlow
										.equals(exclusiveGateway.getDefault()));

								// check link default from exConvGateway to defaultFlow
								JavaSDM.ensure(!(defaultFlow
										.equals(exConvGateway.getDefault())));

								// check link default from exConvGateway to inFlow
								JavaSDM.ensure(!(inFlow.equals(exConvGateway
										.getDefault())));

								// check link default from exConvGateway to outFlow
								JavaSDM.ensure(!(outFlow.equals(exConvGateway
										.getDefault())));

								// check link default from exclusiveGateway to outFlow
								JavaSDM.ensure(!(outFlow
										.equals(exclusiveGateway.getDefault())));

								// check link flowElements from exConvGateway to process
								JavaSDM.ensure(process.equals(exConvGateway
										.eContainer()));

								// check link flowElements from exclusiveGateway to process
								JavaSDM.ensure(process.equals(exclusiveGateway
										.eContainer()));

								// check link flowElements from inFlow to process
								JavaSDM.ensure(process.equals(inFlow
										.eContainer()));

								// check link flowElements from outFlow to process
								JavaSDM.ensure(process.equals(outFlow
										.eContainer()));

								// check link incoming from inFlow to exConvGateway
								JavaSDM.ensure(exConvGateway.equals(inFlow
										.getTargetRef()));

								// check link incoming from defaultFlow to exConvGateway
								JavaSDM.ensure(!(exConvGateway
										.equals(defaultFlow.getTargetRef())));

								// check link incoming from outFlow to exConvGateway
								JavaSDM.ensure(!(exConvGateway.equals(outFlow
										.getTargetRef())));

								// check link outgoing from outFlow to exConvGateway
								JavaSDM.ensure(exConvGateway.equals(outFlow
										.getSourceRef()));

								// check link src from _edge_sourceRef to outFlow
								JavaSDM.ensure(outFlow.equals(_edge_sourceRef
										.getSrc()));

								// check link trg from _edge_sourceRef to exConvGateway
								JavaSDM.ensure(exConvGateway
										.equals(_edge_sourceRef.getTrg()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_FWD(match,
										process, inFlow, exConvGateway,
										outFlow, exclusiveGateway, defaultFlow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_186(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		SequenceFlow __DEC_exConvGateway_default_156763 = null;
		FlowElementsContainer __DEC_exConvGateway_flowElements_874001 = null;
		FlowElementsContainer __DEC_outFlow_flowElements_288176 = null;
		Iterator fujaba__IterOutFlowTo__DEC_outFlow_default_713169 = null;
		ExclusiveGateway __DEC_outFlow_default_713169 = null;
		Iterator fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_496526 = null;
		SequenceFlow __DEC_exConvGateway_targetRef_496526 = null;
		Match match = null;
		Iterator fujaba__IterOutFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		SequenceFlow defaultFlow = null;
		Iterator fujaba__IterProcessToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		Process process = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exConvGateway = null;

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

			// ensure correct type and really bound of object exConvGateway
			JavaSDM.ensure(_TmpObject instanceof ExclusiveGateway);
			exConvGateway = (ExclusiveGateway) _TmpObject;

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

			// check link flowElements from exConvGateway to process
			JavaSDM.ensure(process.equals(exConvGateway.eContainer()));

			// check link outgoing from outFlow to exConvGateway
			JavaSDM.ensure(exConvGateway.equals(outFlow.getSourceRef()));

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
					// check isomorphic binding between objects exclusiveGateway and exConvGateway 
					JavaSDM.ensure(!exclusiveGateway.equals(exConvGateway));

					// bind object
					defaultFlow = exclusiveGateway.getDefault();

					// check object defaultFlow is really bound
					JavaSDM.ensure(defaultFlow != null);

					// check isomorphic binding between objects outFlow and defaultFlow 
					JavaSDM.ensure(!outFlow.equals(defaultFlow));

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
							// check isomorphic binding between objects inFlow and defaultFlow 
							JavaSDM.ensure(!inFlow.equals(defaultFlow));

							// check isomorphic binding between objects outFlow and inFlow 
							JavaSDM.ensure(!outFlow.equals(inFlow));

							// check link incoming from inFlow to exConvGateway
							JavaSDM.ensure(exConvGateway.equals(inFlow
									.getTargetRef()));

							// iterate to-many link src from outFlow to _edge_sourceRef
							fujaba__Success = false;

							fujaba__IterOutFlowTo_edge_sourceRef = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(outFlow,
													EMoflonEdge.class, "src"))
									.iterator();

							while (fujaba__IterOutFlowTo_edge_sourceRef
									.hasNext()) {
								try {
									_edge_sourceRef = (EMoflonEdge) fujaba__IterOutFlowTo_edge_sourceRef
											.next();

									// check object _edge_sourceRef is really bound
									JavaSDM.ensure(_edge_sourceRef != null);
									// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
									JavaSDM.ensure(!_edge_sourceRef
											.equals(_edge_outgoing));

									// check link trg from _edge_sourceRef to exConvGateway
									JavaSDM.ensure(exConvGateway
											.equals(_edge_sourceRef.getTrg()));

									// story node 'test core match and DECs'
									try {
										fujaba__Success = false;

										// check negative bindings
										try {
											fujaba__Success = false;

											// bind object
											__DEC_exConvGateway_default_156763 = exConvGateway
													.getDefault();

											// check object __DEC_exConvGateway_default_156763 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_default_156763 != null);

											// check isomorphic binding between objects __DEC_exConvGateway_default_156763 and defaultFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_156763
													.equals(defaultFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_default_156763 and inFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_156763
													.equals(inFlow));

											// check isomorphic binding between objects __DEC_exConvGateway_default_156763 and outFlow 
											JavaSDM.ensure(!__DEC_exConvGateway_default_156763
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
											__DEC_exConvGateway_flowElements_874001 = exConvGateway
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) exConvGateway
													.eContainer() : null;

											// check object __DEC_exConvGateway_flowElements_874001 is really bound
											JavaSDM.ensure(__DEC_exConvGateway_flowElements_874001 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_exConvGateway_flowElements_874001
													.getFlowElements()
													.contains(exConvGateway));

											// check isomorphic binding between objects __DEC_exConvGateway_flowElements_874001 and process 
											JavaSDM.ensure(!__DEC_exConvGateway_flowElements_874001
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
											__DEC_outFlow_flowElements_288176 = outFlow
													.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) outFlow
													.eContainer() : null;

											// check object __DEC_outFlow_flowElements_288176 is really bound
											JavaSDM.ensure(__DEC_outFlow_flowElements_288176 != null);

											// check if contained via correct reference
											JavaSDM.ensure(__DEC_outFlow_flowElements_288176
													.getFlowElements()
													.contains(outFlow));

											// check isomorphic binding between objects __DEC_outFlow_flowElements_288176 and process 
											JavaSDM.ensure(!__DEC_outFlow_flowElements_288176
													.equals(process));

											fujaba__Success = true;
										} catch (JavaSDMException fujaba__InternalException) {
											fujaba__Success = false;
										}

										fujaba__Success = !(fujaba__Success);

										JavaSDM.ensure(fujaba__Success);

										// negative check for link flowNodeRefs from exConvGateway
										JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
												.getOppositeReference(
														exConvGateway,
														Lane.class,
														"flowNodeRefs").size() == 0);
										// check negative bindings
										try {
											fujaba__Success = false;

											// iterate to-many link default from outFlow to __DEC_outFlow_default_713169
											fujaba__Success = false;

											fujaba__IterOutFlowTo__DEC_outFlow_default_713169 = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	outFlow,
																	ExclusiveGateway.class,
																	"default"))
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterOutFlowTo__DEC_outFlow_default_713169
															.hasNext()) {
												try {
													__DEC_outFlow_default_713169 = (ExclusiveGateway) fujaba__IterOutFlowTo__DEC_outFlow_default_713169
															.next();

													// check object __DEC_outFlow_default_713169 is really bound
													JavaSDM.ensure(__DEC_outFlow_default_713169 != null);
													// check isomorphic binding between objects __DEC_outFlow_default_713169 and exConvGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_713169
															.equals(exConvGateway));

													// check isomorphic binding between objects __DEC_outFlow_default_713169 and exclusiveGateway 
													JavaSDM.ensure(!__DEC_outFlow_default_713169
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

											// iterate to-many link incoming from exConvGateway to __DEC_exConvGateway_targetRef_496526
											fujaba__Success = false;

											fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_496526 = new ArrayList(
													exConvGateway.getIncoming())
													.iterator();

											while (!(fujaba__Success)
													&& fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_496526
															.hasNext()) {
												try {
													__DEC_exConvGateway_targetRef_496526 = (SequenceFlow) fujaba__IterExConvGatewayTo__DEC_exConvGateway_targetRef_496526
															.next();

													// check object __DEC_exConvGateway_targetRef_496526 is really bound
													JavaSDM.ensure(__DEC_exConvGateway_targetRef_496526 != null);
													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_496526 and defaultFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_496526
															.equals(defaultFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_496526 and inFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_496526
															.equals(inFlow));

													// check isomorphic binding between objects __DEC_exConvGateway_targetRef_496526 and outFlow 
													JavaSDM.ensure(!__DEC_exConvGateway_targetRef_496526
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
										// check object defaultFlow is really bound
										JavaSDM.ensure(defaultFlow != null);
										// check object exConvGateway is really bound
										JavaSDM.ensure(exConvGateway != null);
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

										// check isomorphic binding between objects inFlow and defaultFlow 
										JavaSDM.ensure(!inFlow
												.equals(defaultFlow));

										// check isomorphic binding between objects outFlow and defaultFlow 
										JavaSDM.ensure(!outFlow
												.equals(defaultFlow));

										// check isomorphic binding between objects exclusiveGateway and exConvGateway 
										JavaSDM.ensure(!exclusiveGateway
												.equals(exConvGateway));

										// check isomorphic binding between objects outFlow and inFlow 
										JavaSDM.ensure(!outFlow.equals(inFlow));

										// check link default from exclusiveGateway to defaultFlow
										JavaSDM.ensure(defaultFlow
												.equals(exclusiveGateway
														.getDefault()));

										// check link default from exConvGateway to defaultFlow
										JavaSDM.ensure(!(defaultFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exConvGateway to inFlow
										JavaSDM.ensure(!(inFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exConvGateway to outFlow
										JavaSDM.ensure(!(outFlow
												.equals(exConvGateway
														.getDefault())));

										// check link default from exclusiveGateway to outFlow
										JavaSDM.ensure(!(outFlow
												.equals(exclusiveGateway
														.getDefault())));

										// check link flowElements from exConvGateway to process
										JavaSDM.ensure(process
												.equals(exConvGateway
														.eContainer()));

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

										// check link incoming from inFlow to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(inFlow.getTargetRef()));

										// check link incoming from defaultFlow to exConvGateway
										JavaSDM.ensure(!(exConvGateway
												.equals(defaultFlow
														.getTargetRef())));

										// check link incoming from outFlow to exConvGateway
										JavaSDM.ensure(!(exConvGateway
												.equals(outFlow.getTargetRef())));

										// check link outgoing from outFlow to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(outFlow.getSourceRef()));

										// check link src from _edge_outgoing to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(_edge_outgoing.getSrc()));

										// check link src from _edge_sourceRef to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_sourceRef
														.getSrc()));

										// check link trg from _edge_outgoing to outFlow
										JavaSDM.ensure(outFlow
												.equals(_edge_outgoing.getTrg()));

										// check link trg from _edge_sourceRef to exConvGateway
										JavaSDM.ensure(exConvGateway
												.equals(_edge_sourceRef
														.getTrg()));

										// create object match
										match = TGGRuntimeFactory.eINSTANCE
												.createMatch();

										// assign attribute match
										match.setRuleName(__eClass.getName());
										// statement node 'bookkeeping with generic isAppropriate method'
										fujaba__Success = this
												.isAppropriate_FWD(match,
														process, inFlow,
														exConvGateway, outFlow,
														exclusiveGateway,
														defaultFlow);
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
													__result.getContents().add(
															match);

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
			SequenceFlowToUCFlow defaultFlowToInitFlowDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		SequenceFlow outFlow = null;
		ExclusiveGateway exConvGateway = null;
		FlowNodeToStep exConvGatewayToNormalStep = null;
		SequenceFlowToUCFlow outFlowToInitFlow = null;
		SequenceFlowToStep outFlowToNormalStep = null;
		Iterator fujaba__IterNormalStepToAlt = null;
		AlternativeFlowAlternative alt = null;
		NormalStep normalStep = null;
		Iterator fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep = null;
		FlowNodeToStep exclusiveGatewayToNormalStep = null;
		Iterator fujaba__IterFlowToStep = null;
		Step step = null;
		AlternativeFlow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterInFlowToInFlowToStep = null;
		SequenceFlowToStep inFlowToStep = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		Process process = null;
		Iterator fujaba__IterDefaultFlowToExclusiveGateway = null;
		ExclusiveGateway exclusiveGateway = null;
		SequenceFlow defaultFlow = null;
		Flow initFlow = null;
		Iterator fujaba__IterDefaultFlowToInitFlowListToDefaultFlowToInitFlow = null;
		SequenceFlowToUCFlow defaultFlowToInitFlow = null;
		Iterator fujaba__IterRuleEntryContainerToDefaultFlowToInitFlowList = null;
		RuleEntryList defaultFlowToInitFlowList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to defaultFlowToInitFlowList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToDefaultFlowToInitFlowList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToDefaultFlowToInitFlowList
					.hasNext()) {
				try {
					defaultFlowToInitFlowList = (RuleEntryList) fujaba__IterRuleEntryContainerToDefaultFlowToInitFlowList
							.next();

					// check object defaultFlowToInitFlowList is really bound
					JavaSDM.ensure(defaultFlowToInitFlowList != null);
					// iterate to-many link entryObjects from defaultFlowToInitFlowList to defaultFlowToInitFlow
					fujaba__Success = false;

					fujaba__IterDefaultFlowToInitFlowListToDefaultFlowToInitFlow = new ArrayList(
							defaultFlowToInitFlowList.getEntryObjects())
							.iterator();

					while (fujaba__IterDefaultFlowToInitFlowListToDefaultFlowToInitFlow
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterDefaultFlowToInitFlowListToDefaultFlowToInitFlow
									.next();

							// ensure correct type and really bound of object defaultFlowToInitFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
							defaultFlowToInitFlow = (SequenceFlowToUCFlow) _TmpObject;
							// bind object
							initFlow = defaultFlowToInitFlow.getTarget();

							// check object initFlow is really bound
							JavaSDM.ensure(initFlow != null);

							// bind object
							defaultFlow = defaultFlowToInitFlow.getSource();

							// check object defaultFlow is really bound
							JavaSDM.ensure(defaultFlow != null);

							// iterate to-many link default from defaultFlow to exclusiveGateway
							fujaba__Success = false;

							fujaba__IterDefaultFlowToExclusiveGateway = new ArrayList(
									org.moflon.util.eMoflonEMFUtil
											.getOppositeReference(defaultFlow,
													ExclusiveGateway.class,
													"default")).iterator();

							while (fujaba__IterDefaultFlowToExclusiveGateway
									.hasNext()) {
								try {
									exclusiveGateway = (ExclusiveGateway) fujaba__IterDefaultFlowToExclusiveGateway
											.next();

									// check object exclusiveGateway is really bound
									JavaSDM.ensure(exclusiveGateway != null);
									// bind object
									_TmpObject = exclusiveGateway.eContainer() instanceof Process ? (Process) exclusiveGateway
											.eContainer() : null;

									// ensure correct type and really bound of object process
									JavaSDM.ensure(_TmpObject instanceof Process);
									process = (Process) _TmpObject;

									// check if contained via correct reference
									JavaSDM.ensure(process.getFlowElements()
											.contains(exclusiveGateway));

									// iterate to-many link flowElements from process to inFlow
									fujaba__Success = false;

									fujaba__IterProcessToInFlow = new ArrayList(
											process.getFlowElements())
											.iterator();

									while (fujaba__IterProcessToInFlow
											.hasNext()) {
										try {
											_TmpObject = fujaba__IterProcessToInFlow
													.next();

											// ensure correct type and really bound of object inFlow
											JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
											inFlow = (SequenceFlow) _TmpObject;
											// check isomorphic binding between objects inFlow and defaultFlow 
											JavaSDM.ensure(!inFlow
													.equals(defaultFlow));

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
													// iterate to-many link source from inFlow to inFlowToFlow
													fujaba__Success = false;

													fujaba__IterInFlowToInFlowToFlow = new ArrayList(
															org.moflon.util.eMoflonEMFUtil
																	.getOppositeReference(
																			inFlow,
																			SequenceFlowToUCFlow.class,
																			"source"))
															.iterator();

													while (fujaba__IterInFlowToInFlowToFlow
															.hasNext()) {
														try {
															inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
																	.next();

															// check object inFlowToFlow is really bound
															JavaSDM.ensure(inFlowToFlow != null);
															// check isomorphic binding between objects inFlowToFlow and defaultFlowToInitFlow 
															JavaSDM.ensure(!inFlowToFlow
																	.equals(defaultFlowToInitFlow));

															// bind object
															_TmpObject = inFlowToFlow
																	.getTarget();

															// ensure correct type and really bound of object flow
															JavaSDM.ensure(_TmpObject instanceof AlternativeFlow);
															flow = (AlternativeFlow) _TmpObject;

															// check isomorphic binding between objects initFlow and flow 
															JavaSDM.ensure(!initFlow
																	.equals(flow));

															// iterate to-many link steps from flow to step
															fujaba__Success = false;

															fujaba__IterFlowToStep = new ArrayList(
																	flow.getSteps())
																	.iterator();

															while (fujaba__IterFlowToStep
																	.hasNext()) {
																try {
																	step = (Step) fujaba__IterFlowToStep
																			.next();

																	// check object step is really bound
																	JavaSDM.ensure(step != null);
																	// check link target from inFlowToStep to step
																	JavaSDM.ensure(step
																			.equals(inFlowToStep
																					.getTarget()));

																	// iterate to-many link source from exclusiveGateway to exclusiveGatewayToNormalStep
																	fujaba__Success = false;

																	fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep = new ArrayList(
																			org.moflon.util.eMoflonEMFUtil
																					.getOppositeReference(
																							exclusiveGateway,
																							FlowNodeToStep.class,
																							"source"))
																			.iterator();

																	while (fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep
																			.hasNext()) {
																		try {
																			exclusiveGatewayToNormalStep = (FlowNodeToStep) fujaba__IterExclusiveGatewayToExclusiveGatewayToNormalStep
																					.next();

																			// check object exclusiveGatewayToNormalStep is really bound
																			JavaSDM.ensure(exclusiveGatewayToNormalStep != null);
																			// bind object
																			_TmpObject = exclusiveGatewayToNormalStep
																					.getTarget();

																			// ensure correct type and really bound of object normalStep
																			JavaSDM.ensure(_TmpObject instanceof NormalStep);
																			normalStep = (NormalStep) _TmpObject;

																			// check isomorphic binding between objects step and normalStep 
																			JavaSDM.ensure(!step
																					.equals(normalStep));

																			// check link steps from normalStep to initFlow
																			JavaSDM.ensure(initFlow
																					.equals(normalStep
																							.eContainer()));

																			// iterate to-many link stepAlternative from normalStep to alt
																			fujaba__Success = false;

																			fujaba__IterNormalStepToAlt = new ArrayList(
																					normalStep
																							.getStepAlternative())
																					.iterator();

																			while (fujaba__IterNormalStepToAlt
																					.hasNext()) {
																				try {
																					_TmpObject = fujaba__IterNormalStepToAlt
																							.next();

																					// ensure correct type and really bound of object alt
																					JavaSDM.ensure(_TmpObject instanceof AlternativeFlowAlternative);
																					alt = (AlternativeFlowAlternative) _TmpObject;
																					// check link ref from alt to flow
																					JavaSDM.ensure(flow
																							.equals(alt
																									.getRef()));

																					// story node 'solve CSP'
																					try {
																						fujaba__Success = false;

																						_TmpObject = (this
																								.generateModel_solveCsp_BWD(
																										isApplicableMatch,
																										process,
																										inFlow,
																										exConvGateway,
																										outFlow,
																										flow,
																										inFlowToFlow,
																										step,
																										inFlowToStep,
																										normalStep,
																										exConvGatewayToNormalStep,
																										alt,
																										initFlow,
																										outFlowToInitFlow,
																										outFlowToNormalStep,
																										exclusiveGateway,
																										exclusiveGatewayToNormalStep,
																										defaultFlow,
																										defaultFlowToInitFlow,
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
																							// check object defaultFlow is really bound
																							JavaSDM.ensure(defaultFlow != null);
																							// check object defaultFlowToInitFlow is really bound
																							JavaSDM.ensure(defaultFlowToInitFlow != null);
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
																							// check object process is really bound
																							JavaSDM.ensure(process != null);
																							// check object ruleResult is really bound
																							JavaSDM.ensure(ruleResult != null);
																							// check object step is really bound
																							JavaSDM.ensure(step != null);
																							// check isomorphic binding between objects inFlow and defaultFlow 
																							JavaSDM.ensure(!inFlow
																									.equals(defaultFlow));

																							// check isomorphic binding between objects inFlowToFlow and defaultFlowToInitFlow 
																							JavaSDM.ensure(!inFlowToFlow
																									.equals(defaultFlowToInitFlow));

																							// check isomorphic binding between objects initFlow and flow 
																							JavaSDM.ensure(!initFlow
																									.equals(flow));

																							// check isomorphic binding between objects step and normalStep 
																							JavaSDM.ensure(!step
																									.equals(normalStep));

																							// create object outFlow
																							outFlow = Bpmn2Factory.eINSTANCE
																									.createSequenceFlow();

																							// create object exConvGateway
																							exConvGateway = Bpmn2Factory.eINSTANCE
																									.createExclusiveGateway();

																							// create object exConvGatewayToNormalStep
																							exConvGatewayToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createFlowNodeToStep();

																							// create object outFlowToInitFlow
																							outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createSequenceFlowToUCFlow();

																							// create object outFlowToNormalStep
																							outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
																									.createSequenceFlowToStep();

																							// assign attribute exConvGateway
																							exConvGateway
																									.setGatewayDirection((bpmn2.GatewayDirection) csp
																											.getAttributeVariable(
																													"exConvGateway",
																													"gatewayDirection")
																											.getValue());
																							// assign attribute ruleResult
																							ruleResult
																									.setSuccess(true);

																							// create link
																							process.getFlowElements()
																									.add(outFlow); // add link

																							// create link
																							process.getFlowElements()
																									.add(exConvGateway); // add link

																							// create link
																							exConvGateway
																									.getIncoming()
																									.add(inFlow);

																							// create link
																							outFlow.setSourceRef(exConvGateway);

																							// create link
																							exConvGatewayToNormalStep
																									.setSource(exConvGateway);

																							// create link
																							ruleResult
																									.getSourceObjects()
																									.add(exConvGateway);

																							// create link
																							ruleResult
																									.getSourceObjects()
																									.add(outFlow);

																							// create link
																							outFlowToInitFlow
																									.setSource(outFlow);

																							// create link
																							outFlowToNormalStep
																									.setSource(outFlow);

																							// create link
																							exConvGatewayToNormalStep
																									.setTarget(normalStep);

																							// create link
																							outFlowToNormalStep
																									.setTarget(normalStep);

																							// create link
																							ruleResult
																									.getCorrObjects()
																									.add(exConvGatewayToNormalStep);

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
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			AlternativeFlow flow, SequenceFlowToUCFlow inFlowToFlow, Step step,
			SequenceFlowToStep inFlowToStep, NormalStep normalStep,
			FlowNodeToStep exConvGatewayToNormalStep,
			AlternativeFlowAlternative alt, Flow initFlow,
			SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep,
			ExclusiveGateway exclusiveGateway,
			FlowNodeToStep exclusiveGatewayToNormalStep,
			SequenceFlow defaultFlow,
			SequenceFlowToUCFlow defaultFlowToInitFlow,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("Diverging");

		// Create attribute variables
		Variable var_exclusiveGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exclusiveGateway.gatewayDirection", true, csp);
		var_exclusiveGateway_gatewayDirection.setValue(exclusiveGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", csp);

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();
		EqGatewayDirection eqGatewayDirection_0 = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);
		csp.getConstraints().add(eqGatewayDirection_0);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exclusiveGateway_gatewayDirection,
				literal1);
		eqGatewayDirection_0.setRuleName("");
		eqGatewayDirection_0
				.solve(var_exConvGateway_gatewayDirection, literal0);

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
		isApplicableMatch.registerObject("exclusiveGateway", exclusiveGateway);
		isApplicableMatch.registerObject("exclusiveGatewayToNormalStep",
				exclusiveGatewayToNormalStep);
		isApplicableMatch.registerObject("defaultFlow", defaultFlow);
		isApplicableMatch.registerObject("defaultFlowToInitFlow",
				defaultFlowToInitFlow);
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
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ExclusiveGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ExclusiveGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
			return null;
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ExclusiveGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_EXCLUSIVEGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW:
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
					(Flow) arguments.get(11),
					(ExclusiveGateway) arguments.get(12),
					(FlowNodeToStep) arguments.get(13),
					(SequenceFlow) arguments.get(14),
					(SequenceFlowToUCFlow) arguments.get(15));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18));
			return null;
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_181__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_181((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_182__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_182((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_183__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_183((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_184__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_184((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_185__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_185((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_186__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_186((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_ALTERNATIVEFLOW_SEQUENCEFLOWTOUCFLOW_STEP_SEQUENCEFLOWTOSTEP_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_FLOW_SEQUENCEFLOWTOUCFLOW_SEQUENCEFLOWTOSTEP_EXCLUSIVEGATEWAY_FLOWNODETOSTEP_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT:
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
					(ExclusiveGateway) arguments.get(15),
					(FlowNodeToStep) arguments.get(16),
					(SequenceFlow) arguments.get(17),
					(SequenceFlowToUCFlow) arguments.get(18),
					(ModelgeneratorRuleResult) arguments.get(19));
		case RulesPackage.EXCLUSIVE_CONVERGING_GATEWAY_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExclusiveConvergingGatewayRuleImpl
