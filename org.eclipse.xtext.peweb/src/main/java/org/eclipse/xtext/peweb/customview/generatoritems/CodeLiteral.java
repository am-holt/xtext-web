package org.eclipse.xtext.peweb.customview.generatoritems;

import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.CustomHtmlProjectionDescription;
import org.eclipse.xtext.peweb.customview.HtmlComponentSpecification;
import org.eclipse.xtext.peweb.customview.HtmlProjectionSpecification;
import org.eclipse.xtext.peweb.customview.ProjectionIdentifier;

public class CodeLiteral implements GeneratorItem, JavascriptGeneratorItem {

	private final String htmlString;
	
	public CodeLiteral(String str) {
		this.htmlString = str;
	}
	

	@Override
	public CustomHtmlProjectionDescription generate(String htmlIdSuffix, Map<String, String> IdMap, OpenFileState ofs,
			ResourceAbstractSyntaxTree node, Map<ProjectionIdentifier, HtmlProjectionSpecification> nodeMap,
			Map<String, HtmlComponentSpecification> componentMap) {
		CustomHtmlProjectionDescription result = new CustomHtmlProjectionDescription();
		result.htmlView = this.htmlString;
		return result;
	}


	@Override
	public String generateJs(Map<String, String> idMap) {
		return this.htmlString;
	}
}
