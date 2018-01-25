/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getPromiseType <em>Promise Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(BundleComponent)
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundle_Component()
   * @model containment="true"
   * @generated
   */
  BundleComponent getComponent();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(BundleComponent value);

  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundle_PromiseType()
   * @model containment="true"
   * @generated
   */
  EList<BundlePromiseType> getPromiseType();

} // Bundle
