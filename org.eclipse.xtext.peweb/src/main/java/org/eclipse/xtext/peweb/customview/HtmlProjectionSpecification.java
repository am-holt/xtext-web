package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;
import org.eclipse.xtext.peweb.customview.generatoritems.GeneratorItem;

public class HtmlProjectionSpecification {

	private List<GeneratorItem> htmlViewItems;
	private List<AttributeControllerSpecification> attributeControllers;
	
	public HtmlProjectionSpecification() {
		this.htmlViewItems = new ArrayList<GeneratorItem>();
		this.attributeControllers = new ArrayList<AttributeControllerSpecification>();
	}
	
	public HtmlProjectionSpecification addItemToView(GeneratorItem item){
		this.htmlViewItems.add(item);
		return this;
	}
	
	public HtmlProjectionSpecification addAttributeController(AttributeControllerSpecification item){
		this.attributeControllers.add(item);
		return this;
	}
	
	public List<GeneratorItem> getHtmlViewItems(){
		return this.htmlViewItems;
	}
	
	public List<AttributeControllerSpecification> getAttributeControllers(){
		return this.attributeControllers;
	}
	
	public CustomHtmlProjectionDescription generate(
			String htmlIdSuffix,
			OpenFileState ofs,
			TypeHelper typeHelper,
			ResourceAbstractSyntaxTree node,
			Map<ProjectionIdentifier,HtmlProjectionSpecification> nodeMap,
			Map<String,HtmlComponentSpecification> componentMap) {
		
		Map<String, String> idMap =  new HashMap<String,String>();
		CustomHtmlProjectionDescription result = new CustomHtmlProjectionDescription();
		int suffixAddition = 0;
		for(GeneratorItem genItem : this.htmlViewItems) {
			result.append(genItem.generate(htmlIdSuffix + "_" + suffixAddition, idMap, ofs, typeHelper, node, nodeMap, componentMap));
			suffixAddition+=1;
		}
		
		for(AttributeControllerSpecification attSpec : this.attributeControllers) {
			result.append(attSpec.generate(idMap,node));
		}
		
		return result;
	}
}