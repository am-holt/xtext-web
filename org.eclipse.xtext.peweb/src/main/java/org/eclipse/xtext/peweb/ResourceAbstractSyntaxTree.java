package org.eclipse.xtext.peweb;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.gson.annotations.Expose;


public class ResourceAbstractSyntaxTree {
	
	private String name;
	private String nodeId;
	
	@Expose(serialize = false, deserialize = false)
	private EObject eObject;
	private List<ResourceAbstractSyntaxTree> children;

	public ResourceAbstractSyntaxTree(EObject eObject, String name, String nodeId){
		this.eObject = eObject;
		this.children = new ArrayList<ResourceAbstractSyntaxTree>();
		this.name = name;
		this.nodeId = nodeId; 
	}
	
	public void addChild(ResourceAbstractSyntaxTree child){
		this.children.add(child);
	}

	public List<ResourceAbstractSyntaxTree> getChildren() {
		return children;
	}

	
	public String getName() {
		return name;
	}
	
	public String getNodeId() {
		return nodeId;
	}

	public EObject getEObject() {
		return eObject;
	}
	
	public EClass getEClass() {
		return eObject.eClass();
	}

	public boolean removeChild(ResourceAbstractSyntaxTree toRemove) {
		return this.children.remove(toRemove);
	}
}

