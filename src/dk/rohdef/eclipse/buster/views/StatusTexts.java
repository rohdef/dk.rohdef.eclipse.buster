package dk.rohdef.eclipse.buster.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import dk.rohdef.eclipse.buster.views.providers.IStatusTextProvider;

public class StatusTexts extends Composite {
	private IStatusTextProvider contentProvider;
	private Text failuresText;
	private Text errorsText;
	private Text runsText;

	public StatusTexts(Composite parent, int style) {
		super(parent, style);
		
		this.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Label text = new Label(this, SWT.NONE);
		text.setText("Runs: ");
		runsText = new Text(this, SWT.BORDER);
		runsText.setText("");
		
		text = new Label(this, SWT.NONE);
		text.setText("Errors: ");
		errorsText = new Text(this, SWT.BORDER);
		errorsText.setText("");
		
		text = new Label(this, SWT.NONE);
		text.setText("Failures: ");
		failuresText = new Text(this, SWT.BORDER);
		failuresText.setText("");
	}
	
	public void setContentProvider(IStatusTextProvider contentProvider) {
		this.contentProvider = contentProvider;
	}
	
	public void setInput(Object input) {
		this.contentProvider.inputChanged(this, contentProvider.getInput(), input);
		
		this.runsText.setText(this.contentProvider.getRuns());
		this.errorsText.setText(this.contentProvider.getErrors());
		this.failuresText.setText(this.contentProvider.getFailures());
	}

	public String getRunsText() {
		return this.runsText.getText();
	}

	public String getErrorsText() {
		return this.errorsText.getText();
	}

	public String getFailuresText() {
		return this.failuresText.getText();
	}
}
