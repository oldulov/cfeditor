package edu.kit.scc.cfeditor.cfengine.definitions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

/**
 * Provides content of files containing predefined strings. This class is a singleton.
 * 
 * @author Andreas Bender
 * 
 */
public final class CfDefinitionProvider {

	/**
	 * name of the file containing the language definitions
	 */
	private static final String DEFINITION_FILE_NAME = "Definitions.xml";

	/**
	 * map for storing bundle types
	 */
	private Map<String, List<String>> bundleTypes = null;

	/**
	 * map for storing body types
	 */
	private Map<String, String[]> bodyTypes = null;

	/**
	 * map for storing body functions
	 */
	private Map<String, List<String>> bodyFunctions = null;

	/**
	 * holds the instance of this class
	 */
	private static final CfDefinitionProvider INSTANCE = new CfDefinitionProvider();

	/**
	 * private constructor for singleton pattern
	 */
	private CfDefinitionProvider() {
	}

	private Namespace nsCfeditor = Namespace.getNamespace("http://www.kit.edu/scc/Cfeditor");

	/**
	 * Returns a list of the definition strings in a given file.
	 * 
	 * @param fileName
	 *            the name of the definition file
	 * @return list of definition strings
	 */
	public List<String> getDefinitions(final String fileName) {
		List<String> definitionList = new ArrayList<String>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass()
					.getResourceAsStream(fileName)));
			String currentLine;
			while ((currentLine = bufferedReader.readLine()) != null) {
				if (!currentLine.trim().isEmpty()) {
					definitionList.add(currentLine.trim());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return definitionList;
	}

	/**
	 * Returns an input stream to a definition file.
	 * 
	 * @param fileName
	 *            the name of the definition file
	 * @return input stream to the file
	 */
	public InputStream getDefinitionStream(final String fileName) {
		return this.getClass().getResourceAsStream(fileName);
	}

	/**
	 * Returns a Map containing the mapping of bundle components to allowed promise types.
	 * 
	 * @return the component - promise types map
	 */
	public Map<String, List<String>> getBundleTypes() {
		if (null == bundleTypes) {
			bundleTypes = new HashMap<String, List<String>>();
			LinkedList<String> linkedList;
			final SAXBuilder builder = new SAXBuilder();
			try {
				final Document doc = builder.build(this.getClass().getResourceAsStream(DEFINITION_FILE_NAME));

				@SuppressWarnings("unchecked")
				final List<Element> list = (List<Element>) doc.getRootElement().getChild("bundle", nsCfeditor)
						.getChildren("component", nsCfeditor);

				String componentName;
				StringTokenizer tokenizer;

				for (Element component : list) {
					componentName = component.getAttributeValue("name");
					tokenizer = new StringTokenizer(component.getAttributeValue("promisetypes"));

					while (tokenizer.hasMoreTokens()) {
						if (bundleTypes.containsKey(componentName)) {
							bundleTypes.get(componentName).add(tokenizer.nextToken());
						} else {
							linkedList = new LinkedList<String>();
							linkedList.add(tokenizer.nextToken());
							bundleTypes.put(componentName, linkedList);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return bundleTypes;
	}

	/**
	 * Returns a Map containing the mapping of bundle components to allowed promise types.
	 * 
	 * @return the component - promise types map
	 */
	public Map<String, List<String>> getBundleTypesINIT() {
		if (null == bundleTypes) {

			bundleTypes = new HashMap<String, List<String>>();
			LinkedList<String> linkedList;
			String[] values;

			try {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass()
						.getResourceAsStream("BundleTypes")));
				String currentLine;
				while ((currentLine = bufferedReader.readLine()) != null) {
					values = currentLine.split("#", 2);
					if (values.length == 2) { // components without defined promise types are ignored
						if (bundleTypes.containsKey(values[0])) {
							bundleTypes.get(values[0]).add(values[1]);
						} else {
							linkedList = new LinkedList<String>();
							linkedList.add(values[1]);
							bundleTypes.put(values[0], linkedList);
						}
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return bundleTypes;
	}

	/**
	 * Returns a Map containing the mapping of body components to allowed promise types.
	 * 
	 * @return the component - promise types map
	 */
	public Map<String, List<String>> getBodyFunctionsINIT() {
		if (null == bodyFunctions) {
			bodyFunctions = new HashMap<String, List<String>>();
			LinkedList<String> linkedList;
			try {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass()
						.getResourceAsStream("BodyFunctions")));
				String currentLine;
				while ((currentLine = bufferedReader.readLine()) != null) {
					String[] values = currentLine.split("#", 2);
					if (bodyFunctions.containsKey(values[0])) {
						bodyFunctions.get(values[0]).add(values[1]);
					} else {
						linkedList = new LinkedList<String>();
						linkedList.add(values[1]);
						bodyFunctions.put(values[0], linkedList);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bodyFunctions;
	}

	/**
	 * Returns a Map containing the mapping of body components to allowed promise types.
	 * 
	 * @return the component - promise types map
	 */
	public Map<String, List<String>> getBodyFunctions() {
		if (null == bodyFunctions) {
			bodyFunctions = new HashMap<String, List<String>>();
			LinkedList<String> linkedList;
			final SAXBuilder builder = new SAXBuilder();
			try {
				final Document doc = builder.build(this.getClass().getResourceAsStream(DEFINITION_FILE_NAME));

				@SuppressWarnings("unchecked")
				final List<Element> list = (List<Element>) doc.getRootElement().getChild("body", nsCfeditor)
						.getChildren("component", nsCfeditor);

				String componentName;
				StringTokenizer tokenizer;

				for (Element component : list) {
					componentName = component.getAttributeValue("name");
					tokenizer = new StringTokenizer(component.getAttributeValue("promisetypes"));

					while (tokenizer.hasMoreTokens()) {
						if (bodyFunctions.containsKey(componentName)) {
							bodyFunctions.get(componentName).add(tokenizer.nextToken());
						} else {
							linkedList = new LinkedList<String>();
							linkedList.add(tokenizer.nextToken());
							bodyFunctions.put(componentName, linkedList);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return bodyFunctions;
	}

	/**
	 * Returns a mapping between promise type names and their type and range.
	 * 
	 * @return the promise types
	 */
	public Map<String, String[]> getBodyPromiseTypes() {
		if (null == bodyTypes) {
			bodyTypes = new HashMap<String, String[]>();
			SAXBuilder builder = new SAXBuilder();

			try {
				Document doc = builder.build(this.getClass().getResourceAsStream(DEFINITION_FILE_NAME));

				@SuppressWarnings("unchecked")
				List<Element> list = (List<Element>) doc.getRootElement().getChild("body", nsCfeditor)
						.getChildren("promisetype", nsCfeditor);

				for (Element promiseType : list) {
					bodyTypes.put(
							promiseType.getAttributeValue("name"),
							new String[] { promiseType.getAttributeValue("type"),
									promiseType.getAttributeValue("range") });
				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return bodyTypes;
	}

	/**
	 * Returns a mapping between promise type names and their type and range.
	 * 
	 * @return the promise types
	 */
	public Map<String, String[]> getBodyPromiseTypesINIT() {
		if (null == bodyTypes) {
			bodyTypes = new HashMap<String, String[]>();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass()
					.getResourceAsStream("BodyPromiseTypes")));

			try {
				String currentLine;
				while ((currentLine = bufferedReader.readLine()) != null) {
					String[] values = currentLine.split("#", 3);

					bodyTypes.put(values[0], new String[] { values[1], values[2] });
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return bodyTypes;
	}

	/**
	 * Returns the instance of this class.
	 * 
	 * @return instance of CfDefinitionProvider.class
	 */
	public static CfDefinitionProvider getInstance() {
		return INSTANCE;
	}

}
