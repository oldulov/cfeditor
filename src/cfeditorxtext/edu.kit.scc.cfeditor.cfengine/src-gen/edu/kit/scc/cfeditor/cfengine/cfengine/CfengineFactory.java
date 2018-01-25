/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage
 * @generated
 */
public interface CfengineFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CfengineFactory eINSTANCE = edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfengineFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cf Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cf Model</em>'.
   * @generated
   */
  CfModel createCfModel();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Bundle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle</em>'.
   * @generated
   */
  Bundle createBundle();

  /**
   * Returns a new object of class '<em>Bundle Promise Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle Promise Type</em>'.
   * @generated
   */
  BundlePromiseType createBundlePromiseType();

  /**
   * Returns a new object of class '<em>Bundle Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle Class</em>'.
   * @generated
   */
  BundleClass createBundleClass();

  /**
   * Returns a new object of class '<em>Bundle Promise</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle Promise</em>'.
   * @generated
   */
  BundlePromise createBundlePromise();

  /**
   * Returns a new object of class '<em>Promise Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Promise Value</em>'.
   * @generated
   */
  PromiseValue createPromiseValue();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Body Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Class</em>'.
   * @generated
   */
  BodyClass createBodyClass();

  /**
   * Returns a new object of class '<em>Body Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Function</em>'.
   * @generated
   */
  BodyFunction createBodyFunction();

  /**
   * Returns a new object of class '<em>Simple Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Function</em>'.
   * @generated
   */
  SimpleFunction createSimpleFunction();

  /**
   * Returns a new object of class '<em>Special Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Function</em>'.
   * @generated
   */
  SpecialFunction createSpecialFunction();

  /**
   * Returns a new object of class '<em>Body Promise Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Promise Type</em>'.
   * @generated
   */
  BodyPromiseType createBodyPromiseType();

  /**
   * Returns a new object of class '<em>Bundle Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle Component</em>'.
   * @generated
   */
  BundleComponent createBundleComponent();

  /**
   * Returns a new object of class '<em>Body Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Component</em>'.
   * @generated
   */
  BodyComponent createBodyComponent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CfenginePackage getCfenginePackage();

} //CfengineFactory
