package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement;
import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.Bundle;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfModel;
import edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue;
import edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction;

/**
 * Handles interactions with .cf files and contained cf model elements.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorModelHandler extends ModelHandler {

	/**
	 * Returns a map of all class objects (body and bundle classes) grouped by name which are contained in the given
	 * file list.
	 * <p>
	 * Design of the hash map:
	 * </p>
	 * <p>
	 * String : List of {@link LocatedEObject}<br>
	 * (class name: List of (URI -> class object))
	 * </p>
	 * 
	 * @param uriList
	 *            list of file URIs (as Strings)
	 * @return sorted map (see description)
	 */
	public HashMap<String, LinkedList<LocatedEObject>> getSortedClasses(LinkedList<String> uriList) {
		HashMap<String, EObject> resources = getResourcesMap(uriList);

		HashMap<String, LinkedList<LocatedEObject>> bodyClasses = getSortedBodyClasses(resources);
		HashMap<String, LinkedList<LocatedEObject>> bundleClasses = getSortedBundleClasses(resources);

		for (String bodyClassName : bodyClasses.keySet()) {
			if (bundleClasses.containsKey(bodyClassName)) {
				bundleClasses.get(bodyClassName).addAll(bodyClasses.get(bodyClassName));
			} else {
				bundleClasses.put(bodyClassName, bodyClasses.get(bodyClassName));
			}
		}

		return bundleClasses;
	}

	/**
	 * Returns a map of body class objects grouped by name which are contained in the given file list.
	 * <p>
	 * Design of the hash map:
	 * </p>
	 * <p>
	 * String : List of {@link LocatedEObject}<br>
	 * (class name: List of (URI -> class object))
	 * </p>
	 * 
	 * @param uriList
	 *            list of file URIs (as Strings)
	 * @return sorted map (see description)
	 */
	public HashMap<String, LinkedList<LocatedEObject>> getSortedBodyClasses(LinkedList<String> uriList) {
		return getSortedBodyClasses(getResourcesMap(uriList));
	}

	private HashMap<String, LinkedList<LocatedEObject>> getSortedBodyClasses(HashMap<String, EObject> resourcesMap) {
		HashMap<String, LinkedList<LocatedEObject>> bodyClassesMap = new HashMap<String, LinkedList<LocatedEObject>>();

		CfModel cfModel;

		for (Entry<String, EObject> resource : resourcesMap.entrySet()) {
			cfModel = (CfModel) resource.getValue();
			EList<AbstractElement> elements = cfModel.getElements();

			for (AbstractElement abstractElement : elements) {
				if (abstractElement instanceof Body) {
					EList<BodyClass> classList = ((Body) abstractElement).getClasses();

					for (BodyClass bodyClass : classList) {
						if (bodyClassesMap.containsKey(bodyClass.getName())) {
							bodyClassesMap.get(bodyClass.getName()).add(
									new LocatedEObject(resource.getKey(), bodyClass));
						} else {
							LinkedList<LocatedEObject> tempList = new LinkedList<LocatedEObject>();
							tempList.add(new LocatedEObject(resource.getKey(), bodyClass));
							bodyClassesMap.put(bodyClass.getName(), tempList);
						}
					}
				}
			}
		}

		return bodyClassesMap;
	}

	/**
	 * Returns a map of bundle class objects grouped by name which are contained in the given file list.
	 * <p>
	 * Design of the hash map:
	 * </p>
	 * <p>
	 * String : List of {@link LocatedEObject}<br>
	 * (class name: List of (URI -> class object))
	 * </p>
	 * 
	 * @param uriList
	 *            list of file URIs (as Strings)
	 * @return sorted map (see description)
	 */
	public HashMap<String, LinkedList<LocatedEObject>> getSortedBundleClasses(LinkedList<String> uriList) {
		return getSortedBundleClasses(getResourcesMap(uriList));
	}

	private HashMap<String, LinkedList<LocatedEObject>> getSortedBundleClasses(HashMap<String, EObject> resourcesMap) {
		HashMap<String, LinkedList<LocatedEObject>> bundleClassesMap = new HashMap<String, LinkedList<LocatedEObject>>();

		CfModel cfModel;

		for (Entry<String, EObject> resource : resourcesMap.entrySet()) {
			cfModel = (CfModel) resource.getValue();
			EList<AbstractElement> elements = cfModel.getElements();

			for (AbstractElement abstractElement : elements) {
				if (abstractElement instanceof Bundle) {

					EList<BundlePromiseType> promiseTypes = ((Bundle) abstractElement).getPromiseType();
					for (BundlePromiseType promiseType : promiseTypes) {
						EList<BundleClass> classList = promiseType.getClasses();

						for (BundleClass bundleClass : classList) {
							if (bundleClassesMap.containsKey(bundleClass.getName())) {
								bundleClassesMap.get(bundleClass.getName()).add(
										new LocatedEObject(resource.getKey(), bundleClass));
							} else {
								LinkedList<LocatedEObject> tempList = new LinkedList<LocatedEObject>();
								tempList.add(new LocatedEObject(resource.getKey(), bundleClass));
								bundleClassesMap.put(bundleClass.getName(), tempList);
							}
						}
					}
				}
			}
		}

		return bundleClassesMap;
	}

	/**
	 * Returns a map of class names and corresponding occurrences of the classes.
	 * <p>
	 * HashMap[ClassName][OccurrencesString]
	 * </p>
	 * 
	 * @param uriList
	 *            list of file URIs (as Strings)
	 * @return the class-occurrences map
	 */
	public HashMap<String, String> getClassOccurrences(LinkedList<String> uriList) {
		return getClassOccurrences(getResourcesMap(uriList));
	}

	private HashMap<String, String> getClassOccurrences(HashMap<String, EObject> resourcesMap) {
		HashMap<String, String> occurrenceMap = new HashMap<String, String>();

		CfModel cfModel;

		EList<BundlePromise> globalVarsPromises = getGlobalVars(resourcesMap);

		for (Entry<String, EObject> resource : resourcesMap.entrySet()) {
			cfModel = (CfModel) resource.getValue();

			EList<AbstractElement> elements = cfModel.getElements();
			for (AbstractElement abstractElement : elements) {
				if (abstractElement instanceof Bundle) {
					EList<BundlePromiseType> promiseTypes = ((Bundle) abstractElement).getPromiseType();
					EList<BundlePromise> classesPromises = new BasicEList<BundlePromise>();
					EList<BundlePromise> varsPromises = new BasicEList<BundlePromise>();

					for (BundlePromiseType promiseType : promiseTypes) {
						if (promiseType.getName().equals("classes")) {
							classesPromises.addAll(promiseType.getPromises());
						}

						if (promiseType.getName().equals("vars")) {
							varsPromises.addAll(promiseType.getPromises());
						}
					}

					varsPromises.addAll(globalVarsPromises);

					occurrenceMap.putAll(resolveOccurrences(classesPromises, varsPromises));
				}
			}

		}

		return occurrenceMap;
	}

	/**
	 * Returns all global variables which are defined in "bundle common ... {vars: ...}".
	 * 
	 * @param resourcesMap
	 *            the resources to be scanned
	 * @return list of promises of the global variables
	 */
	private EList<BundlePromise> getGlobalVars(HashMap<String, EObject> resourcesMap) {
		EList<BundlePromise> globalVars = new BasicEList<BundlePromise>();

		CfModel cfModel;

		for (Entry<String, EObject> resource : resourcesMap.entrySet()) {
			cfModel = (CfModel) resource.getValue();

			EList<AbstractElement> elements = cfModel.getElements();
			for (AbstractElement abstractElement : elements) {
				if (abstractElement instanceof Bundle) {
					if (((Bundle) abstractElement).getComponent().getName().equals("common")) {

						EList<BundlePromiseType> promiseTypes = ((Bundle) abstractElement).getPromiseType();

						for (BundlePromiseType promiseType : promiseTypes) {
							if (promiseType.getName().equals("vars")) {
								globalVars.addAll(promiseType.getPromises());
							}
						}
					}
				}
			}
		}

		return globalVars;
	}

	/**
	 * Resolves class occurrences from given (BundlePromise) class list.
	 * 
	 * @param classes
	 *            the class promises
	 * @param variables
	 *            all variables in project
	 * @return class-occurrences map
	 */
	private HashMap<String, String> resolveOccurrences(EList<BundlePromise> classes, EList<BundlePromise> variables) {
		HashMap<String, String> occurenceMap = new HashMap<String, String>();

		for (BundlePromise promise : classes) {
			EList<PromiseValue> promiseValues = promise.getValues();
			for (PromiseValue promiseValue : promiseValues) {
				String occString = getOccurrenceString(promiseValue, variables);
				if (!occString.isEmpty()) {
					occurenceMap.put(promise.getName(), occString);
					break;
				}
			}
		}

		return occurenceMap;
	}

	/**
	 * Returns the string of occurrences.
	 * 
	 * @param promiseValue
	 * @param variables
	 *            all variables in project
	 * @return occurrence string
	 */
	private String getOccurrenceString(PromiseValue promiseValue, EList<BundlePromise> variables) {
		StringBuilder strBuilder = new StringBuilder();

		String keyword = promiseValue.getKeyword();

		if (keyword.equals("or") || keyword.equals("expression") || keyword.equals("not")) {
			if (!promiseValue.getFunctions().isEmpty()) {
				strBuilder.append(resolveOccurrencesFromFunctions(promiseValue.getFunctions(), variables, ","));
			}

			if (!promiseValue.getValues().isEmpty()) {
				if (strBuilder.length() > 0) {
					strBuilder.append(",");
				}
				strBuilder.append(resolveOccurrencesFromValues(promiseValue.getValues(), variables, ","));
			}

		} else if (keyword.equals("and")) {
			if (!promiseValue.getFunctions().isEmpty()) {
				strBuilder.append(resolveOccurrencesFromFunctions(promiseValue.getFunctions(), variables, "&"));
			}

			if (!promiseValue.getValues().isEmpty()) {
				if (strBuilder.length() > 0) {
					strBuilder.append("&");
				}
				strBuilder.append(resolveOccurrencesFromValues(promiseValue.getValues(), variables, "&"));
			}
		} else if (keyword.equals("dist")) {
			strBuilder.append("dist");
		}

		return strBuilder.toString();
	}

	private String resolveOccurrencesFromFunctions(EList<SimpleFunction> functions, EList<BundlePromise> variables,
			String separator) {
		StringBuilder strBuilder = new StringBuilder();

		for (SimpleFunction function : functions) {
			if (function.getId().equals("classify") || function.getId().equals("classmatch")) {
				if (strBuilder.length() > 0) {
					strBuilder.append(separator);
				}
				strBuilder.append(resolveOccurrencesFromValues(function.getValues(), variables, separator));
			} else {
				if (strBuilder.length() > 0) {
					strBuilder.append(separator);
				}
				strBuilder.append(function.getId());
			}
		}

		return strBuilder.toString();
	}

	private String resolveOccurrencesFromValues(EList<String> values, EList<BundlePromise> variables, String separator) {
		StringBuilder strBuilder = new StringBuilder();
		for (String value : values) {
			if (value.matches(".*\\$\\(.*\\).*") || value.matches(".*\\$\\{.*\\}.*")) {
				String var = resolveVariable(value, variables);
				if (var != null) {
					strBuilder.append(var);
				}

			} else {
				strBuilder.append(value);
			}
			strBuilder.append(separator);
		}
		strBuilder.deleteCharAt(strBuilder.length() - 1);

		return strBuilder.toString();
	}

	/**
	 * Returns the value of a variable.
	 * 
	 * @param id
	 *            the string representation of a variable like "$(var)"
	 * @param variables
	 *            list of all variables
	 * @return the resolved value of the variable
	 */
	private String resolveVariable(String id, EList<BundlePromise> variables) {
		if (variables != null) {
			String name = id.substring(2, id.length() - 1);

			for (BundlePromise variable : variables) {
				if (variable.getName().equals(name)) {
					for (PromiseValue promiseValue : variable.getValues()) {
						if (promiseValue.getKeyword().equals("string")) {
							return promiseValue.getValues().get(0);
						}
					}
				}
			}
		}
		return null;
	}
}
