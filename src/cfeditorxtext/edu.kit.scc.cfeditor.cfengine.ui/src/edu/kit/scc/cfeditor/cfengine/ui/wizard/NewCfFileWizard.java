package edu.kit.scc.cfeditor.cfengine.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * Wizard for creating a new .cf file.
 * 
 * @author Andreas Bender
 * 
 */
public class NewCfFileWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private NewCfFileWizardPage newFileWizardPage;
	private IWorkbench workbench;

	/**
	 * Constructor. Sets wizard window title.
	 */
	public NewCfFileWizard() {
		setWindowTitle("New Cf File");
	}

	/**
	 * Adds pages to the wizard.
	 */
	@Override
	public void addPages() {
		newFileWizardPage = new NewCfFileWizardPage(selection);
		addPage(newFileWizardPage);
	}

	/**
	 * Creates the file and opens it in Cfeditor.
	 */
	@Override
	public boolean performFinish() {
		final IFile file = newFileWizardPage.createNewFile();
		if (file != null) {
			final IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
			try {
				IDE.openEditor(page, file, "edu.kit.scc.cfeditor.cfengine.editor");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Initializes workbench and selection.
	 * 
	 * @param workbench
	 * @param selection
	 */
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
}