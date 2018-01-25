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
 * A representation of the model object '<em><b>Special Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getSpecialFunction()
 * @model
 * @generated
 */
public interface SpecialFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getSpecialFunction_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getSpecialFunction_Func()
   * @model containment="true"
   * @generated
   */
  EList<SpecialFunction> getFunc();

} // SpecialFunction
