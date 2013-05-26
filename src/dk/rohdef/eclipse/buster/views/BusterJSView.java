package dk.rohdef.eclipse.buster.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import dk.rohdef.eclipse.buster.models.MockModel;
import dk.rohdef.eclipse.buster.views.providers.TestSuiteContentProvider;
import dk.rohdef.eclipse.buster.views.providers.TestSuiteLabelProvider;

public class BusterJSView extends ViewPart {
	private TreeViewer viewer;
	private LocalResourceManager resourceManager;
	
	@Override
	public void createPartControl(Composite parent) {
		resourceManager = new LocalResourceManager(JFaceResources.getResources(), parent);
		
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		parent.setLayout(layout);
		
		createStatusTexts(parent);
		
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new TestSuiteContentProvider());
		viewer.setLabelProvider(new TestSuiteLabelProvider());
		
		viewer.setAutoExpandLevel(2);
		
		viewer.setInput(new MockModel());
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				TreeViewer viewer = (TreeViewer) event.getViewer();
				IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
				Object selectNode = thisSelection.getFirstElement();
				viewer.setExpandedState(selectNode, !viewer.getExpandedState(selectNode));
			}
		});
	}

	private void createStatusTexts(Composite parent) {
		Composite statusTexts = new Composite(parent, SWT.NONE);
		statusTexts.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Label text = new Label(statusTexts, SWT.NONE);
		text.setText("Runs: ");
		Text runsText = new Text(statusTexts, SWT.BORDER);
		runsText.setText("0/0");
		
		text = new Label(statusTexts, SWT.NONE);
		text.setText("Errors: ");
		Text errorsText = new Text(statusTexts, SWT.BORDER);
		errorsText.setText("0");
		
		text = new Label(statusTexts, SWT.NONE);
		text.setText("Failures: ");
		Text failuresText = new Text(statusTexts, SWT.BORDER);
		failuresText.setText("0");
		
		DataBindingContext ctx;
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
