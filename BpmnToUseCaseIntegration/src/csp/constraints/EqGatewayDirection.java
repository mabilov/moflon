package csp.constraints;

import org.eclipse.emf.common.util.Enumerator;

import bpmn2.GatewayDirection;
import de.abilov.tgg.constraints.EqEnum;

public class EqGatewayDirection extends EqEnum {

	@Override
	protected Enumerator getValueOf(String literal) {
		return GatewayDirection.valueOf(literal);
	}
}