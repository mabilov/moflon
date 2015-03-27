package csp.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

public class IsEmpty extends TGGConstraintImpl {
	public void solve(Variable var_0) {
		Object value = var_0.getValue();
		String bindingStates = getBindingStates(var_0);

		switch (bindingStates) {
		case "B":
			setSatisfied(value == null || value.toString().isEmpty());
			break;
		case "F":
			var_0.setValue(null);
			setSatisfied(true);
			break;
		default:
			setSatisfied(false);
			break;
		}

	}
}