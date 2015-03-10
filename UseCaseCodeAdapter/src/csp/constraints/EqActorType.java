package csp.constraints;

import org.eclipse.emf.common.util.Enumerator;

import UseCaseDSL.ActorType;
import de.abilov.tgg.constraints.EqEnum;

public class EqActorType extends EqEnum {
	@Override
	protected Enumerator getValueOf(String literal) {
		return ActorType.valueOf(literal);
	}
}