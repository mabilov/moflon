package de.abilov.tgg.bpmn2usecase;

import java.io.IOException;
import java.util.Map;

public class BpmnToUseCaseIntegrationTrafo extends
		BpmnToUseCaseSynchronizationHelper {

	public BpmnToUseCaseIntegrationTrafo() throws IOException {
		super();
	}
	
	private String sourceFile;
	private String targetFile;
	
	@Override
	protected void setFiles(Map<String, String> args) {
		sourceFile = args.getOrDefault("source", getDirection() + ".src.xmi");
		targetFile = args.getOrDefault("target", getDirection() + ".trg.xmi");
		corrFile = args.getOrDefault("corr", getDirection() + ".corr.xmi");
		protocolFile = args.getOrDefault("protocol", getDirection() + ".protocol.xmi");
	}

	@Override
	protected void performForward() throws IOException {
		loadSrc(sourceFile);
		integrateForward();
		saveTrg(targetFile + ".xmi");
		saveCorr(corrFile);
		saveSynchronizationProtocol(protocolFile);
		serializeUseCase(targetFile + ".xmi", targetFile);
	}

	protected void performBackward() throws IOException {
		parseUseCase(sourceFile, sourceFile + ".xmi");
		loadTrg(sourceFile + ".xmi");
		integrateBackward();
		saveSrc(targetFile);
		saveCorr(corrFile);
		saveSynchronizationProtocol(protocolFile);
	}
}