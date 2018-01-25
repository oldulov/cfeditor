package edu.kit.scc.cfeditor.cfengine.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Project creator for new CfengineEditor projects. Defines all settings for the project.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorNewProjectCreator extends AbstractProjectCreator {

	/**
	 * the project factory provider
	 */
	@Inject
	private Provider<ProjectFactory> projectFactoryProvider;

	// protected static final String DSL_GENERATOR_PROJECT_NAME =
	// "org.eclipse.xtext.cfeditor.generator";

	/**
	 * root folder which contains the cf file, which is opened after project creation (important if method
	 * "getModelFile" in class "AbstractProjectCreator" is used)
	 */
	protected static final String SRC_ROOT = "inputs";
	// protected static final String SRC_GEN_ROOT = "src-genb";

	protected static final String MAIN_FILE = "inputs/promises.cf";

	/**
	 * list of all folders which are initially created
	 */
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of("inputs", "inputs/cflib", "inputs/tasks",
			"inputs/services", "repl", "repl/scripts", "repl/configs", "repl/modules", "repl/scripts/monitors",
			"repl/scripts/reports", "repl/scripts/services", "repl/scripts/tasks", "repl/configs/services",
			"repl/configs/tasks");

	/**
	 * Returns project information of the new project (name).
	 * 
	 * @return project information (contains name of project)
	 */
	@Override
	protected CfengineEditorProjectInfo getProjectInfo() {
		return (CfengineEditorProjectInfo) super.getProjectInfo();
	}

	/**
	 * Returns defined root folder.
	 * 
	 * @return folder name
	 */
	protected String getModelFolderName() {
		return SRC_ROOT;
	}

	/**
	 * Returns a list of all folders to be created.
	 * 
	 * @return list of folders
	 */
	protected List<String> getAllFolders() {
		return SRC_FOLDER_LIST;
	}

	// @Override
	// protected List<String> getRequiredBundles() {
	// List<String> result = Lists.newArrayList(super.getRequiredBundles());
	// result.add(DSL_GENERATOR_PROJECT_NAME);
	// return result;
	// }

	/**
	 * Adds some extensions to the project.
	 * 
	 * @param project
	 * @param monitor
	 */
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("Cp1252");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("edu::kit::scc::cfeditor::cfengine::ui::wizard::CfengineEditorNewProject::main",
				getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	/**
	 * Returns a new project factory.
	 * 
	 * @return factory provider
	 */
	@Override
	protected ProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();
	}

	/**
	 * Configures the project factory. Sets project name and adds folders, natures and builders to the project.
	 * 
	 * @param factory
	 * @return project factory
	 */
	@Override
	protected ProjectFactory configureProjectFactory(ProjectFactory factory) {
		factory.setProjectName(getProjectInfo().getProjectName());
		factory.addFolders(getAllFolders());
		// factory.addReferencedProjects(getReferencedProjects());
		factory.addProjectNatures(XtextProjectHelper.NATURE_ID);
		factory.addBuilderIds(getBuilders());
		return factory;
	}

	/**
	 * Returns list of builders which are added to the project. In this case XtextProjectHelper is added for error
	 * markers support.
	 * 
	 * @return list of builders
	 */
	@Override
	protected String[] getBuilders() {
		return new String[] { XtextProjectHelper.BUILDER_ID };
	}

	// @Override
	// protected void execute(final IProgressMonitor monitor)
	// throws CoreException, InvocationTargetException, InterruptedException {
	// SubMonitor subMonitor = SubMonitor.convert(monitor,
	// getCreateModelProjectMessage(),
	// 2);
	// try {
	// final IProject project = createProject(subMonitor.newChild(1));
	// if (project == null)
	// return;
	// enhanceProject(project, subMonitor.newChild(1));
	// // IFile modelFile = getModelFile(project);
	// // setResult(modelFile);
	// } finally {
	// subMonitor.done();
	// }
	// }

	protected IFile getModelFile(IProject project) throws CoreException {
		IFile mainFile = project.getFile(MAIN_FILE);
		return mainFile;
	}

}