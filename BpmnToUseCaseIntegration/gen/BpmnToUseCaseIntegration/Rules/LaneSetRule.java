/**
 */
package BpmnToUseCaseIntegration.Rules;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackage;
import BpmnToUseCaseIntegration.DocRootToUCModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;
import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.csp.*;

import TGGRuntime.AbstractRule;
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
 * A representation of the model object '<em><b>Lane Set Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage#getLaneSetRule()
 * @model
 * @generated
 */
public interface LaneSetRule extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      CSP csp = null;\n      EMoflonEdge __process_laneSets_laneSet = null;\n\n      // story node \'initial bindings\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object laneSet is really bound\n         JavaSDM.ensure ( laneSet != null );\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // check object process is really bound\n         JavaSDM.ensure ( process != null );\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'Solve CSP\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.isAppropriate_solveCsp_FWD(match,process,laneSet));\n\n         // ensure correct type and really bound of object csp\n         JavaSDM.ensure ( _TmpObject instanceof CSP );\n         csp = (CSP) _TmpObject;\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'Check CSP\'\n      fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);\n      if (fujaba__Success)\n      {\n         // story node \'collect elements to be translated\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object laneSet is really bound\n            JavaSDM.ensure ( laneSet != null );\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object process is really bound\n            JavaSDM.ensure ( process != null );\n            // create object __process_laneSets_laneSet\n            __process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n            // assign attribute __process_laneSets_laneSet\n            __process_laneSets_laneSet.setName (\"laneSets\");\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,laneSet,\"toBeTranslatedNodes\");\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,__process_laneSets_laneSet,\"toBeTranslatedEdges\");\n\n            // create link\n            __process_laneSets_laneSet.setSrc( process);\n\n\n            // create link\n            __process_laneSets_laneSet.setTrg( laneSet);\n\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // story node \'collect context elements\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object laneSet is really bound\n            JavaSDM.ensure ( laneSet != null );\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object process is really bound\n            JavaSDM.ensure ( process != null );\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,process,\"contextNodes\");\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // statement node \'register objects to match\'\n         this.registerObjectsToMatch_FWD(match,process,laneSet);\n         return true;\n\n      }\n      else\n      {\n         return false;\n\n      }'"
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			LaneSet laneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      LaneSet laneSet = null;\n      bpmn2.Process process = null;\n      Iterator fujaba__IterIsApplicableMatchToCsp = null;\n      CSP csp = null;\n      PerformRuleResult ruleresult = null;\n      EMoflonEdge __process_laneSets_laneSet = null;\n\n      // story node \'perform transformation\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (isApplicableMatch.getObject(\"laneSet\"));\n\n         // ensure correct type and really bound of object laneSet\n         JavaSDM.ensure ( _TmpObject instanceof LaneSet );\n         laneSet = (LaneSet) _TmpObject;\n         _TmpObject = (isApplicableMatch.getObject(\"process\"));\n\n         // ensure correct type and really bound of object process\n         JavaSDM.ensure ( _TmpObject instanceof bpmn2.Process );\n         process = (bpmn2.Process) _TmpObject;\n         // check object isApplicableMatch is really bound\n         JavaSDM.ensure ( isApplicableMatch != null );\n         // iterate to-many link attributeInfo from isApplicableMatch to csp\n         fujaba__Success = false;\n\n         fujaba__IterIsApplicableMatchToCsp = isApplicableMatch.getAttributeInfo().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterIsApplicableMatchToCsp.hasNext () )\n         {\n            try\n            {\n               _TmpObject =  fujaba__IterIsApplicableMatchToCsp.next ();\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'collect translated elements\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object laneSet is really bound\n         JavaSDM.ensure ( laneSet != null );\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();\n\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,laneSet,\"translatedElements\");\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'bookkeeping for edges\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object laneSet is really bound\n         JavaSDM.ensure ( laneSet != null );\n         // check object process is really bound\n         JavaSDM.ensure ( process != null );\n         // check object ruleresult is really bound\n         JavaSDM.ensure ( ruleresult != null );\n         // check isomorphic binding between objects process and laneSet \n         JavaSDM.ensure ( !process.equals (laneSet) );\n\n         // create object __process_laneSets_laneSet\n         __process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // assign attribute ruleresult\n         ruleresult.setRuleName (\"LaneSetRule\");\n         // assign attribute __process_laneSets_laneSet\n         __process_laneSets_laneSet.setName (\"laneSets\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,__process_laneSets_laneSet,\"translatedEdges\");\n\n         // create link\n         __process_laneSets_laneSet.setSrc( process);\n\n\n         // create link\n         __process_laneSets_laneSet.setTrg( laneSet);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'perform postprocessing\'\n      // No post processing method found\n      // statement node \'register objects\'\n      this.registerObjects_FWD(ruleresult,process,laneSet);\n      return ruleresult;'"
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass eClass = null;\n      Iterator fujaba__IterEClassToPerformOperation = null;\n      EOperation performOperation = null;\n      IsApplicableRuleResult ruleresult = null;\n      LaneSet laneSet = null;\n      bpmn2.Process process = null;\n      IsApplicableMatch isApplicableMatch = null;\n      EMoflonEdge __process_laneSets_laneSet = null;\n      CSP csp = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from eClass to performOperation\n         fujaba__Success = false;\n\n         fujaba__IterEClassToPerformOperation = eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterEClassToPerformOperation.hasNext () )\n         {\n            try\n            {\n               performOperation = (EOperation) fujaba__IterEClassToPerformOperation.next ();\n\n               // check object performOperation is really bound\n               JavaSDM.ensure ( performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (performOperation.getName (), \"perform_FWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();\n\n         // assign attribute ruleresult\n         ruleresult.setSuccess (false);\n         // assign attribute ruleresult\n         ruleresult.setRule (\"LaneSetRule\");\n\n         // create link\n         ruleresult.setPerformOperation( performOperation);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'core match\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (match.getObject(\"laneSet\"));\n\n         // ensure correct type and really bound of object laneSet\n         JavaSDM.ensure ( _TmpObject instanceof LaneSet );\n         laneSet = (LaneSet) _TmpObject;\n         _TmpObject = (match.getObject(\"process\"));\n\n         // ensure correct type and really bound of object process\n         JavaSDM.ensure ( _TmpObject instanceof bpmn2.Process );\n         process = (bpmn2.Process) _TmpObject;\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // story node \'find context\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object laneSet is really bound\n            JavaSDM.ensure ( laneSet != null );\n            // check object process is really bound\n            JavaSDM.ensure ( process != null );\n            // check link laneSets from laneSet to process\n            JavaSDM.ensure (process.equals (laneSet.eContainer()\n            ));\n\n            // create object isApplicableMatch\n            isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();\n\n            // create object __process_laneSets_laneSet\n            __process_laneSets_laneSet = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n            // assign attribute __process_laneSets_laneSet\n            __process_laneSets_laneSet.setName (\"laneSets\");\n\n            // create link\n            isApplicableMatch.getAllContextElements().add(process);\n\n\n            // create link\n            __process_laneSets_laneSet.setSrc( process);\n\n\n            // create link\n            __process_laneSets_laneSet.setTrg( laneSet);\n\n\n            // create link\n            isApplicableMatch.getAllContextElements().add(laneSet);\n\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(isApplicableMatch,__process_laneSets_laneSet,\"allContextElements\");\n            // story node \'solve CSP\'\n            try \n            {\n               fujaba__Success = false; \n\n               _TmpObject = (this.isApplicable_solveCsp_FWD(isApplicableMatch,process,laneSet));\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            // statement node \'check CSP\'\n            fujaba__Success = this.isApplicable_checkCsp_FWD(csp);\n            if (fujaba__Success)\n            {\n               // story node \'add match to rule result\'\n               try \n               {\n                  fujaba__Success = false; \n\n                  // check object isApplicableMatch is really bound\n                  JavaSDM.ensure ( isApplicableMatch != null );\n                  // check object ruleresult is really bound\n                  JavaSDM.ensure ( ruleresult != null );\n                  // assign attribute isApplicableMatch\n                  isApplicableMatch.setRuleName (\"LaneSetRule\");\n                  // assign attribute ruleresult\n                  ruleresult.setSuccess (true);\n\n                  // create link\n                  ruleresult.getIsApplicableMatch().add(isApplicableMatch);\n\n                  fujaba__Success = true;\n               }\n               catch ( JavaSDMException fujaba__InternalException )\n               {\n                  fujaba__Success = false;\n               }\n\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return ruleresult;'"
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='match.registerObject(\"process\", process);\nmatch.registerObject(\"laneSet\", laneSet);\n'"
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			LaneSet laneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nreturn csp;'"
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			LaneSet laneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nisApplicableMatch.getAttributeInfo().add(csp);\r\n\r\n// Snapshot pattern match on which CSP is solved\r\nisApplicableMatch.registerObject(\"process\",process);\r\nisApplicableMatch.registerObject(\"laneSet\",laneSet);\r\nreturn csp;'"
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, LaneSet laneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ruleresult.registerObject(\"process\", process);\nruleresult.registerObject(\"laneSet\", laneSet);\n'"
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject process,
			EObject laneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true && match.getObject(\"laneSet\").eClass().equals(bpmn2.Bpmn2Package.eINSTANCE.getLaneSet());'"
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass __eClass = null;\n      Iterator fujaba__Iter__eClassTo__performOperation = null;\n      EOperation __performOperation = null;\n      EObjectContainer __result = null;\n      FlowElementsContainer __DEC_laneSet_laneSets_701446 = null;\n      Match match = null;\n      LaneSet laneSet = null;\n      bpmn2.Process process = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object __eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         __eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from __eClass to __performOperation\n         fujaba__Success = false;\n\n         fujaba__Iter__eClassTo__performOperation = __eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__Iter__eClassTo__performOperation.hasNext () )\n         {\n            try\n            {\n               __performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation.next ();\n\n               // check object __performOperation is really bound\n               JavaSDM.ensure ( __performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (__performOperation.getName (), \"isApplicable_FWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object __result\n         __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'test core match kernel\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object _edge_laneSets is really bound\n         JavaSDM.ensure ( _edge_laneSets != null );\n         // bind object\n         _TmpObject = _edge_laneSets.getSrc ();\n\n         // ensure correct type and really bound of object process\n         JavaSDM.ensure ( _TmpObject instanceof bpmn2.Process );\n         process = (bpmn2.Process) _TmpObject;\n\n         // bind object\n         _TmpObject = _edge_laneSets.getTrg ();\n\n         // ensure correct type and really bound of object laneSet\n         JavaSDM.ensure ( _TmpObject instanceof LaneSet );\n         laneSet = (LaneSet) _TmpObject;\n\n         // check link laneSets from laneSet to process\n         JavaSDM.ensure (process.equals (laneSet.eContainer()\n         ));\n\n         // story node \'test core match and DECs\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check negative bindings\n            try\n            {\n               fujaba__Success = false;\n\n               // bind object\n               __DEC_laneSet_laneSets_701446 = laneSet.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) laneSet.eContainer() : null;\n\n               // check object __DEC_laneSet_laneSets_701446 is really bound\n               JavaSDM.ensure ( __DEC_laneSet_laneSets_701446 != null );\n\n               // check if contained via correct reference\n               JavaSDM.ensure(__DEC_laneSet_laneSets_701446.getLaneSets().contains(laneSet));\n\n               // check isomorphic binding between objects __DEC_laneSet_laneSets_701446 and process \n               JavaSDM.ensure ( !__DEC_laneSet_laneSets_701446.equals (process) );\n\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            fujaba__Success = !(fujaba__Success);\n\n            JavaSDM.ensure ( fujaba__Success );\n\n            // check object _edge_laneSets is really bound\n            JavaSDM.ensure ( _edge_laneSets != null );\n            // check object laneSet is really bound\n            JavaSDM.ensure ( laneSet != null );\n            // check object process is really bound\n            JavaSDM.ensure ( process != null );\n            // check link laneSets from laneSet to process\n            JavaSDM.ensure (process.equals (laneSet.eContainer()\n            ));\n\n            // check link src from _edge_laneSets to process\n            JavaSDM.ensure (process.equals (_edge_laneSets.getSrc ()\n            ));\n\n            // check link trg from _edge_laneSets to laneSet\n            JavaSDM.ensure (laneSet.equals (_edge_laneSets.getTrg ()\n            ));\n\n            // create object match\n            match = TGGRuntimeFactory.eINSTANCE.createMatch();\n\n            // assign attribute match\n            match.setRuleName (__eClass.getName());\n            // statement node \'bookkeeping with generic isAppropriate method\'\n            fujaba__Success = this.isAppropriate_FWD(match,process,laneSet);\n            if (fujaba__Success)\n            {\n               // statement node \'Ensure that the correct types of elements are matched\'\n               fujaba__Success = this.checkTypes_FWD(match);\n               if (fujaba__Success)\n               {\n                  // story node \'Add match to rule result\'\n                  try \n                  {\n                     fujaba__Success = false; \n\n                     // check object __performOperation is really bound\n                     JavaSDM.ensure ( __performOperation != null );\n                     // check object __result is really bound\n                     JavaSDM.ensure ( __result != null );\n                     // check object match is really bound\n                     JavaSDM.ensure ( match != null );\n\n                     // create link\n                     org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,__performOperation,\"isApplicableOperation\");\n\n                     // create link\n                     __result.getContents().add(match);\n\n                     fujaba__Success = true;\n                  }\n                  catch ( JavaSDMException fujaba__InternalException )\n                  {\n                     fujaba__Success = false;\n                  }\n\n\n               }\n               else\n               {\n\n               }\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return __result;'"
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_laneSets);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n// [user code injected with eMoflon]\n\n// TODO: implement this method here but do not remove the injection marker \nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	RuleResult checkAttributes_FWD(TripleMatch tripleMatch);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LaneSetRule