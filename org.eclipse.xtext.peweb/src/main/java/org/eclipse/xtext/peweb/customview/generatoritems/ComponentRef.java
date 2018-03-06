package org.eclipse.xtext.peweb.customview.generatoritems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.peweb.NodeRef;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.AttributeControllerSpecification;
import org.eclipse.xtext.peweb.customview.CustomHtmlProjectionDescription;
import org.eclipse.xtext.peweb.customview.HtmlComponentSpecification;
import org.eclipse.xtext.peweb.customview.HtmlProjectionSpecification;
import org.eclipse.xtext.peweb.customview.ProjectionIdentifier;

public class ComponentRef implements GeneratorItem  {
	
	public final String componentName;
	public final String attributeName;
	
	public ComponentRef(String componentName,String att) {
		this.componentName = componentName;
		this.attributeName = att;
	}

	@Override
	public CustomHtmlProjectionDescription generate(
			String htmlIdSuffix, 
			Map<String, String> idMap, 
			OpenFileState ofs,
			ResourceAbstractSyntaxTree node, 
			Map<ProjectionIdentifier, HtmlProjectionSpecification> nodeMap,
			Map<String, HtmlComponentSpecification> componentMap)
	{
		
		if(!componentMap.containsKey(this.componentName)) {
			throw new RuntimeException("Component: "  + this.componentName + " is not in the component map!");
		}else {
			return (componentMap.get(this.componentName).generate(this.attributeName, htmlIdSuffix, ofs, node, nodeMap, componentMap));
		}
	}

}

