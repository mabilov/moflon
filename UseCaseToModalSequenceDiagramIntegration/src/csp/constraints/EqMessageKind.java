package csp.constraints;

import org.eclipse.emf.common.util.Enumerator;

import ModalSequenceDiagram.MessageKind;
import de.abilov.tgg.constraints.EqEnum;

public class EqMessageKind extends EqEnum {
	
	@Override
	protected Enumerator getValueOf(String literal) {
		return MessageKind.valueOf(literal);
	}	  
}