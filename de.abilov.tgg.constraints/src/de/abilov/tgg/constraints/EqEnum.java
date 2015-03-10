package de.abilov.tgg.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

import org.eclipse.emf.common.util.Enumerator;

public abstract class EqEnum extends TGGConstraintImpl {

	protected abstract Enumerator getValueOf(String literal);

	public void solve(Variable var_0, Variable var_1) {
		Enumerator attributeValue = (Enumerator) var_0.getValue();
		String literalValueStr = var_1.getValue().toString();
		Enumerator literalValue;
		try {
			literalValue = getValueOf(literalValueStr.toUpperCase());
		} catch (IllegalArgumentException e) { // Unable to parse literal value
			setSatisfied(false);
			return;
		}

		String bindingStates = getBindingStates(var_0, var_1);

		switch (bindingStates) {
		case "BB":
			setSatisfied(attributeValue.equals(literalValue));
			break;
		case "BF":
			var_1.setValue(attributeValue.getLiteral());
			setSatisfied(true);
			break;
		case "FB":
			var_0.setValue(literalValue);
			setSatisfied(true);
			break;
		default:
			setSatisfied(false);
			break;
		}
	}
}
