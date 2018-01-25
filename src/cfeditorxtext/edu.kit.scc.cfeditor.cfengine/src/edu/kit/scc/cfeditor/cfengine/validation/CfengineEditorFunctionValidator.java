package edu.kit.scc.cfeditor.cfengine.validation;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import edu.kit.scc.cfeditor.cfengine.definitions.CfDefinitionProvider;

/**
 * A validation class, which is responsible for validating BodyFunctions and their values.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorFunctionValidator {
	private final CfDefinitionProvider defProvider = CfDefinitionProvider.getInstance();
	private CfengineEditorFunctionType typeEnum;

	/**
	 * Main method for BodyFunction validation. Returns an error message or null if the function is valid.
	 * 
	 * @param functionName
	 * @param values
	 * @param isList
	 * @param variables
	 * @return error message string or null
	 */
	public String checkBodyFunction(String functionName, EList<String> values, Boolean isList, EList<String> variables) {
		String errorString = null;

		String[] functionAttributes = defProvider.getBodyPromiseTypes().get(functionName);

		if (null != functionAttributes && !values.isEmpty()) {
			String functionType = functionAttributes[0];
			String typeRange = functionAttributes[1];

			try {
				typeEnum = CfengineEditorFunctionType.valueOf(functionType);
				String customMessage;
				switch (typeEnum) {
				case STRING:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (containsVariables(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkSTRING(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case INT:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (containsVariables(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkINT(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case REAL:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (containsVariables(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkREAL(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case SLIST:
					if (!isList) {
						errorString = "List \"{...}\" expected";
					}
					break;
				case IRANGE:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					}
					break;
				case OPTION:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (containsVariables(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkOPTION(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				// FIXME? Maybe log it?
			} catch (NullPointerException e) {
				e.printStackTrace();
				// FIXME?
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
		return errorString;
	}

	/**
	 * Validates values with data type INT.
	 * 
	 * @param value
	 * @param range
	 * @return error message string or null
	 */
	private String checkINT(String value, String range) {
		try {
			long intValue = Long.parseLong(value);

			if (!range.isEmpty()) {
				String[] bounds = range.split(",", 2);
				long low = Long.parseLong(bounds[0]);
				long high = Long.parseLong(bounds[1]);

				if (intValue < low || intValue > high) {
					return "Parameter is out of allowed range";
				}
			}
		} catch (NumberFormatException e) {
			return "Parameter has to be int";
		}
		return null;
	}

	/**
	 * Validates values with data type REAL.
	 * 
	 * @param value
	 * @param range
	 * @return error message string or null
	 */
	private String checkREAL(String value, String range) {
		try {
			double doubleValue = Double.parseDouble(value);

			if (!range.isEmpty()) {
				String[] bounds = range.split(",", 2);
				double low = Double.parseDouble(bounds[0]);
				double high = Double.parseDouble(bounds[1]);

				if (doubleValue < low || doubleValue > high) {
					return "Parameter is out of allowed range";
				}
			}
		} catch (NumberFormatException e) {
			return "Parameter has to be a real number";
		}
		return null;
	}

	/**
	 * Validates values with data type OPTION.
	 * 
	 * @param value
	 * @param strOptions
	 * @return error message string or null
	 */
	private String checkOPTION(String value, String strOptions) {
		String[] options = strOptions.split(",");
		for (String option : options) {
			if (option.equals(value)) {
				return null;
			}
		}
		return "Parameter is no valid option";
	}

	/**
	 * Validates values with data type STRING.
	 * 
	 * @param value
	 * @param pattern
	 * @return error message string or null
	 */
	private String checkSTRING(String value, String pattern) {
		if (!pattern.isEmpty() && !value.matches(pattern)) {
			return "Parameter does not match pattern: " + pattern;
		}
		return null;
	}

	/**
	 * Checks if a string contains at least one variable.
	 * 
	 * @param value
	 * @return true if string contains a variable
	 */
	private Boolean containsVariables(String value) {
		return value.matches(".*\\$\\(.*\\).*") || value.matches(".*\\$\\{.*\\}.*");
	}

	/**
	 * Returns the list of variables out of a string.
	 * 
	 * @param value
	 * @return the list of variables
	 */
	private LinkedList<String> getVariablesFromString(String value) {
		String var = null;
		LinkedList<String> list = new LinkedList<String>();

		while (value.matches(".*\\$\\(.*\\).*")) {
			var = value.substring(value.indexOf("$(") + 2, value.indexOf(')'));
			value = value.substring(0, value.indexOf("$(")) + value.substring(value.indexOf(')') + 1);
			list.add(var);
		}
		while (value.matches(".*\\$\\{.*\\}.*")) {
			var = value.substring(value.indexOf("${") + 2, value.indexOf('}'));
			value = value.substring(0, value.indexOf("${")) + value.substring(value.indexOf('}') + 1);
			list.add(var);
		}

		return list;
	}

	/**
	 * Checks if the variables in a string are in the declared list of variables.
	 * 
	 * @param value
	 * @param variables
	 * @return true if variable are in the declared variable list.
	 */
	private Boolean isInVariables(String value, EList<String> variables) {
		if (null != variables) {
			LinkedList<String> list = getVariablesFromString(value);
			if (variables.containsAll(list)) {
				return true;
			}
		}
		return false;
	}
}
