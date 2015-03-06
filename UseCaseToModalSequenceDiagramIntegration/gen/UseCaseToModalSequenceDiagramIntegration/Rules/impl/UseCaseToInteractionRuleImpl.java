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
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToCombinedFragment;
import UseCaseToModalSequenceDiagramIntegration.NormalStepToMessage;
import UseCaseToModalSequenceDiagramIntegration.PackageDeclarationToPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UseCaseToInteractionRule;

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
 * An implementation of the model object '<em><b>Use Case To Interaction Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UseCaseToInteractionRuleImpl extends AbstractRuleImpl implements
		UseCaseToInteractionRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseToInteractionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUseCaseToInteractionRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_basicFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

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

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match,
					packageDeclaration, useCase, basicFlow));

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

				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// create object __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __useCase_flows_basicFlow
				__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __packageDeclaration_useCases_useCase
				__packageDeclaration_useCases_useCase.setName("useCases");
				// assign attribute __useCase_flows_basicFlow
				__useCase_flows_basicFlow.setName("flows");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__packageDeclaration_useCases_useCase,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						useCase, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__useCase_flows_basicFlow, "toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						basicFlow, "toBeTranslatedNodes");

				// create link
				__packageDeclaration_useCases_useCase
						.setSrc(packageDeclaration);

				// create link
				__useCase_flows_basicFlow.setSrc(useCase);

				// create link
				__packageDeclaration_useCases_useCase.setTrg(useCase);

				// create link
				__useCase_flows_basicFlow.setTrg(basicFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

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
			this.registerObjectsToMatch_FWD(match, packageDeclaration, useCase,
					basicFlow);
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
		BasicFlow basicFlow = null;
		PackageDeclaration packageDeclaration = null;
		UseCase useCase = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __packageDeclarationToPackage_source_packageDeclaration = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclarationToPackage_target__package = null;
		EMoflonEdge __useCase_flows_basicFlow = null;
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
			ruleresult.setRule("UseCaseToInteractionRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

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
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToPackage is really bound
						JavaSDM.ensure(packageDeclarationToPackage != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link source from packageDeclarationToPackage to packageDeclaration
						JavaSDM.ensure(packageDeclaration
								.equals(packageDeclarationToPackage.getSource()));

						// check link target from packageDeclarationToPackage to _package
						JavaSDM.ensure(_package
								.equals(packageDeclarationToPackage.getTarget()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object __packageDeclaration_useCases_useCase
						__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __packageDeclarationToPackage_source_packageDeclaration
						__packageDeclarationToPackage_source_packageDeclaration = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __packageDeclarationToPackage_target__package
						__packageDeclarationToPackage_target__package = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __useCase_flows_basicFlow
						__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
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
						// assign attribute __useCase_flows_basicFlow
						__useCase_flows_basicFlow.setName("flows");

						// create link
						__packageDeclaration_useCases_useCase
								.setSrc(packageDeclaration);

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
						__packageDeclaration_useCases_useCase.setTrg(useCase);

						// create link
						__useCase_flows_basicFlow.setSrc(useCase);

						// create link
						isApplicableMatch.getAllContextElements().add(useCase);

						// create link
						isApplicableMatch.getAllContextElements()
								.add(basicFlow);

						// create link
						__useCase_flows_basicFlow.setTrg(basicFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __useCase_flows_basicFlow,
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

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__packageDeclarationToPackage_target__package,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, packageDeclaration,
									_package, packageDeclarationToPackage,
									useCase, basicFlow));

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
										.setRuleName("UseCaseToInteractionRule");

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
		BasicFlow basicFlow = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		UseCase useCase = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		Interaction interaction = null;
		UseCaseToInteraction useCaseToInteraction = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge useCaseToInteraction__source__useCase = null;
		EMoflonEdge useCaseToInteraction__target__interaction = null;
		EMoflonEdge basicFlowToInteraction__target__interaction = null;
		EMoflonEdge basicFlowToInteraction__source__basicFlow = null;
		EMoflonEdge _package__packagedElement__interaction = null;
		EMoflonEdge __packageDeclaration_useCases_useCase = null;
		EMoflonEdge __useCase_flows_basicFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("basicFlow"));

			// ensure correct type and really bound of object basicFlow
			JavaSDM.ensure(_TmpObject instanceof BasicFlow);
			basicFlow = (BasicFlow) _TmpObject;
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
			// create object interaction
			interaction = ModalSequenceDiagramFactory.eINSTANCE
					.createInteraction();

			// create object useCaseToInteraction
			useCaseToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCaseToInteraction();

			// create object basicFlowToInteraction
			basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// assign attribute interaction
			interaction.setName((java.lang.String) csp.getAttributeVariable(
					"interaction", "name").getValue());

			// create link
			basicFlowToInteraction.setSource(basicFlow);

			// create link
			_package.getPackagedElement().add(interaction); // add link

			// create link
			useCaseToInteraction.setSource(useCase);

			// create link
			basicFlowToInteraction.setTarget(interaction);

			// create link
			useCaseToInteraction.setTarget(interaction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlow, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects basicFlow and _package 
			JavaSDM.ensure(!basicFlow.equals(_package));

			// check isomorphic binding between objects basicFlowToInteraction and _package 
			JavaSDM.ensure(!basicFlowToInteraction.equals(_package));

			// check isomorphic binding between objects interaction and _package 
			JavaSDM.ensure(!interaction.equals(_package));

			// check isomorphic binding between objects packageDeclaration and _package 
			JavaSDM.ensure(!packageDeclaration.equals(_package));

			// check isomorphic binding between objects packageDeclarationToPackage and _package 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(_package));

			// check isomorphic binding between objects useCase and _package 
			JavaSDM.ensure(!useCase.equals(_package));

			// check isomorphic binding between objects useCaseToInteraction and _package 
			JavaSDM.ensure(!useCaseToInteraction.equals(_package));

			// check isomorphic binding between objects basicFlowToInteraction and basicFlow 
			JavaSDM.ensure(!basicFlowToInteraction.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlow 
			JavaSDM.ensure(!interaction.equals(basicFlow));

			// check isomorphic binding between objects packageDeclaration and basicFlow 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlow));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlow 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(basicFlow));

			// check isomorphic binding between objects useCase and basicFlow 
			JavaSDM.ensure(!useCase.equals(basicFlow));

			// check isomorphic binding between objects useCaseToInteraction and basicFlow 
			JavaSDM.ensure(!useCaseToInteraction.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlowToInteraction 
			JavaSDM.ensure(!interaction.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclaration and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(basicFlowToInteraction));

			// check isomorphic binding between objects useCase and basicFlowToInteraction 
			JavaSDM.ensure(!useCase.equals(basicFlowToInteraction));

			// check isomorphic binding between objects useCaseToInteraction and basicFlowToInteraction 
			JavaSDM.ensure(!useCaseToInteraction.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToPackage and interaction 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(interaction));

			// check isomorphic binding between objects useCase and interaction 
			JavaSDM.ensure(!useCase.equals(interaction));

			// check isomorphic binding between objects useCaseToInteraction and interaction 
			JavaSDM.ensure(!useCaseToInteraction.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclarationToPackage 
			JavaSDM.ensure(!useCaseToInteraction
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object useCaseToInteraction__source__useCase
			useCaseToInteraction__source__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToInteraction__target__interaction
			useCaseToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object _package__packagedElement__interaction
			_package__packagedElement__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __useCase_flows_basicFlow
			__useCase_flows_basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCaseToInteractionRule");
			// assign attribute __packageDeclaration_useCases_useCase
			__packageDeclaration_useCases_useCase.setName("useCases");
			// assign attribute _package__packagedElement__interaction
			_package__packagedElement__interaction.setName("packagedElement");
			// assign attribute __useCase_flows_basicFlow
			__useCase_flows_basicFlow.setName("flows");
			// assign attribute useCaseToInteraction__source__useCase
			useCaseToInteraction__source__useCase.setName("source");
			// assign attribute useCaseToInteraction__target__interaction
			useCaseToInteraction__target__interaction.setName("target");
			// assign attribute basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow.setName("source");
			// assign attribute basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToInteraction__source__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToInteraction__target__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							basicFlowToInteraction__target__interaction,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction__source__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					_package__packagedElement__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__packageDeclaration_useCases_useCase, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__useCase_flows_basicFlow, "translatedEdges");

			// create link
			__packageDeclaration_useCases_useCase.setSrc(packageDeclaration);

			// create link
			_package__packagedElement__interaction.setSrc(_package);

			// create link
			__useCase_flows_basicFlow.setSrc(useCase);

			// create link
			useCaseToInteraction__source__useCase.setTrg(useCase);

			// create link
			__packageDeclaration_useCases_useCase.setTrg(useCase);

			// create link
			_package__packagedElement__interaction.setTrg(interaction);

			// create link
			useCaseToInteraction__target__interaction.setTrg(interaction);

			// create link
			basicFlowToInteraction__target__interaction.setTrg(interaction);

			// create link
			useCaseToInteraction__source__useCase.setSrc(useCaseToInteraction);

			// create link
			useCaseToInteraction__target__interaction
					.setSrc(useCaseToInteraction);

			// create link
			__useCase_flows_basicFlow.setTrg(basicFlow);

			// create link
			basicFlowToInteraction__source__basicFlow.setTrg(basicFlow);

			// create link
			basicFlowToInteraction__source__basicFlow
					.setSrc(basicFlowToInteraction);

			// create link
			basicFlowToInteraction__target__interaction
					.setSrc(basicFlowToInteraction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("useCase", useCase);
		match.registerObject("basicFlow", basicFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			PackageDeclaration packageDeclaration, UseCase useCase,
			BasicFlow basicFlow) {
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
			UseCase useCase, BasicFlow basicFlow) {
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
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("basicFlow", basicFlow);
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
			EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("basicFlowToInteraction",
				basicFlowToInteraction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("useCase")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getUseCase())
				&& match.getObject("basicFlow")
						.eClass()
						.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
								.getBasicFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge ___package_packagedElement_interaction = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
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
					interaction));

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
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// create object ___package_packagedElement_interaction
				___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute ___package_packagedElement_interaction
				___package_packagedElement_interaction
						.setName("packagedElement");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						___package_packagedElement_interaction,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						interaction, "toBeTranslatedNodes");

				// create link
				___package_packagedElement_interaction.setSrc(_package);

				// create link
				___package_packagedElement_interaction.setTrg(interaction);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
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
			this.registerObjectsToMatch_BWD(match, _package, interaction);
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
		Interaction interaction = null;
		EMoflonEdge __packageDeclarationToPackage_source_packageDeclaration = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __packageDeclarationToPackage_target__package = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
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
			ruleresult.setRule("UseCaseToInteractionRule");

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
			_TmpObject = (match.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
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
						// check object interaction is really bound
						JavaSDM.ensure(interaction != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object packageDeclarationToPackage is really bound
						JavaSDM.ensure(packageDeclarationToPackage != null);
						// check link packagedElement from interaction to _package
						JavaSDM.ensure(_package.equals(interaction.eContainer()));

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

						// create object ___package_packagedElement_interaction
						___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute ___package_packagedElement_interaction
						___package_packagedElement_interaction
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
						isApplicableMatch.getAllContextElements().add(_package);

						// create link
						___package_packagedElement_interaction.setSrc(_package);

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
						isApplicableMatch.getAllContextElements().add(
								interaction);

						// create link
						___package_packagedElement_interaction
								.setTrg(interaction);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								___package_packagedElement_interaction,
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
								__packageDeclarationToPackage_target__package,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, packageDeclaration,
									_package, packageDeclarationToPackage,
									interaction));

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
										.setRuleName("UseCaseToInteractionRule");

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
		Interaction interaction = null;
		PackageDeclaration packageDeclaration = null;
		PackageDeclarationToPackage packageDeclarationToPackage = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		UseCase useCase = null;
		BasicFlow basicFlow = null;
		UseCaseToInteraction useCaseToInteraction = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge basicFlowToInteraction__source__basicFlow = null;
		EMoflonEdge basicFlowToInteraction__target__interaction = null;
		EMoflonEdge useCaseToInteraction__target__interaction = null;
		EMoflonEdge ___package_packagedElement_interaction = null;
		EMoflonEdge useCaseToInteraction__source__useCase = null;
		EMoflonEdge useCase__flows__basicFlow = null;
		EMoflonEdge packageDeclaration__useCases__useCase = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("_package"));

			// ensure correct type and really bound of object _package
			JavaSDM.ensure(_TmpObject instanceof ModalSequenceDiagram.Package);
			_package = (ModalSequenceDiagram.Package) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("interaction"));

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;
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

			// create object basicFlow
			basicFlow = UseCaseDSLFactory.eINSTANCE.createBasicFlow();

			// create object useCaseToInteraction
			useCaseToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createUseCaseToInteraction();

			// create object basicFlowToInteraction
			basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
					.createFlowToInteractionFragment();

			// assign attribute useCase
			useCase.setName((java.lang.String) csp.getAttributeVariable(
					"useCase", "name").getValue());

			// create link
			useCaseToInteraction.setTarget(interaction);

			// create link
			basicFlowToInteraction.setTarget(interaction);

			// create link
			basicFlowToInteraction.setSource(basicFlow);

			// create link
			packageDeclaration.getUseCases().add(useCase); // add link

			// create link
			useCase.getFlows().add(basicFlow); // add link

			// create link
			useCaseToInteraction.setSource(useCase);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					interaction, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToInteraction, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction, "createdLinkElements");

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

			// check object _package is really bound
			JavaSDM.ensure(_package != null);
			// check object basicFlow is really bound
			JavaSDM.ensure(basicFlow != null);
			// check object basicFlowToInteraction is really bound
			JavaSDM.ensure(basicFlowToInteraction != null);
			// check object interaction is really bound
			JavaSDM.ensure(interaction != null);
			// check object packageDeclaration is really bound
			JavaSDM.ensure(packageDeclaration != null);
			// check object packageDeclarationToPackage is really bound
			JavaSDM.ensure(packageDeclarationToPackage != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check object useCase is really bound
			JavaSDM.ensure(useCase != null);
			// check object useCaseToInteraction is really bound
			JavaSDM.ensure(useCaseToInteraction != null);
			// check isomorphic binding between objects basicFlow and _package 
			JavaSDM.ensure(!basicFlow.equals(_package));

			// check isomorphic binding between objects basicFlowToInteraction and _package 
			JavaSDM.ensure(!basicFlowToInteraction.equals(_package));

			// check isomorphic binding between objects interaction and _package 
			JavaSDM.ensure(!interaction.equals(_package));

			// check isomorphic binding between objects packageDeclaration and _package 
			JavaSDM.ensure(!packageDeclaration.equals(_package));

			// check isomorphic binding between objects packageDeclarationToPackage and _package 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(_package));

			// check isomorphic binding between objects useCase and _package 
			JavaSDM.ensure(!useCase.equals(_package));

			// check isomorphic binding between objects useCaseToInteraction and _package 
			JavaSDM.ensure(!useCaseToInteraction.equals(_package));

			// check isomorphic binding between objects basicFlowToInteraction and basicFlow 
			JavaSDM.ensure(!basicFlowToInteraction.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlow 
			JavaSDM.ensure(!interaction.equals(basicFlow));

			// check isomorphic binding between objects packageDeclaration and basicFlow 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlow));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlow 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(basicFlow));

			// check isomorphic binding between objects useCase and basicFlow 
			JavaSDM.ensure(!useCase.equals(basicFlow));

			// check isomorphic binding between objects useCaseToInteraction and basicFlow 
			JavaSDM.ensure(!useCaseToInteraction.equals(basicFlow));

			// check isomorphic binding between objects interaction and basicFlowToInteraction 
			JavaSDM.ensure(!interaction.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclaration and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclaration.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclarationToPackage and basicFlowToInteraction 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(basicFlowToInteraction));

			// check isomorphic binding between objects useCase and basicFlowToInteraction 
			JavaSDM.ensure(!useCase.equals(basicFlowToInteraction));

			// check isomorphic binding between objects useCaseToInteraction and basicFlowToInteraction 
			JavaSDM.ensure(!useCaseToInteraction.equals(basicFlowToInteraction));

			// check isomorphic binding between objects packageDeclaration and interaction 
			JavaSDM.ensure(!packageDeclaration.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToPackage and interaction 
			JavaSDM.ensure(!packageDeclarationToPackage.equals(interaction));

			// check isomorphic binding between objects useCase and interaction 
			JavaSDM.ensure(!useCase.equals(interaction));

			// check isomorphic binding between objects useCaseToInteraction and interaction 
			JavaSDM.ensure(!useCaseToInteraction.equals(interaction));

			// check isomorphic binding between objects packageDeclarationToPackage and packageDeclaration 
			JavaSDM.ensure(!packageDeclarationToPackage
					.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclaration 
			JavaSDM.ensure(!useCase.equals(packageDeclaration));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclaration 
			JavaSDM.ensure(!useCaseToInteraction.equals(packageDeclaration));

			// check isomorphic binding between objects useCase and packageDeclarationToPackage 
			JavaSDM.ensure(!useCase.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToInteraction and packageDeclarationToPackage 
			JavaSDM.ensure(!useCaseToInteraction
					.equals(packageDeclarationToPackage));

			// check isomorphic binding between objects useCaseToInteraction and useCase 
			JavaSDM.ensure(!useCaseToInteraction.equals(useCase));

			// create object basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToInteraction__target__interaction
			useCaseToInteraction__target__interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object ___package_packagedElement_interaction
			___package_packagedElement_interaction = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCaseToInteraction__source__useCase
			useCaseToInteraction__source__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object useCase__flows__basicFlow
			useCase__flows__basicFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("UseCaseToInteractionRule");
			// assign attribute packageDeclaration__useCases__useCase
			packageDeclaration__useCases__useCase.setName("useCases");
			// assign attribute ___package_packagedElement_interaction
			___package_packagedElement_interaction.setName("packagedElement");
			// assign attribute useCase__flows__basicFlow
			useCase__flows__basicFlow.setName("flows");
			// assign attribute useCaseToInteraction__source__useCase
			useCaseToInteraction__source__useCase.setName("source");
			// assign attribute useCaseToInteraction__target__interaction
			useCaseToInteraction__target__interaction.setName("target");
			// assign attribute basicFlowToInteraction__source__basicFlow
			basicFlowToInteraction__source__basicFlow.setName("source");
			// assign attribute basicFlowToInteraction__target__interaction
			basicFlowToInteraction__target__interaction.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					basicFlowToInteraction__source__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil
					.addOppositeReference(ruleresult,
							basicFlowToInteraction__target__interaction,
							"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToInteraction__target__interaction, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					___package_packagedElement_interaction, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCaseToInteraction__source__useCase, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					useCase__flows__basicFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					packageDeclaration__useCases__useCase, "createdEdges");

			// create link
			packageDeclaration__useCases__useCase.setSrc(packageDeclaration);

			// create link
			___package_packagedElement_interaction.setSrc(_package);

			// create link
			packageDeclaration__useCases__useCase.setTrg(useCase);

			// create link
			useCaseToInteraction__source__useCase.setTrg(useCase);

			// create link
			useCase__flows__basicFlow.setSrc(useCase);

			// create link
			___package_packagedElement_interaction.setTrg(interaction);

			// create link
			basicFlowToInteraction__target__interaction.setTrg(interaction);

			// create link
			useCaseToInteraction__target__interaction.setTrg(interaction);

			// create link
			useCaseToInteraction__target__interaction
					.setSrc(useCaseToInteraction);

			// create link
			useCaseToInteraction__source__useCase.setSrc(useCaseToInteraction);

			// create link
			useCase__flows__basicFlow.setTrg(basicFlow);

			// create link
			basicFlowToInteraction__source__basicFlow.setTrg(basicFlow);

			// create link
			basicFlowToInteraction__target__interaction
					.setSrc(basicFlowToInteraction);

			// create link
			basicFlowToInteraction__source__basicFlow
					.setSrc(basicFlowToInteraction);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, packageDeclaration, _package,
				packageDeclarationToPackage, useCase, interaction,
				useCaseToInteraction, basicFlow, basicFlowToInteraction);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
		match.registerObject("_package", _package);
		match.registerObject("interaction", interaction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			ModalSequenceDiagram.Package _package, Interaction interaction) {
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
			Interaction interaction) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", true, csp);
		var_interaction_name.setValue(interaction.getName());
		var_interaction_name.setType("");

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
		eq.solve(var_useCase_name, var_interaction_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("_package", _package);
		isApplicableMatch.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		isApplicableMatch.registerObject("interaction", interaction);
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
			EObject interaction, EObject useCaseToInteraction,
			EObject basicFlow, EObject basicFlowToInteraction) {
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("_package", _package);
		ruleresult.registerObject("packageDeclarationToPackage",
				packageDeclarationToPackage);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("basicFlow", basicFlow);
		ruleresult.registerObject("basicFlowToInteraction",
				basicFlowToInteraction);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("interaction")
				.eClass()
				.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
						.getInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_useCases) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_basicFlow_flows_931450 = null;
		PackageDeclaration __DEC_useCase_useCases_246596 = null;
		Match match = null;
		Iterator fujaba__IterUseCaseToBasicFlow = null;
		BasicFlow basicFlow = null;
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

			// iterate to-many link flows from useCase to basicFlow
			fujaba__Success = false;

			fujaba__IterUseCaseToBasicFlow = new ArrayList(useCase.getFlows())
					.iterator();

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
							__DEC_basicFlow_flows_931450 = basicFlow
									.eContainer() instanceof UseCase ? (UseCase) basicFlow
									.eContainer() : null;

							// check object __DEC_basicFlow_flows_931450 is really bound
							JavaSDM.ensure(__DEC_basicFlow_flows_931450 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_basicFlow_flows_931450
									.getFlows().contains(basicFlow));

							// check isomorphic binding between objects __DEC_basicFlow_flows_931450 and useCase 
							JavaSDM.ensure(!__DEC_basicFlow_flows_931450
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
							__DEC_useCase_useCases_246596 = useCase
									.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
									.eContainer() : null;

							// check object __DEC_useCase_useCases_246596 is really bound
							JavaSDM.ensure(__DEC_useCase_useCases_246596 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_useCase_useCases_246596
									.getUseCases().contains(useCase));

							// check isomorphic binding between objects __DEC_useCase_useCases_246596 and packageDeclaration 
							JavaSDM.ensure(!__DEC_useCase_useCases_246596
									.equals(packageDeclaration));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_useCases is really bound
						JavaSDM.ensure(_edge_useCases != null);
						// check object basicFlow is really bound
						JavaSDM.ensure(basicFlow != null);
						// check object packageDeclaration is really bound
						JavaSDM.ensure(packageDeclaration != null);
						// check object useCase is really bound
						JavaSDM.ensure(useCase != null);
						// check link flows from basicFlow to useCase
						JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

						// check link src from _edge_useCases to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(_edge_useCases
								.getSrc()));

						// check link trg from _edge_useCases to useCase
						JavaSDM.ensure(useCase.equals(_edge_useCases.getTrg()));

						// check link useCases from useCase to packageDeclaration
						JavaSDM.ensure(packageDeclaration.equals(useCase
								.eContainer()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								packageDeclaration, useCase, basicFlow);
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
			EMoflonEdge _edge_packagedElement) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Interaction __DEC_interaction_enclosingInteraction_875790 = null;
		ModalSequenceDiagram.Package __DEC_interaction_packagedElement_122914 = null;
		Match match = null;
		Interaction interaction = null;
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

			// ensure correct type and really bound of object interaction
			JavaSDM.ensure(_TmpObject instanceof Interaction);
			interaction = (Interaction) _TmpObject;

			// check link packagedElement from interaction to _package
			JavaSDM.ensure(_package.equals(interaction.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// negative check for link fragment from interaction
				JavaSDM.ensure(interaction.getEnclosingOperand() == null);
				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_interaction_enclosingInteraction_875790 = interaction
							.getEnclosingInteraction();

					// check object __DEC_interaction_enclosingInteraction_875790 is really bound
					JavaSDM.ensure(__DEC_interaction_enclosingInteraction_875790 != null);

					// check isomorphic binding between objects __DEC_interaction_enclosingInteraction_875790 and interaction 
					JavaSDM.ensure(!__DEC_interaction_enclosingInteraction_875790
							.equals(interaction));

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
					__DEC_interaction_packagedElement_122914 = interaction
							.eContainer() instanceof ModalSequenceDiagram.Package ? (ModalSequenceDiagram.Package) interaction
							.eContainer() : null;

					// check object __DEC_interaction_packagedElement_122914 is really bound
					JavaSDM.ensure(__DEC_interaction_packagedElement_122914 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_interaction_packagedElement_122914
							.getPackagedElement().contains(interaction));

					// check isomorphic binding between objects __DEC_interaction_packagedElement_122914 and _package 
					JavaSDM.ensure(!__DEC_interaction_packagedElement_122914
							.equals(_package));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link covered from interaction
				JavaSDM.ensure(interaction.getCovered().size() == 0);
				// check link fragment from interaction to interaction
				JavaSDM.ensure(!(interaction.equals(interaction
						.getEnclosingInteraction())));

				// check link fragment from interaction to interaction
				JavaSDM.ensure(!(interaction.equals(interaction
						.getEnclosingInteraction())));

				// check object _edge_packagedElement is really bound
				JavaSDM.ensure(_edge_packagedElement != null);
				// check object _package is really bound
				JavaSDM.ensure(_package != null);
				// check object interaction is really bound
				JavaSDM.ensure(interaction != null);
				// check link packagedElement from interaction to _package
				JavaSDM.ensure(_package.equals(interaction.eContainer()));

				// check link src from _edge_packagedElement to _package
				JavaSDM.ensure(_package.equals(_edge_packagedElement.getSrc()));

				// check link trg from _edge_packagedElement to interaction
				JavaSDM.ensure(interaction.equals(_edge_packagedElement
						.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, _package,
						interaction);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_flows) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		UseCase __DEC_basicFlow_flows_463140 = null;
		PackageDeclaration __DEC_useCase_useCases_536548 = null;
		Match match = null;
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

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_basicFlow_flows_463140 = basicFlow.eContainer() instanceof UseCase ? (UseCase) basicFlow
							.eContainer() : null;

					// check object __DEC_basicFlow_flows_463140 is really bound
					JavaSDM.ensure(__DEC_basicFlow_flows_463140 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_basicFlow_flows_463140.getFlows()
							.contains(basicFlow));

					// check isomorphic binding between objects __DEC_basicFlow_flows_463140 and useCase 
					JavaSDM.ensure(!__DEC_basicFlow_flows_463140
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
					__DEC_useCase_useCases_536548 = useCase.eContainer() instanceof PackageDeclaration ? (PackageDeclaration) useCase
							.eContainer() : null;

					// check object __DEC_useCase_useCases_536548 is really bound
					JavaSDM.ensure(__DEC_useCase_useCases_536548 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_useCase_useCases_536548.getUseCases()
							.contains(useCase));

					// check isomorphic binding between objects __DEC_useCase_useCases_536548 and packageDeclaration 
					JavaSDM.ensure(!__DEC_useCase_useCases_536548
							.equals(packageDeclaration));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_flows is really bound
				JavaSDM.ensure(_edge_flows != null);
				// check object basicFlow is really bound
				JavaSDM.ensure(basicFlow != null);
				// check object packageDeclaration is really bound
				JavaSDM.ensure(packageDeclaration != null);
				// check object useCase is really bound
				JavaSDM.ensure(useCase != null);
				// check link flows from basicFlow to useCase
				JavaSDM.ensure(useCase.equals(basicFlow.eContainer()));

				// check link src from _edge_flows to useCase
				JavaSDM.ensure(useCase.equals(_edge_flows.getSrc()));

				// check link trg from _edge_flows to basicFlow
				JavaSDM.ensure(basicFlow.equals(_edge_flows.getTrg()));

				// check link useCases from useCase to packageDeclaration
				JavaSDM.ensure(packageDeclaration.equals(useCase.eContainer()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match,
						packageDeclaration, useCase, basicFlow);
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
		Interaction interaction = null;
		BasicFlow basicFlow = null;
		UseCaseToInteraction useCaseToInteraction = null;
		FlowToInteractionFragment basicFlowToInteraction = null;
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
										useCase, interaction,
										useCaseToInteraction, basicFlow,
										basicFlowToInteraction, ruleResult));

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

									// create object interaction
									interaction = ModalSequenceDiagramFactory.eINSTANCE
											.createInteraction();

									// create object basicFlow
									basicFlow = UseCaseDSLFactory.eINSTANCE
											.createBasicFlow();

									// create object useCaseToInteraction
									useCaseToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
											.createUseCaseToInteraction();

									// create object basicFlowToInteraction
									basicFlowToInteraction = UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE
											.createFlowToInteractionFragment();

									// assign attribute useCase
									useCase.setName((java.lang.String) csp
											.getAttributeVariable("useCase",
													"name").getValue());
									// assign attribute interaction
									interaction.setName((java.lang.String) csp
											.getAttributeVariable(
													"interaction", "name")
											.getValue());
									// assign attribute ruleResult
									ruleResult.setSuccess(true);

									// create link
									packageDeclaration.getUseCases().add(
											useCase); // add link

									// create link
									_package.getPackagedElement().add(
											interaction); // add link

									// create link
									useCase.getFlows().add(basicFlow); // add link

									// create link
									ruleResult.getSourceObjects().add(useCase);

									// create link
									useCaseToInteraction.setSource(useCase);

									// create link
									ruleResult.getTargetObjects().add(
											interaction);

									// create link
									useCaseToInteraction.setTarget(interaction);

									// create link
									basicFlowToInteraction
											.setTarget(interaction);

									// create link
									ruleResult.getCorrObjects().add(
											useCaseToInteraction);

									// create link
									ruleResult.getSourceObjects()
											.add(basicFlow);

									// create link
									basicFlowToInteraction.setSource(basicFlow);

									// create link
									ruleResult.getCorrObjects().add(
											basicFlowToInteraction);

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
			UseCase useCase, Interaction interaction,
			UseCaseToInteraction useCaseToInteraction, BasicFlow basicFlow,
			FlowToInteractionFragment basicFlowToInteraction,
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
		Variable var_interaction_name = CSPFactoryHelper.eINSTANCE
				.createVariable("interaction.name", csp);
		var_interaction_name.setType("");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_useCase_name, var_interaction_name);

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
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGEDECLARATION_USECASE_BASICFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(UseCase) arguments.get(2), (BasicFlow) arguments.get(3));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_BASICFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4), (BasicFlow) arguments.get(5));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERACTION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERACTION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERACTION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ModalSequenceDiagram.Package) arguments.get(1),
					(Interaction) arguments.get(2));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_INTERACTION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(Interaction) arguments.get(4));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGEDECLARATIONTOPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(PackageDeclarationToPackage) arguments.get(1));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGEDECLARATION_PACKAGE_PACKAGEDECLARATIONTOPACKAGE_USECASE_INTERACTION_USECASETOINTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(PackageDeclaration) arguments.get(1),
					(ModalSequenceDiagram.Package) arguments.get(2),
					(PackageDeclarationToPackage) arguments.get(3),
					(UseCase) arguments.get(4), (Interaction) arguments.get(5),
					(UseCaseToInteraction) arguments.get(6),
					(BasicFlow) arguments.get(7),
					(FlowToInteractionFragment) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UseCaseToInteractionRuleImpl
