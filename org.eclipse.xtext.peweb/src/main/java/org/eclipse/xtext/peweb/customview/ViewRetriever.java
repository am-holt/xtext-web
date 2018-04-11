package org.eclipse.xtext.peweb.customview;

import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;
import org.eclipse.xtext.peweb.customview.generatoritems.*;

import java.util.HashMap;
import java.util.List;

public class ViewRetriever {

	
	public Map<ProjectionIdentifier,HtmlProjectionSpecification> nodeMap;
	public Map<String,HtmlComponentSpecification> componentMap;
	
	private int idCount = 0;
	
	public ProjectionDescription getView(TypeHelper typeHelper, OpenFileState ofs, ResourceAbstractSyntaxTree node) {
		
		ProjectionIdentifier projId = new ProjectionIdentifier(node.getName(),"main");
		return getView(typeHelper, ofs,node,projId);
	}
	
	public ProjectionDescription getView(TypeHelper typeHelper, OpenFileState ofs, ResourceAbstractSyntaxTree node, ProjectionIdentifier projId) {
		
		ProjectionDescription result;

		if(nodeMap == null ) {
			System.out.println("WARN: ViewRetriever's nodeMap is not set!");
			result = generateDefaultProjection(typeHelper, ofs, node);
		}else if(!nodeMap.containsKey(projId)) {
			result = generateDefaultProjection(typeHelper, ofs, node);
		}else {
			HtmlProjectionSpecification spec = nodeMap.get(projId);
			result = spec.generate("", ofs,typeHelper, node, nodeMap, componentMap);
		}
		return result;
	}
		
	private DefaultProjectionDescription generateDefaultProjection(TypeHelper typeHelper, OpenFileState ofs, ResourceAbstractSyntaxTree node) {
		return new DefaultProjectionDescription(typeHelper, ofs, node);
	}
}
