package org.eclipse.xtext.peweb.customview;

import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.generatoritems.*;

import java.util.HashMap;
import java.util.List;

public class ViewRetriever {

	
	public Map<ProjectionIdentifier,HtmlProjectionSpecification> nodeMap;
	public Map<String,HtmlComponentSpecification> componentMap;
	
	private int idCount = 0;
	
	public ProjectionDescription getView(OpenFileState ofs, ResourceAbstractSyntaxTree node) {
		
		ProjectionIdentifier projId = new ProjectionIdentifier(node.getName(),"main");
		return getView(ofs,node,projId);
	}
	
	public ProjectionDescription getView(OpenFileState ofs, ResourceAbstractSyntaxTree node, ProjectionIdentifier projId) {
		
		ProjectionDescription result;

		if(nodeMap == null ) {
			System.out.println("WARN: ViewRetriever's nodeMap is not set!");
			result = generateDefaultProjection(ofs, node);
		}else if(!nodeMap.containsKey(projId)) {
			result = generateDefaultProjection(ofs, node);
		}else {
			HtmlProjectionSpecification spec = nodeMap.get(projId);
			result = spec.generate("", ofs, node, nodeMap, componentMap);
		}
		return result;
	}
		
	private DefaultProjectionDescription generateDefaultProjection(OpenFileState ofs, ResourceAbstractSyntaxTree node) {
		return new DefaultProjectionDescription(ofs, node);
	}
}
