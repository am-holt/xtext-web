/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
grammar InternalEditorLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.peweb.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.peweb.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.peweb.services.EditorLanguageGrammarAccess;

}

@parser::members {

 	private EditorLanguageGrammarAccess grammarAccess;

    public InternalEditorLanguageParser(TokenStream input, EditorLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EditorDefinitionFile";
   	}

   	@Override
   	protected EditorLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEditorDefinitionFile
entryRuleEditorDefinitionFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEditorDefinitionFileRule()); }
	iv_ruleEditorDefinitionFile=ruleEditorDefinitionFile
	{ $current=$iv_ruleEditorDefinitionFile.current; }
	EOF;

// Rule EditorDefinitionFile
ruleEditorDefinitionFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEditorDefinitionFileAccess().getImportsImportSectionParserRuleCall_0_0());
				}
				lv_imports_0_0=ruleImportSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEditorDefinitionFileRule());
					}
					set(
						$current,
						"imports",
						lv_imports_0_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ImportSection");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEditorDefinitionFileAccess().getMainSectionMainSectionParserRuleCall_1_0());
				}
				lv_mainSection_1_0=ruleMainSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEditorDefinitionFileRule());
					}
					set(
						$current,
						"mainSection",
						lv_mainSection_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.MainSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImportSection
entryRuleImportSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportSectionRule()); }
	iv_ruleImportSection=ruleImportSection
	{ $current=$iv_ruleImportSection.current; }
	EOF;

// Rule ImportSection
ruleImportSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getImportSectionAccess().getImportSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getImportSectionAccess().getImportsImportParserRuleCall_1_0());
				}
				lv_imports_1_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportSectionRule());
					}
					add(
						$current,
						"imports",
						lv_imports_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleMainSection
entryRuleMainSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainSectionRule()); }
	iv_ruleMainSection=ruleMainSection
	{ $current=$iv_ruleMainSection.current; }
	EOF;

// Rule MainSection
ruleMainSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMainSectionAccess().getMainSectionAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMainSectionAccess().getNodesNodeDeclarationParserRuleCall_1_0_0());
					}
					lv_nodes_1_0=ruleNodeDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMainSectionRule());
						}
						add(
							$current,
							"nodes",
							lv_nodes_1_0,
							"org.eclipse.xtext.peweb.EditorLanguage.NodeDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getMainSectionAccess().getComponentsComponentDeclarationParserRuleCall_1_1_0());
					}
					lv_components_2_0=ruleComponentDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMainSectionRule());
						}
						add(
							$current,
							"components",
							lv_components_2_0,
							"org.eclipse.xtext.peweb.EditorLanguage.ComponentDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNodeDeclaration
entryRuleNodeDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeDeclarationRule()); }
	iv_ruleNodeDeclaration=ruleNodeDeclaration
	{ $current=$iv_ruleNodeDeclaration.current; }
	EOF;

// Rule NodeDeclaration
ruleNodeDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Node'
		{
			newLeafNode(otherlv_0, grammarAccess.getNodeDeclarationAccess().getNodeKeyword_0());
		}
		(
			(
				lv_nodeName_1_0=RULE_ID
				{
					newLeafNode(lv_nodeName_1_0, grammarAccess.getNodeDeclarationAccess().getNodeNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"nodeName",
						lv_nodeName_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNodeDeclarationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getNodeDeclarationAccess().getProjectionsProjectionDeclarationParserRuleCall_3_0_0());
					}
					lv_projections_3_0=ruleProjectionDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
						}
						add(
							$current,
							"projections",
							lv_projections_3_0,
							"org.eclipse.xtext.peweb.EditorLanguage.ProjectionDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNodeDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_3_1_0());
					}
					lv_components_4_0=ruleComponentDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
						}
						add(
							$current,
							"components",
							lv_components_4_0,
							"org.eclipse.xtext.peweb.EditorLanguage.ComponentDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getNodeDeclarationAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleProjectionDeclaration
entryRuleProjectionDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectionDeclarationRule()); }
	iv_ruleProjectionDeclaration=ruleProjectionDeclaration
	{ $current=$iv_ruleProjectionDeclaration.current; }
	EOF;

