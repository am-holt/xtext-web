package org.eclipse.xtext.peweb;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.resource.XtextResource;

public class OpenFileState {
	
	private Resource resource;
	private ResourceAbstractSyntaxTree ast;
	private Map<String, ResourceAbstractSyntaxTree> nodeMap = new HashMap<String,ResourceAbstractSyntaxTree>();
	private Map<EObject, String> eObjectMap = new HashMap<EObject, String>();
	
	//lastUsedNodeID so can assign fresh to new nodes. 
	//At some point may need to worry about reusing these, in which case use list of freed ones
	private int lastUsedNodeID;
	
	//If not already open, opens file at fileLocation
	public OpenFileState(String fileLocation) throws ResourceLoadingException{
		
		if(this.ast != null){
			return;
		}
		
		//open the resource at fileLocation
		URI uri = URI.createFileURI(fileLocation);
		if (uri == null){	
			//TODO Create new Exception type for this;
			throw new ResourceLoadingException("The requested resource does not exist.");
		}		
		ResourceSet resourceSet = new ResourceSetImpl();
		this.resource = resourceSet.getResource(uri, true);
		
		//Parse into an AST
		if(resource.getContents().isEmpty()){
			
			//TODO anyway to NOT have to call SmallFactory here?
			//resource.getContents().add(SmallFactoryImpl.init().createModel());
			throw new UnsupportedOperationException("Can't open files that don't have a root object");
			
		}else if(resource.getContents().size() > 1){
			//This shouldn't ever be the case!
			throw new UnsupportedOperationException("Can't open files that don't have more than one root object");
		}
		
		this.ast = createASTFromEObject(resource.getContents().get(0));
	}
	
	private ResourceAbstractSyntaxTree createASTFromEObject(EObject eObject) {
		
		String freshId = getFreshNodeId();
		String name = getNodeName(eObject);
		ResourceAbstractSyntaxTree node = new ResourceAbstractSyntaxTree(eObject,name,freshId);
		this.linkEObjectToId(node,eObject,freshId);

		for(EObject o : eObject.eContents()){
			node.addChild(createASTFromEObject(o));
		}
		return node;
	}
	
	//Add the node to the two maps
	private void linkEObjectToId(ResourceAbstractSyntaxTree tree, EObject eObject, String nodeId){

		if(this.nodeMap.containsKey(nodeId)){
			throw new IllegalArgumentException("nodeID should be an id which doesn't occur in nodeMap already!");
		}else if(this.eObjectMap.containsKey(eObject)){
			throw new IllegalArgumentException("eObject shouldn't already occur in eObjectMap already!");
		}
		
		this.nodeMap.put(nodeId, tree);
		this.eObjectMap.put(eObject, nodeId);
	}
	
	//TODO better name for each node?
	//TODO Maybe allow for nodes to be renamed??
	private String getNodeName(EObject e) {
		return e.eClass().getName();
	}

	private String getFreshNodeId() {
		lastUsedNodeID += 1;
		return String.valueOf(lastUsedNodeID);
	}

	public ResourceAbstractSyntaxTree getAST(){
		return this.ast;
	}
	
	public ResourceAbstractSyntaxTree getNode(String nodeId){
		return this.nodeMap.get(nodeId);
	}
	
	public String getEObjectId(EObject eObject){
		return this.eObjectMap.get(eObject);
	}
	
	public void saveFile() throws IOException{
		System.out.println("Saving...");
		resource.save(null);
		System.out.println("Save done!");
	}
	
	public ResourceAbstractSyntaxTree addChildToNode(ResourceAbstractSyntaxTree node, EObject toAdd){
		ResourceAbstractSyntaxTree child = createASTFromEObject(toAdd); 
		node.addChild(child);
		return child;
	}

	public boolean removeChildNode(ResourceAbstractSyntaxTree node, ResourceAbstractSyntaxTree toRemove) {
		return node.removeChild(toRemove);
	}	
}
