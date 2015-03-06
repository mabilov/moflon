/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Collaboration;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.Model;

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

import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToCollaborationRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToCollaboration;
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
 * An implementation of the model object '<em><b>Use Case To Collaboration Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UseCaseToCollaborationRuleImpl extends AbstractRuleImpl implements
		UseCaseToCollaborationRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseToCollaborationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.USE_CASE_TO_COLLABORATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match,
					packageDeclaration, useCase));

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
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "toBeTranslatedNodes");

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

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
			this.registerObjectsToMatch_FWD(match, packageDeclaration, useCase);
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
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclarationToPackage_source_packageDeclaration = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclarationToPackage_target__package = null;
		CSP csp = null;
		ModalSequenceDiagram.Package _package = null;
		Iterator fujaba__IterPackageDeclarationToPackageDeclarationToPackage = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;

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
			ruleresult.setRule("UseCaseToCollaborationRule");

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
			_TmpObject = (match.getObject("useCase"));

			// ensure correct type and really bound of object useCase
			JavaSDM.ensure(_TmpObject instanceof UseCase);
			useCase = (UseCase) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from packageDeclaration to packageDeclarationToPackage
			fujaba__Success = false;

			fujaba__IterPackageDeclarationToPackageDeclarationToPackage = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							packageDeclaration,
							PackageDeclarationToPackage.class, "source"))
					.iterator();

			while (fujaba__IterPackageDeclarationToPackageDeclarationToPackage
					.hasNext()) {
				try {
					packageDeclarationToPackage = (PackageDeclarationToPackage) fujaba__IterPackageDeclarationToPackageDeclarationToPackage
							.next();

					// check object packageDeclarationToPackage is really bound
					JavaSDM.ensure(packageDeclarationToPackage != null);
					// bind object
					_package = packageDeclarationToPackage.getTarget();

					// check object _package is really bound
					JavaSDM.ensure(_package != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToPackage is really bound
						JavaSDM.ensure(packageDeclarationToPackage != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link source from packageDeclarationToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToPackage.getSource()));

						// check link target from packageDeclarationToPackage to _package
						JavaSDM.ensure(_package
								.equals(packageDeclarationToPackage.getTarget()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase
								.setName("useCases");
						// assign attribute __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration
								.setName("source");
						// assign attribute __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package
								.setName("target");

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						__packageDeclaration_useCases_useCase
								.setSrc(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setTrg(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setSrc(packageDeclarationToPackage);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						__packageDeclaration_useCases_useCase.setTrg(useCase);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__packageDeclarationToPackage_source_packageDeclaration,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclaration_useCases_useCase,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, packageDeclaration,
									_package, packageDeclarationToPackage,
									useCase));

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
										.setRuleName("UseCaseToCollaborationRule");

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		ModalSequenceDiagram.Package _package = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Collaboration collaboration = null;
		UseCaseToCollaboration useCaseToCollaboration = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge useCaseToCollaboration__target__collaboration = null;
		EMoflonEdge _package__packagedElement__collaboration = null;
		EMoflonEdge useCaseToCollaboration__source__useCase = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("packageDeclarationToPackage"));

			// ensure correct type and really bound of object packageDeclarationToPackage
			JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
			packageDeclarationToPackage = (PackageDeclarationToPackage) _TmpObject;
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
			// create object collaboration
			collaboration = ModalSequenceDiagramFactory.eINSTANCE
					.createCollaboration();

			// create object useCaseToCollaboration
			useCaseToCollaboration = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCaseToCollaboration();

			// assign attribute collaboration
			collaboration.setName((java.lang.String) csp.getAttributeVariable(
					"collaboration", "name").getValue());

			// create link
			_package.getPackagedElement().add(collaboration); // add link

			// create link
			useCaseToCollaboration.setSource(useCase);

			// create link
			useCaseToCollaboration.setTarget(collaboration);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object collaboration is really bound
			JavaSDM.ensure(collaboration != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToCollaboration is really bound
			JavaSDM.ensure(useCaseToCollaboration != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToCollaboration, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					collaboration, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object collaboration is really bound
			JavaSDM.ensure(collaboration != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToCollaboration is really bound
			JavaSDM.ensure(useCaseToCollaboration != null);
			// check isomorphic binding between objects collaboration and _package 
			JavaSDM.ensure(!collaboration.equals(_package));

			// check isomorphic binding between objects packageDeclaration and _package 
			JavaSDM.ensure(!packageDeclaration.equals(_package));

			// check isomorphic binding between objects packageDeclarationToPackage and _package 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(_package));

			// check isomorphic binding between objects useCase and _package 
			JavaSDM.ensure(!useCase.equals(_package));

			// check isomorphic binding between objects useCaseToCollaboration and _package 
			JavaSDM.ensure(!useCaseToCollaboration.equals(_package));

			// check isomorphic binding between objects packageDeclaration and collaboration 
			JavaSDM.ensure(!packageDeclaration.equals(collaboration));

			// check isomorphic binding between objects packageDeclarationToPackage and collaboration 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(collaboration));

			// check isomorphic binding between objects useCase and collaboration 
			JavaSDM.ensure(!useCase.equals(collaboration));

			// check isomorphic binding between objects useCaseToCollaboration and collaboration 
			JavaSDM.ensure(!useCaseToCollaboration.equals(collaboration));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToCollaboration and packageDeclaration 
			JavaSDM.ensure(!useCaseToCollaboration.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToCollaboration and packageDeclarationToPackage 
			JavaSDM.ensure(!useCaseToCollaboration
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToCollaboration and useCase 
			JavaSDM.ensure(!useCaseToCollaboration.equals(useCase));

			// create object __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToCollaboration__target__collaboration
			useCaseToCollaboration__target__collaboration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object _package__packagedElement__collaboration
			_package__packagedElement__collaboration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToCollaboration__source__useCase
			useCaseToCollaboration__source__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCaseToCollaborationRule");
			// assign attribute __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase.setName("useCases");
			// assign attribute _package__packagedElement__collaboration
			_package__packagedElement__collaboration.setName("packagedElement");
			// assign attribute useCaseToCollaboration__source__useCase
			useCaseToCollaboration__source__useCase.setName("source");
			// assign attribute useCaseToCollaboration__target__collaboration
			useCaseToCollaboration__target__collaboration.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_useCases_useCase, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToCollaboration__target__collaboration,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					_package__packagedElement__collaboration, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToCollaboration__source__useCase, "createdEdges");

			// create link
			__packageDeclaration_useCases_useCase.setSrc(packageDeclaration);

			// create link
			_package__packagedElement__collaboration.setSrc(_package);

			// create link
			__packageDeclaration_useCases_useCase.setTrg(useCase);

			// create link
			useCaseToCollaboration__source__useCase.setTrg(useCase);

			// create link
			useCaseToCollaboration__target__collaboration.setTrg(collaboration);

			// create link
			_package__packagedElement__collaboration.setTrg(collaboration);

			// create link
			useCaseToCollaboration__source__useCase
					.setSrc(useCaseToCollaboration);

			// create link
			useCaseToCollaboration__target__collaboration
					.setSrc(useCaseToCollaboration);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, collaboration,
				useCaseToCollaboration);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase) {
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
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", true, csp);
		var_useCase_name.setValue(useCase.getName());
		var_useCase_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_collaboration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("collaboration.name", csp);
		var_collaboration_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_collaboration_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
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
			EObject packageDeclaration, EObject _package,
			EObject packageDeclarationToPackage, EObject useCase,
			EObject collaboration, EObject useCaseToCollaboration) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("collaboration", collaboration);
		ruleresult.registerObject("useCaseToCollaboration",
				useCaseToCollaboration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("useCase").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getUseCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			ModalSequenceDiagram.Package _package, Collaboration collaboration) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge ___package_packagedElement_collaboration = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object collaboration is really bound
			JavaSDM.ensure(collaboration != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, _package,
					collaboration));

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

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object collaboration is really bound
				JavaSDM.ensure(collaboration != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// create object ___package_packagedElement_collaboration
				___package_packagedElement_collaboration = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute ___package_packagedElement_collaboration
				___package_packagedElement_collaboration
						.setName("packagedElement");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						collaboration, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						___package_packagedElement_collaboration,
						"toBeTranslatedEdges");

				// create link
				___package_packagedElement_collaboration.setSrc(_package);

				// create link
				___package_packagedElement_collaboration.setTrg(collaboration);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object collaboration is really bound
				JavaSDM.ensure(collaboration != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						_package, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, _package, collaboration);
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
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		ModalSequenceDiagram.Package _package = null;
		Collaboration collaboration = null;
		EMoflonEdge __packageDeclarationToPackage_source_packageDeclaration = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclarationToPackage_target__package = null;
		EMoflonEdge ___package_packagedElement_collaboration = null;
		CSP csp = null;
		PackageDeclaration packageDeclaration = null;
		Iterator fujaba__Iter_packageToPackageDeclarationToPackage = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;

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
			ruleresult.setRule("UseCaseToCollaborationRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (match.getObject("collaboration"));

			// ensure correct type and really bound of object collaboration
			JavaSDM.ensure(_TmpObject instanceof Collaboration);
			collaboration = (Collaboration) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link target from _package to packageDeclarationToPackage
			fujaba__Success = false;

			fujaba__Iter_packageToPackageDeclarationToPackage = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(
							_package, PackageDeclarationToPackage.class,
							"target")).iterator();

			while (fujaba__Iter_packageToPackageDeclarationToPackage.hasNext()) {
				try {
					packageDeclarationToPackage = (PackageDeclarationToPackage) fujaba__Iter_packageToPackageDeclarationToPackage
							.next();

					// check object packageDeclarationToPackage is really bound
					JavaSDM.ensure(packageDeclarationToPackage != null);
					// bind object
					packageDeclaration = packageDeclarationToPackage
							.getSource();

					// check object packageDeclaration is really bound
					JavaSDM.ensure(packageDeclaration != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object _package is really bound
						JavaSDM.ensure(_package != null);
						// check object collaboration is really bound
						JavaSDM.ensure(collaboration != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToPackage is really bound
						JavaSDM.ensure(packageDeclarationToPackage != null);
						// check link packagedElement from collaboration to _package
						JavaSDM.ensure(_package.equals(collaboration
								.eContainer()));

						// check link source from packageDeclarationToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToPackage.getSource()));

						// check link target from packageDeclarationToPackage to _package
						JavaSDM.ensure(_package
								.equals(packageDeclarationToPackage.getTarget()));

						// create object __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object ___package_packagedElement_collaboration
						___package_packagedElement_collaboration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute ___package_packagedElement_collaboration
						___package_packagedElement_collaboration
								.setName("packagedElement");
						// assign attribute __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration
								.setName("source");
						// assign attribute __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package
								.setName("target");

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setTrg(packageDeclaration);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclaration);

						// create link
						__packageDeclarationToPackage_target__package
								.setTrg(_package);

						// create link
						___package_packagedElement_collaboration
								.setSrc(_package);

						// create link
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						__packageDeclarationToPackage_target__package
								.setSrc(packageDeclarationToPackage);

						// create link
						isApplicableMatch.getAllContextElements().add(
								packageDeclarationToPackage);

						// create link
						__packageDeclarationToPackage_source_packageDeclaration
								.setSrc(packageDeclarationToPackage);

						// create link
						___package_packagedElement_collaboration
								.setTrg(collaboration);

						// create link
						isApplicableMatch.getAllContextElements().add(
								collaboration);

						// create link
						org.moflon.util.eMoflonEMFUtil
								.addOppositeReference(
										isApplicableMatch,
										__packageDeclarationToPackage_source_packageDeclaration,
										"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								___package_packagedElement_collaboration,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, packageDeclaration,
									_package, packageDeclarationToPackage,
									collaboration));

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
										.setRuleName("UseCaseToCollaborationRule");

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

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		ModalSequenceDiagram.Package _package = null;
		Collaboration collaboration = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		UseCase useCase = null;
		UseCaseToCollaboration useCaseToCollaboration = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge ___package_packagedElement_collaboration = null;
		EMoflonEdge packageDeclaration__useCases__useCase = null;
		EMoflonEdge useCaseToCollaboration__target__collaboration = null;
		EMoflonEdge useCaseToCollaboration__source__useCase = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("collaboration"));

			// ensure correct type and really bound of object collaboration
			JavaSDM.ensure(_TmpObject instanceof Collaboration);
			collaboration = (Collaboration) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("packageDeclaration"));

			// ensure correct type and really bound of object packageDeclaration
			JavaSDM.ensure(_TmpObject instanceof PackageDeclaration);
			packageDeclaration = (PackageDeclaration) _TmpObject;
			_TmpObject = (isApplicableMatch
					.getObject("packageDeclarationToPackage"));

			// ensure correct type and really bound of object packageDeclarationToPackage
			JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
			packageDeclarationToPackage = (PackageDeclarationToPackage) _TmpObject;
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
			// create object useCase
			useCase = UseCaseDSLFactory.eINSTANCE.createUseCase();

			// create object useCaseToCollaboration
			useCaseToCollaboration = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCaseToCollaboration();

			// assign attribute useCase
			useCase.setName((java.lang.String) csp.getAttributeVariable(
					"useCase", "name").getValue());

			// create link
			useCaseToCollaboration.setTarget(collaboration);

			// create link
			packageDeclaration.getUseCases().add(useCase); // add link

			// create link
			useCaseToCollaboration.setSource(useCase);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object collaboration is really bound
			JavaSDM.ensure(collaboration != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToCollaboration is really bound
			JavaSDM.ensure(useCaseToCollaboration != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					collaboration, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToCollaboration, "createdLinkElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object collaboration is really bound
			JavaSDM.ensure(collaboration != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToCollaboration is really bound
			JavaSDM.ensure(useCaseToCollaboration != null);
			// check isomorphic binding between objects collaboration and _package 
			JavaSDM.ensure(!collaboration.equals(_package));

			// check isomorphic binding between objects packageDeclaration and _package 
			JavaSDM.ensure(!packageDeclaration.equals(_package));

			// check isomorphic binding between objects packageDeclarationToPackage and _package 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(_package));

			// check isomorphic binding between objects useCase and _package 
			JavaSDM.ensure(!useCase.equals(_package));

			// check isomorphic binding between objects useCaseToCollaboration and _package 
			JavaSDM.ensure(!useCaseToCollaboration.equals(_package));

			// check isomorphic binding between objects packageDeclaration and collaboration 
			JavaSDM.ensure(!packageDeclaration.equals(collaboration));

			// check isomorphic binding between objects packageDeclarationToPackage and collaboration 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(collaboration));

			// check isomorphic binding between objects useCase and collaboration 
			JavaSDM.ensure(!useCase.equals(collaboration));

			// check isomorphic binding between objects useCaseToCollaboration and collaboration 
			JavaSDM.ensure(!useCaseToCollaboration.equals(collaboration));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToCollaboration and packageDeclaration 
			JavaSDM.ensure(!useCaseToCollaboration.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToCollaboration and packageDeclarationToPackage 
			JavaSDM.ensure(!useCaseToCollaboration
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToCollaboration and useCase 
			JavaSDM.ensure(!useCaseToCollaboration.equals(useCase));

			// create object ___package_packagedElement_collaboration
			___package_packagedElement_collaboration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToCollaboration__target__collaboration
			useCaseToCollaboration__target__collaboration = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToCollaboration__source__useCase
			useCaseToCollaboration__source__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCaseToCollaborationRule");
			// assign attribute packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase.setName("useCases");
			// assign attribute ___package_packagedElement_collaboration
			___package_packagedElement_collaboration.setName("packagedElement");
			// assign attribute useCaseToCollaboration__source__useCase
			useCaseToCollaboration__source__useCase.setName("source");
			// assign attribute useCaseToCollaboration__target__collaboration
			useCaseToCollaboration__target__collaboration.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							___package_packagedElement_collaboration,
							"translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__useCases__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToCollaboration__target__collaboration,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToCollaboration__source__useCase, "createdEdges");

			// create link
			packageDeclaration__useCases__useCase.setSrc(packageDeclaration);

			// create link
			___package_packagedElement_collaboration.setSrc(_package);

			// create link
			useCaseToCollaboration__source__useCase.setTrg(useCase);

			// create link
			packageDeclaration__useCases__useCase.setTrg(useCase);

			// create link
			___package_packagedElement_collaboration.setTrg(collaboration);

			// create link
			useCaseToCollaboration__target__collaboration.setTrg(collaboration);

			// create link
			useCaseToCollaboration__source__useCase
					.setSrc(useCaseToCollaboration);

			// create link
			useCaseToCollaboration__target__collaboration
					.setSrc(useCaseToCollaboration);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, collaboration,
				useCaseToCollaboration);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			ModalSequenceDiagram.Package _package, Collaboration collaboration) {
		match.registerObject("_package", _package);
		match.registerObject("collaboration", collaboration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			ModalSequenceDiagram.Package _package, Collaboration collaboration) {
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
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			Collaboration collaboration) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_collaboration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("collaboration.name", true, csp);
		var_collaboration_name.setValue(collaboration.getName());
		var_collaboration_name.setType("");

		// Create explicit parameters

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_collaboration_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("collaboration", collaboration);
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
			EObject packageDeclaration, EObject _package,
			EObject packageDeclarationToPackage, EObject useCase,
			EObject collaboration, EObject useCaseToCollaboration) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("collaboration", collaboration);
		ruleresult.registerObject("useCaseToCollaboration",
				useCaseToCollaboration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("collaboration")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getCollaboration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(
			EMoflonEdge _edge_useCases) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		PackageDeclaration __DEC_useCase_useCases_65977 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_useCase_useCases_65977 = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
							.eContainer() : null;

					// check object __DEC_useCase_useCases_65977 is really bound
					JavaSDM.ensure(__DEC_useCase_useCases_65977 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_useCase_useCases_65977.getUseCases()
							.contains(useCase));

					// check isomorphic binding between objects __DEC_useCase_useCases_65977 and packageDeclaration 
					JavaSDM.ensure(!__DEC_useCase_useCases_65977
							.equals(packageDeclaration));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_useCases is really bound
				JavaSDM.ensure(_edge_useCases != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link src from _edge_useCases to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(_edge_useCases
						.getSrc()));

				// check link trg from _edge_useCases to useCase
				JavaSDM.ensure(useCase.equals(_edge_useCases.getTrg()));

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match,
						packageDeclaration, useCase);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_5(
			EMoflonEdge _edge_packagedElement) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		ModalSequenceDiagram.Package __DEC_collaboration_packagedElement_39140 = null;
		Match match = null;
		Collaboration collaboration = null;
		ModalSequenceDiagram.Package _package = null;

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

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;

			// bind object
			_TmpObject = _edge_packagedElement.getTrg();

			// ensure correct type and really bound of object collaboration
			JavaSDM.ensure(_TmpObject instanceof Collaboration);
			collaboration = (Collaboration) _TmpObject;

			// check link packagedElement from collaboration to _package
			JavaSDM.ensure(_package.equals(collaboration.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_collaboration_packagedElement_39140 = collaboration
							.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) collaboration
							.eContainer() : null;

					// check object __DEC_collaboration_packagedElement_39140 is really bound
					JavaSDM.ensure(__DEC_collaboration_packagedElement_39140 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_collaboration_packagedElement_39140
							.getPackagedElement().contains(collaboration));

					// check isomorphic binding between objects __DEC_collaboration_packagedElement_39140 and _package 
					JavaSDM.ensure(!__DEC_collaboration_packagedElement_39140
							.equals(_package));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_packagedElement is really bound
				JavaSDM.ensure(_edge_packagedElement != null);
				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object collaboration is really bound
				JavaSDM.ensure(collaboration != null);
				// check link packagedElement from collaboration to _package
				JavaSDM.ensure(_package.equals(collaboration.eContainer()));

				// check link src from _edge_packagedElement to _package
				JavaSDM.ensure(_package.equals(_edge_packagedElement.getSrc()));

				// check link trg from _edge_packagedElement to collaboration
				JavaSDM.ensure(collaboration.equals(_edge_packagedElement
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, _package,
						collaboration);
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
			RuleEntryContainer ruleEntryContainer,
			PackageDeclarationToPackage packageDeclarationToPackageDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		UseCase useCase = null;
		Collaboration collaboration = null;
		UseCaseToCollaboration useCaseToCollaboration = null;
		ModalSequenceDiagram.Package _package = null;
		PackageDeclaration packageDeclaration = null;
		Iterator fujaba__IterPackageDeclarationToPackageListToPackageDeclarationToPackage = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		Iterator fujaba__IterRuleEntryContainerToPackageDeclarationToPackageList = null;
		RuleEntryList packageDeclarationToPackageList = null;

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
			// iterate to-many link ruleEntryList from ruleEntryContainer to packageDeclarationToPackageList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToPackageDeclarationToPackageList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToPackageDeclarationToPackageList
					.hasNext()) {
				try {
					packageDeclarationToPackageList = (RuleEntryList) fujaba__IterRuleEntryContainerToPackageDeclarationToPackageList
							.next();

					// check object packageDeclarationToPackageList is really bound
					JavaSDM.ensure(packageDeclarationToPackageList != null);
					// iterate to-many link entryObjects from packageDeclarationToPackageList to packageDeclarationToPackage
					fujaba__Success = false;

					fujaba__IterPackageDeclarationToPackageListToPackageDeclarationToPackage = new ArrayList(
							packageDeclarationToPackageList.getEntryObjects())
							.iterator();

					while (fujaba__IterPackageDeclarationToPackageListToPackageDeclarationToPackage
							.hasNext()) {
						try {
							_TmpObject = fujaba__IterPackageDeclarationToPackageListToPackageDeclarationToPackage
									.next();

							// ensure correct type and really bound of object packageDeclarationToPackage
							JavaSDM.ensure(_TmpObject instanceof PackageDeclarationToPackage);
							packageDeclarationToPackage = (PackageDeclarationToPackage) _TmpObject;
							// bind object
							packageDeclaration = packageDeclarationToPackage
									.getSource();

							// check object packageDeclaration is really bound
							JavaSDM.ensure(packageDeclaration != null);

							// bind object
							_package = packageDeclarationToPackage.getTarget();

							// check object _package is really bound
							JavaSDM.ensure(_package != null);

							// story node 'solve CSP'
							try {
								fujaba__Success = false;

								_TmpObject = (this.generateModel_solveCsp_BWD(
										isApplicableMatch, packageDeclaration,
										_package, packageDeclarationToPackage,
										useCase, collaboration,
										useCaseToCollaboration, ruleResult));

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

									// check object _package is really bound
									JavaSDM.ensure(_package != null);
									// check object packageDeclaration is really bound
									JavaSDM.ensure(packageDeclaration != null);
									// check object packageDeclarationToPackage is really bound
									JavaSDM.ensure(packageDeclarationToPackage != null);
									// check object ruleResult is really bound
									JavaSDM.ensure(ruleResult != null);
									// create object useCase
									useCase = UseCaseDSLFactory.eINSTANCE
											.createUseCase();

									// create object collaboration
									collaboration = ModalSequenceDiagramFactory.eINSTANCE
											.createCollaboration();

									// create object useCaseToCollaboration
									useCaseToCollaboration = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
											.createUseCaseToCollaboration();

									// assign attribute useCase
									useCase.setName((java.lang.String) csp
											.getAttributeVariable("useCase",
													"name").getValue());
									// assign attribute collaboration
									collaboration
											.setName((java.lang.String) csp
													.getAttributeVariable(
															"collaboration",
															"name").getValue());
									// assign attribute ruleResult
									ruleResult.setSuccess(true);

									// create link
									packageDeclaration.getUseCases().add(
											useCase); // add link

									// create link
									_package.getPackagedElement().add(
											collaboration); // add link

									// create link
									ruleResult.getSourceObjects().add(useCase);

									// create link
									useCaseToCollaboration.setSource(useCase);

									// create link
									useCaseToCollaboration
											.setTarget(collaboration);

									// create link
									ruleResult.getTargetObjects().add(
											collaboration);

									// create link
									ruleResult.getCorrObjects().add(
											useCaseToCollaboration);

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

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			PackageDeclaration packageDeclaration,
			ModalSequenceDiagram.Package _package,
			PackageDeclarationToPackage packageDeclarationToPackage,
			UseCase useCase, Collaboration collaboration,
			UseCaseToCollaboration useCaseToCollaboration,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_useCase_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"useCase.name", csp);
		var_useCase_name.setType("");
		Variable var_collaboration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("collaboration.name", csp);
		var_collaboration_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_collaboration_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
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
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2));
			return null;
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_COLLABORATION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Collaboration) arguments.get(2));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_COLLABORATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Collaboration) arguments.get(2));
			return null;
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_COLLABORATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Collaboration) arguments.get(2));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_COLLABORATION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Collaboration) arguments.get(4));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(PackageDeclarationToPackage) arguments.get(1));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_COLLABORATION_USECASETOCOLLABORATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4),
					(Collaboration) arguments.get(5),
					(UseCaseToCollaboration) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.USE_CASE_TO_COLLABORATION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCaseToCollaborationRuleImpl
