/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package org.eclipse.xtext.peweb.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
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
import org.eclipse.xtext.peweb.editorLanguage.EditorLanguagePackage;
import org.eclipse.xtext.peweb.editorLanguage.HtmlSnippet;
import org.eclipse.xtext.peweb.editorLanguage.Import;
import org.eclipse.xtext.peweb.editorLanguage.ImportSection;
import org.eclipse.xtext.peweb.editorLanguage.JsSnippet;
import org.eclipse.xtext.peweb.editorLanguage.MainSection;
import org.eclipse.xtext.peweb.editorLanguage.NodeDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.ProjectionDeclaration;
import org.eclipse.xtext.peweb.editorLanguage.TagId;
import org.eclipse.xtext.peweb.services.EditorLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EditorLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EditorLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EditorLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EditorLanguagePackage.ATTRIBUTE_CONTROLLER:
				sequence_AttributeController(context, (AttributeController) semanticObject); 
				return; 
			case EditorLanguagePackage.ATTRIBUTE_DECLARATION:
				sequence_AttributeDeclaration(context, (AttributeDeclaration) semanticObject); 
				return; 
			case EditorLanguagePackage.CHILD_ID:
				sequence_ChildId(context, (ChildId) semanticObject); 
				return; 
			case EditorLanguagePackage.CODE_LITERAL:
				sequence_CodeLiteral(context, (CodeLiteral) semanticObject); 
				return; 
			case EditorLanguagePackage.CODE_LITERAL_END:
				sequence_CodeLiteralEnd(context, (CodeLiteralEnd) semanticObject); 
				return; 
			case EditorLanguagePackage.CODE_LITERAL_MID:
				sequence_CodeLiteralMid(context, (CodeLiteralMid) semanticObject); 
				return; 
			case EditorLanguagePackage.CODE_LITERAL_START:
				sequence_CodeLiteralStart(context, (CodeLiteralStart) semanticObject); 
				return; 
			case EditorLanguagePackage.COMPONENT_CONTROLLER:
				sequence_ComponentController(context, (ComponentController) semanticObject); 
				return; 
			case EditorLanguagePackage.COMPONENT_DECLARATION:
				sequence_ComponentDeclaration(context, (ComponentDeclaration) semanticObject); 
				return; 
			case EditorLanguagePackage.COMPONENT_ID:
				sequence_ComponentId(context, (ComponentId) semanticObject); 
				return; 
			case EditorLanguagePackage.EDITOR_DEFINITION_FILE:
				sequence_EditorDefinitionFile(context, (EditorDefinitionFile) semanticObject); 
				return; 
			case EditorLanguagePackage.HTML_SNIPPET:
				sequence_HtmlSnippet(context, (HtmlSnippet) semanticObject); 
				return; 
			case EditorLanguagePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case EditorLanguagePackage.IMPORT_SECTION:
				sequence_ImportSection(context, (ImportSection) semanticObject); 
				return; 
			case EditorLanguagePackage.JS_SNIPPET:
				sequence_JsSnippet(context, (JsSnippet) semanticObject); 
				return; 
			case EditorLanguagePackage.MAIN_SECTION:
				sequence_MainSection(context, (MainSection) semanticObject); 
				return; 
			case EditorLanguagePackage.NODE_DECLARATION:
				sequence_NodeDeclaration(context, (NodeDeclaration) semanticObject); 
				return; 
			case EditorLanguagePackage.PROJECTION_DECLARATION:
				sequence_ProjectionDeclaration(context, (ProjectionDeclaration) semanticObject); 
				return; 
			case EditorLanguagePackage.TAG_ID:
				sequence_TagId(context, (TagId) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeController returns AttributeController
	 *
	 * Constraint:
	 *     (getter=JsSnippet setter=JsSnippet validater=JsSnippet)
	 */
	protected void sequence_AttributeController(ISerializationContext context, AttributeController semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_CONTROLLER__GETTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_CONTROLLER__GETTER));
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_CONTROLLER__SETTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_CONTROLLER__SETTER));
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_CONTROLLER__VALIDATER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_CONTROLLER__VALIDATER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeControllerAccess().getGetterJsSnippetParserRuleCall_2_0(), semanticObject.getGetter());
		feeder.accept(grammarAccess.getAttributeControllerAccess().getSetterJsSnippetParserRuleCall_4_0(), semanticObject.getSetter());
		feeder.accept(grammarAccess.getAttributeControllerAccess().getValidaterJsSnippetParserRuleCall_6_0(), semanticObject.getValidater());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AttributeDeclaration returns AttributeDeclaration
	 *
	 * Constraint:
	 *     (attributeName=ID controller=AttributeController)
	 */
	protected void sequence_AttributeDeclaration(ISerializationContext context, AttributeDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_DECLARATION__ATTRIBUTE_NAME));
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_DECLARATION__CONTROLLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.ATTRIBUTE_DECLARATION__CONTROLLER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getAttributeNameIDTerminalRuleCall_1_0(), semanticObject.getAttributeName());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getControllerAttributeControllerParserRuleCall_2_0(), semanticObject.getController());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChildId returns ChildId
	 *     HtmlAnnotation returns ChildId
	 *
	 * Constraint:
	 *     (childId=ID projectionId=[ProjectionDeclaration|ID])
	 */
	protected void sequence_ChildId(ISerializationContext context, ChildId semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.CHILD_ID__CHILD_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.CHILD_ID__CHILD_ID));
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.CHILD_ID__PROJECTION_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.CHILD_ID__PROJECTION_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChildIdAccess().getChildIdIDTerminalRuleCall_1_0(), semanticObject.getChildId());
		feeder.accept(grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationIDTerminalRuleCall_3_0_1(), semanticObject.eGet(EditorLanguagePackage.Literals.CHILD_ID__PROJECTION_ID, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CodeLiteralEnd returns CodeLiteralEnd
	 *
	 * Constraint:
	 *     value=CODEEND
	 */
	protected void sequence_CodeLiteralEnd(ISerializationContext context, CodeLiteralEnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL_END__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL_END__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCodeLiteralEndAccess().getValueCODEENDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CodeLiteralMid returns CodeLiteralMid
	 *
	 * Constraint:
	 *     value=CODEMID
	 */
	protected void sequence_CodeLiteralMid(ISerializationContext context, CodeLiteralMid semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL_MID__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL_MID__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCodeLiteralMidAccess().getValueCODEMIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CodeLiteralStart returns CodeLiteralStart
	 *
	 * Constraint:
	 *     value=CODESTART
	 */
	protected void sequence_CodeLiteralStart(ISerializationContext context, CodeLiteralStart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL_START__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL_START__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCodeLiteralStartAccess().getValueCODESTARTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CodeLiteral returns CodeLiteral
	 *
	 * Constraint:
	 *     value=CODENOTAG
	 */
	protected void sequence_CodeLiteral(ISerializationContext context, CodeLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.CODE_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCodeLiteralAccess().getValueCODENOTAGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentController returns ComponentController
	 *
	 * Constraint:
	 *     (getter=JsSnippet setter=JsSnippet validater=JsSnippet)
	 */
	protected void sequence_ComponentController(ISerializationContext context, ComponentController semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.COMPONENT_CONTROLLER__GETTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.COMPONENT_CONTROLLER__GETTER));
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.COMPONENT_CONTROLLER__SETTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.COMPONENT_CONTROLLER__SETTER));
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.COMPONENT_CONTROLLER__VALIDATER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.COMPONENT_CONTROLLER__VALIDATER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentControllerAccess().getGetterJsSnippetParserRuleCall_1_0(), semanticObject.getGetter());
		feeder.accept(grammarAccess.getComponentControllerAccess().getSetterJsSnippetParserRuleCall_3_0(), semanticObject.getSetter());
		feeder.accept(grammarAccess.getComponentControllerAccess().getValidaterJsSnippetParserRuleCall_5_0(), semanticObject.getValidater());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDeclaration returns ComponentDeclaration
	 *
	 * Constraint:
	 *     (name=ID view=HtmlSnippet control=ComponentController?)
	 */
	protected void sequence_ComponentDeclaration(ISerializationContext context, ComponentDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentId returns ComponentId
	 *     HtmlAnnotation returns ComponentId
	 *
	 * Constraint:
	 *     (componentType=[ComponentDeclaration|ID] componentId=ID?)
	 */
	protected void sequence_ComponentId(ISerializationContext context, ComponentId semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EditorDefinitionFile returns EditorDefinitionFile
	 *
	 * Constraint:
	 *     (imports=ImportSection? mainSection=MainSection)
	 */
	protected void sequence_EditorDefinitionFile(ISerializationContext context, EditorDefinitionFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HtmlSnippet returns HtmlSnippet
	 *
	 * Constraint:
	 *     (html+=CodeLiteral | (html+=CodeLiteralStart html+=HtmlAnnotation (html+=CodeLiteralMid html+=HtmlAnnotation)* html+=CodeLiteralEnd))
	 */
	protected void sequence_HtmlSnippet(ISerializationContext context, HtmlSnippet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportSection returns ImportSection
	 *
	 * Constraint:
	 *     imports+=Import+
	 */
	protected void sequence_ImportSection(ISerializationContext context, ImportSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.IMPORT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsSnippet returns JsSnippet
	 *
	 * Constraint:
	 *     (js+=CodeLiteral | (js+=CodeLiteralStart js+=JsExtraTag (js+=CodeLiteralMid js+=JsExtraTag)* js+=CodeLiteralEnd))
	 */
	protected void sequence_JsSnippet(ISerializationContext context, JsSnippet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainSection returns MainSection
	 *
	 * Constraint:
	 *     (nodes+=NodeDeclaration | components+=ComponentDeclaration)*
	 */
	protected void sequence_MainSection(ISerializationContext context, MainSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeDeclaration returns NodeDeclaration
	 *
	 * Constraint:
	 *     (nodeName=ID (projections+=ProjectionDeclaration | components+=ComponentDeclaration)*)
	 */
	protected void sequence_NodeDeclaration(ISerializationContext context, NodeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProjectionDeclaration returns ProjectionDeclaration
	 *
	 * Constraint:
	 *     (name=ID view=HtmlSnippet (attributes+=AttributeDeclaration | components+=ComponentDeclaration)*)
	 */
	protected void sequence_ProjectionDeclaration(ISerializationContext context, ProjectionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TagId returns TagId
	 *     HtmlAnnotation returns TagId
	 *     JsExtraTag returns TagId
	 *
	 * Constraint:
	 *     tagName=ID
	 */
	protected void sequence_TagId(ISerializationContext context, TagId semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EditorLanguagePackage.Literals.TAG_ID__TAG_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorLanguagePackage.Literals.TAG_ID__TAG_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTagIdAccess().getTagNameIDTerminalRuleCall_1_0(), semanticObject.getTagName());
		feeder.finish();
	}
	
	
}
