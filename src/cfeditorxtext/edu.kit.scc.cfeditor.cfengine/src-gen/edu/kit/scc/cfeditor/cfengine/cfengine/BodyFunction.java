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
 * A representation of the model object '<em><b>Body Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getValues <em>Values</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#isList <em>List</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBodyFunction()
 * @model
 * @generated
 */
public interface BodyFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(BodyPromiseType)
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBodyFunction_Name()
   * @model containment="true"
   * @generated
   */
  BodyPromiseType getName();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(BodyPromiseType value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBodyFunction_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBodyFunction_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBodyFunction_Function()
   * @model containment="true"
   * @generated
   */
  EList<SpecialFunction> getFunction();

} // BodyFunction
