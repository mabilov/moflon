/**
 */
package ModalSequenceDiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Specification Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage#getSpecificationKind()
 * @model
 * @generated
 */
public enum SpecificationKind implements Enumerator {
	/**
	 * The '<em><b>Untimed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTIMED_VALUE
	 * @generated
	 * @ordered
	 */
	UNTIMED(1, "Untimed", "UNTIMED"),

	/**
	 * The '<em><b>Timed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMED_VALUE
	 * @generated
	 * @ordered
	 */
	TIMED(2, "Timed", "TIMED");

	/**
	 * The '<em><b>Untimed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Untimed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNTIMED
	 * @model name="Untimed" literal="UNTIMED"
	 * @generated
	 * @ordered
	 */
	public static final int UNTIMED_VALUE = 1;

	/**
	 * The '<em><b>Timed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMED
	 * @model name="Timed" literal="TIMED"
	 * @generated
	 * @ordered
	 */
	public static final int TIMED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Specification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecificationKind[] VALUES_ARRAY = new SpecificationKind[] {
			UNTIMED, TIMED, };

	/**
	 * A public read-only list of all the '<em><b>Specification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecificationKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Specification Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecificationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specification Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecificationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specification Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationKind get(int value) {
		switch (value) {
		case UNTIMED_VALUE:
			return UNTIMED;
		case TIMED_VALUE:
			return TIMED;
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
	private SpecificationKind(int value, String name, String literal) {
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

} //SpecificationKind
