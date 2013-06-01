package dk.rohdef.eclipse.buster.wrappers;

import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.osgi.framework.Bundle;

public interface IFileLocatorWrapper {
	public URL find(Bundle bundle, IPath path, Map<String, String> override);
}
