package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.peweb.customview.generatoritems.GeneratorItem;

public class HtmlProjectionSpecification {

	private List<GeneratorItem> HtmlViewItems;
	private List<AttributeController> AttributeControllers;
	
	public HtmlProjectionSpecification() {
		this.HtmlViewItems = new ArrayList<GeneratorItem>();
		this.AttributeControllers = new ArrayList<AttributeController>();
	}
	
	public void addItemToView(GeneratorItem item){
		this.HtmlViewItems.add(item);
	}
	
	public void addAttributeController(AttributeController item){
		this.AttributeControllers.add(item);
	}
	
	public List<GeneratorItem> getHtmlViewItems(){
		return this.HtmlViewItems;
	}
	
	public List<AttributeController> getAttributeControllers(){
		return this.AttributeControllers;
	}	
}
