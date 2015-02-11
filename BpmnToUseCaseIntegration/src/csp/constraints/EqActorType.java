package csp.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;

public class EqActorType extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "BB":
    		// TODO Implement BB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet.");
    	case "BF":
    		// TODO Implement BF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet.");
    	case "FB":
    		// TODO Implement FB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet.");
    	}
    	
  	}	  
}