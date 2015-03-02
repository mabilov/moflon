package UseCaseDSL.resource;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IFragmentProvider;

import UseCaseDSL.StepAlternative;

import com.google.inject.Inject;

public class UseCaseFragmentProvider implements IFragmentProvider {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Override
	public String getFragment(EObject obj, Fallback fallback) {
		if (obj instanceof UseCaseDSL.BasicFlow) {
			QualifiedName containerName = qualifiedNameProvider.getFullyQualifiedName(obj.eContainer());
			return containerName.toString() + ".basic_flow";
		} else if (obj instanceof UseCaseDSL.StepAlternative) {
			String cond = ((StepAlternative)obj).getCondition().trim()
					.toLowerCase().replaceAll("[^\\w\\d]", "_");
			QualifiedName containerName = qualifiedNameProvider.getFullyQualifiedName(obj.eContainer());
			
			return containerName.toString() + "." + cond;
		}
		QualifiedName qName = qualifiedNameProvider.getFullyQualifiedName(obj);
		return qName != null ? qName.toString() : fallback.getFragment(obj);
	}

	@Override
	public EObject getEObject(Resource resource, String fragment,
			Fallback fallback) {
		if (fragment != null) {
			Iterator<EObject> i = EcoreUtil.getAllContents(resource, false);
			while (i.hasNext()) {
				EObject eObject = i.next();
				String candidateFragment = (eObject.eIsProxy()) ? ((InternalEObject) eObject)
						.eProxyURI().fragment()
						: getFragment(eObject, fallback);
				if (fragment.equals(candidateFragment))
					return eObject;
			}
		}
		return fallback.getEObject(fragment);
	}

}
