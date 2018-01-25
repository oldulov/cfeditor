/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cf Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.CfModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getCfModel()
 * @model
 * @generated
 */
public interface CfModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getCfModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // CfModel
