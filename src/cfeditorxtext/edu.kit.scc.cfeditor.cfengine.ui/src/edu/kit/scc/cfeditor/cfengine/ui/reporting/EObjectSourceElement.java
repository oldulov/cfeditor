package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import org.eclipse.emf.ecore.EObject;

/**
 * Stores information of a body function element. Contains URI to the file and offset where the body function can be
 * found.
 * 
 * @author Andreas Bender
 */
public class EObjectSourceElement {
	protected String uri;
	protected int offset;
	protected EObject sourceElement;

	/**
	 * The Constructor. Initializes attributes.
	 * 
	 * @param uri
	 *            URI to file
	 * @param offset
	 *            offset in file
	 * @param sourceElement
	 *            the source element
	 */
	public EObjectSourceElement(String uri, int offset, EObject sourceElement) {
		this.uri = uri;
		this.offset = offset;
		this.sourceElement = sourceElement;
	}

	/**
	 * Sets URI.
	 * 
	 * @param uri
	 *            URI as String
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Returns URI as String.
	 * 
	 * @return URI to file
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets Offset.
	 * 
	 * @param offset
	 *            offset value
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Returns the offset value.
	 * 
	 * @return offset value
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the source element.
	 * 
	 * @param sourceElement
	 *            source element object
	 */
	public void setSourceElement(EObject sourceElement) {
		this.sourceElement = sourceElement;
	}

	/**
	 * Returns the source element.
	 * 
	 * @return source element object
	 */
	public EObject getSourceElement() {
		return sourceElement;
	}
}
