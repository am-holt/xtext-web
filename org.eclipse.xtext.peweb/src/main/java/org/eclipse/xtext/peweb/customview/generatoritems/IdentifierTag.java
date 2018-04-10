package org.eclipse.xtext.peweb.customview.generatoritems;

import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.CustomHtmlProjectionDescription;
import org.eclipse.xtext.peweb.customview.HtmlComponentSpecification;
import org.eclipse.xtext.peweb.customview.HtmlProjectionSpecification;
import org.eclipse.xtext.peweb.customview.ProjectionIdentifier;

public class IdentifierTag implements GeneratorItem, JavascriptGeneratorItem  {

	public final String identifier;
	
	public IdentifierTag(String id) {
		this.identifier = id;
	}

	@Override
	public CustomHtmlProjectionDescription generate(String htmlIdSuffix, Map<String, String> idMap, OpenFileState ofs,
			ResourceAbstractSyntaxTree node, Map<ProjectionIdentifier, HtmlProjectionSpecification> nodeMap,
			Map<String, HtmlComponentSpecification> componentMap) {
		

		CustomHtmlProjectionDescription result = new CustomHtmlProjectionDescription();
		String htmlView; 
		
		if(idMap.containsKey(this.identifier)) {
			htmlView = idMap.get(this.identifier);
		}else {
			htmlView =this.identifier + htmlIdSuffix;
			idMap.put(this.identifier, htmlView);
		}
		
		result.htmlView = htmlView;
		
		return result;
	}

	@Override
	public String generateJs(Map<String, String> idMap) {
		
		if(!idMap.containsKey(this.identifier)) {
			throw new RuntimeException("HTML Id: "  + this.identifier + " was not in idMap when trying to parse js");
		}
		
		return idMap.get(this.identifier);
	}
	
}
