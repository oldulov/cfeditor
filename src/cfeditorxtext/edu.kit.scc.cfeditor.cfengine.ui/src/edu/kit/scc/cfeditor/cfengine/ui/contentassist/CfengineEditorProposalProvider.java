package edu.kit.scc.cfeditor.cfengine.ui.contentassist;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.Bundle;
import edu.kit.scc.cfeditor.cfengine.definitions.CfDefinitionProvider;
import edu.kit.scc.cfeditor.cfengine.validation.CfengineEditorFunctionType;

/**
 * Customized content assistant.
 * 
 * @author Andreas Bender
 * 
 *         see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content
 *         assistant
 */
public class CfengineEditorProposalProvider extends AbstractCfengineEditorProposalProvider {

	private final CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();

	/**
	 * Provides content assist for promise types in body block.
	 * 
	 * @param body
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBody_PromiseType(Body body, final Assignment assignment, final ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {

		// TODO CfModel bei Class/PromiseType

		final List<String> promiseTypeList = cfDefProvider.getBodyFunctions().get(body.getComponent().getName());

		if (null != promiseTypeList) {
			createProposalsAndAccept(promiseTypeList, context, acceptor);
		}
		// proposal = getValueConverter().toString(proposal, "ID");
	}

	/**
	 * Provides content assist for promise types in bundle block.
	 * 
	 * @param bundle
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBundle_PromiseType(Bundle bundle, final Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		List<String> promiseTypeList = cfDefProvider.getBundleTypes().get(bundle.getComponent().getName());

		if (null != promiseTypeList) {
			createProposalsAndAccept(promiseTypeList, context, acceptor);
		}
	}

	/**
	 * Provides content assist for bundle components.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBundle_Component(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		Collection<String> componentList = cfDefProvider.getDefinitions("BundleComponents");
		// .getBundleTypes().keySet(); FIXME

		createProposalsAndAccept(componentList, context, acceptor);
	}

	/**
	 * Provides content assist for body components.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBody_Component(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		Collection<String> componentList = cfDefProvider.getDefinitions("BodyComponents");
		// .getBodyFunctions().keySet(); FIXME

		createProposalsAndAccept(componentList, context, acceptor);
	}

	/**
	 * Provides content assist for body function values for example OPTION type values.
	 * 
	 * @param function
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBodyFunction_Values(BodyFunction function, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		String[] functionAttributes = cfDefProvider.getBodyPromiseTypes().get(function.getName().getName());

		if (null != functionAttributes) {
			String functionType = functionAttributes[0];
			String typeRange = functionAttributes[1];

			CfengineEditorFunctionType typeEnum = CfengineEditorFunctionType.valueOf(functionType);

			if (typeEnum.equals(CfengineEditorFunctionType.OPTION)) {

				ICompletionProposal completionProposal;
				String[] options = typeRange.split(",");

				for (String option : options) {
					completionProposal = createCompletionProposal('"' + option + '"', context);
					acceptor.accept(completionProposal);
				}
			}
		}
	}

	/**
	 * Provides content assist for promise types which are in a body class.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBodyClass_PromiseType(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		CompositeNode node = NodeUtil.getNode(model);
		EObject eObj = NodeUtil.findASTParentElement(node);

		if (eObj instanceof Body) {
			Body body = (Body) eObj;
			completeBody_PromiseType(body, assignment, context, acceptor);
		}
	}

	// public void completeBodyClass_Name(Body body, Assignment assignment, ContentAssistContext context,
	// ICompletionProposalAcceptor acceptor) {
	//
	// completeBody_PromiseType(body, assignment, context, acceptor);
	// }TODO

	private void createProposalsAndAccept(Collection<String> wordList, ContentAssistContext context,// TODO rename
			ICompletionProposalAcceptor acceptor) {

		ICompletionProposal completionProposal;
		for (String label : wordList) {
			// completionProposal = createCompletionProposal(label+"a", label,
			// AbstractUIPlugin.imageDescriptorFromPlugin("edu.kit.scc.cfeditor.cfengine.ui",
			// "icons/cffile.gif").createImage(), context); example, use PluginImageHelper
			completionProposal = createCompletionProposal(label, context);
			acceptor.accept(completionProposal);
		}
	}
}
