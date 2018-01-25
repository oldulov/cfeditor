package edu.kit.scc.cfeditor.cfengine.ui.views;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.ITextEditor;

import edu.kit.scc.cfeditor.cfengine.ui.reporting.ClassLabelProvider;
import edu.kit.scc.cfeditor.cfengine.ui.reporting.ClassTreeBuilder;
import edu.kit.scc.cfeditor.cfengine.ui.reporting.EObjectSourceElement;

/**
 * This class is responsible for displaying the "Class View". It creates the view window and handles user interactions
 * with the view.
 * 
 * @author Andreas Bender
 * 
 */
public class ClassViewPart extends ViewPart {
	private IProject activeProject;

	private IPartListener2 partListener;
	private IPropertyListener propertyListener;
	// private IResourceChangeListener resourceChangedListener; TODO

	private TreeViewer treeViewer;
	private ClassTreeBuilder treeBuilder;

	/**
	 * Creates the graphical tree elements and handles user interactions (double click event).
	 */
	@Override
	public void createPartControl(Composite parent) {
		treeBuilder = new ClassTreeBuilder();

		treeViewer = new TreeViewer(parent, 0);
		treeViewer.setContentProvider(new TreeNodeContentProvider());
		treeViewer.setLabelProvider(new ClassLabelProvider());
		treeViewer.setSorter(new ViewerSorter()); // sorts tree alphabetically

		ColumnViewerToolTipSupport.enableFor(treeViewer);

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			/**
			 * Handles double click event on a body function. Opens corresponding file in editor and jumps to the
			 * position of the selected body function.
			 */
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof ISelection) {
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					Object domain = selection.getFirstElement();

					if (domain instanceof TreeNode) {
						if (((TreeNode) domain).getValue() instanceof EObjectSourceElement) {
							EObjectSourceElement sourceElement = (EObjectSourceElement) ((TreeNode) domain).getValue();

							URI uri = URI.create(sourceElement.getUri());

							try {
								ITextEditor cfEditor = (ITextEditor) IDE.openEditor(PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow().getActivePage(), uri,
										"edu.kit.scc.cfeditor.cfengine.editor", true);
								cfEditor.selectAndReveal(sourceElement.getOffset(), 0);
							} catch (PartInitException e) {
								// ignore
							} catch (ClassCastException e) {
								// Error: could not open text a editor - happens
								// for example
								// if necessary file document is deleted and
								// "class view" tree
								// is still used (double click)
							}
						}
					}
				}
			}
		});
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();

	}

	/**
	 * Initializes the "Class View". Adds part listener to the workbench window.
	 * 
	 * @param site
	 *            current site
	 * @throws PartInitException
	 */
	@Override
	public void init(final IViewSite site) throws PartInitException {
		super.init(site);
		// TODO
		// resourceChangedListener = new IResourceChangeListener() {
		//
		// public void resourceChanged(IResourceChangeEvent event) {
		// System.out.println("event!!!: " + event.getType() + " : " + event.getResource());
		// if (event.getType() == IResourceChangeEvent.POST_CHANGE
		// || event.getType() == IResourceChangeEvent.PRE_DELETE) {
		//
		// IEditorPart editorPart = null;
		//
		// try {
		// editorPart = site.getWorkbenchWindow().getActivePage().getActiveEditor();
		//
		// // if (editorPart != null) {
		// refreshView(editorPart, true);
		// // }
		// } catch (NullPointerException e) {
		// // ignore
		// }
		// }
		// }
		// };

		propertyListener = new IPropertyListener() {
			/**
			 * Checks if active editor input has been saved and refreshes view if necessary.
			 */
			public void propertyChanged(Object source, int propId) {
				if (propId == IEditorPart.PROP_DIRTY) {
					IEditorPart editorPart = null;
					try {
						editorPart = site.getWorkbenchWindow().getActivePage().getActiveEditor();

						if (editorPart != null) {
							refreshView(editorPart, true);
						}
					} catch (NullPointerException e) {
						// ignore
					}
				}
			}
		};

		partListener = new IPartListener2() {
			public void partVisible(IWorkbenchPartReference partRef) {
			}

			public void partOpened(IWorkbenchPartReference partRef) {
			}

			public void partInputChanged(IWorkbenchPartReference partRef) {
			}

			public void partHidden(IWorkbenchPartReference partRef) {
			}

			public void partDeactivated(IWorkbenchPartReference partRef) {
			}

			public void partClosed(IWorkbenchPartReference partRef) {
			}

			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			/**
			 * Actualizes the tree if current active project has changed.
			 */
			public void partActivated(IWorkbenchPartReference partRef) {
				IEditorPart editorPart = null;
				try {
					editorPart = partRef.getPage().getActiveEditor();

					if (editorPart != null) {
						editorPart.addPropertyListener(propertyListener);

						refreshView(editorPart, false);
					}
				} catch (NullPointerException e) {
					// ignore
				}
			}
		};

		site.getWorkbenchWindow().getPartService().addPartListener(partListener);
		// ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangedListener); //TODO
	}

	/**
	 * Disposes the view. Removes used listeners from workbench window.
	 */
	public void dispose() {
		super.dispose();
		this.getSite().getWorkbenchWindow().getPartService().removePartListener(partListener);
		// ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangedListener); //TODO
	}

	/**
	 * Refreshes the body class tree if active project has changed or forceRefresh flag is true.
	 */
	private void refreshView(IEditorPart editorPart, boolean forceRefresh) {
		IProject oldActiveProject = activeProject;

		if (editorPart == null) {
			if (treeViewer != null) {
				treeViewer.setInput(null);
			}
		} else {
			try {
				IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
				IFile file = input.getFile();
				activeProject = file.getProject();

				if (forceRefresh || null == oldActiveProject || !oldActiveProject.equals(activeProject)) {
					if (treeViewer != null) {
						TreeNode[] treeNodes = treeBuilder.getTreeNodes(activeProject);

						treeViewer.setInput(treeNodes);
					}
				}
			} catch (ClassCastException e) {
				// ignore
			}
		}
	}
}
