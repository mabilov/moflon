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
import UseCaseToModalSequenceDiagramIntegration.Rules.UCPackageToMSDPackage;

import UseCaseToModalSequenceDiagramIntegration.StepAlternativeToInteractionOperand;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToMessage;
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
 * An implementation of the model object '<em><b>UC Package To MSD Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UCPackageToMSDPackageImpl extends AbstractRuleImpl implements
		UCPackageToMSDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCPackageToMSDPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUCPackageToMSDPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UseCasesModel useCasesModel,
			PackageDeclaration packageDeclaration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __useCasesModel_packages_packageDeclaration = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, useCasesModel,
					packageDeclaration));

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
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				// create object __useCasesModel_packages_packageDeclaration
				__useCasesModel_packages_packageDeclaration = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __useCasesModel_packages_packageDeclaration
				__useCasesModel_packages_packageDeclaration.setName("packages");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						packageDeclaration, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCasesModel_packages_packageDeclaration,
						"toBeTranslatedEdges");

				// create link
				__useCasesModel_packages_packageDeclaration
						.setSrc(useCasesModel);

				// create link
				__useCasesModel_packages_packageDeclaration
						.setTrg(packageDeclaration);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCasesModel, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, useCasesModel,
					packageDeclaration);
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
		Model model = null;
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;
		UseCasesModelToModel useCasesModelToModel = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		ModalSequenceDiagram.Package p = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge packageDeclarationToPackage__source__packageDeclaration = null;
		EMoflonEdge model__packagedElement__p = null;
		EMoflonEdge packageDeclarationToPackage__target__p = null;
		EMoflonEdge __useCasesModel_packages_packageDeclaration = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("model"));

			// ensure correct type and really bound of object model
			JavaSDM.ensure(_TmpObject instanceof Model);
			model = (Model) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCasesModelToModel"));

			// ensure correct type and really bound of object useCasesModelToModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModelToModel);
			useCasesModelToModel = (UseCasesModelToModel) _TmpObject;
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
			// create object p
			p = ModalSequenceDiagramFactory.eINSTANCE.createPackage();

			// create object packageDeclarationToPackage
			packageDeclarationToPackage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createPackageDeclarationToPackage();

			// assign attribute p
			p.setName((java.lang.String) csp.getValue("p", "name"));

			// create link
			model.getPackagedElement().add(p); // add link

			// create link
			packageDeclarationToPackage.setSource(packageDeclaration);

			// create link
			packageDeclarationToPackage.setTarget(p);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclarationToPackage, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult, p,
					"createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check object useCasesModelToModel is really bound
			JavaSDM.ensure(useCasesModelToModel != null);
			// check isomorphic binding between objects p and model 
			JavaSDM.ensure(!p.equals(model));

			// check isomorphic binding between objects packageDeclaration and model 
			JavaSDM.ensure(!packageDeclaration.equals(model));

			// check isomorphic binding between objects packageDeclarationToPackage and model 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(model));

			// check isomorphic binding between objects useCasesModel and model 
			JavaSDM.ensure(!useCasesModel.equals(model));

			// check isomorphic binding between objects useCasesModelToModel and model 
			JavaSDM.ensure(!useCasesModelToModel.equals(model));

			// check isomorphic binding between objects packageDeclaration and p 
			JavaSDM.ensure(!packageDeclaration.equals(p));

			// check isomorphic binding between objects packageDeclarationToPackage and p 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(p));

			// check isomorphic binding between objects useCasesModel and p 
			JavaSDM.ensure(!useCasesModel.equals(p));

			// check isomorphic binding between objects useCasesModelToModel and p 
			JavaSDM.ensure(!useCasesModelToModel.equals(p));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCasesModel and packageDeclaration 
			JavaSDM.ensure(!useCasesModel.equals(packageDeclaration));

			// check isomorphic binding between objects useCasesModelToModel and packageDeclaration 
			JavaSDM.ensure(!useCasesModelToModel.equals(packageDeclaration));

			// check isomorphic binding between objects useCasesModel and packageDeclarationToPackage 
			JavaSDM.ensure(!useCasesModel.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCasesModelToModel and packageDeclarationToPackage 
			JavaSDM.ensure(!useCasesModelToModel
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCasesModelToModel and useCasesModel 
			JavaSDM.ensure(!useCasesModelToModel.equals(useCasesModel));

			// create object packageDeclarationToPackage__source__packageDeclaration
			packageDeclarationToPackage__source__packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object model__packagedElement__p
			model__packagedElement__p = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclarationToPackage__target__p
			packageDeclarationToPackage__target__p = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCasesModel_packages_packageDeclaration
			__useCasesModel_packages_packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UCPackageToMSDPackage");
			// assign attribute __useCasesModel_packages_packageDeclaration
			__useCasesModel_packages_packageDeclaration.setName("packages");
			// assign attribute model__packagedElement__p
			model__packagedElement__p.setName("packagedElement");
			// assign attribute packageDeclarationToPackage__source__packageDeclaration
			packageDeclarationToPackage__source__packageDeclaration
					.setName("source");
			// assign attribute packageDeclarationToPackage__target__p
			packageDeclarationToPackage__target__p.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclarationToPackage__source__packageDeclaration,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					model__packagedElement__p, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclarationToPackage__target__p, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCasesModel_packages_packageDeclaration,
					"translatedEdges");

			// create link
			__useCasesModel_packages_packageDeclaration.setSrc(useCasesModel);

			// create link
			model__packagedElement__p.setSrc(model);

			// create link
			packageDeclarationToPackage__source__packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			__useCasesModel_packages_packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			packageDeclarationToPackage__target__p.setTrg(p);

			// create link
			model__packagedElement__p.setTrg(p);

			// create link
			packageDeclarationToPackage__target__p
					.setSrc(packageDeclarationToPackage);

			// create link
			packageDeclarationToPackage__source__packageDeclaration
					.setSrc(packageDeclarationToPackage);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, useCasesModel, model,
				useCasesModelToModel, packageDeclaration, p,
				packageDeclarationToPackage);
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
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;
		EMoflonEdge __useCasesModelToModel_source_useCasesModel = null;
		EMoflonEdge __useCasesModel_packages_packageDeclaration = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __useCasesModelToModel_target_model = null;
		CSP csp = null;
		Model model = null;
		Iterator fujaba__IterUseCasesModelToUseCasesModelToModel = null;
		UseCasesModelToModel useCasesModelToModel = null;

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
			ruleresult.setRule("UCPackageToMSDPackage");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (match.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from useCasesModel to useCasesModelToModel
			fujaba__Success = false;

			fujaba__IterUseCasesModelToUseCasesModelToModel = new ArrayList(
					org.moflon.util.eMoflonEMFUtil
							.getOppositeReference(useCasesModel,
									UseCasesModelToModel.class, "source"))
					.iterator();

			while (fujaba__IterUseCasesModelToUseCasesModelToModel.hasNext()) {
				try {
					useCasesModelToModel = (UseCasesModelToModel) fujaba__IterUseCasesModelToUseCasesModelToModel
							.next();

					// check object useCasesModelToModel is really bound
					JavaSDM.ensure(useCasesModelToModel != null);
					// bind object
					model = useCasesModelToModel.getTarget();

					// check object model is really bound
					JavaSDM.ensure(model != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object model is really bound
						JavaSDM.ensure(model != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCasesModel is really bound
						JavaSDM.ensure(useCasesModel != null);
						// check object useCasesModelToModel is really bound
						JavaSDM.ensure(useCasesModelToModel != null);
						// check link packages from packageDeclaration to useCasesModel
						JavaSDM.ensure(useCasesModel.equals(packageDeclaration
								.eContainer()));

						// check link source from useCasesModelToModel to useCasesModel
						JavaSDM.ensure(useCasesModel
								.equals(useCasesModelToModel.getSource()));

						// check link target from useCasesModelToModel to model
						JavaSDM.ensure(model.equals(useCasesModelToModel
								.getTarget()));

						// create object __useCasesModelToModel_source_useCasesModel
						__useCasesModelToModel_source_useCasesModel = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCasesModel_packages_packageDeclaration
						__useCasesModel_packages_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __useCasesModelToModel_target_model
						__useCasesModelToModel_target_model = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __useCasesModel_packages_packageDeclaration
						__useCasesModel_packages_packageDeclaration
								.setName("packages");
						// assign attribute __useCasesModelToModel_source_useCasesModel
						__useCasesModelToModel_source_useCasesModel
								.setName("source");
						// assign attribute __useCasesModelToModel_target_model
						__useCasesModelToModel_target_model.setName("target");

						// create link
						__useCasesModelToModel_source_useCasesModel
								.setTrg(useCasesModel);

						// create link
						__useCasesModel_packages_packageDeclaration
								.setSrc(useCasesModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								useCasesModel);

						// create link
						isApplicableMatch.getAllContextElements().add(model);

						// create link
						__useCasesModelToModel_target_model.setTrg(model);

						// create link
						__useCasesModelToModel_target_model
								.setSrc(useCasesModelToModel);

						// create link
						__useCasesModelToModel_source_useCasesModel
								.setSrc(useCasesModelToModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								useCasesModelToModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__useCasesModel_packages_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__useCasesModel_packages_packageDeclaration,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__useCasesModelToModel_source_useCasesModel,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__useCasesModelToModel_target_model,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, useCasesModel, model,
									useCasesModelToModel, packageDeclaration));

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
										.setRuleName("UCPackageToMSDPackage");
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
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
		match.registerObject("useCasesModel", useCasesModel);
		match.registerObject("packageDeclaration", packageDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			UseCasesModel useCasesModel, PackageDeclaration packageDeclaration) {
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
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			PackageDeclaration packageDeclaration) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", true, csp);
		var_packageDeclaration_name.setValue(packageDeclaration.getName());
		var_packageDeclaration_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_p_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"p.name", csp);
		var_p_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_packageDeclaration_name, var_p_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("useCasesModelToModel",
				useCasesModelToModel);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("packageDeclaration")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getPackageDeclaration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Model model,
			ModalSequenceDiagram.Package p) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __model_packagedElement_p = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check isomorphic binding between objects p and model 
			JavaSDM.ensure(!p.equals(model));

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, model, p));

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
				// check object p is really bound
				JavaSDM.ensure(p != null);
				// check isomorphic binding between objects p and model 
				JavaSDM.ensure(!p.equals(model));

				// create object __model_packagedElement_p
				__model_packagedElement_p = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __model_packagedElement_p
				__model_packagedElement_p.setName("packagedElement");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match, p,
						"toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__model_packagedElement_p, "toBeTranslatedEdges");

				// create link
				__model_packagedElement_p.setSrc(model);

				// create link
				__model_packagedElement_p.setTrg(p);

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
				// check object p is really bound
				JavaSDM.ensure(p != null);
				// check isomorphic binding between objects p and model 
				JavaSDM.ensure(!p.equals(model));

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						model, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, model, p);
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
		ModalSequenceDiagram.Package p = null;
		UseCasesModel useCasesModel = null;
		UseCasesModelToModel useCasesModelToModel = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge packageDeclarationToPackage__source__packageDeclaration = null;
		EMoflonEdge packageDeclarationToPackage__target__p = null;
		EMoflonEdge useCasesModel__packages__packageDeclaration = null;
		EMoflonEdge __model_packagedElement_p = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("model"));

			// ensure correct type and really bound of object model
			JavaSDM.ensure(_TmpObject instanceof Model);
			model = (Model) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("p"));

			// ensure correct type and really bound of object p
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			p = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCasesModel"));

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("useCasesModelToModel"));

			// ensure correct type and really bound of object useCasesModelToModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModelToModel);
			useCasesModelToModel = (UseCasesModelToModel) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// check isomorphic binding between objects p and model 
			JavaSDM.ensure(!p.equals(model));

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
			// create object packageDeclaration
			packageDeclaration = UseCaseDSLFactory.eINSTANCE
					.createPackageDeclaration();

			// create object packageDeclarationToPackage
			packageDeclarationToPackage = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createPackageDeclarationToPackage();

			// assign attribute packageDeclaration
			packageDeclaration.setName((java.lang.String) csp.getValue(
					"packageDeclaration", "name"));

			// create link
			packageDeclarationToPackage.setTarget(p);

			// create link
			useCasesModel.getPackages().add(packageDeclaration); // add link

			// create link
			packageDeclarationToPackage.setSource(packageDeclaration);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult, p,
					"translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclarationToPackage, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object model is really bound
			JavaSDM.ensure(model != null);
			// check object p is really bound
			JavaSDM.ensure(p != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCasesModel is really bound
			JavaSDM.ensure(useCasesModel != null);
			// check object useCasesModelToModel is really bound
			JavaSDM.ensure(useCasesModelToModel != null);
			// check isomorphic binding between objects p and model 
			JavaSDM.ensure(!p.equals(model));

			// check isomorphic binding between objects packageDeclaration and model 
			JavaSDM.ensure(!packageDeclaration.equals(model));

			// check isomorphic binding between objects packageDeclarationToPackage and model 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(model));

			// check isomorphic binding between objects useCasesModel and model 
			JavaSDM.ensure(!useCasesModel.equals(model));

			// check isomorphic binding between objects useCasesModelToModel and model 
			JavaSDM.ensure(!useCasesModelToModel.equals(model));

			// check isomorphic binding between objects packageDeclaration and p 
			JavaSDM.ensure(!packageDeclaration.equals(p));

			// check isomorphic binding between objects packageDeclarationToPackage and p 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(p));

			// check isomorphic binding between objects useCasesModel and p 
			JavaSDM.ensure(!useCasesModel.equals(p));

			// check isomorphic binding between objects useCasesModelToModel and p 
			JavaSDM.ensure(!useCasesModelToModel.equals(p));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCasesModel and packageDeclaration 
			JavaSDM.ensure(!useCasesModel.equals(packageDeclaration));

			// check isomorphic binding between objects useCasesModelToModel and packageDeclaration 
			JavaSDM.ensure(!useCasesModelToModel.equals(packageDeclaration));

			// check isomorphic binding between objects useCasesModel and packageDeclarationToPackage 
			JavaSDM.ensure(!useCasesModel.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCasesModelToModel and packageDeclarationToPackage 
			JavaSDM.ensure(!useCasesModelToModel
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCasesModelToModel and useCasesModel 
			JavaSDM.ensure(!useCasesModelToModel.equals(useCasesModel));

			// create object packageDeclarationToPackage__source__packageDeclaration
			packageDeclarationToPackage__source__packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclarationToPackage__target__p
			packageDeclarationToPackage__target__p = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCasesModel__packages__packageDeclaration
			useCasesModel__packages__packageDeclaration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __model_packagedElement_p
			__model_packagedElement_p = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UCPackageToMSDPackage");
			// assign attribute useCasesModel__packages__packageDeclaration
			useCasesModel__packages__packageDeclaration.setName("packages");
			// assign attribute __model_packagedElement_p
			__model_packagedElement_p.setName("packagedElement");
			// assign attribute packageDeclarationToPackage__source__packageDeclaration
			packageDeclarationToPackage__source__packageDeclaration
					.setName("source");
			// assign attribute packageDeclarationToPackage__target__p
			packageDeclarationToPackage__target__p.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclarationToPackage__source__packageDeclaration,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclarationToPackage__target__p, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							useCasesModel__packages__packageDeclaration,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__model_packagedElement_p, "translatedEdges");

			// create link
			useCasesModel__packages__packageDeclaration.setSrc(useCasesModel);

			// create link
			__model_packagedElement_p.setSrc(model);

			// create link
			useCasesModel__packages__packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			packageDeclarationToPackage__source__packageDeclaration
					.setTrg(packageDeclaration);

			// create link
			packageDeclarationToPackage__target__p.setTrg(p);

			// create link
			__model_packagedElement_p.setTrg(p);

			// create link
			packageDeclarationToPackage__source__packageDeclaration
					.setSrc(packageDeclarationToPackage);

			// create link
			packageDeclarationToPackage__target__p
					.setSrc(packageDeclarationToPackage);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, useCasesModel, model,
				useCasesModelToModel, packageDeclaration, p,
				packageDeclarationToPackage);
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
		ModalSequenceDiagram.Package p = null;
		EMoflonEdge __useCasesModelToModel_source_useCasesModel = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __model_packagedElement_p = null;
		EMoflonEdge __useCasesModelToModel_target_model = null;
		CSP csp = null;
		UseCasesModel useCasesModel = null;
		Iterator fujaba__IterModelToUseCasesModelToModel = null;
		UseCasesModelToModel useCasesModelToModel = null;

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
			ruleresult.setRule("UCPackageToMSDPackage");

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
			_TmpObject = (match.getObject("p"));

			// ensure correct type and really bound of object p
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			p = (ModalSequenceDiagram.Package) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check isomorphic binding between objects p and model 
			JavaSDM.ensure(!p.equals(model));

			// iterate to-many link target from model to useCasesModelToModel
			fujaba__Success = false;

			fujaba__IterModelToUseCasesModelToModel = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(model,
							UseCasesModelToModel.class, "target")).iterator();

			while (fujaba__IterModelToUseCasesModelToModel.hasNext()) {
				try {
					useCasesModelToModel = (UseCasesModelToModel) fujaba__IterModelToUseCasesModelToModel
							.next();

					// check object useCasesModelToModel is really bound
					JavaSDM.ensure(useCasesModelToModel != null);
					// bind object
					useCasesModel = useCasesModelToModel.getSource();

					// check object useCasesModel is really bound
					JavaSDM.ensure(useCasesModel != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object model is really bound
						JavaSDM.ensure(model != null);
						// check object p is really bound
						JavaSDM.ensure(p != null);
						// check object useCasesModel is really bound
						JavaSDM.ensure(useCasesModel != null);
						// check object useCasesModelToModel is really bound
						JavaSDM.ensure(useCasesModelToModel != null);
						// check isomorphic binding between objects p and model 
						JavaSDM.ensure(!p.equals(model));

						// check link packagedElement from p to model
						JavaSDM.ensure(model.equals(p.eContainer()));

						// check link source from useCasesModelToModel to useCasesModel
						JavaSDM.ensure(useCasesModel
								.equals(useCasesModelToModel.getSource()));

						// check link target from useCasesModelToModel to model
						JavaSDM.ensure(model.equals(useCasesModelToModel
								.getTarget()));

						// create object __useCasesModelToModel_source_useCasesModel
						__useCasesModelToModel_source_useCasesModel = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __model_packagedElement_p
						__model_packagedElement_p = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCasesModelToModel_target_model
						__useCasesModelToModel_target_model = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __model_packagedElement_p
						__model_packagedElement_p.setName("packagedElement");
						// assign attribute __useCasesModelToModel_source_useCasesModel
						__useCasesModelToModel_source_useCasesModel
								.setName("source");
						// assign attribute __useCasesModelToModel_target_model
						__useCasesModelToModel_target_model.setName("target");

						// create link
						__useCasesModelToModel_source_useCasesModel
								.setTrg(useCasesModel);

						// create link
						isApplicableMatch.getAllContextElements().add(
								useCasesModel);

						// create link
						__model_packagedElement_p.setSrc(model);

						// create link
						isApplicableMatch.getAllContextElements().add(model);

						// create link
						__useCasesModelToModel_target_model.setTrg(model);

						// create link
						isApplicableMatch.getAllContextElements().add(
								useCasesModelToModel);

						// create link
						__useCasesModelToModel_source_useCasesModel
								.setSrc(useCasesModelToModel);

						// create link
						__useCasesModelToModel_target_model
								.setSrc(useCasesModelToModel);

						// create link
						isApplicableMatch.getAllContextElements().add(p);

						// create link
						__model_packagedElement_p.setTrg(p);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __model_packagedElement_p,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__useCasesModelToModel_source_useCasesModel,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__useCasesModelToModel_target_model,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, useCasesModel, model,
									useCasesModelToModel, p));

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
										.setRuleName("UCPackageToMSDPackage");
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
	public void registerObjectsToMatch_BWD(Match match, Model model,
			ModalSequenceDiagram.Package p) {
		match.registerObject("model", model);
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Model model,
			ModalSequenceDiagram.Package p) {
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
			UseCasesModel useCasesModel, Model model,
			UseCasesModelToModel useCasesModelToModel,
			ModalSequenceDiagram.Package p) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_p_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"p.name", true, csp);
		var_p_name.setValue(p.getName());
		var_p_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_packageDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("packageDeclaration.name", csp);
		var_packageDeclaration_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_packageDeclaration_name, var_p_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCasesModel", useCasesModel);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("useCasesModelToModel",
				useCasesModelToModel);
		isApplicableMatch.registerObject("p", p);
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
			EObject useCasesModel, EObject model, EObject useCasesModelToModel,
			EObject packageDeclaration, EObject p,
			EObject packageDeclarationToPackage) {
		ruleresult.registerObject("useCasesModel", useCasesModel);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("useCasesModelToModel", useCasesModelToModel);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("p")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_74(
			EMoflonEdge _edge_packages) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCasesModel __DEC_packageDeclaration_packages_959138 = null;
		Match match = null;
		PackageDeclaration packageDeclaration = null;
		UseCasesModel useCasesModel = null;

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

			// check object _edge_packages is really bound
			JavaSDM.ensure(_edge_packages != null);
			// bind object
			_TmpObject = _edge_packages.getSrc();

			// ensure correct type and really bound of object useCasesModel
			JavaSDM.ensure(_TmpObject instanceof UseCasesModel);
			useCasesModel = (UseCasesModel) _TmpObject;

			// bind object
			_TmpObject = _edge_packages.getTrg();

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;

			// check link packages from packageDeclaration to useCasesModel
			JavaSDM.ensure(useCasesModel.equals(packageDeclaration.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_packageDeclaration_packages_959138 = packageDeclaration
							.eContainer() instanceof UseCasesModel ? (UseCasesModel) packageDeclaration
							.eContainer() : null;

					// check object __DEC_packageDeclaration_packages_959138 is really bound
					JavaSDM.ensure(__DEC_packageDeclaration_packages_959138 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_packageDeclaration_packages_959138
							.getPackages().contains(packageDeclaration));

					// check isomorphic binding between objects __DEC_packageDeclaration_packages_959138 and useCasesModel 
					JavaSDM.ensure(!__DEC_packageDeclaration_packages_959138
							.equals(useCasesModel));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_packages is really bound
				JavaSDM.ensure(_edge_packages != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCasesModel is really bound
				JavaSDM.ensure(useCasesModel != null);
				// check link packages from packageDeclaration to useCasesModel
				JavaSDM.ensure(useCasesModel.equals(packageDeclaration
						.eContainer()));

				// check link src from _edge_packages to useCasesModel
				JavaSDM.ensure(useCasesModel.equals(_edge_packages.getSrc()));

				// check link trg from _edge_packages to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(_edge_packages
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, useCasesModel,
						packageDeclaration);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_322(
			EMoflonEdge _edge_packagedElement) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		ModalSequenceDiagram.Package __DEC_p_packagedElement_920677 = null;
		Match match = null;
		ModalSequenceDiagram.Package p = null;
		Model model = null;

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

			// check object _edge_packagedElement is really bound
			JavaSDM.ensure(_edge_packagedElement != null);
			// bind object
			_TmpObject = _edge_packagedElement.getSrc();

			// ensure correct type and really bound of object model
			JavaSDM.ensure(_TmpObject instanceof Model);
			model = (Model) _TmpObject;

			// bind object
			_TmpObject = _edge_packagedElement.getTrg();

			// ensure correct type and really bound of object p
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			p = (ModalSequenceDiagram.Package) _TmpObject;

			// check isomorphic binding between objects p and model 
			JavaSDM.ensure(!p.equals(model));

			// check link packagedElement from p to model
			JavaSDM.ensure(model.equals(p.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_p_packagedElement_920677 = p.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) p
							.eContainer() : null;

					// check object __DEC_p_packagedElement_920677 is really bound
					JavaSDM.ensure(__DEC_p_packagedElement_920677 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_p_packagedElement_920677
							.getPackagedElement().contains(p));

					// check isomorphic binding between objects __DEC_p_packagedElement_920677 and model 
					JavaSDM.ensure(!__DEC_p_packagedElement_920677
							.equals(model));

					// check isomorphic binding between objects __DEC_p_packagedElement_920677 and p 
					JavaSDM.ensure(!__DEC_p_packagedElement_920677.equals(p));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link packagedElement from p to p
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(p,
								ModalSequenceDiagram.Package.class,
								"$eContainer").contains(p)));

				// check link packagedElement from p to p
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(p,
								ModalSequenceDiagram.Package.class,
								"$eContainer").contains(p)));

				// check object _edge_packagedElement is really bound
				JavaSDM.ensure(_edge_packagedElement != null);
				// check object model is really bound
				JavaSDM.ensure(model != null);
				// check object p is really bound
				JavaSDM.ensure(p != null);
				// check isomorphic binding between objects p and model 
				JavaSDM.ensure(!p.equals(model));

				// check link packagedElement from p to model
				JavaSDM.ensure(model.equals(p.eContainer()));

				// check link src from _edge_packagedElement to model
				JavaSDM.ensure(model.equals(_edge_packagedElement.getSrc()));

				// check link trg from _edge_packagedElement to p
				JavaSDM.ensure(p.equals(_edge_packagedElement.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, model, p);
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
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_USECASESMODEL_PACKAGEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(UseCasesModel) arguments.get(1),
					(PackageDeclaration) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGEDECLARATION:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1), (Model) arguments.get(2),
					(UseCasesModelToModel) arguments.get(3),
					(PackageDeclaration) arguments.get(4));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD__MATCH_MODEL_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Model) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Model) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Model) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASESMODEL_MODEL_USECASESMODELTOMODEL_PACKAGE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(UseCasesModel) arguments.get(1), (Model) arguments.get(2),
					(UseCasesModelToModel) arguments.get(3),
					(ModalSequenceDiagram.Package) arguments.get(4));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_74__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_74((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_322__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_322((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UCPackageToMSDPackageImpl
