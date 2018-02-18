/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.TagId#getTagName <em>Tag Name</em>}</li>
 * </ul>
 *
 * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getTagId()
 * @model
 * @generated
 */
public interface TagId extends HtmlAnnotation, JsExtraTag
{
  /**
   * Returns the value of the '<em><b>Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag Name</em>' attribute.
   * @see #setTagName(String)
   * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getTagId_TagName()
   * @model
   * @generated
   */
  String getTagName();

  /**
   * Sets the value of the '{@link ox.xtext.projectionalEditor.editorLanguage.TagId#getTagName <em>Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag Name</em>' attribute.
   * @see #getTagName()
   * @generated
   */
  void setTagName(String value);

} // TagId
