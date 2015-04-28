/**
 */
package BpmnToUseCaseIntegration.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;

import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.Rules.impl.RulesPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import UseCaseDSL.UseCaseDSLPackage;

import bpmn2.Bpmn2Package;

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
public class BpmnToUseCaseIntegrationPackageImpl extends EPackageImpl implements
		BpmnToUseCaseIntegrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "BpmnToUseCaseIntegration.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docRootToUCModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsToPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processToUseCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventToUseCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventToBasicFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowToUCFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processToActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeToStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowToStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneToActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqFlowToAltFlowAltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceToAltFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventToFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processToBasicFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventToUCConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventToUCConditionEClass = null;

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
	 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnToUseCaseIntegrationPackageImpl() {
		super(eNS_URI, BpmnToUseCaseIntegrationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BpmnToUseCaseIntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static BpmnToUseCaseIntegrationPackage init() {
		if (isInited)
			return (BpmnToUseCaseIntegrationPackage) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI);

		// Obtain or create and register package
		BpmnToUseCaseIntegrationPackageImpl theBpmnToUseCaseIntegrationPackage = (BpmnToUseCaseIntegrationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BpmnToUseCaseIntegrationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new BpmnToUseCaseIntegrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		UseCaseDSLPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theBpmnToUseCaseIntegrationPackage.loadPackage();

		// Fix loaded packages
		theBpmnToUseCaseIntegrationPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmnToUseCaseIntegrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnToUseCaseIntegrationPackage.eNS_URI,
				theBpmnToUseCaseIntegrationPackage);
		return theBpmnToUseCaseIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocRootToUCModel() {
		if (docRootToUCModelEClass == null) {
			docRootToUCModelEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return docRootToUCModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocRootToUCModel_Source() {
		return (EReference) getDocRootToUCModel().getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocRootToUCModel_Target() {
		return (EReference) getDocRootToUCModel().getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsToPackage() {
		if (definitionsToPackageEClass == null) {
			definitionsToPackageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return definitionsToPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsToPackage_Source() {
		return (EReference) getDefinitionsToPackage().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsToPackage_Target() {
		return (EReference) getDefinitionsToPackage().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessToUseCase() {
		if (processToUseCaseEClass == null) {
			processToUseCaseEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return processToUseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToUseCase_Source() {
		return (EReference) getProcessToUseCase().getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToUseCase_Target() {
		return (EReference) getProcessToUseCase().getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEventToUseCase() {
		if (startEventToUseCaseEClass == null) {
			startEventToUseCaseEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return startEventToUseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEventToUseCase_Source() {
		return (EReference) getStartEventToUseCase().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEventToUseCase_Target() {
		return (EReference) getStartEventToUseCase().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEventToBasicFlow() {
		if (startEventToBasicFlowEClass == null) {
			startEventToBasicFlowEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return startEventToBasicFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEventToBasicFlow_Source() {
		return (EReference) getStartEventToBasicFlow().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEventToBasicFlow_Target() {
		return (EReference) getStartEventToBasicFlow().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlowToUCFlow() {
		if (sequenceFlowToUCFlowEClass == null) {
			sequenceFlowToUCFlowEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return sequenceFlowToUCFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlowToUCFlow_Source() {
		return (EReference) getSequenceFlowToUCFlow().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlowToUCFlow_Target() {
		return (EReference) getSequenceFlowToUCFlow().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessToActor() {
		if (processToActorEClass == null) {
			processToActorEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return processToActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToActor_Source() {
		return (EReference) getProcessToActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToActor_Target() {
		return (EReference) getProcessToActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNodeToStep() {
		if (flowNodeToStepEClass == null) {
			flowNodeToStepEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return flowNodeToStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeToStep_Source() {
		return (EReference) getFlowNodeToStep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeToStep_Target() {
		return (EReference) getFlowNodeToStep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlowToStep() {
		if (sequenceFlowToStepEClass == null) {
			sequenceFlowToStepEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return sequenceFlowToStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlowToStep_Source() {
		return (EReference) getSequenceFlowToStep().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlowToStep_Target() {
		return (EReference) getSequenceFlowToStep().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaneToActor() {
		if (laneToActorEClass == null) {
			laneToActorEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return laneToActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaneToActor_Source() {
		return (EReference) getLaneToActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaneToActor_Target() {
		return (EReference) getLaneToActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqFlowToAltFlowAlt() {
		if (seqFlowToAltFlowAltEClass == null) {
			seqFlowToAltFlowAltEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return seqFlowToAltFlowAltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeqFlowToAltFlowAlt_Source() {
		return (EReference) getSeqFlowToAltFlowAlt().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeqFlowToAltFlowAlt_Target() {
		return (EReference) getSeqFlowToAltFlowAlt().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICEToAltFlow() {
		if (iceToAltFlowEClass == null) {
			iceToAltFlowEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return iceToAltFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getICEToAltFlow_Source() {
		return (EReference) getICEToAltFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getICEToAltFlow_Target() {
		return (EReference) getICEToAltFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEventToFlow() {
		if (endEventToFlowEClass == null) {
			endEventToFlowEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return endEventToFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEventToFlow_Source() {
		return (EReference) getEndEventToFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEventToFlow_Target() {
		return (EReference) getEndEventToFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessToBasicFlow() {
		if (processToBasicFlowEClass == null) {
			processToBasicFlowEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return processToBasicFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToBasicFlow_Source() {
		return (EReference) getProcessToBasicFlow().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessToBasicFlow_Target() {
		return (EReference) getProcessToBasicFlow().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEventToUCCondition() {
		if (startEventToUCConditionEClass == null) {
			startEventToUCConditionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return startEventToUCConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEventToUCCondition_Source() {
		return (EReference) getStartEventToUCCondition()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartEventToUCCondition_Target() {
		return (EReference) getStartEventToUCCondition()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEventToUCCondition() {
		if (endEventToUCConditionEClass == null) {
			endEventToUCConditionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(BpmnToUseCaseIntegrationPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return endEventToUCConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEventToUCCondition_Source() {
		return (EReference) getEndEventToUCCondition().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEventToUCCondition_Target() {
		return (EReference) getEndEventToUCCondition().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationFactory getBpmnToUseCaseIntegrationFactory() {
		return (BpmnToUseCaseIntegrationFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("BpmnToUseCaseIntegration."
					+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BpmnToUseCaseIntegrationPackageImpl
