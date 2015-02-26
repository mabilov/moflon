package UseCaseDSL;

import org.eclipse.xtext.resource.IFragmentProvider;
import UseCaseDSL.resource.UseCaseFragmentProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class UseCaseRuntimeModule extends
		UseCaseDSL.AbstractUseCaseRuntimeModule {
	@Override
	public Class<? extends IFragmentProvider> bindIFragmentProvider() {
		return UseCaseFragmentProvider.class;
	}
}
