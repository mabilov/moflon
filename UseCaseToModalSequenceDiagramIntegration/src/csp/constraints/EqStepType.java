package csp.constraints;

import org.eclipse.emf.common.util.Enumerator;

import UseCaseDSL.StepType;
import de.abilov.tgg.constraints.EqEnum;

public class EqStepType extends EqEnum {

	@Override
	protected Enumerator getValueOf(String literal) {
		return StepType.valueOf(literal);
	}

}