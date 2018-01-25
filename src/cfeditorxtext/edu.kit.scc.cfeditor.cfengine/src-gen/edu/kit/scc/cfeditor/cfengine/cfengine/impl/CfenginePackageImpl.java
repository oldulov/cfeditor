/**
 * <copyright>
 * </copyright>
 *

 */
package edu.kit.scc.cfeditor.cfengine.cfengine.impl;

import edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement;
import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyComponent;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.Bundle;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundleClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundleComponent;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromise;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfModel;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfengineFactory;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage;
import edu.kit.scc.cfeditor.cfengine.cfengine.PromiseValue;
import edu.kit.scc.cfeditor.cfengine.cfengine.SimpleFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.SpecialFunction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfenginePackageImpl extends EPackageImpl implements CfenginePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cfModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bundleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bundlePromiseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bundleClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bundlePromiseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass promiseValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specialFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyPromiseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bundleComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyComponentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CfenginePackageImpl()
  {
    super(eNS_URI, CfengineFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CfenginePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CfenginePackage init()
  {
    if (isInited) return (CfenginePackage)EPackage.Registry.INSTANCE.getEPackage(CfenginePackage.eNS_URI);

    // Obtain or create and register package
    CfenginePackageImpl theCfenginePackage = (CfenginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CfenginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CfenginePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCfenginePackage.createPackageContents();

    // Initialize created meta-data
    theCfenginePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCfenginePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CfenginePackage.eNS_URI, theCfenginePackage);
    return theCfenginePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCfModel()
  {
    return cfModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCfModel_Elements()
  {
    return (EReference)cfModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Variables()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBundle()
  {
    return bundleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBundle_Component()
  {
    return (EReference)bundleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBundle_PromiseType()
  {
    return (EReference)bundleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBundlePromiseType()
  {
    return bundlePromiseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBundlePromiseType_Name()
  {
    return (EAttribute)bundlePromiseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBundlePromiseType_Promises()
  {
    return (EReference)bundlePromiseTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBundlePromiseType_Classes()
  {
    return (EReference)bundlePromiseTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBundleClass()
  {
    return bundleClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBundleClass_Name()
  {
    return (EAttribute)bundleClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBundleClass_Promises()
  {
    return (EReference)bundleClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBundlePromise()
  {
    return bundlePromiseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBundlePromise_Name()
  {
    return (EAttribute)bundlePromiseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBundlePromise_Values()
  {
    return (EReference)bundlePromiseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPromiseValue()
  {
    return promiseValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPromiseValue_Keyword()
  {
    return (EAttribute)promiseValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPromiseValue_Values()
  {
    return (EAttribute)promiseValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPromiseValue_Functions()
  {
    return (EReference)promiseValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Component()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_PromiseType()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Classes()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyClass()
  {
    return bodyClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyClass_Name()
  {
    return (EAttribute)bodyClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyClass_PromiseType()
  {
    return (EReference)bodyClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyFunction()
  {
    return bodyFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyFunction_Name()
  {
    return (EReference)bodyFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyFunction_Values()
  {
    return (EAttribute)bodyFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyFunction_List()
  {
    return (EAttribute)bodyFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyFunction_Function()
  {
    return (EReference)bodyFunctionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleFunction()
  {
    return simpleFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleFunction_Id()
  {
    return (EAttribute)simpleFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleFunction_Values()
  {
    return (EAttribute)simpleFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecialFunction()
  {
    return specialFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecialFunction_Id()
  {
    return (EAttribute)specialFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecialFunction_Func()
  {
    return (EReference)specialFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyPromiseType()
  {
    return bodyPromiseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyPromiseType_Name()
  {
    return (EAttribute)bodyPromiseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBundleComponent()
  {
    return bundleComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBundleComponent_Name()
  {
    return (EAttribute)bundleComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyComponent()
  {
    return bodyComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyComponent_Name()
  {
    return (EAttribute)bodyComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfengineFactory getCfengineFactory()
  {
    return (CfengineFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cfModelEClass = createEClass(CF_MODEL);
    createEReference(cfModelEClass, CF_MODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__VARIABLES);

    bundleEClass = createEClass(BUNDLE);
    createEReference(bundleEClass, BUNDLE__COMPONENT);
    createEReference(bundleEClass, BUNDLE__PROMISE_TYPE);

    bundlePromiseTypeEClass = createEClass(BUNDLE_PROMISE_TYPE);
    createEAttribute(bundlePromiseTypeEClass, BUNDLE_PROMISE_TYPE__NAME);
    createEReference(bundlePromiseTypeEClass, BUNDLE_PROMISE_TYPE__PROMISES);
    createEReference(bundlePromiseTypeEClass, BUNDLE_PROMISE_TYPE__CLASSES);

    bundleClassEClass = createEClass(BUNDLE_CLASS);
    createEAttribute(bundleClassEClass, BUNDLE_CLASS__NAME);
    createEReference(bundleClassEClass, BUNDLE_CLASS__PROMISES);

    bundlePromiseEClass = createEClass(BUNDLE_PROMISE);
    createEAttribute(bundlePromiseEClass, BUNDLE_PROMISE__NAME);
    createEReference(bundlePromiseEClass, BUNDLE_PROMISE__VALUES);

    promiseValueEClass = createEClass(PROMISE_VALUE);
    createEAttribute(promiseValueEClass, PROMISE_VALUE__KEYWORD);
    createEAttribute(promiseValueEClass, PROMISE_VALUE__VALUES);
    createEReference(promiseValueEClass, PROMISE_VALUE__FUNCTIONS);

    bodyEClass = createEClass(BODY);
    createEReference(bodyEClass, BODY__COMPONENT);
    createEReference(bodyEClass, BODY__PROMISE_TYPE);
    createEReference(bodyEClass, BODY__CLASSES);

    bodyClassEClass = createEClass(BODY_CLASS);
    createEAttribute(bodyClassEClass, BODY_CLASS__NAME);
    createEReference(bodyClassEClass, BODY_CLASS__PROMISE_TYPE);

    bodyFunctionEClass = createEClass(BODY_FUNCTION);
    createEReference(bodyFunctionEClass, BODY_FUNCTION__NAME);
    createEAttribute(bodyFunctionEClass, BODY_FUNCTION__VALUES);
    createEAttribute(bodyFunctionEClass, BODY_FUNCTION__LIST);
    createEReference(bodyFunctionEClass, BODY_FUNCTION__FUNCTION);

    simpleFunctionEClass = createEClass(SIMPLE_FUNCTION);
    createEAttribute(simpleFunctionEClass, SIMPLE_FUNCTION__ID);
    createEAttribute(simpleFunctionEClass, SIMPLE_FUNCTION__VALUES);

    specialFunctionEClass = createEClass(SPECIAL_FUNCTION);
    createEAttribute(specialFunctionEClass, SPECIAL_FUNCTION__ID);
    createEReference(specialFunctionEClass, SPECIAL_FUNCTION__FUNC);

    bodyPromiseTypeEClass = createEClass(BODY_PROMISE_TYPE);
    createEAttribute(bodyPromiseTypeEClass, BODY_PROMISE_TYPE__NAME);

    bundleComponentEClass = createEClass(BUNDLE_COMPONENT);
    createEAttribute(bundleComponentEClass, BUNDLE_COMPONENT__NAME);

    bodyComponentEClass = createEClass(BODY_COMPONENT);
    createEAttribute(bodyComponentEClass, BODY_COMPONENT__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bundleEClass.getESuperTypes().add(this.getAbstractElement());
    bodyEClass.getESuperTypes().add(this.getAbstractElement());

    // Initialize classes and features; add operations and parameters
    initEClass(cfModelEClass, CfModel.class, "CfModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCfModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, CfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractElement_Variables(), ecorePackage.getEString(), "variables", null, 0, -1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBundle_Component(), this.getBundleComponent(), null, "component", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBundle_PromiseType(), this.getBundlePromiseType(), null, "promiseType", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bundlePromiseTypeEClass, BundlePromiseType.class, "BundlePromiseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBundlePromiseType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BundlePromiseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBundlePromiseType_Promises(), this.getBundlePromise(), null, "promises", null, 0, -1, BundlePromiseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBundlePromiseType_Classes(), this.getBundleClass(), null, "classes", null, 0, -1, BundlePromiseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bundleClassEClass, BundleClass.class, "BundleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBundleClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, BundleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBundleClass_Promises(), this.getBundlePromise(), null, "promises", null, 0, -1, BundleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bundlePromiseEClass, BundlePromise.class, "BundlePromise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBundlePromise_Name(), ecorePackage.getEString(), "name", null, 0, 1, BundlePromise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBundlePromise_Values(), this.getPromiseValue(), null, "values", null, 0, -1, BundlePromise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(promiseValueEClass, PromiseValue.class, "PromiseValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPromiseValue_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, PromiseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPromiseValue_Values(), ecorePackage.getEString(), "values", null, 0, -1, PromiseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPromiseValue_Functions(), this.getSimpleFunction(), null, "functions", null, 0, -1, PromiseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBody_Component(), this.getBodyComponent(), null, "component", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_PromiseType(), this.getBodyFunction(), null, "promiseType", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Classes(), this.getBodyClass(), null, "classes", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyClassEClass, BodyClass.class, "BodyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBodyClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, BodyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyClass_PromiseType(), this.getBodyFunction(), null, "promiseType", null, 0, -1, BodyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyFunctionEClass, BodyFunction.class, "BodyFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBodyFunction_Name(), this.getBodyPromiseType(), null, "name", null, 0, 1, BodyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBodyFunction_Values(), ecorePackage.getEString(), "values", null, 0, -1, BodyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBodyFunction_List(), ecorePackage.getEBoolean(), "List", null, 0, 1, BodyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyFunction_Function(), this.getSpecialFunction(), null, "function", null, 0, -1, BodyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleFunctionEClass, SimpleFunction.class, "SimpleFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleFunction_Id(), ecorePackage.getEString(), "id", null, 0, 1, SimpleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleFunction_Values(), ecorePackage.getEString(), "values", null, 0, -1, SimpleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specialFunctionEClass, SpecialFunction.class, "SpecialFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecialFunction_Id(), ecorePackage.getEString(), "id", null, 0, 1, SpecialFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecialFunction_Func(), this.getSpecialFunction(), null, "func", null, 0, -1, SpecialFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyPromiseTypeEClass, BodyPromiseType.class, "BodyPromiseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBodyPromiseType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BodyPromiseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bundleComponentEClass, BundleComponent.class, "BundleComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBundleComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, BundleComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyComponentEClass, BodyComponent.class, "BodyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBodyComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, BodyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CfenginePackageImpl
