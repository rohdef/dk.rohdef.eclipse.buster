package dk.rohdef.eclipse.buster.views.providers;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import dk.rohdef.eclipse.buster.models.TestCase;
import dk.rohdef.eclipse.buster.models.TestSuite;

public class TestSuiteLabelProvider extends LabelProvider {
	private static final Image SUITE = getImage("suite.png");
	private static final Image CASE = getImage("case.png");
	
	@Override
	public String getText(Object element) {
		if (element instanceof TestSuite) {
			TestSuite tsuite = (TestSuite) element;
			return tsuite.getName() + " (" + tsuite.getTime() + "s)";
		} else if (element instanceof TestCase) {
			TestCase tcase = (TestCase) element; 
			return tcase.getName() + "(" + tcase.getTime() + "s)";
		}
		
		return "Error parsing";
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof TestSuite) {
			return SUITE;
		}
		
		return CASE;
	}
	
	private static Image getImage(String file) {
		Bundle bundle = FrameworkUtil.getBundle(TestSuiteLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/" + file), null);
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		return image.createImage();
	}
}
