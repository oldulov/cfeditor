package edu.kit.scc.cfeditor.cfengine.parser.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

/**
 * Overrides some default terminal converters.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorTerminalConverters extends DefaultTerminalConverters {

	/**
	 * Defines a custom string value converter to fix problems with escape characters.
	 * 
	 * @author Andreas Bender
	 * 
	 */
	public static class STRINGValueConverter extends AbstractValueConverter<String> {

		/**
		 * Converts a string value to a string with double quotes.
		 * 
		 * @param value
		 *            value of the string
		 * @return string with quotes
		 */
		public String toString(final String value) {
			if (value == null) {
				throw new ValueConverterException("STRING-value may not be null.", null, null);
			}
			return '"' + Strings.convertToJavaString(value, false) + '"';
		}

		/**
		 * Returns the value of a string. Cuts the quotes at the endings.
		 * 
		 * @param string
		 *            string with quotes
		 * @param node
		 * @return the value of the string without enclosing quotes
		 */
		public String toValue(final String string, final AbstractNode node) {
			if (string == null) {
				return null;
			}
			try {
				return string.substring(1, string.length() - 1);
			} catch (IllegalArgumentException e) {
				throw new ValueConverterException(e.getMessage(), node, e);
			}
		}
	}

	@Inject
	private STRINGValueConverter stringValueConverter;

	/**
	 * Returns an {@link IValueConverter} for strings.
	 * 
	 * @return the string value converter
	 */
	@ValueConverter(rule = "STRING")
	public IValueConverter<String> STRING() {
		return stringValueConverter;
	}

}
