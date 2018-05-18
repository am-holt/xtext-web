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

import org.eclipse.xtext.peweb.editorLanguage.AttributeController;
import org.eclipse.xtext.peweb.editorLanguage.AttributeDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.EditorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.peweb.editorLanguage.impl.AttributeDeclarationImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.peweb.editorLanguage.impl.AttributeDeclarationImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDeclarationImpl extends MinimalEObjectImpl.Container implements AttributeDeclaration
{
  /**
   * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected AttributeController controller;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeDeclarationImpl()
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
    return EditorLanguagePackage.Literals.ATTRIBUTE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeName()
  {
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeName(String newAttributeName)
  {
    String oldAttributeName = attributeName;
    attributeName = newAttributeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME, oldAttributeName, attributeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeController getController()
  {
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetController(AttributeController newController, NotificationChain msgs)
  {
    AttributeController oldController = controller;
    controller = newController;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER, oldController, newController);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setController(AttributeController newController)
  {
    if (newController != controller)
    {
      NotificationChain msgs = null;
      if (controller != null)
        msgs = ((InternalEObject)controller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER, null, msgs);
      if (newController != null)
        msgs = ((InternalEObject)newController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER, null, msgs);
      msgs = basicSetController(newController, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER, newController, newController));
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
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER:
        return basicSetController(null, msgs);
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
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME:
        return getAttributeName();
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER:
        return getController();
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
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME:
        setAttributeName((String)newValue);
        return;
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER:
        setController((AttributeController)newValue);
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
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME:
        setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
        return;
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER:
        setController((AttributeController)null);
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
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME:
        return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION__CONTROLLER:
        return controller != null;
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
    result.append(" (attributeName: ");
    result.append(attributeName);
    result.append(')');
    return result.toString();
  }

} //AttributeDeclarationImpl