// Rule ProjectionDeclaration
ruleProjectionDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Projection'
		{
			newLeafNode(otherlv_0, grammarAccess.getProjectionDeclarationAccess().getProjectionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProjectionDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectionDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProjectionDeclarationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='view:'
		{
			newLeafNode(otherlv_3, grammarAccess.getProjectionDeclarationAccess().getViewKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0());
				}
				lv_view_4_0=ruleHtmlSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
					}
					set(
						$current,
						"view",
						lv_view_4_0,
						"org.eclipse.xtext.peweb.EditorLanguage.HtmlSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getAttributesAttributeDeclarationParserRuleCall_5_0_0());
					}
					lv_attributes_5_0=ruleAttributeDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_5_0,
							"org.eclipse.xtext.peweb.EditorLanguage.AttributeDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_5_1_0());
					}
					lv_components_6_0=ruleComponentDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
						}
						add(
							$current,
							"components",
							lv_components_6_0,
							"org.eclipse.xtext.peweb.EditorLanguage.ComponentDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getProjectionDeclarationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAttributeDeclaration
entryRuleAttributeDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeDeclarationRule()); }
	iv_ruleAttributeDeclaration=ruleAttributeDeclaration
	{ $current=$iv_ruleAttributeDeclaration.current; }
	EOF;

// Rule AttributeDeclaration
ruleAttributeDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeDeclarationAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_attributeName_1_0=RULE_ID
				{
					newLeafNode(lv_attributeName_1_0, grammarAccess.getAttributeDeclarationAccess().getAttributeNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"attributeName",
						lv_attributeName_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getControllerAttributeControllerParserRuleCall_2_0());
				}
				lv_controller_2_0=ruleAttributeController
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
					}
					set(
						$current,
						"controller",
						lv_controller_2_0,
						"org.eclipse.xtext.peweb.EditorLanguage.AttributeController");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComponentId
entryRuleComponentId returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentIdRule()); }
	iv_ruleComponentId=ruleComponentId
	{ $current=$iv_ruleComponentId.current; }
	EOF;

// Rule ComponentId
ruleComponentId returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='%'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentIdAccess().getPercentSignKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentIdRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getComponentIdAccess().getComponentTypeComponentDeclarationCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponentIdAccess().getColonKeyword_2_0());
			}
			(
				(
					lv_attributeName_3_0=RULE_ID
					{
						newLeafNode(lv_attributeName_3_0, grammarAccess.getComponentIdAccess().getAttributeNameIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentIdRule());
						}
						setWithLastConsumed(
							$current,
							"attributeName",
							lv_attributeName_3_0,
							"org.eclipse.xtext.peweb.EditorLanguage.ID");
					}
				)
			)
		)?
		otherlv_4='%'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentIdAccess().getPercentSignKeyword_3());
		}
	)
;

// Entry rule entryRuleAttributeController
entryRuleAttributeController returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeControllerRule()); }
	iv_ruleAttributeController=ruleAttributeController
	{ $current=$iv_ruleAttributeController.current; }
	EOF;

// Rule AttributeController
ruleAttributeController returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeControllerAccess().getLeftCurlyBracketKeyword_0());
		}
		otherlv_1='get:'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeControllerAccess().getGetKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeControllerAccess().getGetterJsSnippetParserRuleCall_2_0());
				}
				lv_getter_2_0=ruleJsSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeControllerRule());
					}
					set(
						$current,
						"getter",
						lv_getter_2_0,
						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='set:'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeControllerAccess().getSetKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeControllerAccess().getSetterJsSnippetParserRuleCall_4_0());
				}
				lv_setter_4_0=ruleJsSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeControllerRule());
					}
					set(
						$current,
						"setter",
						lv_setter_4_0,
						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='validate:'
		{
			newLeafNode(otherlv_5, grammarAccess.getAttributeControllerAccess().getValidateKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeControllerAccess().getValidatorJsSnippetParserRuleCall_6_0());
				}
				lv_validator_6_0=ruleJsSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeControllerRule());
					}
					set(
						$current,
						"validator",
						lv_validator_6_0,
						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getAttributeControllerAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleChildId
entryRuleChildId returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildIdRule()); }
	iv_ruleChildId=ruleChildId
	{ $current=$iv_ruleChildId.current; }
	EOF;

