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

	public ResourceAbstractSyntaxTree(EObject eObject, String nodeId){
		this.eObject = eObject;
		this.children = new ArrayList<ResourceAbstractSyntaxTree>();
		this.name = eObject.eClass().getName();
		this.nodeId = nodeId; 
	}
	
	public void addChild(ResourceAbstractSyntaxTree child){
		this.children.add(child);
	}

	public List<ResourceAbstractSyntaxTree> getChildren() {
		return children;
	}
	
	//TODO better name for each node?
	//TODO Maybe allow for nodes to be renamed??
	public String getName() {
		// CAN only do if has name attribute
		
		if( eObject.eClass().getEStructuralFeature("name") != null) {
			String nameAttr = (String)eObject.eGet(eObject.eClass().getEStructuralFeature("name"));
			if(nameAttr !=null) {
				return eObject.eClass().getName() +" : " + nameAttr;
			}
		}
		return eObject.eClass().getName();
	}
	
	public String getNodeId() {
		return nodeId;
	}
	
	public NodeRef getNodeRef() {
		return new NodeRef(nodeId,this.getName());
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

