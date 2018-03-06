package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.generatoritems.GeneratorItem;

public class HtmlComponentSpecification {

	private List<GeneratorItem> htmlViewItems;
	private AttributeControllerSpecification attributeController;
	
	public HtmlComponentSpecification() {
		this.htmlViewItems = new ArrayList<GeneratorItem>();
	}
	
	public HtmlComponentSpecification addItemToView(GeneratorItem item){
		this.htmlViewItems.add(item);
		return this;
	}
	
	public HtmlComponentSpecification addAttributeController(AttributeControllerSpecification item){
		this.attributeController = item;
		return this;
	}
	
	public List<GeneratorItem> getHtmlViewItems(){
		return this.htmlViewItems;
	}
	
	public AttributeControllerSpecification getAttributeController(){
		return this.attributeController;
	}
	
	public CustomHtmlProjectionDescription generate(
			String attributeName,
			String htmlIdSuffix,
			OpenFileState ofs,
			ResourceAbstractSyntaxTree node,
			Map<ProjectionIdentifier,HtmlProjectionSpecification> nodeMap,
			Map<String,HtmlComponentSpecification> componentMap) {
		
		Map<String, String> idMap =  new HashMap<String,String>();
		CustomHtmlProjectionDescription result = new CustomHtmlProjectionDescription();
		
		for(GeneratorItem genItem : this.htmlViewItems) {
			result.append(genItem.generate(htmlIdSuffix, idMap, ofs, node, nodeMap, componentMap));
		}
		
		if(attributeName != null && this.attributeController != null) {
			result.append(this.attributeController.generate(idMap,node,attributeName));
		}
		
		return result;
	}
}
