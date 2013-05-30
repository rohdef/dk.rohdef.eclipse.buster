package dk.rohdef.eclipse.buster.views.providers;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import dk.rohdef.eclipse.buster.models.MockModel;
import dk.rohdef.eclipse.buster.models.RootTestSuite;
import dk.rohdef.eclipse.buster.models.TestSuite;

public class TestSuiteContentProvider implements ITreeContentProvider {
	private MockModel model;
	
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.model = (MockModel) newInput;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		System.out.println(model.getCategories().size());
		return model.getCategories().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof TestSuite) {
			return ((TestSuite) parentElement).getTestCases().toArray();
		}
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof RootTestSuite) {
			RootTestSuite rootSuite = (RootTestSuite)element; 
			int suitesCount = rootSuite.getSuites().size();
			return suitesCount>0;
		} else if (element instanceof TestSuite) {
			TestSuite testSuite = (TestSuite) element;
			int caseCount = testSuite.getTestCases().size();
			return caseCount>0;
		}
		
		return false;
	}

}
