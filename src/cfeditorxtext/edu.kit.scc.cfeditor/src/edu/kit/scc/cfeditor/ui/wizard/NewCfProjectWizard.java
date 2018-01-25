package edu.kit.scc.cfeditor.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;

enum CMEngine {
	CFENGINE, OTHER
	// , DUMMY
}

public class NewCfProjectWizard extends Wizard implements INewWizard {
	private CfeditorSelectExtWizardPage extensionSelectPage;
	private CMEngine selectedEngine = null;

	public NewCfProjectWizard() {
		setWindowTitle("New Cfeditor Project");
	}

	public void addPages() {
		extensionSelectPage = new CfeditorSelectExtWizardPage("Cfeditor Project Wizard");
		addPage(extensionSelectPage);
	}

	@Override
	public boolean performFinish() {

		switch (selectedEngine) {
		case CFENGINE:
			try {
				startCfengineProjectWizard();
			} catch (CoreException e) {
				return false;
			}
			return true;
		case OTHER:
			try {
				startCfengineProjectWizard();
			} catch (CoreException e) {
				return false;
			}
			return true;
			// case DUMMY:
			// break;
		}

		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public boolean canFinish() {
		if (null != selectedEngine) {
			return true;
		}
		return false;
	}

	public void setSelectedEngine(CMEngine selectedEngine) {
		this.selectedEngine = selectedEngine;
	}

	public CMEngine getSelectedEngine() {
		return selectedEngine;
	}

	private void startCfengineProjectWizard() throws CoreException {
		IWizardDescriptor descriptor = PlatformUI.getWorkbench().getNewWizardRegistry()
				.findWizard("edu.kit.scc.cfeditor.cfengine.ui.wizard.CfengineEditorNewProjectWizard");

		IWizard wizard;
		wizard = descriptor.createWizard();
		WizardDialog wd = new WizardDialog(this.getShell(), wizard);
		wd.setTitle(wizard.getWindowTitle());
		wd.open();
	}
}
