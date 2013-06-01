package dk.rohdef.eclipse.buster.wrappers;

import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.osgi.framework.Bundle;

public class FileLocatorWrapper implements IFileLocatorWrapper {

	@Override
	public URL find(Bundle bundle, IPath path, Map<String, String> override) {
		return FileLocator.find(bundle, path, override);
	}

}
