/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package org.eclipse.xtext.peweb.editorLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.peweb.editorLanguage.ComponentController;
import org.eclipse.xtext.peweb.editorLanguage.EditorLanguagePackage;
import org.eclipse.xtext.peweb.editorLanguage.JsSnippet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.peweb.editorLanguage.impl.ComponentControllerImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.eclipse.xtext.peweb.editorLanguage.impl.ComponentControllerImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.eclipse.xtext.peweb.editorLanguage.impl.ComponentControllerImpl#getValidator <em>Validator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentControllerImpl extends MinimalEObjectImpl.Container implements ComponentController
{
  /**
   * The cached value of the '{@link #getGetter() <em>Getter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetter()
   * @generated
   * @ordered
   */
  protected JsSnippet getter;

  /**
   * The cached value of the '{@link #getSetter() <em>Setter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetter()
   * @generated
   * @ordered
   */
  protected JsSnippet setter;

  /**
   * The cached value of the '{@link #getValidator() <em>Validator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidator()
   * @generated
   * @ordered
   */
  protected JsSnippet validator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentControllerImpl()
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
    return EditorLanguagePackage.Literals.COMPONENT_CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsSnippet getGetter()
  {
    return getter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetter(JsSnippet newGetter, NotificationChain msgs)
  {
    JsSnippet oldGetter = getter;
    getter = newGetter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER, oldGetter, newGetter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetter(JsSnippet newGetter)
  {
    if (newGetter != getter)
    {
      NotificationChain msgs = null;
      if (getter != null)
        msgs = ((InternalEObject)getter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER, null, msgs);
      if (newGetter != null)
        msgs = ((InternalEObject)newGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER, null, msgs);
      msgs = basicSetGetter(newGetter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER, newGetter, newGetter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsSnippet getSetter()
  {
    return setter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetter(JsSnippet newSetter, NotificationChain msgs)
  {
    JsSnippet oldSetter = setter;
    setter = newSetter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER, oldSetter, newSetter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetter(JsSnippet newSetter)
  {
    if (newSetter != setter)
    {
      NotificationChain msgs = null;
      if (setter != null)
        msgs = ((InternalEObject)setter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER, null, msgs);
      if (newSetter != null)
        msgs = ((InternalEObject)newSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER, null, msgs);
      msgs = basicSetSetter(newSetter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER, newSetter, newSetter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsSnippet getValidator()
  {
    return validator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidator(JsSnippet newValidator, NotificationChain msgs)
  {
    JsSnippet oldValidator = validator;
    validator = newValidator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR, oldValidator, newValidator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidator(JsSnippet newValidator)
  {
    if (newValidator != validator)
    {
      NotificationChain msgs = null;
      if (validator != null)
        msgs = ((InternalEObject)validator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR, null, msgs);
      if (newValidator != null)
        msgs = ((InternalEObject)newValidator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR, null, msgs);
      msgs = basicSetValidator(newValidator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR, newValidator, newValidator));
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
      case EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER:
        return basicSetGetter(null, msgs);
      case EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER:
        return basicSetSetter(null, msgs);
      case EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR:
        return basicSetValidator(null, msgs);
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
      case EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER:
        return getGetter();
      case EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER:
        return getSetter();
      case EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR:
        return getValidator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER:
        setGetter((JsSnippet)newValue);
        return;
      case EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER:
        setSetter((JsSnippet)newValue);
        return;
      case EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR:
        setValidator((JsSnippet)newValue);
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
      case EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER:
        setGetter((JsSnippet)null);
        return;
      case EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER:
        setSetter((JsSnippet)null);
        return;
      case EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR:
        setValidator((JsSnippet)null);
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
      case EditorLanguagePackage.COMPONENT_CONTROLLER__GETTER:
        return getter != null;
      case EditorLanguagePackage.COMPONENT_CONTROLLER__SETTER:
        return setter != null;
      case EditorLanguagePackage.COMPONENT_CONTROLLER__VALIDATOR:
        return validator != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentControllerImpl
