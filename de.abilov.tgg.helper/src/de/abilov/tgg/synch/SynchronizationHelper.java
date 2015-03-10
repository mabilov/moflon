package de.abilov.tgg.synch;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
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

import TGGRuntime.CorrespondenceModel;

public abstract class SynchronizationHelper extends
		org.moflon.tgg.algorithm.synchronization.SynchronizationHelper {

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

	protected Comparison compare(EObject v1, EObject v2) {
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

	protected void mergeRightToLeft(EObject left, EObject right) {
		List<Diff> differences = compare(left, right).getDifferences();
		IMerger.Registry mergerRegistry = IMerger.RegistryImpl
				.createStandaloneInstance();
		IBatchMerger merger = new BatchMerger(mergerRegistry);
		merger.copyAllRightToLeft(differences, new BasicMonitor());

		// Compare and copy it again due to cross references
		List<Diff> differences1 = compare(left, right).getDifferences();
		if (differences1.size() > 0) {
			merger.copyAllRightToLeft(differences1, new BasicMonitor());
		}
	}
	
	protected void loadTriple(String corr) {
		loadCorr(corr);
		CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
		setSrc(corrModel.getSource());
		setTrg(corrModel.getTarget());
	}
}
