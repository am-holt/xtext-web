package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.peweb.customview.generatoritems.GeneratorItem;

public class HtmlComponentSpecification {

	private List<GeneratorItem> HtmlViewItems;
	private AttributeController AttributeController;
	
	public HtmlComponentSpecification() {
		this.HtmlViewItems = new ArrayList<GeneratorItem>();
	}
	
	public void addItemToView(GeneratorItem item){
		this.HtmlViewItems.add(item);
	}
	
	public void addAttributeController(AttributeController item){
		this.AttributeController = item;
	}
	
	public List<GeneratorItem> getHtmlViewItems(){
		return this.HtmlViewItems;
	}
	
	public AttributeController getAttributeController(){
		return this.AttributeController;
	}	
}
