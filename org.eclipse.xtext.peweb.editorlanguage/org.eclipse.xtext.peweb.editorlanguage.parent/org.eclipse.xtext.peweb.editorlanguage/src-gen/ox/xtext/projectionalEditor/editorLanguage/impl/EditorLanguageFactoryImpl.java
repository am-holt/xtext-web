/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.projectionalEditor.editorLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ox.xtext.projectionalEditor.editorLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorLanguageFactoryImpl extends EFactoryImpl implements EditorLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditorLanguageFactory init()
  {
    try
    {
      EditorLanguageFactory theEditorLanguageFactory = (EditorLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(EditorLanguagePackage.eNS_URI);
      if (theEditorLanguageFactory != null)
      {
        return theEditorLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EditorLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EditorLanguagePackage.EDITOR_DEFINITION_FILE: return createEditorDefinitionFile();
      case EditorLanguagePackage.IMPORT_SECTION: return createImportSection();
      case EditorLanguagePackage.IMPORT: return createImport();
      case EditorLanguagePackage.MAIN_SECTION: return createMainSection();
      case EditorLanguagePackage.NODE_DECLARATION: return createNodeDeclaration();
      case EditorLanguagePackage.PROJECTION_DECLARATION: return createProjectionDeclaration();
      case EditorLanguagePackage.ATTRIBUTE_DECLARATION: return createAttributeDeclaration();
      case EditorLanguagePackage.COMPONENT_ID: return createComponentId();
      case EditorLanguagePackage.ATTRIBUTE_CONTROLLER: return createAttributeController();
      case EditorLanguagePackage.CHILD_ID: return createChildId();
      case EditorLanguagePackage.TAG_ID: return createTagId();
      case EditorLanguagePackage.COMPONENT_DECLARATION: return createComponentDeclaration();
      case EditorLanguagePackage.COMPONENT_CONTROLLER: return createComponentController();
      case EditorLanguagePackage.HTML_SNIPPET: return createHtmlSnippet();
      case EditorLanguagePackage.HTML_ANNOTATION: return createHtmlAnnotation();
      case EditorLanguagePackage.CODE_LITERAL: return createCodeLiteral();
      case EditorLanguagePackage.CODE_LITERAL_START: return createCodeLiteralStart();
      case EditorLanguagePackage.CODE_LITERAL_MID: return createCodeLiteralMid();
      case EditorLanguagePackage.CODE_LITERAL_END: return createCodeLiteralEnd();
      case EditorLanguagePackage.JS_SNIPPET: return createJsSnippet();
      case EditorLanguagePackage.JS_EXTRA_TAG: return createJsExtraTag();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorDefinitionFile createEditorDefinitionFile()
  {
    EditorDefinitionFileImpl editorDefinitionFile = new EditorDefinitionFileImpl();
    return editorDefinitionFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportSection createImportSection()
  {
    ImportSectionImpl importSection = new ImportSectionImpl();
    return importSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainSection createMainSection()
  {
    MainSectionImpl mainSection = new MainSectionImpl();
    return mainSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDeclaration createNodeDeclaration()
  {
    NodeDeclarationImpl nodeDeclaration = new NodeDeclarationImpl();
    return nodeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectionDeclaration createProjectionDeclaration()
  {
    ProjectionDeclarationImpl projectionDeclaration = new ProjectionDeclarationImpl();
    return projectionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDeclaration createAttributeDeclaration()
  {
    AttributeDeclarationImpl attributeDeclaration = new AttributeDeclarationImpl();
    return attributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentId createComponentId()
  {
    ComponentIdImpl componentId = new ComponentIdImpl();
    return componentId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeController createAttributeController()
  {
    AttributeControllerImpl attributeController = new AttributeControllerImpl();
    return attributeController;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChildId createChildId()
  {
    ChildIdImpl childId = new ChildIdImpl();
    return childId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagId createTagId()
  {
    TagIdImpl tagId = new TagIdImpl();
    return tagId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration createComponentDeclaration()
  {
    ComponentDeclarationImpl componentDeclaration = new ComponentDeclarationImpl();
    return componentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentController createComponentController()
  {
    ComponentControllerImpl componentController = new ComponentControllerImpl();
    return componentController;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlSnippet createHtmlSnippet()
  {
    HtmlSnippetImpl htmlSnippet = new HtmlSnippetImpl();
    return htmlSnippet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlAnnotation createHtmlAnnotation()
  {
    HtmlAnnotationImpl htmlAnnotation = new HtmlAnnotationImpl();
    return htmlAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeLiteral createCodeLiteral()
  {
    CodeLiteralImpl codeLiteral = new CodeLiteralImpl();
    return codeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeLiteralStart createCodeLiteralStart()
  {
    CodeLiteralStartImpl codeLiteralStart = new CodeLiteralStartImpl();
    return codeLiteralStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeLiteralMid createCodeLiteralMid()
  {
    CodeLiteralMidImpl codeLiteralMid = new CodeLiteralMidImpl();
    return codeLiteralMid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeLiteralEnd createCodeLiteralEnd()
  {
    CodeLiteralEndImpl codeLiteralEnd = new CodeLiteralEndImpl();
    return codeLiteralEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsSnippet createJsSnippet()
  {
    JsSnippetImpl jsSnippet = new JsSnippetImpl();
    return jsSnippet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsExtraTag createJsExtraTag()
  {
    JsExtraTagImpl jsExtraTag = new JsExtraTagImpl();
    return jsExtraTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorLanguagePackage getEditorLanguagePackage()
  {
    return (EditorLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EditorLanguagePackage getPackage()
  {
    return EditorLanguagePackage.eINSTANCE;
  }

} //EditorLanguageFactoryImpl
