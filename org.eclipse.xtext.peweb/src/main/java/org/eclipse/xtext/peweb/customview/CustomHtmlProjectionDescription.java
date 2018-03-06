package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

public class CustomHtmlProjectionDescription extends ProjectionDescription {
	
	public String htmlView;
	public List<AttributeController> attributeControllers;
	
	public CustomHtmlProjectionDescription() {
		this.type = "custom";
		this.htmlView = "";
		this.attributeControllers = new ArrayList<AttributeController>();
	}
	
	public void append(CustomHtmlProjectionDescription projDescription) {
		this.htmlView = this.htmlView + projDescription.htmlView;
		this.attributeControllers.addAll(projDescription.attributeControllers); 
	}

	public void append(AttributeController attributeController) {
		this.attributeControllers.add(attributeController);
		
	}

}
