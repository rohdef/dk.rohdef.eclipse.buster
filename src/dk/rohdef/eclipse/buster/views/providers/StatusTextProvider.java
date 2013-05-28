package dk.rohdef.eclipse.buster.views.providers;

import org.eclipse.swt.widgets.Composite;

import dk.rohdef.eclipse.buster.models.RootTestSuite;

public class StatusTextProvider implements IStatusTextProvider {
	private RootTestSuite model;
	
	public void inputChanged(Composite composite, Object oldInput, Object newInput) {
		this.model = (RootTestSuite) newInput;
	}
	
	@Override
	public Object getInput() {
		return model;
	}
	
	/* (non-Javadoc)
	 * @see dk.rohdef.eclipse.buster.views.providers.IStatusTextProvider#getRuns()
	 */
	@Override
	public String getRuns() {
		return "" + this.model.getTests();
	}
	
	/* (non-Javadoc)
	 * @see dk.rohdef.eclipse.buster.views.providers.IStatusTextProvider#getErrors()
	 */
	@Override
	public String getErrors() {
		return "" + this.model.getErrors();
	}
	
	/* (non-Javadoc)
	 * @see dk.rohdef.eclipse.buster.views.providers.IStatusTextProvider#getFailures()
	 */
	@Override
	public String getFailures() {
		return "" + this.model.getFailues();
	}
}
