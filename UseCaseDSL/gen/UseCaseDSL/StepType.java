/**
 */
package UseCaseDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see UseCaseDSL.UseCaseDSLPackage#getStepType()
 * @model
 * @generated
 */
public enum StepType implements Enumerator {
	/**
	 * The '<em><b>ALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT_VALUE
	 * @generated
	 * @ordered
	 */
	ALT(5, "ALT", "alt"),

	/**
	 * The '<em><b>WAIT ALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_ALT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT_ALT(6, "WAIT_ALT", "wait_alt"),

	/**
	 * The '<em><b>WAIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT(1, "WAIT", "wait"),

	/**
	 * The '<em><b>SEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_VALUE
	 * @generated
	 * @ordered
	 */
	SEND(2, "SEND", "send"),

	/**
	 * The '<em><b>PERFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORM_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORM(3, "PERFORM", "perform"),

	/**
	 * The '<em><b>CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALL_VALUE
	 * @generated
	 * @ordered
	 */
	CALL(4, "CALL", "call");

	/**
	 * The '<em><b>ALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @model literal="alt"
	 * @generated
	 * @ordered
	 */
	public static final int ALT_VALUE = 5;

	/**
	 * The '<em><b>WAIT ALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAIT ALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAIT_ALT
	 * @model literal="wait_alt"
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_ALT_VALUE = 6;

	/**
	 * The '<em><b>WAIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAIT
	 * @model literal="wait"
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_VALUE = 1;

	/**
	 * The '<em><b>SEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND
	 * @model literal="send"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_VALUE = 2;

	/**
	 * The '<em><b>PERFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORM
	 * @model literal="perform"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORM_VALUE = 3;

	/**
	 * The '<em><b>CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALL
	 * @model literal="call"
	 * @generated
	 * @ordered
	 */
	public static final int CALL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Step Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StepType[] VALUES_ARRAY = new StepType[] { ALT,
			WAIT_ALT, WAIT, SEND, PERFORM, CALL, };

	/**
	 * A public read-only list of all the '<em><b>Step Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StepType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Step Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepType get(int value) {
		switch (value) {
		case ALT_VALUE:
			return ALT;
		case WAIT_ALT_VALUE:
			return WAIT_ALT;
		case WAIT_VALUE:
			return WAIT;
		case SEND_VALUE:
			return SEND;
		case PERFORM_VALUE:
			return PERFORM;
		case CALL_VALUE:
			return CALL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StepType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //StepType
