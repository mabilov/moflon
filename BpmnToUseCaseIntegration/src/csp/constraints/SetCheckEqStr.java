package csp.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

public class SetCheckEqStr extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1) {
		Object value0 = var_0.getValue();
		Object value1 = var_1.getValue();
		String bindingStates = getBindingStates(var_0, var_1);

		switch (bindingStates) {
		case "BB":
			if ((value0 == null || value0.toString().isEmpty())
					&& value1 != null) {
				var_0.bindToValue(value1.toString());
				setSatisfied(true);
			} else if ((value1 == null || value1.toString().isEmpty())
					&& value0 != null) {
				var_1.bindToValue(value0.toString());
				setSatisfied(true);
			} else if (value0 == null && value1 == null) {
				setSatisfied(true);
			} else {
				setSatisfied(value0.equals(value1));
			}
			break;
		case "BF":
			var_0.setValue(value1);
			setSatisfied(true);
			break;
		case "FB":
			var_1.setValue(value0);
			setSatisfied(true);
			break;
		}

	}
}