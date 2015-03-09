/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

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

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UCModelToMSDModelRule;

import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;
import UseCaseToModalSequenceDiagramIntegration.UseCasesModelToModel;

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
 * An implementation of the model object '<em><b>UC Model To MSD Model Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UCModelToMSDModelRuleImpl extends AbstractRuleImpl implements
		UCModelToMSDModelRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCModelToMSDModelRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUCModelToMSDModelRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCasesModel useCasesModel) {
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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, useCasesModel));

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
			this.registerObjectsToMatch_FWD(match, useCasesModel);
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
		UseCasesModel useCasesModel = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		UseCasesModelToModel useCasesModelToModel = null;
		Model model = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge useCasesModelToModel__target__model = null;
		EMoflonEdge useCasesModelToModel__source__useCasesModel = null;

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
			JavaSDM.ensure(fujaba__Success);
			// create object useCasesModelToModel
			useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCasesModelToModel();

			// create object model
			model = ModalSequenceDiagramFactory.eINSTANCE.createModel();

			// create link
			useCasesModelToModel.setSource(useCasesModel);

			// create link
			useCasesModelToModel.setTarget(model);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check object useCasesModelToModel is really bound
			JavaSDM.ensure(useCasesModelToModel != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModel, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					model, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModelToModel, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check object useCasesModelToModel is really bound
			JavaSDM.ensure(useCasesModelToModel != null);
			// check isomorphic binding between objects useCasesModel and model 
			JavaSDM.ensure(!useCasesModel.equals(model));

			// check isomorphic binding between objects useCasesModelToModel and model 
			JavaSDM.ensure(!useCasesModelToModel.equals(model));

			// check isomorphic binding between objects useCasesModelToModel and useCasesModel 
			JavaSDM.ensure(!useCasesModelToModel.equals(useCasesModel));

			// create object useCasesModelToModel__target__model
			useCasesModelToModel__target__model = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCasesModelToModel__source__useCasesModel
			useCasesModelToModel__source__useCasesModel = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UCModelToMSDModelRule");
			// assign attribute useCasesModelToModel__source__useCasesModel
			useCasesModelToModel__source__useCasesModel.setName("source");
			// assign attribute useCasesModelToModel__target__model
			useCasesModelToModel__target__model.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModelToModel__target__model, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							useCasesModelToModel__source__useCasesModel,
							"createdEdges");

			// create link
			useCasesModelToModel__source__useCasesModel.setTrg(useCasesModel);

			// create link
			useCasesModelToModel__target__model.setTrg(model);

			// create link
			useCasesModelToModel__source__useCasesModel
					.setSrc(useCasesModelToModel);

			// create link
			useCasesModelToModel__target__model.setSrc(useCasesModelToModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, useCasesModel, model,
				useCasesModelToModel);
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
			ruleresult.setRule("UCModelToMSDModelRule");

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

					_TmpObject = (this.isApplicable_solveCsp_FWD(
							isApplicableMatch, useCasesModel));

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
						isApplicableMatch.setRuleName("UCModelToMSDModelRule");
						// assign attribute ruleresult
						ruleresult.setSuccess(true);

						// create link
						ruleresult.getIsApplicableMatch()
								.add(isApplicableMatch);

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
			UseCasesModel useCasesModel) {
		match.registerObject("useCasesModel", useCasesModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
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
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			UseCasesModel useCasesModel) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
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
	public boolean isAppropriate_BWD(Match match, Model model) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object model is really bound
			JavaSDM.ensure(model != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, model));

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
				// check object model is really bound
				JavaSDM.ensure(model != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						model, "toBeTranslatedNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object model is really bound
				JavaSDM.ensure(model != null);
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, model);
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
		Model model = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		UseCasesModel useCasesModel = null;
		UseCasesModelToModel useCasesModelToModel = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge useCasesModelToModel__source__useCasesModel = null;
		EMoflonEdge useCasesModelToModel__target__model = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("model"));

			// ensure correct type and really bound of object model
			JavaSDM.ensure(_TmpObject instanceof Model);
			model = (Model) _TmpObject;
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
			// create object useCasesModel
			useCasesModel = UseCaseDSLFactory.eINSTANCE.createUseCasesModel();

			// create object useCasesModelToModel
			useCasesModelToModel = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCasesModelToModel();

			// create link
			useCasesModelToModel.setSource(useCasesModel);

			// create link
			useCasesModelToModel.setTarget(model);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check object useCasesModelToModel is really bound
			JavaSDM.ensure(useCasesModelToModel != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					model, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModel, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModelToModel, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check object useCasesModelToModel is really bound
			JavaSDM.ensure(useCasesModelToModel != null);
			// check isomorphic binding between objects useCasesModel and model 
			JavaSDM.ensure(!useCasesModel.equals(model));

			// check isomorphic binding between objects useCasesModelToModel and model 
			JavaSDM.ensure(!useCasesModelToModel.equals(model));

			// check isomorphic binding between objects useCasesModelToModel and useCasesModel 
			JavaSDM.ensure(!useCasesModelToModel.equals(useCasesModel));

			// create object useCasesModelToModel__source__useCasesModel
			useCasesModelToModel__source__useCasesModel = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCasesModelToModel__target__model
			useCasesModelToModel__target__model = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UCModelToMSDModelRule");
			// assign attribute useCasesModelToModel__source__useCasesModel
			useCasesModelToModel__source__useCasesModel.setName("source");
			// assign attribute useCasesModelToModel__target__model
			useCasesModelToModel__target__model.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							useCasesModelToModel__source__useCasesModel,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCasesModelToModel__target__model, "createdEdges");

			// create link
			useCasesModelToModel__source__useCasesModel.setTrg(useCasesModel);

			// create link
			useCasesModelToModel__target__model.setTrg(model);

			// create link
			useCasesModelToModel__target__model.setSrc(useCasesModelToModel);

			// create link
			useCasesModelToModel__source__useCasesModel
					.setSrc(useCasesModelToModel);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, useCasesModel, model,
				useCasesModelToModel);
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
		Model model = null;
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
			ruleresult.setRule("UCModelToMSDModelRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("model"));

			// ensure correct type and really bound of object model
			JavaSDM.ensure(_TmpObject instanceof Model);
			model = (Model) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// story node 'find context'
			try {
				fujaba__Success = false;

				// check object model is really bound
				JavaSDM.ensure(model != null);
				// create object isApplicableMatch
				isApplicableMatch = TGGRuntimeFactory.eINSTANCE
						.createIsApplicableMatch();

				// create link
				isApplicableMatch.getAllContextElements().add(model);

				// story node 'solve CSP'
				try {
					fujaba__Success = false;

					_TmpObject = (this.isApplicable_solveCsp_BWD(
							isApplicableMatch, model));

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
						isApplicableMatch.setRuleName("UCModelToMSDModelRule");
						// assign attribute ruleresult
						ruleresult.setSuccess(true);

						// create link
						ruleresult.getIsApplicableMatch()
								.add(isApplicableMatch);

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
	public void registerObjectsToMatch_BWD(Match match, Model model) {
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Model model) {
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
			Model model) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("model")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_UseCasesModel_0(
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
				fujaba__Success = this.isAppropriate_FWD(match, useCasesModel);
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
	public EObjectContainer isAppropriate_BWD_Model_0(Model model) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		ModalSequenceDiagram.Package __DEC_model_packagedElement_665171 = null;
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

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_model_packagedElement_665171 = model.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) model
							.eContainer() : null;

					// check object __DEC_model_packagedElement_665171 is really bound
					JavaSDM.ensure(__DEC_model_packagedElement_665171 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_model_packagedElement_665171
							.getPackagedElement().contains(model));

					// check isomorphic binding between objects __DEC_model_packagedElement_665171 and model 
					JavaSDM.ensure(!__DEC_model_packagedElement_665171
							.equals(model));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link packagedElement from model to model
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(model, Model.class, "$eContainer")
						.contains(model)));

				// check link packagedElement from model to model
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(model, Model.class, "$eContainer")
						.contains(model)));

				// check object model is really bound
				JavaSDM.ensure(model != null);
				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, model);
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
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_MODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Model) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Model) arguments.get(1));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Model) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Model) arguments.get(1));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_FWD_USE_CASES_MODEL_0__USECASESMODEL:
			return isAppropriate_FWD_UseCasesModel_0((UseCasesModel) arguments
					.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___IS_APPROPRIATE_BWD_MODEL_0__MODEL:
			return isAppropriate_BWD_Model_0((Model) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UCModelToMSDModelRuleImpl