// Rule ChildId
ruleChildId returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='!'
		{
			newLeafNode(otherlv_0, grammarAccess.getChildIdAccess().getExclamationMarkKeyword_0());
		}
		(
			(
				lv_childId_1_0=RULE_ID
				{
					newLeafNode(lv_childId_1_0, grammarAccess.getChildIdAccess().getChildIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChildIdRule());
					}
					setWithLastConsumed(
						$current,
						"childId",
						lv_childId_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getChildIdAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChildIdRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationCrossReference_3_0());
				}
			)
		)
		otherlv_4='!'
		{
			newLeafNode(otherlv_4, grammarAccess.getChildIdAccess().getExclamationMarkKeyword_4());
		}
	)
;

// Entry rule entryRuleTagId
entryRuleTagId returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTagIdRule()); }
	iv_ruleTagId=ruleTagId
	{ $current=$iv_ruleTagId.current; }
	EOF;

// Rule TagId
ruleTagId returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='$'
		{
			newLeafNode(otherlv_0, grammarAccess.getTagIdAccess().getDollarSignKeyword_0());
		}
		(
			(
				lv_tagName_1_0=RULE_ID
				{
					newLeafNode(lv_tagName_1_0, grammarAccess.getTagIdAccess().getTagNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTagIdRule());
					}
					setWithLastConsumed(
						$current,
						"tagName",
						lv_tagName_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ID");
				}
			)
		)
		otherlv_2='$'
		{
			newLeafNode(otherlv_2, grammarAccess.getTagIdAccess().getDollarSignKeyword_2());
		}
	)
;

// Entry rule entryRuleComponentDeclaration
entryRuleComponentDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentDeclarationRule()); }
	iv_ruleComponentDeclaration=ruleComponentDeclaration
	{ $current=$iv_ruleComponentDeclaration.current; }
	EOF;

// Rule ComponentDeclaration
ruleComponentDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentDeclarationAccess().getComponentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentDeclarationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='view:'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentDeclarationAccess().getViewKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0());
				}
				lv_view_4_0=ruleHtmlSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
					}
					set(
						$current,
						"view",
						lv_view_4_0,
						"org.eclipse.xtext.peweb.EditorLanguage.HtmlSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getControlComponentControllerParserRuleCall_5_0());
				}
				lv_control_5_0=ruleComponentController
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
					}
					set(
						$current,
						"control",
						lv_control_5_0,
						"org.eclipse.xtext.peweb.EditorLanguage.ComponentController");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getComponentDeclarationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleComponentController
entryRuleComponentController returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentControllerRule()); }
	iv_ruleComponentController=ruleComponentController
	{ $current=$iv_ruleComponentController.current; }
	EOF;

// Rule ComponentController
ruleComponentController returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='get:'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentControllerAccess().getGetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentControllerAccess().getGetterJsSnippetParserRuleCall_1_0());
				}
				lv_getter_1_0=ruleJsSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentControllerRule());
					}
					set(
						$current,
						"getter",
						lv_getter_1_0,
						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='set:'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentControllerAccess().getSetKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentControllerAccess().getSetterJsSnippetParserRuleCall_3_0());
				}
				lv_setter_3_0=ruleJsSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentControllerRule());
					}
					set(
						$current,
						"setter",
						lv_setter_3_0,
						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='validate:'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentControllerAccess().getValidateKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentControllerAccess().getValidatorJsSnippetParserRuleCall_5_0());
				}
				lv_validator_5_0=ruleJsSnippet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentControllerRule());
					}
					set(
						$current,
						"validator",
						lv_validator_5_0,
						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleHtmlSnippet
entryRuleHtmlSnippet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHtmlSnippetRule()); }
	iv_ruleHtmlSnippet=ruleHtmlSnippet
	{ $current=$iv_ruleHtmlSnippet.current; }
	EOF;

