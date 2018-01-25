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
 * A representation of the model object '<em><b>Bundle Promise Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getPromises <em>Promises</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundlePromiseType()
 * @model
 * @generated
 */
public interface BundlePromiseType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundlePromiseType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Promises</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promises</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promises</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundlePromiseType_Promises()
   * @model containment="true"
   * @generated
   */
  EList<BundlePromise> getPromises();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#getBundlePromiseType_Classes()
   * @model containment="true"
   * @generated
   */
  EList<BundleClass> getClasses();

} // BundlePromiseType
