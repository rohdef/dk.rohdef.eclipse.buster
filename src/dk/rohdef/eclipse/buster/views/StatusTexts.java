package dk.rohdef.eclipse.buster.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class StatusTexts extends Composite {

	public StatusTexts(Composite parent, int style) {
		super(parent, style);
		
		this.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Label text = new Label(this, SWT.NONE);
		text.setText("Runs: ");
		Text runsText = new Text(this, SWT.BORDER);
		runsText.setText("0/0");
		
		text = new Label(this, SWT.NONE);
		text.setText("Errors: ");
		Text errorsText = new Text(this, SWT.BORDER);
		errorsText.setText("0");
		
		text = new Label(this, SWT.NONE);
		text.setText("Failures: ");
		Text failuresText = new Text(this, SWT.BORDER);
		failuresText.setText("0");
	}
}
