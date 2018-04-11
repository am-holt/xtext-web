package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;

public class CustomHtmlProjectionDescription extends ProjectionDescription {
	
	public String htmlView;
	public List<AttributeController> attributeControllers;
	public List<ReferenceController> referenceControllers;
	
	public CustomHtmlProjectionDescription() {
		this.type = "custom";
		this.htmlView = "";
		this.attributeControllers = new ArrayList<AttributeController>();
		this.referenceControllers = new ArrayList<ReferenceController>();
	}
	
	public void append(CustomHtmlProjectionDescription projDescription) {
		this.htmlView = this.htmlView + projDescription.htmlView;
		this.attributeControllers.addAll(projDescription.attributeControllers);
		this.referenceControllers.addAll(projDescription.referenceControllers);
	}
	
	public void append(String html) {
		this.htmlView = this.htmlView + html;
	}
	
	public void append(ReferenceController refController) {
		this.referenceControllers.add(refController);
	}

	public void append(AttributeController attributeController) {
		this.attributeControllers.add(attributeController);	
	}

}
