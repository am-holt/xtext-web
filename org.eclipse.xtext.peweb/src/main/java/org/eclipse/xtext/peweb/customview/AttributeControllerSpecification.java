package org.eclipse.xtext.peweb.customview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.customview.generatoritems.JavascriptGeneratorItem;

public class AttributeControllerSpecification {
	
	public List<JavascriptGeneratorItem> getter;
	public List<JavascriptGeneratorItem> setter;
	public List<JavascriptGeneratorItem> validator;
	public String attributeName;
	
	public AttributeControllerSpecification(String attributeName) {
		this.attributeName = attributeName;
		this.getter = new ArrayList<JavascriptGeneratorItem>();
		this.setter = new ArrayList<JavascriptGeneratorItem>();
		this.validator = new ArrayList<JavascriptGeneratorItem>();
	}
	
	public AttributeControllerSpecification() {
		this.getter = new ArrayList<JavascriptGeneratorItem>();
		this.setter = new ArrayList<JavascriptGeneratorItem>();
		this.validator = new ArrayList<JavascriptGeneratorItem>();
	}
	
	public AttributeControllerSpecification addGetterItem(JavascriptGeneratorItem item) {
		this.getter.add(item);
		return this;
	}
	
	public AttributeControllerSpecification addSetterItem(JavascriptGeneratorItem item) {
		this.setter.add(item);
		return this;
	}
	
	public AttributeControllerSpecification addValidatorItem(JavascriptGeneratorItem item) {
		this.validator.add(item);
		return this;
	}
	
	public AttributeController generate(Map<String, String> idMap, ResourceAbstractSyntaxTree node) {
		
		return generate(idMap,node,this.attributeName);
	}
	

	public AttributeController generate(Map<String, String> idMap, ResourceAbstractSyntaxTree node, String attribute) {
		Object attributeValue = node.getEObject().eGet(node.getEClass().getEStructuralFeature(attribute));
		
		StringBuilder getterSb = new StringBuilder();
		StringBuilder setterSb = new StringBuilder();
		StringBuilder validatorSb = new StringBuilder();
		
		for(JavascriptGeneratorItem getterItem : getter) {
			getterSb.append(getterItem.generateJs(idMap));
		}
		
		for(JavascriptGeneratorItem setterItem : setter) {
			setterSb.append(setterItem.generateJs(idMap));
		}
		
		for(JavascriptGeneratorItem validatorItem : validator) {
			validatorSb.append(validatorItem.generateJs(idMap));
		}
		
		return new AttributeController(node.getNodeId(), attribute, getterSb.toString(), setterSb.toString(), validatorSb.toString(),attributeValue);
	}
}