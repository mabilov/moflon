package csp.constraints;

import bpmn2.GatewayDirection;
import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

public class Eq_modelgenGatewayDirection extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
		GatewayDirection attributeValue = (GatewayDirection) var_0.getValue();
		GatewayDirection literalValue = GatewayDirection.valueOf(var_1.toString());
		
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "BB":
    		setSatisfied(attributeValue.equals(literalValue));
    		break;
    	case "BF":
    		// Cannot assign new value to enum literal
    		setSatisfied(true);
    	case "FB":
    		var_0.setValue(literalValue);
    		setSatisfied(true);
    	}
    	
  	}	  
}