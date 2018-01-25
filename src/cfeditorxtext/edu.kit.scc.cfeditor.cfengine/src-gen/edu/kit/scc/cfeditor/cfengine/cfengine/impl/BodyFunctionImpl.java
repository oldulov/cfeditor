/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.impl;

import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage;
import edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl#isList <em>List</em>}</li>
 *   <li>{@link edu.kit.scc.cfeditor.cfengine.cfengine.impl.BodyFunctionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyFunctionImpl extends MinimalEObjectImpl.Container implements BodyFunction
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected BodyPromiseType name;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The default value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected boolean list = LIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected EList<SpecialFunction> function;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyFunctionImpl()
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
    return CfenginePackage.Literals.BODY_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyPromiseType getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(BodyPromiseType newName, NotificationChain msgs)
  {
    BodyPromiseType oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfenginePackage.BODY_FUNCTION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(BodyPromiseType newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfenginePackage.BODY_FUNCTION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfenginePackage.BODY_FUNCTION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfenginePackage.BODY_FUNCTION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, CfenginePackage.BODY_FUNCTION__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(boolean newList)
  {
    boolean oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfenginePackage.BODY_FUNCTION__LIST, oldList, list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpecialFunction> getFunction()
  {
    if (function == null)
    {
      function = new EObjectContainmentEList<SpecialFunction>(SpecialFunction.class, this, CfenginePackage.BODY_FUNCTION__FUNCTION);
    }
    return function;
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
      case CfenginePackage.BODY_FUNCTION__NAME:
        return basicSetName(null, msgs);
      case CfenginePackage.BODY_FUNCTION__FUNCTION:
        return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
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
      case CfenginePackage.BODY_FUNCTION__NAME:
        return getName();
      case CfenginePackage.BODY_FUNCTION__VALUES:
        return getValues();
      case CfenginePackage.BODY_FUNCTION__LIST:
        return isList();
      case CfenginePackage.BODY_FUNCTION__FUNCTION:
        return getFunction();
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
      case CfenginePackage.BODY_FUNCTION__NAME:
        setName((BodyPromiseType)newValue);
        return;
      case CfenginePackage.BODY_FUNCTION__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case CfenginePackage.BODY_FUNCTION__LIST:
        setList((Boolean)newValue);
        return;
      case CfenginePackage.BODY_FUNCTION__FUNCTION:
        getFunction().clear();
        getFunction().addAll((Collection<? extends SpecialFunction>)newValue);
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
      case CfenginePackage.BODY_FUNCTION__NAME:
        setName((BodyPromiseType)null);
        return;
      case CfenginePackage.BODY_FUNCTION__VALUES:
        getValues().clear();
        return;
      case CfenginePackage.BODY_FUNCTION__LIST:
        setList(LIST_EDEFAULT);
        return;
      case CfenginePackage.BODY_FUNCTION__FUNCTION:
        getFunction().clear();
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
      case CfenginePackage.BODY_FUNCTION__NAME:
        return name != null;
      case CfenginePackage.BODY_FUNCTION__VALUES:
        return values != null && !values.isEmpty();
      case CfenginePackage.BODY_FUNCTION__LIST:
        return list != LIST_EDEFAULT;
      case CfenginePackage.BODY_FUNCTION__FUNCTION:
        return function != null && !function.isEmpty();
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
    result.append(" (values: ");
    result.append(values);
    result.append(", List: ");
    result.append(list);
    result.append(')');
    return result.toString();
  }

} //BodyFunctionImpl
