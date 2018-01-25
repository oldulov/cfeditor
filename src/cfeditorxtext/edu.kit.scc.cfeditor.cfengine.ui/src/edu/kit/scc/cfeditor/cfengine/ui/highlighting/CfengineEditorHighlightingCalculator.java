package edu.kit.scc.cfeditor.cfengine.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType;

/**
 * Semantic highlighting calculator. Computes highlighting rules based on the model elements.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorHighlightingCalculator implements ISemanticHighlightingCalculator {

	/**
	 * Associates styles to computed ranges.
	 * 
	 * @param resource
	 *            current xtext resource
	 * @param acceptor
	 * 
	 */
	public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
		if (resource == null) {
			return;
		}

		final Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());
		EObject nodeElement;
		for (AbstractNode abstractNode : allNodes) {
			nodeElement = abstractNode.getElement();

			if (nodeElement instanceof BodyPromiseType) {
				acceptor.addPosition(abstractNode.getOffset(), abstractNode.getLength(),
						CfengineEditorHighlightingConfiguration.PROMISE_TYPE);
				
			} else if (nodeElement instanceof BundlePromiseType) {
				LeafNode node = getFirstFeatureNode(nodeElement, "name");
				acceptor.addPosition(node.getOffset(), node.getLength(),
						CfengineEditorHighlightingConfiguration.PROMISE_TYPE);

			} else if (nodeElement instanceof BundleComponent || nodeElement instanceof BodyComponent) {
				acceptor.addPosition(abstractNode.getOffset(), abstractNode.getLength(),
						CfengineEditorHighlightingConfiguration.KEYWORD_ID);
			}
		}
	}

	/**
	 * Returns the node of the first feature of an EObject.
	 * 
	 * @param semantic
	 * @param feature
	 * @return the feature node
	 */
	public LeafNode getFirstFeatureNode(final EObject semantic, final String feature) {
		final NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		if (adapter != null) {
			final CompositeNode node = adapter.getParserNode();
			if (node != null) {
				if (feature == null) {
					return null;
				}
				for (AbstractNode child : node.getChildren()) {
					if (child instanceof LeafNode) {
						if (feature.equals(((LeafNode) child).getFeature())) {
							return (LeafNode) child;
						}
					}
				}
			}
		}
		return null;
	}
}
