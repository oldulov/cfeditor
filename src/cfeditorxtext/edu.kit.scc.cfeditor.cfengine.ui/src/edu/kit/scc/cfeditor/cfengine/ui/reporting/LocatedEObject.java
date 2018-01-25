package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import org.eclipse.emf.ecore.EObject;

/**
 * Stores an EObject and the URI of the source file where the EObject code is located.
 * 
 * @author Andreas Bender
 */
public class LocatedEObject {
	private String uri;
	private EObject eObject;

	/**
	 * Constructor.
	 * 
	 * @param uri
	 *            the file URI as string
	 * @param eObject
	 *            the EObject
	 */
	public LocatedEObject(String uri, EObject eObject) {
		this.uri = uri;
		this.eObject = eObject;
	}

	/**
	 * Sets the URI.
	 * 
	 * @param uri
	 *            file URI string
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Returns the URI.
	 * 
	 * @return the URI of the source file
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the EObject.
	 * 
	 * @param eObject
	 *            the EObject
	 */
	public void setEObject(EObject eObject) {
		this.eObject = eObject;
	}

	/**
	 * Returns the EObject.
	 * 
	 * @return the EObject
	 */
	public EObject getEObject() {
		return eObject;
	}
}
