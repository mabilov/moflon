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

import BpmnToUseCaseIntegration.Rules.LaneToActorRule;
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
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
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
 * An implementation of the model object '<em><b>Lane To Actor Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaneToActorRuleImpl extends AbstractRuleImpl implements
		LaneToActorRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneToActorRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLaneToActorRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __definitions_rootElements_process = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, laneSet,
					process, definitions, lane));

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
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __laneSet_lanes_lane
				__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __laneSet_lanes_lane
				__laneSet_lanes_lane.setName("lanes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						lane, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__laneSet_lanes_lane, "toBeTranslatedEdges");

				// create link
				__laneSet_lanes_lane.setSrc(laneSet);

				// create link
				__laneSet_lanes_lane.setTrg(lane);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_laneSets_laneSet
				__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __definitions_rootElements_process
				__definitions_rootElements_process = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_laneSets_laneSet
				__process_laneSets_laneSet.setName("laneSets");
				// assign attribute __definitions_rootElements_process
				__definitions_rootElements_process.setName("rootElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						laneSet, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_laneSets_laneSet, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						definitions, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__definitions_rootElements_process, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				__process_laneSets_laneSet.setTrg(laneSet);

				// create link
				__definitions_rootElements_process.setTrg(process);

				// create link
				__process_laneSets_laneSet.setSrc(process);

				// create link
				__definitions_rootElements_process.setSrc(definitions);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, laneSet, process,
					definitions, lane);
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
		DefinitionsToPackageDeclaration definitionsToPackageDeclaration = null;
		Lane lane = null;
		LaneSet laneSet = null;
		PackageDeclaration packageDeclaration = null;
		Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Actor actor = null;
		LaneToActor laneToActor = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge laneToActor__source__lane = null;
		EMoflonEdge laneToActor__target__actor = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge packageDeclaration__actors__actor = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("definitions"));

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("definitionsToPackageDeclaration"));

			// ensure correct type and really bound of object definitionsToPackageDeclaration
			JavaSDM.ensure(_TmpObject instanceof DefinitionsToPackageDeclaration);
			definitionsToPackageDeclaration = (DefinitionsToPackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToUseCase"));

			// ensure correct type and really bound of object processToUseCase
			JavaSDM.ensure(_TmpObject instanceof ProcessToUseCase);
			processToUseCase = (ProcessToUseCase) _TmpObject;
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
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object actor
			actor = UseCaseDSLFactory.eINSTANCE.createActor();

			// create object laneToActor
			laneToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createLaneToActor();

			// assign attribute actor
			actor.setName((java.lang.String) csp.getAttributeVariable("actor",
					"name").getValue());
			// assign attribute actor
			actor.setDescription((java.lang.String) csp.getAttributeVariable(
					"actor", "description").getValue());
			// assign attribute actor
			actor.setType((UseCaseDSL.ActorType) csp.getAttributeVariable(
					"actor", "type").getValue());

			// create link
			packageDeclaration.getActors().add(actor); // add link

			// create link
			laneToActor.setSource(lane);

			// create link
			laneToActor.setTarget(actor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneToActor is really bound
			JavaSDM.ensure(laneToActor != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneToActor, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					lane, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackageDeclaration is really bound
			JavaSDM.ensure(definitionsToPackageDeclaration != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object laneToActor is really bound
			JavaSDM.ensure(laneToActor != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects definitions and actor 
			JavaSDM.ensure(!definitions.equals(actor));

			// check isomorphic binding between objects definitionsToPackageDeclaration and actor 
			JavaSDM.ensure(!definitionsToPackageDeclaration.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects laneToActor and actor 
			JavaSDM.ensure(!laneToActor.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToUseCase and actor 
			JavaSDM.ensure(!processToUseCase.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects definitionsToPackageDeclaration and definitions 
			JavaSDM.ensure(!definitionsToPackageDeclaration.equals(definitions));

			// check isomorphic binding between objects lane and definitions 
			JavaSDM.ensure(!lane.equals(definitions));

			// check isomorphic binding between objects laneSet and definitions 
			JavaSDM.ensure(!laneSet.equals(definitions));

			// check isomorphic binding between objects laneToActor and definitions 
			JavaSDM.ensure(!laneToActor.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitions 
			JavaSDM.ensure(!packageDeclaration.equals(definitions));

			// check isomorphic binding between objects process and definitions 
			JavaSDM.ensure(!process.equals(definitions));

			// check isomorphic binding between objects processToUseCase and definitions 
			JavaSDM.ensure(!processToUseCase.equals(definitions));

			// check isomorphic binding between objects useCase and definitions 
			JavaSDM.ensure(!useCase.equals(definitions));

			// check isomorphic binding between objects lane and definitionsToPackageDeclaration 
			JavaSDM.ensure(!lane.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects laneSet and definitionsToPackageDeclaration 
			JavaSDM.ensure(!laneSet.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects laneToActor and definitionsToPackageDeclaration 
			JavaSDM.ensure(!laneToActor.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects packageDeclaration and definitionsToPackageDeclaration 
			JavaSDM.ensure(!packageDeclaration
					.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects process and definitionsToPackageDeclaration 
			JavaSDM.ensure(!process.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects processToUseCase and definitionsToPackageDeclaration 
			JavaSDM.ensure(!processToUseCase
					.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects useCase and definitionsToPackageDeclaration 
			JavaSDM.ensure(!useCase.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects laneToActor and lane 
			JavaSDM.ensure(!laneToActor.equals(lane));

			// check isomorphic binding between objects packageDeclaration and lane 
			JavaSDM.ensure(!packageDeclaration.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToUseCase and lane 
			JavaSDM.ensure(!processToUseCase.equals(lane));

			// check isomorphic binding between objects useCase and lane 
			JavaSDM.ensure(!useCase.equals(lane));

			// check isomorphic binding between objects laneToActor and laneSet 
			JavaSDM.ensure(!laneToActor.equals(laneSet));

			// check isomorphic binding between objects packageDeclaration and laneSet 
			JavaSDM.ensure(!packageDeclaration.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToUseCase and laneSet 
			JavaSDM.ensure(!processToUseCase.equals(laneSet));

			// check isomorphic binding between objects useCase and laneSet 
			JavaSDM.ensure(!useCase.equals(laneSet));

			// check isomorphic binding between objects packageDeclaration and laneToActor 
			JavaSDM.ensure(!packageDeclaration.equals(laneToActor));

			// check isomorphic binding between objects process and laneToActor 
			JavaSDM.ensure(!process.equals(laneToActor));

			// check isomorphic binding between objects processToUseCase and laneToActor 
			JavaSDM.ensure(!processToUseCase.equals(laneToActor));

			// check isomorphic binding between objects useCase and laneToActor 
			JavaSDM.ensure(!useCase.equals(laneToActor));

			// check isomorphic binding between objects process and packageDeclaration 
			JavaSDM.ensure(!process.equals(packageDeclaration));

			// check isomorphic binding between objects processToUseCase and packageDeclaration 
			JavaSDM.ensure(!processToUseCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object laneToActor__source__lane
			laneToActor__source__lane = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object laneToActor__target__actor
			laneToActor__target__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __laneSet_lanes_lane
			__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__actors__actor
			packageDeclaration__actors__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("LaneToActorRule");
			// assign attribute __laneSet_lanes_lane
			__laneSet_lanes_lane.setName("lanes");
			// assign attribute packageDeclaration__actors__actor
			packageDeclaration__actors__actor.setName("actors");
			// assign attribute laneToActor__source__lane
			laneToActor__source__lane.setName("source");
			// assign attribute laneToActor__target__actor
			laneToActor__target__actor.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneToActor__source__lane, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneToActor__target__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__laneSet_lanes_lane, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__actors__actor, "createdEdges");

			// create link
			__laneSet_lanes_lane.setSrc(laneSet);

			// create link
			packageDeclaration__actors__actor.setSrc(packageDeclaration);

			// create link
			__laneSet_lanes_lane.setTrg(lane);

			// create link
			laneToActor__source__lane.setTrg(lane);

			// create link
			packageDeclaration__actors__actor.setTrg(actor);

			// create link
			laneToActor__target__actor.setTrg(actor);

			// create link
			laneToActor__source__lane.setSrc(laneToActor);

			// create link
			laneToActor__target__actor.setSrc(laneToActor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, laneSet, process, definitions,
				packageDeclaration, definitionsToPackageDeclaration, useCase,
				processToUseCase, lane, actor, laneToActor);
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
		Lane lane = null;
		LaneSet laneSet = null;
		Process process = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __laneSet_lanes_lane = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __definitions_rootElements_process = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __definitionsToPackageDeclaration_source_definitions = null;
		EMoflonEdge __definitionsToPackageDeclaration_target_packageDeclaration = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		CSP csp = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		PackageDeclaration packageDeclaration = null;
		Iterator fujaba__IterDefinitionsToDefinitionsToPackageDeclaration = null;
		DefinitionsToPackageDeclaration definitionsToPackageDeclaration = null;

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
			ruleresult.setRule("LaneToActorRule");

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
			_TmpObject = (match.getObject("lane"));

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;
			_TmpObject = (match.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from definitions to definitionsToPackageDeclaration
			fujaba__Success = false;

			fujaba__IterDefinitionsToDefinitionsToPackageDeclaration = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							definitions, DefinitionsToPackageDeclaration.class,
							"source")).iterator();

			while (fujaba__IterDefinitionsToDefinitionsToPackageDeclaration
					.hasNext()) {
				try {
					definitionsToPackageDeclaration = (DefinitionsToPackageDeclaration) fujaba__IterDefinitionsToDefinitionsToPackageDeclaration
							.next();

					// check object definitionsToPackageDeclaration is really bound
					JavaSDM.ensure(definitionsToPackageDeclaration != null);
					// bind object
					packageDeclaration = definitionsToPackageDeclaration
							.getTarget();

					// check object packageDeclaration is really bound
					JavaSDM.ensure(packageDeclaration != null);

					// iterate to-many link source from process to processToUseCase
					fujaba__Success = false;

					fujaba__IterProcessToProcessToUseCase = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(process,
											ProcessToUseCase.class, "source"))
							.iterator();

					while (fujaba__IterProcessToProcessToUseCase.hasNext()) {
						try {
							processToUseCase = (ProcessToUseCase) fujaba__IterProcessToProcessToUseCase
									.next();

							// check object processToUseCase is really bound
							JavaSDM.ensure(processToUseCase != null);
							// bind object
							useCase = processToUseCase.getTarget();

							// check object useCase is really bound
							JavaSDM.ensure(useCase != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object definitions is really bound
								JavaSDM.ensure(definitions != null);
								// check object definitionsToPackageDeclaration is really bound
								JavaSDM.ensure(definitionsToPackageDeclaration != null);
								// check object lane is really bound
								JavaSDM.ensure(lane != null);
								// check object laneSet is really bound
								JavaSDM.ensure(laneSet != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToUseCase is really bound
								JavaSDM.ensure(processToUseCase != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link laneSets from laneSet to process
								JavaSDM.ensure(process.equals(laneSet
										.eContainer()));

								// check link lanes from lane to laneSet
								JavaSDM.ensure(laneSet.equals(lane.eContainer()));

								// check link rootElements from process to definitions
								JavaSDM.ensure(definitions.equals(process
										.eContainer()));

								// check link source from definitionsToPackageDeclaration to definitions
								JavaSDM.ensure(definitions
										.equals(definitionsToPackageDeclaration
												.getSource()));

								// check link source from processToUseCase to process
								JavaSDM.ensure(process.equals(processToUseCase
										.getSource()));

								// check link target from definitionsToPackageDeclaration to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(definitionsToPackageDeclaration
												.getTarget()));

								// check link target from processToUseCase to useCase
								JavaSDM.ensure(useCase.equals(processToUseCase
										.getTarget()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// create object isApplicableMatch
								isApplicableMatch = TGGRuntimeFactory.eINSTANCE
										.createIsApplicableMatch();

								// create object __laneSet_lanes_lane
								__laneSet_lanes_lane = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __process_laneSets_laneSet
								__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __definitions_rootElements_process
								__definitions_rootElements_process = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToUseCase_source_process
								__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __definitionsToPackageDeclaration_source_definitions
								__definitionsToPackageDeclaration_source_definitions = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __definitionsToPackageDeclaration_target_packageDeclaration
								__definitionsToPackageDeclaration_target_packageDeclaration = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __packageDeclaration_useCases_useCase
								__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// create object __processToUseCase_target_useCase
								__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
										.createEMoflonEdge();

								// assign attribute __laneSet_lanes_lane
								__laneSet_lanes_lane.setName("lanes");
								// assign attribute __process_laneSets_laneSet
								__process_laneSets_laneSet.setName("laneSets");
								// assign attribute __definitions_rootElements_process
								__definitions_rootElements_process
										.setName("rootElements");
								// assign attribute __packageDeclaration_useCases_useCase
								__packageDeclaration_useCases_useCase
										.setName("useCases");
								// assign attribute __definitionsToPackageDeclaration_source_definitions
								__definitionsToPackageDeclaration_source_definitions
										.setName("source");
								// assign attribute __definitionsToPackageDeclaration_target_packageDeclaration
								__definitionsToPackageDeclaration_target_packageDeclaration
										.setName("target");
								// assign attribute __processToUseCase_source_process
								__processToUseCase_source_process
										.setName("source");
								// assign attribute __processToUseCase_target_useCase
								__processToUseCase_target_useCase
										.setName("target");

								// create link
								isApplicableMatch.getAllContextElements().add(
										laneSet);

								// create link
								__laneSet_lanes_lane.setSrc(laneSet);

								// create link
								__process_laneSets_laneSet.setTrg(laneSet);

								// create link
								__process_laneSets_laneSet.setSrc(process);

								// create link
								__definitions_rootElements_process
										.setTrg(process);

								// create link
								__processToUseCase_source_process
										.setTrg(process);

								// create link
								isApplicableMatch.getAllContextElements().add(
										process);

								// create link
								isApplicableMatch.getAllContextElements().add(
										definitions);

								// create link
								__definitions_rootElements_process
										.setSrc(definitions);

								// create link
								__definitionsToPackageDeclaration_source_definitions
										.setTrg(definitions);

								// create link
								__definitionsToPackageDeclaration_target_packageDeclaration
										.setTrg(packageDeclaration);

								// create link
								__packageDeclaration_useCases_useCase
										.setSrc(packageDeclaration);

								// create link
								isApplicableMatch.getAllContextElements().add(
										packageDeclaration);

								// create link
								__definitionsToPackageDeclaration_source_definitions
										.setSrc(definitionsToPackageDeclaration);

								// create link
								__definitionsToPackageDeclaration_target_packageDeclaration
										.setSrc(definitionsToPackageDeclaration);

								// create link
								isApplicableMatch.getAllContextElements().add(
										definitionsToPackageDeclaration);

								// create link
								__packageDeclaration_useCases_useCase
										.setTrg(useCase);

								// create link
								__processToUseCase_target_useCase
										.setTrg(useCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										useCase);

								// create link
								__processToUseCase_target_useCase
										.setSrc(processToUseCase);

								// create link
								__processToUseCase_source_process
										.setSrc(processToUseCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										processToUseCase);

								// create link
								isApplicableMatch.getAllContextElements().add(
										lane);

								// create link
								__laneSet_lanes_lane.setTrg(lane);

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__definitions_rootElements_process,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__processToUseCase_target_useCase,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__process_laneSets_laneSet,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__laneSet_lanes_lane,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__packageDeclaration_useCases_useCase,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__definitionsToPackageDeclaration_source_definitions,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__definitionsToPackageDeclaration_target_packageDeclaration,
												"allContextElements");

								// create link
								org.moflon.util.eMoflonEMFUtil
										.addOppositeReference(
												isApplicableMatch,
												__processToUseCase_source_process,
												"allContextElements");
								// story node 'solve CSP'
								try {
									fujaba__Success = false;

									_TmpObject = (this
											.isApplicable_solveCsp_FWD(
													isApplicableMatch,
													laneSet,
													process,
													definitions,
													packageDeclaration,
													definitionsToPackageDeclaration,
													useCase, processToUseCase,
													lane));

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
												.setRuleName("LaneToActorRule");

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
		match.registerObject("laneSet", laneSet);
		match.registerObject("process", process);
		match.registerObject("definitions", definitions);
		match.registerObject("lane", lane);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, LaneSet laneSet,
			bpmn2.Process process, Definitions definitions, Lane lane) {
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
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackageDeclaration definitionsToPackageDeclaration,
			UseCase useCase, ProcessToUseCase processToUseCase, Lane lane) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");

		// Create attribute variables
		Variable var_lane_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.id", true, csp);
		var_lane_id.setValue(lane.getId());
		Variable var_lane_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.name", true, csp);
		var_lane_name.setValue(lane.getName());

		// Create explicit parameters

		// Create unbound variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		Variable var_actor_description = CSPFactoryHelper.eINSTANCE
				.createVariable("actor.description", csp);
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_lane_id, var_actor_name);
		eq_0.setRuleName("");
		eq_0.solve(var_lane_name, var_actor_description);
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackageDeclaration",
				definitionsToPackageDeclaration);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
		isApplicableMatch.registerObject("lane", lane);
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
			EObject laneSet, EObject process, EObject definitions,
			EObject packageDeclaration,
			EObject definitionsToPackageDeclaration, EObject useCase,
			EObject processToUseCase, EObject lane, EObject actor,
			EObject laneToActor) {
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackageDeclaration",
				definitionsToPackageDeclaration);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("laneToActor", laneToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("lane").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getLane());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
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
					packageDeclaration, useCase, actor));

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
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_actors_actor
				__packageDeclaration_actors_actor.setName("actors");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						actor, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_actors_actor,
						"toBeTranslatedEdges");

				// create link
				__packageDeclaration_actors_actor.setSrc(packageDeclaration);

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
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase, "contextEdges");

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, packageDeclaration, useCase,
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
		Definitions definitions = null;
		DefinitionsToPackageDeclaration definitionsToPackageDeclaration = null;
		LaneSet laneSet = null;
		PackageDeclaration packageDeclaration = null;
		Process process = null;
		ProcessToUseCase processToUseCase = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Lane lane = null;
		LaneToActor laneToActor = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge laneToActor__source__lane = null;
		EMoflonEdge laneToActor__target__actor = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge laneSet__lanes__lane = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("actor"));

			// ensure correct type and really bound of object actor
			JavaSDM.ensure(_TmpObject instanceof Actor);
			actor = (Actor) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("definitions"));

			// ensure correct type and really bound of object definitions
			JavaSDM.ensure(_TmpObject instanceof Definitions);
			definitions = (Definitions) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("definitionsToPackageDeclaration"));

			// ensure correct type and really bound of object definitionsToPackageDeclaration
			JavaSDM.ensure(_TmpObject instanceof DefinitionsToPackageDeclaration);
			definitionsToPackageDeclaration = (DefinitionsToPackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("laneSet"));

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("processToUseCase"));

			// ensure correct type and really bound of object processToUseCase
			JavaSDM.ensure(_TmpObject instanceof ProcessToUseCase);
			processToUseCase = (ProcessToUseCase) _TmpObject;
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
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object lane
			lane = Bpmn2Factory.eINSTANCE.createLane();

			// create object laneToActor
			laneToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createLaneToActor();

			// assign attribute lane
			lane.setId((java.lang.String) csp
					.getAttributeVariable("lane", "id").getValue());
			// assign attribute lane
			lane.setName((java.lang.String) csp.getAttributeVariable("lane",
					"name").getValue());

			// create link
			laneToActor.setTarget(actor);

			// create link
			laneSet.getLanes().add(lane); // add link

			// create link
			laneToActor.setSource(lane);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneToActor is really bound
			JavaSDM.ensure(laneToActor != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					actor, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					lane, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneToActor, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object actor is really bound
			JavaSDM.ensure(actor != null);
			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);
			// check object definitionsToPackageDeclaration is really bound
			JavaSDM.ensure(definitionsToPackageDeclaration != null);
			// check object lane is really bound
			JavaSDM.ensure(lane != null);
			// check object laneSet is really bound
			JavaSDM.ensure(laneSet != null);
			// check object laneToActor is really bound
			JavaSDM.ensure(laneToActor != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object processToUseCase is really bound
			JavaSDM.ensure(processToUseCase != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check isomorphic binding between objects definitions and actor 
			JavaSDM.ensure(!definitions.equals(actor));

			// check isomorphic binding between objects definitionsToPackageDeclaration and actor 
			JavaSDM.ensure(!definitionsToPackageDeclaration.equals(actor));

			// check isomorphic binding between objects lane and actor 
			JavaSDM.ensure(!lane.equals(actor));

			// check isomorphic binding between objects laneSet and actor 
			JavaSDM.ensure(!laneSet.equals(actor));

			// check isomorphic binding between objects laneToActor and actor 
			JavaSDM.ensure(!laneToActor.equals(actor));

			// check isomorphic binding between objects packageDeclaration and actor 
			JavaSDM.ensure(!packageDeclaration.equals(actor));

			// check isomorphic binding between objects process and actor 
			JavaSDM.ensure(!process.equals(actor));

			// check isomorphic binding between objects processToUseCase and actor 
			JavaSDM.ensure(!processToUseCase.equals(actor));

			// check isomorphic binding between objects useCase and actor 
			JavaSDM.ensure(!useCase.equals(actor));

			// check isomorphic binding between objects definitionsToPackageDeclaration and definitions 
			JavaSDM.ensure(!definitionsToPackageDeclaration.equals(definitions));

			// check isomorphic binding between objects lane and definitions 
			JavaSDM.ensure(!lane.equals(definitions));

			// check isomorphic binding between objects laneSet and definitions 
			JavaSDM.ensure(!laneSet.equals(definitions));

			// check isomorphic binding between objects laneToActor and definitions 
			JavaSDM.ensure(!laneToActor.equals(definitions));

			// check isomorphic binding between objects packageDeclaration and definitions 
			JavaSDM.ensure(!packageDeclaration.equals(definitions));

			// check isomorphic binding between objects process and definitions 
			JavaSDM.ensure(!process.equals(definitions));

			// check isomorphic binding between objects processToUseCase and definitions 
			JavaSDM.ensure(!processToUseCase.equals(definitions));

			// check isomorphic binding between objects useCase and definitions 
			JavaSDM.ensure(!useCase.equals(definitions));

			// check isomorphic binding between objects lane and definitionsToPackageDeclaration 
			JavaSDM.ensure(!lane.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects laneSet and definitionsToPackageDeclaration 
			JavaSDM.ensure(!laneSet.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects laneToActor and definitionsToPackageDeclaration 
			JavaSDM.ensure(!laneToActor.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects packageDeclaration and definitionsToPackageDeclaration 
			JavaSDM.ensure(!packageDeclaration
					.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects process and definitionsToPackageDeclaration 
			JavaSDM.ensure(!process.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects processToUseCase and definitionsToPackageDeclaration 
			JavaSDM.ensure(!processToUseCase
					.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects useCase and definitionsToPackageDeclaration 
			JavaSDM.ensure(!useCase.equals(definitionsToPackageDeclaration));

			// check isomorphic binding between objects laneSet and lane 
			JavaSDM.ensure(!laneSet.equals(lane));

			// check isomorphic binding between objects laneToActor and lane 
			JavaSDM.ensure(!laneToActor.equals(lane));

			// check isomorphic binding between objects packageDeclaration and lane 
			JavaSDM.ensure(!packageDeclaration.equals(lane));

			// check isomorphic binding between objects process and lane 
			JavaSDM.ensure(!process.equals(lane));

			// check isomorphic binding between objects processToUseCase and lane 
			JavaSDM.ensure(!processToUseCase.equals(lane));

			// check isomorphic binding between objects useCase and lane 
			JavaSDM.ensure(!useCase.equals(lane));

			// check isomorphic binding between objects laneToActor and laneSet 
			JavaSDM.ensure(!laneToActor.equals(laneSet));

			// check isomorphic binding between objects packageDeclaration and laneSet 
			JavaSDM.ensure(!packageDeclaration.equals(laneSet));

			// check isomorphic binding between objects process and laneSet 
			JavaSDM.ensure(!process.equals(laneSet));

			// check isomorphic binding between objects processToUseCase and laneSet 
			JavaSDM.ensure(!processToUseCase.equals(laneSet));

			// check isomorphic binding between objects useCase and laneSet 
			JavaSDM.ensure(!useCase.equals(laneSet));

			// check isomorphic binding between objects packageDeclaration and laneToActor 
			JavaSDM.ensure(!packageDeclaration.equals(laneToActor));

			// check isomorphic binding between objects process and laneToActor 
			JavaSDM.ensure(!process.equals(laneToActor));

			// check isomorphic binding between objects processToUseCase and laneToActor 
			JavaSDM.ensure(!processToUseCase.equals(laneToActor));

			// check isomorphic binding between objects useCase and laneToActor 
			JavaSDM.ensure(!useCase.equals(laneToActor));

			// check isomorphic binding between objects process and packageDeclaration 
			JavaSDM.ensure(!process.equals(packageDeclaration));

			// check isomorphic binding between objects processToUseCase and packageDeclaration 
			JavaSDM.ensure(!processToUseCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects processToUseCase and process 
			JavaSDM.ensure(!processToUseCase.equals(process));

			// check isomorphic binding between objects useCase and process 
			JavaSDM.ensure(!useCase.equals(process));

			// check isomorphic binding between objects useCase and processToUseCase 
			JavaSDM.ensure(!useCase.equals(processToUseCase));

			// create object laneToActor__source__lane
			laneToActor__source__lane = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object laneToActor__target__actor
			laneToActor__target__actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object laneSet__lanes__lane
			laneSet__lanes__lane = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("LaneToActorRule");
			// assign attribute laneSet__lanes__lane
			laneSet__lanes__lane.setName("lanes");
			// assign attribute __packageDeclaration_actors_actor
			__packageDeclaration_actors_actor.setName("actors");
			// assign attribute laneToActor__source__lane
			laneToActor__source__lane.setName("source");
			// assign attribute laneToActor__target__actor
			laneToActor__target__actor.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneToActor__source__lane, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneToActor__target__actor, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_actors_actor, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					laneSet__lanes__lane, "createdEdges");

			// create link
			laneSet__lanes__lane.setSrc(laneSet);

			// create link
			__packageDeclaration_actors_actor.setSrc(packageDeclaration);

			// create link
			laneToActor__source__lane.setTrg(lane);

			// create link
			laneSet__lanes__lane.setTrg(lane);

			// create link
			laneToActor__target__actor.setTrg(actor);

			// create link
			__packageDeclaration_actors_actor.setTrg(actor);

			// create link
			laneToActor__target__actor.setSrc(laneToActor);

			// create link
			laneToActor__source__lane.setSrc(laneToActor);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, laneSet, process, definitions,
				packageDeclaration, definitionsToPackageDeclaration, useCase,
				processToUseCase, lane, actor, laneToActor);
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
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __process_laneSets_laneSet = null;
		EMoflonEdge __definitions_rootElements_process = null;
		EMoflonEdge __processToUseCase_source_process = null;
		EMoflonEdge __definitionsToPackageDeclaration_source_definitions = null;
		EMoflonEdge __definitionsToPackageDeclaration_target_packageDeclaration = null;
		EMoflonEdge __packageDeclaration_actors_actor = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __processToUseCase_target_useCase = null;
		CSP csp = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Process process = null;
		Iterator fujaba__IterUseCaseToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		Definitions definitions = null;
		Iterator fujaba__IterPackageDeclarationToDefinitionsToPackageDeclaration = null;
		DefinitionsToPackageDeclaration definitionsToPackageDeclaration = null;

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
			ruleresult.setRule("LaneToActorRule");

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
			// iterate to-many link target from packageDeclaration to definitionsToPackageDeclaration
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToDefinitionsToPackageDeclaration = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							packageDeclaration,
							DefinitionsToPackageDeclaration.class, "target"))
					.iterator();

			while (fujaba__IterPackageDeclarationToDefinitionsToPackageDeclaration
					.hasNext()) {
				try {
					definitionsToPackageDeclaration = (DefinitionsToPackageDeclaration) fujaba__IterPackageDeclarationToDefinitionsToPackageDeclaration
							.next();

					// check object definitionsToPackageDeclaration is really bound
					JavaSDM.ensure(definitionsToPackageDeclaration != null);
					// bind object
					definitions = definitionsToPackageDeclaration.getSource();

					// check object definitions is really bound
					JavaSDM.ensure(definitions != null);

					// iterate to-many link target from useCase to processToUseCase
					fujaba__Success = false;

					fujaba__IterUseCaseToProcessToUseCase = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(useCase,
											ProcessToUseCase.class, "target"))
							.iterator();

					while (fujaba__IterUseCaseToProcessToUseCase.hasNext()) {
						try {
							processToUseCase = (ProcessToUseCase) fujaba__IterUseCaseToProcessToUseCase
									.next();

							// check object processToUseCase is really bound
							JavaSDM.ensure(processToUseCase != null);
							// bind object
							process = processToUseCase.getSource();

							// check object process is really bound
							JavaSDM.ensure(process != null);

							// story node 'find context'
							try {
								fujaba__Success = false;

								// check object actor is really bound
								JavaSDM.ensure(actor != null);
								// check object definitions is really bound
								JavaSDM.ensure(definitions != null);
								// check object definitionsToPackageDeclaration is really bound
								JavaSDM.ensure(definitionsToPackageDeclaration != null);
								// check object packageDeclaration is really bound
								JavaSDM.ensure(packageDeclaration != null);
								// check object process is really bound
								JavaSDM.ensure(process != null);
								// check object processToUseCase is really bound
								JavaSDM.ensure(processToUseCase != null);
								// check object useCase is really bound
								JavaSDM.ensure(useCase != null);
								// check link actors from actor to packageDeclaration
								JavaSDM.ensure(packageDeclaration.equals(actor
										.eContainer()));

								// check link rootElements from process to definitions
								JavaSDM.ensure(definitions.equals(process
										.eContainer()));

								// check link source from definitionsToPackageDeclaration to definitions
								JavaSDM.ensure(definitions
										.equals(definitionsToPackageDeclaration
												.getSource()));

								// check link source from processToUseCase to process
								JavaSDM.ensure(process.equals(processToUseCase
										.getSource()));

								// check link target from definitionsToPackageDeclaration to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(definitionsToPackageDeclaration
												.getTarget()));

								// check link target from processToUseCase to useCase
								JavaSDM.ensure(useCase.equals(processToUseCase
										.getTarget()));

								// check link useCases from useCase to packageDeclaration
								JavaSDM.ensure(packageDeclaration
										.equals(useCase.eContainer()));

								// iterate to-many link laneSets from process to laneSet
								fujaba__Success = false;

								fujaba__IterProcessToLaneSet = new ArrayList(
										process.getLaneSets()).iterator();

								while (fujaba__IterProcessToLaneSet.hasNext()) {
									try {
										laneSet = (LaneSet) fujaba__IterProcessToLaneSet
												.next();

										// check object laneSet is really bound
										JavaSDM.ensure(laneSet != null);
										// create object isApplicableMatch
										isApplicableMatch = TGGRuntimeFactory.eINSTANCE
												.createIsApplicableMatch();

										// create object __process_laneSets_laneSet
										__process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __definitions_rootElements_process
										__definitions_rootElements_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_source_process
										__processToUseCase_source_process = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __definitionsToPackageDeclaration_source_definitions
										__definitionsToPackageDeclaration_source_definitions = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __definitionsToPackageDeclaration_target_packageDeclaration
										__definitionsToPackageDeclaration_target_packageDeclaration = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// create object __processToUseCase_target_useCase
										__processToUseCase_target_useCase = TGGRuntimeFactory.eINSTANCE
												.createEMoflonEdge();

										// assign attribute __process_laneSets_laneSet
										__process_laneSets_laneSet
												.setName("laneSets");
										// assign attribute __definitions_rootElements_process
										__definitions_rootElements_process
												.setName("rootElements");
										// assign attribute __packageDeclaration_useCases_useCase
										__packageDeclaration_useCases_useCase
												.setName("useCases");
										// assign attribute __packageDeclaration_actors_actor
										__packageDeclaration_actors_actor
												.setName("actors");
										// assign attribute __definitionsToPackageDeclaration_source_definitions
										__definitionsToPackageDeclaration_source_definitions
												.setName("source");
										// assign attribute __definitionsToPackageDeclaration_target_packageDeclaration
										__definitionsToPackageDeclaration_target_packageDeclaration
												.setName("target");
										// assign attribute __processToUseCase_source_process
										__processToUseCase_source_process
												.setName("source");
										// assign attribute __processToUseCase_target_useCase
										__processToUseCase_target_useCase
												.setName("target");

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														laneSet);

										// create link
										__process_laneSets_laneSet
												.setTrg(laneSet);

										// create link
										__definitions_rootElements_process
												.setTrg(process);

										// create link
										__processToUseCase_source_process
												.setTrg(process);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														process);

										// create link
										__process_laneSets_laneSet
												.setSrc(process);

										// create link
										__definitions_rootElements_process
												.setSrc(definitions);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														definitions);

										// create link
										__definitionsToPackageDeclaration_source_definitions
												.setTrg(definitions);

										// create link
										__definitionsToPackageDeclaration_target_packageDeclaration
												.setTrg(packageDeclaration);

										// create link
										__packageDeclaration_actors_actor
												.setSrc(packageDeclaration);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														packageDeclaration);

										// create link
										__packageDeclaration_useCases_useCase
												.setSrc(packageDeclaration);

										// create link
										__definitionsToPackageDeclaration_target_packageDeclaration
												.setSrc(definitionsToPackageDeclaration);

										// create link
										__definitionsToPackageDeclaration_source_definitions
												.setSrc(definitionsToPackageDeclaration);

										// create link
										isApplicableMatch
												.getAllContextElements()
												.add(definitionsToPackageDeclaration);

										// create link
										__packageDeclaration_useCases_useCase
												.setTrg(useCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														useCase);

										// create link
										__processToUseCase_target_useCase
												.setTrg(useCase);

										// create link
										__processToUseCase_target_useCase
												.setSrc(processToUseCase);

										// create link
										__processToUseCase_source_process
												.setSrc(processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														processToUseCase);

										// create link
										isApplicableMatch
												.getAllContextElements().add(
														actor);

										// create link
										__packageDeclaration_actors_actor
												.setTrg(actor);

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__definitionsToPackageDeclaration_source_definitions,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__process_laneSets_laneSet,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__packageDeclaration_useCases_useCase,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__definitionsToPackageDeclaration_target_packageDeclaration,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToUseCase_target_useCase,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__packageDeclaration_actors_actor,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__processToUseCase_source_process,
														"allContextElements");

										// create link
										org.moflon.util.eMoflonEMFUtil
												.addOppositeReference(
														isApplicableMatch,
														__definitions_rootElements_process,
														"allContextElements");
										// story node 'solve CSP'
										try {
											fujaba__Success = false;

											_TmpObject = (this
													.isApplicable_solveCsp_BWD(
															isApplicableMatch,
															laneSet,
															process,
															definitions,
															packageDeclaration,
															definitionsToPackageDeclaration,
															useCase,
															processToUseCase,
															actor));

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
														.setRuleName("LaneToActorRule");

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
	public void registerObjectsToMatch_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);
		match.registerObject("actor", actor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase, Actor actor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();

		csp.getConstraints().add(eqActorType);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
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
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackageDeclaration definitionsToPackageDeclaration,
			UseCase useCase, ProcessToUseCase processToUseCase, Actor actor) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", true, csp);
		var_actor_name.setValue(actor.getName());
		Variable var_actor_description = CSPFactoryHelper.eINSTANCE
				.createVariable("actor.description", true, csp);
		var_actor_description.setValue(actor.getDescription());

		// Create explicit parameters

		// Create unbound variables
		Variable var_lane_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.id", csp);
		Variable var_lane_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.name", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_lane_id, var_actor_name);
		eq_0.setRuleName("");
		eq_0.solve(var_lane_name, var_actor_description);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackageDeclaration",
				definitionsToPackageDeclaration);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
			EObject laneSet, EObject process, EObject definitions,
			EObject packageDeclaration,
			EObject definitionsToPackageDeclaration, EObject useCase,
			EObject processToUseCase, EObject lane, EObject actor,
			EObject laneToActor) {
		ruleresult.registerObject("laneSet", laneSet);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("definitions", definitions);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("definitionsToPackageDeclaration",
				definitionsToPackageDeclaration);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("processToUseCase", processToUseCase);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("laneToActor", laneToActor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("actor").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getActor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_128(
			EMoflonEdge _edge_lanes) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		LaneSet __DEC_lane_lanes_799805 = null;
		Match match = null;
		Lane lane = null;
		Definitions definitions = null;
		Process process = null;
		LaneSet laneSet = null;

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

			// check object _edge_lanes is really bound
			JavaSDM.ensure(_edge_lanes != null);
			// bind object
			_TmpObject = _edge_lanes.getSrc();

			// ensure correct type and really bound of object laneSet
			JavaSDM.ensure(_TmpObject instanceof LaneSet);
			laneSet = (LaneSet) _TmpObject;

			// bind object
			_TmpObject = laneSet.eContainer() instanceof Process ? (Process) laneSet
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getLaneSets().contains(laneSet));

			// bind object
			definitions = process.eContainer() instanceof Definitions ? (Definitions) process
					.eContainer() : null;

			// check object definitions is really bound
			JavaSDM.ensure(definitions != null);

			// check if contained via correct reference
			JavaSDM.ensure(definitions.getRootElements().contains(process));

			// bind object
			_TmpObject = _edge_lanes.getTrg();

			// ensure correct type and really bound of object lane
			JavaSDM.ensure(_TmpObject instanceof Lane);
			lane = (Lane) _TmpObject;

			// check link lanes from lane to laneSet
			JavaSDM.ensure(laneSet.equals(lane.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_lane_lanes_799805 = lane.eContainer() instanceof LaneSet ? (LaneSet) lane
							.eContainer() : null;

					// check object __DEC_lane_lanes_799805 is really bound
					JavaSDM.ensure(__DEC_lane_lanes_799805 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_lane_lanes_799805.getLanes().contains(
							lane));

					// check isomorphic binding between objects __DEC_lane_lanes_799805 and laneSet 
					JavaSDM.ensure(!__DEC_lane_lanes_799805.equals(laneSet));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_lanes is really bound
				JavaSDM.ensure(_edge_lanes != null);
				// check object definitions is really bound
				JavaSDM.ensure(definitions != null);
				// check object lane is really bound
				JavaSDM.ensure(lane != null);
				// check object laneSet is really bound
				JavaSDM.ensure(laneSet != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link laneSets from laneSet to process
				JavaSDM.ensure(process.equals(laneSet.eContainer()));

				// check link lanes from lane to laneSet
				JavaSDM.ensure(laneSet.equals(lane.eContainer()));

				// check link rootElements from process to definitions
				JavaSDM.ensure(definitions.equals(process.eContainer()));

				// check link src from _edge_lanes to laneSet
				JavaSDM.ensure(laneSet.equals(_edge_lanes.getSrc()));

				// check link trg from _edge_lanes to lane
				JavaSDM.ensure(lane.equals(_edge_lanes.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, laneSet,
						process, definitions, lane);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_54(
			EMoflonEdge _edge_actors) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_actor_actors_943116 = null;
		Match match = null;
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
					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_actor_actors_943116 = actor.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) actor
									.eContainer() : null;

							// check object __DEC_actor_actors_943116 is really bound
							JavaSDM.ensure(__DEC_actor_actors_943116 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_actor_actors_943116
									.getActors().contains(actor));

							// check isomorphic binding between objects __DEC_actor_actors_943116 and packageDeclaration 
							JavaSDM.ensure(!__DEC_actor_actors_943116
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
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link actors from actor to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(actor
								.eContainer()));

						// check link src from _edge_actors to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(_edge_actors
								.getSrc()));

						// check link trg from _edge_actors to actor
						JavaSDM.ensure(actor.equals(_edge_actors.getTrg()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_BWD(match,
								packageDeclaration, useCase, actor);
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
			DefinitionsToPackageDeclaration definitionsToPackageDeclarationDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		Lane lane = null;
		Actor actor = null;
		LaneToActor laneToActor = null;
		UseCase useCase = null;
		Iterator fujaba__IterProcessToProcessToUseCase = null;
		ProcessToUseCase processToUseCase = null;
		Iterator fujaba__IterProcessToLaneSet = null;
		LaneSet laneSet = null;
		Iterator fujaba__IterDefinitionsToProcess = null;
		Process process = null;
		PackageDeclaration packageDeclaration = null;
		Definitions definitions = null;
		Iterator fujaba__IterDefinitionsToPackageDeclarationListToDefinitionsToPackageDeclaration = null;
		DefinitionsToPackageDeclaration definitionsToPackageDeclaration = null;
		Iterator fujaba__IterRuleEntryContainerToDefinitionsToPackageDeclarationList = null;
		RuleEntryList definitionsToPackageDeclarationList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to definitionsToPackageDeclarationList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToDefinitionsToPackageDeclarationList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToDefinitionsToPackageDeclarationList
					.hasNext()) {
				try {
					definitionsToPackageDeclarationList = (RuleEntryList) fujaba__IterRuleEntryContainerToDefinitionsToPackageDeclarationList
							.next();

					// check object definitionsToPackageDeclarationList is really bound
					JavaSDM.ensure(definitionsToPackageDeclarationList != null);
					// iterate to-many link entryObjects from definitionsToPackageDeclarationList to definitionsToPackageDeclaration
					fujaba__Success = false;

					fujaba__IterDefinitionsToPackageDeclarationListToDefinitionsToPackageDeclaration = new ArrayList(
							definitionsToPackageDeclarationList
									.getEntryObjects()).iterator();

					while (fujaba__IterDefinitionsToPackageDeclarationListToDefinitionsToPackageDeclaration
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterDefinitionsToPackageDeclarationListToDefinitionsToPackageDeclaration
									.next();

							// ensure correct type and really bound of object definitionsToPackageDeclaration
							JavaSDM.ensure(_TmpObject instanceof DefinitionsToPackageDeclaration);
							definitionsToPackageDeclaration = (DefinitionsToPackageDeclaration) _TmpObject;
							// bind object
							definitions = definitionsToPackageDeclaration
									.getSource();

							// check object definitions is really bound
							JavaSDM.ensure(definitions != null);

							// bind object
							packageDeclaration = definitionsToPackageDeclaration
									.getTarget();

							// check object packageDeclaration is really bound
							JavaSDM.ensure(packageDeclaration != null);

							// iterate to-many link rootElements from definitions to process
							fujaba__Success = false;

							fujaba__IterDefinitionsToProcess = new ArrayList(
									definitions.getRootElements()).iterator();

							while (fujaba__IterDefinitionsToProcess.hasNext()) {
								try {
									_TmpObject = fujaba__IterDefinitionsToProcess
											.next();

									// ensure correct type and really bound of object process
									JavaSDM.ensure(_TmpObject instanceof Process);
									process = (Process) _TmpObject;
									// iterate to-many link laneSets from process to laneSet
									fujaba__Success = false;

									fujaba__IterProcessToLaneSet = new ArrayList(
											process.getLaneSets()).iterator();

									while (fujaba__IterProcessToLaneSet
											.hasNext()) {
										try {
											laneSet = (LaneSet) fujaba__IterProcessToLaneSet
													.next();

											// check object laneSet is really bound
											JavaSDM.ensure(laneSet != null);
											// iterate to-many link source from process to processToUseCase
											fujaba__Success = false;

											fujaba__IterProcessToProcessToUseCase = new ArrayList(
													org.moflon.util.eMoflonEMFUtil
															.getOppositeReference(
																	process,
																	ProcessToUseCase.class,
																	"source"))
													.iterator();

											while (fujaba__IterProcessToProcessToUseCase
													.hasNext()) {
												try {
													processToUseCase = (ProcessToUseCase) fujaba__IterProcessToProcessToUseCase
															.next();

													// check object processToUseCase is really bound
													JavaSDM.ensure(processToUseCase != null);
													// bind object
													useCase = processToUseCase
															.getTarget();

													// check object useCase is really bound
													JavaSDM.ensure(useCase != null);

													// check link useCases from useCase to packageDeclaration
													JavaSDM.ensure(packageDeclaration.equals(useCase
															.eContainer()));

													// story node 'solve CSP'
													try {
														fujaba__Success = false;

														_TmpObject = (this
																.generateModel_solveCsp_BWD(
																		isApplicableMatch,
																		laneSet,
																		process,
																		definitions,
																		packageDeclaration,
																		definitionsToPackageDeclaration,
																		useCase,
																		processToUseCase,
																		lane,
																		actor,
																		laneToActor,
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

															// check object definitions is really bound
															JavaSDM.ensure(definitions != null);
															// check object definitionsToPackageDeclaration is really bound
															JavaSDM.ensure(definitionsToPackageDeclaration != null);
															// check object laneSet is really bound
															JavaSDM.ensure(laneSet != null);
															// check object packageDeclaration is really bound
															JavaSDM.ensure(packageDeclaration != null);
															// check object process is really bound
															JavaSDM.ensure(process != null);
															// check object processToUseCase is really bound
															JavaSDM.ensure(processToUseCase != null);
															// check object ruleResult is really bound
															JavaSDM.ensure(ruleResult != null);
															// check object useCase is really bound
															JavaSDM.ensure(useCase != null);
															// create object lane
															lane = Bpmn2Factory.eINSTANCE
																	.createLane();

															// create object actor
															actor = UseCaseDSLFactory.eINSTANCE
																	.createActor();

															// create object laneToActor
															laneToActor = BpmnToUseCaseIntegrationFactory.eINSTANCE
																	.createLaneToActor();

															// assign attribute lane
															lane.setId((java.lang.String) csp
																	.getAttributeVariable(
																			"lane",
																			"id")
																	.getValue());
															// assign attribute lane
															lane.setName((java.lang.String) csp
																	.getAttributeVariable(
																			"lane",
																			"name")
																	.getValue());
															// assign attribute actor
															actor.setName((java.lang.String) csp
																	.getAttributeVariable(
																			"actor",
																			"name")
																	.getValue());
															// assign attribute actor
															actor.setDescription((java.lang.String) csp
																	.getAttributeVariable(
																			"actor",
																			"description")
																	.getValue());
															// assign attribute actor
															actor.setType((UseCaseDSL.ActorType) csp
																	.getAttributeVariable(
																			"actor",
																			"type")
																	.getValue());
															// assign attribute ruleResult
															ruleResult
																	.setSuccess(true);

															// create link
															laneSet.getLanes()
																	.add(lane); // add link

															// create link
															packageDeclaration
																	.getActors()
																	.add(actor); // add link

															// create link
															laneToActor
																	.setSource(lane);

															// create link
															ruleResult
																	.getSourceObjects()
																	.add(lane);

															// create link
															laneToActor
																	.setTarget(actor);

															// create link
															ruleResult
																	.getTargetObjects()
																	.add(actor);

															// create link
															ruleResult
																	.getCorrObjects()
																	.add(laneToActor);

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

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			LaneSet laneSet, bpmn2.Process process, Definitions definitions,
			PackageDeclaration packageDeclaration,
			DefinitionsToPackageDeclaration definitionsToPackageDeclaration,
			UseCase useCase, ProcessToUseCase processToUseCase, Lane lane,
			Actor actor, LaneToActor laneToActor,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("PERSON");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_lane_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.id", csp);
		Variable var_actor_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.name", csp);
		Variable var_lane_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"lane.name", csp);
		Variable var_actor_description = CSPFactoryHelper.eINSTANCE
				.createVariable("actor.description", csp);
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", csp);

		// Create constraints
		Eq_modelgenActorType eq_modelgenActorType = new Eq_modelgenActorType();
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgenActorType);
		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgenActorType.setRuleName("");
		eq_modelgenActorType.solve(var_actor_type, literal0);
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_lane_id, var_actor_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_lane_name, var_actor_description);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("laneSet", laneSet);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("definitions", definitions);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("definitionsToPackageDeclaration",
				definitionsToPackageDeclaration);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("processToUseCase", processToUseCase);
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
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3), (Lane) arguments.get(4));
		case RulesPackage.LANE_TO_ACTOR_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3), (Lane) arguments.get(4));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LANESET_PROCESS_DEFINITIONS_LANE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3), (Lane) arguments.get(4));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_PROCESSTOUSECASE_LANE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(DefinitionsToPackageDeclaration) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Lane) arguments.get(8));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR:
			return isAppropriate_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (Actor) arguments.get(3));
		case RulesPackage.LANE_TO_ACTOR_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (Actor) arguments.get(3));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGEDECLARATION_USECASE_ACTOR:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (Actor) arguments.get(3));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_PROCESSTOUSECASE_ACTOR:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(DefinitionsToPackageDeclaration) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Actor) arguments.get(8));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_128__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_128((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_54__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_54((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LANE_TO_ACTOR_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_DEFINITIONSTOPACKAGEDECLARATION:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(DefinitionsToPackageDeclaration) arguments.get(1));
		case RulesPackage.LANE_TO_ACTOR_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_LANESET_PROCESS_DEFINITIONS_PACKAGEDECLARATION_DEFINITIONSTOPACKAGEDECLARATION_USECASE_PROCESSTOUSECASE_LANE_ACTOR_LANETOACTOR_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(LaneSet) arguments.get(1),
					(bpmn2.Process) arguments.get(2),
					(Definitions) arguments.get(3),
					(PackageDeclaration) arguments.get(4),
					(DefinitionsToPackageDeclaration) arguments.get(5),
					(UseCase) arguments.get(6),
					(ProcessToUseCase) arguments.get(7),
					(Lane) arguments.get(8), (Actor) arguments.get(9),
					(LaneToActor) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.LANE_TO_ACTOR_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LaneToActorRuleImpl
