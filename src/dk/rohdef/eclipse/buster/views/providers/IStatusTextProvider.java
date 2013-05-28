package dk.rohdef.eclipse.buster.views.providers;

import org.eclipse.swt.widgets.Composite;

public interface IStatusTextProvider {
	
	public abstract void inputChanged(Composite composite, Object oldInput, Object newInput);
	
	public abstract Object getInput();
	
	public abstract String getRuns();

	public abstract String getErrors();

	public abstract String getFailures();

}