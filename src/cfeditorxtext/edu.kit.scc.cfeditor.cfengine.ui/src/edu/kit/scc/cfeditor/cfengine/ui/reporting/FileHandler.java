package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * Manages interactions with files in eclipse projects.
 * 
 * @author Andreas Bender
 * 
 */
public class FileHandler {

	/**
	 * Returns the list of URIs (as Strings) of all files in an eclipse project which have the given file extension.
	 * 
	 * @param activeProject
	 *            the project which contains the wanted files
	 * @param fileExtension
	 *            file extension of the wanted files
	 * @return list of URIs (as Strings)
	 */
	public LinkedList<String> getFileURIs(IProject activeProject, String fileExtension) {
		LinkedList<String> uriList = new LinkedList<String>();
		try {
			uriList = getFileURIs(activeProject.members(), fileExtension);
		} catch (CoreException e) {
			// ignore
		}
		return uriList;
	}

	/**
	 * Checks all member elements and children and returns the URI list of files with the given extension.
	 * 
	 * @param members
	 *            project members
	 * @param fileExtension
	 *            file extension of the wanted files
	 * @return list of URIs (as Strings)
	 * @throws CoreException
	 */
	private LinkedList<String> getFileURIs(IResource[] members, String fileExtension) throws CoreException {
		LinkedList<String> uriList = new LinkedList<String>();

		IFile tmpFile;
		IFolder tmpFolder;

		for (IResource resource : members) {
			if (resource.getType() == IResource.FOLDER) {
				tmpFolder = (IFolder) resource;
				uriList.addAll(getFileURIs(tmpFolder.members(), fileExtension));
			}

			if (resource.getType() == IResource.FILE) {
				tmpFile = (IFile) resource;
				if (tmpFile.getFileExtension().equals(fileExtension)) {
					uriList.add(tmpFile.getLocationURI().toString());
				}
			}
		}

		return uriList;
	}
}
