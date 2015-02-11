/**
 */
package BpmnToUseCaseIntegration.Rules;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration;
import BpmnToUseCaseIntegration.DocumentRootToUseCasesModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;
import BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.csp.*;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

import TGGRuntime.AbstractRule;
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
 * A representation of the model object '<em><b>Bp Model To Use Case Model Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see BpmnToUseCaseIntegration.Rules.RulesPackage#getBpModelToUseCaseModelRule()
 * @model
 * @generated
 */
public interface BpModelToUseCaseModelRule extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      CSP csp = null;\n\n      // story node \'initial bindings\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object documentRoot is really bound\n         JavaSDM.ensure ( documentRoot != null );\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'Solve CSP\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.isAppropriate_solveCsp_FWD(match,documentRoot));\n\n         // ensure correct type and really bound of object csp\n         JavaSDM.ensure ( _TmpObject instanceof CSP );\n         csp = (CSP) _TmpObject;\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'Check CSP\'\n      fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);\n      if (fujaba__Success)\n      {\n         // story node \'collect elements to be translated\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object documentRoot is really bound\n            JavaSDM.ensure ( documentRoot != null );\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,documentRoot,\"toBeTranslatedNodes\");\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // story node \'collect context elements\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object documentRoot is really bound\n            JavaSDM.ensure ( documentRoot != null );\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // statement node \'register objects to match\'\n         this.registerObjectsToMatch_FWD(match,documentRoot);\n         return true;\n\n      }\n      else\n      {\n         return false;\n\n      }'"
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, DocumentRoot documentRoot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      DocumentRoot documentRoot = null;\n      Iterator fujaba__IterIsApplicableMatchToCsp = null;\n      CSP csp = null;\n      DocumentRootToUseCasesModel documentRootToUseCasesModel = null;\n      UseCasesModel useCasesModel = null;\n      PerformRuleResult ruleresult = null;\n      EMoflonEdge documentRootToUseCasesModel__source__documentRoot = null;\n      EMoflonEdge documentRootToUseCasesModel__target__useCasesModel = null;\n\n      // story node \'perform transformation\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (isApplicableMatch.getObject(\"documentRoot\"));\n\n         // ensure correct type and really bound of object documentRoot\n         JavaSDM.ensure ( _TmpObject instanceof DocumentRoot );\n         documentRoot = (DocumentRoot) _TmpObject;\n         // check object isApplicableMatch is really bound\n         JavaSDM.ensure ( isApplicableMatch != null );\n         // iterate to-many link attributeInfo from isApplicableMatch to csp\n         fujaba__Success = false;\n\n         fujaba__IterIsApplicableMatchToCsp = isApplicableMatch.getAttributeInfo().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterIsApplicableMatchToCsp.hasNext () )\n         {\n            try\n            {\n               _TmpObject =  fujaba__IterIsApplicableMatchToCsp.next ();\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         if (!fujaba__Success)\n         {\n            fujaba__Success = true;\n            csp = null;\n         }\n         // create object documentRootToUseCasesModel\n         documentRootToUseCasesModel = BpmnToUseCaseIntegrationFactory.eINSTANCE.createDocumentRootToUseCasesModel();\n\n         // create object useCasesModel\n         useCasesModel = UseCaseDSLFactory.eINSTANCE.createUseCasesModel();\n\n\n         // create link\n         documentRootToUseCasesModel.setSource( documentRoot);\n\n\n         // create link\n         documentRootToUseCasesModel.setTarget( useCasesModel);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'collect translated elements\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object documentRoot is really bound\n         JavaSDM.ensure ( documentRoot != null );\n         // check object documentRootToUseCasesModel is really bound\n         JavaSDM.ensure ( documentRootToUseCasesModel != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();\n\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModel,\"createdElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRootToUseCasesModel,\"createdLinkElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRoot,\"translatedElements\");\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'bookkeeping for edges\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object documentRoot is really bound\n         JavaSDM.ensure ( documentRoot != null );\n         // check object documentRootToUseCasesModel is really bound\n         JavaSDM.ensure ( documentRootToUseCasesModel != null );\n         // check object ruleresult is really bound\n         JavaSDM.ensure ( ruleresult != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // check isomorphic binding between objects documentRootToUseCasesModel and documentRoot \n         JavaSDM.ensure ( !documentRootToUseCasesModel.equals (documentRoot) );\n\n         // check isomorphic binding between objects useCasesModel and documentRoot \n         JavaSDM.ensure ( !useCasesModel.equals (documentRoot) );\n\n         // check isomorphic binding between objects useCasesModel and documentRootToUseCasesModel \n         JavaSDM.ensure ( !useCasesModel.equals (documentRootToUseCasesModel) );\n\n         // create object documentRootToUseCasesModel__source__documentRoot\n         documentRootToUseCasesModel__source__documentRoot = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // create object documentRootToUseCasesModel__target__useCasesModel\n         documentRootToUseCasesModel__target__useCasesModel = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // assign attribute ruleresult\n         ruleresult.setRuleName (\"BpModelToUseCaseModelRule\");\n         // assign attribute documentRootToUseCasesModel__source__documentRoot\n         documentRootToUseCasesModel__source__documentRoot.setName (\"source\");\n         // assign attribute documentRootToUseCasesModel__target__useCasesModel\n         documentRootToUseCasesModel__target__useCasesModel.setName (\"target\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRootToUseCasesModel__source__documentRoot,\"createdEdges\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRootToUseCasesModel__target__useCasesModel,\"createdEdges\");\n\n         // create link\n         documentRootToUseCasesModel__source__documentRoot.setTrg( documentRoot);\n\n\n         // create link\n         documentRootToUseCasesModel__target__useCasesModel.setTrg( useCasesModel);\n\n\n         // create link\n         documentRootToUseCasesModel__source__documentRoot.setSrc( documentRootToUseCasesModel);\n\n\n         // create link\n         documentRootToUseCasesModel__target__useCasesModel.setSrc( documentRootToUseCasesModel);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'perform postprocessing\'\n      // No post processing method found\n      // statement node \'register objects\'\n      this.registerObjects_FWD(ruleresult,documentRoot,useCasesModel,documentRootToUseCasesModel);\n      return ruleresult;'"
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass eClass = null;\n      Iterator fujaba__IterEClassToPerformOperation = null;\n      EOperation performOperation = null;\n      IsApplicableRuleResult ruleresult = null;\n      DocumentRoot documentRoot = null;\n      IsApplicableMatch isApplicableMatch = null;\n      CSP csp = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from eClass to performOperation\n         fujaba__Success = false;\n\n         fujaba__IterEClassToPerformOperation = eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterEClassToPerformOperation.hasNext () )\n         {\n            try\n            {\n               performOperation = (EOperation) fujaba__IterEClassToPerformOperation.next ();\n\n               // check object performOperation is really bound\n               JavaSDM.ensure ( performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (performOperation.getName (), \"perform_FWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();\n\n         // assign attribute ruleresult\n         ruleresult.setSuccess (false);\n         // assign attribute ruleresult\n         ruleresult.setRule (\"BpModelToUseCaseModelRule\");\n\n         // create link\n         ruleresult.setPerformOperation( performOperation);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'core match\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (match.getObject(\"documentRoot\"));\n\n         // ensure correct type and really bound of object documentRoot\n         JavaSDM.ensure ( _TmpObject instanceof DocumentRoot );\n         documentRoot = (DocumentRoot) _TmpObject;\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // story node \'find context\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object documentRoot is really bound\n            JavaSDM.ensure ( documentRoot != null );\n            // create object isApplicableMatch\n            isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();\n\n\n            // create link\n            isApplicableMatch.getAllContextElements().add(documentRoot);\n\n            // story node \'solve CSP\'\n            try \n            {\n               fujaba__Success = false; \n\n               _TmpObject = (this.isApplicable_solveCsp_FWD(isApplicableMatch,documentRoot));\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            // statement node \'check CSP\'\n            fujaba__Success = this.isApplicable_checkCsp_FWD(csp);\n            if (fujaba__Success)\n            {\n               // story node \'add match to rule result\'\n               try \n               {\n                  fujaba__Success = false; \n\n                  // check object isApplicableMatch is really bound\n                  JavaSDM.ensure ( isApplicableMatch != null );\n                  // check object ruleresult is really bound\n                  JavaSDM.ensure ( ruleresult != null );\n                  // assign attribute ruleresult\n                  ruleresult.setSuccess (true);\n                  // assign attribute isApplicableMatch\n                  isApplicableMatch.setRuleName (\"BpModelToUseCaseModelRule\");\n\n                  // create link\n                  isApplicableMatch.setIsApplicableRuleResult( ruleresult);\n\n                  fujaba__Success = true;\n               }\n               catch ( JavaSDMException fujaba__InternalException )\n               {\n                  fujaba__Success = false;\n               }\n\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return ruleresult;'"
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='match.registerObject(\"documentRoot\", documentRoot);\n'"
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, DocumentRoot documentRoot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nreturn csp;'"
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, DocumentRoot documentRoot);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\n\r\n// Snapshot pattern match on which CSP is solved\r\nisApplicableMatch.registerObject(\"documentRoot\",documentRoot);\r\nreturn csp;'"
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			DocumentRoot documentRoot);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ruleresult.registerObject(\"documentRoot\", documentRoot);\nruleresult.registerObject(\"useCasesModel\", useCasesModel);\nruleresult.registerObject(\"documentRootToUseCasesModel\", documentRootToUseCasesModel);\n'"
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject documentRootToUseCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true && match.getObject(\"documentRoot\").eClass().equals(bpmn2.Bpmn2Package.eINSTANCE.getDocumentRoot());'"
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      CSP csp = null;\n\n      // story node \'initial bindings\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'Solve CSP\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.isAppropriate_solveCsp_BWD(match,useCasesModel));\n\n         // ensure correct type and really bound of object csp\n         JavaSDM.ensure ( _TmpObject instanceof CSP );\n         csp = (CSP) _TmpObject;\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'Check CSP\'\n      fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);\n      if (fujaba__Success)\n      {\n         // story node \'collect elements to be translated\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,useCasesModel,\"toBeTranslatedNodes\");\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // story node \'collect context elements\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // statement node \'register objects to match\'\n         this.registerObjectsToMatch_BWD(match,useCasesModel);\n         return true;\n\n      }\n      else\n      {\n         return false;\n\n      }'"
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      UseCasesModel useCasesModel = null;\n      Iterator fujaba__IterIsApplicableMatchToCsp = null;\n      CSP csp = null;\n      DocumentRoot documentRoot = null;\n      DocumentRootToUseCasesModel documentRootToUseCasesModel = null;\n      PerformRuleResult ruleresult = null;\n      EMoflonEdge documentRootToUseCasesModel__target__useCasesModel = null;\n      EMoflonEdge documentRootToUseCasesModel__source__documentRoot = null;\n\n      // story node \'perform transformation\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (isApplicableMatch.getObject(\"useCasesModel\"));\n\n         // ensure correct type and really bound of object useCasesModel\n         JavaSDM.ensure ( _TmpObject instanceof UseCasesModel );\n         useCasesModel = (UseCasesModel) _TmpObject;\n         // check object isApplicableMatch is really bound\n         JavaSDM.ensure ( isApplicableMatch != null );\n         // iterate to-many link attributeInfo from isApplicableMatch to csp\n         fujaba__Success = false;\n\n         fujaba__IterIsApplicableMatchToCsp = isApplicableMatch.getAttributeInfo().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterIsApplicableMatchToCsp.hasNext () )\n         {\n            try\n            {\n               _TmpObject =  fujaba__IterIsApplicableMatchToCsp.next ();\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         if (!fujaba__Success)\n         {\n            fujaba__Success = true;\n            csp = null;\n         }\n         // create object documentRoot\n         documentRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();\n\n         // create object documentRootToUseCasesModel\n         documentRootToUseCasesModel = BpmnToUseCaseIntegrationFactory.eINSTANCE.createDocumentRootToUseCasesModel();\n\n\n         // create link\n         documentRootToUseCasesModel.setSource( documentRoot);\n\n\n         // create link\n         documentRootToUseCasesModel.setTarget( useCasesModel);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'collect translated elements\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object documentRoot is really bound\n         JavaSDM.ensure ( documentRoot != null );\n         // check object documentRootToUseCasesModel is really bound\n         JavaSDM.ensure ( documentRootToUseCasesModel != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();\n\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRoot,\"createdElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRootToUseCasesModel,\"createdLinkElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModel,\"translatedElements\");\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'bookkeeping for edges\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object documentRoot is really bound\n         JavaSDM.ensure ( documentRoot != null );\n         // check object documentRootToUseCasesModel is really bound\n         JavaSDM.ensure ( documentRootToUseCasesModel != null );\n         // check object ruleresult is really bound\n         JavaSDM.ensure ( ruleresult != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // check isomorphic binding between objects documentRootToUseCasesModel and documentRoot \n         JavaSDM.ensure ( !documentRootToUseCasesModel.equals (documentRoot) );\n\n         // check isomorphic binding between objects useCasesModel and documentRoot \n         JavaSDM.ensure ( !useCasesModel.equals (documentRoot) );\n\n         // check isomorphic binding between objects useCasesModel and documentRootToUseCasesModel \n         JavaSDM.ensure ( !useCasesModel.equals (documentRootToUseCasesModel) );\n\n         // create object documentRootToUseCasesModel__target__useCasesModel\n         documentRootToUseCasesModel__target__useCasesModel = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // create object documentRootToUseCasesModel__source__documentRoot\n         documentRootToUseCasesModel__source__documentRoot = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // assign attribute ruleresult\n         ruleresult.setRuleName (\"BpModelToUseCaseModelRule\");\n         // assign attribute documentRootToUseCasesModel__source__documentRoot\n         documentRootToUseCasesModel__source__documentRoot.setName (\"source\");\n         // assign attribute documentRootToUseCasesModel__target__useCasesModel\n         documentRootToUseCasesModel__target__useCasesModel.setName (\"target\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRootToUseCasesModel__target__useCasesModel,\"createdEdges\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,documentRootToUseCasesModel__source__documentRoot,\"createdEdges\");\n\n         // create link\n         documentRootToUseCasesModel__source__documentRoot.setTrg( documentRoot);\n\n\n         // create link\n         documentRootToUseCasesModel__target__useCasesModel.setTrg( useCasesModel);\n\n\n         // create link\n         documentRootToUseCasesModel__source__documentRoot.setSrc( documentRootToUseCasesModel);\n\n\n         // create link\n         documentRootToUseCasesModel__target__useCasesModel.setSrc( documentRootToUseCasesModel);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'perform postprocessing\'\n      // No post processing method found\n      // statement node \'register objects\'\n      this.registerObjects_BWD(ruleresult,documentRoot,useCasesModel,documentRootToUseCasesModel);\n      return ruleresult;'"
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass eClass = null;\n      Iterator fujaba__IterEClassToPerformOperation = null;\n      EOperation performOperation = null;\n      IsApplicableRuleResult ruleresult = null;\n      UseCasesModel useCasesModel = null;\n      IsApplicableMatch isApplicableMatch = null;\n      CSP csp = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from eClass to performOperation\n         fujaba__Success = false;\n\n         fujaba__IterEClassToPerformOperation = eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterEClassToPerformOperation.hasNext () )\n         {\n            try\n            {\n               performOperation = (EOperation) fujaba__IterEClassToPerformOperation.next ();\n\n               // check object performOperation is really bound\n               JavaSDM.ensure ( performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (performOperation.getName (), \"perform_BWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();\n\n         // assign attribute ruleresult\n         ruleresult.setSuccess (false);\n         // assign attribute ruleresult\n         ruleresult.setRule (\"BpModelToUseCaseModelRule\");\n\n         // create link\n         ruleresult.setPerformOperation( performOperation);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'core match\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (match.getObject(\"useCasesModel\"));\n\n         // ensure correct type and really bound of object useCasesModel\n         JavaSDM.ensure ( _TmpObject instanceof UseCasesModel );\n         useCasesModel = (UseCasesModel) _TmpObject;\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // story node \'find context\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n            // create object isApplicableMatch\n            isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();\n\n\n            // create link\n            isApplicableMatch.getAllContextElements().add(useCasesModel);\n\n            // story node \'solve CSP\'\n            try \n            {\n               fujaba__Success = false; \n\n               _TmpObject = (this.isApplicable_solveCsp_BWD(isApplicableMatch,useCasesModel));\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            // statement node \'check CSP\'\n            fujaba__Success = this.isApplicable_checkCsp_BWD(csp);\n            if (fujaba__Success)\n            {\n               // story node \'add match to rule result\'\n               try \n               {\n                  fujaba__Success = false; \n\n                  // check object isApplicableMatch is really bound\n                  JavaSDM.ensure ( isApplicableMatch != null );\n                  // check object ruleresult is really bound\n                  JavaSDM.ensure ( ruleresult != null );\n                  // assign attribute ruleresult\n                  ruleresult.setSuccess (true);\n                  // assign attribute isApplicableMatch\n                  isApplicableMatch.setRuleName (\"BpModelToUseCaseModelRule\");\n\n                  // create link\n                  isApplicableMatch.setIsApplicableRuleResult( ruleresult);\n\n                  fujaba__Success = true;\n               }\n               catch ( JavaSDMException fujaba__InternalException )\n               {\n                  fujaba__Success = false;\n               }\n\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return ruleresult;'"
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='match.registerObject(\"useCasesModel\", useCasesModel);\n'"
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nreturn csp;'"
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\n\r\n// Snapshot pattern match on which CSP is solved\r\nisApplicableMatch.registerObject(\"useCasesModel\",useCasesModel);\r\nreturn csp;'"
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ruleresult.registerObject(\"documentRoot\", documentRoot);\nruleresult.registerObject(\"useCasesModel\", useCasesModel);\nruleresult.registerObject(\"documentRootToUseCasesModel\", documentRootToUseCasesModel);\n'"
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject documentRootToUseCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true && match.getObject(\"useCasesModel\").eClass().equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getUseCasesModel());'"
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass __eClass = null;\n      Iterator fujaba__Iter__eClassTo__performOperation = null;\n      EOperation __performOperation = null;\n      EObjectContainer __result = null;\n      Match match = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object __eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         __eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from __eClass to __performOperation\n         fujaba__Success = false;\n\n         fujaba__Iter__eClassTo__performOperation = __eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__Iter__eClassTo__performOperation.hasNext () )\n         {\n            try\n            {\n               __performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation.next ();\n\n               // check object __performOperation is really bound\n               JavaSDM.ensure ( __performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (__performOperation.getName (), \"isApplicable_FWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object __result\n         __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'test core match kernel\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object documentRoot is really bound\n         JavaSDM.ensure ( documentRoot != null );\n         // story node \'test core match and DECs\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object documentRoot is really bound\n            JavaSDM.ensure ( documentRoot != null );\n            // create object match\n            match = TGGRuntimeFactory.eINSTANCE.createMatch();\n\n            // assign attribute match\n            match.setRuleName (__eClass.getName());\n            // statement node \'bookkeeping with generic isAppropriate method\'\n            fujaba__Success = this.isAppropriate_FWD(match,documentRoot);\n            if (fujaba__Success)\n            {\n               // statement node \'\'\n               fujaba__Success = this.checkTypes_FWD(match);\n               if (fujaba__Success)\n               {\n                  // story node \'Add match to rule result\'\n                  try \n                  {\n                     fujaba__Success = false; \n\n                     // check object __performOperation is really bound\n                     JavaSDM.ensure ( __performOperation != null );\n                     // check object __result is really bound\n                     JavaSDM.ensure ( __result != null );\n                     // check object match is really bound\n                     JavaSDM.ensure ( match != null );\n\n                     // create link\n                     org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,__performOperation,\"isApplicableOperation\");\n\n                     // create link\n                     __result.getContents().add(match);\n\n                     fujaba__Success = true;\n                  }\n                  catch ( JavaSDMException fujaba__InternalException )\n                  {\n                     fujaba__Success = false;\n                  }\n\n\n               }\n               else\n               {\n\n               }\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return __result;'"
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_DocumentRoot_4(DocumentRoot documentRoot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass __eClass = null;\n      Iterator fujaba__Iter__eClassTo__performOperation = null;\n      EOperation __performOperation = null;\n      EObjectContainer __result = null;\n      Match match = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object __eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         __eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from __eClass to __performOperation\n         fujaba__Success = false;\n\n         fujaba__Iter__eClassTo__performOperation = __eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__Iter__eClassTo__performOperation.hasNext () )\n         {\n            try\n            {\n               __performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation.next ();\n\n               // check object __performOperation is really bound\n               JavaSDM.ensure ( __performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (__performOperation.getName (), \"isApplicable_BWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object __result\n         __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'test core match kernel\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // story node \'test core match and DECs\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n            // create object match\n            match = TGGRuntimeFactory.eINSTANCE.createMatch();\n\n            // assign attribute match\n            match.setRuleName (__eClass.getName());\n            // statement node \'bookkeeping with generic isAppropriate method\'\n            fujaba__Success = this.isAppropriate_BWD(match,useCasesModel);\n            if (fujaba__Success)\n            {\n               // statement node \'\'\n               fujaba__Success = this.checkTypes_BWD(match);\n               if (fujaba__Success)\n               {\n                  // story node \'Add match to rule result\'\n                  try \n                  {\n                     fujaba__Success = false; \n\n                     // check object __performOperation is really bound\n                     JavaSDM.ensure ( __performOperation != null );\n                     // check object __result is really bound\n                     JavaSDM.ensure ( __result != null );\n                     // check object match is really bound\n                     JavaSDM.ensure ( match != null );\n\n                     // create link\n                     org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,__performOperation,\"isApplicableOperation\");\n\n                     // create link\n                     __result.getContents().add(match);\n\n                     fujaba__Success = true;\n                  }\n                  catch ( JavaSDMException fujaba__InternalException )\n                  {\n                     fujaba__Success = false;\n                  }\n\n\n               }\n               else\n               {\n\n               }\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return __result;'"
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_UseCasesModel_4(
			UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n// [user code injected with eMoflon]\n\n// TODO: implement this method here but do not remove the injection marker \nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	RuleResult checkAttributes_FWD(TripleMatch tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n// [user code injected with eMoflon]\n\n// TODO: implement this method here but do not remove the injection marker \nthrow new UnsupportedOperationException();'"
	 * @generated
	 */
	RuleResult checkAttributes_BWD(TripleMatch tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      ModelgeneratorRuleResult ruleResult = null;\n      IsApplicableMatch isApplicableMatch = null;\n      Object _TmpObject = null;\n      CSP csp = null;\n      DocumentRoot documentRoot = null;\n      DocumentRootToUseCasesModel documentRootToUseCasesModel = null;\n      UseCasesModel useCasesModel = null;\n\n      // story node \'create result\'\n      try \n      {\n         fujaba__Success = false; \n\n         // create object ruleResult\n         ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();\n\n         // create object isApplicableMatch\n         isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();\n\n         // assign attribute ruleResult\n         ruleResult.setSuccess (false);\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      if (fujaba__Success)\n      {\n         // story node \'solve CSP\'\n         try \n         {\n            fujaba__Success = false; \n\n            _TmpObject = (this.generateModel_solveCsp_BWD(isApplicableMatch,documentRoot,useCasesModel,documentRootToUseCasesModel,ruleResult));\n\n            // ensure correct type and really bound of object csp\n            JavaSDM.ensure ( _TmpObject instanceof CSP );\n            csp = (CSP) _TmpObject;\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // statement node \'check CSP\'\n         fujaba__Success = this.generateModel_checkCsp_BWD(csp);\n         if (fujaba__Success)\n         {\n            // story node \'perform\'\n            try \n            {\n               fujaba__Success = false; \n\n               // check object ruleResult is really bound\n               JavaSDM.ensure ( ruleResult != null );\n               // create object documentRoot\n               documentRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();\n\n               // create object documentRootToUseCasesModel\n               documentRootToUseCasesModel = BpmnToUseCaseIntegrationFactory.eINSTANCE.createDocumentRootToUseCasesModel();\n\n               // create object useCasesModel\n               useCasesModel = UseCaseDSLFactory.eINSTANCE.createUseCasesModel();\n\n               // assign attribute ruleResult\n               ruleResult.setSuccess (true);\n\n               // create link\n               documentRootToUseCasesModel.setSource( documentRoot);\n\n\n               // create link\n               ruleResult.getSourceObjects().add(documentRoot);\n\n\n               // create link\n               ruleResult.getTargetObjects().add(useCasesModel);\n\n\n               // create link\n               documentRootToUseCasesModel.setTarget( useCasesModel);\n\n\n               // create link\n               ruleResult.getCorrObjects().add(documentRootToUseCasesModel);\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            return ruleResult;\n\n         }\n\n      }\n      else\n      {\n\n      }\n      return ruleResult;'"
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\n\r\n// Snapshot pattern match on which CSP is solved\r\nreturn csp;'"
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocumentRootToUseCasesModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // BpModelToUseCaseModelRule
