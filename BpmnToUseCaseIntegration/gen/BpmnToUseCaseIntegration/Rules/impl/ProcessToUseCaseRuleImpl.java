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

import BpmnToUseCaseIntegration.Rules.ProcessToUseCaseRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
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

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process To Use Case Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcessToUseCaseRuleImpl extends AbstractRuleImpl implements
		ProcessToUseCaseRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessToUseCaseRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getProcessToUseCaseRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __process_flowElements_startEvent = null;
		EMoflonEdge __process_flowElements_sequenceFlow = null;
		EMoflonEdge __startEvent_outgoing_sequenceFlow = null;
		EMoflonEdge __sequenceFlow_sourceRef_startEvent = null;
		EMoflonEdge __definitions_rootElements_process = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object startEvent is really bound
			JavaSDM.ensure(startEvent != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, definitions,
					process, startEvent, sequenceFlow));

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
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check object sequenceFlow is really bound
				JavaSDM.ensure(sequenceFlow != null);
				// check object startEvent is really bound
				JavaSDM.ensure(startEvent != null);
				// create object __process_flowElements_startEvent
				__process_flowElements_startEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_sequenceFlow
				__process_flowElements_sequenceFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __startEvent_outgoing_sequenceFlow
				__startEvent_outgoing_sequenceFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __sequenceFlow_sourceRef_startEvent
				__sequenceFlow_sourceRef_startEvent = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __definitions_rootElements_process
				__definitions_rootElements_process = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __definitions_rootElements_process
				__definitions_rootElements_process.setName("rootElements");
				// assign attribute __process_flowElements_startEvent
				__process_flowElements_startEvent.setName("flowElements");
				// assign attribute __process_flowElements_sequenceFlow
				__process_flowElements_sequenceFlow.setName("flowElements");
				// assign attribute __sequenceFlow_sourceRef_startEvent
				__sequenceFlow_sourceRef_startEvent.setName("sourceRef");
				// assign attribute __startEvent_outgoing_sequenceFlow
				__startEvent_outgoing_sequenceFlow.setName("outgoing");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_startEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_sequenceFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__startEvent_outgoing_sequenceFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						startEvent, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__sequenceFlow_sourceRef_startEvent,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__definitions_rootElements_process,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						sequenceFlow, "toBeTranslatedNodes");

				// create link
				__definitions_rootElements_process.setSrc(definitions);

				// create link
				__process_flowElements_startEvent.setSrc(process);

				// create link
				__definitions_rootElements_process.setTrg(process);

				// create link
				__process_flowElements_sequenceFlow.setSrc(process);

				// create link
				__sequenceFlow_sourceRef_startEvent.setTrg(startEvent);

				// create link
				__startEvent_outgoing_sequenceFlow.setSrc(startEvent);

				// create link
				__process_flowElements_startEvent.setTrg(startEvent);

				// create link
				__process_flowElements_sequenceFlow.setTrg(sequenceFlow);

				// create link
				__sequenceFlow_sourceRef_startEvent.setSrc(sequenceFlow);

				// create link
				__startEvent_outgoing_sequenceFlow.setTrg(sequenceFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check object sequenceFlow is really bound
				JavaSDM.ensure(sequenceFlow != null);
				// check object startEvent is really bound
				JavaSDM.ensure(startEvent != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						definitions, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, definitions, process,
					startEvent, sequenceFlow);
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
		DefinitionsToPackage definitionsToPackage = null;
		PackageDeclaration packageDeclaration = null;
		bpmn2.Process process = null;
		SequenceFlow sequenceFlow = null;
		StartEvent startEvent = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Actor actor = null;
		UseCase useCase = null;
		ProcessToUseCase processToUseCase = null;
		ProcessToActor processToActor = null;
		BasicFlow basicFlow = null;
		StartEventToBasicFlow startEventToBasicFlow = null;
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __process_flowElements_sequenceFlow = null;
		EMoflonEdge useCase__flows__basicFlow = null;
		EMoflonEdge packageDeclaration__actors__actor = null;
		EMoflonEdge __startEvent_outgoing_sequenceFlow = null;
		EMoflonEdge processToUseCase__source__process = null;
		EMoflonEdge __sequenceFlow_sourceRef_startEvent = null;
		EMoflonEdge sequenceFlowToBasicFlow__source__sequenceFlow = null;
		EMoflonEdge __process_flowElements_startEvent = null;
		EMoflonEdge processToActor__source__process = null;
		EMoflonEdge __definitions_rootElements_process = null;
		EMoflonEdge sequenceFlowToBasicFlow__target__basicFlow = null;
		EMoflonEdge startEventToBasicFlow__source__startEvent = null;
		EMoflonEdge processToActor__target__actor = null;
		EMoflonEdge startEventToBasicFlow__target__basicFlow = null;
		EMoflonEdge processToUseCase__target__useCase = null;
		EMoflonEdge packageDeclaration__useCases__useCase = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("definitions"));

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("definitionsToPackage"));

			// ensure correct type and really bound of object definitionsToPackage
			JavaSDM.ensure(_TmpObject instanceof DefinitionsToPackage);
			definitionsToPackage = (DefinitionsToPackage) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("sequenceFlow"));

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("startEvent"));

			// ensure correct type and really bound of object startEvent
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			startEvent = (StartEvent) _TmpObject;
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
			JavaSDM.ensure(fujaba__Success);
			// create object actor
			actor = UseCaseDSLFactory.eINSTANCE.createActor();

			// create object useCase
			useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();

			// create object processToUseCase
			processToUseCase = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createProcessToUseCase();

			// create object processToActor
			processToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createProcessToActor();

			// create object basicFlow
			basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();

			// create object startEventToBasicFlow
			startEventToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createStartEventToBasicFlow();

			// create object sequenceFlowToBasicFlow
			sequenceFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute useCase
			useCase.setName((java.lang.String) csp.getValue("useCase", "name"));
			// assign attribute useCase
			useCase.setDescription((java.lang.String) csp.getValue("useCase",
					"description"));
			// assign attribute useCase
			useCase.setPreConditions((java.lang.String) csp.getValue("useCase",
					"preConditions"));
			// assign attribute actor
			actor.setName((java.lang.String) csp.getValue("actor", "name"));
			// assign attribute actor
			actor.setType((UseCaseDSL.ActorType) csp.getValue("actor", "type"));

			// create link
			packageDeclaration.getActors().add(actor); // add link

			// create link
			packageDeclaration.getUseCases().add(useCase); // add link

			// create link
			processToUseCase.setSource(process);

			// create link
			processToActor.setSource(process);

			// create link
			useCase.getFlows().add(basicFlow); // add link

			// create link
			processToUseCase.setTarget(useCase);

			// create link
			startEventToBasicFlow.setSource(startEvent);

			// create link
			startEventToBasicFlow.setTarget(basicFlow);

			// create link
			sequenceFlowToBasicFlow.setTarget(basicFlow);

			// create link
			sequenceFlowToBasicFlow.setSource(sequenceFlow);

			// create link
			processToActor.setTarget(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToBasicFlow is really bound
			JavaSDM.ensure(sequenceFlowToBasicFlow != null);
			// check object startEvent is really bound
			JavaSDM.ensure(startEvent != null);
			// check object startEventToBasicFlow is really bound
			JavaSDM.ensure(startEventToBasicFlow != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToActor, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEvent, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEventToBasicFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToUseCase, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToBasicFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackage is really bound
			JavaSDM.ensure(definitionsToPackage != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToBasicFlow is really bound
			JavaSDM.ensure(sequenceFlowToBasicFlow != null);
			// check object startEvent is really bound
			JavaSDM.ensure(startEvent != null);
			// check object startEventToBasicFlow is really bound
			JavaSDM.ensure(startEventToBasicFlow != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects basicFlow and actor 
			JavaSDM.ensure(!basicFlow.equals(actor));

			// check isomorphic binding between objects definitions and actor 
			JavaSDM.ensure(!definitions.equals(actor));

			// check isomorphic binding between objects definitionsToPackage and actor 
			JavaSDM.ensure(!definitionsToPackage.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects processToUseCase and actor 
			JavaSDM.ensure(!processToUseCase.equals(actor));

			// check isomorphic binding between objects sequenceFlow and actor 
			JavaSDM.ensure(!sequenceFlow.equals(actor));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and actor 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(actor));

			// check isomorphic binding between objects startEvent and actor 
			JavaSDM.ensure(!startEvent.equals(actor));

			// check isomorphic binding between objects startEventToBasicFlow and actor 
			JavaSDM.ensure(!startEventToBasicFlow.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects definitions and basicFlow 
			JavaSDM.ensure(!definitions.equals(basicFlow));

			// check isomorphic binding between objects definitionsToPackage and basicFlow 
			JavaSDM.ensure(!definitionsToPackage.equals(basicFlow));

			// check isomorphic binding between objects packageDeclaration and basicFlow 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlow));

			// check isomorphic binding between objects process and basicFlow 
			JavaSDM.ensure(!process.equals(basicFlow));

			// check isomorphic binding between objects processToActor and basicFlow 
			JavaSDM.ensure(!processToActor.equals(basicFlow));

			// check isomorphic binding between objects processToUseCase and basicFlow 
			JavaSDM.ensure(!processToUseCase.equals(basicFlow));

			// check isomorphic binding between objects sequenceFlow and basicFlow 
			JavaSDM.ensure(!sequenceFlow.equals(basicFlow));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and basicFlow 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(basicFlow));

			// check isomorphic binding between objects startEvent and basicFlow 
			JavaSDM.ensure(!startEvent.equals(basicFlow));

			// check isomorphic binding between objects startEventToBasicFlow and basicFlow 
			JavaSDM.ensure(!startEventToBasicFlow.equals(basicFlow));

			// check isomorphic binding between objects useCase and basicFlow 
			JavaSDM.ensure(!useCase.equals(basicFlow));

			// check isomorphic binding between objects definitionsToPackage and definitions 
			JavaSDM.ensure(!definitionsToPackage.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitions 
			JavaSDM.ensure(!packageDeclaration.equals(definitions));

			// check isomorphic binding between objects process and definitions 
			JavaSDM.ensure(!process.equals(definitions));

			// check isomorphic binding between objects processToActor and definitions 
			JavaSDM.ensure(!processToActor.equals(definitions));

			// check isomorphic binding between objects processToUseCase and definitions 
			JavaSDM.ensure(!processToUseCase.equals(definitions));

			// check isomorphic binding between objects sequenceFlow and definitions 
			JavaSDM.ensure(!sequenceFlow.equals(definitions));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and definitions 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(definitions));

			// check isomorphic binding between objects startEvent and definitions 
			JavaSDM.ensure(!startEvent.equals(definitions));

			// check isomorphic binding between objects startEventToBasicFlow and definitions 
			JavaSDM.ensure(!startEventToBasicFlow.equals(definitions));

			// check isomorphic binding between objects useCase and definitions 
			JavaSDM.ensure(!useCase.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitionsToPackage 
			JavaSDM.ensure(!packageDeclaration.equals(definitionsToPackage));

			// check isomorphic binding between objects process and definitionsToPackage 
			JavaSDM.ensure(!process.equals(definitionsToPackage));

			// check isomorphic binding between objects processToActor and definitionsToPackage 
			JavaSDM.ensure(!processToActor.equals(definitionsToPackage));

			// check isomorphic binding between objects processToUseCase and definitionsToPackage 
			JavaSDM.ensure(!processToUseCase.equals(definitionsToPackage));

			// check isomorphic binding between objects sequenceFlow and definitionsToPackage 
			JavaSDM.ensure(!sequenceFlow.equals(definitionsToPackage));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and definitionsToPackage 
			JavaSDM.ensure(!sequenceFlowToBasicFlow
					.equals(definitionsToPackage));

			// check isomorphic binding between objects startEvent and definitionsToPackage 
			JavaSDM.ensure(!startEvent.equals(definitionsToPackage));

			// check isomorphic binding between objects startEventToBasicFlow and definitionsToPackage 
			JavaSDM.ensure(!startEventToBasicFlow.equals(definitionsToPackage));

			// check isomorphic binding between objects useCase and definitionsToPackage 
			JavaSDM.ensure(!useCase.equals(definitionsToPackage));

			// check isomorphic binding between objects process and packageDeclaration 
			JavaSDM.ensure(!process.equals(packageDeclaration));

			// check isomorphic binding between objects processToActor and packageDeclaration 
			JavaSDM.ensure(!processToActor.equals(packageDeclaration));

			// check isomorphic binding between objects processToUseCase and packageDeclaration 
			JavaSDM.ensure(!processToUseCase.equals(packageDeclaration));

			// check isomorphic binding between objects sequenceFlow and packageDeclaration 
			JavaSDM.ensure(!sequenceFlow.equals(packageDeclaration));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and packageDeclaration 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(packageDeclaration));

			// check isomorphic binding between objects startEvent and packageDeclaration 
			JavaSDM.ensure(!startEvent.equals(packageDeclaration));

			// check isomorphic binding between objects startEventToBasicFlow and packageDeclaration 
			JavaSDM.ensure(!startEventToBasicFlow.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects sequenceFlow and process 
			JavaSDM.ensure(!sequenceFlow.equals(process));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and process 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(process));

			// check isomorphic binding between objects startEvent and process 
			JavaSDM.ensure(!startEvent.equals(process));

			// check isomorphic binding between objects startEventToBasicFlow and process 
			JavaSDM.ensure(!startEventToBasicFlow.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects processToUseCase and processToActor 
			JavaSDM.ensure(!processToUseCase.equals(processToActor));

			// check isomorphic binding between objects sequenceFlow and processToActor 
			JavaSDM.ensure(!sequenceFlow.equals(processToActor));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and processToActor 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(processToActor));

			// check isomorphic binding between objects startEvent and processToActor 
			JavaSDM.ensure(!startEvent.equals(processToActor));

			// check isomorphic binding between objects startEventToBasicFlow and processToActor 
			JavaSDM.ensure(!startEventToBasicFlow.equals(processToActor));

			// check isomorphic binding between objects useCase and processToActor 
			JavaSDM.ensure(!useCase.equals(processToActor));

			// check isomorphic binding between objects sequenceFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlow.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(processToUseCase));

			// check isomorphic binding between objects startEvent and processToUseCase 
			JavaSDM.ensure(!startEvent.equals(processToUseCase));

			// check isomorphic binding between objects startEventToBasicFlow and processToUseCase 
			JavaSDM.ensure(!startEventToBasicFlow.equals(processToUseCase));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and sequenceFlow 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(sequenceFlow));

			// check isomorphic binding between objects startEvent and sequenceFlow 
			JavaSDM.ensure(!startEvent.equals(sequenceFlow));

			// check isomorphic binding between objects startEventToBasicFlow and sequenceFlow 
			JavaSDM.ensure(!startEventToBasicFlow.equals(sequenceFlow));

			// check isomorphic binding between objects useCase and sequenceFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlow));

			// check isomorphic binding between objects startEvent and sequenceFlowToBasicFlow 
			JavaSDM.ensure(!startEvent.equals(sequenceFlowToBasicFlow));

			// check isomorphic binding between objects startEventToBasicFlow and sequenceFlowToBasicFlow 
			JavaSDM.ensure(!startEventToBasicFlow
					.equals(sequenceFlowToBasicFlow));

			// check isomorphic binding between objects useCase and sequenceFlowToBasicFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlowToBasicFlow));

			// check isomorphic binding between objects startEventToBasicFlow and startEvent 
			JavaSDM.ensure(!startEventToBasicFlow.equals(startEvent));

			// check isomorphic binding between objects useCase and startEvent 
			JavaSDM.ensure(!useCase.equals(startEvent));

			// check isomorphic binding between objects useCase and startEventToBasicFlow 
			JavaSDM.ensure(!useCase.equals(startEventToBasicFlow));

			// create object __process_flowElements_sequenceFlow
			__process_flowElements_sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__basicFlow
			useCase__flows__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__actors__actor
			packageDeclaration__actors__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __startEvent_outgoing_sequenceFlow
			__startEvent_outgoing_sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToUseCase__source__process
			processToUseCase__source__process = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __sequenceFlow_sourceRef_startEvent
			__sequenceFlow_sourceRef_startEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToBasicFlow__source__sequenceFlow
			sequenceFlowToBasicFlow__source__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_startEvent
			__process_flowElements_startEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToActor__source__process
			processToActor__source__process = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __definitions_rootElements_process
			__definitions_rootElements_process = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToBasicFlow__target__basicFlow
			sequenceFlowToBasicFlow__target__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object startEventToBasicFlow__source__startEvent
			startEventToBasicFlow__source__startEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToActor__target__actor
			processToActor__target__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object startEventToBasicFlow__target__basicFlow
			startEventToBasicFlow__target__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToUseCase__target__useCase
			processToUseCase__target__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ProcessToUseCaseRule");
			// assign attribute __definitions_rootElements_process
			__definitions_rootElements_process.setName("rootElements");
			// assign attribute packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase.setName("useCases");
			// assign attribute packageDeclaration__actors__actor
			packageDeclaration__actors__actor.setName("actors");
			// assign attribute __process_flowElements_startEvent
			__process_flowElements_startEvent.setName("flowElements");
			// assign attribute __process_flowElements_sequenceFlow
			__process_flowElements_sequenceFlow.setName("flowElements");
			// assign attribute useCase__flows__basicFlow
			useCase__flows__basicFlow.setName("flows");
			// assign attribute processToUseCase__source__process
			processToUseCase__source__process.setName("source");
			// assign attribute processToUseCase__target__useCase
			processToUseCase__target__useCase.setName("target");
			// assign attribute __sequenceFlow_sourceRef_startEvent
			__sequenceFlow_sourceRef_startEvent.setName("sourceRef");
			// assign attribute __startEvent_outgoing_sequenceFlow
			__startEvent_outgoing_sequenceFlow.setName("outgoing");
			// assign attribute startEventToBasicFlow__source__startEvent
			startEventToBasicFlow__source__startEvent.setName("source");
			// assign attribute startEventToBasicFlow__target__basicFlow
			startEventToBasicFlow__target__basicFlow.setName("target");
			// assign attribute sequenceFlowToBasicFlow__source__sequenceFlow
			sequenceFlowToBasicFlow__source__sequenceFlow.setName("source");
			// assign attribute sequenceFlowToBasicFlow__target__basicFlow
			sequenceFlowToBasicFlow__target__basicFlow.setName("target");
			// assign attribute processToActor__source__process
			processToActor__source__process.setName("source");
			// assign attribute processToActor__target__actor
			processToActor__target__actor.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_sequenceFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__actors__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__startEvent_outgoing_sequenceFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToUseCase__source__process, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__sequenceFlow_sourceRef_startEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToBasicFlow__source__sequenceFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_startEvent, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToActor__source__process, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__definitions_rootElements_process, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToBasicFlow__target__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEventToBasicFlow__source__startEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToActor__target__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEventToBasicFlow__target__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToUseCase__target__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__useCases__useCase, "createdEdges");

			// create link
			__definitions_rootElements_process.setSrc(definitions);

			// create link
			packageDeclaration__useCases__useCase.setSrc(packageDeclaration);

			// create link
			packageDeclaration__actors__actor.setSrc(packageDeclaration);

			// create link
			__definitions_rootElements_process.setTrg(process);

			// create link
			__process_flowElements_sequenceFlow.setSrc(process);

			// create link
			__process_flowElements_startEvent.setSrc(process);

			// create link
			processToActor__source__process.setTrg(process);

			// create link
			processToUseCase__source__process.setTrg(process);

			// create link
			useCase__flows__basicFlow.setSrc(useCase);

			// create link
			packageDeclaration__useCases__useCase.setTrg(useCase);

			// create link
			processToUseCase__target__useCase.setTrg(useCase);

			// create link
			processToUseCase__target__useCase.setSrc(processToUseCase);

			// create link
			processToUseCase__source__process.setSrc(processToUseCase);

			// create link
			__startEvent_outgoing_sequenceFlow.setSrc(startEvent);

			// create link
			__sequenceFlow_sourceRef_startEvent.setTrg(startEvent);

			// create link
			__process_flowElements_startEvent.setTrg(startEvent);

			// create link
			startEventToBasicFlow__source__startEvent.setTrg(startEvent);

			// create link
			startEventToBasicFlow__target__basicFlow.setTrg(basicFlow);

			// create link
			sequenceFlowToBasicFlow__target__basicFlow.setTrg(basicFlow);

			// create link
			useCase__flows__basicFlow.setTrg(basicFlow);

			// create link
			startEventToBasicFlow__target__basicFlow
					.setSrc(startEventToBasicFlow);

			// create link
			startEventToBasicFlow__source__startEvent
					.setSrc(startEventToBasicFlow);

			// create link
			sequenceFlowToBasicFlow__source__sequenceFlow.setTrg(sequenceFlow);

			// create link
			__startEvent_outgoing_sequenceFlow.setTrg(sequenceFlow);

			// create link
			__process_flowElements_sequenceFlow.setTrg(sequenceFlow);

			// create link
			__sequenceFlow_sourceRef_startEvent.setSrc(sequenceFlow);

			// create link
			sequenceFlowToBasicFlow__target__basicFlow
					.setSrc(sequenceFlowToBasicFlow);

			// create link
			sequenceFlowToBasicFlow__source__sequenceFlow
					.setSrc(sequenceFlowToBasicFlow);

			// create link
			processToActor__target__actor.setTrg(actor);

			// create link
			packageDeclaration__actors__actor.setTrg(actor);

			// create link
			processToActor__source__process.setSrc(processToActor);

			// create link
			processToActor__target__actor.setSrc(processToActor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor);
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
		bpmn2.Process process = null;
		SequenceFlow sequenceFlow = null;
		StartEvent startEvent = null;
		EMoflonEdge __definitions_rootElements_process = null;
		EMoflonEdge __definitionsToPackage_source_definitions = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __definitionsToPackage_target_packageDeclaration = null;
		EMoflonEdge __process_flowElements_startEvent = null;
		EMoflonEdge __process_flowElements_sequenceFlow = null;
		EMoflonEdge __sequenceFlow_sourceRef_startEvent = null;
		EMoflonEdge __startEvent_outgoing_sequenceFlow = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		Iterator fujaba__IterDefinitionsToDefinitionsToPackage = null;
		DefinitionsToPackage definitionsToPackage = null;

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
			ruleresult.setRule("ProcessToUseCaseRule");

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
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;
			_TmpObject = (match.getObject("sequenceFlow"));

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("startEvent"));

			// ensure correct type and really bound of object startEvent
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			startEvent = (StartEvent) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from definitions to definitionsToPackage
			fujaba__Success = false;

			fujaba__IterDefinitionsToDefinitionsToPackage = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							definitions, DefinitionsToPackage.class, "source"))
					.iterator();

			while (fujaba__IterDefinitionsToDefinitionsToPackage.hasNext()) {
				try {
					definitionsToPackage = (DefinitionsToPackage) fujaba__IterDefinitionsToDefinitionsToPackage
							.next();

					// check object definitionsToPackage is really bound
					JavaSDM.ensure(definitionsToPackage != null);
					// bind object
					packageDeclaration = definitionsToPackage.getTarget();

					// check object packageDeclaration is really bound
					JavaSDM.ensure(packageDeclaration != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object definitions is really bound
						JavaSDM.ensure(definitions != null);
						// check object definitionsToPackage is really bound
						JavaSDM.ensure(definitionsToPackage != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check object sequenceFlow is really bound
						JavaSDM.ensure(sequenceFlow != null);
						// check object startEvent is really bound
						JavaSDM.ensure(startEvent != null);
						// check link flowElements from sequenceFlow to process
						JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

						// check link flowElements from startEvent to process
						JavaSDM.ensure(process.equals(startEvent.eContainer()));

						// check link rootElements from process to definitions
						JavaSDM.ensure(definitions.equals(process.eContainer()));

						// check link source from definitionsToPackage to definitions
						JavaSDM.ensure(definitions.equals(definitionsToPackage
								.getSource()));

						// check link sourceRef from sequenceFlow to startEvent
						JavaSDM.ensure(startEvent.equals(sequenceFlow
								.getSourceRef()));

						// check link target from definitionsToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(definitionsToPackage.getTarget()));

						// create object __definitions_rootElements_process
						__definitions_rootElements_process = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __definitionsToPackage_source_definitions
						__definitionsToPackage_source_definitions = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __definitionsToPackage_target_packageDeclaration
						__definitionsToPackage_target_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __process_flowElements_startEvent
						__process_flowElements_startEvent = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __process_flowElements_sequenceFlow
						__process_flowElements_sequenceFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __sequenceFlow_sourceRef_startEvent
						__sequenceFlow_sourceRef_startEvent = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __startEvent_outgoing_sequenceFlow
						__startEvent_outgoing_sequenceFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __definitions_rootElements_process
						__definitions_rootElements_process
								.setName("rootElements");
						// assign attribute __definitionsToPackage_source_definitions
						__definitionsToPackage_source_definitions
								.setName("source");
						// assign attribute __definitionsToPackage_target_packageDeclaration
						__definitionsToPackage_target_packageDeclaration
								.setName("target");
						// assign attribute __process_flowElements_startEvent
						__process_flowElements_startEvent
								.setName("flowElements");
						// assign attribute __process_flowElements_sequenceFlow
						__process_flowElements_sequenceFlow
								.setName("flowElements");
						// assign attribute __sequenceFlow_sourceRef_startEvent
						__sequenceFlow_sourceRef_startEvent
								.setName("sourceRef");
						// assign attribute __startEvent_outgoing_sequenceFlow
						__startEvent_outgoing_sequenceFlow.setName("outgoing");

						// create link
						__definitions_rootElements_process.setSrc(definitions);

						// create link
						__definitionsToPackage_source_definitions
								.setTrg(definitions);

						// create link
						isApplicableMatch.getAllContextElements().add(
								definitions);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__definitionsToPackage_target_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__definitionsToPackage_source_definitions
								.setSrc(definitionsToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								definitionsToPackage);

						// create link
						__definitionsToPackage_target_packageDeclaration
								.setSrc(definitionsToPackage);

						// create link
						__process_flowElements_startEvent.setSrc(process);

						// create link
						__definitions_rootElements_process.setTrg(process);

						// create link
						__process_flowElements_sequenceFlow.setSrc(process);

						// create link
						isApplicableMatch.getAllContextElements().add(process);

						// create link
						__process_flowElements_startEvent.setTrg(startEvent);

						// create link
						isApplicableMatch.getAllContextElements().add(
								startEvent);

						// create link
						__sequenceFlow_sourceRef_startEvent.setTrg(startEvent);

						// create link
						__startEvent_outgoing_sequenceFlow.setSrc(startEvent);

						// create link
						__startEvent_outgoing_sequenceFlow.setTrg(sequenceFlow);

						// create link
						__sequenceFlow_sourceRef_startEvent
								.setSrc(sequenceFlow);

						// create link
						__process_flowElements_sequenceFlow
								.setTrg(sequenceFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(
								sequenceFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__sequenceFlow_sourceRef_startEvent,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__definitionsToPackage_source_definitions,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__startEvent_outgoing_sequenceFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__definitionsToPackage_target_packageDeclaration,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_sequenceFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__definitions_rootElements_process,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_startEvent,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, definitions,
									packageDeclaration, definitionsToPackage,
									process, startEvent, sequenceFlow));

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
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("ProcessToUseCaseRule");
								// assign attribute ruleresult
								ruleresult.setSuccess(true);

								// create link
								ruleresult.getIsApplicableMatch().add(
										isApplicableMatch);

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
			Definitions definitions, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		match.registerObject("definitions", definitions);
		match.registerObject("process", process);
		match.registerObject("startEvent", startEvent);
		match.registerObject("sequenceFlow", sequenceFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Definitions definitions,
			bpmn2.Process process, StartEvent startEvent,
			SequenceFlow sequenceFlow) {
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
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, bpmn2.Process process,
			StartEvent startEvent, SequenceFlow sequenceFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("sys");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("SYSTEM");
		literal1.setType("String");

		// Create attribute variables
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.id", true, csp);
		var_process_id.setValue(process.getId());
		var_process_id.setType("");
		Variable var_process_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.name", true, csp);
		var_process_name.setValue(process.getName());
		var_process_name.setType("");
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", true, csp);
		var_startEvent_name.setValue(startEvent.getName());
		var_startEvent_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("");
		Variable var_useCase_description = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.description", csp);
		var_useCase_description.setType("");
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", csp);
		var_useCase_preConditions.setType("");
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		var_actor_name.setType("");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);
		var_actor_type.setType("EObject");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);
		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_process_id, var_useCase_name);
		eq_0.setRuleName("");
		eq_0.solve(var_process_name, var_useCase_description);
		eq_1.setRuleName("");
		eq_1.solve(var_startEvent_name, var_useCase_preConditions);
		eq_2.setRuleName("");
		eq_2.solve(var_actor_name, literal0);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal1);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("startEvent", startEvent);
		isApplicableMatch.registerObject("sequenceFlow", sequenceFlow);
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
			EObject definitionsToPackage, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("startEvent", startEvent);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("startEventToBasicFlow",
				startEventToBasicFlow);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("sequenceFlowToBasicFlow",
				sequenceFlowToBasicFlow);
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
				&& match.getObject("process").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getProcess())
				&& match.getObject("startEvent").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getStartEvent())
				&& match.getObject("sequenceFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match,
					packageDeclaration, useCase, basicFlow, actor));

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
				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __useCase_flows_basicFlow
				__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");
				// assign attribute __useCase_flows_basicFlow
				__useCase_flows_basicFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						basicFlow, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_basicFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor,
						"toBeTranslatedEdges");

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__useCase_flows_basicFlow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_basicFlow.setTrg(basicFlow);

				// create link
				__packageDeclaration_actors_actor.setTrg(actor);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object actor is really bound
				JavaSDM.ensure(actor != null);
				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, packageDeclaration, useCase,
					basicFlow, actor);
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
		BasicFlow basicFlow = null;
		Definitions definitions = null;
		DefinitionsToPackage definitionsToPackage = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		bpmn2.Process process = null;
		StartEvent startEvent = null;
		SequenceFlow sequenceFlow = null;
		ProcessToActor processToActor = null;
		ProcessToUseCase processToUseCase = null;
		StartEventToBasicFlow startEventToBasicFlow = null;
		SequenceFlowToUCFlow sequenceFlowToBasicFlow = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge sequenceFlowToBasicFlow__source__sequenceFlow = null;
		EMoflonEdge processToUseCase__target__useCase = null;
		EMoflonEdge definitions__rootElements__process = null;
		EMoflonEdge startEventToBasicFlow__target__basicFlow = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge startEventToBasicFlow__source__startEvent = null;
		EMoflonEdge processToActor__target__actor = null;
		EMoflonEdge processToUseCase__source__process = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge startEvent__outgoing__sequenceFlow = null;
		EMoflonEdge sequenceFlow__sourceRef__startEvent = null;
		EMoflonEdge process__flowElements__startEvent = null;
		EMoflonEdge sequenceFlowToBasicFlow__target__basicFlow = null;
		EMoflonEdge processToActor__source__process = null;
		EMoflonEdge process__flowElements__sequenceFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("basicFlow"));

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("definitions"));

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("definitionsToPackage"));

			// ensure correct type and really bound of object definitionsToPackage
			JavaSDM.ensure(_TmpObject instanceof DefinitionsToPackage);
			definitionsToPackage = (DefinitionsToPackage) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
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
			JavaSDM.ensure(fujaba__Success);
			// create object process
			process = Bpmn2Factory.eINSTANCE.createProcess();

			// create object startEvent
			startEvent = Bpmn2Factory.eINSTANCE.createStartEvent();

			// create object sequenceFlow
			sequenceFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();

			// create object processToActor
			processToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createProcessToActor();

			// create object processToUseCase
			processToUseCase = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createProcessToUseCase();

			// create object startEventToBasicFlow
			startEventToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createStartEventToBasicFlow();

			// create object sequenceFlowToBasicFlow
			sequenceFlowToBasicFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createSequenceFlowToUCFlow();

			// assign attribute process
			process.setId((java.lang.String) csp.getValue("process", "id"));
			// assign attribute process
			process.setName((java.lang.String) csp.getValue("process", "name"));
			// assign attribute startEvent
			startEvent.setName((java.lang.String) csp.getValue("startEvent",
					"name"));

			// create link
			sequenceFlowToBasicFlow.setTarget(basicFlow);

			// create link
			startEventToBasicFlow.setTarget(basicFlow);

			// create link
			sequenceFlowToBasicFlow.setSource(sequenceFlow);

			// create link
			processToActor.setTarget(actor);

			// create link
			definitions.getRootElements().add(process); // add link

			// create link
			process.getFlowElements().add(startEvent); // add link

			// create link
			process.getFlowElements().add(sequenceFlow); // add link

			// create link
			processToActor.setSource(process);

			// create link
			processToUseCase.setSource(process);

			// create link
			processToUseCase.setTarget(useCase);

			// create link
			startEventToBasicFlow.setSource(startEvent);

			// create link
			sequenceFlow.setSourceRef(startEvent);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToBasicFlow is really bound
			JavaSDM.ensure(sequenceFlowToBasicFlow != null);
			// check object startEvent is really bound
			JavaSDM.ensure(startEvent != null);
			// check object startEventToBasicFlow is really bound
			JavaSDM.ensure(startEventToBasicFlow != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToActor, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToBasicFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlow, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEventToBasicFlow, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToUseCase, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEvent, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackage is really bound
			JavaSDM.ensure(definitionsToPackage != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToActor is really bound
			JavaSDM.ensure(processToActor != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object sequenceFlow is really bound
			JavaSDM.ensure(sequenceFlow != null);
			// check object sequenceFlowToBasicFlow is really bound
			JavaSDM.ensure(sequenceFlowToBasicFlow != null);
			// check object startEvent is really bound
			JavaSDM.ensure(startEvent != null);
			// check object startEventToBasicFlow is really bound
			JavaSDM.ensure(startEventToBasicFlow != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects basicFlow and actor 
			JavaSDM.ensure(!basicFlow.equals(actor));

			// check isomorphic binding between objects definitions and actor 
			JavaSDM.ensure(!definitions.equals(actor));

			// check isomorphic binding between objects definitionsToPackage and actor 
			JavaSDM.ensure(!definitionsToPackage.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToActor and actor 
			JavaSDM.ensure(!processToActor.equals(actor));

			// check isomorphic binding between objects processToUseCase and actor 
			JavaSDM.ensure(!processToUseCase.equals(actor));

			// check isomorphic binding between objects sequenceFlow and actor 
			JavaSDM.ensure(!sequenceFlow.equals(actor));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and actor 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(actor));

			// check isomorphic binding between objects startEvent and actor 
			JavaSDM.ensure(!startEvent.equals(actor));

			// check isomorphic binding between objects startEventToBasicFlow and actor 
			JavaSDM.ensure(!startEventToBasicFlow.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects definitions and basicFlow 
			JavaSDM.ensure(!definitions.equals(basicFlow));

			// check isomorphic binding between objects definitionsToPackage and basicFlow 
			JavaSDM.ensure(!definitionsToPackage.equals(basicFlow));

			// check isomorphic binding between objects packageDeclaration and basicFlow 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlow));

			// check isomorphic binding between objects process and basicFlow 
			JavaSDM.ensure(!process.equals(basicFlow));

			// check isomorphic binding between objects processToActor and basicFlow 
			JavaSDM.ensure(!processToActor.equals(basicFlow));

			// check isomorphic binding between objects processToUseCase and basicFlow 
			JavaSDM.ensure(!processToUseCase.equals(basicFlow));

			// check isomorphic binding between objects sequenceFlow and basicFlow 
			JavaSDM.ensure(!sequenceFlow.equals(basicFlow));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and basicFlow 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(basicFlow));

			// check isomorphic binding between objects startEvent and basicFlow 
			JavaSDM.ensure(!startEvent.equals(basicFlow));

			// check isomorphic binding between objects startEventToBasicFlow and basicFlow 
			JavaSDM.ensure(!startEventToBasicFlow.equals(basicFlow));

			// check isomorphic binding between objects useCase and basicFlow 
			JavaSDM.ensure(!useCase.equals(basicFlow));

			// check isomorphic binding between objects definitionsToPackage and definitions 
			JavaSDM.ensure(!definitionsToPackage.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitions 
			JavaSDM.ensure(!packageDeclaration.equals(definitions));

			// check isomorphic binding between objects process and definitions 
			JavaSDM.ensure(!process.equals(definitions));

			// check isomorphic binding between objects processToActor and definitions 
			JavaSDM.ensure(!processToActor.equals(definitions));

			// check isomorphic binding between objects processToUseCase and definitions 
			JavaSDM.ensure(!processToUseCase.equals(definitions));

			// check isomorphic binding between objects sequenceFlow and definitions 
			JavaSDM.ensure(!sequenceFlow.equals(definitions));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and definitions 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(definitions));

			// check isomorphic binding between objects startEvent and definitions 
			JavaSDM.ensure(!startEvent.equals(definitions));

			// check isomorphic binding between objects startEventToBasicFlow and definitions 
			JavaSDM.ensure(!startEventToBasicFlow.equals(definitions));

			// check isomorphic binding between objects useCase and definitions 
			JavaSDM.ensure(!useCase.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitionsToPackage 
			JavaSDM.ensure(!packageDeclaration.equals(definitionsToPackage));

			// check isomorphic binding between objects process and definitionsToPackage 
			JavaSDM.ensure(!process.equals(definitionsToPackage));

			// check isomorphic binding between objects processToActor and definitionsToPackage 
			JavaSDM.ensure(!processToActor.equals(definitionsToPackage));

			// check isomorphic binding between objects processToUseCase and definitionsToPackage 
			JavaSDM.ensure(!processToUseCase.equals(definitionsToPackage));

			// check isomorphic binding between objects sequenceFlow and definitionsToPackage 
			JavaSDM.ensure(!sequenceFlow.equals(definitionsToPackage));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and definitionsToPackage 
			JavaSDM.ensure(!sequenceFlowToBasicFlow
					.equals(definitionsToPackage));

			// check isomorphic binding between objects startEvent and definitionsToPackage 
			JavaSDM.ensure(!startEvent.equals(definitionsToPackage));

			// check isomorphic binding between objects startEventToBasicFlow and definitionsToPackage 
			JavaSDM.ensure(!startEventToBasicFlow.equals(definitionsToPackage));

			// check isomorphic binding between objects useCase and definitionsToPackage 
			JavaSDM.ensure(!useCase.equals(definitionsToPackage));

			// check isomorphic binding between objects process and packageDeclaration 
			JavaSDM.ensure(!process.equals(packageDeclaration));

			// check isomorphic binding between objects processToActor and packageDeclaration 
			JavaSDM.ensure(!processToActor.equals(packageDeclaration));

			// check isomorphic binding between objects processToUseCase and packageDeclaration 
			JavaSDM.ensure(!processToUseCase.equals(packageDeclaration));

			// check isomorphic binding between objects sequenceFlow and packageDeclaration 
			JavaSDM.ensure(!sequenceFlow.equals(packageDeclaration));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and packageDeclaration 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(packageDeclaration));

			// check isomorphic binding between objects startEvent and packageDeclaration 
			JavaSDM.ensure(!startEvent.equals(packageDeclaration));

			// check isomorphic binding between objects startEventToBasicFlow and packageDeclaration 
			JavaSDM.ensure(!startEventToBasicFlow.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects processToActor and process 
			JavaSDM.ensure(!processToActor.equals(process));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects sequenceFlow and process 
			JavaSDM.ensure(!sequenceFlow.equals(process));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and process 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(process));

			// check isomorphic binding between objects startEvent and process 
			JavaSDM.ensure(!startEvent.equals(process));

			// check isomorphic binding between objects startEventToBasicFlow and process 
			JavaSDM.ensure(!startEventToBasicFlow.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects processToUseCase and processToActor 
			JavaSDM.ensure(!processToUseCase.equals(processToActor));

			// check isomorphic binding between objects sequenceFlow and processToActor 
			JavaSDM.ensure(!sequenceFlow.equals(processToActor));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and processToActor 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(processToActor));

			// check isomorphic binding between objects startEvent and processToActor 
			JavaSDM.ensure(!startEvent.equals(processToActor));

			// check isomorphic binding between objects startEventToBasicFlow and processToActor 
			JavaSDM.ensure(!startEventToBasicFlow.equals(processToActor));

			// check isomorphic binding between objects useCase and processToActor 
			JavaSDM.ensure(!useCase.equals(processToActor));

			// check isomorphic binding between objects sequenceFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlow.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and processToUseCase 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(processToUseCase));

			// check isomorphic binding between objects startEvent and processToUseCase 
			JavaSDM.ensure(!startEvent.equals(processToUseCase));

			// check isomorphic binding between objects startEventToBasicFlow and processToUseCase 
			JavaSDM.ensure(!startEventToBasicFlow.equals(processToUseCase));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// check isomorphic binding between objects sequenceFlowToBasicFlow and sequenceFlow 
			JavaSDM.ensure(!sequenceFlowToBasicFlow.equals(sequenceFlow));

			// check isomorphic binding between objects startEvent and sequenceFlow 
			JavaSDM.ensure(!startEvent.equals(sequenceFlow));

			// check isomorphic binding between objects startEventToBasicFlow and sequenceFlow 
			JavaSDM.ensure(!startEventToBasicFlow.equals(sequenceFlow));

			// check isomorphic binding between objects useCase and sequenceFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlow));

			// check isomorphic binding between objects startEvent and sequenceFlowToBasicFlow 
			JavaSDM.ensure(!startEvent.equals(sequenceFlowToBasicFlow));

			// check isomorphic binding between objects startEventToBasicFlow and sequenceFlowToBasicFlow 
			JavaSDM.ensure(!startEventToBasicFlow
					.equals(sequenceFlowToBasicFlow));

			// check isomorphic binding between objects useCase and sequenceFlowToBasicFlow 
			JavaSDM.ensure(!useCase.equals(sequenceFlowToBasicFlow));

			// check isomorphic binding between objects startEventToBasicFlow and startEvent 
			JavaSDM.ensure(!startEventToBasicFlow.equals(startEvent));

			// check isomorphic binding between objects useCase and startEvent 
			JavaSDM.ensure(!useCase.equals(startEvent));

			// check isomorphic binding between objects useCase and startEventToBasicFlow 
			JavaSDM.ensure(!useCase.equals(startEventToBasicFlow));

			// create object sequenceFlowToBasicFlow__source__sequenceFlow
			sequenceFlowToBasicFlow__source__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToUseCase__target__useCase
			processToUseCase__target__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object definitions__rootElements__process
			definitions__rootElements__process = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object startEventToBasicFlow__target__basicFlow
			startEventToBasicFlow__target__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object startEventToBasicFlow__source__startEvent
			startEventToBasicFlow__source__startEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToActor__target__actor
			processToActor__target__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToUseCase__source__process
			processToUseCase__source__process = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_basicFlow
			__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object startEvent__outgoing__sequenceFlow
			startEvent__outgoing__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlow__sourceRef__startEvent
			sequenceFlow__sourceRef__startEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__startEvent
			process__flowElements__startEvent = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object sequenceFlowToBasicFlow__target__basicFlow
			sequenceFlowToBasicFlow__target__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object processToActor__source__process
			processToActor__source__process = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__sequenceFlow
			process__flowElements__sequenceFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ProcessToUseCaseRule");
			// assign attribute definitions__rootElements__process
			definitions__rootElements__process.setName("rootElements");
			// assign attribute __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase.setName("useCases");
			// assign attribute __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor.setName("actors");
			// assign attribute process__flowElements__startEvent
			process__flowElements__startEvent.setName("flowElements");
			// assign attribute process__flowElements__sequenceFlow
			process__flowElements__sequenceFlow.setName("flowElements");
			// assign attribute __useCase_flows_basicFlow
			__useCase_flows_basicFlow.setName("flows");
			// assign attribute processToUseCase__source__process
			processToUseCase__source__process.setName("source");
			// assign attribute processToUseCase__target__useCase
			processToUseCase__target__useCase.setName("target");
			// assign attribute sequenceFlow__sourceRef__startEvent
			sequenceFlow__sourceRef__startEvent.setName("sourceRef");
			// assign attribute startEvent__outgoing__sequenceFlow
			startEvent__outgoing__sequenceFlow.setName("outgoing");
			// assign attribute startEventToBasicFlow__source__startEvent
			startEventToBasicFlow__source__startEvent.setName("source");
			// assign attribute startEventToBasicFlow__target__basicFlow
			startEventToBasicFlow__target__basicFlow.setName("target");
			// assign attribute sequenceFlowToBasicFlow__source__sequenceFlow
			sequenceFlowToBasicFlow__source__sequenceFlow.setName("source");
			// assign attribute sequenceFlowToBasicFlow__target__basicFlow
			sequenceFlowToBasicFlow__target__basicFlow.setName("target");
			// assign attribute processToActor__source__process
			processToActor__source__process.setName("source");
			// assign attribute processToActor__target__actor
			processToActor__target__actor.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToBasicFlow__source__sequenceFlow,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToUseCase__target__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					definitions__rootElements__process, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEventToBasicFlow__target__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_useCases_useCase, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEventToBasicFlow__source__startEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToActor__target__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToUseCase__source__process, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_basicFlow, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_actors_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					startEvent__outgoing__sequenceFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlow__sourceRef__startEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__startEvent, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					sequenceFlowToBasicFlow__target__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					processToActor__source__process, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__sequenceFlow, "createdEdges");

			// create link
			definitions__rootElements__process.setSrc(definitions);

			// create link
			__packageDeclaration_actors_actor.setSrc(packageDeclaration);

			// create link
			__packageDeclaration_useCases_useCase.setSrc(packageDeclaration);

			// create link
			processToActor__source__process.setTrg(process);

			// create link
			processToUseCase__source__process.setTrg(process);

			// create link
			process__flowElements__sequenceFlow.setSrc(process);

			// create link
			process__flowElements__startEvent.setSrc(process);

			// create link
			definitions__rootElements__process.setTrg(process);

			// create link
			processToUseCase__target__useCase.setTrg(useCase);

			// create link
			__useCase_flows_basicFlow.setSrc(useCase);

			// create link
			__packageDeclaration_useCases_useCase.setTrg(useCase);

			// create link
			processToUseCase__source__process.setSrc(processToUseCase);

			// create link
			processToUseCase__target__useCase.setSrc(processToUseCase);

			// create link
			startEventToBasicFlow__source__startEvent.setTrg(startEvent);

			// create link
			process__flowElements__startEvent.setTrg(startEvent);

			// create link
			startEvent__outgoing__sequenceFlow.setSrc(startEvent);

			// create link
			sequenceFlow__sourceRef__startEvent.setTrg(startEvent);

			// create link
			sequenceFlowToBasicFlow__target__basicFlow.setTrg(basicFlow);

			// create link
			startEventToBasicFlow__target__basicFlow.setTrg(basicFlow);

			// create link
			__useCase_flows_basicFlow.setTrg(basicFlow);

			// create link
			startEventToBasicFlow__source__startEvent
					.setSrc(startEventToBasicFlow);

			// create link
			startEventToBasicFlow__target__basicFlow
					.setSrc(startEventToBasicFlow);

			// create link
			startEvent__outgoing__sequenceFlow.setTrg(sequenceFlow);

			// create link
			sequenceFlow__sourceRef__startEvent.setSrc(sequenceFlow);

			// create link
			process__flowElements__sequenceFlow.setTrg(sequenceFlow);

			// create link
			sequenceFlowToBasicFlow__source__sequenceFlow.setTrg(sequenceFlow);

			// create link
			sequenceFlowToBasicFlow__source__sequenceFlow
					.setSrc(sequenceFlowToBasicFlow);

			// create link
			sequenceFlowToBasicFlow__target__basicFlow
					.setSrc(sequenceFlowToBasicFlow);

			// create link
			__packageDeclaration_actors_actor.setTrg(actor);

			// create link
			processToActor__target__actor.setTrg(actor);

			// create link
			processToActor__target__actor.setSrc(processToActor);

			// create link
			processToActor__source__process.setSrc(processToActor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, definitions, packageDeclaration,
				definitionsToPackage, process, useCase, processToUseCase,
				startEvent, basicFlow, startEventToBasicFlow, sequenceFlow,
				sequenceFlowToBasicFlow, actor, processToActor);
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
		BasicFlow basicFlow = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __definitionsToPackage_source_definitions = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __definitionsToPackage_target_packageDeclaration = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
		CSP csp = null;
		Definitions definitions = null;
		Iterator fujaba__IterPackageDeclarationToDefinitionsToPackage = null;
		DefinitionsToPackage definitionsToPackage = null;

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
			ruleresult.setRule("ProcessToUseCaseRule");

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
			_TmpObject = (match.getObject("basicFlow"));

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;
			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link target from packageDeclaration to definitionsToPackage
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToDefinitionsToPackage = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							packageDeclaration, DefinitionsToPackage.class,
							"target")).iterator();

			while (fujaba__IterPackageDeclarationToDefinitionsToPackage
					.hasNext()) {
				try {
					definitionsToPackage = (DefinitionsToPackage) fujaba__IterPackageDeclarationToDefinitionsToPackage
							.next();

					// check object definitionsToPackage is really bound
					JavaSDM.ensure(definitionsToPackage != null);
					// bind object
					definitions = definitionsToPackage.getSource();

					// check object definitions is really bound
					JavaSDM.ensure(definitions != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object definitions is really bound
						JavaSDM.ensure(definitions != null);
						// check object definitionsToPackage is really bound
						JavaSDM.ensure(definitionsToPackage != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link source from definitionsToPackage to definitions
						JavaSDM.ensure(definitions.equals(definitionsToPackage
								.getSource()));

						// check link target from definitionsToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(definitionsToPackage.getTarget()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __definitionsToPackage_source_definitions
						__definitionsToPackage_source_definitions = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclaration_actors_actor
						__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __definitionsToPackage_target_packageDeclaration
						__definitionsToPackage_target_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_basicFlow
						__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase
								.setName("useCases");
						// assign attribute __packageDeclaration_actors_actor
						__packageDeclaration_actors_actor.setName("actors");
						// assign attribute __definitionsToPackage_source_definitions
						__definitionsToPackage_source_definitions
								.setName("source");
						// assign attribute __definitionsToPackage_target_packageDeclaration
						__definitionsToPackage_target_packageDeclaration
								.setName("target");
						// assign attribute __useCase_flows_basicFlow
						__useCase_flows_basicFlow.setName("flows");

						// create link
						isApplicableMatch.getAllContextElements().add(
								definitions);

						// create link
						__definitionsToPackage_source_definitions
								.setTrg(definitions);

						// create link
						__packageDeclaration_actors_actor
								.setSrc(packageDeclaration);

						// create link
						__definitionsToPackage_target_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__packageDeclaration_useCases_useCase
								.setSrc(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__definitionsToPackage_source_definitions
								.setSrc(definitionsToPackage);

						// create link
						__definitionsToPackage_target_packageDeclaration
								.setSrc(definitionsToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								definitionsToPackage);

						// create link
						__packageDeclaration_useCases_useCase.setTrg(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__useCase_flows_basicFlow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements()
								.add(basicFlow);

						// create link
						__useCase_flows_basicFlow.setTrg(basicFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(actor);

						// create link
						__packageDeclaration_actors_actor.setTrg(actor);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclaration_useCases_useCase,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclaration_actors_actor,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__definitionsToPackage_source_definitions,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_basicFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__definitionsToPackage_target_packageDeclaration,
										"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, definitions,
									packageDeclaration, definitionsToPackage,
									useCase, basicFlow, actor));

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
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("ProcessToUseCaseRule");
								// assign attribute ruleresult
								ruleresult.setSuccess(true);

								// create link
								ruleresult.getIsApplicableMatch().add(
										isApplicableMatch);

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
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);
		match.registerObject("basicFlow", basicFlow);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("sys");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("SYSTEM");
		literal1.setType("String");

		// Create attribute variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		var_actor_name.setType("");
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("EObject");

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_actor_name, literal0);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal1);
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
			Definitions definitions, PackageDeclaration packageDeclaration,
			DefinitionsToPackage definitionsToPackage, UseCase useCase,
			BasicFlow basicFlow, Actor actor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("");
		Variable var_useCase_description = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.description", true, csp);
		var_useCase_description.setValue(useCase.getDescription());
		var_useCase_description.setType("");
		Variable var_useCase_preConditions = CSPFactoryHelper.eINSTANCE
				.createVariable("useCase.preConditions", true, csp);
		var_useCase_preConditions.setValue(useCase.getPreConditions());
		var_useCase_preConditions.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.id", csp);
		var_process_id.setType("");
		Variable var_process_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"process.name", csp);
		var_process_name.setType("");
		Variable var_startEvent_name = CSPFactoryHelper.eINSTANCE
				.createVariable("startEvent.name", csp);
		var_startEvent_name.setType("");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_process_id, var_useCase_name);
		eq_0.setRuleName("");
		eq_0.solve(var_process_name, var_useCase_description);
		eq_1.setRuleName("");
		eq_1.solve(var_startEvent_name, var_useCase_preConditions);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackage",
				definitionsToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
		isApplicableMatch.registerObject("actor", actor);
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
			EObject definitionsToPackage, EObject process, EObject useCase,
			EObject processToUseCase, EObject startEvent, EObject basicFlow,
			EObject startEventToBasicFlow, EObject sequenceFlow,
			EObject sequenceFlowToBasicFlow, EObject actor,
			EObject processToActor) {
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackage", definitionsToPackage);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("startEvent", startEvent);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("startEventToBasicFlow",
				startEventToBasicFlow);
		ruleresult.registerObject("sequenceFlow", sequenceFlow);
		ruleresult.registerObject("sequenceFlowToBasicFlow",
				sequenceFlowToBasicFlow);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("processToActor", processToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("useCase")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getUseCase())
				&& match.getObject("basicFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getBasicFlow())
				&& match.getObject("actor")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getActor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_rootElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_147831 = null;
		FlowElementsContainer __DEC_startEvent_flowElements_520608 = null;
		Definitions __DEC_process_rootElements_406733 = null;
		Iterator fujaba__IterStartEventTo__DEC_startEvent_targetRef_338486 = null;
		SequenceFlow __DEC_startEvent_targetRef_338486 = null;
		Match match = null;
		StartEvent startEvent = null;
		Iterator fujaba__IterProcessToSequenceFlow = null;
		SequenceFlow sequenceFlow = null;
		bpmn2.Process process = null;
		Definitions definitions = null;

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

			// check object _edge_rootElements is really bound
			JavaSDM.ensure(_edge_rootElements != null);
			// bind object
			_TmpObject = _edge_rootElements.getSrc();

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;

			// bind object
			_TmpObject = _edge_rootElements.getTrg();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check link rootElements from process to definitions
			JavaSDM.ensure(definitions.equals(process.eContainer()));

			// iterate to-many link flowElements from process to sequenceFlow
			fujaba__Success = false;

			fujaba__IterProcessToSequenceFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToSequenceFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToSequenceFlow.next();

					// ensure correct type and really bound of object sequenceFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					sequenceFlow = (SequenceFlow) _TmpObject;
					// bind object
					_TmpObject = sequenceFlow.getSourceRef();

					// ensure correct type and really bound of object startEvent
					JavaSDM.ensure(_TmpObject instanceof StartEvent);
					startEvent = (StartEvent) _TmpObject;

					// check link flowElements from startEvent to process
					JavaSDM.ensure(process.equals(startEvent.eContainer()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_sequenceFlow_flowElements_147831 = sequenceFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
									.eContainer() : null;

							// check object __DEC_sequenceFlow_flowElements_147831 is really bound
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_147831 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_147831
									.getFlowElements().contains(sequenceFlow));

							// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_147831 and process 
							JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_147831
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
							__DEC_startEvent_flowElements_520608 = startEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) startEvent
									.eContainer() : null;

							// check object __DEC_startEvent_flowElements_520608 is really bound
							JavaSDM.ensure(__DEC_startEvent_flowElements_520608 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_startEvent_flowElements_520608
									.getFlowElements().contains(startEvent));

							// check isomorphic binding between objects __DEC_startEvent_flowElements_520608 and process 
							JavaSDM.ensure(!__DEC_startEvent_flowElements_520608
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
							__DEC_process_rootElements_406733 = process
									.eContainer() instanceof Definitions ? (Definitions) process
									.eContainer() : null;

							// check object __DEC_process_rootElements_406733 is really bound
							JavaSDM.ensure(__DEC_process_rootElements_406733 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_process_rootElements_406733
									.getRootElements().contains(process));

							// check isomorphic binding between objects __DEC_process_rootElements_406733 and definitions 
							JavaSDM.ensure(!__DEC_process_rootElements_406733
									.equals(definitions));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from sequenceFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(sequenceFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from startEvent to __DEC_startEvent_targetRef_338486
							fujaba__Success = false;

							fujaba__IterStartEventTo__DEC_startEvent_targetRef_338486 = new ArrayList(
									startEvent.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterStartEventTo__DEC_startEvent_targetRef_338486
											.hasNext()) {
								try {
									__DEC_startEvent_targetRef_338486 = (SequenceFlow) fujaba__IterStartEventTo__DEC_startEvent_targetRef_338486
											.next();

									// check object __DEC_startEvent_targetRef_338486 is really bound
									JavaSDM.ensure(__DEC_startEvent_targetRef_338486 != null);
									// check isomorphic binding between objects __DEC_startEvent_targetRef_338486 and sequenceFlow 
									JavaSDM.ensure(!__DEC_startEvent_targetRef_338486
											.equals(sequenceFlow));

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

						// check object _edge_rootElements is really bound
						JavaSDM.ensure(_edge_rootElements != null);
						// check object definitions is really bound
						JavaSDM.ensure(definitions != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check object sequenceFlow is really bound
						JavaSDM.ensure(sequenceFlow != null);
						// check object startEvent is really bound
						JavaSDM.ensure(startEvent != null);
						// check link flowElements from sequenceFlow to process
						JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

						// check link flowElements from startEvent to process
						JavaSDM.ensure(process.equals(startEvent.eContainer()));

						// check link rootElements from process to definitions
						JavaSDM.ensure(definitions.equals(process.eContainer()));

						// check link sourceRef from sequenceFlow to startEvent
						JavaSDM.ensure(startEvent.equals(sequenceFlow
								.getSourceRef()));

						// check link src from _edge_rootElements to definitions
						JavaSDM.ensure(definitions.equals(_edge_rootElements
								.getSrc()));

						// check link targetRef from sequenceFlow to startEvent
						JavaSDM.ensure(!(startEvent.equals(sequenceFlow
								.getTargetRef())));

						// check link trg from _edge_rootElements to process
						JavaSDM.ensure(process.equals(_edge_rootElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								definitions, process, startEvent, sequenceFlow);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(
			EMoflonEdge _edge_useCases) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_918795 = null;
		UseCase __DEC_basicFlow_flows_254983 = null;
		PackageDeclaration __DEC_useCase_useCases_556607 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToBasicFlow = null;
		BasicFlow basicFlow = null;
		Iterator fujaba__IterPackageDeclarationToActor = null;
		Actor actor = null;
		UseCase useCase = null;
		PackageDeclaration packageDeclaration = null;

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

			// check object _edge_useCases is really bound
			JavaSDM.ensure(_edge_useCases != null);
			// bind object
			_TmpObject = _edge_useCases.getSrc();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// bind object
			_TmpObject = _edge_useCases.getTrg();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// check link useCases from useCase to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

			// iterate to-many link actors from packageDeclaration to actor
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToActor = new ArrayList(
					packageDeclaration.getActors()).iterator();

			while (fujaba__IterPackageDeclarationToActor.hasNext()) {
				try {
					actor = (Actor) fujaba__IterPackageDeclarationToActor
							.next();

					// check object actor is really bound
					JavaSDM.ensure(actor != null);
					// iterate to-many link flows from useCase to basicFlow
					fujaba__Success = false;

					fujaba__IterUseCaseToBasicFlow = new ArrayList(
							useCase.getFlows()).iterator();

					while (fujaba__IterUseCaseToBasicFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterUseCaseToBasicFlow.next();

							// ensure correct type and really bound of object basicFlow
							JavaSDM.ensure(_TmpObject instanceof BasicFlow);
							basicFlow = (BasicFlow) _TmpObject;
							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_actor_actors_918795 = actor
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
											.eContainer() : null;

									// check object __DEC_actor_actors_918795 is really bound
									JavaSDM.ensure(__DEC_actor_actors_918795 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_actor_actors_918795
											.getActors().contains(actor));

									// check isomorphic binding between objects __DEC_actor_actors_918795 and packageDeclaration 
									JavaSDM.ensure(!__DEC_actor_actors_918795
											.equals(packageDeclaration));

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
									__DEC_basicFlow_flows_254983 = basicFlow
											.eContainer() instanceof UseCase ? (UseCase) basicFlow
											.eContainer() : null;

									// check object __DEC_basicFlow_flows_254983 is really bound
									JavaSDM.ensure(__DEC_basicFlow_flows_254983 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_basicFlow_flows_254983
											.getFlows().contains(basicFlow));

									// check isomorphic binding between objects __DEC_basicFlow_flows_254983 and useCase 
									JavaSDM.ensure(!__DEC_basicFlow_flows_254983
											.equals(useCase));

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
									__DEC_useCase_useCases_556607 = useCase
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
											.eContainer() : null;

									// check object __DEC_useCase_useCases_556607 is really bound
									JavaSDM.ensure(__DEC_useCase_useCases_556607 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_useCase_useCases_556607
											.getUseCases().contains(useCase));

									// check isomorphic binding between objects __DEC_useCase_useCases_556607 and packageDeclaration 
									JavaSDM.ensure(!__DEC_useCase_useCases_556607
											.equals(packageDeclaration));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_useCases is really bound
								JavaSDM.ensure(_edge_useCases != null);
								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object basicFlow is really bound
								JavaSDM.ensure(basicFlow != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from basicFlow to useCase
								JavaSDM.ensure(useCase.equals(basicFlow
										.eContainer()));

								// check link src from _edge_useCases to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(_edge_useCases.getSrc()));

								// check link trg from _edge_useCases to useCase
								JavaSDM.ensure(useCase.equals(_edge_useCases
										.getTrg()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										packageDeclaration, useCase, basicFlow,
										actor);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(
			EMoflonEdge _edge_actors) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_15969 = null;
		UseCase __DEC_basicFlow_flows_169420 = null;
		PackageDeclaration __DEC_useCase_useCases_242362 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToBasicFlow = null;
		BasicFlow basicFlow = null;
		Iterator fujaba__IterPackageDeclarationToUseCase = null;
		UseCase useCase = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;

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

			// check object _edge_actors is really bound
			JavaSDM.ensure(_edge_actors != null);
			// bind object
			_TmpObject = _edge_actors.getSrc();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// bind object
			_TmpObject = _edge_actors.getTrg();

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;

			// check link actors from actor to packageDeclaration
			JavaSDM.ensure(packageDeclaration.equals(actor.eContainer()));

			// iterate to-many link useCases from packageDeclaration to useCase
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToUseCase = new ArrayList(
					packageDeclaration.getUseCases()).iterator();

			while (fujaba__IterPackageDeclarationToUseCase.hasNext()) {
				try {
					useCase = (UseCase) fujaba__IterPackageDeclarationToUseCase
							.next();

					// check object useCase is really bound
					JavaSDM.ensure(useCase != null);
					// iterate to-many link flows from useCase to basicFlow
					fujaba__Success = false;

					fujaba__IterUseCaseToBasicFlow = new ArrayList(
							useCase.getFlows()).iterator();

					while (fujaba__IterUseCaseToBasicFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterUseCaseToBasicFlow.next();

							// ensure correct type and really bound of object basicFlow
							JavaSDM.ensure(_TmpObject instanceof BasicFlow);
							basicFlow = (BasicFlow) _TmpObject;
							// story node 'test core match and DECs'
							try {
								fujaba__Success = false;

								// check negative bindings
								try {
									fujaba__Success = false;

									// bind object
									__DEC_actor_actors_15969 = actor
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
											.eContainer() : null;

									// check object __DEC_actor_actors_15969 is really bound
									JavaSDM.ensure(__DEC_actor_actors_15969 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_actor_actors_15969
											.getActors().contains(actor));

									// check isomorphic binding between objects __DEC_actor_actors_15969 and packageDeclaration 
									JavaSDM.ensure(!__DEC_actor_actors_15969
											.equals(packageDeclaration));

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
									__DEC_basicFlow_flows_169420 = basicFlow
											.eContainer() instanceof UseCase ? (UseCase) basicFlow
											.eContainer() : null;

									// check object __DEC_basicFlow_flows_169420 is really bound
									JavaSDM.ensure(__DEC_basicFlow_flows_169420 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_basicFlow_flows_169420
											.getFlows().contains(basicFlow));

									// check isomorphic binding between objects __DEC_basicFlow_flows_169420 and useCase 
									JavaSDM.ensure(!__DEC_basicFlow_flows_169420
											.equals(useCase));

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
									__DEC_useCase_useCases_242362 = useCase
											.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
											.eContainer() : null;

									// check object __DEC_useCase_useCases_242362 is really bound
									JavaSDM.ensure(__DEC_useCase_useCases_242362 != null);

									// check if contained via correct reference
									JavaSDM.ensure(__DEC_useCase_useCases_242362
											.getUseCases().contains(useCase));

									// check isomorphic binding between objects __DEC_useCase_useCases_242362 and packageDeclaration 
									JavaSDM.ensure(!__DEC_useCase_useCases_242362
											.equals(packageDeclaration));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								fujaba__Success = !(fujaba__Success);

								JavaSDM.ensure(fujaba__Success);

								// check object _edge_actors is really bound
								JavaSDM.ensure(_edge_actors != null);
								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object basicFlow is really bound
								JavaSDM.ensure(basicFlow != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link flows from basicFlow to useCase
								JavaSDM.ensure(useCase.equals(basicFlow
										.eContainer()));

								// check link src from _edge_actors to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(_edge_actors.getSrc()));

								// check link trg from _edge_actors to actor
								JavaSDM.ensure(actor.equals(_edge_actors
										.getTrg()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object match
								match = TGGRuntimeFactory.eINSTANCE
										.createMatch();

								// assign attribute match
								match.setRuleName(__eClass.getName());
								// statement node 'bookkeeping with generic isAppropriate method'
								fujaba__Success = this.isAppropriate_BWD(match,
										packageDeclaration, useCase, basicFlow,
										actor);
								if (fujaba__Success) {
									// statement node 'Ensure that the correct types of elements are matched'
									fujaba__Success = this
											.checkTypes_BWD(match);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_741426 = null;
		FlowElementsContainer __DEC_startEvent_flowElements_999427 = null;
		Definitions __DEC_process_rootElements_536667 = null;
		Iterator fujaba__IterStartEventTo__DEC_startEvent_targetRef_59342 = null;
		SequenceFlow __DEC_startEvent_targetRef_59342 = null;
		Match match = null;
		Iterator fujaba__IterProcessToSequenceFlow = null;
		SequenceFlow sequenceFlow = null;
		StartEvent startEvent = null;
		Definitions definitions = null;
		bpmn2.Process process = null;

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
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// bind object
			definitions = process.eContainer() instanceof Definitions ? (Definitions) process
					.eContainer() : null;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);

			// check if contained via correct reference
			JavaSDM.ensure(definitions.getRootElements().contains(process));

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object startEvent
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			startEvent = (StartEvent) _TmpObject;

			// check link flowElements from startEvent to process
			JavaSDM.ensure(process.equals(startEvent.eContainer()));

			// iterate to-many link flowElements from process to sequenceFlow
			fujaba__Success = false;

			fujaba__IterProcessToSequenceFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToSequenceFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToSequenceFlow.next();

					// ensure correct type and really bound of object sequenceFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					sequenceFlow = (SequenceFlow) _TmpObject;
					// check link sourceRef from sequenceFlow to startEvent
					JavaSDM.ensure(startEvent.equals(sequenceFlow
							.getSourceRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_sequenceFlow_flowElements_741426 = sequenceFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
									.eContainer() : null;

							// check object __DEC_sequenceFlow_flowElements_741426 is really bound
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_741426 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_741426
									.getFlowElements().contains(sequenceFlow));

							// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_741426 and process 
							JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_741426
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
							__DEC_startEvent_flowElements_999427 = startEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) startEvent
									.eContainer() : null;

							// check object __DEC_startEvent_flowElements_999427 is really bound
							JavaSDM.ensure(__DEC_startEvent_flowElements_999427 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_startEvent_flowElements_999427
									.getFlowElements().contains(startEvent));

							// check isomorphic binding between objects __DEC_startEvent_flowElements_999427 and process 
							JavaSDM.ensure(!__DEC_startEvent_flowElements_999427
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
							__DEC_process_rootElements_536667 = process
									.eContainer() instanceof Definitions ? (Definitions) process
									.eContainer() : null;

							// check object __DEC_process_rootElements_536667 is really bound
							JavaSDM.ensure(__DEC_process_rootElements_536667 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_process_rootElements_536667
									.getRootElements().contains(process));

							// check isomorphic binding between objects __DEC_process_rootElements_536667 and definitions 
							JavaSDM.ensure(!__DEC_process_rootElements_536667
									.equals(definitions));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from sequenceFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(sequenceFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from startEvent to __DEC_startEvent_targetRef_59342
							fujaba__Success = false;

							fujaba__IterStartEventTo__DEC_startEvent_targetRef_59342 = new ArrayList(
									startEvent.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterStartEventTo__DEC_startEvent_targetRef_59342
											.hasNext()) {
								try {
									__DEC_startEvent_targetRef_59342 = (SequenceFlow) fujaba__IterStartEventTo__DEC_startEvent_targetRef_59342
											.next();

									// check object __DEC_startEvent_targetRef_59342 is really bound
									JavaSDM.ensure(__DEC_startEvent_targetRef_59342 != null);
									// check isomorphic binding between objects __DEC_startEvent_targetRef_59342 and sequenceFlow 
									JavaSDM.ensure(!__DEC_startEvent_targetRef_59342
											.equals(sequenceFlow));

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
						// check object definitions is really bound
						JavaSDM.ensure(definitions != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check object sequenceFlow is really bound
						JavaSDM.ensure(sequenceFlow != null);
						// check object startEvent is really bound
						JavaSDM.ensure(startEvent != null);
						// check link flowElements from sequenceFlow to process
						JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

						// check link flowElements from startEvent to process
						JavaSDM.ensure(process.equals(startEvent.eContainer()));

						// check link rootElements from process to definitions
						JavaSDM.ensure(definitions.equals(process.eContainer()));

						// check link sourceRef from sequenceFlow to startEvent
						JavaSDM.ensure(startEvent.equals(sequenceFlow
								.getSourceRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link targetRef from sequenceFlow to startEvent
						JavaSDM.ensure(!(startEvent.equals(sequenceFlow
								.getTargetRef())));

						// check link trg from _edge_flowElements to startEvent
						JavaSDM.ensure(startEvent.equals(_edge_flowElements
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								definitions, process, startEvent, sequenceFlow);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_18115 = null;
		FlowElementsContainer __DEC_startEvent_flowElements_728117 = null;
		Definitions __DEC_process_rootElements_926013 = null;
		Iterator fujaba__IterStartEventTo__DEC_startEvent_targetRef_811076 = null;
		SequenceFlow __DEC_startEvent_targetRef_811076 = null;
		Match match = null;
		StartEvent startEvent = null;
		SequenceFlow sequenceFlow = null;
		Definitions definitions = null;
		bpmn2.Process process = null;

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
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// bind object
			definitions = process.eContainer() instanceof Definitions ? (Definitions) process
					.eContainer() : null;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);

			// check if contained via correct reference
			JavaSDM.ensure(definitions.getRootElements().contains(process));

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;

			// check link flowElements from sequenceFlow to process
			JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

			// bind object
			_TmpObject = sequenceFlow.getSourceRef();

			// ensure correct type and really bound of object startEvent
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			startEvent = (StartEvent) _TmpObject;

			// check link flowElements from startEvent to process
			JavaSDM.ensure(process.equals(startEvent.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_sequenceFlow_flowElements_18115 = sequenceFlow
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
							.eContainer() : null;

					// check object __DEC_sequenceFlow_flowElements_18115 is really bound
					JavaSDM.ensure(__DEC_sequenceFlow_flowElements_18115 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_sequenceFlow_flowElements_18115
							.getFlowElements().contains(sequenceFlow));

					// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_18115 and process 
					JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_18115
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
					__DEC_startEvent_flowElements_728117 = startEvent
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) startEvent
							.eContainer() : null;

					// check object __DEC_startEvent_flowElements_728117 is really bound
					JavaSDM.ensure(__DEC_startEvent_flowElements_728117 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_startEvent_flowElements_728117
							.getFlowElements().contains(startEvent));

					// check isomorphic binding between objects __DEC_startEvent_flowElements_728117 and process 
					JavaSDM.ensure(!__DEC_startEvent_flowElements_728117
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
					__DEC_process_rootElements_926013 = process.eContainer() instanceof Definitions ? (Definitions) process
							.eContainer() : null;

					// check object __DEC_process_rootElements_926013 is really bound
					JavaSDM.ensure(__DEC_process_rootElements_926013 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_process_rootElements_926013
							.getRootElements().contains(process));

					// check isomorphic binding between objects __DEC_process_rootElements_926013 and definitions 
					JavaSDM.ensure(!__DEC_process_rootElements_926013
							.equals(definitions));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link default from sequenceFlow
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(sequenceFlow,
								ExclusiveGateway.class, "default").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link targetRef from startEvent to __DEC_startEvent_targetRef_811076
					fujaba__Success = false;

					fujaba__IterStartEventTo__DEC_startEvent_targetRef_811076 = new ArrayList(
							startEvent.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterStartEventTo__DEC_startEvent_targetRef_811076
									.hasNext()) {
						try {
							__DEC_startEvent_targetRef_811076 = (SequenceFlow) fujaba__IterStartEventTo__DEC_startEvent_targetRef_811076
									.next();

							// check object __DEC_startEvent_targetRef_811076 is really bound
							JavaSDM.ensure(__DEC_startEvent_targetRef_811076 != null);
							// check isomorphic binding between objects __DEC_startEvent_targetRef_811076 and sequenceFlow 
							JavaSDM.ensure(!__DEC_startEvent_targetRef_811076
									.equals(sequenceFlow));

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
				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check object sequenceFlow is really bound
				JavaSDM.ensure(sequenceFlow != null);
				// check object startEvent is really bound
				JavaSDM.ensure(startEvent != null);
				// check link flowElements from sequenceFlow to process
				JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

				// check link flowElements from startEvent to process
				JavaSDM.ensure(process.equals(startEvent.eContainer()));

				// check link rootElements from process to definitions
				JavaSDM.ensure(definitions.equals(process.eContainer()));

				// check link sourceRef from sequenceFlow to startEvent
				JavaSDM.ensure(startEvent.equals(sequenceFlow.getSourceRef()));

				// check link src from _edge_flowElements to process
				JavaSDM.ensure(process.equals(_edge_flowElements.getSrc()));

				// check link targetRef from sequenceFlow to startEvent
				JavaSDM.ensure(!(startEvent.equals(sequenceFlow.getTargetRef())));

				// check link trg from _edge_flowElements to sequenceFlow
				JavaSDM.ensure(sequenceFlow.equals(_edge_flowElements.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, definitions,
						process, startEvent, sequenceFlow);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_366519 = null;
		UseCase __DEC_basicFlow_flows_73772 = null;
		PackageDeclaration __DEC_useCase_useCases_756214 = null;
		Match match = null;
		Iterator fujaba__IterPackageDeclarationToActor = null;
		Actor actor = null;
		PackageDeclaration packageDeclaration = null;
		BasicFlow basicFlow = null;
		UseCase useCase = null;

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

			// check object _edge_flows is really bound
			JavaSDM.ensure(_edge_flows != null);
			// bind object
			_TmpObject = _edge_flows.getSrc();

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;

			// bind object
			_TmpObject = _edge_flows.getTrg();

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;

			// check link flows from basicFlow to useCase
			JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

			// bind object
			packageDeclaration = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
					.eContainer() : null;

			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);

			// check if contained via correct reference
			JavaSDM.ensure(packageDeclaration.getUseCases().contains(useCase));

			// iterate to-many link actors from packageDeclaration to actor
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToActor = new ArrayList(
					packageDeclaration.getActors()).iterator();

			while (fujaba__IterPackageDeclarationToActor.hasNext()) {
				try {
					actor = (Actor) fujaba__IterPackageDeclarationToActor
							.next();

					// check object actor is really bound
					JavaSDM.ensure(actor != null);
					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_actor_actors_366519 = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
									.eContainer() : null;

							// check object __DEC_actor_actors_366519 is really bound
							JavaSDM.ensure(__DEC_actor_actors_366519 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_actor_actors_366519
									.getActors().contains(actor));

							// check isomorphic binding between objects __DEC_actor_actors_366519 and packageDeclaration 
							JavaSDM.ensure(!__DEC_actor_actors_366519
									.equals(packageDeclaration));

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
							__DEC_basicFlow_flows_73772 = basicFlow
									.eContainer() instanceof UseCase ? (UseCase) basicFlow
									.eContainer() : null;

							// check object __DEC_basicFlow_flows_73772 is really bound
							JavaSDM.ensure(__DEC_basicFlow_flows_73772 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_basicFlow_flows_73772
									.getFlows().contains(basicFlow));

							// check isomorphic binding between objects __DEC_basicFlow_flows_73772 and useCase 
							JavaSDM.ensure(!__DEC_basicFlow_flows_73772
									.equals(useCase));

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
							__DEC_useCase_useCases_756214 = useCase
									.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
									.eContainer() : null;

							// check object __DEC_useCase_useCases_756214 is really bound
							JavaSDM.ensure(__DEC_useCase_useCases_756214 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_useCase_useCases_756214
									.getUseCases().contains(useCase));

							// check isomorphic binding between objects __DEC_useCase_useCases_756214 and packageDeclaration 
							JavaSDM.ensure(!__DEC_useCase_useCases_756214
									.equals(packageDeclaration));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flows is really bound
						JavaSDM.ensure(_edge_flows != null);
						// check object actor is really bound
						JavaSDM.ensure(actor != null);
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link src from _edge_flows to useCase
						JavaSDM.ensure(useCase.equals(_edge_flows.getSrc()));

						// check link trg from _edge_flows to basicFlow
						JavaSDM.ensure(basicFlow.equals(_edge_flows.getTrg()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								packageDeclaration, useCase, basicFlow, actor);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(
			EMoflonEdge _edge_sourceRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_593425 = null;
		FlowElementsContainer __DEC_startEvent_flowElements_863212 = null;
		Definitions __DEC_process_rootElements_319316 = null;
		Iterator fujaba__IterStartEventTo__DEC_startEvent_targetRef_382446 = null;
		SequenceFlow __DEC_startEvent_targetRef_382446 = null;
		Match match = null;
		Definitions definitions = null;
		bpmn2.Process process = null;
		StartEvent startEvent = null;
		SequenceFlow sequenceFlow = null;

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

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = _edge_sourceRef.getTrg();

			// ensure correct type and really bound of object startEvent
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			startEvent = (StartEvent) _TmpObject;

			// bind object
			_TmpObject = startEvent.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) startEvent
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(startEvent));

			// check link flowElements from sequenceFlow to process
			JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

			// bind object
			definitions = process.eContainer() instanceof Definitions ? (Definitions) process
					.eContainer() : null;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);

			// check if contained via correct reference
			JavaSDM.ensure(definitions.getRootElements().contains(process));

			// check link sourceRef from sequenceFlow to startEvent
			JavaSDM.ensure(startEvent.equals(sequenceFlow.getSourceRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_sequenceFlow_flowElements_593425 = sequenceFlow
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
							.eContainer() : null;

					// check object __DEC_sequenceFlow_flowElements_593425 is really bound
					JavaSDM.ensure(__DEC_sequenceFlow_flowElements_593425 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_sequenceFlow_flowElements_593425
							.getFlowElements().contains(sequenceFlow));

					// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_593425 and process 
					JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_593425
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
					__DEC_startEvent_flowElements_863212 = startEvent
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) startEvent
							.eContainer() : null;

					// check object __DEC_startEvent_flowElements_863212 is really bound
					JavaSDM.ensure(__DEC_startEvent_flowElements_863212 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_startEvent_flowElements_863212
							.getFlowElements().contains(startEvent));

					// check isomorphic binding between objects __DEC_startEvent_flowElements_863212 and process 
					JavaSDM.ensure(!__DEC_startEvent_flowElements_863212
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
					__DEC_process_rootElements_319316 = process.eContainer() instanceof Definitions ? (Definitions) process
							.eContainer() : null;

					// check object __DEC_process_rootElements_319316 is really bound
					JavaSDM.ensure(__DEC_process_rootElements_319316 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_process_rootElements_319316
							.getRootElements().contains(process));

					// check isomorphic binding between objects __DEC_process_rootElements_319316 and definitions 
					JavaSDM.ensure(!__DEC_process_rootElements_319316
							.equals(definitions));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link default from sequenceFlow
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(sequenceFlow,
								ExclusiveGateway.class, "default").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link targetRef from startEvent to __DEC_startEvent_targetRef_382446
					fujaba__Success = false;

					fujaba__IterStartEventTo__DEC_startEvent_targetRef_382446 = new ArrayList(
							startEvent.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterStartEventTo__DEC_startEvent_targetRef_382446
									.hasNext()) {
						try {
							__DEC_startEvent_targetRef_382446 = (SequenceFlow) fujaba__IterStartEventTo__DEC_startEvent_targetRef_382446
									.next();

							// check object __DEC_startEvent_targetRef_382446 is really bound
							JavaSDM.ensure(__DEC_startEvent_targetRef_382446 != null);
							// check isomorphic binding between objects __DEC_startEvent_targetRef_382446 and sequenceFlow 
							JavaSDM.ensure(!__DEC_startEvent_targetRef_382446
									.equals(sequenceFlow));

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
				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check object sequenceFlow is really bound
				JavaSDM.ensure(sequenceFlow != null);
				// check object startEvent is really bound
				JavaSDM.ensure(startEvent != null);
				// check link flowElements from sequenceFlow to process
				JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

				// check link flowElements from startEvent to process
				JavaSDM.ensure(process.equals(startEvent.eContainer()));

				// check link rootElements from process to definitions
				JavaSDM.ensure(definitions.equals(process.eContainer()));

				// check link sourceRef from sequenceFlow to startEvent
				JavaSDM.ensure(startEvent.equals(sequenceFlow.getSourceRef()));

				// check link src from _edge_sourceRef to sequenceFlow
				JavaSDM.ensure(sequenceFlow.equals(_edge_sourceRef.getSrc()));

				// check link targetRef from sequenceFlow to startEvent
				JavaSDM.ensure(!(startEvent.equals(sequenceFlow.getTargetRef())));

				// check link trg from _edge_sourceRef to startEvent
				JavaSDM.ensure(startEvent.equals(_edge_sourceRef.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, definitions,
						process, startEvent, sequenceFlow);
				if (fujaba__Success) {
					// statement node 'Ensure that the correct types of elements are matched'
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(
			EMoflonEdge _edge_outgoing) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_sequenceFlow_flowElements_987780 = null;
		FlowElementsContainer __DEC_startEvent_flowElements_952416 = null;
		Definitions __DEC_process_rootElements_908645 = null;
		Iterator fujaba__IterStartEventTo__DEC_startEvent_targetRef_944268 = null;
		SequenceFlow __DEC_startEvent_targetRef_944268 = null;
		Match match = null;
		Iterator fujaba__IterSequenceFlowTo_edge_sourceRef = null;
		EMoflonEdge _edge_sourceRef = null;
		Definitions definitions = null;
		bpmn2.Process process = null;
		SequenceFlow sequenceFlow = null;
		StartEvent startEvent = null;

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

			// ensure correct type and really bound of object startEvent
			JavaSDM.ensure(_TmpObject instanceof StartEvent);
			startEvent = (StartEvent) _TmpObject;

			// bind object
			_TmpObject = _edge_outgoing.getTrg();

			// ensure correct type and really bound of object sequenceFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			sequenceFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = sequenceFlow.eContainer() instanceof bpmn2.Process ? (bpmn2.Process) sequenceFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof bpmn2.Process);
			process = (bpmn2.Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(sequenceFlow));

			// check link flowElements from startEvent to process
			JavaSDM.ensure(process.equals(startEvent.eContainer()));

			// bind object
			definitions = process.eContainer() instanceof Definitions ? (Definitions) process
					.eContainer() : null;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);

			// check if contained via correct reference
			JavaSDM.ensure(definitions.getRootElements().contains(process));

			// check link sourceRef from sequenceFlow to startEvent
			JavaSDM.ensure(startEvent.equals(sequenceFlow.getSourceRef()));

			// iterate to-many link src from sequenceFlow to _edge_sourceRef
			fujaba__Success = false;

			fujaba__IterSequenceFlowTo_edge_sourceRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							sequenceFlow, EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterSequenceFlowTo_edge_sourceRef.hasNext()) {
				try {
					_edge_sourceRef = (EMoflonEdge) fujaba__IterSequenceFlowTo_edge_sourceRef
							.next();

					// check object _edge_sourceRef is really bound
					JavaSDM.ensure(_edge_sourceRef != null);
					// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
					JavaSDM.ensure(!_edge_sourceRef.equals(_edge_outgoing));

					// check link trg from _edge_sourceRef to startEvent
					JavaSDM.ensure(startEvent.equals(_edge_sourceRef.getTrg()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_sequenceFlow_flowElements_987780 = sequenceFlow
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) sequenceFlow
									.eContainer() : null;

							// check object __DEC_sequenceFlow_flowElements_987780 is really bound
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_987780 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_sequenceFlow_flowElements_987780
									.getFlowElements().contains(sequenceFlow));

							// check isomorphic binding between objects __DEC_sequenceFlow_flowElements_987780 and process 
							JavaSDM.ensure(!__DEC_sequenceFlow_flowElements_987780
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
							__DEC_startEvent_flowElements_952416 = startEvent
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) startEvent
									.eContainer() : null;

							// check object __DEC_startEvent_flowElements_952416 is really bound
							JavaSDM.ensure(__DEC_startEvent_flowElements_952416 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_startEvent_flowElements_952416
									.getFlowElements().contains(startEvent));

							// check isomorphic binding between objects __DEC_startEvent_flowElements_952416 and process 
							JavaSDM.ensure(!__DEC_startEvent_flowElements_952416
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
							__DEC_process_rootElements_908645 = process
									.eContainer() instanceof Definitions ? (Definitions) process
									.eContainer() : null;

							// check object __DEC_process_rootElements_908645 is really bound
							JavaSDM.ensure(__DEC_process_rootElements_908645 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_process_rootElements_908645
									.getRootElements().contains(process));

							// check isomorphic binding between objects __DEC_process_rootElements_908645 and definitions 
							JavaSDM.ensure(!__DEC_process_rootElements_908645
									.equals(definitions));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link default from sequenceFlow
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(sequenceFlow,
										ExclusiveGateway.class, "default")
								.size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link targetRef from startEvent to __DEC_startEvent_targetRef_944268
							fujaba__Success = false;

							fujaba__IterStartEventTo__DEC_startEvent_targetRef_944268 = new ArrayList(
									startEvent.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterStartEventTo__DEC_startEvent_targetRef_944268
											.hasNext()) {
								try {
									__DEC_startEvent_targetRef_944268 = (SequenceFlow) fujaba__IterStartEventTo__DEC_startEvent_targetRef_944268
											.next();

									// check object __DEC_startEvent_targetRef_944268 is really bound
									JavaSDM.ensure(__DEC_startEvent_targetRef_944268 != null);
									// check isomorphic binding between objects __DEC_startEvent_targetRef_944268 and sequenceFlow 
									JavaSDM.ensure(!__DEC_startEvent_targetRef_944268
											.equals(sequenceFlow));

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
						// check object definitions is really bound
						JavaSDM.ensure(definitions != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check object sequenceFlow is really bound
						JavaSDM.ensure(sequenceFlow != null);
						// check object startEvent is really bound
						JavaSDM.ensure(startEvent != null);
						// check isomorphic binding between objects _edge_sourceRef and _edge_outgoing 
						JavaSDM.ensure(!_edge_sourceRef.equals(_edge_outgoing));

						// check link flowElements from sequenceFlow to process
						JavaSDM.ensure(process.equals(sequenceFlow.eContainer()));

						// check link flowElements from startEvent to process
						JavaSDM.ensure(process.equals(startEvent.eContainer()));

						// check link rootElements from process to definitions
						JavaSDM.ensure(definitions.equals(process.eContainer()));

						// check link sourceRef from sequenceFlow to startEvent
						JavaSDM.ensure(startEvent.equals(sequenceFlow
								.getSourceRef()));

						// check link src from _edge_outgoing to startEvent
						JavaSDM.ensure(startEvent.equals(_edge_outgoing
								.getSrc()));

						// check link src from _edge_sourceRef to sequenceFlow
						JavaSDM.ensure(sequenceFlow.equals(_edge_sourceRef
								.getSrc()));

						// check link targetRef from sequenceFlow to startEvent
						JavaSDM.ensure(!(startEvent.equals(sequenceFlow
								.getTargetRef())));

						// check link trg from _edge_outgoing to sequenceFlow
						JavaSDM.ensure(sequenceFlow.equals(_edge_outgoing
								.getTrg()));

						// check link trg from _edge_sourceRef to startEvent
						JavaSDM.ensure(startEvent.equals(_edge_sourceRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								definitions, process, startEvent, sequenceFlow);
						if (fujaba__Success) {
							// statement node 'Ensure that the correct types of elements are matched'
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(StartEvent) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(StartEvent) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DEFINITIONS_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Definitions) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(StartEvent) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(DefinitionsToPackage) arguments.get(3),
					(bpmn2.Process) arguments.get(4),
					(StartEvent) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(Actor) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(Actor) arguments.get(4));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(Actor) arguments.get(4));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGE_USECASE_BASICFLOW_ACTOR:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Definitions) arguments.get(1),
					(PackageDeclaration) arguments.get(2),
					(DefinitionsToPackage) arguments.get(3),
					(UseCase) arguments.get(4), (BasicFlow) arguments.get(5),
					(Actor) arguments.get(6));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13));
			return null;
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROCESS_TO_USE_CASE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProcessToUseCaseRuleImpl
