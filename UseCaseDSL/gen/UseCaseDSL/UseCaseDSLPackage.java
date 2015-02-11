/**
 */
package UseCaseDSL;

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
 * @see UseCaseDSL.UseCaseDSLFactory
 * @model kind="package"
 * @generated
 */
public interface UseCaseDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UseCaseDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/UseCaseDSL/model/UseCaseDSL.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UseCaseDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UseCaseDSLPackage eINSTANCE = UseCaseDSL.impl.UseCaseDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.ActorImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EXTENDS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.FlowImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 6;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FINAL_STATE = 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.NamedFlowImpl <em>Named Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.NamedFlowImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getNamedFlow()
	 * @generated
	 */
	int NAMED_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__STEPS = FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__FINAL_STATE = FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__NAME = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.AlternativeFlowImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getAlternativeFlow()
	 * @generated
	 */
	int ALTERNATIVE_FLOW = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__STEPS = NAMED_FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__FINAL_STATE = NAMED_FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__NAME = NAMED_FLOW__NAME;

	/**
	 * The number of structural features of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_FEATURE_COUNT = NAMED_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_OPERATION_COUNT = NAMED_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.StepAlternativeImpl <em>Step Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.StepAlternativeImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getStepAlternative()
	 * @generated
	 */
	int STEP_ALTERNATIVE = 14;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE__CONTINUATION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Step Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Step Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.AlternativeFlowAlternativeImpl <em>Alternative Flow Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.AlternativeFlowAlternativeImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getAlternativeFlowAlternative()
	 * @generated
	 */
	int ALTERNATIVE_FLOW_ALTERNATIVE = 2;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_ALTERNATIVE__CONTINUATION = STEP_ALTERNATIVE__CONTINUATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_ALTERNATIVE__CONDITION = STEP_ALTERNATIVE__CONDITION;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_ALTERNATIVE__REF = STEP_ALTERNATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Flow Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_ALTERNATIVE_FEATURE_COUNT = STEP_ALTERNATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative Flow Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_ALTERNATIVE_OPERATION_COUNT = STEP_ALTERNATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.BasicFlowImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getBasicFlow()
	 * @generated
	 */
	int BASIC_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__STEPS = FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__FINAL_STATE = FLOW__FINAL_STATE;

	/**
	 * The number of structural features of the '<em>Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.ConditionImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONTINUATION = STEP_ALTERNATIVE__CONTINUATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = STEP_ALTERNATIVE__CONDITION;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STEP_ALTERNATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = STEP_ALTERNATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.ExceptionFlowImpl <em>Exception Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.ExceptionFlowImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getExceptionFlow()
	 * @generated
	 */
	int EXCEPTION_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__STEPS = NAMED_FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__FINAL_STATE = NAMED_FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__NAME = NAMED_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__CONDITION = NAMED_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW_FEATURE_COUNT = NAMED_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exception Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW_OPERATION_COUNT = NAMED_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.LocalAlternativeImpl <em>Local Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.LocalAlternativeImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getLocalAlternative()
	 * @generated
	 */
	int LOCAL_ALTERNATIVE = 7;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ALTERNATIVE__CONTINUATION = STEP_ALTERNATIVE__CONTINUATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ALTERNATIVE__CONDITION = STEP_ALTERNATIVE__CONDITION;

	/**
	 * The feature id for the '<em><b>Invoked Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ALTERNATIVE__INVOKED_USE_CASE = STEP_ALTERNATIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ALTERNATIVE__DESCRIPTION = STEP_ALTERNATIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ALTERNATIVE_FEATURE_COUNT = STEP_ALTERNATIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ALTERNATIVE_OPERATION_COUNT = STEP_ALTERNATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.StepImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 13;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Invoked Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INVOKED_USE_CASE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.NormalStepImpl <em>Normal Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.NormalStepImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getNormalStep()
	 * @generated
	 */
	int NORMAL_STEP = 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__NEXT = STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Invoked Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__INVOKED_USE_CASE = STEP__INVOKED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__LABEL = STEP__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Step Alternative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__STEP_ALTERNATIVE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__ACTOR = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Step Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__CUSTOM_STEP_TYPE = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.PackageDeclarationImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getPackageDeclaration()
	 * @generated
	 */
	int PACKAGE_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__USE_CASES = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.ParallelFlowImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getParallelFlow()
	 * @generated
	 */
	int PARALLEL_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__STEPS = NAMED_FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__FINAL_STATE = NAMED_FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__NAME = NAMED_FLOW__NAME;

	/**
	 * The number of structural features of the '<em>Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_FEATURE_COUNT = NAMED_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_OPERATION_COUNT = NAMED_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.ParallelStepImpl <em>Parallel Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.ParallelStepImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getParallelStep()
	 * @generated
	 */
	int PARALLEL_STEP = 12;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__NEXT = STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Invoked Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__INVOKED_USE_CASE = STEP__INVOKED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__LABEL = STEP__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Invoked Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__INVOKED_FLOWS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.UseCaseImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 15;

	/**
	 * The feature id for the '<em><b>Super Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__SUPER_CASE = 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__FLOWS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PRE_CONDITIONS = 4;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__POSTCONDITION = 5;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.impl.UseCasesModelImpl <em>Use Cases Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.impl.UseCasesModelImpl
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getUseCasesModel()
	 * @generated
	 */
	int USE_CASES_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASES_MODEL__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>Use Cases Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASES_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Cases Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASES_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UseCaseDSL.ActorType <em>Actor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.ActorType
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getActorType()
	 * @generated
	 */
	int ACTOR_TYPE = 17;

	/**
	 * The meta object id for the '{@link UseCaseDSL.CustomStepType <em>Custom Step Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UseCaseDSL.CustomStepType
	 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getCustomStepType()
	 * @generated
	 */
	int CUSTOM_STEP_TYPE = 18;

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see UseCaseDSL.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.Actor#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see UseCaseDSL.Actor#getExtends()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Extends();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.Actor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UseCaseDSL.Actor#getDescription()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Description();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UseCaseDSL.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.Actor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see UseCaseDSL.Actor#getType()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Type();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Flow</em>'.
	 * @see UseCaseDSL.AlternativeFlow
	 * @generated
	 */
	EClass getAlternativeFlow();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.AlternativeFlowAlternative <em>Alternative Flow Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Flow Alternative</em>'.
	 * @see UseCaseDSL.AlternativeFlowAlternative
	 * @generated
	 */
	EClass getAlternativeFlowAlternative();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.AlternativeFlowAlternative#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see UseCaseDSL.AlternativeFlowAlternative#getRef()
	 * @see #getAlternativeFlowAlternative()
	 * @generated
	 */
	EReference getAlternativeFlowAlternative_Ref();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Flow</em>'.
	 * @see UseCaseDSL.BasicFlow
	 * @generated
	 */
	EClass getBasicFlow();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see UseCaseDSL.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.ExceptionFlow <em>Exception Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Flow</em>'.
	 * @see UseCaseDSL.ExceptionFlow
	 * @generated
	 */
	EClass getExceptionFlow();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.ExceptionFlow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see UseCaseDSL.ExceptionFlow#getCondition()
	 * @see #getExceptionFlow()
	 * @generated
	 */
	EAttribute getExceptionFlow_Condition();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see UseCaseDSL.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link UseCaseDSL.Flow#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see UseCaseDSL.Flow#getSteps()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Steps();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.Flow#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final State</em>'.
	 * @see UseCaseDSL.Flow#getFinalState()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_FinalState();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.LocalAlternative <em>Local Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Alternative</em>'.
	 * @see UseCaseDSL.LocalAlternative
	 * @generated
	 */
	EClass getLocalAlternative();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.LocalAlternative#getInvokedUseCase <em>Invoked Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Use Case</em>'.
	 * @see UseCaseDSL.LocalAlternative#getInvokedUseCase()
	 * @see #getLocalAlternative()
	 * @generated
	 */
	EReference getLocalAlternative_InvokedUseCase();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.LocalAlternative#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UseCaseDSL.LocalAlternative#getDescription()
	 * @see #getLocalAlternative()
	 * @generated
	 */
	EAttribute getLocalAlternative_Description();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.NamedFlow <em>Named Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Flow</em>'.
	 * @see UseCaseDSL.NamedFlow
	 * @generated
	 */
	EClass getNamedFlow();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.NamedFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UseCaseDSL.NamedFlow#getName()
	 * @see #getNamedFlow()
	 * @generated
	 */
	EAttribute getNamedFlow_Name();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step</em>'.
	 * @see UseCaseDSL.NormalStep
	 * @generated
	 */
	EClass getNormalStep();

	/**
	 * Returns the meta object for the containment reference list '{@link UseCaseDSL.NormalStep#getStepAlternative <em>Step Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Alternative</em>'.
	 * @see UseCaseDSL.NormalStep#getStepAlternative()
	 * @see #getNormalStep()
	 * @generated
	 */
	EReference getNormalStep_StepAlternative();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.NormalStep#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see UseCaseDSL.NormalStep#getActor()
	 * @see #getNormalStep()
	 * @generated
	 */
	EReference getNormalStep_Actor();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.NormalStep#getCustomStepType <em>Custom Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Step Type</em>'.
	 * @see UseCaseDSL.NormalStep#getCustomStepType()
	 * @see #getNormalStep()
	 * @generated
	 */
	EAttribute getNormalStep_CustomStepType();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Declaration</em>'.
	 * @see UseCaseDSL.PackageDeclaration
	 * @generated
	 */
	EClass getPackageDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link UseCaseDSL.PackageDeclaration#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Cases</em>'.
	 * @see UseCaseDSL.PackageDeclaration#getUseCases()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EReference getPackageDeclaration_UseCases();

	/**
	 * Returns the meta object for the containment reference list '{@link UseCaseDSL.PackageDeclaration#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see UseCaseDSL.PackageDeclaration#getActors()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EReference getPackageDeclaration_Actors();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.PackageDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UseCaseDSL.PackageDeclaration#getName()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EAttribute getPackageDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.PackageDeclaration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UseCaseDSL.PackageDeclaration#getDescription()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EAttribute getPackageDeclaration_Description();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.ParallelFlow <em>Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Flow</em>'.
	 * @see UseCaseDSL.ParallelFlow
	 * @generated
	 */
	EClass getParallelFlow();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.ParallelStep <em>Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Step</em>'.
	 * @see UseCaseDSL.ParallelStep
	 * @generated
	 */
	EClass getParallelStep();

	/**
	 * Returns the meta object for the reference list '{@link UseCaseDSL.ParallelStep#getInvokedFlows <em>Invoked Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoked Flows</em>'.
	 * @see UseCaseDSL.ParallelStep#getInvokedFlows()
	 * @see #getParallelStep()
	 * @generated
	 */
	EReference getParallelStep_InvokedFlows();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see UseCaseDSL.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.Step#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see UseCaseDSL.Step#getNext()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Next();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.Step#getInvokedUseCase <em>Invoked Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Use Case</em>'.
	 * @see UseCaseDSL.Step#getInvokedUseCase()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InvokedUseCase();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.Step#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see UseCaseDSL.Step#getLabel()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Label();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UseCaseDSL.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.StepAlternative <em>Step Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Alternative</em>'.
	 * @see UseCaseDSL.StepAlternative
	 * @generated
	 */
	EClass getStepAlternative();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.StepAlternative#getContinuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continuation</em>'.
	 * @see UseCaseDSL.StepAlternative#getContinuation()
	 * @see #getStepAlternative()
	 * @generated
	 */
	EReference getStepAlternative_Continuation();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.StepAlternative#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see UseCaseDSL.StepAlternative#getCondition()
	 * @see #getStepAlternative()
	 * @generated
	 */
	EAttribute getStepAlternative_Condition();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see UseCaseDSL.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the reference '{@link UseCaseDSL.UseCase#getSuperCase <em>Super Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Case</em>'.
	 * @see UseCaseDSL.UseCase#getSuperCase()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_SuperCase();

	/**
	 * Returns the meta object for the containment reference list '{@link UseCaseDSL.UseCase#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see UseCaseDSL.UseCase#getFlows()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Flows();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.UseCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UseCaseDSL.UseCase#getDescription()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Description();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.UseCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UseCaseDSL.UseCase#getName()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.UseCase#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Conditions</em>'.
	 * @see UseCaseDSL.UseCase#getPreConditions()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_PreConditions();

	/**
	 * Returns the meta object for the attribute '{@link UseCaseDSL.UseCase#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see UseCaseDSL.UseCase#getPostcondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Postcondition();

	/**
	 * Returns the meta object for class '{@link UseCaseDSL.UseCasesModel <em>Use Cases Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Cases Model</em>'.
	 * @see UseCaseDSL.UseCasesModel
	 * @generated
	 */
	EClass getUseCasesModel();

	/**
	 * Returns the meta object for the containment reference list '{@link UseCaseDSL.UseCasesModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see UseCaseDSL.UseCasesModel#getPackages()
	 * @see #getUseCasesModel()
	 * @generated
	 */
	EReference getUseCasesModel_Packages();

	/**
	 * Returns the meta object for enum '{@link UseCaseDSL.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Type</em>'.
	 * @see UseCaseDSL.ActorType
	 * @generated
	 */
	EEnum getActorType();

	/**
	 * Returns the meta object for enum '{@link UseCaseDSL.CustomStepType <em>Custom Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Custom Step Type</em>'.
	 * @see UseCaseDSL.CustomStepType
	 * @generated
	 */
	EEnum getCustomStepType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UseCaseDSLFactory getUseCaseDSLFactory();

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
		 * The meta object literal for the '{@link UseCaseDSL.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.ActorImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__EXTENDS = eINSTANCE.getActor_Extends();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__DESCRIPTION = eINSTANCE.getActor_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.AlternativeFlowImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getAlternativeFlow()
		 * @generated
		 */
		EClass ALTERNATIVE_FLOW = eINSTANCE.getAlternativeFlow();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.AlternativeFlowAlternativeImpl <em>Alternative Flow Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.AlternativeFlowAlternativeImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getAlternativeFlowAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE_FLOW_ALTERNATIVE = eINSTANCE
				.getAlternativeFlowAlternative();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_FLOW_ALTERNATIVE__REF = eINSTANCE
				.getAlternativeFlowAlternative_Ref();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.BasicFlowImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getBasicFlow()
		 * @generated
		 */
		EClass BASIC_FLOW = eINSTANCE.getBasicFlow();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.ConditionImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.ExceptionFlowImpl <em>Exception Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.ExceptionFlowImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getExceptionFlow()
		 * @generated
		 */
		EClass EXCEPTION_FLOW = eINSTANCE.getExceptionFlow();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_FLOW__CONDITION = eINSTANCE
				.getExceptionFlow_Condition();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.FlowImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STEPS = eINSTANCE.getFlow_Steps();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__FINAL_STATE = eINSTANCE.getFlow_FinalState();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.LocalAlternativeImpl <em>Local Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.LocalAlternativeImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getLocalAlternative()
		 * @generated
		 */
		EClass LOCAL_ALTERNATIVE = eINSTANCE.getLocalAlternative();

		/**
		 * The meta object literal for the '<em><b>Invoked Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_ALTERNATIVE__INVOKED_USE_CASE = eINSTANCE
				.getLocalAlternative_InvokedUseCase();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ALTERNATIVE__DESCRIPTION = eINSTANCE
				.getLocalAlternative_Description();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.NamedFlowImpl <em>Named Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.NamedFlowImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getNamedFlow()
		 * @generated
		 */
		EClass NAMED_FLOW = eINSTANCE.getNamedFlow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_FLOW__NAME = eINSTANCE.getNamedFlow_Name();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.NormalStepImpl <em>Normal Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.NormalStepImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getNormalStep()
		 * @generated
		 */
		EClass NORMAL_STEP = eINSTANCE.getNormalStep();

		/**
		 * The meta object literal for the '<em><b>Step Alternative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_STEP__STEP_ALTERNATIVE = eINSTANCE
				.getNormalStep_StepAlternative();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_STEP__ACTOR = eINSTANCE.getNormalStep_Actor();

		/**
		 * The meta object literal for the '<em><b>Custom Step Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_STEP__CUSTOM_STEP_TYPE = eINSTANCE
				.getNormalStep_CustomStepType();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.PackageDeclarationImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getPackageDeclaration()
		 * @generated
		 */
		EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION__USE_CASES = eINSTANCE
				.getPackageDeclaration_UseCases();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION__ACTORS = eINSTANCE
				.getPackageDeclaration_Actors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE
				.getPackageDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DECLARATION__DESCRIPTION = eINSTANCE
				.getPackageDeclaration_Description();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.ParallelFlowImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getParallelFlow()
		 * @generated
		 */
		EClass PARALLEL_FLOW = eINSTANCE.getParallelFlow();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.ParallelStepImpl <em>Parallel Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.ParallelStepImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getParallelStep()
		 * @generated
		 */
		EClass PARALLEL_STEP = eINSTANCE.getParallelStep();

		/**
		 * The meta object literal for the '<em><b>Invoked Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_STEP__INVOKED_FLOWS = eINSTANCE
				.getParallelStep_InvokedFlows();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.StepImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NEXT = eINSTANCE.getStep_Next();

		/**
		 * The meta object literal for the '<em><b>Invoked Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INVOKED_USE_CASE = eINSTANCE.getStep_InvokedUseCase();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__LABEL = eINSTANCE.getStep_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.StepAlternativeImpl <em>Step Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.StepAlternativeImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getStepAlternative()
		 * @generated
		 */
		EClass STEP_ALTERNATIVE = eINSTANCE.getStepAlternative();

		/**
		 * The meta object literal for the '<em><b>Continuation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_ALTERNATIVE__CONTINUATION = eINSTANCE
				.getStepAlternative_Continuation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_ALTERNATIVE__CONDITION = eINSTANCE
				.getStepAlternative_Condition();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.UseCaseImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Super Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__SUPER_CASE = eINSTANCE.getUseCase_SuperCase();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__FLOWS = eINSTANCE.getUseCase_Flows();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__DESCRIPTION = eINSTANCE.getUseCase_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

		/**
		 * The meta object literal for the '<em><b>Pre Conditions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__PRE_CONDITIONS = eINSTANCE
				.getUseCase_PreConditions();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__POSTCONDITION = eINSTANCE
				.getUseCase_Postcondition();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.impl.UseCasesModelImpl <em>Use Cases Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.impl.UseCasesModelImpl
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getUseCasesModel()
		 * @generated
		 */
		EClass USE_CASES_MODEL = eINSTANCE.getUseCasesModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASES_MODEL__PACKAGES = eINSTANCE
				.getUseCasesModel_Packages();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.ActorType <em>Actor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.ActorType
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getActorType()
		 * @generated
		 */
		EEnum ACTOR_TYPE = eINSTANCE.getActorType();

		/**
		 * The meta object literal for the '{@link UseCaseDSL.CustomStepType <em>Custom Step Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UseCaseDSL.CustomStepType
		 * @see UseCaseDSL.impl.UseCaseDSLPackageImpl#getCustomStepType()
		 * @generated
		 */
		EEnum CUSTOM_STEP_TYPE = eINSTANCE.getCustomStepType();

	}

} //UseCaseDSLPackage
