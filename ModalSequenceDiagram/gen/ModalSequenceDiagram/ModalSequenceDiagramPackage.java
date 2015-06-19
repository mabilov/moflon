/**
 */
package ModalSequenceDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ModalSequenceDiagram.ModalSequenceDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ModalSequenceDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModalSequenceDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ModalSequenceDiagram/model/ModalSequenceDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModalSequenceDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModalSequenceDiagramPackage eINSTANCE = ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.NamedElementImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.PackageableElementImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.PackageImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ModelImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.TypeImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ClassifierImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 6;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.StructuredClassifierImpl <em>Structured Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.StructuredClassifierImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getStructuredClassifier()
	 * @generated
	 */
	int STRUCTURED_CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__ID = CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__OWNED_CONNECTOR = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structured Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.CollaborationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 3;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ID = STRUCTURED_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__NAME = STRUCTURED_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_CONNECTOR = STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_ATTRIBUTE = STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_BEHAVIOR = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_OPERATION_COUNT = STRUCTURED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.BehavioredClassifierImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehavioredClassifier()
	 * @generated
	 */
	int BEHAVIORED_CLASSIFIER = 5;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER__ID = CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ClassImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 32;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = BEHAVIORED_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = BEHAVIORED_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_CONNECTOR = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_OPERATION = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = BEHAVIORED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.BehaviorImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 9;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ID = CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_BEHAVIOR = CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_CONNECTOR = CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_ATTRIBUTE = CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_OPERATION = CLASS__OWNED_OPERATION;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.InteractionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 8;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ID = BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_BEHAVIOR = BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_CONNECTOR = BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_ATTRIBUTE = BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_OPERATION = BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_INTERACTION = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COVERED = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_OPERAND = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERAL_ORDERING = BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LIFELINE = BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FRAGMENT = BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MESSAGE = BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FORMAL_GATE = BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ACTION = BEHAVIOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.RedefinableElementImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getRedefinableElement()
	 * @generated
	 */
	int REDEFINABLE_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.FeatureImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 26;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = REDEFINABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = REDEFINABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ConnectorImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 10;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.LifelineImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 11;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__INTERACTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__REPRESENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__COVERED_BY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__SELECTOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__DECOMPOSED_AS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.InteractionFragmentImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionFragment()
	 * @generated
	 */
	int INTERACTION_FRAGMENT = 12;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__ENCLOSING_INTERACTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__COVERED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__ENCLOSING_OPERAND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__GENERAL_ORDERING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.TypedElementImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ConnectableElementImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConnectableElement()
	 * @generated
	 */
	int CONNECTABLE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__ID = TYPED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.PropertyImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = CONNECTABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = CONNECTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = CONNECTABLE_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.MessageImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INTERACTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNATURE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ARGUMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONNECTOR = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_KIND = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.MessageEndImpl <em>Message End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.MessageEndImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageEnd()
	 * @generated
	 */
	int MESSAGE_END = 16;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__MESSAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageOccurrenceSpecification()
	 * @generated
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION = 17;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__ID = MESSAGE_END__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__NAME = MESSAGE_END__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE = MESSAGE_END__MESSAGE;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = MESSAGE_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__COVERED = MESSAGE_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = MESSAGE_END_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = MESSAGE_END_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER = MESSAGE_END_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE = MESSAGE_END_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = MESSAGE_END_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = MESSAGE_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.OccurrenceSpecificationImpl <em>Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.OccurrenceSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getOccurrenceSpecification()
	 * @generated
	 */
	int OCCURRENCE_SPECIFICATION = 18;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__TO_AFTER = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__TO_BEFORE = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.StateInvariantImpl <em>State Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.StateInvariantImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getStateInvariant()
	 * @generated
	 */
	int STATE_INVARIANT = 19;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__INVARIANT = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ConstraintImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ValueSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 21;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__ID = PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.OpaqueExpressionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getOpaqueExpression()
	 * @generated
	 */
	int OPAQUE_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__ID = VALUE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__BODY = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ConnectorEndImpl <em>Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ConnectorEndImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConnectorEnd()
	 * @generated
	 */
	int CONNECTOR_END = 27;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.EventImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 31;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = PACKAGEABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.MessageEventImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 30;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.CallEventImpl <em>Call Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.CallEventImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCallEvent()
	 * @generated
	 */
	int CALL_EVENT = 28;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__ID = MESSAGE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OPERATION = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.BehavioralFeatureImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 33;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.OperationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 29;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = BEHAVIORAL_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = BEHAVIORAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.DestructionOccurenceSpecificationImpl <em>Destruction Occurence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.DestructionOccurenceSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getDestructionOccurenceSpecification()
	 * @generated
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION = 34;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__ID = MESSAGE_OCCURRENCE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__NAME = MESSAGE_OCCURRENCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__MESSAGE = MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__ENCLOSING_INTERACTION = MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__COVERED = MESSAGE_OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__ENCLOSING_OPERAND = MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__GENERAL_ORDERING = MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__TO_AFTER = MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION__TO_BEFORE = MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The number of structural features of the '<em>Destruction Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION_FEATURE_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destruction Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURENCE_SPECIFICATION_OPERATION_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.GeneralOrderingImpl <em>General Ordering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.GeneralOrderingImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getGeneralOrdering()
	 * @generated
	 */
	int GENERAL_ORDERING = 35;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__BEFORE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__AFTER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>General Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ExecutionOccurrenceSpecificationImpl <em>Execution Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ExecutionOccurrenceSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getExecutionOccurrenceSpecification()
	 * @generated
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION = 36;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__ID = OCCURRENCE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__NAME = OCCURRENCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__COVERED = OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER = OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE = OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ExecutionSpecificationImpl <em>Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ExecutionSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getExecutionSpecification()
	 * @generated
	 */
	int EXECUTION_SPECIFICATION = 51;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__FINISH = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__START = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ActionExecutionSpecificationImpl <em>Action Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ActionExecutionSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getActionExecutionSpecification()
	 * @generated
	 */
	int ACTION_EXECUTION_SPECIFICATION = 37;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ID = EXECUTION_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__NAME = EXECUTION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__COVERED = EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING = EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__FINISH = EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__START = EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ACTION = EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION_FEATURE_COUNT = EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION_OPERATION_COUNT = EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.BehaviorExecutionSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehaviorExecutionSpecification()
	 * @generated
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION = 38;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ID = EXECUTION_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAME = EXECUTION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__COVERED = EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING = EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__FINISH = EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__START = EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_FEATURE_COUNT = EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_OPERATION_COUNT = EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.NamespaceImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 39;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.CombinedFragmentImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 49;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERAND = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__CFRAGMENT_GATE = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__INTERACTION_OPERATOR = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ConsiderIgnoreFragmentImpl <em>Consider Ignore Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ConsiderIgnoreFragmentImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConsiderIgnoreFragment()
	 * @generated
	 */
	int CONSIDER_IGNORE_FRAGMENT = 40;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__ID = COMBINED_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__NAME = COMBINED_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION = COMBINED_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__COVERED = COMBINED_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND = COMBINED_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING = COMBINED_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__OPERAND = COMBINED_FRAGMENT__OPERAND;

	/**
	 * The feature id for the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE = COMBINED_FRAGMENT__CFRAGMENT_GATE;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR = COMBINED_FRAGMENT__INTERACTION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__MESSAGE = COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consider Ignore Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT_FEATURE_COUNT = COMBINED_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Consider Ignore Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT_OPERATION_COUNT = COMBINED_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ContinuationImpl <em>Continuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ContinuationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getContinuation()
	 * @generated
	 */
	int CONTINUATION = 41;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__SETTING = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.InteractionUseImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionUse()
	 * @generated
	 */
	int INTERACTION_USE = 42;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__RETURN_VALUE = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ARGUMENT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__REFERS_TO = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ACTUAL_GATE = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ModalMessageImpl <em>Modal Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ModalMessageImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getModalMessage()
	 * @generated
	 */
	int MODAL_MESSAGE = 43;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__INTERACTION = MESSAGE__INTERACTION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__SIGNATURE = MESSAGE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__ARGUMENT = MESSAGE__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__RECEIVE_EVENT = MESSAGE__RECEIVE_EVENT;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__SEND_EVENT = MESSAGE__SEND_EVENT;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__CONNECTOR = MESSAGE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__MESSAGE_KIND = MESSAGE__MESSAGE_KIND;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__MESSAGE_SORT = MESSAGE__MESSAGE_SORT;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__EXECUTION = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE__TEMPERATURE = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ConditionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 44;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = STATE_INVARIANT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = STATE_INVARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ENCLOSING_INTERACTION = STATE_INVARIANT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COVERED = STATE_INVARIANT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ENCLOSING_OPERAND = STATE_INVARIANT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GENERAL_ORDERING = STATE_INVARIANT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INVARIANT = STATE_INVARIANT__INVARIANT;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEMPERATURE = STATE_INVARIANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STATE_INVARIANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = STATE_INVARIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.TimeConditionImpl <em>Time Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.TimeConditionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getTimeCondition()
	 * @generated
	 */
	int TIME_CONDITION = 45;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__ENCLOSING_INTERACTION = CONDITION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__COVERED = CONDITION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__ENCLOSING_OPERAND = CONDITION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__GENERAL_ORDERING = CONDITION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__INVARIANT = CONDITION__INVARIANT;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__TEMPERATURE = CONDITION__TEMPERATURE;

	/**
	 * The number of structural features of the '<em>Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.SpecificationPartImpl <em>Specification Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.SpecificationPartImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getSpecificationPart()
	 * @generated
	 */
	int SPECIFICATION_PART = 46;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__TYPE = PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Part Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__PART_KIND = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specification Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specification Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.EncapsulatedClassifierImpl <em>Encapsulated Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.EncapsulatedClassifierImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getEncapsulatedClassifier()
	 * @generated
	 */
	int ENCAPSULATED_CLASSIFIER = 47;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__ID = STRUCTURED_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__NAME = STRUCTURED_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR = STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE = STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Encapsulated Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER_FEATURE_COUNT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encapsulated Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER_OPERATION_COUNT = STRUCTURED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.InteractionOperandImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionOperand()
	 * @generated
	 */
	int INTERACTION_OPERAND = 48;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ID = INTERACTION_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__FRAGMENT = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GUARD = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.InteractionConstraintImpl <em>Interaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.InteractionConstraintImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionConstraint()
	 * @generated
	 */
	int INTERACTION_CONSTRAINT = 50;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__SPECIFICATION = CONSTRAINT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__MAXINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__MININT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.GateImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 52;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = MESSAGE_END__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = MESSAGE_END__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__MESSAGE = MESSAGE_END__MESSAGE;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = MESSAGE_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = MESSAGE_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ActionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 53;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.PartDecompositionImpl <em>Part Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.PartDecompositionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPartDecomposition()
	 * @generated
	 */
	int PART_DECOMPOSITION = 54;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ID = INTERACTION_USE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__NAME = INTERACTION_USE__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ENCLOSING_INTERACTION = INTERACTION_USE__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__COVERED = INTERACTION_USE__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ENCLOSING_OPERAND = INTERACTION_USE__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__GENERAL_ORDERING = INTERACTION_USE__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__RETURN_VALUE = INTERACTION_USE__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ARGUMENT = INTERACTION_USE__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__REFERS_TO = INTERACTION_USE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ACTUAL_GATE = INTERACTION_USE__ACTUAL_GATE;

	/**
	 * The number of structural features of the '<em>Part Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION_FEATURE_COUNT = INTERACTION_USE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Part Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION_OPERATION_COUNT = INTERACTION_USE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.ClockResetImpl <em>Clock Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.ClockResetImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getClockReset()
	 * @generated
	 */
	int CLOCK_RESET = 55;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__ID = STATE_INVARIANT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__NAME = STATE_INVARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__ENCLOSING_INTERACTION = STATE_INVARIANT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__COVERED = STATE_INVARIANT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__ENCLOSING_OPERAND = STATE_INVARIANT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__GENERAL_ORDERING = STATE_INVARIANT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__INVARIANT = STATE_INVARIANT__INVARIANT;

	/**
	 * The number of structural features of the '<em>Clock Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_FEATURE_COUNT = STATE_INVARIANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clock Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_OPERATION_COUNT = STATE_INVARIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.MSDSpecificationImpl <em>MSD Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.MSDSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMSDSpecification()
	 * @generated
	 */
	int MSD_SPECIFICATION = 56;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSD_SPECIFICATION__ID = PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSD_SPECIFICATION__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSD_SPECIFICATION__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSD_SPECIFICATION__SPECIFICATION_KIND = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSD Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSD_SPECIFICATION_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MSD Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSD_SPECIFICATION_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.EnvironmentAssumptionImpl <em>Environment Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.EnvironmentAssumptionImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getEnvironmentAssumption()
	 * @generated
	 */
	int ENVIRONMENT_ASSUMPTION = 57;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__ID = INTERACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__NAME = INTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__OWNED_BEHAVIOR = INTERACTION__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__OWNED_CONNECTOR = INTERACTION__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__OWNED_ATTRIBUTE = INTERACTION__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__OWNED_OPERATION = INTERACTION__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__ENCLOSING_INTERACTION = INTERACTION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__COVERED = INTERACTION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__ENCLOSING_OPERAND = INTERACTION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__GENERAL_ORDERING = INTERACTION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__LIFELINE = INTERACTION__LIFELINE;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__FRAGMENT = INTERACTION__FRAGMENT;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__MESSAGE = INTERACTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__FORMAL_GATE = INTERACTION__FORMAL_GATE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION__ACTION = INTERACTION__ACTION;

	/**
	 * The number of structural features of the '<em>Environment Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ASSUMPTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.LiteralSpecificationImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getLiteralSpecification()
	 * @generated
	 */
	int LITERAL_SPECIFICATION = 59;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__ID = VALUE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The number of structural features of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.impl.LiteralStringImpl
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 58;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__ID = LITERAL_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.MessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.MessageKind
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 60;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.MessageSort <em>Message Sort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.MessageSort
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageSort()
	 * @generated
	 */
	int MESSAGE_SORT = 61;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.TemperatureKind <em>Temperature Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.TemperatureKind
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getTemperatureKind()
	 * @generated
	 */
	int TEMPERATURE_KIND = 62;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.PartKind <em>Part Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.PartKind
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPartKind()
	 * @generated
	 */
	int PART_KIND = 63;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.ExecutionKind <em>Execution Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.ExecutionKind
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getExecutionKind()
	 * @generated
	 */
	int EXECUTION_KIND = 64;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.InteractionOperatorKind <em>Interaction Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.InteractionOperatorKind
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionOperatorKind()
	 * @generated
	 */
	int INTERACTION_OPERATOR_KIND = 65;

	/**
	 * The meta object id for the '{@link ModalSequenceDiagram.SpecificationKind <em>Specification Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModalSequenceDiagram.SpecificationKind
	 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getSpecificationKind()
	 * @generated
	 */
	int SPECIFICATION_KIND = 66;

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ModalSequenceDiagram.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see ModalSequenceDiagram.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see ModalSequenceDiagram.Package#getPackagedElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagedElement();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see ModalSequenceDiagram.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see ModalSequenceDiagram.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Classifier</em>'.
	 * @see ModalSequenceDiagram.StructuredClassifier
	 * @generated
	 */
	EClass getStructuredClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.StructuredClassifier#getOwnedConnector <em>Owned Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connector</em>'.
	 * @see ModalSequenceDiagram.StructuredClassifier#getOwnedConnector()
	 * @see #getStructuredClassifier()
	 * @generated
	 */
	EReference getStructuredClassifier_OwnedConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.StructuredClassifier#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see ModalSequenceDiagram.StructuredClassifier#getOwnedAttribute()
	 * @see #getStructuredClassifier()
	 * @generated
	 */
	EReference getStructuredClassifier_OwnedAttribute();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviored Classifier</em>'.
	 * @see ModalSequenceDiagram.BehavioredClassifier
	 * @generated
	 */
	EClass getBehavioredClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Behavior</em>'.
	 * @see ModalSequenceDiagram.BehavioredClassifier#getOwnedBehavior()
	 * @see #getBehavioredClassifier()
	 * @generated
	 */
	EReference getBehavioredClassifier_OwnedBehavior();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see ModalSequenceDiagram.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ModalSequenceDiagram.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see ModalSequenceDiagram.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifeline</em>'.
	 * @see ModalSequenceDiagram.Interaction#getLifeline()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Lifeline();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Interaction#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment</em>'.
	 * @see ModalSequenceDiagram.Interaction#getFragment()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Fragment();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Interaction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see ModalSequenceDiagram.Interaction#getMessage()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Interaction#getFormalGate <em>Formal Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Gate</em>'.
	 * @see ModalSequenceDiagram.Interaction#getFormalGate()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_FormalGate();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Interaction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see ModalSequenceDiagram.Interaction#getAction()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Action();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see ModalSequenceDiagram.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ModalSequenceDiagram.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Connector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see ModalSequenceDiagram.Connector#getEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_End();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see ModalSequenceDiagram.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the container reference '{@link ModalSequenceDiagram.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interaction</em>'.
	 * @see ModalSequenceDiagram.Lifeline#getInteraction()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Interaction();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.Lifeline#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see ModalSequenceDiagram.Lifeline#getRepresents()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Represents();

	/**
	 * Returns the meta object for the reference list '{@link ModalSequenceDiagram.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered By</em>'.
	 * @see ModalSequenceDiagram.Lifeline#getCoveredBy()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_CoveredBy();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Lifeline#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector</em>'.
	 * @see ModalSequenceDiagram.Lifeline#getSelector()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Selector();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.Lifeline#getDecomposedAs <em>Decomposed As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposed As</em>'.
	 * @see ModalSequenceDiagram.Lifeline#getDecomposedAs()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_DecomposedAs();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Fragment</em>'.
	 * @see ModalSequenceDiagram.InteractionFragment
	 * @generated
	 */
	EClass getInteractionFragment();

	/**
	 * Returns the meta object for the container reference '{@link ModalSequenceDiagram.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing Interaction</em>'.
	 * @see ModalSequenceDiagram.InteractionFragment#getEnclosingInteraction()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_EnclosingInteraction();

	/**
	 * Returns the meta object for the reference list '{@link ModalSequenceDiagram.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered</em>'.
	 * @see ModalSequenceDiagram.InteractionFragment#getCovered()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_Covered();

	/**
	 * Returns the meta object for the container reference '{@link ModalSequenceDiagram.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing Operand</em>'.
	 * @see ModalSequenceDiagram.InteractionFragment#getEnclosingOperand()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_EnclosingOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Ordering</em>'.
	 * @see ModalSequenceDiagram.InteractionFragment#getGeneralOrdering()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_GeneralOrdering();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable Element</em>'.
	 * @see ModalSequenceDiagram.ConnectableElement
	 * @generated
	 */
	EClass getConnectableElement();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ModalSequenceDiagram.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see ModalSequenceDiagram.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the container reference '{@link ModalSequenceDiagram.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interaction</em>'.
	 * @see ModalSequenceDiagram.Message#getInteraction()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Interaction();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.Message#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see ModalSequenceDiagram.Message#getSignature()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Message#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see ModalSequenceDiagram.Message#getArgument()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Argument();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Event</em>'.
	 * @see ModalSequenceDiagram.Message#getReceiveEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceiveEvent();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Event</em>'.
	 * @see ModalSequenceDiagram.Message#getSendEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendEvent();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.Message#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see ModalSequenceDiagram.Message#getConnector()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Connector();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.Message#getMessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Kind</em>'.
	 * @see ModalSequenceDiagram.Message#getMessageKind()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageKind();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.Message#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see ModalSequenceDiagram.Message#getMessageSort()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageSort();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message End</em>'.
	 * @see ModalSequenceDiagram.MessageEnd
	 * @generated
	 */
	EClass getMessageEnd();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.MessageEnd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see ModalSequenceDiagram.MessageEnd#getMessage()
	 * @see #getMessageEnd()
	 * @generated
	 */
	EReference getMessageEnd_Message();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Occurrence Specification</em>'.
	 * @see ModalSequenceDiagram.MessageOccurrenceSpecification
	 * @generated
	 */
	EClass getMessageOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.OccurrenceSpecification <em>Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence Specification</em>'.
	 * @see ModalSequenceDiagram.OccurrenceSpecification
	 * @generated
	 */
	EClass getOccurrenceSpecification();

	/**
	 * Returns the meta object for the reference list '{@link ModalSequenceDiagram.OccurrenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To After</em>'.
	 * @see ModalSequenceDiagram.OccurrenceSpecification#getToAfter()
	 * @see #getOccurrenceSpecification()
	 * @generated
	 */
	EReference getOccurrenceSpecification_ToAfter();

	/**
	 * Returns the meta object for the reference list '{@link ModalSequenceDiagram.OccurrenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Before</em>'.
	 * @see ModalSequenceDiagram.OccurrenceSpecification#getToBefore()
	 * @see #getOccurrenceSpecification()
	 * @generated
	 */
	EReference getOccurrenceSpecification_ToBefore();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Invariant</em>'.
	 * @see ModalSequenceDiagram.StateInvariant
	 * @generated
	 */
	EClass getStateInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link ModalSequenceDiagram.StateInvariant#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invariant</em>'.
	 * @see ModalSequenceDiagram.StateInvariant#getInvariant()
	 * @see #getStateInvariant()
	 * @generated
	 */
	EReference getStateInvariant_Invariant();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ModalSequenceDiagram.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ModalSequenceDiagram.Constraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see ModalSequenceDiagram.Constraint#getSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Specification();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see ModalSequenceDiagram.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Expression</em>'.
	 * @see ModalSequenceDiagram.OpaqueExpression
	 * @generated
	 */
	EClass getOpaqueExpression();

	/**
	 * Returns the meta object for the attribute list '{@link ModalSequenceDiagram.OpaqueExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Body</em>'.
	 * @see ModalSequenceDiagram.OpaqueExpression#getBody()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EAttribute getOpaqueExpression_Body();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ModalSequenceDiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.NamedElement#get_id <em>id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id</em>'.
	 * @see ModalSequenceDiagram.NamedElement#get_id()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement__id();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ModalSequenceDiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see ModalSequenceDiagram.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ModalSequenceDiagram.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Element</em>'.
	 * @see ModalSequenceDiagram.RedefinableElement
	 * @generated
	 */
	EClass getRedefinableElement();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see ModalSequenceDiagram.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector End</em>'.
	 * @see ModalSequenceDiagram.ConnectorEnd
	 * @generated
	 */
	EClass getConnectorEnd();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see ModalSequenceDiagram.ConnectorEnd#getRole()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Role();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.CallEvent <em>Call Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Event</em>'.
	 * @see ModalSequenceDiagram.CallEvent
	 * @generated
	 */
	EClass getCallEvent();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.CallEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see ModalSequenceDiagram.CallEvent#getOperation()
	 * @see #getCallEvent()
	 * @generated
	 */
	EReference getCallEvent_Operation();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ModalSequenceDiagram.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see ModalSequenceDiagram.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see ModalSequenceDiagram.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see ModalSequenceDiagram.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see ModalSequenceDiagram.Class#getOwnedOperation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedOperation();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see ModalSequenceDiagram.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.DestructionOccurenceSpecification <em>Destruction Occurence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destruction Occurence Specification</em>'.
	 * @see ModalSequenceDiagram.DestructionOccurenceSpecification
	 * @generated
	 */
	EClass getDestructionOccurenceSpecification();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ordering</em>'.
	 * @see ModalSequenceDiagram.GeneralOrdering
	 * @generated
	 */
	EClass getGeneralOrdering();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see ModalSequenceDiagram.GeneralOrdering#getBefore()
	 * @see #getGeneralOrdering()
	 * @generated
	 */
	EReference getGeneralOrdering_Before();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see ModalSequenceDiagram.GeneralOrdering#getAfter()
	 * @see #getGeneralOrdering()
	 * @generated
	 */
	EReference getGeneralOrdering_After();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ExecutionOccurrenceSpecification <em>Execution Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Occurrence Specification</em>'.
	 * @see ModalSequenceDiagram.ExecutionOccurrenceSpecification
	 * @generated
	 */
	EClass getExecutionOccurrenceSpecification();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution</em>'.
	 * @see ModalSequenceDiagram.ExecutionOccurrenceSpecification#getExecution()
	 * @see #getExecutionOccurrenceSpecification()
	 * @generated
	 */
	EReference getExecutionOccurrenceSpecification_Execution();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ActionExecutionSpecification <em>Action Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Execution Specification</em>'.
	 * @see ModalSequenceDiagram.ActionExecutionSpecification
	 * @generated
	 */
	EClass getActionExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.ActionExecutionSpecification#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ModalSequenceDiagram.ActionExecutionSpecification#getAction()
	 * @see #getActionExecutionSpecification()
	 * @generated
	 */
	EReference getActionExecutionSpecification_Action();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.BehaviorExecutionSpecification <em>Behavior Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Execution Specification</em>'.
	 * @see ModalSequenceDiagram.BehaviorExecutionSpecification
	 * @generated
	 */
	EClass getBehaviorExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see ModalSequenceDiagram.BehaviorExecutionSpecification#getBehavior()
	 * @see #getBehaviorExecutionSpecification()
	 * @generated
	 */
	EReference getBehaviorExecutionSpecification_Behavior();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see ModalSequenceDiagram.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ConsiderIgnoreFragment <em>Consider Ignore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consider Ignore Fragment</em>'.
	 * @see ModalSequenceDiagram.ConsiderIgnoreFragment
	 * @generated
	 */
	EClass getConsiderIgnoreFragment();

	/**
	 * Returns the meta object for the reference list '{@link ModalSequenceDiagram.ConsiderIgnoreFragment#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see ModalSequenceDiagram.ConsiderIgnoreFragment#getMessage()
	 * @see #getConsiderIgnoreFragment()
	 * @generated
	 */
	EReference getConsiderIgnoreFragment_Message();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuation</em>'.
	 * @see ModalSequenceDiagram.Continuation
	 * @generated
	 */
	EClass getContinuation();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.Continuation#isSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setting</em>'.
	 * @see ModalSequenceDiagram.Continuation#isSetting()
	 * @see #getContinuation()
	 * @generated
	 */
	EAttribute getContinuation_Setting();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.InteractionUse <em>Interaction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Use</em>'.
	 * @see ModalSequenceDiagram.InteractionUse
	 * @generated
	 */
	EClass getInteractionUse();

	/**
	 * Returns the meta object for the containment reference '{@link ModalSequenceDiagram.InteractionUse#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see ModalSequenceDiagram.InteractionUse#getReturnValue()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ReturnValue();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.InteractionUse#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see ModalSequenceDiagram.InteractionUse#getArgument()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_Argument();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.InteractionUse#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see ModalSequenceDiagram.InteractionUse#getRefersTo()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_RefersTo();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.InteractionUse#getActualGate <em>Actual Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Gate</em>'.
	 * @see ModalSequenceDiagram.InteractionUse#getActualGate()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ActualGate();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ModalMessage <em>Modal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Message</em>'.
	 * @see ModalSequenceDiagram.ModalMessage
	 * @generated
	 */
	EClass getModalMessage();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.ModalMessage#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution</em>'.
	 * @see ModalSequenceDiagram.ModalMessage#getExecution()
	 * @see #getModalMessage()
	 * @generated
	 */
	EAttribute getModalMessage_Execution();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.ModalMessage#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see ModalSequenceDiagram.ModalMessage#getTemperature()
	 * @see #getModalMessage()
	 * @generated
	 */
	EAttribute getModalMessage_Temperature();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ModalSequenceDiagram.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.Condition#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see ModalSequenceDiagram.Condition#getTemperature()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Temperature();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.TimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Condition</em>'.
	 * @see ModalSequenceDiagram.TimeCondition
	 * @generated
	 */
	EClass getTimeCondition();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.SpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Part</em>'.
	 * @see ModalSequenceDiagram.SpecificationPart
	 * @generated
	 */
	EClass getSpecificationPart();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.SpecificationPart#getPartKind <em>Part Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Kind</em>'.
	 * @see ModalSequenceDiagram.SpecificationPart#getPartKind()
	 * @see #getSpecificationPart()
	 * @generated
	 */
	EAttribute getSpecificationPart_PartKind();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulated Classifier</em>'.
	 * @see ModalSequenceDiagram.EncapsulatedClassifier
	 * @generated
	 */
	EClass getEncapsulatedClassifier();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Operand</em>'.
	 * @see ModalSequenceDiagram.InteractionOperand
	 * @generated
	 */
	EClass getInteractionOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment</em>'.
	 * @see ModalSequenceDiagram.InteractionOperand#getFragment()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Fragment();

	/**
	 * Returns the meta object for the containment reference '{@link ModalSequenceDiagram.InteractionOperand#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see ModalSequenceDiagram.InteractionOperand#getGuard()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Guard();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see ModalSequenceDiagram.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.CombinedFragment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see ModalSequenceDiagram.CombinedFragment#getOperand()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Operand();

	/**
	 * Returns the meta object for the containment reference list '{@link ModalSequenceDiagram.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfragment Gate</em>'.
	 * @see ModalSequenceDiagram.CombinedFragment#getCfragmentGate()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_CfragmentGate();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Operator</em>'.
	 * @see ModalSequenceDiagram.CombinedFragment#getInteractionOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_InteractionOperator();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Constraint</em>'.
	 * @see ModalSequenceDiagram.InteractionConstraint
	 * @generated
	 */
	EClass getInteractionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ModalSequenceDiagram.InteractionConstraint#getMaxint <em>Maxint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maxint</em>'.
	 * @see ModalSequenceDiagram.InteractionConstraint#getMaxint()
	 * @see #getInteractionConstraint()
	 * @generated
	 */
	EReference getInteractionConstraint_Maxint();

	/**
	 * Returns the meta object for the containment reference '{@link ModalSequenceDiagram.InteractionConstraint#getMinint <em>Minint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minint</em>'.
	 * @see ModalSequenceDiagram.InteractionConstraint#getMinint()
	 * @see #getInteractionConstraint()
	 * @generated
	 */
	EReference getInteractionConstraint_Minint();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ExecutionSpecification <em>Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Specification</em>'.
	 * @see ModalSequenceDiagram.ExecutionSpecification
	 * @generated
	 */
	EClass getExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.ExecutionSpecification#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see ModalSequenceDiagram.ExecutionSpecification#getFinish()
	 * @see #getExecutionSpecification()
	 * @generated
	 */
	EReference getExecutionSpecification_Finish();

	/**
	 * Returns the meta object for the reference '{@link ModalSequenceDiagram.ExecutionSpecification#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see ModalSequenceDiagram.ExecutionSpecification#getStart()
	 * @see #getExecutionSpecification()
	 * @generated
	 */
	EReference getExecutionSpecification_Start();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see ModalSequenceDiagram.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ModalSequenceDiagram.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Decomposition</em>'.
	 * @see ModalSequenceDiagram.PartDecomposition
	 * @generated
	 */
	EClass getPartDecomposition();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.ClockReset <em>Clock Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Reset</em>'.
	 * @see ModalSequenceDiagram.ClockReset
	 * @generated
	 */
	EClass getClockReset();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.MSDSpecification <em>MSD Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSD Specification</em>'.
	 * @see ModalSequenceDiagram.MSDSpecification
	 * @generated
	 */
	EClass getMSDSpecification();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.MSDSpecification#getSpecificationKind <em>Specification Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Kind</em>'.
	 * @see ModalSequenceDiagram.MSDSpecification#getSpecificationKind()
	 * @see #getMSDSpecification()
	 * @generated
	 */
	EAttribute getMSDSpecification_SpecificationKind();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.EnvironmentAssumption <em>Environment Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Assumption</em>'.
	 * @see ModalSequenceDiagram.EnvironmentAssumption
	 * @generated
	 */
	EClass getEnvironmentAssumption();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see ModalSequenceDiagram.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link ModalSequenceDiagram.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ModalSequenceDiagram.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link ModalSequenceDiagram.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Specification</em>'.
	 * @see ModalSequenceDiagram.LiteralSpecification
	 * @generated
	 */
	EClass getLiteralSpecification();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see ModalSequenceDiagram.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.MessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort</em>'.
	 * @see ModalSequenceDiagram.MessageSort
	 * @generated
	 */
	EEnum getMessageSort();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.TemperatureKind <em>Temperature Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temperature Kind</em>'.
	 * @see ModalSequenceDiagram.TemperatureKind
	 * @generated
	 */
	EEnum getTemperatureKind();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.PartKind <em>Part Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Part Kind</em>'.
	 * @see ModalSequenceDiagram.PartKind
	 * @generated
	 */
	EEnum getPartKind();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.ExecutionKind <em>Execution Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Kind</em>'.
	 * @see ModalSequenceDiagram.ExecutionKind
	 * @generated
	 */
	EEnum getExecutionKind();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.InteractionOperatorKind <em>Interaction Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Operator Kind</em>'.
	 * @see ModalSequenceDiagram.InteractionOperatorKind
	 * @generated
	 */
	EEnum getInteractionOperatorKind();

	/**
	 * Returns the meta object for enum '{@link ModalSequenceDiagram.SpecificationKind <em>Specification Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specification Kind</em>'.
	 * @see ModalSequenceDiagram.SpecificationKind
	 * @generated
	 */
	EEnum getSpecificationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModalSequenceDiagramFactory getModalSequenceDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ModelImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.PackageImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE
				.getPackage_PackagedElement();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.PackageableElementImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.CollaborationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.StructuredClassifierImpl <em>Structured Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.StructuredClassifierImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getStructuredClassifier()
		 * @generated
		 */
		EClass STRUCTURED_CLASSIFIER = eINSTANCE.getStructuredClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASSIFIER__OWNED_CONNECTOR = eINSTANCE
				.getStructuredClassifier_OwnedConnector();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE = eINSTANCE
				.getStructuredClassifier_OwnedAttribute();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.BehavioredClassifierImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehavioredClassifier()
		 * @generated
		 */
		EClass BEHAVIORED_CLASSIFIER = eINSTANCE.getBehavioredClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR = eINSTANCE
				.getBehavioredClassifier_OwnedBehavior();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ClassifierImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.TypeImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.InteractionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__LIFELINE = eINSTANCE.getInteraction_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FRAGMENT = eINSTANCE.getInteraction_Fragment();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__MESSAGE = eINSTANCE.getInteraction_Message();

		/**
		 * The meta object literal for the '<em><b>Formal Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FORMAL_GATE = eINSTANCE
				.getInteraction_FormalGate();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__ACTION = eINSTANCE.getInteraction_Action();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.BehaviorImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ConnectorImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__END = eINSTANCE.getConnector_End();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.LifelineImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__INTERACTION = eINSTANCE.getLifeline_Interaction();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__REPRESENTS = eINSTANCE.getLifeline_Represents();

		/**
		 * The meta object literal for the '<em><b>Covered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__COVERED_BY = eINSTANCE.getLifeline_CoveredBy();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__SELECTOR = eINSTANCE.getLifeline_Selector();

		/**
		 * The meta object literal for the '<em><b>Decomposed As</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__DECOMPOSED_AS = eINSTANCE
				.getLifeline_DecomposedAs();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.InteractionFragmentImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionFragment()
		 * @generated
		 */
		EClass INTERACTION_FRAGMENT = eINSTANCE.getInteractionFragment();

		/**
		 * The meta object literal for the '<em><b>Enclosing Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__ENCLOSING_INTERACTION = eINSTANCE
				.getInteractionFragment_EnclosingInteraction();

		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__COVERED = eINSTANCE
				.getInteractionFragment_Covered();

		/**
		 * The meta object literal for the '<em><b>Enclosing Operand</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__ENCLOSING_OPERAND = eINSTANCE
				.getInteractionFragment_EnclosingOperand();

		/**
		 * The meta object literal for the '<em><b>General Ordering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__GENERAL_ORDERING = eINSTANCE
				.getInteractionFragment_GeneralOrdering();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ConnectableElementImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConnectableElement()
		 * @generated
		 */
		EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.PropertyImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.MessageImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__INTERACTION = eINSTANCE.getMessage_Interaction();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SIGNATURE = eINSTANCE.getMessage_Signature();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ARGUMENT = eINSTANCE.getMessage_Argument();

		/**
		 * The meta object literal for the '<em><b>Receive Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVE_EVENT = eINSTANCE.getMessage_ReceiveEvent();

		/**
		 * The meta object literal for the '<em><b>Send Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SEND_EVENT = eINSTANCE.getMessage_SendEvent();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__CONNECTOR = eINSTANCE.getMessage_Connector();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_KIND = eINSTANCE.getMessage_MessageKind();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_SORT = eINSTANCE.getMessage_MessageSort();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.MessageEndImpl <em>Message End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.MessageEndImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageEnd()
		 * @generated
		 */
		EClass MESSAGE_END = eINSTANCE.getMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_END__MESSAGE = eINSTANCE.getMessageEnd_Message();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.MessageOccurrenceSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageOccurrenceSpecification()
		 * @generated
		 */
		EClass MESSAGE_OCCURRENCE_SPECIFICATION = eINSTANCE
				.getMessageOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.OccurrenceSpecificationImpl <em>Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.OccurrenceSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getOccurrenceSpecification()
		 * @generated
		 */
		EClass OCCURRENCE_SPECIFICATION = eINSTANCE
				.getOccurrenceSpecification();

		/**
		 * The meta object literal for the '<em><b>To After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE_SPECIFICATION__TO_AFTER = eINSTANCE
				.getOccurrenceSpecification_ToAfter();

		/**
		 * The meta object literal for the '<em><b>To Before</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE_SPECIFICATION__TO_BEFORE = eINSTANCE
				.getOccurrenceSpecification_ToBefore();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.StateInvariantImpl <em>State Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.StateInvariantImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getStateInvariant()
		 * @generated
		 */
		EClass STATE_INVARIANT = eINSTANCE.getStateInvariant();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_INVARIANT__INVARIANT = eINSTANCE
				.getStateInvariant_Invariant();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ConstraintImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SPECIFICATION = eINSTANCE
				.getConstraint_Specification();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ValueSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.OpaqueExpressionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getOpaqueExpression()
		 * @generated
		 */
		EClass OPAQUE_EXPRESSION = eINSTANCE.getOpaqueExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_EXPRESSION__BODY = eINSTANCE
				.getOpaqueExpression_Body();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.NamedElementImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement__id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.TypedElementImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.RedefinableElementImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getRedefinableElement()
		 * @generated
		 */
		EClass REDEFINABLE_ELEMENT = eINSTANCE.getRedefinableElement();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.FeatureImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ConnectorEndImpl <em>Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ConnectorEndImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConnectorEnd()
		 * @generated
		 */
		EClass CONNECTOR_END = eINSTANCE.getConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__ROLE = eINSTANCE.getConnectorEnd_Role();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.CallEventImpl <em>Call Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.CallEventImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCallEvent()
		 * @generated
		 */
		EClass CALL_EVENT = eINSTANCE.getCallEvent();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EVENT__OPERATION = eINSTANCE.getCallEvent_Operation();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.OperationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.MessageEventImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.EventImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ClassImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_OPERATION = eINSTANCE.getClass_OwnedOperation();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.BehavioralFeatureImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.DestructionOccurenceSpecificationImpl <em>Destruction Occurence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.DestructionOccurenceSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getDestructionOccurenceSpecification()
		 * @generated
		 */
		EClass DESTRUCTION_OCCURENCE_SPECIFICATION = eINSTANCE
				.getDestructionOccurenceSpecification();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.GeneralOrderingImpl <em>General Ordering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.GeneralOrderingImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getGeneralOrdering()
		 * @generated
		 */
		EClass GENERAL_ORDERING = eINSTANCE.getGeneralOrdering();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ORDERING__BEFORE = eINSTANCE
				.getGeneralOrdering_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ORDERING__AFTER = eINSTANCE
				.getGeneralOrdering_After();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ExecutionOccurrenceSpecificationImpl <em>Execution Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ExecutionOccurrenceSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getExecutionOccurrenceSpecification()
		 * @generated
		 */
		EClass EXECUTION_OCCURRENCE_SPECIFICATION = eINSTANCE
				.getExecutionOccurrenceSpecification();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION = eINSTANCE
				.getExecutionOccurrenceSpecification_Execution();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ActionExecutionSpecificationImpl <em>Action Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ActionExecutionSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getActionExecutionSpecification()
		 * @generated
		 */
		EClass ACTION_EXECUTION_SPECIFICATION = eINSTANCE
				.getActionExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION_SPECIFICATION__ACTION = eINSTANCE
				.getActionExecutionSpecification_Action();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.BehaviorExecutionSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getBehaviorExecutionSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_EXECUTION_SPECIFICATION = eINSTANCE
				.getBehaviorExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = eINSTANCE
				.getBehaviorExecutionSpecification_Behavior();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.NamespaceImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ConsiderIgnoreFragmentImpl <em>Consider Ignore Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ConsiderIgnoreFragmentImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getConsiderIgnoreFragment()
		 * @generated
		 */
		EClass CONSIDER_IGNORE_FRAGMENT = eINSTANCE.getConsiderIgnoreFragment();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSIDER_IGNORE_FRAGMENT__MESSAGE = eINSTANCE
				.getConsiderIgnoreFragment_Message();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ContinuationImpl <em>Continuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ContinuationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getContinuation()
		 * @generated
		 */
		EClass CONTINUATION = eINSTANCE.getContinuation();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUATION__SETTING = eINSTANCE.getContinuation_Setting();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.InteractionUseImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionUse()
		 * @generated
		 */
		EClass INTERACTION_USE = eINSTANCE.getInteractionUse();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__RETURN_VALUE = eINSTANCE
				.getInteractionUse_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__ARGUMENT = eINSTANCE
				.getInteractionUse_Argument();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__REFERS_TO = eINSTANCE
				.getInteractionUse_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Actual Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__ACTUAL_GATE = eINSTANCE
				.getInteractionUse_ActualGate();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ModalMessageImpl <em>Modal Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ModalMessageImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getModalMessage()
		 * @generated
		 */
		EClass MODAL_MESSAGE = eINSTANCE.getModalMessage();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL_MESSAGE__EXECUTION = eINSTANCE
				.getModalMessage_Execution();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL_MESSAGE__TEMPERATURE = eINSTANCE
				.getModalMessage_Temperature();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ConditionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TEMPERATURE = eINSTANCE
				.getCondition_Temperature();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.TimeConditionImpl <em>Time Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.TimeConditionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getTimeCondition()
		 * @generated
		 */
		EClass TIME_CONDITION = eINSTANCE.getTimeCondition();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.SpecificationPartImpl <em>Specification Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.SpecificationPartImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getSpecificationPart()
		 * @generated
		 */
		EClass SPECIFICATION_PART = eINSTANCE.getSpecificationPart();

		/**
		 * The meta object literal for the '<em><b>Part Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_PART__PART_KIND = eINSTANCE
				.getSpecificationPart_PartKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.EncapsulatedClassifierImpl <em>Encapsulated Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.EncapsulatedClassifierImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getEncapsulatedClassifier()
		 * @generated
		 */
		EClass ENCAPSULATED_CLASSIFIER = eINSTANCE.getEncapsulatedClassifier();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.InteractionOperandImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionOperand()
		 * @generated
		 */
		EClass INTERACTION_OPERAND = eINSTANCE.getInteractionOperand();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__FRAGMENT = eINSTANCE
				.getInteractionOperand_Fragment();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__GUARD = eINSTANCE
				.getInteractionOperand_Guard();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.CombinedFragmentImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__OPERAND = eINSTANCE
				.getCombinedFragment_Operand();

		/**
		 * The meta object literal for the '<em><b>Cfragment Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__CFRAGMENT_GATE = eINSTANCE
				.getCombinedFragment_CfragmentGate();

		/**
		 * The meta object literal for the '<em><b>Interaction Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__INTERACTION_OPERATOR = eINSTANCE
				.getCombinedFragment_InteractionOperator();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.InteractionConstraintImpl <em>Interaction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.InteractionConstraintImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionConstraint()
		 * @generated
		 */
		EClass INTERACTION_CONSTRAINT = eINSTANCE.getInteractionConstraint();

		/**
		 * The meta object literal for the '<em><b>Maxint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_CONSTRAINT__MAXINT = eINSTANCE
				.getInteractionConstraint_Maxint();

		/**
		 * The meta object literal for the '<em><b>Minint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_CONSTRAINT__MININT = eINSTANCE
				.getInteractionConstraint_Minint();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ExecutionSpecificationImpl <em>Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ExecutionSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getExecutionSpecification()
		 * @generated
		 */
		EClass EXECUTION_SPECIFICATION = eINSTANCE.getExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_SPECIFICATION__FINISH = eINSTANCE
				.getExecutionSpecification_Finish();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_SPECIFICATION__START = eINSTANCE
				.getExecutionSpecification_Start();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.GateImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ActionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.PartDecompositionImpl <em>Part Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.PartDecompositionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPartDecomposition()
		 * @generated
		 */
		EClass PART_DECOMPOSITION = eINSTANCE.getPartDecomposition();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.ClockResetImpl <em>Clock Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.ClockResetImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getClockReset()
		 * @generated
		 */
		EClass CLOCK_RESET = eINSTANCE.getClockReset();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.MSDSpecificationImpl <em>MSD Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.MSDSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMSDSpecification()
		 * @generated
		 */
		EClass MSD_SPECIFICATION = eINSTANCE.getMSDSpecification();

		/**
		 * The meta object literal for the '<em><b>Specification Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSD_SPECIFICATION__SPECIFICATION_KIND = eINSTANCE
				.getMSDSpecification_SpecificationKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.EnvironmentAssumptionImpl <em>Environment Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.EnvironmentAssumptionImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getEnvironmentAssumption()
		 * @generated
		 */
		EClass ENVIRONMENT_ASSUMPTION = eINSTANCE.getEnvironmentAssumption();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.LiteralStringImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.impl.LiteralSpecificationImpl
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getLiteralSpecification()
		 * @generated
		 */
		EClass LITERAL_SPECIFICATION = eINSTANCE.getLiteralSpecification();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.MessageKind
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.MessageSort <em>Message Sort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.MessageSort
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getMessageSort()
		 * @generated
		 */
		EEnum MESSAGE_SORT = eINSTANCE.getMessageSort();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.TemperatureKind <em>Temperature Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.TemperatureKind
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getTemperatureKind()
		 * @generated
		 */
		EEnum TEMPERATURE_KIND = eINSTANCE.getTemperatureKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.PartKind <em>Part Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.PartKind
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getPartKind()
		 * @generated
		 */
		EEnum PART_KIND = eINSTANCE.getPartKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.ExecutionKind <em>Execution Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.ExecutionKind
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getExecutionKind()
		 * @generated
		 */
		EEnum EXECUTION_KIND = eINSTANCE.getExecutionKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.InteractionOperatorKind <em>Interaction Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.InteractionOperatorKind
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getInteractionOperatorKind()
		 * @generated
		 */
		EEnum INTERACTION_OPERATOR_KIND = eINSTANCE
				.getInteractionOperatorKind();

		/**
		 * The meta object literal for the '{@link ModalSequenceDiagram.SpecificationKind <em>Specification Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModalSequenceDiagram.SpecificationKind
		 * @see ModalSequenceDiagram.impl.ModalSequenceDiagramPackageImpl#getSpecificationKind()
		 * @generated
		 */
		EEnum SPECIFICATION_KIND = eINSTANCE.getSpecificationKind();

	}

} //ModalSequenceDiagramPackage
