package dk.rohdef.eclipse.buster.views.providers;

import java.net.URL;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import dk.rohdef.eclipse.buster.models.TestCase;
import dk.rohdef.eclipse.buster.models.TestSuite;
import dk.rohdef.eclipse.buster.wrappers.FileLocatorWrapper;
import dk.rohdef.eclipse.buster.wrappers.IFileLocatorWrapper;

public class TestSuiteLabelProvider extends LabelProvider {
	private final Image SUITE;
	private final Image SUCCESS;
	private final Image FAILURE;
	private IFileLocatorWrapper fileLocator;
	
	public TestSuiteLabelProvider() {
		this(new FileLocatorWrapper());
	}
	
	/**
	 * This constructor is mostly for testing purposes
	 * @param fileLocator
	 */
	public TestSuiteLabelProvider(IFileLocatorWrapper fileLocator) {
		this.fileLocator = fileLocator;
		
		SUITE = getImage("suite.png");
		SUCCESS = getImage("test-success.png");
		FAILURE = getImage("test-fail.png");
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof TestSuite) {
			TestSuite tsuite = (TestSuite) element;
			return tsuite.getName() + " (" + tsuite.getTime() + " s)";
		} else if (element instanceof TestCase) {
			TestCase tcase = (TestCase) element; 
			return tcase.getName() + " (" + tcase.getTime() + " s)";
		}
		
		return "Error parsing";
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof TestSuite) {
			return SUITE;
		}
		if (element instanceof TestCase) {
			if (((TestCase) element).getFailure() == null)
				return SUCCESS;
			return FAILURE;
		}
		
		return null;
	}
	
	private Image getImage(String file) {
		Bundle bundle = FrameworkUtil.getBundle(TestSuiteLabelProvider.class);
		URL url = fileLocator.find(bundle, new Path("icons/" + file), null);
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		return image.createImage();
	}
}