// Rule HtmlSnippet
ruleHtmlSnippet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getHtmlSnippetAccess().getHtmlSnippetAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralParserRuleCall_0_1_0());
					}
					lv_html_1_0=ruleCodeLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
						}
						add(
							$current,
							"html",
							lv_html_1_0,
							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralStartParserRuleCall_1_0_0());
					}
					lv_html_2_0=ruleCodeLiteralStart
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
						}
						add(
							$current,
							"html",
							lv_html_2_0,
							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralStart");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_1_0());
					}
					lv_html_3_0=ruleHtmlAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
						}
						add(
							$current,
							"html",
							lv_html_3_0,
							"org.eclipse.xtext.peweb.EditorLanguage.HtmlAnnotation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralMidParserRuleCall_1_2_0_0());
						}
						lv_html_4_0=ruleCodeLiteralMid
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
							}
							add(
								$current,
								"html",
								lv_html_4_0,
								"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralMid");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_2_1_0());
						}
						lv_html_5_0=ruleHtmlAnnotation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
							}
							add(
								$current,
								"html",
								lv_html_5_0,
								"org.eclipse.xtext.peweb.EditorLanguage.HtmlAnnotation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralEndParserRuleCall_1_3_0());
					}
					lv_html_6_0=ruleCodeLiteralEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
						}
						add(
							$current,
							"html",
							lv_html_6_0,
							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleHtmlAnnotation
entryRuleHtmlAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHtmlAnnotationRule()); }
	iv_ruleHtmlAnnotation=ruleHtmlAnnotation
	{ $current=$iv_ruleHtmlAnnotation.current; }
	EOF;

// Rule HtmlAnnotation
ruleHtmlAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getHtmlAnnotationAccess().getTagIdParserRuleCall_0());
		}
		this_TagId_0=ruleTagId
		{
			$current = $this_TagId_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHtmlAnnotationAccess().getChildIdParserRuleCall_1());
		}
		this_ChildId_1=ruleChildId
		{
			$current = $this_ChildId_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHtmlAnnotationAccess().getComponentIdParserRuleCall_2());
		}
		this_ComponentId_2=ruleComponentId
		{
			$current = $this_ComponentId_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCodeLiteral
entryRuleCodeLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeLiteralRule()); }
	iv_ruleCodeLiteral=ruleCodeLiteral
	{ $current=$iv_ruleCodeLiteral.current; }
	EOF;

// Rule CodeLiteral
ruleCodeLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_CODENOTAG
			{
				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralAccess().getValueCODENOTAGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCodeLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.peweb.EditorLanguage.CODENOTAG");
			}
		)
	)
;

// Entry rule entryRuleCodeLiteralStart
entryRuleCodeLiteralStart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeLiteralStartRule()); }
	iv_ruleCodeLiteralStart=ruleCodeLiteralStart
	{ $current=$iv_ruleCodeLiteralStart.current; }
	EOF;

// Rule CodeLiteralStart
ruleCodeLiteralStart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_CODESTART
			{
				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralStartAccess().getValueCODESTARTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCodeLiteralStartRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.peweb.EditorLanguage.CODESTART");
			}
		)
	)
;

// Entry rule entryRuleCodeLiteralMid
entryRuleCodeLiteralMid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeLiteralMidRule()); }
	iv_ruleCodeLiteralMid=ruleCodeLiteralMid
	{ $current=$iv_ruleCodeLiteralMid.current; }
	EOF;

