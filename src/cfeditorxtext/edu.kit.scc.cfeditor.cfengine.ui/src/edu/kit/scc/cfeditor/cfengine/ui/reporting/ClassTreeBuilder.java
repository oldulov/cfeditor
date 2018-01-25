package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;

/**
 * Builds the tree of classes and body function elements for the "Class View".
 * 
 * @author Andreas Bender
 * 
 */
public class ClassTreeBuilder {

	/**
	 * Returns an array of tree nodes which represent the tree of body classes and contained body functions.
	 * 
	 * @param activeProject
	 *            the active eclipse project in workspace
	 * @return array of the first level tree nodes
	 */
	public TreeNode[] getTreeNodes(IProject activeProject) {
		ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();

		FileHandler fileHandler = new FileHandler();
		LinkedList<String> uriList = fileHandler.getFileURIs(activeProject, "cf");

		CfengineEditorModelHandler cfModelHandler = new CfengineEditorModelHandler();

		HashMap<String, String> occurrencesMap = cfModelHandler.getClassOccurrences(uriList);

		CompositeNode node;
		for (Entry<String, LinkedList<LocatedEObject>> classList : cfModelHandler.getSortedClasses(uriList).entrySet()) {

			String className = classList.getKey();
			String occurrences = occurrencesMap.get(className);

			TreeNode classNode;

			if (occurrences != null) {
				classNode = new TreeNode(className + " (connects: " + occurrences + ")");
			} else {
				classNode = new TreeNode(className);
			}

			ArrayList<TreeNode> children = new ArrayList<TreeNode>();

			for (LocatedEObject classElement : classList.getValue()) {
				for (EObject classContentObject : classElement.getEObject().eContents()) {
					node = NodeUtil.getNode(classContentObject);

					TreeNode functionNode = new TreeNode(new EObjectSourceElement(classElement.getUri(),
							node.getOffset(), classContentObject));

					functionNode.setParent(classNode);
					children.add(functionNode);
				}
			}
			if (children.size() != 0) {
				classNode.setChildren(children.toArray(new TreeNode[1]));
			}
			nodeList.add(classNode);
		}
		if (nodeList.isEmpty()) {
			return null;
		} else {
			return nodeList.toArray(new TreeNode[1]);
		}
	}
}
