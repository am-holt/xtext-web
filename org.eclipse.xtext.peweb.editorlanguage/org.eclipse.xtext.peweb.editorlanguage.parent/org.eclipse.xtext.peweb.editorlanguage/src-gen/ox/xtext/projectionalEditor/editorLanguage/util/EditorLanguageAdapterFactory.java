/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ox.xtext.projectionalEditor.editorLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ox.xtext.projectionalEditor.editorLanguage.EditorLanguagePackage
 * @generated
 */
public class EditorLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditorLanguageSwitch<Adapter> modelSwitch =
    new EditorLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseEditorDefinitionFile(EditorDefinitionFile object)
      {
        return createEditorDefinitionFileAdapter();
      }
      @Override
      public Adapter caseImportSection(ImportSection object)
      {
        return createImportSectionAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseMainSection(MainSection object)
      {
        return createMainSectionAdapter();
      }
      @Override
      public Adapter caseNodeDeclaration(NodeDeclaration object)
      {
        return createNodeDeclarationAdapter();
      }
      @Override
      public Adapter caseProjectionDeclaration(ProjectionDeclaration object)
      {
        return createProjectionDeclarationAdapter();
      }
      @Override
      public Adapter caseAttributeDeclaration(AttributeDeclaration object)
      {
        return createAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseComponentId(ComponentId object)
      {
        return createComponentIdAdapter();
      }
      @Override
      public Adapter caseAttributeController(AttributeController object)
      {
        return createAttributeControllerAdapter();
      }
      @Override
      public Adapter caseChildId(ChildId object)
      {
        return createChildIdAdapter();
      }
      @Override
      public Adapter caseTagId(TagId object)
      {
        return createTagIdAdapter();
      }
      @Override
      public Adapter caseComponentDeclaration(ComponentDeclaration object)
      {
        return createComponentDeclarationAdapter();
      }
      @Override
      public Adapter caseComponentController(ComponentController object)
      {
        return createComponentControllerAdapter();
      }
      @Override
      public Adapter caseHtmlSnippet(HtmlSnippet object)
      {
        return createHtmlSnippetAdapter();
      }
      @Override
      public Adapter caseHtmlAnnotation(HtmlAnnotation object)
      {
        return createHtmlAnnotationAdapter();
      }
      @Override
      public Adapter caseCodeLiteral(CodeLiteral object)
      {
        return createCodeLiteralAdapter();
      }
      @Override
      public Adapter caseCodeLiteralStart(CodeLiteralStart object)
      {
        return createCodeLiteralStartAdapter();
      }
      @Override
      public Adapter caseCodeLiteralMid(CodeLiteralMid object)
      {
        return createCodeLiteralMidAdapter();
      }
      @Override
      public Adapter caseCodeLiteralEnd(CodeLiteralEnd object)
      {
        return createCodeLiteralEndAdapter();
      }
      @Override
      public Adapter caseJsSnippet(JsSnippet object)
      {
        return createJsSnippetAdapter();
      }
      @Override
      public Adapter caseJsExtraTag(JsExtraTag object)
      {
        return createJsExtraTagAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.EditorDefinitionFile <em>Editor Definition File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.EditorDefinitionFile
   * @generated
   */
  public Adapter createEditorDefinitionFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.ImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.ImportSection
   * @generated
   */
  public Adapter createImportSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.MainSection <em>Main Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.MainSection
   * @generated
   */
  public Adapter createMainSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.NodeDeclaration <em>Node Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.NodeDeclaration
   * @generated
   */
  public Adapter createNodeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.ProjectionDeclaration <em>Projection Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.ProjectionDeclaration
   * @generated
   */
  public Adapter createProjectionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.AttributeDeclaration
   * @generated
   */
  public Adapter createAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.ComponentId <em>Component Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.ComponentId
   * @generated
   */
  public Adapter createComponentIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.AttributeController <em>Attribute Controller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.AttributeController
   * @generated
   */
  public Adapter createAttributeControllerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.ChildId <em>Child Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.ChildId
   * @generated
   */
  public Adapter createChildIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.TagId <em>Tag Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.TagId
   * @generated
   */
  public Adapter createTagIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.ComponentDeclaration
   * @generated
   */
  public Adapter createComponentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.ComponentController <em>Component Controller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.ComponentController
   * @generated
   */
  public Adapter createComponentControllerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.HtmlSnippet <em>Html Snippet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.HtmlSnippet
   * @generated
   */
  public Adapter createHtmlSnippetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.HtmlAnnotation <em>Html Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.HtmlAnnotation
   * @generated
   */
  public Adapter createHtmlAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.CodeLiteral <em>Code Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.CodeLiteral
   * @generated
   */
  public Adapter createCodeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.CodeLiteralStart <em>Code Literal Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.CodeLiteralStart
   * @generated
   */
  public Adapter createCodeLiteralStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.CodeLiteralMid <em>Code Literal Mid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.CodeLiteralMid
   * @generated
   */
  public Adapter createCodeLiteralMidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.CodeLiteralEnd <em>Code Literal End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.CodeLiteralEnd
   * @generated
   */
  public Adapter createCodeLiteralEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.JsSnippet <em>Js Snippet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.JsSnippet
   * @generated
   */
  public Adapter createJsSnippetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ox.xtext.projectionalEditor.editorLanguage.JsExtraTag <em>Js Extra Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ox.xtext.projectionalEditor.editorLanguage.JsExtraTag
   * @generated
   */
  public Adapter createJsExtraTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EditorLanguageAdapterFactory
