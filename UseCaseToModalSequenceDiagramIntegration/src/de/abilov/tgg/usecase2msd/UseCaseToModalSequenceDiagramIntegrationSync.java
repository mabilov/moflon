package de.abilov.tgg.usecase2msd;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.moflon.core.utilities.eMoflonEMFUtil;

import UseCaseDSL.resource.UseCaseXMIHelper;
import UseCaseToModalSequenceDiagramIntegration.UseCaseToModalSequenceDiagramIntegrationPackage;
import de.abilov.tgg.synch.SynchronizationHelper;

public class UseCaseToModalSequenceDiagramIntegrationSync extends
		SynchronizationHelper {

	public UseCaseToModalSequenceDiagramIntegrationSync() {
		super(UseCaseToModalSequenceDiagramIntegrationPackage.eINSTANCE, ".");
	}

	private String newSourceFile;
	private String newTargetFile;
	private String newCorrFile;
	private String newProtocolFile;

	@Override
	protected void setFiles(Map<String, String> args) {
		corrFile = args.getOrDefault("corr", getDirection() + ".corr.xmi");
		protocolFile = args.getOrDefault("protocol", getDirection()
				+ ".protocol.xmi");
		newSourceFile = args.getOrDefault("new-source", "sync."
				+ getDirection() + ".src.usecase");
		newTargetFile = args.getOrDefault("new-target", "sync."
				+ getDirection() + ".trg.uml");
		newCorrFile = args.getOrDefault("new-corr", "sync." + getDirection()
				+ ".corr.xmi");
		newProtocolFile = args.getOrDefault("new-protocol", "sync."
				+ getDirection() + ".protocol.xmi");
	}

	@Override
	protected void performForward() throws IOException {
		UseCaseXMIHelper.parseUseCase(newSourceFile, newSourceFile + ".xmi");
		final EObject newSrc = eMoflonEMFUtil.loadModelWithDependencies(
				newSourceFile, getResourceSet());
		setChangeSrc(root -> {
			mergeRightToLeft(root, newSrc);
		});

		loadTriple(corrFile);
		loadSynchronizationProtocol(protocolFile);
		integrateForward();
		saveResult();
	}

	@Override
	protected void performBackward() throws IOException {
		final EObject newTrg = eMoflonEMFUtil.loadModelWithDependencies(
				newTargetFile, getResourceSet());
		setChangeTrg(root -> {
			mergeRightToLeft(root, newTrg);
		});

		loadTriple(corrFile);
		loadSynchronizationProtocol(protocolFile);
		integrateBackward();
		saveResult();
	}

	private void saveResult() throws IOException {
		getSrc().eResource().setURI(URI.createFileURI(newSourceFile));
		getTrg().eResource().setURI(URI.createFileURI(newTargetFile));
		getCorr().eResource().setURI(URI.createFileURI(newCorrFile));

		saveSrc(newSourceFile + ".xmi");
		saveTrg(newTargetFile);
		saveCorr(newCorrFile);
		saveSynchronizationProtocol(newProtocolFile);
		UseCaseXMIHelper
				.serializeUseCase(newSourceFile + ".xmi", newSourceFile);
	}
}