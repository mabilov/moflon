package UseCaseDSL.tests;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;

import UseCaseDSL.UseCaseDSLPackage;
import UseCaseDSL.resource.UseCaseXMIHelper;

public class Xmi2TextSerializeTest {
	public static void main(String[] args) throws IOException {
		UseCaseDSLPackage packageInstance = UseCaseDSLPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(packageInstance.getNsURI(), packageInstance);
		UseCaseXMIHelper.serializeUseCase(args[0], args[1]);
		System.out.println("Completed " + args[0] + " to " + args[1]
				+ " serializtion!");
	}
}
