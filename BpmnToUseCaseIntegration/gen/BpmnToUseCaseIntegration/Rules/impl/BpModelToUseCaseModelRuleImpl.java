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

import BpmnToUseCaseIntegration.Rules.BpModelToUseCaseModelRule;
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
 * An implementation of the model object '<em><b>Bp Model To Use Case Model Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BpModelToUseCaseModelRuleImpl extends AbstractRuleImpl implements
		BpModelToUseCaseModelRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpModelToUseCaseModelRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getBpModelToUseCaseModelRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, DocumentRoot documentRoot) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, documentRoot));

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

				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						documentRoot, "toBeTranslatedNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, documentRoot);
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
		DocumentRoot documentRoot = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		DocumentRootToUseCasesModel documentRootToUseCasesModel = null;
		UseCasesModel useCasesModel = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge documentRootToUseCasesModel__source__documentRoot = null;
		EMoflonEdge documentRootToUseCasesModel__target__useCasesModel = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("documentRoot"));

			// ensure correct type and really bound of object documentRoot
			JavaSDM.ensure(_TmpObject instanceof DocumentRoot);
			documentRoot = (DocumentRoot) _TmpObject;
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
			// create object documentRootToUseCasesModel
			documentRootToUseCasesModel = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createDocumentRootToUseCasesModel();

			// create object useCasesModel
			useCasesModel = UseCaseDSLFactory.eINSTANCE.createUseCasesModel();

			// create link
			documentRootToUseCasesModel.setSource(documentRoot);

			// create link
			documentRootToUseCasesModel.setTarget(useCasesModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object documentRootToUseCasesModel is really bound
			JavaSDM.ensure(documentRootToUseCasesModel != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModel, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRootToUseCasesModel, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRoot, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object documentRootToUseCasesModel is really bound
			JavaSDM.ensure(documentRootToUseCasesModel != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check isomorphic binding between objects documentRootToUseCasesModel and documentRoot 
			JavaSDM.ensure(!documentRootToUseCasesModel.equals(documentRoot));

			// check isomorphic binding between objects useCasesModel and documentRoot 
			JavaSDM.ensure(!useCasesModel.equals(documentRoot));

			// check isomorphic binding between objects useCasesModel and documentRootToUseCasesModel 
			JavaSDM.ensure(!useCasesModel.equals(documentRootToUseCasesModel));

			// create object documentRootToUseCasesModel__source__documentRoot
			documentRootToUseCasesModel__source__documentRoot = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object documentRootToUseCasesModel__target__useCasesModel
			documentRootToUseCasesModel__target__useCasesModel = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("BpModelToUseCaseModelRule");
			// assign attribute documentRootToUseCasesModel__source__documentRoot
			documentRootToUseCasesModel__source__documentRoot.setName("source");
			// assign attribute documentRootToUseCasesModel__target__useCasesModel
			documentRootToUseCasesModel__target__useCasesModel
					.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRootToUseCasesModel__source__documentRoot,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRootToUseCasesModel__target__useCasesModel,
					"createdEdges");

			// create link
			documentRootToUseCasesModel__source__documentRoot
					.setTrg(documentRoot);

			// create link
			documentRootToUseCasesModel__target__useCasesModel
					.setTrg(useCasesModel);

			// create link
			documentRootToUseCasesModel__source__documentRoot
					.setSrc(documentRootToUseCasesModel);

			// create link
			documentRootToUseCasesModel__target__useCasesModel
					.setSrc(documentRootToUseCasesModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, documentRoot, useCasesModel,
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
		DocumentRoot documentRoot = null;
		IsApplicableMatch isApplicableMatch = null;
		CSP csp = null;

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
			ruleresult.setRule("BpModelToUseCaseModelRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("documentRoot"));

			// ensure correct type and really bound of object documentRoot
			JavaSDM.ensure(_TmpObject instanceof DocumentRoot);
			documentRoot = (DocumentRoot) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// story node 'find context'
			try {
				fujaba__Success = false;

				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// create object isApplicableMatch
				isApplicableMatch = TGGRuntimeFactory.eINSTANCE
						.createIsApplicableMatch();

				// create link
				isApplicableMatch.getAllContextElements().add(documentRoot);

				// story node 'solve CSP'
				try {
					fujaba__Success = false;

					_TmpObject = (this.isApplicable_solveCsp_FWD(
							isApplicableMatch, documentRoot));

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
								.setRuleName("BpModelToUseCaseModelRule");

						// create link
						isApplicableMatch.setIsApplicableRuleResult(ruleresult);

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			DocumentRoot documentRoot) {
		match.registerObject("documentRoot", documentRoot);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, DocumentRoot documentRoot) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			DocumentRoot documentRoot) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("documentRoot", documentRoot);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject documentRootToUseCasesModel) {
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
		return true && match.getObject("documentRoot").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getDocumentRoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCasesModel useCasesModel) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, useCasesModel));

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
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCasesModel, "toBeTranslatedNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, useCasesModel);
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
		UseCasesModel useCasesModel = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		DocumentRoot documentRoot = null;
		DocumentRootToUseCasesModel documentRootToUseCasesModel = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge documentRootToUseCasesModel__target__useCasesModel = null;
		EMoflonEdge documentRootToUseCasesModel__source__documentRoot = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

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
			// create object documentRoot
			documentRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();

			// create object documentRootToUseCasesModel
			documentRootToUseCasesModel = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createDocumentRootToUseCasesModel();

			// create link
			documentRootToUseCasesModel.setSource(documentRoot);

			// create link
			documentRootToUseCasesModel.setTarget(useCasesModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object documentRootToUseCasesModel is really bound
			JavaSDM.ensure(documentRootToUseCasesModel != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRoot, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRootToUseCasesModel, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModel, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// check object documentRootToUseCasesModel is really bound
			JavaSDM.ensure(documentRootToUseCasesModel != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check isomorphic binding between objects documentRootToUseCasesModel and documentRoot 
			JavaSDM.ensure(!documentRootToUseCasesModel.equals(documentRoot));

			// check isomorphic binding between objects useCasesModel and documentRoot 
			JavaSDM.ensure(!useCasesModel.equals(documentRoot));

			// check isomorphic binding between objects useCasesModel and documentRootToUseCasesModel 
			JavaSDM.ensure(!useCasesModel.equals(documentRootToUseCasesModel));

			// create object documentRootToUseCasesModel__target__useCasesModel
			documentRootToUseCasesModel__target__useCasesModel = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object documentRootToUseCasesModel__source__documentRoot
			documentRootToUseCasesModel__source__documentRoot = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("BpModelToUseCaseModelRule");
			// assign attribute documentRootToUseCasesModel__source__documentRoot
			documentRootToUseCasesModel__source__documentRoot.setName("source");
			// assign attribute documentRootToUseCasesModel__target__useCasesModel
			documentRootToUseCasesModel__target__useCasesModel
					.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRootToUseCasesModel__target__useCasesModel,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					documentRootToUseCasesModel__source__documentRoot,
					"createdEdges");

			// create link
			documentRootToUseCasesModel__source__documentRoot
					.setTrg(documentRoot);

			// create link
			documentRootToUseCasesModel__target__useCasesModel
					.setTrg(useCasesModel);

			// create link
			documentRootToUseCasesModel__source__documentRoot
					.setSrc(documentRootToUseCasesModel);

			// create link
			documentRootToUseCasesModel__target__useCasesModel
					.setSrc(documentRootToUseCasesModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, documentRoot, useCasesModel,
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
		UseCasesModel useCasesModel = null;
		IsApplicableMatch isApplicableMatch = null;
		CSP csp = null;

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
			ruleresult.setRule("BpModelToUseCaseModelRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// story node 'find context'
			try {
				fujaba__Success = false;

				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				// create object isApplicableMatch
				isApplicableMatch = TGGRuntimeFactory.eINSTANCE
						.createIsApplicableMatch();

				// create link
				isApplicableMatch.getAllContextElements().add(useCasesModel);

				// story node 'solve CSP'
				try {
					fujaba__Success = false;

					_TmpObject = (this.isApplicable_solveCsp_BWD(
							isApplicableMatch, useCasesModel));

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
								.setRuleName("BpModelToUseCaseModelRule");

						// create link
						isApplicableMatch.setIsApplicableRuleResult(ruleresult);

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			UseCasesModel useCasesModel) {
		match.registerObject("useCasesModel", useCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			UseCasesModel useCasesModel) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject documentRoot, EObject useCasesModel,
			EObject documentRootToUseCasesModel) {
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
				.getObject("useCasesModel")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getUseCasesModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_DocumentRoot_4(
			DocumentRoot documentRoot) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Match match = null;

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

			// check object documentRoot is really bound
			JavaSDM.ensure(documentRoot != null);
			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check object documentRoot is really bound
				JavaSDM.ensure(documentRoot != null);
				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, documentRoot);
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
	public EObjectContainer isAppropriate_BWD_UseCasesModel_4(
			UseCasesModel useCasesModel) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Match match = null;

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

			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, useCasesModel);
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
			RuleEntryContainer ruleEntryContainer) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		DocumentRoot documentRoot = null;
		DocumentRootToUseCasesModel documentRootToUseCasesModel = null;
		UseCasesModel useCasesModel = null;

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

		if (fujaba__Success) {
			// story node 'solve CSP'
			try {
				fujaba__Success = false;

				_TmpObject = (this.generateModel_solveCsp_BWD(
						isApplicableMatch, documentRoot, useCasesModel,
						documentRootToUseCasesModel, ruleResult));

				// ensure correct type and really bound of object csp
				JavaSDM.ensure(_TmpObject instanceof CSP);
				csp = (CSP) _TmpObject;
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'check CSP'
			fujaba__Success = this.generateModel_checkCsp_BWD(csp);
			if (fujaba__Success) {
				// story node 'perform'
				try {
					fujaba__Success = false;

					// check object ruleResult is really bound
					JavaSDM.ensure(ruleResult != null);
					// create object documentRoot
					documentRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();

					// create object documentRootToUseCasesModel
					documentRootToUseCasesModel = BpmnToUseCaseIntegrationFactory.eINSTANCE
							.createDocumentRootToUseCasesModel();

					// create object useCasesModel
					useCasesModel = UseCaseDSLFactory.eINSTANCE
							.createUseCasesModel();

					// assign attribute ruleResult
					ruleResult.setSuccess(true);

					// create link
					documentRootToUseCasesModel.setSource(documentRoot);

					// create link
					ruleResult.getSourceObjects().add(documentRoot);

					// create link
					ruleResult.getTargetObjects().add(useCasesModel);

					// create link
					documentRootToUseCasesModel.setTarget(useCasesModel);

					// create link
					ruleResult.getCorrObjects()
							.add(documentRootToUseCasesModel);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				return ruleResult;

			}

		} else {

		}
		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			DocumentRoot documentRoot, UseCasesModel useCasesModel,
			DocumentRootToUseCasesModel documentRootToUseCasesModel,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Snapshot pattern match on which CSP is solved
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return true;
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
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_DOCUMENTROOT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(DocumentRoot) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DOCUMENTROOT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(DocumentRoot) arguments.get(1));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DOCUMENTROOT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(DocumentRoot) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DOCUMENTROOT:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(DocumentRoot) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_USECASESMODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASESMODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASESMODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_FWD_DOCUMENT_ROOT_4__DOCUMENTROOT:
			return isAppropriate_FWD_DocumentRoot_4((DocumentRoot) arguments
					.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___IS_APPROPRIATE_BWD_USE_CASES_MODEL_4__USECASESMODEL:
			return isAppropriate_BWD_UseCasesModel_4((UseCasesModel) arguments
					.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DOCUMENTROOT_USECASESMODEL_DOCUMENTROOTTOUSECASESMODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(DocumentRoot) arguments.get(1),
					(UseCasesModel) arguments.get(2),
					(DocumentRootToUseCasesModel) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.BP_MODEL_TO_USE_CASE_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //BpModelToUseCaseModelRuleImpl
