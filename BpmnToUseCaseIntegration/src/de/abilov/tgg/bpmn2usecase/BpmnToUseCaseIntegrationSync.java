package de.abilov.tgg.bpmn2usecase;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.core.utilities.eMoflonEMFUtil;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage;
import UseCaseDSL.resource.UseCaseXMIHelper;
import de.abilov.tgg.synch.SynchronizationHelper;

public class BpmnToUseCaseIntegrationSync extends SynchronizationHelper {
	public BpmnToUseCaseIntegrationSync() throws IOException {
		super(BpmnToUseCaseIntegrationPackage.eINSTANCE, ".");
	}

	private String newSourceFile;
	private String newTargetFile;
	private String newCorrFile;
	private String newProtocolFile;

	@Override
	protected void performForward() throws IOException {
		Resource res = this.getResourceSet().getResource(
				URI.createFileURI(newSourceFile), true);
		eMoflonEMFUtil.installCrossReferencers(this.getResourceSet());
		final EObject newSrc = res.getContents().get(0);

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
		UseCaseXMIHelper.parseUseCase(newTargetFile, newTargetFile + ".xmi");
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

		saveSrc(newSourceFile);
		saveTrg(newTargetFile + ".xmi");
		saveCorr(newCorrFile);
		saveSynchronizationProtocol(newProtocolFile);
		UseCaseXMIHelper
				.serializeUseCase(newTargetFile + ".xmi", newTargetFile);
	}

	@Override
	protected void setFiles(Map<String, String> args) {
		corrFile = args.getOrDefault("corr", getDirection() + ".corr.xmi");
		protocolFile = args.getOrDefault("protocol", getDirection()
				+ ".protocol.xmi");
		newSourceFile = args.getOrDefault("new-source", "sync."
				+ getDirection() + ".src.xmi");
		newTargetFile = args.getOrDefault("new-target", "sync."
				+ getDirection() + ".trg.usecase");
		newCorrFile = args.getOrDefault("new-corr", "sync." + getDirection()
				+ ".corr.xmi");
		newProtocolFile = args.getOrDefault("new-protocol", "sync."
				+ getDirection() + ".protocol.xmi");
	}

}