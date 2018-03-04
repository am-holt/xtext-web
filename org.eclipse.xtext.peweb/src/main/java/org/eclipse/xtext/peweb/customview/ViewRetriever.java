package org.eclipse.xtext.peweb.customview;

import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;

import java.util.List;

public class ViewRetriever {

	
	public Map<ProjectionIdentifier,HtmlProjectionSpecification> nodeMap;
	public Map<ProjectionIdentifier,HtmlComponentSpecification> componentMap;
	
	public ProjectionDescription getView(OpenFileState ofs, ResourceAbstractSyntaxTree node) {
		
		ProjectionIdentifier projId = new ProjectionIdentifier(node.getName(),"main");
		ProjectionDescription result;

		if(nodeMap == null ) {
			System.out.println("WARN: ViewRetriever's nodeMap is not set!");
			result = generateDefaultProjection(ofs, node);
		}else if(!nodeMap.containsKey(projId)) {
			result = generateDefaultProjection(ofs, node);
		}else {
			HtmlProjectionSpecification spec = nodeMap.get(projId);
			result = generateHtmlProjection(ofs, spec,node);
		}
		return result;
	}
	
	
	private DefaultProjectionDescription generateDefaultProjection(OpenFileState ofs, ResourceAbstractSyntaxTree node) {
		return new DefaultProjectionDescription(ofs, node);
	}


	private CustomHtmlProjectionDescription generateHtmlProjection(OpenFileState ofs, HtmlProjectionSpecification spec, ResourceAbstractSyntaxTree node) {
		
		
		throw new UnsupportedOperationException();
	}
	
	//private String 




}
