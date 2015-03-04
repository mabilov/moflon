package de.abilov.tgg.bpmn2usecase;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.util.eMoflonEMFUtil;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import UseCaseDSL.UseCaseStandaloneSetupGenerated;

import com.google.inject.Injector;

public abstract class BpmnToUseCaseSynchronizationHelper extends
		SynchronizationHelper {
	public BpmnToUseCaseSynchronizationHelper() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(BpmnToUseCaseIntegrationPackage.eINSTANCE);

		// Load rules and set correspondence
		setCorrPackage(BpmnToUseCaseIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}

	private String direction = forwardDirection;
	protected String corrFile;
	protected String protocolFile;
	private static final String forwardDirection = "forward";
	private static final String backwardDirection = "backward";

	protected String getDirection() {
		return this.direction;
	}

	private void setDirection(String direction) {
		if (direction.equals(forwardDirection)
				|| direction.equals(backwardDirection)) {
			this.direction = direction;
		} else {
			throw new IllegalArgumentException("Wrong direction " + direction);
		}
	}

	protected abstract void setFiles(Map<String, String> args);

	public void run(Map<String, String> args) throws IOException {
		if (args.get("direction") != null) {
			setDirection(args.get("direction"));
		}
		setFiles(args);
		perform();
	}

	private void perform() throws IOException {
		if (direction.equals(forwardDirection)) {
			performForward();
		} else if (direction.equals(backwardDirection)) {
			performBackward();
		}
	}

	protected abstract void performForward() throws IOException;

	protected abstract void performBackward() throws IOException;

	protected void serializeUseCase(String xmiFileName, String dslFileName)
			throws IOException {
		EObject root = eMoflonEMFUtil.loadModelWithDependencies(xmiFileName,
				getResourceSet());

		UseCaseStandaloneSetupGenerated useCaseStandalone = new UseCaseStandaloneSetupGenerated();
		Injector injector = useCaseStandalone
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		XtextResource resource = (XtextResource) resourceSet.createResource(
				URI.createFileURI(dslFileName), "usecase");
		resource.getContents().add(root);

		SaveOptions.Builder options = SaveOptions.newBuilder();
		options.format();
		options.noValidation();
		resource.save(options.getOptions().toOptionsMap());
	}

	protected void parseUseCase(String dslFileName, String xmiFileName) {
		UseCaseStandaloneSetupGenerated useCaseStandalone = new UseCaseStandaloneSetupGenerated();
		Injector injector = useCaseStandalone
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		XtextResource resource = (XtextResource) resourceSet.createResource(URI
				.createFileURI(dslFileName));

		eMoflonEMFUtil.saveModel(resource.getContents().get(0), xmiFileName);
	}
}
