/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Literal Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.CodeLiteralStart#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getCodeLiteralStart()
 * @model
 * @generated
 */
public interface CodeLiteralStart extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getCodeLiteralStart_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ox.xtext.projectionalEditor.editorLanguage.CodeLiteralStart#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // CodeLiteralStart
