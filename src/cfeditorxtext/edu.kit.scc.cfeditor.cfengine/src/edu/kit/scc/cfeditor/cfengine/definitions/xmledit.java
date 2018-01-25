package edu.kit.scc.cfeditor.cfengine.definitions;

//package edu.kit.scc.cfeditor.definitions;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.util.HashMap;
//import java.util.LinkedList;
//
//import org.jdom.Attribute;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.output.Format;
//import org.jdom.output.XMLOutputter;
//
///**
// * Helper class to fill the Definitions.xml with values from text files.
// */
//public class xmledit {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		CfDefinitionProvider defProvider = CfDefinitionProvider.getInstance();
//
//		HashMap<String, LinkedList<String>> bodyFunctions = defProvider.getBodyFunctionsINIT();
//		HashMap<String, String[]> bodyTypes = defProvider.getBodyPromiseTypesINIT();
//		LinkedList<String> functionList = new LinkedList<String>();
//		// XMLEncoder enc = null;
//
//		// try {
//		// enc = new XMLEncoder(new FileOutputStream("outputfile.xml"));
//		// enc.writeObject(bodyFunctions);
//		// } catch (IOException e) {
//		// e.printStackTrace();
//		// } finally {
//		// if (enc != null)
//		// enc.close();
//		// }
//
//		try {
//			// ---- Read XML file ----
//			// SAXBuilder builder = new SAXBuilder();
//			// Document doc = builder.build(new
//			// File("src/org/eclipse/xtext/definitions/defs.xml"));
//
//			Element root = new Element("part");
//
//			Document document = new Document(root);
//			root.addContent(new Element("body"));
//
//			for (String key : bodyFunctions.keySet()) {
//				String attString = "";
//
//				// Element element=root.getChild("body").addContent(
//				// new Element("component").setAttribute("name", key));
//
//				for (String function : bodyFunctions.get(key)) {
//					attString += " " + function;
////					if (!functionList.contains(function))
////						functionList.add(function);
//					
//					// element.addContent(function);
//				}
//				Attribute attribute = new Attribute("promisetypes", attString.trim());
//				root.getChild("body").addContent(
//						new Element("component").setAttribute("name", key).setAttribute(attribute));
//			}
//
////			for (String function : functionList) {
////				root.getChild("body").addContent(
////						new Element("promisetype").setAttribute("name", function).setAttribute("type", "int"));
////			}
//			
//			for (String type : bodyTypes.keySet()) {
//			root.getChild("body").addContent(
//					new Element("promisetype").setAttribute("name", type).setAttribute("type", bodyTypes.get(type)[0]).setAttribute("range", bodyTypes.get(type)[1]));
//			}
//
//			root.addContent(new Element("bundle"));
//			HashMap<String, LinkedList<String>> bundleFunctions = defProvider.getBundleTypesINIT();
//			LinkedList<String> typeList = new LinkedList<String>();
//			for (String key : bundleFunctions.keySet()) {
//				String attString = "";
//
//				// Element element=root.getChild("body").addContent(
//				// new Element("component").setAttribute("name", key));
//
//				for (String function : bundleFunctions.get(key)) {
//					attString += " " + function;
//					if (!typeList.contains(function))
//						typeList.add(function);
//					// element.addContent(function);
//				}
//				Attribute attribute = new Attribute("promisetypes", attString.trim());
//				root.getChild("bundle").addContent(
//						new Element("component").setAttribute("name", key).setAttribute(attribute));
//			}
//
//			for (String function : typeList) {
//				root.getChild("bundle").addContent(
//						new Element("promisetype").setAttribute("name", function).setAttribute("type", "int"));
//			}
//
//			XMLOutputter outputter = new XMLOutputter();
//			outputter.setFormat(Format.getPrettyFormat());
//			outputter.output(document, new FileOutputStream(
//					new File("src/org/eclipse/xtext/definitions/DefinitionsXML")));
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		System.out.println("Done.");
//	}
//
// }
