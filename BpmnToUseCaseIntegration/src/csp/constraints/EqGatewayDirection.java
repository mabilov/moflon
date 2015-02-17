package csp.constraints;

import bpmn2.GatewayDirection;
import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

public class EqGatewayDirection extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
		GatewayDirection attributeValue = (GatewayDirection) var_0.getValue();
		String literalValueStr = var_1.getValue().toString();
		GatewayDirection literalValue;
		try{
			literalValue = GatewayDirection.valueOf(literalValueStr.toUpperCase());
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
    		// Cannot assign new value to enum literal
    		setSatisfied(true);
    	case "FB":
    		var_0.setValue(literalValue);
    		setSatisfied(true);
    	}
    	
  	}	  
}