package edu.kit.scc.cfeditor.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import edu.kit.scc.cfeditor.ui.internal.CfeditorActivator;

public class CfeditorSelectExtWizardPage extends WizardPage implements Listener {

	private Button btCfengine;
	private Button btOther;

	// private Button btDummy;

	protected CfeditorSelectExtWizardPage(String pageName) {
		super(pageName);
		setTitle("Create a Cfeditor Project");
		setDescription("Select a Configuration Management Engine.");
		setImageDescriptor(CfeditorActivator.getImageDescriptor("icons/CfeditorWizard.png"));
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		RowLayout layout = new RowLayout(SWT.VERTICAL);

		composite.setLayout(layout);

		btCfengine = new Button(composite, SWT.RADIO);
		btCfengine.setText("Cfengine Project");
		btCfengine.addListener(SWT.Selection, this);

		btOther = new Button(composite, SWT.RADIO);
		btOther.setText("Other Project");
		btOther.addListener(SWT.Selection, this);

		// btDummy = new Button(composite, SWT.RADIO);
		// btDummy.setText("Dummy Project");
		// btDummy.addListener(SWT.Selection, this);

		// btDummy.setEnabled(false);

		setControl(composite);
	}

	@Override
	public void handleEvent(Event event) {
		NewCfProjectWizard cfWizard = (NewCfProjectWizard) getWizard();

		if (btCfengine.getSelection()) {
			cfWizard.setSelectedEngine(CMEngine.CFENGINE);
		} else if (btOther.getSelection()) {
			cfWizard.setSelectedEngine(CMEngine.OTHER);
			// } else if (btDummy.getSelection()) {
			// cfWizard.setSelectedEngine(CMEngine.DUMMY);
		}
		cfWizard.getContainer().updateButtons();
	}

	// public IWizardPage getNextPage() {
	// if (btCfengine.getSelection()) {
	// CfeditorSelectExtWizardPage page = ((NewCfProjectWizard)
	// getWizard()).extensionSelectPage;
	// return page;
	// }
	// return null;
	// }

}
