/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.impl;

import edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Promise Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl#getPromises <em>Promises</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BundlePromiseTypeImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundlePromiseTypeImpl extends MinimalEObjectImpl.Container implements BundlePromiseType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPromises() <em>Promises</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromises()
   * @generated
   * @ordered
   */
  protected EList<BundlePromise> promises;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<BundleClass> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BundlePromiseTypeImpl()
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
    return CfenginePackage.Literals.BUNDLE_PROMISE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfenginePackage.BUNDLE_PROMISE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BundlePromise> getPromises()
  {
    if (promises == null)
    {
      promises = new EObjectContainmentEList<BundlePromise>(BundlePromise.class, this, CfenginePackage.BUNDLE_PROMISE_TYPE__PROMISES);
    }
    return promises;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BundleClass> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<BundleClass>(BundleClass.class, this, CfenginePackage.BUNDLE_PROMISE_TYPE__CLASSES);
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
      case CfenginePackage.BUNDLE_PROMISE_TYPE__PROMISES:
        return ((InternalEList<?>)getPromises()).basicRemove(otherEnd, msgs);
      case CfenginePackage.BUNDLE_PROMISE_TYPE__CLASSES:
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
      case CfenginePackage.BUNDLE_PROMISE_TYPE__NAME:
        return getName();
      case CfenginePackage.BUNDLE_PROMISE_TYPE__PROMISES:
        return getPromises();
      case CfenginePackage.BUNDLE_PROMISE_TYPE__CLASSES:
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
      case CfenginePackage.BUNDLE_PROMISE_TYPE__NAME:
        setName((String)newValue);
        return;
      case CfenginePackage.BUNDLE_PROMISE_TYPE__PROMISES:
        getPromises().clear();
        getPromises().addAll((Collection<? extends BundlePromise>)newValue);
        return;
      case CfenginePackage.BUNDLE_PROMISE_TYPE__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends BundleClass>)newValue);
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
      case CfenginePackage.BUNDLE_PROMISE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CfenginePackage.BUNDLE_PROMISE_TYPE__PROMISES:
        getPromises().clear();
        return;
      case CfenginePackage.BUNDLE_PROMISE_TYPE__CLASSES:
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
      case CfenginePackage.BUNDLE_PROMISE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CfenginePackage.BUNDLE_PROMISE_TYPE__PROMISES:
        return promises != null && !promises.isEmpty();
      case CfenginePackage.BUNDLE_PROMISE_TYPE__CLASSES:
        return classes != null && !classes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BundlePromiseTypeImpl
