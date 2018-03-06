package org.eclipse.xtext.peweb.customview;

import java.util.List;

import org.eclipse.xtext.peweb.customview.generatoritems.JavascriptGeneratorItem;

public class AttributeController {
	
	public final String getter;
	public final String setter;
	public final String validator;
	public final String attributeName;
	public final String nodeId;
	public final Object initialValue;
	
	public AttributeController(String nodeId, String attributeName, String getter, String setter, String validator, Object initialValue) {
		this.getter = getter;
		this.setter = setter;
		this.validator = validator;
		this.attributeName = attributeName;
		this.nodeId = nodeId;
		this.initialValue = initialValue;
	}
	
}
