package edu.kit.scc.cfeditor.cfengine.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Provides syntax highlighting styles.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorHighlightingConfiguration extends DefaultHighlightingConfiguration {

	/**
	 * name of style for promise types
	 */
	public static final String PROMISE_TYPE = "promiseTypeHighlighting";

	// @Override
	/**
	 * Registers the default styles for the semantic highlighting stage.
	 * 
	 * @param acceptor
	 *            the acceptor is used to announce the various default styles. It is never <code>null</code>.
	 * @see IHighlightingConfigurationAcceptor#acceptDefaultHighlighting(String, String,
	 *      org.eclipse.xtext.ui.editor.utils.TextStyle)
	 */
	public void configure(final IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(PROMISE_TYPE, "Promise type", promiseType());

		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
	}

	/**
	 * Defines style information for promise types.
	 * 
	 * @return text style
	 */
	public TextStyle promiseType() {
		final TextStyle textStyle = new TextStyle();
		// textStyle.setBackgroundColor(new RGB(155, 55, 255));
		// textStyle.setColor(new RGB(5, 10, 20));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

}
