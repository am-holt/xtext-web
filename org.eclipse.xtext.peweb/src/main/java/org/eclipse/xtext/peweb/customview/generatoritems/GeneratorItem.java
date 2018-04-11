package org.eclipse.xtext.peweb.customview.generatoritems;

import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;
import org.eclipse.xtext.peweb.customview.CustomHtmlProjectionDescription;
import org.eclipse.xtext.peweb.customview.HtmlComponentSpecification;
import org.eclipse.xtext.peweb.customview.HtmlProjectionSpecification;
import org.eclipse.xtext.peweb.customview.ProjectionIdentifier;
import org.eclipse.xtext.peweb.customview.ViewRetriever;

public abstract interface GeneratorItem {

	abstract public CustomHtmlProjectionDescription generate(
			String htmlIdSuffix,
			Map<String,String> idMap,
			OpenFileState ofs,
			TypeHelper typeHelper,
			ResourceAbstractSyntaxTree node,
			Map<ProjectionIdentifier,HtmlProjectionSpecification> nodeMap,
			Map<String,HtmlComponentSpecification> componentMap);
	
	
	
}
