package org.eclipse.xtext.peweb;

public class NodeRef{
	String nodeId;
	String name; 
	public NodeRef(String nodeId, String name){
		this.name = name; 
		this.nodeId = nodeId;
	}
	
	public String getNodeId() {
		return nodeId;
	}
	
	public String getName() {
		return name;
	}
};