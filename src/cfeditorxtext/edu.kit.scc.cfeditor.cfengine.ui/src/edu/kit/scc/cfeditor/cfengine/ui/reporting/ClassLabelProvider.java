package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.swt.graphics.Point;

import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise;

/**
 * A label provider for the viewer which displays the tree for the "Class View".
 * 
 * @author Andreas Bender
 * 
 */
public class ClassLabelProvider extends ColumnLabelProvider {

	/**
	 * Returns the text label of tree element.
	 * 
	 * @param element
	 * @return text label
	 */
	public String getText(Object element) {

		if (element instanceof TreeNode) {
			Object nodeValue = ((TreeNode) element).getValue();
			if (nodeValue instanceof EObjectSourceElement) {

				EObjectSourceElement sourceElement = (EObjectSourceElement) nodeValue;

				EObject sourceElementObject = sourceElement.getSourceElement();

				String name = null;
				String values = null;

				if (sourceElementObject instanceof BodyFunction) {
					name = ((BodyFunction) sourceElementObject).getName().getName();
					values = ((BodyFunction) sourceElementObject).getValues().toString();
					return name + ": " + values;

				} else if (sourceElementObject instanceof BundlePromise) {
					name = ((BundlePromise) sourceElementObject).getName();
					// values = ((BundlePromise) sourceElementObject).getValues().toString();
					return "promise: " + name;
				}

			} else {
				return (String) ((TreeNode) element).getValue();
			}
		}
		return null;
	}

	/**
	 * Returns the text which should be displayed in a tool tip. In this case it's the URI string of a source element.
	 * 
	 * @param element
	 * @return tool tip text
	 */
	@Override
	public String getToolTipText(Object element) {
		if (element instanceof TreeNode) {
			if (((TreeNode) element).getValue() instanceof EObjectSourceElement) {
				EObjectSourceElement sourceElement = (EObjectSourceElement) ((TreeNode) element).getValue();
				String uriString = sourceElement.getUri();
				URI uri = URI.createURI(uriString);
				return uri.toFileString();
			}

		}
		return null;
	}

	/**
	 * display tool tip below the mouse cursor
	 */
	@Override
	public Point getToolTipShift(Object object) {
		return new Point(0, 21);
	}

	// code examples for modifying tooltip properties:
	//
	//
	// @Override
	// public int getToolTipDisplayDelayTime(Object object) {
	// return 2000;
	// }
	//
	// @Override
	// public int getToolTipTimeDisplayed(Object object) {
	// return 5000;
	// }
}
