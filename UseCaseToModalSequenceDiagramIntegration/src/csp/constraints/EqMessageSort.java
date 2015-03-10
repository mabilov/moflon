package csp.constraints;

import org.eclipse.emf.common.util.Enumerator;

import ModalSequenceDiagram.MessageSort;
import de.abilov.tgg.constraints.EqEnum;

public class EqMessageSort extends EqEnum {
	
	@Override
	protected Enumerator getValueOf(String literal) {
		return MessageSort.valueOf(literal);
	}	  
}