package csp.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;
import UseCaseDSL.ActorType;

public class EqActorType extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1) {
		ActorType attributeValue = (ActorType) var_0.getValue();
		String literalValueStr = var_1.getValue().toString();
		ActorType literalValue;
		try {
			literalValue = ActorType.valueOf(literalValueStr
					.toUpperCase());
		} catch (IllegalArgumentException e) { // Unable to parse literal value
			setSatisfied(false);
			return;
		}

		String bindingStates = getBindingStates(var_0, var_1);

		switch(bindingStates){
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