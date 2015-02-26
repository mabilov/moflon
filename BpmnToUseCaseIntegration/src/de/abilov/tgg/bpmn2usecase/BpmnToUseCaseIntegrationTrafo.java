package de.abilov.tgg.bpmn2usecase;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.util.eMoflonEMFUtil;

import UseCaseDSL.UseCaseRuntimeModule;
import UseCaseDSL.UseCaseStandaloneSetupGenerated;

import com.google.inject.Guice;
import com.google.inject.Injector;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;


public class BpmnToUseCaseIntegrationTrafo extends SynchronizationHelper {

	public BpmnToUseCaseIntegrationTrafo() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(BpmnToUseCaseIntegrationPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(BpmnToUseCaseIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	private String direction = forwardDirection;
	private String sourceFile;
	private String targetFile;
	private String corrFile;
	private String protocolFile;
	private static final String forwardDirection="forward";
	private static final String backwardDirection="backward";
	
	public void run(String[] args) throws IOException {
		if (args.length > 0) {
        	setDirection(args[0].trim());
        }
        setFiles(args);
        perform();
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	private void setDirection(String direction) {
		if (direction.equals(forwardDirection) || direction.equals(backwardDirection)) {
			this.direction = direction;
		}
		else {
			throw new IllegalArgumentException("Wrong direction " + direction);
		}
	}
	
	private void setDefaultFiles() {
		sourceFile = direction + ".src.xmi";
		targetFile = direction + ".trg.xmi";
		corrFile = direction + ".corr.xmi";
		protocolFile = direction + ".protocol.xmi";
	}
	
	private void setFiles(String args[]) {
		if (args.length == 5) {
        	sourceFile = args[1];
        	targetFile = args[2];
        	corrFile = args[3];
        	protocolFile = args[4];
        } else {
        	setDefaultFiles();
        }
	}
	
	private void perform() 
			throws IOException {
		if (direction.equals(forwardDirection)) {
			performForward();
		}else if (direction.equals(backwardDirection)) {
			performBackward();
		}
	}

	private void performForward() 
			throws IOException {
		loadSrc(sourceFile);
		integrateForward();
		serializeUseCase(targetFile, getTrg());
		saveCorr(corrFile);
		saveSynchronizationProtocol(protocolFile);
	}
	
	private void serializeUseCase(String fileName, EObject root) 
			throws IOException {
		UseCaseStandaloneSetupGenerated useCaseStandalone = new UseCaseStandaloneSetupGenerated();
		Injector injector =  useCaseStandalone.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet =injector.getInstance(XtextResourceSet.class);
		XtextResource resource=(XtextResource)resourceSet.createResource(URI.createFileURI(fileName));
		resource.getContents().add(root);
		
		SaveOptions.Builder options=SaveOptions.newBuilder();
		options.format();
		options.noValidation();
		resource.save(options.getOptions().toOptionsMap());
	}
	private EObject parseUseCase(String fileName) {
		XtextResourceSet resourceSet = new XtextResourceSet();
		Resource resource = resourceSet.createResource(URI.createFileURI(fileName));
		return resource.getContents().get(0);
	}

	private void performBackward() {
		setTrg(parseUseCase(sourceFile));
		integrateBackward();
		saveSrc(targetFile);
		saveCorr(corrFile);
		saveSynchronizationProtocol(protocolFile);
	}
}