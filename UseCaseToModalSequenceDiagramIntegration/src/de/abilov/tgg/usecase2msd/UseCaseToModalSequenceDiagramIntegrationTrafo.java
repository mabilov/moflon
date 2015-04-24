package de.abilov.tgg.usecase2msd;

import java.io.IOException;
import java.util.Map;

import org.moflon.util.eMoflonEMFUtil;

import UseCaseDSL.resource.UseCaseXMIHelper;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;
import de.abilov.tgg.synch.SynchronizationHelper;

public class UseCaseToModalSequenceDiagramIntegrationTrafo extends
		SynchronizationHelper {

	public UseCaseToModalSequenceDiagramIntegrationTrafo() throws IOException {
		// Register packages
		eMoflonEMFUtil
				.init(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE);

		// Load rules and set correspondence
		setCorrPackage(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE);
		loadRulesFromProject("..");
	}

	private String sourceFile;
	private String targetFile;

	@Override
	protected void setFiles(Map<String, String> args) {
		sourceFile = args.getOrDefault("source", getDirection() + ".src.xmi");
		targetFile = args.getOrDefault("target", getDirection() + ".trg.xmi");
		corrFile = args.getOrDefault("corr", getDirection() + ".corr.xmi");
		protocolFile = args.getOrDefault("protocol", getDirection()
				+ ".protocol.xmi");
	}

	@Override
	protected void performForward() throws IOException {
		UseCaseXMIHelper.parseUseCase(sourceFile, sourceFile + ".xmi");
		loadSrc(sourceFile + ".xmi");
		integrateForward();
		saveTrg(targetFile);
		saveCorr(corrFile);
		saveSynchronizationProtocol(protocolFile);
	}

	@Override
	protected void performBackward() throws IOException {
		loadSrc(sourceFile);
		integrateForward();
		saveTrg(targetFile + ".xmi");
		saveCorr(corrFile);
		saveSynchronizationProtocol(protocolFile);
		UseCaseXMIHelper.serializeUseCase(targetFile + ".xmi", targetFile);
	}
}