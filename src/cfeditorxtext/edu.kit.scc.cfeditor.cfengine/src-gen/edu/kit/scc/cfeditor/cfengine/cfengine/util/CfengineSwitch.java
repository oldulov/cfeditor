/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.util;

import edu.kit.scc.cfeditor.cfengine.cfengine.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage
 * @generated
 */
public class CfengineSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CfenginePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfengineSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CfenginePackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CfenginePackage.CF_MODEL:
      {
        CfModel cfModel = (CfModel)theEObject;
        T result = caseCfModel(cfModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BUNDLE:
      {
        Bundle bundle = (Bundle)theEObject;
        T result = caseBundle(bundle);
        if (result == null) result = caseAbstractElement(bundle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BUNDLE_PROMISE_TYPE:
      {
        BundlePromiseType bundlePromiseType = (BundlePromiseType)theEObject;
        T result = caseBundlePromiseType(bundlePromiseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BUNDLE_CLASS:
      {
        BundleClass bundleClass = (BundleClass)theEObject;
        T result = caseBundleClass(bundleClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BUNDLE_PROMISE:
      {
        BundlePromise bundlePromise = (BundlePromise)theEObject;
        T result = caseBundlePromise(bundlePromise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.PROMISE_VALUE:
      {
        PromiseValue promiseValue = (PromiseValue)theEObject;
        T result = casePromiseValue(promiseValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseAbstractElement(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BODY_CLASS:
      {
        BodyClass bodyClass = (BodyClass)theEObject;
        T result = caseBodyClass(bodyClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BODY_FUNCTION:
      {
        BodyFunction bodyFunction = (BodyFunction)theEObject;
        T result = caseBodyFunction(bodyFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.SIMPLE_FUNCTION:
      {
        SimpleFunction simpleFunction = (SimpleFunction)theEObject;
        T result = caseSimpleFunction(simpleFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.SPECIAL_FUNCTION:
      {
        SpecialFunction specialFunction = (SpecialFunction)theEObject;
        T result = caseSpecialFunction(specialFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BODY_PROMISE_TYPE:
      {
        BodyPromiseType bodyPromiseType = (BodyPromiseType)theEObject;
        T result = caseBodyPromiseType(bodyPromiseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BUNDLE_COMPONENT:
      {
        BundleComponent bundleComponent = (BundleComponent)theEObject;
        T result = caseBundleComponent(bundleComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfenginePackage.BODY_COMPONENT:
      {
        BodyComponent bodyComponent = (BodyComponent)theEObject;
        T result = caseBodyComponent(bodyComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cf Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cf Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCfModel(CfModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundle(Bundle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle Promise Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle Promise Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundlePromiseType(BundlePromiseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundleClass(BundleClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle Promise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle Promise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundlePromise(BundlePromise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Promise Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Promise Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePromiseValue(PromiseValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyClass(BodyClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyFunction(BodyFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleFunction(SimpleFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Special Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Special Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecialFunction(SpecialFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Promise Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Promise Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyPromiseType(BodyPromiseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundleComponent(BundleComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyComponent(BodyComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CfengineSwitch
