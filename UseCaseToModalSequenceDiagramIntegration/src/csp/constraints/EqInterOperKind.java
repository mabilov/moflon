package csp.constraints;

import org.eclipse.emf.common.util.Enumerator;

import ModalSequenceDiagram.InteractionOperatorKind;
import de.abilov.tgg.constraints.EqEnum;

public class EqInterOperKind extends EqEnum {
	
	@Override
	protected Enumerator getValueOf(String literal) {
		return InteractionOperatorKind.valueOf(literal);
	}
}