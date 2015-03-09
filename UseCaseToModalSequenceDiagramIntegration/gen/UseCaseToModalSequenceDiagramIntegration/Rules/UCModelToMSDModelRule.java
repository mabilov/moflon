/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules;

import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Constraint;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.LiteralString;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.Model;

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
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;
import UseCaseToModalSequenceDiagramIntegration.ParallelStepToCombinedFragment;
import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;
import UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel;

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
 * A representation of the model object '<em><b>UC Model To MSD Model Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage#getUCModelToMSDModelRule()
 * @model
 * @generated
 */
public interface UCModelToMSDModelRule extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      CSP csp = null;\n\n      // story node \'initial bindings\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'Solve CSP\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.isAppropriate_solveCsp_FWD(match,useCasesModel));\n\n         // ensure correct type and really bound of object csp\n         JavaSDM.ensure ( _TmpObject instanceof CSP );\n         csp = (CSP) _TmpObject;\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'Check CSP\'\n      fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);\n      if (fujaba__Success)\n      {\n         // story node \'collect elements to be translated\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,useCasesModel,\"toBeTranslatedNodes\");\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // story node \'collect context elements\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // statement node \'register objects to match\'\n         this.registerObjectsToMatch_FWD(match,useCasesModel);\n         return true;\n\n      }\n      else\n      {\n         return false;\n\n      }'"
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      UseCasesModel useCasesModel = null;\n      Iterator fujaba__IterIsApplicableMatchToCsp = null;\n      CSP csp = null;\n      UseCasesModelToModel useCasesModelToModel = null;\n      Model model = null;\n      PerformRuleResult ruleresult = null;\n      EMoflonEdge useCasesModelToModel__target__model = null;\n      EMoflonEdge useCasesModelToModel__source__useCasesModel = null;\n\n      // story node \'perform transformation\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (isApplicableMatch.getObject(\"useCasesModel\"));\n\n         // ensure correct type and really bound of object useCasesModel\n         JavaSDM.ensure ( _TmpObject instanceof UseCasesModel );\n         useCasesModel = (UseCasesModel) _TmpObject;\n         // check object isApplicableMatch is really bound\n         JavaSDM.ensure ( isApplicableMatch != null );\n         // iterate to-many link attributeInfo from isApplicableMatch to csp\n         fujaba__Success = false;\n\n         fujaba__IterIsApplicableMatchToCsp = isApplicableMatch.getAttributeInfo().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterIsApplicableMatchToCsp.hasNext () )\n         {\n            try\n            {\n               _TmpObject =  fujaba__IterIsApplicableMatchToCsp.next ();\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object useCasesModelToModel\n         useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE.createUseCasesModelToModel();\n\n         // create object model\n         model = ModalSequenceDiagramFactory.eINSTANCE.createModel();\n\n\n         // create link\n         useCasesModelToModel.setSource( useCasesModel);\n\n\n         // create link\n         useCasesModelToModel.setTarget( model);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'collect translated elements\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object model is really bound\n         JavaSDM.ensure ( model != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // check object useCasesModelToModel is really bound\n         JavaSDM.ensure ( useCasesModelToModel != null );\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();\n\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModel,\"translatedElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,model,\"createdElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModelToModel,\"createdLinkElements\");\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'bookkeeping for edges\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object model is really bound\n         JavaSDM.ensure ( model != null );\n         // check object ruleresult is really bound\n         JavaSDM.ensure ( ruleresult != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // check object useCasesModelToModel is really bound\n         JavaSDM.ensure ( useCasesModelToModel != null );\n         // check isomorphic binding between objects useCasesModel and model \n         JavaSDM.ensure ( !useCasesModel.equals (model) );\n\n         // check isomorphic binding between objects useCasesModelToModel and model \n         JavaSDM.ensure ( !useCasesModelToModel.equals (model) );\n\n         // check isomorphic binding between objects useCasesModelToModel and useCasesModel \n         JavaSDM.ensure ( !useCasesModelToModel.equals (useCasesModel) );\n\n         // create object useCasesModelToModel__target__model\n         useCasesModelToModel__target__model = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // create object useCasesModelToModel__source__useCasesModel\n         useCasesModelToModel__source__useCasesModel = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // assign attribute ruleresult\n         ruleresult.setRuleName (\"UCModelToMSDModelRule\");\n         // assign attribute useCasesModelToModel__source__useCasesModel\n         useCasesModelToModel__source__useCasesModel.setName (\"source\");\n         // assign attribute useCasesModelToModel__target__model\n         useCasesModelToModel__target__model.setName (\"target\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModelToModel__target__model,\"createdEdges\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModelToModel__source__useCasesModel,\"createdEdges\");\n\n         // create link\n         useCasesModelToModel__source__useCasesModel.setTrg( useCasesModel);\n\n\n         // create link\n         useCasesModelToModel__target__model.setTrg( model);\n\n\n         // create link\n         useCasesModelToModel__source__useCasesModel.setSrc( useCasesModelToModel);\n\n\n         // create link\n         useCasesModelToModel__target__model.setSrc( useCasesModelToModel);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'perform postprocessing\'\n      // No post processing method found\n      // statement node \'register objects\'\n      this.registerObjects_FWD(ruleresult,useCasesModel,model,useCasesModelToModel);\n      return ruleresult;'"
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass eClass = null;\n      Iterator fujaba__IterEClassToPerformOperation = null;\n      EOperation performOperation = null;\n      IsApplicableRuleResult ruleresult = null;\n      UseCasesModel useCasesModel = null;\n      IsApplicableMatch isApplicableMatch = null;\n      CSP csp = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from eClass to performOperation\n         fujaba__Success = false;\n\n         fujaba__IterEClassToPerformOperation = eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterEClassToPerformOperation.hasNext () )\n         {\n            try\n            {\n               performOperation = (EOperation) fujaba__IterEClassToPerformOperation.next ();\n\n               // check object performOperation is really bound\n               JavaSDM.ensure ( performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (performOperation.getName (), \"perform_FWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();\n\n         // assign attribute ruleresult\n         ruleresult.setSuccess (false);\n         // assign attribute ruleresult\n         ruleresult.setRule (\"UCModelToMSDModelRule\");\n\n         // create link\n         ruleresult.setPerformOperation( performOperation);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'core match\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (match.getObject(\"useCasesModel\"));\n\n         // ensure correct type and really bound of object useCasesModel\n         JavaSDM.ensure ( _TmpObject instanceof UseCasesModel );\n         useCasesModel = (UseCasesModel) _TmpObject;\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // story node \'find context\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n            // create object isApplicableMatch\n            isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();\n\n\n            // create link\n            isApplicableMatch.getAllContextElements().add(useCasesModel);\n\n            // story node \'solve CSP\'\n            try \n            {\n               fujaba__Success = false; \n\n               _TmpObject = (this.isApplicable_solveCsp_FWD(isApplicableMatch,useCasesModel));\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            // statement node \'check CSP\'\n            fujaba__Success = this.isApplicable_checkCsp_FWD(csp);\n            if (fujaba__Success)\n            {\n               // story node \'add match to rule result\'\n               try \n               {\n                  fujaba__Success = false; \n\n                  // check object isApplicableMatch is really bound\n                  JavaSDM.ensure ( isApplicableMatch != null );\n                  // check object ruleresult is really bound\n                  JavaSDM.ensure ( ruleresult != null );\n                  // assign attribute isApplicableMatch\n                  isApplicableMatch.setRuleName (\"UCModelToMSDModelRule\");\n                  // assign attribute ruleresult\n                  ruleresult.setSuccess (true);\n\n                  // create link\n                  ruleresult.getIsApplicableMatch().add(isApplicableMatch);\n\n                  fujaba__Success = true;\n               }\n               catch ( JavaSDMException fujaba__InternalException )\n               {\n                  fujaba__Success = false;\n               }\n\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return ruleresult;'"
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='match.registerObject(\"useCasesModel\", useCasesModel);\n'"
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nreturn csp;'"
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, UseCasesModel useCasesModel);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nisApplicableMatch.getAttributeInfo().add(csp);\r\n\r\n// Snapshot pattern match on which CSP is solved\r\nisApplicableMatch.registerObject(\"useCasesModel\",useCasesModel);\r\nreturn csp;'"
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ruleresult.registerObject(\"useCasesModel\", useCasesModel);\nruleresult.registerObject(\"model\", model);\nruleresult.registerObject(\"useCasesModelToModel\", useCasesModelToModel);\n'"
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject useCasesModel, EObject model, EObject useCasesModelToModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true && match.getObject(\"useCasesModel\").eClass().equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getUseCasesModel());'"
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      CSP csp = null;\n\n      // story node \'initial bindings\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // check object model is really bound\n         JavaSDM.ensure ( model != null );\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'Solve CSP\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.isAppropriate_solveCsp_BWD(match,model));\n\n         // ensure correct type and really bound of object csp\n         JavaSDM.ensure ( _TmpObject instanceof CSP );\n         csp = (CSP) _TmpObject;\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'Check CSP\'\n      fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);\n      if (fujaba__Success)\n      {\n         // story node \'collect elements to be translated\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object model is really bound\n            JavaSDM.ensure ( model != null );\n\n            // create link\n            org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,model,\"toBeTranslatedNodes\");\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // story node \'collect context elements\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object match is really bound\n            JavaSDM.ensure ( match != null );\n            // check object model is really bound\n            JavaSDM.ensure ( model != null );\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         // statement node \'register objects to match\'\n         this.registerObjectsToMatch_BWD(match,model);\n         return true;\n\n      }\n      else\n      {\n         return false;\n\n      }'"
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, Model model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      Model model = null;\n      Iterator fujaba__IterIsApplicableMatchToCsp = null;\n      CSP csp = null;\n      UseCasesModel useCasesModel = null;\n      UseCasesModelToModel useCasesModelToModel = null;\n      PerformRuleResult ruleresult = null;\n      EMoflonEdge useCasesModelToModel__source__useCasesModel = null;\n      EMoflonEdge useCasesModelToModel__target__model = null;\n\n      // story node \'perform transformation\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (isApplicableMatch.getObject(\"model\"));\n\n         // ensure correct type and really bound of object model\n         JavaSDM.ensure ( _TmpObject instanceof Model );\n         model = (Model) _TmpObject;\n         // check object isApplicableMatch is really bound\n         JavaSDM.ensure ( isApplicableMatch != null );\n         // iterate to-many link attributeInfo from isApplicableMatch to csp\n         fujaba__Success = false;\n\n         fujaba__IterIsApplicableMatchToCsp = isApplicableMatch.getAttributeInfo().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterIsApplicableMatchToCsp.hasNext () )\n         {\n            try\n            {\n               _TmpObject =  fujaba__IterIsApplicableMatchToCsp.next ();\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object useCasesModel\n         useCasesModel = UseCaseDSLFactory.eINSTANCE.createUseCasesModel();\n\n         // create object useCasesModelToModel\n         useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE.createUseCasesModelToModel();\n\n\n         // create link\n         useCasesModelToModel.setSource( useCasesModel);\n\n\n         // create link\n         useCasesModelToModel.setTarget( model);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'collect translated elements\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object model is really bound\n         JavaSDM.ensure ( model != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // check object useCasesModelToModel is really bound\n         JavaSDM.ensure ( useCasesModelToModel != null );\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();\n\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,model,\"translatedElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModel,\"createdElements\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModelToModel,\"createdLinkElements\");\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'bookkeeping for edges\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object model is really bound\n         JavaSDM.ensure ( model != null );\n         // check object ruleresult is really bound\n         JavaSDM.ensure ( ruleresult != null );\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // check object useCasesModelToModel is really bound\n         JavaSDM.ensure ( useCasesModelToModel != null );\n         // check isomorphic binding between objects useCasesModel and model \n         JavaSDM.ensure ( !useCasesModel.equals (model) );\n\n         // check isomorphic binding between objects useCasesModelToModel and model \n         JavaSDM.ensure ( !useCasesModelToModel.equals (model) );\n\n         // check isomorphic binding between objects useCasesModelToModel and useCasesModel \n         JavaSDM.ensure ( !useCasesModelToModel.equals (useCasesModel) );\n\n         // create object useCasesModelToModel__source__useCasesModel\n         useCasesModelToModel__source__useCasesModel = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // create object useCasesModelToModel__target__model\n         useCasesModelToModel__target__model = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();\n\n         // assign attribute ruleresult\n         ruleresult.setRuleName (\"UCModelToMSDModelRule\");\n         // assign attribute useCasesModelToModel__source__useCasesModel\n         useCasesModelToModel__source__useCasesModel.setName (\"source\");\n         // assign attribute useCasesModelToModel__target__model\n         useCasesModelToModel__target__model.setName (\"target\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModelToModel__source__useCasesModel,\"createdEdges\");\n\n         // create link\n         org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,useCasesModelToModel__target__model,\"createdEdges\");\n\n         // create link\n         useCasesModelToModel__source__useCasesModel.setTrg( useCasesModel);\n\n\n         // create link\n         useCasesModelToModel__target__model.setTrg( model);\n\n\n         // create link\n         useCasesModelToModel__target__model.setSrc( useCasesModelToModel);\n\n\n         // create link\n         useCasesModelToModel__source__useCasesModel.setSrc( useCasesModelToModel);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // statement node \'perform postprocessing\'\n      // No post processing method found\n      // statement node \'register objects\'\n      this.registerObjects_BWD(ruleresult,useCasesModel,model,useCasesModelToModel);\n      return ruleresult;'"
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass eClass = null;\n      Iterator fujaba__IterEClassToPerformOperation = null;\n      EOperation performOperation = null;\n      IsApplicableRuleResult ruleresult = null;\n      Model model = null;\n      IsApplicableMatch isApplicableMatch = null;\n      CSP csp = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from eClass to performOperation\n         fujaba__Success = false;\n\n         fujaba__IterEClassToPerformOperation = eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__IterEClassToPerformOperation.hasNext () )\n         {\n            try\n            {\n               performOperation = (EOperation) fujaba__IterEClassToPerformOperation.next ();\n\n               // check object performOperation is really bound\n               JavaSDM.ensure ( performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (performOperation.getName (), \"perform_BWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object ruleresult\n         ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();\n\n         // assign attribute ruleresult\n         ruleresult.setSuccess (false);\n         // assign attribute ruleresult\n         ruleresult.setRule (\"UCModelToMSDModelRule\");\n\n         // create link\n         ruleresult.setPerformOperation( performOperation);\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'core match\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (match.getObject(\"model\"));\n\n         // ensure correct type and really bound of object model\n         JavaSDM.ensure ( _TmpObject instanceof Model );\n         model = (Model) _TmpObject;\n         // check object match is really bound\n         JavaSDM.ensure ( match != null );\n         // story node \'find context\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object model is really bound\n            JavaSDM.ensure ( model != null );\n            // create object isApplicableMatch\n            isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();\n\n\n            // create link\n            isApplicableMatch.getAllContextElements().add(model);\n\n            // story node \'solve CSP\'\n            try \n            {\n               fujaba__Success = false; \n\n               _TmpObject = (this.isApplicable_solveCsp_BWD(isApplicableMatch,model));\n\n               // ensure correct type and really bound of object csp\n               JavaSDM.ensure ( _TmpObject instanceof CSP );\n               csp = (CSP) _TmpObject;\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            // statement node \'check CSP\'\n            fujaba__Success = this.isApplicable_checkCsp_BWD(csp);\n            if (fujaba__Success)\n            {\n               // story node \'add match to rule result\'\n               try \n               {\n                  fujaba__Success = false; \n\n                  // check object isApplicableMatch is really bound\n                  JavaSDM.ensure ( isApplicableMatch != null );\n                  // check object ruleresult is really bound\n                  JavaSDM.ensure ( ruleresult != null );\n                  // assign attribute isApplicableMatch\n                  isApplicableMatch.setRuleName (\"UCModelToMSDModelRule\");\n                  // assign attribute ruleresult\n                  ruleresult.setSuccess (true);\n\n                  // create link\n                  ruleresult.getIsApplicableMatch().add(isApplicableMatch);\n\n                  fujaba__Success = true;\n               }\n               catch ( JavaSDMException fujaba__InternalException )\n               {\n                  fujaba__Success = false;\n               }\n\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return ruleresult;'"
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='match.registerObject(\"model\", model);\n'"
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, Model model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nreturn csp;'"
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, Model model);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Create CSP\r\nCSP csp = CspFactory.eINSTANCE.createCSP();\r\nisApplicableMatch.getAttributeInfo().add(csp);\r\n\r\n// Snapshot pattern match on which CSP is solved\r\nisApplicableMatch.registerObject(\"model\",model);\r\nreturn csp;'"
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Model model);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ruleresult.registerObject(\"useCasesModel\", useCasesModel);\nruleresult.registerObject(\"model\", model);\nruleresult.registerObject(\"useCasesModelToModel\", useCasesModelToModel);\n'"
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject useCasesModel, EObject model, EObject useCasesModelToModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return true && match.getObject(\"model\").eClass().equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE.getModel());'"
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass __eClass = null;\n      Iterator fujaba__Iter__eClassTo__performOperation = null;\n      EOperation __performOperation = null;\n      EObjectContainer __result = null;\n      Match match = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object __eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         __eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from __eClass to __performOperation\n         fujaba__Success = false;\n\n         fujaba__Iter__eClassTo__performOperation = __eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__Iter__eClassTo__performOperation.hasNext () )\n         {\n            try\n            {\n               __performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation.next ();\n\n               // check object __performOperation is really bound\n               JavaSDM.ensure ( __performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (__performOperation.getName (), \"isApplicable_FWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object __result\n         __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'test core match kernel\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object useCasesModel is really bound\n         JavaSDM.ensure ( useCasesModel != null );\n         // story node \'test core match and DECs\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check object useCasesModel is really bound\n            JavaSDM.ensure ( useCasesModel != null );\n            // create object match\n            match = TGGRuntimeFactory.eINSTANCE.createMatch();\n\n            // assign attribute match\n            match.setRuleName (__eClass.getName());\n            // statement node \'bookkeeping with generic isAppropriate method\'\n            fujaba__Success = this.isAppropriate_FWD(match,useCasesModel);\n            if (fujaba__Success)\n            {\n               // statement node \'Ensure that the correct types of elements are matched\'\n               fujaba__Success = this.checkTypes_FWD(match);\n               if (fujaba__Success)\n               {\n                  // story node \'Add match to rule result\'\n                  try \n                  {\n                     fujaba__Success = false; \n\n                     // check object __performOperation is really bound\n                     JavaSDM.ensure ( __performOperation != null );\n                     // check object __result is really bound\n                     JavaSDM.ensure ( __result != null );\n                     // check object match is really bound\n                     JavaSDM.ensure ( match != null );\n\n                     // create link\n                     org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,__performOperation,\"isApplicableOperation\");\n\n                     // create link\n                     __result.getContents().add(match);\n\n                     fujaba__Success = true;\n                  }\n                  catch ( JavaSDMException fujaba__InternalException )\n                  {\n                     fujaba__Success = false;\n                  }\n\n\n               }\n               else\n               {\n\n               }\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return __result;'"
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_UseCasesModel_0(
			UseCasesModel useCasesModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean fujaba__Success = false;\n      Object _TmpObject = null;\n      EClass __eClass = null;\n      Iterator fujaba__Iter__eClassTo__performOperation = null;\n      EOperation __performOperation = null;\n      EObjectContainer __result = null;\n      ModalSequenceDiagram.Package __DEC_model_packagedElement_665171 = null;\n      Match match = null;\n\n      // story node \'prepare return value\'\n      try \n      {\n         fujaba__Success = false; \n\n         _TmpObject = (this.eClass());\n\n         // ensure correct type and really bound of object __eClass\n         JavaSDM.ensure ( _TmpObject instanceof EClass );\n         __eClass = (EClass) _TmpObject;\n         // iterate to-many link eOperations from __eClass to __performOperation\n         fujaba__Success = false;\n\n         fujaba__Iter__eClassTo__performOperation = __eClass.getEOperations().iterator ();\n\n         while ( !(fujaba__Success) && fujaba__Iter__eClassTo__performOperation.hasNext () )\n         {\n            try\n            {\n               __performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation.next ();\n\n               // check object __performOperation is really bound\n               JavaSDM.ensure ( __performOperation != null );\n               // attribute condition\n               JavaSDM.ensure ( JavaSDM.stringCompare (__performOperation.getName (), \"isApplicable_BWD\") == 0 );\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n         }\n         JavaSDM.ensure (fujaba__Success);\n         // create object __result\n         __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      // story node \'test core match kernel\'\n      try \n      {\n         fujaba__Success = false; \n\n         // check object model is really bound\n         JavaSDM.ensure ( model != null );\n         // story node \'test core match and DECs\'\n         try \n         {\n            fujaba__Success = false; \n\n            // check negative bindings\n            try\n            {\n               fujaba__Success = false;\n\n               // bind object\n               __DEC_model_packagedElement_665171 = model.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) model.eContainer() : null;\n\n               // check object __DEC_model_packagedElement_665171 is really bound\n               JavaSDM.ensure ( __DEC_model_packagedElement_665171 != null );\n\n               // check if contained via correct reference\n               JavaSDM.ensure(__DEC_model_packagedElement_665171.getPackagedElement().contains(model));\n\n               // check isomorphic binding between objects __DEC_model_packagedElement_665171 and model \n               JavaSDM.ensure ( !__DEC_model_packagedElement_665171.equals (model) );\n\n\n\n               fujaba__Success = true;\n            }\n            catch ( JavaSDMException fujaba__InternalException )\n            {\n               fujaba__Success = false;\n            }\n\n            fujaba__Success = !(fujaba__Success);\n\n            JavaSDM.ensure ( fujaba__Success );\n\n            // check link packagedElement from model to model\n            JavaSDM.ensure (!(org.moflon.util.eMoflonEMFUtil.getOppositeReference(model,Model.class,\"$eContainer\")\n            .contains (model)));\n\n            // check link packagedElement from model to model\n            JavaSDM.ensure (!(org.moflon.util.eMoflonEMFUtil.getOppositeReference(model,Model.class,\"$eContainer\")\n            .contains (model)));\n\n            // check object model is really bound\n            JavaSDM.ensure ( model != null );\n            // create object match\n            match = TGGRuntimeFactory.eINSTANCE.createMatch();\n\n            // assign attribute match\n            match.setRuleName (__eClass.getName());\n            // statement node \'bookkeeping with generic isAppropriate method\'\n            fujaba__Success = this.isAppropriate_BWD(match,model);\n            if (fujaba__Success)\n            {\n               // statement node \'Ensure that the correct types of elements are matched\'\n               fujaba__Success = this.checkTypes_BWD(match);\n               if (fujaba__Success)\n               {\n                  // story node \'Add match to rule result\'\n                  try \n                  {\n                     fujaba__Success = false; \n\n                     // check object __performOperation is really bound\n                     JavaSDM.ensure ( __performOperation != null );\n                     // check object __result is really bound\n                     JavaSDM.ensure ( __result != null );\n                     // check object match is really bound\n                     JavaSDM.ensure ( match != null );\n\n                     // create link\n                     org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,__performOperation,\"isApplicableOperation\");\n\n                     // create link\n                     __result.getContents().add(match);\n\n                     fujaba__Success = true;\n                  }\n                  catch ( JavaSDMException fujaba__InternalException )\n                  {\n                     fujaba__Success = false;\n                  }\n\n\n               }\n               else\n               {\n\n               }\n\n            }\n            else\n            {\n\n            }\n            fujaba__Success = true;\n         }\n         catch ( JavaSDMException fujaba__InternalException )\n         {\n            fujaba__Success = false;\n         }\n\n         fujaba__Success = true;\n      }\n      catch ( JavaSDMException fujaba__InternalException )\n      {\n         fujaba__Success = false;\n      }\n\n      return __result;'"
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_Model_0(Model model);

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
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UCModelToMSDModelRule
