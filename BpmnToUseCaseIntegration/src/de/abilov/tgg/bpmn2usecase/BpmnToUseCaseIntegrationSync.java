package de.abilov.tgg.bpmn2usecase;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.moflon.util.eMoflonEMFUtil;

import bpmn2.DocumentRoot;
import TGGRuntime.CorrespondenceModel;

public class BpmnToUseCaseIntegrationSync extends
		BpmnToUseCaseSynchronizationHelper {
	public BpmnToUseCaseIntegrationSync() throws IOException {
		super();
	}

	private String newSourceFile;
	private String newTargetFile;
	private String newCorrFile;
	private String newProtocolFile;

	private Comparison compare(EObject v1, EObject v2) {
		IEObjectMatcher matcher = DefaultMatchEngine
				.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
				new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(
				matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder()
				.setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		IComparisonScope scope = new DefaultComparisonScope(v1, v2, v1);
		return comparator.compare(scope);
	}

	@Override
	protected void performForward() throws IOException {
		final EObject newSrc = eMoflonEMFUtil.loadModelWithDependencies(
				newSourceFile, getResourceSet());
		setChangeSrc(root -> {
			List<Diff> differences = compare(root, newSrc).getDifferences();
			IMerger.Registry mergerRegistry = IMerger.RegistryImpl
					.createStandaloneInstance();
			IBatchMerger merger = new BatchMerger(mergerRegistry);
			merger.copyAllRightToLeft(differences, new BasicMonitor());

			// Compare and copy it again
			List<Diff> differences1 = compare(root, newSrc).getDifferences();
			if (differences1.size() > 0) {
				merger.copyAllRightToLeft(differences1, new BasicMonitor());
			}

			List<Diff> differences2 = compare(root, newSrc).getDifferences();
			if (differences2.size() > 0) {

			}
		});

		loadTriple(corrFile);
		loadSynchronizationProtocol(protocolFile);
		integrateForward();
		saveResult();
	}

	@Override
	protected void performBackward() throws IOException {
		parseUseCase(newTargetFile, newTargetFile + ".xmi");
		final EObject newTrg = eMoflonEMFUtil.loadModelWithDependencies(
				newTargetFile, getResourceSet());
		setChangeTrg(root -> {
			List<Diff> differences = compare(root, newTrg).getDifferences();
			IMerger.Registry mergerRegistry = new IMerger.RegistryImpl();
			IBatchMerger merger = new BatchMerger(mergerRegistry);
			merger.copyAllRightToLeft(differences, new BasicMonitor());
		});

		loadTriple(corrFile);
		loadSynchronizationProtocol(protocolFile);
		integrateBackward();
		saveResult();
	}

	private void loadTriple(String corr) {
		loadCorr(corr);
		CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
		setSrc(corrModel.getSource());
		setTrg(corrModel.getTarget());
	}

	private void saveResult() throws IOException {
		getSrc().eResource().setURI(URI.createFileURI(newSourceFile));
		getTrg().eResource().setURI(URI.createFileURI(newTargetFile));
		getCorr().eResource().setURI(URI.createFileURI(newCorrFile));

		saveSrc(newSourceFile);
		saveTrg(newTargetFile + ".xmi");
		saveCorr(newCorrFile);
		saveSynchronizationProtocol(newProtocolFile);
		serializeUseCase(newTargetFile + ".xmi", newTargetFile);
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