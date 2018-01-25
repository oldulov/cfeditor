/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.util;

import edu.kit.scc.cfeditor.cfengine.cfengine.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage
 * @generated
 */
public class CfengineAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CfenginePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfengineAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CfenginePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CfengineSwitch<Adapter> modelSwitch =
    new CfengineSwitch<Adapter>()
    {
      @Override
      public Adapter caseCfModel(CfModel object)
      {
        return createCfModelAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseBundle(Bundle object)
      {
        return createBundleAdapter();
      }
      @Override
      public Adapter caseBundlePromiseType(BundlePromiseType object)
      {
        return createBundlePromiseTypeAdapter();
      }
      @Override
      public Adapter caseBundleClass(BundleClass object)
      {
        return createBundleClassAdapter();
      }
      @Override
      public Adapter caseBundlePromise(BundlePromise object)
      {
        return createBundlePromiseAdapter();
      }
      @Override
      public Adapter casePromiseValue(PromiseValue object)
      {
        return createPromiseValueAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseBodyClass(BodyClass object)
      {
        return createBodyClassAdapter();
      }
      @Override
      public Adapter caseBodyFunction(BodyFunction object)
      {
        return createBodyFunctionAdapter();
      }
      @Override
      public Adapter caseSimpleFunction(SimpleFunction object)
      {
        return createSimpleFunctionAdapter();
      }
      @Override
      public Adapter caseSpecialFunction(SpecialFunction object)
      {
        return createSpecialFunctionAdapter();
      }
      @Override
      public Adapter caseBodyPromiseType(BodyPromiseType object)
      {
        return createBodyPromiseTypeAdapter();
      }
      @Override
      public Adapter caseBundleComponent(BundleComponent object)
      {
        return createBundleComponentAdapter();
      }
      @Override
      public Adapter caseBodyComponent(BodyComponent object)
      {
        return createBodyComponentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.CfModel <em>Cf Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfModel
   * @generated
   */
  public Adapter createCfModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Bundle
   * @generated
   */
  public Adapter createBundleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType <em>Bundle Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType
   * @generated
   */
  public Adapter createBundlePromiseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass <em>Bundle Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass
   * @generated
   */
  public Adapter createBundleClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise <em>Bundle Promise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise
   * @generated
   */
  public Adapter createBundlePromiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue <em>Promise Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue
   * @generated
   */
  public Adapter createPromiseValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass <em>Body Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass
   * @generated
   */
  public Adapter createBodyClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction <em>Body Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction
   * @generated
   */
  public Adapter createBodyFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction <em>Simple Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction
   * @generated
   */
  public Adapter createSimpleFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction <em>Special Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction
   * @generated
   */
  public Adapter createSpecialFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType <em>Body Promise Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType
   * @generated
   */
  public Adapter createBodyPromiseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent <em>Bundle Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent
   * @generated
   */
  public Adapter createBundleComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent <em>Body Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent
   * @generated
   */
  public Adapter createBodyComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CfengineAdapterFactory
