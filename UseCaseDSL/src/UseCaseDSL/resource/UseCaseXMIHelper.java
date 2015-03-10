package UseCaseDSL.resource;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import UseCaseDSL.UseCaseStandaloneSetupGenerated;

public class UseCaseXMIHelper {
	public static void serializeUseCase(String xmiFileName, String dslFileName)
			throws IOException {
		XtextResourceSet resourceSet = getResourceSet();
		XtextResource resource = (XtextResource) resourceSet.createResource(
				getUri(dslFileName), "usecase");
		resource.getContents().add(
				resourceSet.getResource(getUri(xmiFileName), true)
						.getContents().get(0));
		SaveOptions.Builder options = SaveOptions.newBuilder();
		options.format();
		options.noValidation();
		resource.save(options.getOptions().toOptionsMap());
	}

	public static void parseUseCase(String dslFileName, String xmiFileName)
			throws IOException {
		XtextResourceSet resourceSet = getResourceSet();
		Resource xmiResource = resourceSet.createResource(getUri(xmiFileName));
		xmiResource.getContents().add(
				resourceSet.createResource(URI.createFileURI(dslFileName))
						.getContents().get(0));
		xmiResource.save(null);
	}

	private static URI getUri(String fileName) {
		File filePath = new File(fileName);
		return URI.createFileURI(filePath.getAbsolutePath());
	}

	private static XtextResourceSet getResourceSet() {
		Map<String, Object> m = Resource.Factory.Registry.INSTANCE
				.getExtensionToFactoryMap();
		m.remove("*");
		m.put("xmi", new XMIResourceFactoryImpl());
		UseCaseStandaloneSetupGenerated useCaseStandalone = new UseCaseStandaloneSetupGenerated();
		XtextResourceSet resourceSet = useCaseStandalone
				.createInjectorAndDoEMFRegistration().getInstance(
						XtextResourceSet.class);
		// Add adapter for reverse navigation along unidirectional links
		ECrossReferenceAdapter adapter = ECrossReferenceAdapter
				.getCrossReferenceAdapter(resourceSet);
		if (adapter == null) {
			resourceSet.eAdapters().add(new ECrossReferenceAdapter());
		}
		return resourceSet;
	}
}
