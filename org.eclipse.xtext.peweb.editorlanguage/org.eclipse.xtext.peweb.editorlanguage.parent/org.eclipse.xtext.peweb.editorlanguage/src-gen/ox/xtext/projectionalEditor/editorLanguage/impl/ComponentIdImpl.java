/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ox.xtext.projectionalEditor.editorLanguage.ComponentDeclaration;
import ox.xtext.projectionalEditor.editorLanguage.ComponentId;
import ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.impl.ComponentIdImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.impl.ComponentIdImpl#getComponentId <em>Component Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentIdImpl extends HtmlAnnotationImpl implements ComponentId
{
  /**
   * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentType()
   * @generated
   * @ordered
   */
  protected ComponentDeclaration componentType;

  /**
   * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentId()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentId()
   * @generated
   * @ordered
   */
  protected String componentId = COMPONENT_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentIdImpl()
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
    return EditorLanguagePackage.Literals.COMPONENT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration getComponentType()
  {
    if (componentType != null && componentType.eIsProxy())
    {
      InternalEObject oldComponentType = (InternalEObject)componentType;
      componentType = (ComponentDeclaration)eResolveProxy(oldComponentType);
      if (componentType != oldComponentType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditorLanguagePackage.COMPONENT_ID__COMPONENT_TYPE, oldComponentType, componentType));
      }
    }
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration basicGetComponentType()
  {
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentType(ComponentDeclaration newComponentType)
  {
    ComponentDeclaration oldComponentType = componentType;
    componentType = newComponentType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_ID__COMPONENT_TYPE, oldComponentType, componentType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponentId()
  {
    return componentId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentId(String newComponentId)
  {
    String oldComponentId = componentId;
    componentId = newComponentId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.COMPONENT_ID__COMPONENT_ID, oldComponentId, componentId));
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
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_TYPE:
        if (resolve) return getComponentType();
        return basicGetComponentType();
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_ID:
        return getComponentId();
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
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_TYPE:
        setComponentType((ComponentDeclaration)newValue);
        return;
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_ID:
        setComponentId((String)newValue);
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
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_TYPE:
        setComponentType((ComponentDeclaration)null);
        return;
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_ID:
        setComponentId(COMPONENT_ID_EDEFAULT);
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
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_TYPE:
        return componentType != null;
      case EditorLanguagePackage.COMPONENT_ID__COMPONENT_ID:
        return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
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
    result.append(" (componentId: ");
    result.append(componentId);
    result.append(')');
    return result.toString();
  }

} //ComponentIdImpl
