/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.impl;

import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl#getPromiseType <em>Promise Type</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends AbstractElementImpl implements Body
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected BodyComponent component;

  /**
   * The cached value of the '{@link #getPromiseType() <em>Promise Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromiseType()
   * @generated
   * @ordered
   */
  protected EList<BodyFunction> promiseType;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<BodyClass> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CfenginePackage.Literals.BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyComponent getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(BodyComponent newComponent, NotificationChain msgs)
  {
    BodyComponent oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfenginePackage.BODY__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(BodyComponent newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfenginePackage.BODY__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfenginePackage.BODY__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfenginePackage.BODY__COMPONENT, newComponent, newComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyFunction> getPromiseType()
  {
    if (promiseType == null)
    {
      promiseType = new EObjectContainmentEList<BodyFunction>(BodyFunction.class, this, CfenginePackage.BODY__PROMISE_TYPE);
    }
    return promiseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyClass> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<BodyClass>(BodyClass.class, this, CfenginePackage.BODY__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CfenginePackage.BODY__COMPONENT:
        return basicSetComponent(null, msgs);
      case CfenginePackage.BODY__PROMISE_TYPE:
        return ((InternalEList<?>)getPromiseType()).basicRemove(otherEnd, msgs);
      case CfenginePackage.BODY__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CfenginePackage.BODY__COMPONENT:
        return getComponent();
      case CfenginePackage.BODY__PROMISE_TYPE:
        return getPromiseType();
      case CfenginePackage.BODY__CLASSES:
        return getClasses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CfenginePackage.BODY__COMPONENT:
        setComponent((BodyComponent)newValue);
        return;
      case CfenginePackage.BODY__PROMISE_TYPE:
        getPromiseType().clear();
        getPromiseType().addAll((Collection<? extends BodyFunction>)newValue);
        return;
      case CfenginePackage.BODY__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends BodyClass>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CfenginePackage.BODY__COMPONENT:
        setComponent((BodyComponent)null);
        return;
      case CfenginePackage.BODY__PROMISE_TYPE:
        getPromiseType().clear();
        return;
      case CfenginePackage.BODY__CLASSES:
        getClasses().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CfenginePackage.BODY__COMPONENT:
        return component != null;
      case CfenginePackage.BODY__PROMISE_TYPE:
        return promiseType != null && !promiseType.isEmpty();
      case CfenginePackage.BODY__CLASSES:
        return classes != null && !classes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BodyImpl
