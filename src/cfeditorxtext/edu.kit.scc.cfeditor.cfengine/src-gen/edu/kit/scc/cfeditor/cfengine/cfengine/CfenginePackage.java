/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfengineFactory
 * @model kind="package"
 * @generated
 */
public interface CfenginePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cfengine";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kit.edu/scc/cfeditor/cfengine/CfengineEditor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cfengine";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CfenginePackage eINSTANCE = edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl.init();

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfModelImpl <em>Cf Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfModelImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getCfModel()
   * @generated
   */
  int CF_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CF_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Cf Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CF_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.AbstractElementImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__VARIABLES = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleImpl <em>Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundle()
   * @generated
   */
  int BUNDLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__VARIABLES = ABSTRACT_ELEMENT__VARIABLES;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__COMPONENT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PROMISE_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl <em>Bundle Promise Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundlePromiseType()
   * @generated
   */
  int BUNDLE_PROMISE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Promises</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_TYPE__PROMISES = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_TYPE__CLASSES = 2;

  /**
   * The number of structural features of the '<em>Bundle Promise Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleClassImpl <em>Bundle Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleClassImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundleClass()
   * @generated
   */
  int BUNDLE_CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Promises</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_CLASS__PROMISES = 1;

  /**
   * The number of structural features of the '<em>Bundle Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseImpl <em>Bundle Promise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundlePromise()
   * @generated
   */
  int BUNDLE_PROMISE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE__VALUES = 1;

  /**
   * The number of structural features of the '<em>Bundle Promise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_PROMISE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.PromiseValueImpl <em>Promise Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.PromiseValueImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getPromiseValue()
   * @generated
   */
  int PROMISE_VALUE = 6;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMISE_VALUE__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMISE_VALUE__VALUES = 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMISE_VALUE__FUNCTIONS = 2;

  /**
   * The number of structural features of the '<em>Promise Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMISE_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBody()
   * @generated
   */
  int BODY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__VARIABLES = ABSTRACT_ELEMENT__VARIABLES;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__COMPONENT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__PROMISE_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__CLASSES = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyClassImpl <em>Body Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyClassImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyClass()
   * @generated
   */
  int BODY_CLASS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Promise Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_CLASS__PROMISE_TYPE = 1;

  /**
   * The number of structural features of the '<em>Body Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl <em>Body Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyFunction()
   * @generated
   */
  int BODY_FUNCTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__VALUES = 1;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__LIST = 2;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION__FUNCTION = 3;

  /**
   * The number of structural features of the '<em>Body Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FUNCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.SimpleFunctionImpl <em>Simple Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.SimpleFunctionImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getSimpleFunction()
   * @generated
   */
  int SIMPLE_FUNCTION = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FUNCTION__ID = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FUNCTION__VALUES = 1;

  /**
   * The number of structural features of the '<em>Simple Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.SpecialFunctionImpl <em>Special Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.SpecialFunctionImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getSpecialFunction()
   * @generated
   */
  int SPECIAL_FUNCTION = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_FUNCTION__ID = 0;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_FUNCTION__FUNC = 1;

  /**
   * The number of structural features of the '<em>Special Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyPromiseTypeImpl <em>Body Promise Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyPromiseTypeImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyPromiseType()
   * @generated
   */
  int BODY_PROMISE_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_PROMISE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Body Promise Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_PROMISE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleComponentImpl <em>Bundle Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleComponentImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundleComponent()
   * @generated
   */
  int BUNDLE_COMPONENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Bundle Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyComponentImpl <em>Body Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyComponentImpl
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyComponent()
   * @generated
   */
  int BODY_COMPONENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Body Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_COMPONENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.CfModel <em>Cf Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cf Model</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfModel
   * @generated
   */
  EClass getCfModel();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.CfModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfModel#getElements()
   * @see #getCfModel()
   * @generated
   */
  EReference getCfModel_Elements();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for the attribute list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variables</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement#getVariables()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Variables();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Bundle
   * @generated
   */
  EClass getBundle();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getComponent()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Component();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getPromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promise Type</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Bundle#getPromiseType()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_PromiseType();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType <em>Bundle Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Promise Type</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType
   * @generated
   */
  EClass getBundlePromiseType();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getName()
   * @see #getBundlePromiseType()
   * @generated
   */
  EAttribute getBundlePromiseType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getPromises <em>Promises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promises</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getPromises()
   * @see #getBundlePromiseType()
   * @generated
   */
  EReference getBundlePromiseType_Promises();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType#getClasses()
   * @see #getBundlePromiseType()
   * @generated
   */
  EReference getBundlePromiseType_Classes();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass <em>Bundle Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Class</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass
   * @generated
   */
  EClass getBundleClass();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass#getName()
   * @see #getBundleClass()
   * @generated
   */
  EAttribute getBundleClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass#getPromises <em>Promises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promises</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass#getPromises()
   * @see #getBundleClass()
   * @generated
   */
  EReference getBundleClass_Promises();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise <em>Bundle Promise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Promise</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise
   * @generated
   */
  EClass getBundlePromise();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise#getName()
   * @see #getBundlePromise()
   * @generated
   */
  EAttribute getBundlePromise_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise#getValues()
   * @see #getBundlePromise()
   * @generated
   */
  EReference getBundlePromise_Values();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue <em>Promise Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Promise Value</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue
   * @generated
   */
  EClass getPromiseValue();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue#getKeyword()
   * @see #getPromiseValue()
   * @generated
   */
  EAttribute getPromiseValue_Keyword();

  /**
   * Returns the meta object for the attribute list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue#getValues()
   * @see #getPromiseValue()
   * @generated
   */
  EAttribute getPromiseValue_Values();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue#getFunctions()
   * @see #getPromiseValue()
   * @generated
   */
  EReference getPromiseValue_Functions();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Body#getComponent()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Component();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getPromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promise Type</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Body#getPromiseType()
   * @see #getBody()
   * @generated
   */
  EReference getBody_PromiseType();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Body#getClasses()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Classes();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass <em>Body Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Class</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass
   * @generated
   */
  EClass getBodyClass();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass#getName()
   * @see #getBodyClass()
   * @generated
   */
  EAttribute getBodyClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass#getPromiseType <em>Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promise Type</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass#getPromiseType()
   * @see #getBodyClass()
   * @generated
   */
  EReference getBodyClass_PromiseType();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction <em>Body Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Function</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction
   * @generated
   */
  EClass getBodyFunction();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getName()
   * @see #getBodyFunction()
   * @generated
   */
  EReference getBodyFunction_Name();

  /**
   * Returns the meta object for the attribute list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getValues()
   * @see #getBodyFunction()
   * @generated
   */
  EAttribute getBodyFunction_Values();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#isList()
   * @see #getBodyFunction()
   * @generated
   */
  EAttribute getBodyFunction_List();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction#getFunction()
   * @see #getBodyFunction()
   * @generated
   */
  EReference getBodyFunction_Function();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction <em>Simple Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Function</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction
   * @generated
   */
  EClass getSimpleFunction();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction#getId()
   * @see #getSimpleFunction()
   * @generated
   */
  EAttribute getSimpleFunction_Id();

  /**
   * Returns the meta object for the attribute list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction#getValues()
   * @see #getSimpleFunction()
   * @generated
   */
  EAttribute getSimpleFunction_Values();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction <em>Special Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Function</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction
   * @generated
   */
  EClass getSpecialFunction();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getId()
   * @see #getSpecialFunction()
   * @generated
   */
  EAttribute getSpecialFunction_Id();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Func</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction#getFunc()
   * @see #getSpecialFunction()
   * @generated
   */
  EReference getSpecialFunction_Func();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType <em>Body Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Promise Type</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType
   * @generated
   */
  EClass getBodyPromiseType();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType#getName()
   * @see #getBodyPromiseType()
   * @generated
   */
  EAttribute getBodyPromiseType_Name();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent <em>Bundle Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Component</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent
   * @generated
   */
  EClass getBundleComponent();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent#getName()
   * @see #getBundleComponent()
   * @generated
   */
  EAttribute getBundleComponent_Name();

  /**
   * Returns the meta object for class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent <em>Body Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Component</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent
   * @generated
   */
  EClass getBodyComponent();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent#getName()
   * @see #getBodyComponent()
   * @generated
   */
  EAttribute getBodyComponent_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CfengineFactory getCfengineFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfModelImpl <em>Cf Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfModelImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getCfModel()
     * @generated
     */
    EClass CF_MODEL = eINSTANCE.getCfModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CF_MODEL__ELEMENTS = eINSTANCE.getCfModel_Elements();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.AbstractElementImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__VARIABLES = eINSTANCE.getAbstractElement_Variables();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleImpl <em>Bundle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundle()
     * @generated
     */
    EClass BUNDLE = eINSTANCE.getBundle();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__COMPONENT = eINSTANCE.getBundle_Component();

    /**
     * The meta object literal for the '<em><b>Promise Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__PROMISE_TYPE = eINSTANCE.getBundle_PromiseType();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl <em>Bundle Promise Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundlePromiseType()
     * @generated
     */
    EClass BUNDLE_PROMISE_TYPE = eINSTANCE.getBundlePromiseType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_PROMISE_TYPE__NAME = eINSTANCE.getBundlePromiseType_Name();

    /**
     * The meta object literal for the '<em><b>Promises</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE_PROMISE_TYPE__PROMISES = eINSTANCE.getBundlePromiseType_Promises();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE_PROMISE_TYPE__CLASSES = eINSTANCE.getBundlePromiseType_Classes();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleClassImpl <em>Bundle Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleClassImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundleClass()
     * @generated
     */
    EClass BUNDLE_CLASS = eINSTANCE.getBundleClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_CLASS__NAME = eINSTANCE.getBundleClass_Name();

    /**
     * The meta object literal for the '<em><b>Promises</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE_CLASS__PROMISES = eINSTANCE.getBundleClass_Promises();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseImpl <em>Bundle Promise</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundlePromise()
     * @generated
     */
    EClass BUNDLE_PROMISE = eINSTANCE.getBundlePromise();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_PROMISE__NAME = eINSTANCE.getBundlePromise_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE_PROMISE__VALUES = eINSTANCE.getBundlePromise_Values();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.PromiseValueImpl <em>Promise Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.PromiseValueImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getPromiseValue()
     * @generated
     */
    EClass PROMISE_VALUE = eINSTANCE.getPromiseValue();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROMISE_VALUE__KEYWORD = eINSTANCE.getPromiseValue_Keyword();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROMISE_VALUE__VALUES = eINSTANCE.getPromiseValue_Values();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROMISE_VALUE__FUNCTIONS = eINSTANCE.getPromiseValue_Functions();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__COMPONENT = eINSTANCE.getBody_Component();

    /**
     * The meta object literal for the '<em><b>Promise Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__PROMISE_TYPE = eINSTANCE.getBody_PromiseType();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__CLASSES = eINSTANCE.getBody_Classes();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyClassImpl <em>Body Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyClassImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyClass()
     * @generated
     */
    EClass BODY_CLASS = eINSTANCE.getBodyClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_CLASS__NAME = eINSTANCE.getBodyClass_Name();

    /**
     * The meta object literal for the '<em><b>Promise Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_CLASS__PROMISE_TYPE = eINSTANCE.getBodyClass_PromiseType();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl <em>Body Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyFunction()
     * @generated
     */
    EClass BODY_FUNCTION = eINSTANCE.getBodyFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_FUNCTION__NAME = eINSTANCE.getBodyFunction_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_FUNCTION__VALUES = eINSTANCE.getBodyFunction_Values();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_FUNCTION__LIST = eINSTANCE.getBodyFunction_List();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_FUNCTION__FUNCTION = eINSTANCE.getBodyFunction_Function();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.SimpleFunctionImpl <em>Simple Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.SimpleFunctionImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getSimpleFunction()
     * @generated
     */
    EClass SIMPLE_FUNCTION = eINSTANCE.getSimpleFunction();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FUNCTION__ID = eINSTANCE.getSimpleFunction_Id();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FUNCTION__VALUES = eINSTANCE.getSimpleFunction_Values();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.SpecialFunctionImpl <em>Special Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.SpecialFunctionImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getSpecialFunction()
     * @generated
     */
    EClass SPECIAL_FUNCTION = eINSTANCE.getSpecialFunction();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIAL_FUNCTION__ID = eINSTANCE.getSpecialFunction_Id();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIAL_FUNCTION__FUNC = eINSTANCE.getSpecialFunction_Func();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyPromiseTypeImpl <em>Body Promise Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyPromiseTypeImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyPromiseType()
     * @generated
     */
    EClass BODY_PROMISE_TYPE = eINSTANCE.getBodyPromiseType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_PROMISE_TYPE__NAME = eINSTANCE.getBodyPromiseType_Name();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleComponentImpl <em>Bundle Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundleComponentImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBundleComponent()
     * @generated
     */
    EClass BUNDLE_COMPONENT = eINSTANCE.getBundleComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_COMPONENT__NAME = eINSTANCE.getBundleComponent_Name();

    /**
     * The meta object literal for the '{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyComponentImpl <em>Body Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyComponentImpl
     * @see edu.kit.scc.cfeditor.cfengine.cfengine.impl.CfenginePackageImpl#getBodyComponent()
     * @generated
     */
    EClass BODY_COMPONENT = eINSTANCE.getBodyComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BODY_COMPONENT__NAME = eINSTANCE.getBodyComponent_Name();

  }

} //CfenginePackage
