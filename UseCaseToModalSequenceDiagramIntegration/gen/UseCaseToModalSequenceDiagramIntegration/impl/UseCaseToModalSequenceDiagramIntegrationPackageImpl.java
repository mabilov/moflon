/**
 */
package UseCaseToModalSequenceDiagramIntegration.impl;

import ModalSequenceDiagram.ModalSequenceDiagramPackage;

import TGGLanguage.TGGLanguagePackage;

import UseCaseDSL.UseCaseDSLPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;

import UseCaseToModalSequenceDiagramIntegration.Rules.impl.RulesPackageImpl;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationFactory;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseToModalSequenceDiagramIntegrationPackageImpl extends
		EPackageImpl implements UseCaseToModalSequenceDiagramIntegrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "UseCaseToModalSequenceDiagramIntegration.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCasesModelToModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDeclarationToPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseToInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepToMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorToLifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowToInteractionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepAlternativeToInteractionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelStepToCombinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepToCombinedFragmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UseCaseToModalSequenceDiagramIntegrationPackageImpl() {
		super(eNS_URI,
				UseCaseToModalSequenceDiagramIntegrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UseCaseToModalSequenceDiagramIntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static UseCaseToModalSequenceDiagramIntegrationPackage init() {
		if (isInited)
			return (UseCaseToModalSequenceDiagramIntegrationPackage) EPackage.Registry.INSTANCE
					.getEPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI);

		// Obtain or create and register package
		UseCaseToModalSequenceDiagramIntegrationPackageImpl theUseCaseToModalSequenceDiagramIntegrationPackage = (UseCaseToModalSequenceDiagramIntegrationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UseCaseToModalSequenceDiagramIntegrationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new UseCaseToModalSequenceDiagramIntegrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UseCaseDSLPackage.eINSTANCE.eClass();
		ModalSequenceDiagramPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theUseCaseToModalSequenceDiagramIntegrationPackage.loadPackage();

		// Fix loaded packages
		theUseCaseToModalSequenceDiagramIntegrationPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theUseCaseToModalSequenceDiagramIntegrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(
				UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI,
				theUseCaseToModalSequenceDiagramIntegrationPackage);
		return theUseCaseToModalSequenceDiagramIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCasesModelToModel() {
		if (useCasesModelToModelEClass == null) {
			useCasesModelToModelEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return useCasesModelToModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCasesModelToModel_Source() {
		return (EReference) getUseCasesModelToModel().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCasesModelToModel_Target() {
		return (EReference) getUseCasesModelToModel().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDeclarationToPackage() {
		if (packageDeclarationToPackageEClass == null) {
			packageDeclarationToPackageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return packageDeclarationToPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclarationToPackage_Source() {
		return (EReference) getPackageDeclarationToPackage()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclarationToPackage_Target() {
		return (EReference) getPackageDeclarationToPackage()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseToInteraction() {
		if (useCaseToInteractionEClass == null) {
			useCaseToInteractionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return useCaseToInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseToInteraction_Source() {
		return (EReference) getUseCaseToInteraction().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseToInteraction_Target() {
		return (EReference) getUseCaseToInteraction().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepToMessage() {
		if (normalStepToMessageEClass == null) {
			normalStepToMessageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return normalStepToMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalStepToMessage_Source() {
		return (EReference) getNormalStepToMessage().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalStepToMessage_Target() {
		return (EReference) getNormalStepToMessage().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorToLifeline() {
		if (actorToLifelineEClass == null) {
			actorToLifelineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return actorToLifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorToLifeline_Source() {
		return (EReference) getActorToLifeline().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorToLifeline_Target() {
		return (EReference) getActorToLifeline().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowToInteractionFragment() {
		if (flowToInteractionFragmentEClass == null) {
			flowToInteractionFragmentEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return flowToInteractionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowToInteractionFragment_Source() {
		return (EReference) getFlowToInteractionFragment()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowToInteractionFragment_Target() {
		return (EReference) getFlowToInteractionFragment()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepAlternativeToInteractionOperand() {
		if (stepAlternativeToInteractionOperandEClass == null) {
			stepAlternativeToInteractionOperandEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return stepAlternativeToInteractionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepAlternativeToInteractionOperand_Source() {
		return (EReference) getStepAlternativeToInteractionOperand()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepAlternativeToInteractionOperand_Target() {
		return (EReference) getStepAlternativeToInteractionOperand()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelStepToCombinedFragment() {
		if (parallelStepToCombinedFragmentEClass == null) {
			parallelStepToCombinedFragmentEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return parallelStepToCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelStepToCombinedFragment_Source() {
		return (EReference) getParallelStepToCombinedFragment()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelStepToCombinedFragment_Target() {
		return (EReference) getParallelStepToCombinedFragment()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStepToCombinedFragment() {
		if (normalStepToCombinedFragmentEClass == null) {
			normalStepToCombinedFragmentEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(
							UseCaseToModalSequenceDiagramIntegrationPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return normalStepToCombinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalStepToCombinedFragment_Source() {
		return (EReference) getNormalStepToCombinedFragment()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalStepToCombinedFragment_Target() {
		return (EReference) getNormalStepToCombinedFragment()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToModalSequenceDiagramIntegrationFactory getUseCaseToModalSequenceDiagramIntegrationFactory() {
		return (UseCaseToModalSequenceDiagramIntegrationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: "
					+ packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents()
				.get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier
					.setInstanceClassName("UseCaseToModalSequenceDiagramIntegration."
							+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //UseCaseToModalSequenceDiagramIntegrationPackageImpl
