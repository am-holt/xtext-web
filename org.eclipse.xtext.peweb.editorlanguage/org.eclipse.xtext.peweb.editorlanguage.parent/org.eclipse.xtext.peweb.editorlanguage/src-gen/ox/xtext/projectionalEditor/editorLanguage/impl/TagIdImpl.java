/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage;
import ox.xtext.projectionalEditor.editorLanguage.TagId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.impl.TagIdImpl#getTagName <em>Tag Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagIdImpl extends HtmlAnnotationImpl implements TagId
{
  /**
   * The default value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTagName()
   * @generated
   * @ordered
   */
  protected static final String TAG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTagName()
   * @generated
   * @ordered
   */
  protected String tagName = TAG_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TagIdImpl()
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
    return EditorLanguagePackage.Literals.TAG_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTagName()
  {
    return tagName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTagName(String newTagName)
  {
    String oldTagName = tagName;
    tagName = newTagName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorLanguagePackage.TAG_ID__TAG_NAME, oldTagName, tagName));
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
      case EditorLanguagePackage.TAG_ID__TAG_NAME:
        return getTagName();
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
      case EditorLanguagePackage.TAG_ID__TAG_NAME:
        setTagName((String)newValue);
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
      case EditorLanguagePackage.TAG_ID__TAG_NAME:
        setTagName(TAG_NAME_EDEFAULT);
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
      case EditorLanguagePackage.TAG_ID__TAG_NAME:
        return TAG_NAME_EDEFAULT == null ? tagName != null : !TAG_NAME_EDEFAULT.equals(tagName);
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
    result.append(" (tagName: ");
    result.append(tagName);
    result.append(')');
    return result.toString();
  }

} //TagIdImpl
