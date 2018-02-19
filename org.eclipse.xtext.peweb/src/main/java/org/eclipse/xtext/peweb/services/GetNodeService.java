package org.eclipse.xtext.peweb.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;

public class GetNodeService implements PEService {

	public class NodeRef{
		String nodeId;
		String name; 
		public NodeRef(String nodeId, String name){
			this.name = name; 
			this.nodeId = nodeId;
		}
	};
	
	private class GetNodeResult implements IServiceResult{
		public class Attribute{ 
			String type; 
			String name; 
			Object value;
			public Attribute(String type, String name, Object value){
				this.type = type; 
				this.name = name;
				this.value = value;
			}
		}

		public class Reference{ 
			String name; 
			List<NodeRef> nodes = new ArrayList<NodeRef>();
			public Reference(String name, List<NodeRef> nodes){
				this.name = name;
				this.nodes = nodes;
			}
		}
		
		List<Attribute> attributes = new ArrayList<Attribute>();
		List<Reference> references = new ArrayList<Reference>();
		String nodeId;
		
		public GetNodeResult(String nodeId){
			this.nodeId = nodeId;
		}
		
		public void addAtribute(String type, String name, Object value){
			this.attributes.add(new Attribute(type,name, value));
		}
		
		public void addReference(String referenceName, List<NodeRef> references){
			this.references.add(new Reference(referenceName,references));
		}
	}

	
	
	private OpenResources openResources;
	
	public GetNodeService(OpenResources openResources ){
		this.openResources = openResources;
	}
	
	@Override
	public IServiceResult service(IServiceContext serviceContext) {
		
		String nodeId = serviceContext.getParameter("node-id") ;
		String fileName = serviceContext.getParameter("file-name");
		String projectName = serviceContext.getParameter("project-name");
		if(nodeId == null){
			throw new InvalidRequestException("A \'get-node' request must have a \'node-id\' parameter!");
		}
		if(fileName == null){
			throw new InvalidRequestException("A \'get-node' request must have a \'file-name\' parameter!");
		}
		if(projectName == null){
			throw new InvalidRequestException("A \'get-node' request must have a \'project-name\' parameter!");
		}
		String fileLocation = ("user-files" + File.separator + projectName + File.separator + fileName);
		
		
		try {
			GetNodeResult result = new GetNodeResult(nodeId);
			OpenFileState ofs = this.openResources.getFileState(fileLocation);
			ResourceAbstractSyntaxTree node = ofs.getNode(nodeId);
			EObject eObject = node.getEObject();
			EList<EAttribute> attributes = node.getEClass().getEAllAttributes();
			EList<EReference> references = node.getEClass().getEAllReferences();
			for(EAttribute a : attributes){
				//Only works if eObject.eGet(a) is serializable....
				result.addAtribute(a.getEAttributeType().getName(), a.getName(),eObject.eGet(a));
			}
			
			for(EReference eRef : references){
				
				List<NodeRef> refNodes = new ArrayList<NodeRef>();
				
				//TODO Only works if list!
				EList<EObject> eObjects = (EList<EObject>)eObject.eGet(eRef);
				
				for(EObject refObject : eObjects){
					refNodes.add(new NodeRef(ofs.getEObjectId(refObject),refObject.eClass().getName()));
				}
				result.addReference(eRef.getName(), refNodes);
			}
			return result;
			
		} catch (ResourceLoadingException e) {
			//TODO change this
			throw new RuntimeException("Couldn't open " + fileLocation);
		}
	}

}
