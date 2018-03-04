/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package org.eclipse.xtext.peweb.editorLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.peweb.editorLanguage.AttributeController;
import org.eclipse.xtext.peweb.editorLanguage.AttributeDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.ChildId;
import org.eclipse.xtext.peweb.editorLanguage.CodeLiteral;
import org.eclipse.xtext.peweb.editorLanguage.CodeLiteralEnd;
import org.eclipse.xtext.peweb.editorLanguage.CodeLiteralMid;
import org.eclipse.xtext.peweb.editorLanguage.CodeLiteralStart;
import org.eclipse.xtext.peweb.editorLanguage.ComponentController;
import org.eclipse.xtext.peweb.editorLanguage.ComponentDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.ComponentId;
import org.eclipse.xtext.peweb.editorLanguage.EditorDefinitionFile;
import org.eclipse.xtext.peweb.editorLanguage.EditorLanguageFactory;
import org.eclipse.xtext.peweb.editorLanguage.EditorLanguagePackage;
import org.eclipse.xtext.peweb.editorLanguage.HtmlAnnotation;
import org.eclipse.xtext.peweb.editorLanguage.HtmlSnippet;
import org.eclipse.xtext.peweb.editorLanguage.Import;
import org.eclipse.xtext.peweb.editorLanguage.ImportSection;
import org.eclipse.xtext.peweb.editorLanguage.JsExtraTag;
import org.eclipse.xtext.peweb.editorLanguage.JsSnippet;
import org.eclipse.xtext.peweb.editorLanguage.MainSection;
import org.eclipse.xtext.peweb.editorLanguage.NodeDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.ProjectionDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.TagId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorLanguagePackageImpl extends EPackageImpl implements EditorLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editorDefinitionFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeControllerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass childIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentControllerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass htmlSnippetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass htmlAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeLiteralStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeLiteralMidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeLiteralEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsSnippetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsExtraTagEClass = null;

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
   * @see org.eclipse.xtext.peweb.editorLanguage.EditorLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EditorLanguagePackageImpl()
  {
    super(eNS_URI, EditorLanguageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EditorLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EditorLanguagePackage init()
  {
    if (isInited) return (EditorLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(EditorLanguagePackage.eNS_URI);

    // Obtain or create and register package
    EditorLanguagePackageImpl theEditorLanguagePackage = (EditorLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditorLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditorLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEditorLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theEditorLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEditorLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EditorLanguagePackage.eNS_URI, theEditorLanguagePackage);
    return theEditorLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditorDefinitionFile()
  {
    return editorDefinitionFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditorDefinitionFile_Imports()
  {
    return (EReference)editorDefinitionFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditorDefinitionFile_MainSection()
  {
    return (EReference)editorDefinitionFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportSection()
  {
    return importSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportSection_Imports()
  {
    return (EReference)importSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Name()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainSection()
  {
    return mainSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainSection_Nodes()
  {
    return (EReference)mainSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainSection_Components()
  {
    return (EReference)mainSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeDeclaration()
  {
    return nodeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDeclaration_NodeName()
  {
    return (EAttribute)nodeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeDeclaration_Projections()
  {
    return (EReference)nodeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeDeclaration_Components()
  {
    return (EReference)nodeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectionDeclaration()
  {
    return projectionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectionDeclaration_Name()
  {
    return (EAttribute)projectionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectionDeclaration_View()
  {
    return (EReference)projectionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectionDeclaration_Attributes()
  {
    return (EReference)projectionDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectionDeclaration_Components()
  {
    return (EReference)projectionDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeDeclaration()
  {
    return attributeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeDeclaration_AttributeName()
  {
    return (EAttribute)attributeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeDeclaration_Controller()
  {
    return (EReference)attributeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentId()
  {
    return componentIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentId_ComponentType()
  {
    return (EReference)componentIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentId_ComponentId()
  {
    return (EAttribute)componentIdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeController()
  {
    return attributeControllerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeController_Getter()
  {
    return (EReference)attributeControllerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeController_Setter()
  {
    return (EReference)attributeControllerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeController_Validater()
  {
    return (EReference)attributeControllerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChildId()
  {
    return childIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChildId_ChildId()
  {
    return (EAttribute)childIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChildId_ProjectionId()
  {
    return (EReference)childIdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagId()
  {
    return tagIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTagId_TagName()
  {
    return (EAttribute)tagIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDeclaration()
  {
    return componentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDeclaration_Name()
  {
    return (EAttribute)componentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_View()
  {
    return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_Control()
  {
    return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentController()
  {
    return componentControllerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentController_Getter()
  {
    return (EReference)componentControllerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentController_Setter()
  {
    return (EReference)componentControllerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentController_Validater()
  {
    return (EReference)componentControllerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHtmlSnippet()
  {
    return htmlSnippetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHtmlSnippet_Html()
  {
    return (EReference)htmlSnippetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHtmlAnnotation()
  {
    return htmlAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeLiteral()
  {
    return codeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeLiteral_Value()
  {
    return (EAttribute)codeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeLiteralStart()
  {
    return codeLiteralStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeLiteralStart_Value()
  {
    return (EAttribute)codeLiteralStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeLiteralMid()
  {
    return codeLiteralMidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeLiteralMid_Value()
  {
    return (EAttribute)codeLiteralMidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeLiteralEnd()
  {
    return codeLiteralEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeLiteralEnd_Value()
  {
    return (EAttribute)codeLiteralEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsSnippet()
  {
    return jsSnippetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsSnippet_Js()
  {
    return (EReference)jsSnippetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsExtraTag()
  {
    return jsExtraTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorLanguageFactory getEditorLanguageFactory()
  {
    return (EditorLanguageFactory)getEFactoryInstance();
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
    editorDefinitionFileEClass = createEClass(EDITOR_DEFINITION_FILE);
    createEReference(editorDefinitionFileEClass, EDITOR_DEFINITION_FILE__IMPORTS);
    createEReference(editorDefinitionFileEClass, EDITOR_DEFINITION_FILE__MAIN_SECTION);

    importSectionEClass = createEClass(IMPORT_SECTION);
    createEReference(importSectionEClass, IMPORT_SECTION__IMPORTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__NAME);

    mainSectionEClass = createEClass(MAIN_SECTION);
    createEReference(mainSectionEClass, MAIN_SECTION__NODES);
    createEReference(mainSectionEClass, MAIN_SECTION__COMPONENTS);

    nodeDeclarationEClass = createEClass(NODE_DECLARATION);
    createEAttribute(nodeDeclarationEClass, NODE_DECLARATION__NODE_NAME);
    createEReference(nodeDeclarationEClass, NODE_DECLARATION__PROJECTIONS);
    createEReference(nodeDeclarationEClass, NODE_DECLARATION__COMPONENTS);

    projectionDeclarationEClass = createEClass(PROJECTION_DECLARATION);
    createEAttribute(projectionDeclarationEClass, PROJECTION_DECLARATION__NAME);
    createEReference(projectionDeclarationEClass, PROJECTION_DECLARATION__VIEW);
    createEReference(projectionDeclarationEClass, PROJECTION_DECLARATION__ATTRIBUTES);
    createEReference(projectionDeclarationEClass, PROJECTION_DECLARATION__COMPONENTS);

    attributeDeclarationEClass = createEClass(ATTRIBUTE_DECLARATION);
    createEAttribute(attributeDeclarationEClass, ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME);
    createEReference(attributeDeclarationEClass, ATTRIBUTE_DECLARATION__CONTROLLER);

    componentIdEClass = createEClass(COMPONENT_ID);
    createEReference(componentIdEClass, COMPONENT_ID__COMPONENT_TYPE);
    createEAttribute(componentIdEClass, COMPONENT_ID__COMPONENT_ID);

    attributeControllerEClass = createEClass(ATTRIBUTE_CONTROLLER);
    createEReference(attributeControllerEClass, ATTRIBUTE_CONTROLLER__GETTER);
    createEReference(attributeControllerEClass, ATTRIBUTE_CONTROLLER__SETTER);
    createEReference(attributeControllerEClass, ATTRIBUTE_CONTROLLER__VALIDATER);

    childIdEClass = createEClass(CHILD_ID);
    createEAttribute(childIdEClass, CHILD_ID__CHILD_ID);
    createEReference(childIdEClass, CHILD_ID__PROJECTION_ID);

    tagIdEClass = createEClass(TAG_ID);
    createEAttribute(tagIdEClass, TAG_ID__TAG_NAME);

    componentDeclarationEClass = createEClass(COMPONENT_DECLARATION);
    createEAttribute(componentDeclarationEClass, COMPONENT_DECLARATION__NAME);
    createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__VIEW);
    createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__CONTROL);

    componentControllerEClass = createEClass(COMPONENT_CONTROLLER);
    createEReference(componentControllerEClass, COMPONENT_CONTROLLER__GETTER);
    createEReference(componentControllerEClass, COMPONENT_CONTROLLER__SETTER);
    createEReference(componentControllerEClass, COMPONENT_CONTROLLER__VALIDATER);

    htmlSnippetEClass = createEClass(HTML_SNIPPET);
    createEReference(htmlSnippetEClass, HTML_SNIPPET__HTML);

    htmlAnnotationEClass = createEClass(HTML_ANNOTATION);

    codeLiteralEClass = createEClass(CODE_LITERAL);
    createEAttribute(codeLiteralEClass, CODE_LITERAL__VALUE);

    codeLiteralStartEClass = createEClass(CODE_LITERAL_START);
    createEAttribute(codeLiteralStartEClass, CODE_LITERAL_START__VALUE);

    codeLiteralMidEClass = createEClass(CODE_LITERAL_MID);
    createEAttribute(codeLiteralMidEClass, CODE_LITERAL_MID__VALUE);

    codeLiteralEndEClass = createEClass(CODE_LITERAL_END);
    createEAttribute(codeLiteralEndEClass, CODE_LITERAL_END__VALUE);

    jsSnippetEClass = createEClass(JS_SNIPPET);
    createEReference(jsSnippetEClass, JS_SNIPPET__JS);

    jsExtraTagEClass = createEClass(JS_EXTRA_TAG);
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
    componentIdEClass.getESuperTypes().add(this.getHtmlAnnotation());
    childIdEClass.getESuperTypes().add(this.getHtmlAnnotation());
    tagIdEClass.getESuperTypes().add(this.getHtmlAnnotation());
    tagIdEClass.getESuperTypes().add(this.getJsExtraTag());

    // Initialize classes and features; add operations and parameters
    initEClass(editorDefinitionFileEClass, EditorDefinitionFile.class, "EditorDefinitionFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEditorDefinitionFile_Imports(), this.getImportSection(), null, "imports", null, 0, 1, EditorDefinitionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditorDefinitionFile_MainSection(), this.getMainSection(), null, "mainSection", null, 0, 1, EditorDefinitionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importSectionEClass, ImportSection.class, "ImportSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportSection_Imports(), this.getImport(), null, "imports", null, 0, -1, ImportSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainSectionEClass, MainSection.class, "MainSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMainSection_Nodes(), this.getNodeDeclaration(), null, "nodes", null, 0, -1, MainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainSection_Components(), this.getComponentDeclaration(), null, "components", null, 0, -1, MainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeDeclarationEClass, NodeDeclaration.class, "NodeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeDeclaration_NodeName(), ecorePackage.getEString(), "nodeName", null, 0, 1, NodeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeDeclaration_Projections(), this.getProjectionDeclaration(), null, "projections", null, 0, -1, NodeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeDeclaration_Components(), this.getComponentDeclaration(), null, "components", null, 0, -1, NodeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectionDeclarationEClass, ProjectionDeclaration.class, "ProjectionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjectionDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectionDeclaration_View(), this.getHtmlSnippet(), null, "view", null, 0, 1, ProjectionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectionDeclaration_Attributes(), this.getAttributeDeclaration(), null, "attributes", null, 0, -1, ProjectionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectionDeclaration_Components(), this.getComponentDeclaration(), null, "components", null, 0, -1, ProjectionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeDeclarationEClass, AttributeDeclaration.class, "AttributeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeDeclaration_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, AttributeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeDeclaration_Controller(), this.getAttributeController(), null, "controller", null, 0, 1, AttributeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentIdEClass, ComponentId.class, "ComponentId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentId_ComponentType(), this.getComponentDeclaration(), null, "componentType", null, 0, 1, ComponentId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentId_ComponentId(), ecorePackage.getEString(), "componentId", null, 0, 1, ComponentId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeControllerEClass, AttributeController.class, "AttributeController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeController_Getter(), this.getJsSnippet(), null, "getter", null, 0, 1, AttributeController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeController_Setter(), this.getJsSnippet(), null, "setter", null, 0, 1, AttributeController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeController_Validater(), this.getJsSnippet(), null, "validater", null, 0, 1, AttributeController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(childIdEClass, ChildId.class, "ChildId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChildId_ChildId(), ecorePackage.getEString(), "childId", null, 0, 1, ChildId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChildId_ProjectionId(), this.getProjectionDeclaration(), null, "projectionId", null, 0, 1, ChildId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagIdEClass, TagId.class, "TagId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTagId_TagName(), ecorePackage.getEString(), "tagName", null, 0, 1, TagId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentDeclarationEClass, ComponentDeclaration.class, "ComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDeclaration_View(), this.getHtmlSnippet(), null, "view", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDeclaration_Control(), this.getComponentController(), null, "control", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentControllerEClass, ComponentController.class, "ComponentController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentController_Getter(), this.getJsSnippet(), null, "getter", null, 0, 1, ComponentController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentController_Setter(), this.getJsSnippet(), null, "setter", null, 0, 1, ComponentController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentController_Validater(), this.getJsSnippet(), null, "validater", null, 0, 1, ComponentController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(htmlSnippetEClass, HtmlSnippet.class, "HtmlSnippet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHtmlSnippet_Html(), ecorePackage.getEObject(), null, "html", null, 0, -1, HtmlSnippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(htmlAnnotationEClass, HtmlAnnotation.class, "HtmlAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(codeLiteralEClass, CodeLiteral.class, "CodeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, CodeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeLiteralStartEClass, CodeLiteralStart.class, "CodeLiteralStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeLiteralStart_Value(), ecorePackage.getEString(), "value", null, 0, 1, CodeLiteralStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeLiteralMidEClass, CodeLiteralMid.class, "CodeLiteralMid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeLiteralMid_Value(), ecorePackage.getEString(), "value", null, 0, 1, CodeLiteralMid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeLiteralEndEClass, CodeLiteralEnd.class, "CodeLiteralEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeLiteralEnd_Value(), ecorePackage.getEString(), "value", null, 0, 1, CodeLiteralEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsSnippetEClass, JsSnippet.class, "JsSnippet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsSnippet_Js(), ecorePackage.getEObject(), null, "js", null, 0, -1, JsSnippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsExtraTagEClass, JsExtraTag.class, "JsExtraTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EditorLanguagePackageImpl