// Rule CodeLiteralMid
ruleCodeLiteralMid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_CODEMID
			{
				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralMidAccess().getValueCODEMIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCodeLiteralMidRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.peweb.EditorLanguage.CODEMID");
			}
		)
	)
;

// Entry rule entryRuleCodeLiteralEnd
entryRuleCodeLiteralEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeLiteralEndRule()); }
	iv_ruleCodeLiteralEnd=ruleCodeLiteralEnd
	{ $current=$iv_ruleCodeLiteralEnd.current; }
	EOF;

// Rule CodeLiteralEnd
ruleCodeLiteralEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_CODEEND
			{
				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralEndAccess().getValueCODEENDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCodeLiteralEndRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.peweb.EditorLanguage.CODEEND");
			}
		)
	)
;

// Entry rule entryRuleJsSnippet
entryRuleJsSnippet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsSnippetRule()); }
	iv_ruleJsSnippet=ruleJsSnippet
	{ $current=$iv_ruleJsSnippet.current; }
	EOF;

// Rule JsSnippet
ruleJsSnippet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getJsSnippetAccess().getJsSnippetAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralParserRuleCall_0_1_0());
					}
					lv_js_1_0=ruleCodeLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJsSnippetRule());
						}
						add(
							$current,
							"js",
							lv_js_1_0,
							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralStartParserRuleCall_1_0_0());
					}
					lv_js_2_0=ruleCodeLiteralStart
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJsSnippetRule());
						}
						add(
							$current,
							"js",
							lv_js_2_0,
							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralStart");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_1_0());
					}
					lv_js_3_0=ruleJsExtraTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJsSnippetRule());
						}
						add(
							$current,
							"js",
							lv_js_3_0,
							"org.eclipse.xtext.peweb.EditorLanguage.JsExtraTag");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralMidParserRuleCall_1_2_0_0());
						}
						lv_js_4_0=ruleCodeLiteralMid
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getJsSnippetRule());
							}
							add(
								$current,
								"js",
								lv_js_4_0,
								"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralMid");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_2_1_0());
						}
						lv_js_5_0=ruleJsExtraTag
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getJsSnippetRule());
							}
							add(
								$current,
								"js",
								lv_js_5_0,
								"org.eclipse.xtext.peweb.EditorLanguage.JsExtraTag");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralEndParserRuleCall_1_3_0());
					}
					lv_js_6_0=ruleCodeLiteralEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJsSnippetRule());
						}
						add(
							$current,
							"js",
							lv_js_6_0,
							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleJsExtraTag
entryRuleJsExtraTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsExtraTagRule()); }
	iv_ruleJsExtraTag=ruleJsExtraTag
	{ $current=$iv_ruleJsExtraTag.current; }
	EOF;

// Rule JsExtraTag
ruleJsExtraTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getJsExtraTagAccess().getTagIdParserRuleCall());
	}
	this_TagId_0=ruleTagId
	{
		$current = $this_TagId_0.current;
		afterParserOrEnumRuleCall();
	}
;

RULE_CODENOTAG : '[' (('\\['|'\\]')|('<' ~(('<'|'['|']'))|'>' ~(('>'|'['|']')))|~(('<'|'['|']'|'>')))* ('<'|'>')? ']';

RULE_CODESTART : '[' (('\\['|'\\]')|('<' ~(('<'|'['|']'))|'>' ~(('>'|'['|']')))|~(('<'|'['|']'|'>')))* '>'? '<<';

RULE_CODEMID : '>>' (('\\['|'\\]')|('<' ~(('<'|'['|']'))|'>' ~(('>'|'['|']')))|~(('<'|'['|']'|'>')))* '>'? '<<';

RULE_CODEEND : '>>' (('\\['|'\\]')|('<' ~(('<'|'['|']'))|'>' ~(('>'|'['|']')))|~(('<'|'['|']'|'>')))* ('<'|'>')? ']';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
