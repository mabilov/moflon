package csp.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

public class EqMessageKind extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "BB":
    		// TODO Implement BB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "BF":
    		// TODO Implement BF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FB":
    		// TODO Implement FB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}