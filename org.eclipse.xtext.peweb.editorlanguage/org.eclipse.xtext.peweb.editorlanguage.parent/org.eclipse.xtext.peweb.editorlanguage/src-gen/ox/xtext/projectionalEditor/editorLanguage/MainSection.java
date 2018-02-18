/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.MainSection#getNodes <em>Nodes</em>}</li>
 *   <li>{@link ox.xtext.projectionalEditor.editorLanguage.MainSection#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getMainSection()
 * @model
 * @generated
 */
public interface MainSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link ox.xtext.projectionalEditor.editorLanguage.NodeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getMainSection_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<NodeDeclaration> getNodes();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link ox.xtext.projectionalEditor.editorLanguage.ComponentDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage#getMainSection_Components()
   * @model containment="true"
   * @generated
   */
  EList<ComponentDeclaration> getComponents();

} // MainSection
