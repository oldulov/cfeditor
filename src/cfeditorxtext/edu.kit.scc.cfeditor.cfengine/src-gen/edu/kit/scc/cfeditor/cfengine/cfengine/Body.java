/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getPromiseType <em>Promise Type</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBody()
 * @model
 * @generated
 */
public interface Body extends AbstractElement
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
   * @see #setComponent(BodyComponent)
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBody_Component()
   * @model containment="true"
   * @generated
   */
  BodyComponent getComponent();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(BodyComponent value);

  /**
   * Returns the value of the '<em><b>Promise Type</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promise Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promise Type</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBody_PromiseType()
   * @model containment="true"
   * @generated
   */
  EList<BodyFunction> getPromiseType();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBody_Classes()
   * @model containment="true"
   * @generated
   */
  EList<BodyClass> getClasses();

} // Body
